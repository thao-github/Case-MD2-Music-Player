package HomeWork.BookManagement;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        book[0] = new Book("The Alchemist", "1 /1/ 2021", "Paulo Coelho", "English", 5);
        book[1] = new Book("Rich Dad, Poor Dad", "1 / 2/ 2021", "Robert Kiyosaki", "Japanese", 10);
        book[2] = new Book("The Power of Now", "1 / 3 / 2021", "Eckhart Tolle", "English", 15);
        book[3] = new Book("Man’s Search for Meaning", "1 / 4 / 2021", "Viktor E. Frankl", "English", 30);
        book[4] = new Book("Principles", "1 / 5 / 2021", "Ray Dalio", "English", 20);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Insert book");
            System.out.println("2. Remove book");
            System.out.println("3. Update book");
            System.out.println("4. Search book");
            System.out.println("5. Sort book");
            System.out.println("6. Show book");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    book = Methods.insert(book);
                    break;
                case 2:
                    book = Methods.remove(book);
                    break;
                case 3:
                    Methods.update(book);
                    break;
                case 4:
                    Methods.searchByName(book);
                    break;
                case 5:
                    Methods.sortByQuantity(book);
                    break;
                case 6:
                    Methods.show(book);
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}

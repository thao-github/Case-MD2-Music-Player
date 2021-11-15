package HomeWork.BookManagement;

import java.util.Scanner;


public class Methods {
    //1. Insert book
    public static Book[] insert(Book[] book) {
        Book newBook = create();
        Book[] newArray = new Book[book.length + 1];
        int index = findIndexbyId(book);
        for (int i = 0; i < book.length; i++) {
            if (i <= index) {
                newArray[i] = book[i];
            } else {
                newArray[i + 1] = book[i];
            }
            newArray[index + 1] = newBook;
        }
        return newArray;
    }

    public static Book create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter createTime: ");
        String createTime = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter language: ");
        String language = scanner.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        Book newBook = new Book(name, createTime, author, language, quantity);
        return newBook;
    }

    public static int findIndexbyId(Book[] book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < book.length; i++) {
            if (id == book[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    //2. Remove
    public static Book[] remove(Book[] book) {
        int index = findIndexbyId(book);
        Book[] newArray = new Book[book.length - 1];
        if (index >= 0) {
            for (int i = 0; i < book.length - 1; i++) {
                if (i < index) {
                    newArray[i] = book[i];
                } else {
                    newArray[i] = book[i + 1];
                }
            }
            return newArray;
        }
        return book;
    }

    //3.Update
    public static Book[] update(Book[] book) {
        int index = findIndexbyId(book);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new createTime: ");
        String createTime = scanner.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        if (index >= 0) {
            for (int i = 0; i < book.length; i++) {
                if (index == i) {
                    book[i].setCreateTime(createTime);
                    book[i].setQuantity(quantity);
                }
            }
        }
        return book;
    }

    //4. Search
    public static void searchByName(Book[] book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        boolean found = false;
        int index = 0;
        String name = scanner.nextLine();
        for (int i = 0; i < book.length; i++) {
            if (name.equals(book[i].getName())) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println(book[index]);
        } else {
            System.out.println("Can not be found");
        }
    }

    //5. Sort by quantity
    public static Book[] sortByQuantity(Book[] book) {
        Book temp;
        for (int i = 0; i < book.length - 1; i++) {
            for (int j = i + 1; j < book.length; j++) {
                if (book[i].getQuantity() > book[j].getQuantity()) {
                    temp = book[i];
                    book[i] = book[j];
                    book[j] = temp;
                }
            }
        }
        return book;
    }

    //6. Show
    public static void show(Book[] book) {
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].toString());
        }
    }

    //7. Exit

}

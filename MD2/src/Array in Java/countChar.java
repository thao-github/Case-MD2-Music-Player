import java.util.Arrays;
import java.util.Scanner;
public class countChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String character = scanner.nextLine();

        String str = "merry christmas";
        String [] arr = str.split("");
        System.out.println("The array is: " + Arrays.toString(arr));
        int count = 0;

        for (String s : arr) {
            if (character.equals(s)) {
                count++;
            }
        }
        System.out.println(character + " : " +count);
    }
}

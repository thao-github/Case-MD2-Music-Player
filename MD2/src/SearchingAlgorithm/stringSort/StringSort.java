package SearchingAlgorithm.stringSort;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {

    public static void main(String[] args) {
        ArrayList<Character> str = new ArrayList<>();
        String string = "Welcome";
        for(int i = 0; i < string.length(); i++) {
            str.add(i, string.charAt(i));
        }
        System.out.println(str);

        Comparator comparator = new Comparator();
        Collections.sort(str, comparator);
        System.out.println(str);
    }

}

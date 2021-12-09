package SearchingAlgorithm.BSnotUsingRecursion;

import java.util.ArrayList;
import java.util.Collections;

public class BSNotUsingRecursion {

    static int binarySearch(ArrayList<Integer> list, int value) {
        int low = 0;
        int hi = list.size() - 1;

        while (hi >= low) {
            int mid = (low + hi) / 2;
            if (value > list.get(mid)) {
                low = mid + 1;
            } else if (value < list.get(mid)) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(13);
        list.add(63);
        list.add(23);
        list.add(53);
        list.add(103);

        Collections.sort(list);
        for (Integer num : list) {
            System.out.print(num + "\t");
        }
        System.out.println("\n" + binarySearch(list, 53));
    }
}

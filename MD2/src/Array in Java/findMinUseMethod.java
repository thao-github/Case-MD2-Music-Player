public class findMinUseMethod {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 5, 7, 9};
        int index = findMinValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int findMinValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }
}

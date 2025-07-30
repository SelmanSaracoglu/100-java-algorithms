package algorithms.day005;

public class A018_ArraySortedChecker {

    public static String checkArraySorted(int[] arr) {
        if (arr == null || arr.length <= 1) return "sorted";

        boolean asc = true;
        boolean desc = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) asc = false;
            if (arr[i] > arr[i-1]) desc = false;
        }

        if (asc) return "ascending";
        else if (desc) return "descending";
        else return "unsorted";
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1, 0};
        System.out.println("Array is: " + checkArraySorted(array));
    }
}

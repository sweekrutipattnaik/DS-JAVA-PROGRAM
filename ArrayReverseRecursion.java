//Array Reverse Recursion (In-place or Non In-place).
public class ArrayReverseRecursion {
    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        reverseArray(arr, 0, arr.length - 1); 
        System.out.println("Reversed array is:");
        printArray(arr); 
    }
}

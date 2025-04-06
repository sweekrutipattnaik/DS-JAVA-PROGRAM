public class ArrayReverseLoop {
    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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

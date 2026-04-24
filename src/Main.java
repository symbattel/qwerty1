public class Main {
    public static void bubbleSort(int[] arr) {
        System.out.println("Bubble Sort:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printArray(arr);
            }
        }
    }
    public static void selectionSort(int[] arr) {
        System.out.println("\nSelection Sort:");
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array1 = {5, 3, 2, 4};
        int[] array2 = {5, 3, 2, 4};
        bubbleSort(array1);
        selectionSort(array2);
    }
}

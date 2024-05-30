public class Main {
    public static void main(String[] args) {
        int[] input = {2, 8, 7, 1, 3, 5, 6, 4};
        inlinequickSort(input, 0, input.length - 1);
        System.out.print("Sorted input data is: ");
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static void inlinequickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = sort(arr, low, high);
            inlinequickSort(arr, low, pi - 1);
            inlinequickSort(arr, pi + 1, high);
        }
    }

    public static int sort(int[] arr, int low, int high) {
        int split = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < split) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

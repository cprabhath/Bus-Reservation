class QuickSort {
    public static void main(String[] args) {
        int[] age = { 20, 25, 40, 26, 22, 35, 29, 35, 32, 39, 37, 36, 42, 45 };
        System.out.print("Before Sorting Age : ");
        for (int i : age) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        quickSort(age, 0, age.length - 1);
        System.out.print("After Sorting Age : ");
        for (int i : age) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
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

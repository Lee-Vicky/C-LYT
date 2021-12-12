import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        System.out.print("冒泡排序：");
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print("插入排序：");
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("快速排序：");
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.print("合并排序：");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.print("堆排序：");
        System.out.println(Arrays.toString(arr));
    }
//冒泡排序
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
//插入排序
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
    }
//快速排序
    public static void quickSort(int[] arr, int l, int r) {
        int q;
        if (l < r) {
            q = partition(arr, l, r);
            quickSort(arr, l, q - 1);
            quickSort(arr, q + 1, r);

        }
    }

    public static int partition(int[] arr, int l, int r) {
        int x = arr[l];
        int temp;
        int i = l;
        for (int j = l + 1; j <= r; j++) {
            if (arr[j] <= x) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
        return i;
    }
//合并排序
    public static void mergeSort(int[] array, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, temp);
            mergeSort(array, mid + 1, right, temp);
            merge(array, left, mid, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t++;
                i++;
            } else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        while (i <= mid) {
            temp[t] = arr[i];
            t++;
            i++;
        }

        while (j <= right) {
            temp[t] = arr[j];
            t++;
            j++;
        }
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            tempLeft++;
            t++;
        }
    }
//堆排序
    public static void heapSort(int[] arr) {
        int temp;
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustHeap(arr, 0, i);
        }
    }

    public static void adjustHeap(int[] arr, int index, int len) {
        int temp;
        for (int i = 2 * index + 1; i < len; i = 2 * i + 1) {
            if (i + 1 < len && arr[i + 1] > arr[i]) {
                i++;
            }
            if (arr[index] < arr[i]) {
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index = i;
            } else {
                break;
            }
        }

    }
}

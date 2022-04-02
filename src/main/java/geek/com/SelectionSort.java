package geek.com;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 7,7,7,7,7,1,1,1, 6, 1, 3, 3,7};
        sort(array);
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }

    public static void sort(int[] arr) {
        int lastPos = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int min = i;
            int max = lastPos - i;

            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            swap(arr, i, min);
            if (i == max) {
                swap(arr, lastPos - i, min);
            } else {
                swap(arr, lastPos - i, max);
            }


        }
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}

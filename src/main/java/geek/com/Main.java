package geek.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] array2 = {1, 2, 4, 5, 6};
        int[] array3 = {2, 3, 4, 5, 6, 7, 8};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] array5 = {};
        System.out.println(Arrays.toString(array));
        System.out.println(search(array));
        System.out.println(search(array1));
        System.out.println(search(array2));
        System.out.println(search(array3));
        System.out.println(search(array4));
        System.out.println(search(array5));

    }

    public static int search(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int op;
        while (end > start) {
            op = (start + end) / 2;
            if (op == 0) {
                break;
            }
            if (array[op] == op + 1) {
                start = op + 1;
            } else if (op + 2 == array[op] && op == array[op - 1]) {
                return op + 1;
            } else {
                end = op - 1;
            }
        }
        return start + 1;
    }
}

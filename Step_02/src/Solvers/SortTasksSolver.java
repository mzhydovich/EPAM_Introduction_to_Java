package Solvers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTasksSolver {

    public static int[] solve_01(int[] array1, int[] array2, int k) {

        int n1 = array1.length;
        int n2 = array2.length;
        int[] coupleArray = new int[n1 + n2];

        for (int i = 0; i < k; i++) {
            coupleArray[i] = array1[i];
        }

        for (int i = k; i < k + array2.length; i++) {
            coupleArray[i] = array2[i - k];
        }

        for (int i = k + array2.length; i < coupleArray.length; i++) {
            coupleArray[i] = array1[i - array2.length];
        }

        return coupleArray;
    }

    public static ArrayList<Integer> solve_02(int[] array1, int[] array2) {


        ArrayList<Integer> coupleArray = new ArrayList<Integer>();

        for(int el : array1) {
            coupleArray.add(el);
        }

        for(int el: array2) {
            coupleArray.add(el);
        }

        Collections.sort(coupleArray);

        return coupleArray;
    }

    public static int[] solve_03(int[] array) {

        int min = array[0];
        int indexOfMin = 0;
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }
            }

            tmp = array[i];
            array[i] = min;
            array[indexOfMin] = tmp;
            min = array[array.length - 1];

        }

        return array;
    }

    public static int[] solve_04(int[] array) {

        int tmp;
        int changingCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    changingCount++;
                }
            }
        }

        System.out.println("Changing count: " + changingCount);

        return array;
    }

    public static int[] solve_05(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }

        return array;
    }

    public static int[] solve_06(int[] array) {

        boolean sorted = false;
        int tmp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    i = 0;
                }
            }
        }

        return array;
    }

    public static List<Integer> solve_07(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            int dex = Collections.binarySearch(list1, list2.get(i));
            if (dex < 0)
                result.add(-(dex + 1) + i);
            else
                result.add(dex + i);
        }
        return result;
    }

}

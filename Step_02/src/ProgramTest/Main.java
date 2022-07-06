package ProgramTest;


import Solvers.OneDimensionalArraysTasksSolver;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------OneDimensionalArray Tasks---------------");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Task01: " + OneDimensionalArraysTasksSolver.solve_01(arr, 2));
        System.out.println("Task02: " + OneDimensionalArraysTasksSolver.solve_02(arr, 5));
        System.out.println("Task03: " + Arrays.toString(OneDimensionalArraysTasksSolver.solve_03(arr)));

        OneDimensionalArraysTasksSolver.solve_04(arr);
        System.out.println("Task04: " + Arrays.toString(arr));

        System.out.println("Task05: " + Arrays.toString(arr));
        OneDimensionalArraysTasksSolver.solve_05(arr);

        System.out.println("Task06: " + OneDimensionalArraysTasksSolver.solve_06(arr));
        System.out.println("Task07: " + OneDimensionalArraysTasksSolver.solve_07(arr));
        System.out.println("Task08: " + Arrays.toString(OneDimensionalArraysTasksSolver.solve_08(arr)));
        System.out.println("Task09: " + OneDimensionalArraysTasksSolver.solve_09(arr));

        OneDimensionalArraysTasksSolver.solve_10(arr);
        System.out.println("Task10: " + Arrays.toString(arr));

    }

}

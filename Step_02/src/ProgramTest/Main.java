package ProgramTest;

import Solvers.OneDimensionalArraysTasksSolver;
import Solvers.TwoDimensionalArraysTasksSolver;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------OneDimensionalArrays Tasks---------------");

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

        System.out.println("---------------TwoDimensionalArrays Tasks---------------");

        int[][] two_dim_arr = {{7, 8, 9},
                               {4, 5, 6},
                               {1, 2, 3}};

        System.out.println("Task01: ");
        TwoDimensionalArraysTasksSolver.solve_01(two_dim_arr);

        System.out.println("Task02: ");
        TwoDimensionalArraysTasksSolver.solve_02(two_dim_arr);

        System.out.println("Task03: ");
        TwoDimensionalArraysTasksSolver.solve_03(two_dim_arr, 1, 3);

        System.out.println("Task04: ");
        two_dim_arr =  TwoDimensionalArraysTasksSolver.solve_04(5);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task05: ");
        two_dim_arr =  TwoDimensionalArraysTasksSolver.solve_05(5);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task06: ");
        two_dim_arr =  TwoDimensionalArraysTasksSolver.solve_06(5);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task07: ");
        double[][] two_dim_arr1 =  TwoDimensionalArraysTasksSolver.solve_07(5);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task08: ");
        TwoDimensionalArraysTasksSolver.solve_08(two_dim_arr, 0, 2);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task09: " + TwoDimensionalArraysTasksSolver.solve_09(two_dim_arr1));

        System.out.println("Task10: " + TwoDimensionalArraysTasksSolver.solve_10(two_dim_arr));

        System.out.println("Task11: ");
        TwoDimensionalArraysTasksSolver.solve_11();

        System.out.println("Task12: ");
        TwoDimensionalArraysTasksSolver.solve_12(two_dim_arr);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task13: ");
        TwoDimensionalArraysTasksSolver.solve_13(two_dim_arr);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task14: ");
        two_dim_arr =  TwoDimensionalArraysTasksSolver.solve_14(5, 5);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task15: ");
        two_dim_arr[0][0] = 333;
        TwoDimensionalArraysTasksSolver.solve_15(two_dim_arr);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Task16: ");
        two_dim_arr =  TwoDimensionalArraysTasksSolver.solve_16(5);
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                System.out.print(two_dim_arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

package ProgramTest;

import Solvers.DecompositionTasksSolver;
import Solvers.OneDimensionalArraysTasksSolver;
import Solvers.SortTasksSolver;
import Solvers.TwoDimensionalArraysTasksSolver;

import java.util.Arrays;
import java.util.List;

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

        System.out.println("---------------Decomposition Tasks---------------");

        System.out.println("Task01: " + DecompositionTasksSolver.lcm(2, 3));
        System.out.println("Task02: " + DecompositionTasksSolver.gcd_for_4_numbers(2, 4, 8, 10));
        System.out.println("Task03: " + DecompositionTasksSolver.right_hexagon_square(5));

        int[][] points = {{1, 2}, {2, 3}, {0, 0}};
        System.out.println("Task04: " + Arrays.deepToString(DecompositionTasksSolver.max_distance(points)));

        System.out.println("Task05: ");
        DecompositionTasksSolver.find_second_max(new int[]{1, 2, 3, 4});

        System.out.println("Task06: " + DecompositionTasksSolver.is_mutual_simple_for_three_numbers(3, 5, 7));
        System.out.println("Task07: " + DecompositionTasksSolver.sum_of_factorials());
        System.out.println("Task08: " + Arrays.toString(DecompositionTasksSolver.subarray_sum(new int[]{1, 2, 3, 4, 5}, 2, 4)));
        System.out.println("Task09: " + DecompositionTasksSolver.calc_quadrilateral_square(1, 2, 3, 4));
        System.out.println("Task10: " + Arrays.toString(DecompositionTasksSolver.num_to_array(12345)));
        System.out.println("Task11: " + DecompositionTasksSolver.which_longer(123, 1234));

        System.out.println("Task12: ");
        DecompositionTasksSolver.is_prime_twins(10);

        System.out.println("Task13: " + DecompositionTasksSolver.armstrong_nums(15));

        System.out.println("---------------Sort Tasks---------------");

        System.out.println("Task01: " + Arrays.toString(SortTasksSolver.solve_01(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}, 5)));
        System.out.println("Task02: " + SortTasksSolver.solve_02(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10}));
        System.out.println("Task03: " + Arrays.toString(SortTasksSolver.solve_03(new int[]{5, 4, 3, 2, 1})));
        System.out.println("Task04: " + Arrays.toString(SortTasksSolver.solve_04(new int[]{5, 4, 3, 2, 1})));
        System.out.println("Task05: " + Arrays.toString(SortTasksSolver.solve_05(new int[]{5, 4, 3, 2, 1})));
        System.out.println("Task06: " + Arrays.toString(SortTasksSolver.solve_06(new int[]{5, 4, 3, 2, 1})));
        System.out.println("Task07: " + SortTasksSolver.solve_07(List.of(1, 2, 4, 6), List.of(3, 5)));

    }

}

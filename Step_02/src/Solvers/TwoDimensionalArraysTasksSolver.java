package Solvers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArraysTasksSolver {

    public static void solve_01(int[][] arr) {
        for (int i = 0; i < arr[0].length; ++i) {
            if (i % 2 == 0) {
                if (arr[0][i] > arr[arr.length - 1][i]) {
                    for (int[] ints : arr) {
                        System.out.print(ints[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void solve_02(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }

    public static void solve_03(int[][] arr, int k, int p) {
        for (int i = 0; i < arr[k - 1].length; ++i) {
            System.out.print(arr[k - 1][i] + " ");
        }
        System.out.println();
        for (int[] ints : arr) {
            System.out.print(ints[p - 1] + " ");
        }
        System.out.println();
    }

    public static int[][] solve_04(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i % 2 == 0) {
                    res[i][j] = j + 1;
                } else {
                    res[i][j] = n - j;
                }
            }
        }

        return res;
    }

    public static int[][] solve_05(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i + j <= n - 1) {
                    res[i][j] = i + 1;
                } else {
                    res[i][j] = 0;
                }
            }
        }

        return res;
    }

    public static int[][] solve_06(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n / 2; ++i) {
            for (int j = i; j < n - i; ++j) {
                res[i][j] = 1;
            }
        }
        for (int i = n-1; i >= n / 2; --i) {
            for (int j = n-i-1; j < i+1; ++j) {
                res[i][j] = 1;
            }
        }

        return res;
    }

    public static double[][] solve_07(int n) {
        double[][] res = new double[n][n];
        int counter = 0;
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j) {
                res[i][j] = Math.sin((double) (i * i - j * j) / n);
                if (res[i][j] > 0) {
                    counter++;
                }
            }
        }
        System.out.println("Num of positive elements: " + counter);

        return res;
    }

    public static void solve_08(int[][] arr, int x, int y) {
        for (int i = 0; i < arr[x].length; ++i) {
            int tmp = arr[i][x];
            arr[i][x] = arr[i][y];
            arr[i][y] = tmp;
        }
    }

    public static double solve_09(double[][] arr) {
        double sum = 0;
        int index = -1;
        for (int i = 0; i < arr[0].length; ++i) {
            double tmpSum = 0;
            for (double[] doubles : arr) {
                tmpSum += doubles[i];
            }
            if (tmpSum > sum) {
                sum = tmpSum;
                index = i;
            }
        }

        System.out.println("Column " + index + ": " + sum);

        return sum;
    }

    public static ArrayList<Integer> solve_10(int[][] arr) {

        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i][i]> 0) {
                res.add(arr[i][i]);
            }
        }

        return res;
    }

    public static void solve_11() {

        int[][] arr = new int[10][20];

        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                arr[i][j] = random.nextInt(16);
            }
        }

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Indexes of rows: ");
        for (int i = 0; i < 10; i++) {
            int counter = 0;
            for (int j = 0; j < 20; ++j) {
                if (arr[i][j] == 5) {
                    counter++;
                }
            }

            if (counter >= 3) {
                System.out.print((i + 1) + " ");
            }

        }
        System.out.println();
    }

    public static void solve_12(int[][] arr) {
        for (int[] ints : arr) {
            Arrays.sort(ints);
        }
    }

    public static void solve_13(int[][] arr) {
        for (int i = 0; i < arr[0].length; ++i) {
            int[] tmp = new int[arr.length];
            for (int j = 0; j < arr.length; ++j) {
                tmp[j] = arr[j][i];
            }

            Arrays.sort(tmp);
            for (int j = 0; j < arr.length; ++j) {
                arr[j][i] = tmp[j];
            }
        }
    }

    public static int[][] solve_14(int m, int n) {
        int[][] arr = new int[m][n];

        Random random = new Random();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = random.nextInt(2);
            }
        }

        for (int i = 0; i < n; ++i) {
            int counter = 0;
            for (int j = 0; j < m; ++j) {
                if (arr[j][i] == 1) {
                    counter++;
                }
            }
            int current = 0;
            while (counter != i) {
                if (counter > i && arr[current][i] == 1) {
                    arr[current][i] = 0;
                    counter--;
                }
                if (counter < i && arr[current][i] == 0) {
                    arr[current][i] = 1;
                    counter++;
                }
                current++;
            }
        }

        return arr;
    }

    public static void solve_15(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] % 2 == 1) {
                    arr[i][j] = max;
                }
            }
        }

    }


    public static int[][] solve_16(int n) {
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                arr[i][j] = i * n + j + 1;
            }
        }

        return arr;
    }

}

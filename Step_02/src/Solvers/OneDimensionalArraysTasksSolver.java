package Solvers;

import java.util.ArrayList;

public class OneDimensionalArraysTasksSolver {

    public static int solve_01(int[] arr, int k) {
        int sum = 0;
        for (int el : arr) {
            if (el % k == 0) {
                sum += el;
            }
        }

        return sum;
    }

    public static int solve_02(int[] arr, int z) {
        int num = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > z) {
                arr[i] = z;
                num++;
            }
        }

        return num;
    }

    public static int[] solve_03(int[] arr) {
        int[] num = new int[3]; // num[0] - negative, num[1] - null, num[2] - positive
        for (int el : arr) {
            if (el > 0) {
                num[2]++;
            } else if (el == 0) {
                num[1]++;
            } else {
                num[0]++;
            }
        }

        return num;
    }

    public static void solve_04(int[] arr) {

        int min = arr[0];
        int minInd = 0;
        int max = arr[0];
        int maxInd = 0;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
                maxInd = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minInd = i;
            }
        }

        int tmp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = tmp;
    }

    public static void solve_05(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > i + 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static double solve_06(int[] arr) {
        double sum = 0;
        if (arr.length < 2) {
            return sum;
        }

        ArrayList<Integer> resheto = new ArrayList<Integer>();
        resheto.add(2);
        sum += arr[1];
        for (int i = 2; i < arr.length; ++i) {
            boolean isPrime = true;
            int ind = i + 1;
            for (Integer integer : resheto) {
                if (integer <= Math.sqrt(ind)) {
                    if ((ind) % integer == 0) {
                        isPrime = false;
                        break;
                    }
                } else {
                    break;
                }
            }

            if (isPrime) {
                sum += arr[i];
                resheto.add(ind);
            }

        }

        return sum;
    }

    public static double solve_07(int[] arr) {
        double max = arr[0] + arr[arr.length - 1];
        for (int i = 1; i < arr.length / 2; ++i) {
            if (max < arr[i] + arr[arr.length - i - 1]) {
                max = arr[i] + arr[arr.length - i - 1];
            }
        }

        return max;
    }

    public static int[] solve_08(int[] arr) {
        int min = arr[0];
        int counter = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == min) {
                counter++;
            }
            if (arr[i] < min) {
                min = arr[i];
                counter = 1;
            }
        }
        int[] res = new int[arr.length-counter];
        int currentIndex = 0;
        for (int el : arr) {
            if (el > min) {
                res[currentIndex] = el;
                currentIndex++;
            }
        }

        return res;
    }

    public static int solve_09(int[] arr) {
        int resNum = arr[0];
        int resCounter = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == resNum) {
                resCounter++;
            }
        }

        for (int i = 1; i < arr.length; ++i) {
            int counter = 0;
            for (int el : arr) {
                if (el == arr[i]) {
                    counter++;
                }
            }
            if (counter == resCounter) {
                if (arr[i] < resNum) {
                    resNum = arr[i];
                }
            }

            if (counter > resCounter) {
                resCounter = counter;
                resNum = arr[i];
            }
        }

        return resNum;
    }

    public static void solve_10(int[] arr) {
        int currentIndex = 0;
        for (int i = 0; i < arr.length; i += 2) {
            arr[currentIndex] = arr[i];
            currentIndex++;
        }
        for (int i = currentIndex; i < arr.length; ++i) {
            arr[i] = 0;
        }
    }

}

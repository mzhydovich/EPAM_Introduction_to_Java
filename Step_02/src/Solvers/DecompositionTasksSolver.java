package Solvers;

import java.util.ArrayList;

public class DecompositionTasksSolver {

    public static int gcd(int a, int b) {
        while (b > 0) {
            a %= b;
            int tmp = a;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd_for_4_numbers(int a, int b, int c, int d) {
        return gcd(gcd(gcd(a, b), c), d);
    }

    private static double right_triangle_square(double a) {
        return a * a * Math.sqrt(3) / 4;
    }

    public static double right_hexagon_square(double a) {
        return 6 * right_triangle_square(a);
    }

    private static double calc_distance(int[] point1, int[] point2) {
        return Math.sqrt((point1[0] - point2[0]) * (point1[0] - point2[0]) + (point1[1] - point2[1]) * (point1[1] - point2[1]));
    }

    public static int[][] max_distance(int[][] points) {
        if (points.length == 1) {
            return new int[][]{points[0]};
        }

        int[][] a = new int[2][2];

        a[0] = points[0];
        a[1] = points[1];
        double dist = calc_distance(points[0], points[1]);
        for (int i = 0; i < points.length; ++i) {
            for (int j = i+1; j < points.length; ++j) {
                if (calc_distance(points[i], points[j]) > dist) {
                    dist = calc_distance(points[i], points[j]);
                }
            }
        }

        return a;
    }

    public static void find_second_max(int[] a) {
        int max = a[0];
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }

        boolean check = true;
        int second_max = 0;
        for (int j : a) {
            if (j < max) {
                if (check) {
                    second_max = j;
                    check = false;
                } else {
                    if (j > second_max) {
                        second_max = j;
                    }
                }
            }
        }

        if (!check) {
            System.out.println(second_max);
        }
    }

    private static boolean is_mutual_simple(int a, int b) {
        int tmp = Math.min(a, b);
        for (int i = 2; i <= tmp; ++i) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean is_mutual_simple_for_three_numbers(int a, int b, int c) {
        return is_mutual_simple(a, b) && is_mutual_simple(a, c) && is_mutual_simple(b, c);
    }

    public static int sum_of_factorials() {
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= 9; ++i) {
            fact *= i;
            if (i % 2 == 1) {
                sum += fact;
            }
        }

        return sum;
    }

    public static int[] subarray_sum(int[] a, int k, int m) {
        if (m - k < 2) {
            return new int[0];
        }
        int[] res = new int[m - k - 1];
        int tmp = a[k - 1] + a[k] + a[k + 1];
        res[0] = tmp;
        for (int i = k + 2; i < m; ++i) {
            tmp -= a[i - 3];
            tmp += a[i];
            res[i - k - 1] = tmp;
        }

        return res;
    }

    public static double calc_quadrilateral_square(double x, double y, double z, double t) {
        double res = 0;
        res += x * y / 2;

        double c = Math.sqrt(x * x + y * y);

        double p = (z + t + c) / 2;
        res += Math.sqrt(p * (p - c) * (p - z) * (p - t));

        return res;
    }

    private static int num_length(int num) {
        if (num == 0) {
            return 1;
        }
        int counter = 0;
        while (num > 0) {
            num /= 10;
            counter++;
        }

        return counter;
    }

    public static int[] num_to_array(int num) {
        int[] res = new int[num_length(num)];
        if (num == 0) {
            res[0] = 0;
            return res;
        }
        int counter = 0;
        while (num > 0) {
            res[counter] = num % 10;
            num /= 10;
            counter++;
        }

        return res;
    }

    public static int which_longer(int a, int b) {
        if (num_length(a) > num_length(b)) {
            return a;
        }

        return b;
    }


    public static boolean is_prime(int x) {
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void is_prime_twins(int n) {
        for (int i = n; i <= 2*n; i += 2) {
            if (i % 2 == 0) {
                i++;
            }

            if (is_prime(i)) {
                if (is_prime(i+2)) {
                    System.out.println(i + " " + i+2);
                }
            }
        }
    }

    static public int[] num_in_array(int x) {
        int[] a = new int[num_length(x)];
        if (x == 0) {
            a[0] = 0;
            return a;
        }
        int counter = 0;
        while (x > 0) {
            a[counter] = x % 10;
            x /= 10;
            counter++;
        }

        return a;
    }

    static public boolean is_armstrong_num(int x) {
        int[] a = num_in_array(x);
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        int ans = sum;
        for (int i = 2; i <= a.length; ++i) {
            ans *= sum;
        }

        return ans == x;
    }

    static public ArrayList<Integer> armstrong_nums(int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= k; ++i) {
            if (is_armstrong_num(i)) {
                a.add(i);
            }
        }

        return a;
    }
    
}

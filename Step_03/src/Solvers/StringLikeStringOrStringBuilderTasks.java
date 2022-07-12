package Solvers;

public class StringLikeStringOrStringBuilderTasks {

    public static int solve_01(String s) {
        int countOfSpaces = 0;
        int maxCountOfSpaces = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countOfSpaces++;
                if (countOfSpaces > maxCountOfSpaces) {
                    maxCountOfSpaces = countOfSpaces;
                }
            } else {
                countOfSpaces = 0;
            }
        }

        return maxCountOfSpaces;
    }

    public static String solve_02(String s) {
        StringBuilder res = new StringBuilder(s);

        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == 'a') {
                res.insert(i + 1, 'b');
            }
        }

        return res.toString();
    }

    public static boolean solve_03(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static String solve_04() {
        String s = "Информатика";
        StringBuilder res = new StringBuilder();

        res.append(s.charAt(7)).append(s.substring(3, 5)).append(s.charAt(7));

        return res.toString();
    }

    public static int solve_05(String s) {
        int countOfA = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'a') {
                countOfA++;
            }
        }

        return countOfA;
    }

    public static String solve_06(String s) {
        StringBuilder res = new StringBuilder(s);

        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) != ' ') {
                res.insert(i + 1, res.charAt(i));
                i++;
            }
        }

        return res.toString();
    }

    public static String solve_07(String s) {
        StringBuilder substr = new StringBuilder();

        boolean coincidence = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < substr.length(); j++) {
                if (s.charAt(i) == substr.charAt(j)) {
                    coincidence = true;
                }
            }
            if (!coincidence && s.charAt(i) != ' ') {
                substr.append(s.charAt(i));
            }
            coincidence = false;
        }

        return substr.toString();
    }

    public static String solve_08(String s) {

        String[] stringArray = s.split(" ");

        int maxLength = 0;
        int indexOfMax = 0;

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() > maxLength) {
                maxLength = stringArray[i].length();
                indexOfMax = i;
            }
        }

        return stringArray[indexOfMax];
    }

    public static int[] solve_09(String s) {

        int[] res = new int[2];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                res[0]++;
            }

            if (s.charAt(i) > 97 && s.charAt(i) < 122) {
                res[1]++;
            }
        }

        return res;
    }

    public static int solve_10(String s) {

        String[] array = s.split("[.?!]");

        return array.length;
    }

}

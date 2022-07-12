package Solvers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLikeCharArrayTasksSolver {

    public static void solve_01(String[] array) {

        Pattern p = Pattern.compile("([A-Z])");

        for (int i = 0; i < array.length; i++) {
            Matcher m = p.matcher(array[i]);

            StringBuilder strb = new StringBuilder();

            while (m.find()) {
                m.appendReplacement(strb, "_$0");
            }

            m.appendTail(strb);
            array[i] = strb.toString().toLowerCase();

        }

    }

    public static String solve_02(String s) {

        Pattern pattern = Pattern.compile("word");
        Matcher m = pattern.matcher(s);
        StringBuilder strb = new StringBuilder();

        while (m.find()) {
            m.appendReplacement(strb, "letter");
        }

        m.appendTail(strb);

        return strb.toString();
    }

    public static int solve_03(String s) {

        char[] array = new char[s.length()];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
            if (array[i] > 48 && array[i] < 57) {
                count++;
            }
        }

        return count;
    }

    public static int solve_04(String s) {

        char[] array = new char[s.length()];
        int count_of_nums = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 48 && array[i] < 57) {
                if (array[i + 1] <= 48 || array[i + 1] >= 57) {
                    count_of_nums++;
                }
            }
        }

        return count_of_nums;
    }

    public static String solve_05(String s) {

        s = s.trim();
        StringBuilder res = new StringBuilder();

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ' || array[i - 1] != ' ') {
                res.append(array[i]);
            }
        }

        return res.toString();
    }

}

package ProgramTest;

import Solvers.StringLikeCharArrayTasksSolver;
import Solvers.StringLikeStringOrStringBuilderTasks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------StringLikeCharArray Tasks---------------");

        String[] array = new String[]{"CamelCase1", "CamelCase2", "CamelCase3"};

        System.out.println("Task01: ");
        StringLikeCharArrayTasksSolver.solve_01(array);
        System.out.println(Arrays.toString(array));

        String s = "abc word def word";
        System.out.println("Task02: " + StringLikeCharArrayTasksSolver.solve_02(s));

        System.out.println("Task03: " + StringLikeCharArrayTasksSolver.solve_03("123string"));
        System.out.println("Task04: " + StringLikeCharArrayTasksSolver.solve_04("123string456"));
        System.out.println("Task05: " + StringLikeCharArrayTasksSolver.solve_05(" string1   string2 "));

        System.out.println("---------------StringLikeStringOrStringBuilder Tasks---------------");

        System.out.println("Task01: " + StringLikeStringOrStringBuilderTasks.solve_01(" string1   string2 "));
        System.out.println("Task02: " + StringLikeStringOrStringBuilderTasks.solve_02("acacac"));
        System.out.println("Task03: " + StringLikeStringOrStringBuilderTasks.solve_03("aboba"));
        System.out.println("Task04: " + StringLikeStringOrStringBuilderTasks.solve_04());
        System.out.println("Task05: " + StringLikeStringOrStringBuilderTasks.solve_05("abcaabcaaabc"));
        System.out.println("Task06: " + StringLikeStringOrStringBuilderTasks.solve_06("abcabcabc"));
        System.out.println("Task07: " + StringLikeStringOrStringBuilderTasks.solve_07("abc cde def"));
        System.out.println("Task08: " + StringLikeStringOrStringBuilderTasks.solve_08("abc abcdef def"));
        System.out.println("Task09: " + Arrays.toString(StringLikeStringOrStringBuilderTasks.solve_09("Abc Def")));
        System.out.println("Task10: " + StringLikeStringOrStringBuilderTasks.solve_10("Abc. Def! Ghi?"));

    }

}

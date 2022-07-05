package ProgramTest;

import Solvers.LinearTasksSolver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task01: " + LinearTasksSolver.solve_01(1, 2, 3));
        System.out.println("Task02: " + LinearTasksSolver.solve_02(1,2, 3));
        System.out.println("Task03: " + LinearTasksSolver.solve_03(1, 2));
        System.out.println("Task04: " + LinearTasksSolver.solve_04(123.456));
        System.out.println("Task05: " + LinearTasksSolver.solve_05(123123));
        System.out.println("Task06: " + LinearTasksSolver.solve_06(2, 0));
    }

}

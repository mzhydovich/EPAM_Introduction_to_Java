package ProgramTest;

import Solvers.IfElseStatementTasksSolver;
import Solvers.LinearTasksSolver;
import Solvers.LoopsTasksSolver;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------Linear Tasks---------------");

        System.out.println("Task01: " + LinearTasksSolver.solve_01(1, 2, 3));
        System.out.println("Task02: " + LinearTasksSolver.solve_02(1,2, 3));
        System.out.println("Task03: " + LinearTasksSolver.solve_03(1, 2));
        System.out.println("Task04: " + LinearTasksSolver.solve_04(123.456));
        System.out.println("Task05: " + LinearTasksSolver.solve_05(123123));
        System.out.println("Task06: " + LinearTasksSolver.solve_06(2, 0));

        System.out.println("---------------If/Else Statement Tasks---------------");

        System.out.println("Task01: " + IfElseStatementTasksSolver.solve_01(45, 45));
        System.out.println("Task02: " + IfElseStatementTasksSolver.solve_02(1, 2, 3, 4));
        System.out.println("Task03: " + IfElseStatementTasksSolver.solve_03(1, 2, 2, 4, 3, 6));
        System.out.println("Task04: " + IfElseStatementTasksSolver.solve_04(45, 45, 46, 46, 10));
        System.out.println("Task05: " + IfElseStatementTasksSolver.solve_05(3));

        System.out.println("---------------Loops Tasks---------------");

        System.out.println("Task01: " + LoopsTasksSolver.solve_01());
        System.out.println("Task02: " + LoopsTasksSolver.solve_02(1, 10, 2));
        System.out.println("Task03: " + LoopsTasksSolver.solve_03());
        System.out.println("Task04: " + LoopsTasksSolver.solve_04());
        System.out.println("Task05: " + LoopsTasksSolver.solve_05(0.33));
        System.out.println("Task06: " + LoopsTasksSolver.solve_06());
        System.out.println("Task07: " + LoopsTasksSolver.solve_07(1, 10));
        System.out.println("Task08: " + LoopsTasksSolver.solve_08(123, 4321));

    }

}

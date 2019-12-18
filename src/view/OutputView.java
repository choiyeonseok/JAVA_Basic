package view;

import domain.Operator;

import java.util.List;

public class OutputView {
    public static void invalidMessage() {
        System.out.println("잘못된 입력입니다.");
    }

    public static void printCalculateProcess(int result, Operator operator) {
        System.out.println("Symbol : " + operator.getSign());
        System.out.println(operator.getSignKor() + " : " + result);
    }

    public static void printResult(int result) {
        System.out.println("최종 결과 :" + result);
    }

    public static void printInputEquation(List<String> equation) {
        for (String factor : equation) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }
}

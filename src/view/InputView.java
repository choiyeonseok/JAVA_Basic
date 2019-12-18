package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner;

    public static List<String> inputStringEquation(){
        scanner = new Scanner(System.in);
        System.out.println("계산 할 식을 입력해 주세요 (공백으로 숫자와 연산자 구분) :");
        try {
            String[] equation = scanner.nextLine().split(" ");
            return Arrays.asList(equation);
        }catch (Exception e){
            OutputView.invalidMessage();
            return inputStringEquation();
        }
    }

    /**
     * 문자열 식 유효성 검증
     * @param equation
     */
    public static void verifyStringEquation(String[] equation){

    }

}

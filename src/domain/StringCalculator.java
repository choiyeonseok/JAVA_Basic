package domain;

import view.InputView;
import view.OutputView;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    private static List<String> equation = InputView.inputStringEquation();
    private static int result;

    public void calculate(){
        OutputView.printInputEquation(equation);
        Operator operator = Operator.PLUS;
        for (int i = 0; i < equation.size(); i++){
            if (toIntAvailable(equation.get(i))){
                computation(operator, Integer.parseInt(equation.get(i)));
            } else {
                operator = Operator.fromString(equation.get(i));
            }
        }
        OutputView.printResult(result);
    }

    private void computation(Operator operator, int cur) {
        switch (operator){
            case PLUS:
                result += cur;
                break;
            case MINUS:
                result -= cur;
                break;
            case MULTIPLE:
                result *= cur;
                break;
            case DIVIDE:
                result /= cur;
                break;
        }
        OutputView.printCalculateProcess(result, operator);
    }


    public boolean toIntAvailable(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e){
            return false;
        }
    }

}

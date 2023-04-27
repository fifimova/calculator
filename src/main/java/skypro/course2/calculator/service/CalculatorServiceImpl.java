package skypro.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        int result = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Ошибка");
        } else {
            result = num1 + num2;
        }
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        int result = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Ошибка");
        } else {
            result = num1 - num2;
        }
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        int result = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Ошибка");
        } else {
            result = num1 * num2;
        }
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        int result = 0;
        if (num1 == null || num2 == null) {
            System.out.println("Ошибка");
        }
        if (num2 == 0) {
            System.out.println("На 0 делить запрещено.");
        } else {
            result = num1 / num2;
        }
        return num1 + " / " + num2 + " = " + result;
    }
}

package skypro.course2.calculator.service;

import org.springframework.stereotype.Service;
import skypro.course2.calculator.exceptions.NoneParamsException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            throw new NoneParamsException("Не все параметры переданы в метод");
        } else {
            result = num1 + num2;
        }
        return result;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            throw new NoneParamsException("Не все параметры переданы в метод");
        } else {
            result = num1 - num2;
        }
        return result;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            throw new NoneParamsException("Не все параметры переданы в метод");
        } else {
            result = num1 * num2;
        }
        return result;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        int result;
        if (num1 == null || num2 == null) {
            throw new NoneParamsException("Не все параметры переданы в метод");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        } else {
            result = num1 / num2;
        }
        return result;
    }
}

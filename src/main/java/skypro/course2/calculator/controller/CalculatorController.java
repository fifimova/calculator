package skypro.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}


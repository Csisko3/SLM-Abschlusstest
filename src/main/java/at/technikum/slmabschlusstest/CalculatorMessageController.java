package at.technikum.slmabschlusstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorMessageController {

    @GetMapping("/api/digitsum/number")
    public int getSum (@RequestParam int number){
        int digit, sum = 0;

        while (number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }
        return sum;
    }


}

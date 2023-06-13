package at.technikum.slmabschlusstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorMessageController {

    @GetMapping
    public int getSum (@RequestParam int numb){
        int digit, sum = 0;

        while (numb > 0){
            digit = numb % 10;
            sum = sum + digit;
            numb = numb/10;
        }
        return numb;
    }
}

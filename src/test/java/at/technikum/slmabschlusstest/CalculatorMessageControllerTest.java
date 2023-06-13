package at.technikum.slmabschlusstest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMessageControllerTest {

    void getSumTest(){
        int i = 1234;
        assertEquals(10,CalculatorMessageController.getSum(i));
    }
    @Test
    void usageTest(){
        CalculatorMessageController.getSum(1111);
        assertEquals(1,CalculatorMessageController.usage());
    }

}
package at.technikum.slmabschlusstest;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMessageControllerTest {

    void getSumTest(){
        int i = 1234;

        assertEquals(10,CalculatorMessageController.getSum(i));
    }

}
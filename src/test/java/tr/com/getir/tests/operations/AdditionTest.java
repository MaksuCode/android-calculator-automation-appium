package tr.com.getir.tests.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import tr.com.getir.BaseTest;

public class AdditionTest extends BaseTest {

    @Test
    @Order(1)
    public void add_two_numbers(){
        calculator.numbers().one().click();
        calculator.operations().plus().click();
        calculator.numbers().two().click();
        calculator.operations().equals().click();
        String result = calculator.resultScreen().getResult();
        Assertions.assertEquals("3",result);
    }

    @Test
    @Order(2)
    public void add_three_numbers(){

    }
}


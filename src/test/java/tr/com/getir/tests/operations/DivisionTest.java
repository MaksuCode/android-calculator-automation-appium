package tr.com.getir.tests.operations;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import tr.com.getir.BaseTest;

@Disabled("Not yet ready bro...")
public class DivisionTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("provideTwoNumbers")
    public void div_two_numbers(int[] values){
        int result = calculator.div(values);
        Assertions.assertEquals(multiplicationOfNumbers(values),result);
    }

    @ParameterizedTest
    @MethodSource("provideNumberArrayForTest")
    public void mul_more_than_two_numbers(int[] values){
        int result = calculator.div(values);
        Assertions.assertEquals(multiplicationOfNumbers(values),result);
    }

    @ParameterizedTest
    @MethodSource("provideTwoDigitNumbers")
    public void mul_two_digit_numbers(int[] numbers){
        int result = calculator.div(numbers);
        Assertions.assertEquals(multiplicationOfNumbers(numbers),result);
    }

    private static int multiplicationOfNumbers(int[] numbers){
        int result = numbers[0] ;
        for (int number : numbers){
            result /= number ;
        }
        return result ;
    }


}

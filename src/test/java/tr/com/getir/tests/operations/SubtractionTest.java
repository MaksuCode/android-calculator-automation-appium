package tr.com.getir.tests.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import tr.com.getir.BaseTest;

public class SubtractionTest extends BaseTest {


    @ParameterizedTest
    @MethodSource("provideTwoNumbers")
    public void subtract_two_numbers(int[] numbers){
        int result = calculator.sub(numbers);
        Assertions.assertEquals(subtractionOfNumbers(numbers),result);
    }

    @ParameterizedTest
    @MethodSource("provideNumberArrayForTest")
    public void subtract_more_than_two_numbers(int[] numbers){
        int result = calculator.sub(numbers);
        Assertions.assertEquals(subtractionOfNumbers(numbers),result);
    }

    @ParameterizedTest
    @MethodSource("provideTwoDigitNumbers")
    public void subtract_two_digit_numbers(int[] numbers){
        int result = calculator.sub(numbers);
        Assertions.assertEquals(subtractionOfNumbers(numbers),result);
    }

    private static int subtractionOfNumbers(int[] numbers){
        int result = numbers[0];
        for (int i = 1 ; i < numbers.length ; i ++){
            result -= numbers[i];
        }
        return result;
    }

}

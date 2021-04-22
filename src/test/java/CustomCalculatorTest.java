
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        assertTrue(result == 20);
        System.out.println("result :: " + result);
    }

    //빼기 테스트 작성
    @Test
    public void subtractTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertTrue(result == 13);
        System.out.println("result :: " + result);
    }

    //곱하기 테스트 작성
    @Test
    public void multiplyTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);
        assertTrue(result == 45);
        System.out.println("result :: " + result);
    }

    //나누기 테스트 작성
    @Test
    public void divideTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);
        assertTrue(result == 5);
        System.out.println("result :: " + result);
    }
}
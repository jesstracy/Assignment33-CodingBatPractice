import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 9/21/16.
 */
public class Assignment33RunnerLuckySumTest {
    Assignment33Runner myRunner;
    @Before
    public void setUp() throws Exception {
        myRunner = new Assignment33Runner();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void luckySumTestFromCodingBat1() throws Exception {
        int sum = myRunner.luckySum(1, 2, 3);
        assertEquals(sum, 6);
    }

    @Test
    public void luckySumTestFromCodingBat2() throws Exception {
        int sum = myRunner.luckySum(1, 2, 13);
        assertEquals(sum, 3);
    }

    @Test
    public void luckySumTestFromCodingBat3() throws Exception {
        int sum = myRunner.luckySum(1, 13, 3);
        assertEquals(sum, 1);
    }

    @Test
    public void luckySumTestAll0() throws Exception {
        int sum = myRunner.luckySum(0, 0, 0);
        assertEquals(sum, 0);
    }

    @Test
    public void luckySumTestAll13() throws Exception {
        int sum = myRunner.luckySum(13, 13, 13);
        assertEquals(sum, 0);
    }

    @Test
    public void luckySumTestFirst13() throws Exception {
        int sum = myRunner.luckySum(13, 5, 10);
        assertEquals(sum, 0);
    }

    @Test
    public void luckySumTestFirstandSecond13() throws Exception {
        int sum = myRunner.luckySum(13, 13, 10);
        assertEquals(sum, 0);
    }

    @Test
    public void luckySumTestSecondAndThird13() throws Exception {
        int sum = myRunner.luckySum(-5, 13, 13);
        assertEquals(sum, -5);
    }

    @Test
    public void luckySumTestSecond13ThirdNot() throws Exception {
        int sum = myRunner.luckySum(8, 13, 2);
        assertEquals(sum, 8);
    }

    @Test
    public void luckySumTestFirstAndThird13() throws Exception {
        int sum = myRunner.luckySum(13, 6, 13);
        assertEquals(sum, 0);
    }

    @Test
    public void luckySumTestThird13() throws Exception {
        int sum = myRunner.luckySum(-5, 6, 13);
        assertEquals(sum, 1);
    }

}
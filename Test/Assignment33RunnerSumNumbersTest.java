import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 9/22/16.
 */
public class Assignment33RunnerSumNumbersTest {
    Assignment33Runner myRunner;
    int result;

    @Before
    public void setUp() throws Exception {
        myRunner = new Assignment33Runner();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void sumNumbersTestFromCodingBat1() throws Exception {
        result = myRunner.sumNumbers("abc123xyz");
        assertEquals(123, result);
    }

    @Test
    public void sumNumbersTestFromCodingBat2() throws Exception {
        result = myRunner.sumNumbers("aa11b33");
        assertEquals(44, result);
    }

    @Test
    public void sumNumbersTestFromCodingBat3() throws Exception {
        result = myRunner.sumNumbers("7 11");
        assertEquals(18, result);
    }

    @Test
    public void sumNumbersTestNoNumbersNoSpaces() throws Exception {
        result = myRunner.sumNumbers("abcdef");
        assertEquals(0, result);
    }

    @Test
    public void sumNumbersTestNoNumbersWithSpaces() throws Exception {
        result = myRunner.sumNumbers("a bc def");
        assertEquals(0, result);
    }

    @Test
    public void sumNumbersTestAllNumbersNoSpaces() throws Exception {
        result = myRunner.sumNumbers("54321");
        assertEquals(54321, result);
    }

    @Test
    public void sumNumbersTestAllNumbersMultipleSpaces() throws Exception {
        result = myRunner.sumNumbers("5 4 3 2 1");
        assertEquals(15, result);
    }

    @Test
    public void sumNumbersTestNumbersAndSpaces() throws Exception {
        result = myRunner.sumNumbers("ab12 1 5y");
        assertEquals(18, result);
    }

    @Test
    public void sumNumbersTestJustSpace() throws Exception {
        result = myRunner.sumNumbers(" ");
        assertEquals(0, result);
    }

    @Test
    public void sumNumbersTestEmpty() throws Exception {
        result = myRunner.sumNumbers("");
        assertEquals(0, result);
    }

}
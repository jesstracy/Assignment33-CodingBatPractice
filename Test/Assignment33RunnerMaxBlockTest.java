import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 9/21/16.
 */
public class Assignment33RunnerMaxBlockTest {
    Assignment33Runner myRunner;

    @Before
    public void setUp() throws Exception {
        myRunner = new Assignment33Runner();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void maxBlockTestFromCodingBat1() throws Exception {
        int result = myRunner.maxBlock("hoopla");
        assertEquals(2, result);
    }

    @Test
    public void maxBlockTestFromCodingBat2() throws Exception {
        int result = myRunner.maxBlock("abbCCCddBBBxx");
        assertEquals(3, result);
    }

    @Test
    public void maxBlockTestFromCodingBat3() throws Exception {
        int result = myRunner.maxBlock("");
        assertEquals(0, result);
    }

    @Test
    public void maxBlockTestAllSameLength() throws Exception {
        int result = myRunner.maxBlock("aaabbbccc");
        assertEquals(3, result);
    }

    @Test
    public void maxBlockTestAllLengthOne() throws Exception {
        int result = myRunner.maxBlock("abc");
        assertEquals(1, result);
    }

    @Test
    public void maxBlockTestOneChar() throws Exception {
        int result = myRunner.maxBlock("p");
        assertEquals(1, result);
    }

    @Test
    public void maxBlockTestSpace() throws Exception {
        int result = myRunner.maxBlock(" ");
        assertEquals(1, result);
    }

    @Test
    public void maxBlockTestBiggestBlockAtBeginning() throws Exception {
        int result = myRunner.maxBlock("ttttttgggg");
        assertEquals(6, result);
    }

    @Test
    public void maxBlockTestBiggestBlockAtEnd() throws Exception {
        int result = myRunner.maxBlock("ggggffffffff");
        assertEquals(8, result);
    }

    @Test
    public void maxBlockTestBiggestBlockInMiddle() throws Exception {
        int result = myRunner.maxBlock("ggSSSff");
        assertEquals(3, result);
    }

    @Test
    public void maxBlockTestTwoEqualBlocks() throws Exception {
        int result = myRunner.maxBlock("qqww");
        assertEquals(2, result);
    }

}
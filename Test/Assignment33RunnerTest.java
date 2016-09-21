import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 9/21/16.
 */
public class Assignment33RunnerTest {
    Assignment33Runner myRunner;
    boolean result;
    @Before
    public void setUp() throws Exception {
        myRunner = new Assignment33Runner();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void closerFarTestFromCodingBat1() throws Exception {
        result = myRunner.closerFar(1, 2, 10);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestFromCodingBat2() throws Exception {
        result = myRunner.closerFar(1, 2, 3);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestFromCodingBat3() throws Exception {
        result = myRunner.closerFar(4, 1, 3);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestAll3SameNumber() throws Exception {
        result = myRunner.closerFar(2, 2, 2);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestABsameCdifferentWorks() throws Exception {
        result = myRunner.closerFar(0, 0, 6);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestABsameCdifferentDoesntWork() throws Exception {
        result = myRunner.closerFar(0, 0, 1);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestACsameBdifferentWorks() throws Exception {
        result = myRunner.closerFar(10, 2, 10);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestACsameBdifferentDoesntWork() throws Exception {
        result = myRunner.closerFar(10, 11, 10);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestBCsameAdifferentPart2Works() throws Exception {
        result = myRunner.closerFar(1, -5, -5);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestBCsameAdifferenPart2DoesntWork() throws Exception {
        result = myRunner.closerFar(-4, -5, -5);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1WorksWithBLessThanAPart2CDiffersFromBNotA() throws Exception {
        result = myRunner.closerFar(5, 4, 6);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1WorksWithBGreaterThanAPart2DiffersFromANotB() throws Exception {
        result = myRunner.closerFar(2, 3, 4);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1WorksWithCGreaterThanAPart2DiffersFromANotB() throws Exception {
        result = myRunner.closerFar(0, 2, 1);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1WorksWithCLessThanAPart2DiffersFromANotB() throws Exception {
        result = myRunner.closerFar(100, 98, 99);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1WorksWithCGreaterThanAPart2DiffersFromCNotA() throws Exception {
        result = myRunner.closerFar(5, 4, 6);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1WorksWithCLessThanAPart2DiffersFromCNotA() throws Exception {
        result = myRunner.closerFar(-8, -7, -9);
        assertEquals(result, false);
    }
    ////////////////////////////////////////////////////////////////////////

//    @Test
//    public void closerFarTestPart1WorksWithBGreaterPart2DiffersFromNeither() throws Exception {
//        result = myRunner.closerFar(1, 2, 2);
//        assertEquals(result, true);
//    }
//
//    @Test
//    public void closerFarTestPart1WorksWithBLessPart2DiffersFromNeither() throws Exception {
//        result = myRunner.closerFar(8, 7, 8);
//        assertEquals(result, true);
//    }
//
//    @Test
//    public void closerFarTestPart1WorksWithCGreaterPart2DiffersFromNeither() throws Exception {
//        result = myRunner.closerFar(1, 2, 10);
//        assertEquals(result, true);
//    }
//
//    @Test
//    public void closerFarTestPart1WorksWithCLessPart2DiffersFromNeither() throws Exception {
//        result = myRunner.closerFar(1, 2, 10);
//        assertEquals(result, true);
//    }

    @Test
    public void closerFarTestPart1WorksWithBPart2WorksBy2More() throws Exception {
        result = myRunner.closerFar(1, 2, 5);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestPart1WorksWithBPart2WorksBy2Less() throws Exception {
        result = myRunner.closerFar(1, 2, -1);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestPart1WorksWithBPart2WorksByALot() throws Exception {
        result = myRunner.closerFar(5, 4, 50);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestPart1WorksWithCPart2WorksBy2More() throws Exception {
        result = myRunner.closerFar(0, 3, 1);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestPart1WorksWithCPart2WorksBy2Less() throws Exception {
        result = myRunner.closerFar(9, 6, 8);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestPart1WorksWithCPart2WorksByALot() throws Exception {
        result = myRunner.closerFar(5, 0, 6);
        assertEquals(result, true);
    }

    @Test
    public void closerFarTestPart1FailsPart2DiffersFromOneNotTheOther() throws Exception {
        result = myRunner.closerFar(1, 5, 6);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1FailsAHigherPart2DiffersFromOneNotTheOther() throws Exception {
        result = myRunner.closerFar(10, 1, 0);
        assertEquals(result, false);
    }

    @Test
    public void closerFarTestPart1FailsPart2DiffersFromBoth() throws Exception {
        result = myRunner.closerFar(4, 8, 12);
        assertEquals(result, false);
    }

}
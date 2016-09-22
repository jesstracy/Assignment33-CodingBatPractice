import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jessicatracy on 9/21/16.
 */
public class Assignment33RunnerMirrorEndsTest {
    Assignment33Runner myRunner;
    String response;

    @Before
    public void setUp() throws Exception {
        myRunner = new Assignment33Runner();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void mirrorEndsTestFromCodingBat1() throws Exception {
        response = myRunner.mirrorEnds("abXYZba");
        assertEquals("ab", response);
    }

    @Test
    public void mirrorEndsTestFromCodingBat2() throws Exception {
        response = myRunner.mirrorEnds("abca");
        assertEquals("a", response);
    }

    @Test
    public void mirrorEndsTestFromCodingBat3() throws Exception {
        response = myRunner.mirrorEnds("aba");
        assertEquals("aba", response);
    }

    @Test
    public void mirrorEndsTestEmpty() throws Exception {
        response = myRunner.mirrorEnds("");
        assertEquals("", response);
    }

    @Test
    public void mirrorEndsTestOneLetter() throws Exception {
        response = myRunner.mirrorEnds("x");
        assertEquals("x", response);
    }

    @Test
    public void mirrorEndsTestNoMirror() throws Exception {
        response = myRunner.mirrorEnds("xyz");
        assertEquals("", response);
    }

    @Test
    public void mirrorEndsTestLongStringWithOverlap() throws Exception {
        response = myRunner.mirrorEnds("aabbccdccbbaa");
        assertEquals("aabbccdccbbaa", response);
    }

    @Test
    public void mirrorEndsTestLongStringWithNoOverlap() throws Exception {
        response = myRunner.mirrorEnds("aabbccdxyzdccbbaa");
        assertEquals("aabbccd", response);
    }

    @Test
    public void mirrorEndsTestAllSameLetter() throws Exception {
        response = myRunner.mirrorEnds("aaaa");
        assertEquals("aaaa", response);
    }


}
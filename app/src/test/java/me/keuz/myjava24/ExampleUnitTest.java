package me.keuz.myjava24;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        assertEquals(4, 2 + 2);
    }

    @Test
    public void round_isCorrect() {
        double d = 4.151756982317492876123;
        double actual = UtilMath.round(d); //You implemetation
        //Compare doubles with fration 0.001
        assertEquals(4.2 , actual, 0.001);
    }

    @Test
    public void round2_isCorrect() {
        double d = 4.151756982317492876123;
        double actual = UtilMath.round2(d); //You implemetation
        //Compare doubles with fration 0.001
        assertEquals(4.1, actual, 0.001);
    }
}

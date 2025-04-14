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
    public void round_format_message() {
        double d = 4.151756982317492876123;
        double actual = UtilMath.round_decimal_format(d);
        //Compare doubles with fration 0.001
        assertEquals(4.2, actual, 0.001);
    }

    @Test
    public void round_static_func_isCorrect() { //FAIL
        double d = 4.151756982317492876123;
        double actual = UtilMath.round_apollo(d); //agnostic-apollo implementation
        //Compare doubles with fration 0.001
        assertEquals(4.1, actual, 0.001);
    }

    @Test
    public void round_step_by_step_isCorrect() { //FAIL
        double d = 4.151756982317492876123;
        long round = Math.round(d * 10.0f);
        System.out.println(round);
        float v = round / 10.0f;

        double actual = (double) v;

        System.out.println(actual);
        //Compare doubles with fration 0.001
        assertEquals(4.1, actual, 0.001);
    }

    @Test
    public void round_pure_without_function_isCorrect() { //FAIL
        double d = 4.151756982317492876123;
        //Compare doubles with fration 0.001
        assertEquals(4.1, (Math.round(d * 10.0f) / 10.0f), 0.001);
    }
}

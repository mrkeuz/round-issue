package me.keuz.myjava24;

import static org.junit.Assert.assertEquals;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
// @RunWith is required only if you use a mix of JUnit3 and JUnit4.
@RunWith(AndroidJUnit4.class)
public class RoundAndroidUnitTest {

    @Test
    public void round_decimal_format_isCorrect() {
        double d = 4.151756982317492876123;
        double actual = UtilMath.round(d);
        //Compare doubles with fration 0.001
        assertEquals(4.2, actual, 0.001);
    }

    @Test
    public void round_agnostic_apollo_isCorrect() {
        double d = 4.151756982317492876123;
        double actual = UtilMath.round2(d);
        //Compare doubles with fration 0.001
        assertEquals(4.1, actual, 0.001);
    }
}
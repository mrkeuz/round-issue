package me.keuz.myjava24;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class UtilMath {
     public static double round(double d) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.#", otherSymbols);
        return Double.parseDouble(df.format(d));
    }

    public static double round2(double d) {
       return Math.round(d * 10.0f) / 10.0f;
    }



}

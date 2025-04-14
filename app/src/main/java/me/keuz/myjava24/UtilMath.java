package me.keuz.myjava24;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class UtilMath {
     public static double round_decimal_format(double d) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.#", otherSymbols);

        return Double.parseDouble(df.format(d));
    }

    public static double round_apollo(double d) {
        long round = Math.round(d * 10.0f);
        float v = round / 10.0f;

        return (double) v;
    }



}

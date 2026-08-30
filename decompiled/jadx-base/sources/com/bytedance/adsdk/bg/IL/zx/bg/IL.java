package com.bytedance.adsdk.bg.IL.zx.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private static boolean bg(int i, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return i == number.intValue();
        }
        if (number instanceof java.lang.Long) {
            return ((long) i) == number.longValue();
        }
        if (number instanceof java.lang.Float) {
            return ((float) i) == number.floatValue();
        }
        if (number instanceof java.lang.Double) {
            return ((double) i) == number.doubleValue();
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean bg(long j, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return j == ((long) number.intValue());
        }
        if (number instanceof java.lang.Long) {
            return j == number.longValue();
        }
        if (number instanceof java.lang.Float) {
            return ((float) j) == number.floatValue();
        }
        if (number instanceof java.lang.Double) {
            return ((double) j) == number.doubleValue();
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean bg(float f, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return f == ((float) number.intValue());
        }
        if (number instanceof java.lang.Long) {
            return f == ((float) number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return f == number.floatValue();
        }
        if (number instanceof java.lang.Double) {
            return ((double) f) == number.doubleValue();
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean bg(double d, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return d == ((double) number.intValue());
        }
        if (number instanceof java.lang.Long) {
            return d == ((double) number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return d == ((double) number.floatValue());
        }
        if (number instanceof java.lang.Double) {
            return d == number.doubleValue();
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static boolean bg(java.lang.Number number, java.lang.Number number2) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return bg(number.intValue(), number2);
        }
        if (number instanceof java.lang.Long) {
            return bg(number.longValue(), number2);
        }
        if (number instanceof java.lang.Float) {
            return bg(number.floatValue(), number2);
        }
        if (number instanceof java.lang.Double) {
            return bg(number.doubleValue(), number2);
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }
}

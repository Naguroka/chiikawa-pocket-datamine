package com.bytedance.adsdk.bg.IL.zx.bg;

/* JADX INFO: loaded from: classes3.dex */
public class iR {
    private static java.lang.Object bg(int i, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Integer.valueOf(i * number.intValue());
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Long.valueOf(((long) i) * number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Float.valueOf(i * number.floatValue());
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Double.valueOf(((double) i) * number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static java.lang.Object bg(long j, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Long.valueOf(j * ((long) number.intValue()));
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Long.valueOf(j * number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Float.valueOf(j * number.floatValue());
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Double.valueOf(j * number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static java.lang.Object bg(float f, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Float.valueOf(f * number.intValue());
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Float.valueOf(f * number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Float.valueOf(f * number.floatValue());
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Double.valueOf(((double) f) * number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static java.lang.Object bg(double d, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Double.valueOf(d * ((double) number.intValue()));
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Double.valueOf(d * number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Double.valueOf(d * ((double) number.floatValue()));
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Double.valueOf(d * number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static java.lang.Object bg(java.lang.Number number, java.lang.Number number2) {
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

package com.bytedance.adsdk.bg.IL.zx.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private static java.lang.Object bg(int i, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Boolean.valueOf(i > number.intValue());
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Boolean.valueOf(((long) i) > number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Boolean.valueOf(((float) i) > number.floatValue());
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Boolean.valueOf(((double) i) > number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static java.lang.Object bg(long j, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Boolean.valueOf(j > ((long) number.intValue()));
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Boolean.valueOf(j > number.longValue());
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Boolean.valueOf(((float) j) > number.floatValue());
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Boolean.valueOf(((double) j) > number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static java.lang.Object bg(float f, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Boolean.valueOf(f > ((float) number.intValue()));
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Boolean.valueOf(f > ((float) number.longValue()));
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Boolean.valueOf(f > number.floatValue());
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Boolean.valueOf(((double) f) > number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static java.lang.Object bg(double d, java.lang.Number number) {
        if ((number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte)) {
            return java.lang.Boolean.valueOf(d > ((double) number.intValue()));
        }
        if (number instanceof java.lang.Long) {
            return java.lang.Boolean.valueOf(d > ((double) number.longValue()));
        }
        if (number instanceof java.lang.Float) {
            return java.lang.Boolean.valueOf(d > ((double) number.floatValue()));
        }
        if (number instanceof java.lang.Double) {
            return java.lang.Boolean.valueOf(d > number.doubleValue());
        }
        throw new java.lang.UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static java.lang.Object bg(java.lang.Object obj, java.lang.Number number) {
        if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) {
            return bg(((java.lang.Number) obj).intValue(), number);
        }
        if (obj instanceof java.lang.Long) {
            return bg(((java.lang.Long) obj).longValue(), number);
        }
        if (obj instanceof java.lang.Float) {
            return bg(((java.lang.Float) obj).floatValue(), number);
        }
        if (obj instanceof java.lang.Double) {
            return bg(((java.lang.Double) obj).doubleValue(), number);
        }
        if (obj instanceof java.lang.String) {
            try {
                return bg(java.lang.Float.parseFloat((java.lang.String) obj), number);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
            }
        }
        throw new java.lang.UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
    }
}

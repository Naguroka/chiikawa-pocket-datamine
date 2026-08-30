package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T t) {
        if (android.text.TextUtils.isEmpty(t)) {
            throw new java.lang.IllegalArgumentException();
        }
        return t;
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T t, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(t)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
        return t;
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T t, java.lang.String str, java.lang.Object... objArr) {
        if (android.text.TextUtils.isEmpty(t)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
        return t;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static <T> T checkNotNull(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    public static void checkState(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void checkState(boolean z) {
        checkState(z, null);
    }

    public static int checkFlagsArgument(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("Requested flags 0x" + java.lang.Integer.toHexString(i) + ", but only 0x" + java.lang.Integer.toHexString(i2) + " are allowed");
    }

    public static int checkArgumentNonnegative(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str);
    }

    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static int checkArgumentInRange(int i, int i2, int i3, java.lang.String str) {
        if (i < i2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
    }

    public static long checkArgumentInRange(long j, long j2, long j3, java.lang.String str) {
        if (j < j2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too low)", str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
        }
        if (j <= j3) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too high)", str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
    }

    public static float checkArgumentInRange(float f, float f2, float f3, java.lang.String str) {
        if (f < f2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%f, %f] (too low)", str, java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f3)));
        }
        if (f <= f3) {
            return f;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%f, %f] (too high)", str, java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f3)));
    }

    public static double checkArgumentInRange(double d, double d2, double d3, java.lang.String str) {
        if (d < d2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%f, %f] (too low)", str, java.lang.Double.valueOf(d2), java.lang.Double.valueOf(d3)));
        }
        if (d <= d3) {
            return d;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%f, %f] (too high)", str, java.lang.Double.valueOf(d2), java.lang.Double.valueOf(d3)));
    }

    public static float checkArgumentFinite(float f, java.lang.String str) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException(str + " must not be NaN");
        }
        if (java.lang.Float.isInfinite(f)) {
            throw new java.lang.IllegalArgumentException(str + " must not be infinite");
        }
        return f;
    }

    private Preconditions() {
    }
}

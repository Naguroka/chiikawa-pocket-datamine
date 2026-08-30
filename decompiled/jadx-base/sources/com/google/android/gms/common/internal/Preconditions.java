package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static double checkArgumentInRange(double d, double d2, double d3, java.lang.String str) {
        if (d < d2) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, java.lang.Double.valueOf(d2), java.lang.Double.valueOf(d3)));
        }
        if (d <= d3) {
            return d;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, java.lang.Double.valueOf(d2), java.lang.Double.valueOf(d3)));
    }

    public static void checkHandlerThread(android.os.Handler handler) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            java.lang.String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    public static java.lang.String checkNotEmpty(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("Given Integer is zero");
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    static java.lang.String zza(java.lang.String str, java.lang.Object... objArr) {
        int iIndexOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 48);
        int i = 0;
        int i2 = 0;
        while (i < 3 && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < 3) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < 3; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(com.ironsource.y8.i.e);
        }
        return sb.toString();
    }

    public static void checkArgument(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkMainThread(java.lang.String str) {
        if (!com.google.android.gms.common.util.zzd.zza()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void checkNotGoogleApiHandlerThread(java.lang.String str) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != null && java.util.Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void checkNotMainThread(java.lang.String str) {
        if (com.google.android.gms.common.util.zzd.zza()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static <T> T checkNotNull(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    public static int checkNotZero(int i, java.lang.Object obj) {
        if (i != 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    public static void checkState(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static float checkArgumentInRange(float f, float f2, float f3, java.lang.String str) {
        if (f < f2) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f3)));
        }
        if (f <= f3) {
            return f;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f3)));
    }

    public static java.lang.String checkNotEmpty(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
        return str;
    }

    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException("Given Long is zero");
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.format(str, objArr));
        }
    }

    public static long checkNotZero(long j, java.lang.Object obj) {
        if (j != 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    public static int checkArgumentInRange(int i, int i2, int i3, java.lang.String str) {
        if (i < i2) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
    }

    public static void checkHandlerThread(android.os.Handler handler, java.lang.String str) {
        if (android.os.Looper.myLooper() != handler.getLooper()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static long checkArgumentInRange(long j, long j2, long j3, java.lang.String str) {
        if (j < j2) {
            throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
        }
        if (j <= j3) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
    }
}

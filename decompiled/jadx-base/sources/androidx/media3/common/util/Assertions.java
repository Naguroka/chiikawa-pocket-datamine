package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class Assertions {
    private Assertions() {
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void checkArgument(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int checkIndex(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return i;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void checkState(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void checkState(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkStateNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkStateNotNull(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkNotNull(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String checkNotEmpty(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return str;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String checkNotEmpty(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
        return str;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void checkMainThread() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("Not in applications main thread");
        }
    }
}

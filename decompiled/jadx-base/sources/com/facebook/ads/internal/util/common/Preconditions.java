package com.facebook.ads.internal.util.common;

/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalArgumentException(str);
    }

    public static void checkIsTrue(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void checkIsOnMainThread() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.RuntimeException("Must be called from the UiThread");
        }
    }
}

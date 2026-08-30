package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class Android {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final java.lang.Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    private Android() {
    }

    static {
        IS_ROBOLECTRIC = (ASSUME_ANDROID || getClassForName("org.robolectric.Robolectric") == null) ? false : true;
    }

    static boolean isOnAndroidDevice() {
        return ASSUME_ANDROID || !(MEMORY_CLASS == null || IS_ROBOLECTRIC);
    }

    static java.lang.Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    private static <T> java.lang.Class<T> getClassForName(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}

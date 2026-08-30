package androidx.room.util;

/* JADX INFO: loaded from: classes3.dex */
public class SneakyThrow {
    public static void reThrow(java.lang.Exception exc) throws java.lang.Throwable {
        sneakyThrow(exc);
    }

    private static <E extends java.lang.Throwable> void sneakyThrow(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }

    private SneakyThrow() {
    }
}

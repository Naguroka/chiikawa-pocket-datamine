package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class o0 {
    public static android.os.Handler a() {
        return com.pgl.ssdk.w0.a().b();
    }

    public static android.os.Handler b() {
        return com.pgl.ssdk.w0.a().c();
    }

    public static void a(java.lang.Runnable runnable) {
        android.os.Handler handlerA;
        if (runnable == null || (handlerA = a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public static void b(java.lang.Runnable runnable) {
        android.os.Handler handlerB;
        if (runnable == null || (handlerB = b()) == null) {
            return;
        }
        handlerB.post(runnable);
    }
}

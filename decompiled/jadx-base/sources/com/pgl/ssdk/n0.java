package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class n0 implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.pgl.ssdk.n0 f3801a;
    private volatile boolean c = false;
    private final java.lang.Thread.UncaughtExceptionHandler b = java.lang.Thread.getDefaultUncaughtExceptionHandler();

    private n0() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static com.pgl.ssdk.n0 b() {
        if (f3801a == null) {
            synchronized (com.pgl.ssdk.n0.class) {
                if (f3801a == null) {
                    f3801a = new com.pgl.ssdk.n0();
                }
            }
        }
        return f3801a;
    }

    public boolean a() {
        return this.c;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.c = true;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}

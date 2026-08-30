package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ot extends java.lang.Thread {
    private static com.json.ot b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.ot.a f3128a;

    private class a extends android.os.HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.os.Handler f3129a;

        a(java.lang.String str) {
            super(str);
            setUncaughtExceptionHandler(new com.json.mediationsdk.logger.d());
        }

        android.os.Handler a() {
            return this.f3129a;
        }

        void b() {
            this.f3129a = new android.os.Handler(getLooper());
        }
    }

    private ot() {
        com.ironsource.ot.a aVar = new com.ironsource.ot.a(getClass().getSimpleName());
        this.f3128a = aVar;
        aVar.start();
        this.f3128a.b();
    }

    public static synchronized com.json.ot a() {
        if (b == null) {
            b = new com.json.ot();
        }
        return b;
    }

    public synchronized void a(java.lang.Runnable runnable) {
        com.ironsource.ot.a aVar = this.f3128a;
        if (aVar == null) {
            return;
        }
        android.os.Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}

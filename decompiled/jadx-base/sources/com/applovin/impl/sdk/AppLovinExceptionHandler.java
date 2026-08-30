package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private static final com.applovin.impl.sdk.AppLovinExceptionHandler d = new com.applovin.impl.sdk.AppLovinExceptionHandler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f1266a = new java.util.HashSet(2);
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    private java.lang.Thread.UncaughtExceptionHandler c;

    public static com.applovin.impl.sdk.AppLovinExceptionHandler shared() {
        return d;
    }

    public void addSdk(com.applovin.impl.sdk.j jVar) {
        if (this.f1266a.contains(jVar)) {
            return;
        }
        this.f1266a.add(jVar);
    }

    public void enable() {
        if (this.b.compareAndSet(false, true)) {
            this.c = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        long jLongValue = 500;
        for (com.applovin.impl.sdk.j jVar : this.f1266a) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            jVar.D().a(com.applovin.impl.ka.T, com.applovin.impl.sdk.utils.CollectionUtils.map("top_main_method", th.toString()));
            jVar.z().trackEventSynchronously(com.ironsource.y8.h.e0);
            jLongValue = ((java.lang.Long) jVar.a(com.applovin.impl.sj.p3)).longValue();
        }
        try {
            java.lang.Thread.sleep(jLongValue);
        } catch (java.lang.InterruptedException unused) {
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            android.os.Process.killProcess(android.os.Process.myPid());
            java.lang.System.exit(1);
        }
    }
}

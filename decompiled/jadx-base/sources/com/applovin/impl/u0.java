package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class u0 {
    private static final com.applovin.impl.u0 l = new com.applovin.impl.u0();
    private android.os.Handler b;
    private android.os.Handler d;
    private com.applovin.impl.sdk.j g;
    private java.lang.Thread h;
    private long i;
    private long j;
    private long k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f1378a = new java.util.concurrent.atomic.AtomicLong(0);
    private final android.os.HandlerThread c = new android.os.HandlerThread("AppLovinSdk:anr_detector");
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();

    private u0() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.i = timeUnit.toMillis(4L);
        this.j = timeUnit.toMillis(3L);
        this.k = timeUnit.toMillis(3L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.h = java.lang.Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f.get()) {
            this.e.set(true);
        }
    }

    private class c implements java.lang.Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.u0.this.e.get()) {
                return;
            }
            com.applovin.impl.u0.this.f1378a.set(java.lang.System.currentTimeMillis());
            com.applovin.impl.u0.this.b.postDelayed(this, com.applovin.impl.u0.this.j);
        }
    }

    private class b implements java.lang.Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String str;
            if (com.applovin.impl.u0.this.e.get()) {
                return;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - com.applovin.impl.u0.this.f1378a.get();
            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > com.applovin.impl.u0.this.i) {
                com.applovin.impl.u0.this.a();
                if (com.applovin.impl.u0.this.h == null || com.applovin.impl.u0.this.h.getStackTrace().length <= 0) {
                    str = "None";
                } else {
                    java.lang.StackTraceElement stackTraceElement = com.applovin.impl.u0.this.h.getStackTrace()[0];
                    str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                }
                long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis() - com.applovin.impl.sdk.j.l());
                java.util.HashMap map = new java.util.HashMap(3);
                map.put("top_main_method", str);
                map.put("source", com.applovin.impl.u0.this.g.r0() ? "non_first_session" : "first_session");
                map.put("details", "seconds_since_app_launch=" + seconds);
                com.applovin.impl.u0.this.g.D().a(com.applovin.impl.ka.M, (java.util.Map) map);
            }
            com.applovin.impl.u0.this.d.postDelayed(this, com.applovin.impl.u0.this.k);
        }
    }

    private void a(com.applovin.impl.sdk.j jVar) {
        if (this.f.compareAndSet(false, true)) {
            this.g = jVar;
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.u0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b();
                }
            });
            this.i = ((java.lang.Long) jVar.a(com.applovin.impl.sj.N5)).longValue();
            this.j = ((java.lang.Long) jVar.a(com.applovin.impl.sj.O5)).longValue();
            this.k = ((java.lang.Long) jVar.a(com.applovin.impl.sj.P5)).longValue();
            this.b = new android.os.Handler(com.applovin.impl.sdk.j.m().getMainLooper());
            this.c.start();
            this.b.post(new com.applovin.impl.u0.c());
            android.os.Handler handler = new android.os.Handler(this.c.getLooper());
            this.d = handler;
            handler.postDelayed(new com.applovin.impl.u0.b(), this.k / 2);
        }
    }

    public static void b(com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.M5)).booleanValue() && !com.applovin.impl.yp.c(jVar)) {
                l.a(jVar);
            } else {
                l.a();
            }
        }
    }
}

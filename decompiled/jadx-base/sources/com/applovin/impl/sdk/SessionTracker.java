package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class SessionTracker {
    public static final java.lang.String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final java.lang.String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.j f1272a;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicLong e = new java.util.concurrent.atomic.AtomicLong();
    private final java.util.concurrent.atomic.AtomicLong f = new java.util.concurrent.atomic.AtomicLong();
    private java.util.Date g;
    private java.util.Date h;

    class a extends com.applovin.impl.p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            super.onActivityResumed(activity);
            com.applovin.impl.sdk.SessionTracker.this.b();
        }
    }

    class b implements android.content.ComponentCallbacks2 {
        b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(android.content.res.Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            com.applovin.impl.sdk.SessionTracker.this.d.set(i);
            if (i == 20) {
                com.applovin.impl.sdk.SessionTracker.this.a();
            }
        }
    }

    class c extends android.content.BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (com.applovin.impl.yp.g()) {
                    com.applovin.impl.sdk.SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                com.applovin.impl.sdk.SessionTracker.this.a();
            }
        }
    }

    SessionTracker(com.applovin.impl.sdk.j jVar) {
        this.f1272a = jVar;
        android.app.Application application = (android.app.Application) com.applovin.impl.sdk.j.m();
        application.registerActivityLifecycleCallbacks(new com.applovin.impl.sdk.SessionTracker.a());
        application.registerComponentCallbacks(new com.applovin.impl.sdk.SessionTracker.b());
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new com.applovin.impl.sdk.SessionTracker.c(), intentFilter);
    }

    private void d() {
        this.f1272a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1272a.I().a("SessionTracker", "Application Resumed");
        }
        this.f.set(java.lang.System.currentTimeMillis());
        boolean zBooleanValue = ((java.lang.Boolean) this.f1272a.a(com.applovin.impl.sj.v3)).booleanValue();
        long jLongValue = ((java.lang.Long) this.f1272a.a(com.applovin.impl.sj.w3)).longValue();
        com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastSync(new android.content.Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.b.getAndSet(false)) {
            return;
        }
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.h == null || java.lang.System.currentTimeMillis() - this.h.getTime() >= millis) {
            this.f1272a.z().trackEvent("resumed");
            if (zBooleanValue) {
                this.h = new java.util.Date();
            }
        }
        if (!zBooleanValue) {
            this.h = new java.util.Date();
        }
        this.f1272a.C().c(com.applovin.impl.ba.p);
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.d.get();
    }

    public boolean isApplicationPaused() {
        return this.c.get();
    }

    public void pauseForClick() {
        this.b.set(true);
    }

    public void resumeForClick() {
        this.b.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.c.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.c.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f1272a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1272a.I().a("SessionTracker", "Application Paused");
        }
        this.e.set(java.lang.System.currentTimeMillis());
        com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastSync(new android.content.Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.b.get()) {
            return;
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.f1272a.a(com.applovin.impl.sj.v3)).booleanValue();
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(((java.lang.Long) this.f1272a.a(com.applovin.impl.sj.x3)).longValue());
        if (this.g == null || java.lang.System.currentTimeMillis() - this.g.getTime() >= millis) {
            this.f1272a.z().trackEvent(com.ironsource.y8.h.e0);
            if (zBooleanValue) {
                this.g = new java.util.Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.g = new java.util.Date();
    }
}

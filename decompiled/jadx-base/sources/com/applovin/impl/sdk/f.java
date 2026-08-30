package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class f implements com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.go f1287a;
    private final java.lang.Object b = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    private boolean d;
    private final com.applovin.impl.sdk.j f;
    private final java.lang.ref.WeakReference g;
    private long h;

    public interface a {
        void onAdRefresh();
    }

    public f(com.applovin.impl.sdk.j jVar, com.applovin.impl.sdk.f.a aVar) {
        this.g = new java.lang.ref.WeakReference(aVar);
        this.f = jVar;
    }

    private void e() {
        if (((java.lang.Boolean) this.f.a(com.applovin.impl.ue.T6)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((java.lang.Boolean) this.f.a(com.applovin.impl.ue.T6)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.f.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f.I().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f.e0().isApplicationPaused()) {
                    this.f.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f.I().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    com.applovin.impl.go goVar = this.f1287a;
                    if (goVar != null) {
                        goVar.e();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        com.applovin.impl.sdk.f.a aVar = (com.applovin.impl.sdk.f.a) this.g.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.b) {
            com.applovin.impl.go goVar = this.f1287a;
            if (goVar != null) {
                goVar.d();
            } else {
                this.f.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.I().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.b) {
            this.f1287a = null;
            if (!((java.lang.Boolean) this.f.a(com.applovin.impl.ue.U6)).booleanValue()) {
                com.applovin.impl.sdk.AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.b) {
            com.applovin.impl.go goVar = this.f1287a;
            if (goVar != null) {
                goVar.e();
            } else {
                this.c.set(false);
            }
        }
    }

    public void a(long j) {
        synchronized (this.b) {
            a();
            this.h = j;
            this.f1287a = com.applovin.impl.go.a(j, this.f, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.f$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.i();
                }
            });
            if (!((java.lang.Boolean) this.f.a(com.applovin.impl.ue.U6)).booleanValue()) {
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED));
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter(com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED));
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter("com.applovin.fullscreen_ad_displayed"));
                com.applovin.impl.sdk.AppLovinBroadcastManager.registerReceiver(this, new android.content.IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((java.lang.Boolean) this.f.a(com.applovin.impl.ue.T6)).booleanValue() && (this.f.B().c() || this.f.e0().isApplicationPaused())) {
                this.f1287a.d();
            }
            if (this.c.compareAndSet(true, false) && ((java.lang.Boolean) this.f.a(com.applovin.impl.ue.V6)).booleanValue()) {
                this.f.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f.I().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f1287a.d();
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.b) {
            com.applovin.impl.go goVar = this.f1287a;
            jC = goVar != null ? goVar.c() : -1L;
        }
        return jC;
    }

    public void c() {
        if (((java.lang.Boolean) this.f.a(com.applovin.impl.ue.S6)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z;
        com.applovin.impl.sdk.f.a aVar;
        if (((java.lang.Boolean) this.f.a(com.applovin.impl.ue.S6)).booleanValue()) {
            synchronized (this.b) {
                if (this.d) {
                    this.f.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f.I().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f.B().c()) {
                    this.f.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f.I().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                if (this.f1287a != null) {
                    long jB = this.h - b();
                    long jLongValue = ((java.lang.Long) this.f.a(com.applovin.impl.ue.R6)).longValue();
                    if (jLongValue < 0 || jB <= jLongValue) {
                        this.f1287a.e();
                        z = false;
                    } else {
                        a();
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (!z || (aVar = (com.applovin.impl.sdk.f.a) this.g.get()) == null) {
                    return;
                }
                aVar.onAdRefresh();
            }
        }
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.f1287a != null;
        }
        return z;
    }

    public void j() {
        synchronized (this.b) {
            k();
            this.d = true;
        }
    }

    public void m() {
        synchronized (this.b) {
            n();
            this.d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(android.content.Intent intent, java.util.Map map) {
        java.lang.String action = intent.getAction();
        if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (com.applovin.impl.sdk.SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a() {
        synchronized (this.b) {
            com.applovin.impl.go goVar = this.f1287a;
            if (goVar != null) {
                goVar.a();
                l();
            }
        }
    }
}

package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class m {
    private static final com.applovin.impl.sdk.m.a j = new com.applovin.impl.sdk.m.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1303a;
    private long c;
    private long f;
    private java.lang.Object g;
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.lang.Object d = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.Map h = new java.util.HashMap();
    private final java.lang.Object i = new java.lang.Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1304a = -1;
        private int b;

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.sdk.m.a;
        }

        public long b() {
            return this.f1304a;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.sdk.m.a)) {
                return false;
            }
            com.applovin.impl.sdk.m.a aVar = (com.applovin.impl.sdk.m.a) obj;
            return aVar.a((java.lang.Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return ((((int) (jB ^ (jB >>> 32))) + 59) * 59) + a();
        }

        public java.lang.String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(com.applovin.impl.sdk.m.a aVar) {
            int i = aVar.b;
            aVar.b = i + 1;
            return i;
        }

        public int a() {
            return this.b;
        }
    }

    m(com.applovin.impl.sdk.j jVar) {
        this.f1303a = jVar;
    }

    public void a(boolean z) {
        synchronized (this.d) {
            this.e.set(z);
            if (z) {
                this.f = java.lang.System.currentTimeMillis();
                this.f1303a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1303a.I().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f);
                }
                final java.lang.Long l = (java.lang.Long) this.f1303a.a(com.applovin.impl.sj.Q1);
                if (l.longValue() >= 0) {
                    com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(l);
                        }
                    }, l.longValue());
                }
            } else {
                this.f = 0L;
                this.f1303a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1303a.I().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + java.lang.System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.c;
    }

    public boolean c() {
        return this.b.get();
    }

    public boolean d() {
        return this.e.get();
    }

    public void b(java.lang.Object obj) {
        if (!com.applovin.impl.ze.a(obj) && this.b.compareAndSet(true, false)) {
            this.g = null;
            this.f1303a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1303a.I().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + java.lang.System.currentTimeMillis());
            }
            com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(java.lang.String str) {
        synchronized (this.i) {
            com.applovin.impl.sdk.m.a aVar = (com.applovin.impl.sdk.m.a) this.h.get(str);
            if (aVar == null) {
                aVar = new com.applovin.impl.sdk.m.a();
                this.h.put(str, aVar);
            }
            aVar.f1304a = java.lang.System.currentTimeMillis();
            com.applovin.impl.sdk.m.a.a(aVar);
        }
    }

    public com.applovin.impl.sdk.m.a b(java.lang.String str) {
        com.applovin.impl.sdk.m.a aVar;
        synchronized (this.i) {
            aVar = (com.applovin.impl.sdk.m.a) this.h.get(str);
            if (aVar == null) {
                aVar = j;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.Long l) {
        if (d() && java.lang.System.currentTimeMillis() - this.f >= l.longValue()) {
            this.f1303a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1303a.I().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.e.set(false);
        }
    }

    public java.lang.Object a() {
        return this.g;
    }

    public void a(final java.lang.Object obj) {
        if (!com.applovin.impl.ze.a(obj) && this.b.compareAndSet(false, true)) {
            this.g = obj;
            this.c = java.lang.System.currentTimeMillis();
            this.f1303a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1303a.I().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.c);
            }
            com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final java.lang.Long l = (java.lang.Long) this.f1303a.a(com.applovin.impl.sj.R1);
            if (l.longValue() >= 0) {
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(l, obj);
                    }
                }, l.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.Long l, java.lang.Object obj) {
        if (this.b.get() && java.lang.System.currentTimeMillis() - this.c >= l.longValue()) {
            this.f1303a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1303a.I().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(java.lang.String str) {
        synchronized (this.i) {
            this.h.remove(str);
        }
    }
}

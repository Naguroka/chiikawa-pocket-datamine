package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class fi {
    public static final java.util.concurrent.Executor h = new java.util.concurrent.Executor() { // from class: com.applovin.impl.fi$$ExternalSyntheticLambda4
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };
    public static final java.util.concurrent.Executor i = new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0();
    private final java.lang.String b;
    private volatile java.lang.Object f;
    private volatile java.lang.Object g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f789a = new java.lang.Object();
    private final java.util.List c = new java.util.ArrayList();
    private volatile boolean d = false;
    private volatile boolean e = false;

    public interface a {
        void a(java.lang.Object obj);
    }

    public interface b {
        void a(boolean z, java.lang.Object obj, java.lang.Object obj2);
    }

    public fi(java.lang.String str) {
        this.b = str;
    }

    public void a(java.util.concurrent.Executor executor, com.applovin.impl.fi.b bVar) {
        java.lang.Runnable runnableC = c(executor, bVar);
        synchronized (this.f789a) {
            if (!this.d) {
                this.c.add(runnableC);
            } else {
                runnableC.run();
            }
        }
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.d && !this.e;
    }

    public java.lang.String b() {
        java.lang.String str = this.b;
        return str != null ? str : super.toString();
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (!this.d) {
            str = "Waiting";
        } else if (this.e) {
            str = "Success -> " + this.f;
        } else {
            str = "Failed -> " + this.g;
        }
        return "Promise(" + b() + ": " + str + ")";
    }

    public void a(java.util.concurrent.Executor executor, final com.applovin.impl.fi.a aVar) {
        a(executor, new com.applovin.impl.fi.b() { // from class: com.applovin.impl.fi$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.fi.b
            public final void a(boolean z, java.lang.Object obj, java.lang.Object obj2) {
                com.applovin.impl.fi.a(aVar, z, obj, obj2);
            }
        });
    }

    public void a(java.util.concurrent.Executor executor, final java.lang.Runnable runnable) {
        a(executor, new com.applovin.impl.fi.b() { // from class: com.applovin.impl.fi$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.fi.b
            public final void a(boolean z, java.lang.Object obj, java.lang.Object obj2) {
                com.applovin.impl.fi.a(runnable, z, obj, obj2);
            }
        });
    }

    private java.lang.Runnable c(final java.util.concurrent.Executor executor, final com.applovin.impl.fi.b bVar) {
        return new java.lang.Runnable() { // from class: com.applovin.impl.fi$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(executor, bVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(java.util.concurrent.Executor executor, final com.applovin.impl.fi.b bVar) {
        try {
            executor.execute(new java.lang.Runnable() { // from class: com.applovin.impl.fi$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(bVar);
                }
            });
        } catch (java.lang.Throwable th) {
            a(th);
        }
    }

    public com.applovin.impl.fi b(java.lang.Object obj) {
        a(true, obj, null);
        return this;
    }

    public java.lang.Object a() {
        com.applovin.impl.p6.a(d());
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.fi.a aVar, boolean z, java.lang.Object obj, java.lang.Object obj2) {
        if (z) {
            return;
        }
        aVar.a(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.lang.Runnable runnable, boolean z, java.lang.Object obj, java.lang.Object obj2) {
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.fi.b bVar) {
        try {
            bVar.a(this.e, this.f, this.g);
        } catch (java.lang.Throwable th) {
            a(th);
        }
    }

    private void a(java.lang.Throwable th) {
        com.applovin.impl.p6.a(th);
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar != null) {
            jVar.D().a("Promise", "PromiseCallback: " + b(), th);
        }
    }

    public com.applovin.impl.fi a(java.lang.Object obj) {
        a(false, null, obj);
        return this;
    }

    private void a(boolean z, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (this.f789a) {
            if (this.d) {
                return;
            }
            this.f = obj;
            this.g = obj2;
            this.e = z;
            this.d = true;
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            this.c.clear();
        }
    }

    public static com.applovin.impl.fi a(java.lang.String str, java.lang.Object obj) {
        return new com.applovin.impl.fi(str).b(obj);
    }
}

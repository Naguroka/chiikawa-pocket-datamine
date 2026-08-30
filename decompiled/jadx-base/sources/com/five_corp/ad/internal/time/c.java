package com.five_corp.ad.internal.time;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public final com.five_corp.ad.internal.time.a b;
    public final long c;
    public final long d;
    public com.five_corp.ad.internal.time.b f;
    public final java.lang.Object e = new java.lang.Object();
    public boolean g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f2076a = new android.os.Handler(android.os.Looper.getMainLooper());

    public c(com.five_corp.ad.internal.time.a aVar, long j, com.five_corp.ad.internal.time.b bVar) {
        this.b = aVar;
        aVar.getClass();
        this.c = com.five_corp.ad.internal.time.a.a() + j;
        this.d = 1000L;
        this.f = bVar;
    }

    public final void a() {
        long j = this.c;
        this.b.getClass();
        if (j >= java.lang.System.currentTimeMillis()) {
            synchronized (this.e) {
                if (this.f == null) {
                    return;
                }
                c();
                return;
            }
        }
        synchronized (this.e) {
            com.five_corp.ad.internal.time.b bVar = this.f;
            if (bVar == null) {
                return;
            }
            this.f = null;
            this.g = true;
            bVar.a();
        }
    }

    public final boolean b() {
        synchronized (this.e) {
            if (this.g) {
                return false;
            }
            this.f = null;
            return true;
        }
    }

    public final void c() {
        this.f2076a.postDelayed(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.time.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        }, this.d);
    }
}

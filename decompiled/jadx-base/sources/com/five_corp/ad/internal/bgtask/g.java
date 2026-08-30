package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.bgtask.m f1858a;
    public final com.five_corp.ad.internal.logger.a b;
    public long c = 0;
    public int d = 0;

    public g(com.five_corp.ad.internal.bgtask.m mVar, com.five_corp.ad.internal.logger.a aVar) {
        this.f1858a = mVar;
        this.b = aVar;
    }

    public final int a() {
        this.f1858a.toString();
        try {
            if (!this.f1858a.b()) {
                if (this.d < 3) {
                    this.f1858a.toString();
                    return 2;
                }
                this.f1858a.toString();
                this.f1858a.a();
                return 3;
            }
            this.f1858a.toString();
            com.five_corp.ad.internal.m mVar = this.f1858a.b;
            if (mVar == null) {
                return 1;
            }
            synchronized (mVar.h) {
                try {
                    mVar.i = false;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return 1;
        } catch (java.lang.Exception e) {
            this.f1858a.toString();
            this.b.a(e);
            this.f1858a.a();
            return 3;
        }
    }
}

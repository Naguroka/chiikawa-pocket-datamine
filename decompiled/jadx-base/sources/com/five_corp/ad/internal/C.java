package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1781a = new android.os.Handler(android.os.Looper.getMainLooper());
    public final com.five_corp.ad.internal.D b;
    public final com.five_corp.ad.internal.G c;
    public final com.five_corp.ad.internal.soundstate.c d;

    public C(com.five_corp.ad.internal.D d, com.five_corp.ad.internal.G g, com.five_corp.ad.internal.soundstate.c cVar) {
        this.b = d;
        this.c = g;
        this.d = cVar;
    }

    public final void a(com.five_corp.ad.internal.context.l lVar) {
        this.c.a(new com.five_corp.ad.internal.beacon.a(lVar, 5, this.d.a(), 0L, 0.0d));
        java.util.List<com.five_corp.ad.internal.ad.beacon.d> list = lVar.b.A;
        if (list != null) {
            for (com.five_corp.ad.internal.ad.beacon.d dVar : list) {
                if (dVar.f1792a == com.five_corp.ad.internal.ad.beacon.e.LOADED) {
                    com.five_corp.ad.internal.G g = this.c;
                    g.e.a(new com.five_corp.ad.internal.bgtask.k(dVar.b, g.c));
                }
            }
        }
        com.five_corp.ad.internal.D d = this.b;
        com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener = (com.five_corp.ad.FiveAdLoadListener) d.b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoad(d.f1782a);
        }
    }

    public final void b(final com.five_corp.ad.internal.context.l lVar) {
        this.f1781a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.C$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(lVar);
            }
        });
    }

    public final void b(final com.five_corp.ad.internal.context.i iVar, final com.five_corp.ad.internal.context.h hVar, final com.five_corp.ad.internal.s sVar) {
        this.f1781a.post(new java.lang.Runnable() { // from class: com.five_corp.ad.internal.C$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(iVar, hVar, sVar);
            }
        });
    }

    public final void a(com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.s sVar) {
        this.c.a(new com.five_corp.ad.internal.beacon.b(null, iVar, hVar, sVar, this.d.a(), 0L, null, null));
        com.five_corp.ad.internal.D d = this.b;
        com.five_corp.ad.FiveAdErrorCode fiveAdErrorCodeA = sVar.a();
        com.five_corp.ad.FiveAdLoadListener fiveAdLoadListener = (com.five_corp.ad.FiveAdLoadListener) d.b.get();
        if (fiveAdLoadListener != null) {
            fiveAdLoadListener.onFiveAdLoadError(d.f1782a, fiveAdErrorCodeA);
        }
    }
}

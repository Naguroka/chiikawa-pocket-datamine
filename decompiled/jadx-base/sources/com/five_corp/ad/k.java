package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.five_corp.ad.FiveAd {
    public static final java.lang.String b = com.five_corp.ad.k.class.toString();
    public static final java.lang.Object c = new java.lang.Object();
    public static com.five_corp.ad.k d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.j f2120a;

    public k(com.five_corp.ad.j jVar) {
        this.f2120a = jVar;
    }

    public static void initialize(android.content.Context context, com.five_corp.ad.FiveAdConfig fiveAdConfig) {
        if (fiveAdConfig.appId == null) {
            java.lang.String str = b;
            if (android.util.Log.isLoggable(str, 6)) {
                android.util.Log.e(str, "FiveAdConfig.appId must be a non-null value. We will raise an error if detect invalid fiveAdConfigs as soon.");
                return;
            } else {
                java.lang.System.err.println("FiveAdConfig.appId must be a non-null value. We will raise an error if detect invalid fiveAdConfigs as soon.");
                return;
            }
        }
        synchronized (c) {
            com.five_corp.ad.k kVar = d;
            if (kVar == null) {
                com.five_corp.ad.j jVar = new com.five_corp.ad.j(context, fiveAdConfig, new com.five_corp.ad.internal.time.a(), new com.five_corp.ad.internal.logger.a());
                com.five_corp.ad.internal.util.g gVarB = jVar.b();
                if (!gVarB.f2085a) {
                    jVar.d.a(gVarB.b);
                }
                d = new com.five_corp.ad.k(jVar);
            } else if (!kVar.f2120a.h.equals(fiveAdConfig)) {
                throw new java.lang.IllegalArgumentException("config should be same as previous one.");
            }
        }
        if (d.f2120a.d.a()) {
            for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
                try {
                    if (android.app.Activity.class.isAssignableFrom(java.lang.Class.forName(stackTraceElement.getClassName()))) {
                        d.f2120a.r.a(1);
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            com.five_corp.ad.internal.media_config.a aVar = d.f2120a.i.b().b;
            if (aVar != null && !aVar.b.isEmpty()) {
                return;
            }
            d.f2120a.r.a(1);
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (c) {
            z = d != null;
        }
        return z;
    }

    public void a(java.lang.String str) {
    }

    public void b() {
        this.f2120a.B.set(true);
    }

    @Override // com.five_corp.ad.FiveAd
    public final void enableSound(boolean z) {
        com.five_corp.ad.internal.soundstate.e eVar = this.f2120a.p;
        synchronized (eVar.f2049a) {
            eVar.b = new com.five_corp.ad.internal.soundstate.d(z ? 2 : 3, eVar.b.b);
        }
    }

    @Override // com.five_corp.ad.FiveAd
    public final boolean isSoundEnabled() {
        com.five_corp.ad.internal.soundstate.d dVarA = this.f2120a.p.a();
        return com.five_corp.ad.internal.soundstate.f.a(com.five_corp.ad.internal.soundstate.g.a(dVarA.f2048a, dVarA.b));
    }

    @Override // com.five_corp.ad.FiveAd
    public final void setMediaUserAttributes(java.util.List list) {
    }

    public static com.five_corp.ad.k a() {
        com.five_corp.ad.k kVar;
        synchronized (c) {
            kVar = d;
            if (kVar == null) {
                throw new java.lang.IllegalStateException("call initialize() first.");
            }
        }
        return kVar;
    }
}

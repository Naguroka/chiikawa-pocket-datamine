package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1118a;

    public static void b(final com.applovin.impl.sdk.j jVar) {
        java.lang.Long l = (java.lang.Long) jVar.a(com.applovin.impl.ue.D7);
        if (l.longValue() <= 0) {
            return;
        }
        jVar.i0().a(new com.applovin.impl.jn(jVar, true, "submitIntegrationErrorReport", new java.lang.Runnable() { // from class: com.applovin.impl.ob$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.ob.a(jVar);
            }
        }), com.applovin.impl.tm.b.OTHER, java.util.concurrent.TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        f1118a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.j jVar) {
        if (f1118a) {
            return;
        }
        jVar.D().a(com.applovin.impl.ka.V, "no_ads_loaded");
    }
}

package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bb extends com.google.android.play.core.assetpacks.internal.n {
    private final com.google.android.play.core.assetpacks.de c;
    private final com.google.android.play.core.assetpacks.cl d;
    private final com.google.android.play.core.assetpacks.bx e;
    private final com.google.android.play.core.assetpacks.co f;
    private final com.google.android.play.core.assetpacks.eb g;
    private final android.os.Handler h;
    private final com.google.android.play.core.assetpacks.internal.aq i;
    private final com.google.android.play.core.assetpacks.internal.aq j;
    private final com.google.android.play.core.assetpacks.internal.aq k;

    bb(android.content.Context context, com.google.android.play.core.assetpacks.de deVar, com.google.android.play.core.assetpacks.cl clVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.bx bxVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, com.google.android.play.core.assetpacks.internal.aq aqVar3, com.google.android.play.core.assetpacks.eb ebVar) {
        super(new com.google.android.play.core.assetpacks.internal.o("AssetPackServiceListenerRegistry"), new android.content.IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.h = new android.os.Handler(android.os.Looper.getMainLooper());
        this.c = deVar;
        this.d = clVar;
        this.i = aqVar;
        this.f = coVar;
        this.e = bxVar;
        this.j = aqVar2;
        this.k = aqVar3;
        this.g = ebVar;
    }

    final /* synthetic */ void a(android.os.Bundle bundle) {
        if (this.c.p(bundle)) {
            this.d.a();
        }
    }

    final /* synthetic */ void b(android.os.Bundle bundle, com.google.android.play.core.assetpacks.AssetPackState assetPackState) {
        if (this.c.o(bundle)) {
            d(assetPackState);
            ((com.google.android.play.core.assetpacks.y) this.i.a()).f();
        }
    }

    @Override // com.google.android.play.core.assetpacks.internal.n
    protected final void c(android.content.Context context, android.content.Intent intent) {
        final android.os.Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f2247a.b("Empty bundle received from broadcast.", new java.lang.Object[0]);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f2247a.b("Corrupt bundle received from broadcast.", new java.lang.Object[0]);
            return;
        }
        final com.google.android.play.core.assetpacks.AssetPackState assetPackStateB = com.google.android.play.core.assetpacks.AssetPackState.b(bundleExtra, stringArrayList.get(0), this.f, this.g, new com.google.android.play.core.assetpacks.be() { // from class: com.google.android.play.core.assetpacks.bd
            @Override // com.google.android.play.core.assetpacks.be
            public final int a(int i, java.lang.String str) {
                return i;
            }
        });
        this.f2247a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateB);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.e.b(pendingIntent);
        }
        ((java.util.concurrent.Executor) this.k.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.az
            @Override // java.lang.Runnable
            public final void run() {
                this.f2145a.b(bundleExtra, assetPackStateB);
            }
        });
        ((java.util.concurrent.Executor) this.j.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.ay
            @Override // java.lang.Runnable
            public final void run() {
                this.f2144a.a(bundleExtra);
            }
        });
    }

    final void d(final com.google.android.play.core.assetpacks.AssetPackState assetPackState) {
        this.h.post(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.ba
            @Override // java.lang.Runnable
            public final void run() {
                this.f2147a.i(assetPackState);
            }
        });
    }
}

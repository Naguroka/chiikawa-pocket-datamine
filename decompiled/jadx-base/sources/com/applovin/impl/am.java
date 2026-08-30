package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class am extends com.applovin.impl.yl {
    private final java.util.List h;
    private final android.app.Activity i;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.oe oeVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Auto-initing adapter: " + oeVar);
        }
        this.f1547a.K().b(oeVar, this.i);
    }

    public am(java.util.List list, android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        super("TaskAutoInitAdapters", jVar, true);
        this.h = list;
        this.i = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.h.size() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Auto-initing " + this.h.size() + " adapters" + (this.f1547a.k0().c() ? " in test mode" : "") + "...");
            }
            if (android.text.TextUtils.isEmpty(this.f1547a.N())) {
                this.f1547a.f(com.applovin.sdk.AppLovinMediationProvider.MAX);
            } else if (!this.f1547a.y0()) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f1547a.N());
            }
            if (this.i == null) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final com.applovin.impl.oe oeVar : this.h) {
                if (oeVar.s()) {
                    this.f1547a.i0().a(new java.lang.Runnable() { // from class: com.applovin.impl.am$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(oeVar);
                        }
                    }, com.applovin.impl.tm.b.MEDIATION);
                } else {
                    this.f1547a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f1547a.I().a(this.b, "Skipping eager auto-init for adapter " + oeVar);
                    }
                }
            }
        }
    }
}

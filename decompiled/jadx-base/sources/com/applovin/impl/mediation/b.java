package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.applovin.impl.mediation.a.InterfaceC0039a, com.applovin.impl.mediation.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1049a;
    private final com.applovin.impl.mediation.a b;
    private final com.applovin.impl.mediation.c c;

    public b(com.applovin.impl.sdk.j jVar) {
        this.f1049a = jVar;
        this.b = new com.applovin.impl.mediation.a(jVar);
        this.c = new com.applovin.impl.mediation.c(jVar, this);
    }

    public void e(com.applovin.impl.he heVar) {
        long jJ0 = heVar.j0();
        if (jJ0 >= 0) {
            this.c.a(heVar, jJ0);
        }
        boolean z = java.lang.Boolean.parseBoolean(this.f1049a.f0().getExtraParameters().get("should_schedule_ad_hidden_on_ad_destroy"));
        if (heVar.s0() || heVar.t0() || z) {
            this.b.a(z);
            this.b.a(heVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(com.applovin.impl.he heVar) {
        c(heVar);
    }

    public void a() {
        this.c.a();
        this.b.a();
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0039a
    public void b(final com.applovin.impl.he heVar) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.mediation.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(heVar);
            }
        }, heVar.i0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(com.applovin.impl.he heVar) {
        com.applovin.impl.mediation.g gVarA;
        if (heVar == null || (gVarA = heVar.A()) == null || !heVar.w().compareAndSet(false, true)) {
            return;
        }
        com.applovin.impl.fc.e(gVarA.c(), heVar);
    }
}

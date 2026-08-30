package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1050a;
    private final com.applovin.impl.sdk.n b;
    private final com.applovin.impl.mediation.c.a c;
    private com.applovin.impl.x1 d;

    public interface a {
        void a(com.applovin.impl.he heVar);
    }

    c(com.applovin.impl.sdk.j jVar, com.applovin.impl.mediation.c.a aVar) {
        this.f1050a = jVar;
        this.b = jVar.I();
        this.c = aVar;
    }

    public void a(final com.applovin.impl.he heVar, long j) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.d = com.applovin.impl.x1.a(j, this.f1050a, new java.lang.Runnable() { // from class: com.applovin.impl.mediation.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(heVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.he heVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.c.a(heVar);
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.x1 x1Var = this.d;
        if (x1Var != null) {
            x1Var.a();
            this.d = null;
        }
    }
}

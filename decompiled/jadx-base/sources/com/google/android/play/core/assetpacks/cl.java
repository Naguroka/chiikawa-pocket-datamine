package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2177a = new com.google.android.play.core.assetpacks.internal.o("ExtractorLooper");
    private final com.google.android.play.core.assetpacks.de b;
    private final com.google.android.play.core.assetpacks.cf c;
    private final com.google.android.play.core.assetpacks.es d;
    private final com.google.android.play.core.assetpacks.du e;
    private final com.google.android.play.core.assetpacks.dy f;
    private final com.google.android.play.core.assetpacks.eg g;
    private final com.google.android.play.core.assetpacks.ek h;
    private final com.google.android.play.core.assetpacks.dh i;
    private final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.android.play.core.assetpacks.internal.aq k;

    cl(com.google.android.play.core.assetpacks.de deVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.cf cfVar, com.google.android.play.core.assetpacks.es esVar, com.google.android.play.core.assetpacks.du duVar, com.google.android.play.core.assetpacks.dy dyVar, com.google.android.play.core.assetpacks.eg egVar, com.google.android.play.core.assetpacks.ek ekVar, com.google.android.play.core.assetpacks.dh dhVar) {
        this.b = deVar;
        this.k = aqVar;
        this.c = cfVar;
        this.d = esVar;
        this.e = duVar;
        this.f = dyVar;
        this.g = egVar;
        this.h = ekVar;
        this.i = dhVar;
    }

    private final void b(int i, java.lang.Exception exc) {
        try {
            this.b.m(i, 5);
            this.b.n(i);
        } catch (com.google.android.play.core.assetpacks.ck unused) {
            f2177a.b("Error during error handling: %s", exc.getMessage());
        }
    }

    final void a() {
        com.google.android.play.core.assetpacks.dg dgVarA;
        com.google.android.play.core.assetpacks.internal.o oVar = f2177a;
        oVar.a("Run extractor loop", new java.lang.Object[0]);
        if (!this.j.compareAndSet(false, true)) {
            oVar.e("runLoop already looping; return", new java.lang.Object[0]);
            return;
        }
        while (true) {
            try {
                dgVarA = this.i.a();
            } catch (com.google.android.play.core.assetpacks.ck e) {
                f2177a.b("Error while getting next extraction task: %s", e.getMessage());
                if (e.f2176a >= 0) {
                    ((com.google.android.play.core.assetpacks.y) this.k.a()).i(e.f2176a);
                    b(e.f2176a, e);
                }
                dgVarA = null;
            }
            if (dgVarA == null) {
                this.j.set(false);
                return;
            }
            try {
                if (dgVarA instanceof com.google.android.play.core.assetpacks.ce) {
                    this.c.a((com.google.android.play.core.assetpacks.ce) dgVarA);
                } else if (dgVarA instanceof com.google.android.play.core.assetpacks.er) {
                    this.d.a((com.google.android.play.core.assetpacks.er) dgVarA);
                } else if (dgVarA instanceof com.google.android.play.core.assetpacks.dt) {
                    this.e.a((com.google.android.play.core.assetpacks.dt) dgVarA);
                } else if (dgVarA instanceof com.google.android.play.core.assetpacks.dw) {
                    this.f.a((com.google.android.play.core.assetpacks.dw) dgVarA);
                } else if (dgVarA instanceof com.google.android.play.core.assetpacks.ef) {
                    this.g.a((com.google.android.play.core.assetpacks.ef) dgVarA);
                } else if (dgVarA instanceof com.google.android.play.core.assetpacks.ei) {
                    this.h.a((com.google.android.play.core.assetpacks.ei) dgVarA);
                } else {
                    f2177a.b("Unknown task type: %s", dgVarA.getClass().getName());
                }
            } catch (java.lang.Exception e2) {
                f2177a.b("Error during extraction task: %s", e2.getMessage());
                ((com.google.android.play.core.assetpacks.y) this.k.a()).i(dgVarA.k);
                b(dgVarA.k, e2);
            }
        }
    }
}

package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.bh f2225a;
    private final com.google.android.play.core.assetpacks.de b;
    private final com.google.android.play.core.assetpacks.co c;
    private final com.google.android.play.core.assetpacks.internal.aq d;
    private final com.google.android.play.core.assetpacks.internal.aq e;

    ek(com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.de deVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, com.google.android.play.core.assetpacks.co coVar) {
        this.f2225a = bhVar;
        this.d = aqVar;
        this.b = deVar;
        this.e = aqVar2;
        this.c = coVar;
    }

    public final void a(final com.google.android.play.core.assetpacks.ei eiVar) {
        java.io.File fileH = this.f2225a.h(eiVar.l, eiVar.f2223a, eiVar.c);
        if (!fileH.exists()) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Cannot find pack files to promote for pack %s at %s", eiVar.l, fileH.getAbsolutePath()), eiVar.k);
        }
        java.io.File fileH2 = this.f2225a.h(eiVar.l, eiVar.b, eiVar.c);
        fileH2.mkdirs();
        if (!fileH.renameTo(fileH2)) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Cannot promote pack %s from %s to %s", eiVar.l, fileH.getAbsolutePath(), fileH2.getAbsolutePath()), eiVar.k);
        }
        ((java.util.concurrent.Executor) this.e.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.ej
            @Override // java.lang.Runnable
            public final void run() {
                this.f2224a.b(eiVar);
            }
        });
        this.b.k(eiVar.l, eiVar.b, eiVar.c);
        this.c.c(eiVar.l);
        ((com.google.android.play.core.assetpacks.y) this.d.a()).h(eiVar.k, eiVar.l);
    }

    final /* synthetic */ void b(com.google.android.play.core.assetpacks.ei eiVar) {
        this.f2225a.B(eiVar.l, eiVar.b, eiVar.c);
    }
}

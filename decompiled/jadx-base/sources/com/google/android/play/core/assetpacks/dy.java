package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.bh f2213a;
    private final com.google.android.play.core.assetpacks.de b;
    private final com.google.android.play.core.assetpacks.co c;
    private final com.google.android.play.core.assetpacks.eb d;
    private final com.google.android.play.core.assetpacks.internal.aq e;
    private final com.google.android.play.core.assetpacks.internal.aq f;

    dy(com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, com.google.android.play.core.assetpacks.de deVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, com.google.android.play.core.assetpacks.co coVar, com.google.android.play.core.assetpacks.eb ebVar) {
        this.f2213a = bhVar;
        this.e = aqVar;
        this.b = deVar;
        this.f = aqVar2;
        this.c = coVar;
        this.d = ebVar;
    }

    public final void a(final com.google.android.play.core.assetpacks.dw dwVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.io.File fileJ = this.f2213a.j(dwVar.l, dwVar.f2211a, dwVar.b);
        java.io.File fileL = this.f2213a.l(dwVar.l, dwVar.f2211a, dwVar.b);
        if (!fileJ.exists() || !fileL.exists()) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Cannot find pack files to move for pack %s.", dwVar.l), dwVar.k);
        }
        java.io.File fileH = this.f2213a.h(dwVar.l, dwVar.f2211a, dwVar.b);
        fileH.mkdirs();
        if (!fileJ.renameTo(fileH)) {
            throw new com.google.android.play.core.assetpacks.ck("Cannot move merged pack files to final location.", dwVar.k);
        }
        new java.io.File(this.f2213a.h(dwVar.l, dwVar.f2211a, dwVar.b), "merge.tmp").delete();
        java.io.File fileI = this.f2213a.i(dwVar.l, dwVar.f2211a, dwVar.b);
        fileI.mkdirs();
        if (!fileL.renameTo(fileI)) {
            throw new com.google.android.play.core.assetpacks.ck("Cannot move metadata files to final location.", dwVar.k);
        }
        try {
            this.d.b(dwVar.l, dwVar.f2211a, dwVar.b, dwVar.c);
            ((java.util.concurrent.Executor) this.f.a()).execute(new java.lang.Runnable() { // from class: com.google.android.play.core.assetpacks.dx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2212a.b(dwVar);
                }
            });
            this.b.k(dwVar.l, dwVar.f2211a, dwVar.b);
            this.c.c(dwVar.l);
            ((com.google.android.play.core.assetpacks.y) this.e.a()).h(dwVar.k, dwVar.l);
        } catch (java.io.IOException e) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Could not write asset pack version tag for pack %s: %s", dwVar.l, e.getMessage()), dwVar.k);
        }
    }

    final /* synthetic */ void b(com.google.android.play.core.assetpacks.dw dwVar) {
        this.f2213a.B(dwVar.l, dwVar.f2211a, dwVar.b);
    }
}

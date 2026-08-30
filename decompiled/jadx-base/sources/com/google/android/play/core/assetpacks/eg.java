package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2221a = new com.google.android.play.core.assetpacks.internal.o("PatchSliceTaskHandler");
    private final com.google.android.play.core.assetpacks.bh b;
    private final com.google.android.play.core.assetpacks.internal.aq c;

    eg(com.google.android.play.core.assetpacks.bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar) {
        this.b = bhVar;
        this.c = aqVar;
    }

    public final void a(com.google.android.play.core.assetpacks.ef efVar) {
        java.io.File fileH = this.b.h(efVar.l, efVar.f2220a, efVar.b);
        java.io.File file = new java.io.File(this.b.i(efVar.l, efVar.f2220a, efVar.b), efVar.f);
        try {
            java.io.InputStream gZIPInputStream = efVar.h;
            if (efVar.e == 2) {
                gZIPInputStream = new java.util.zip.GZIPInputStream(gZIPInputStream, 8192);
            }
            try {
                com.google.android.play.core.assetpacks.bk bkVar = new com.google.android.play.core.assetpacks.bk(fileH, file);
                java.io.File fileP = this.b.p(efVar.l, efVar.c, efVar.d, efVar.f);
                if (!fileP.exists()) {
                    fileP.mkdirs();
                }
                com.google.android.play.core.assetpacks.eo eoVar = new com.google.android.play.core.assetpacks.eo(this.b, efVar.l, efVar.c, efVar.d, efVar.f);
                com.google.android.play.core.assetpacks.internal.am.a(bkVar, gZIPInputStream, new com.google.android.play.core.assetpacks.cn(fileP, eoVar), efVar.g);
                eoVar.i(0);
                gZIPInputStream.close();
                f2221a.d("Patching and extraction finished for slice %s of pack %s.", efVar.f, efVar.l);
                ((com.google.android.play.core.assetpacks.y) this.c.a()).g(efVar.k, efVar.l, efVar.f, 0);
                try {
                    efVar.h.close();
                } catch (java.io.IOException unused) {
                    f2221a.e("Could not close file for slice %s of pack %s.", efVar.f, efVar.l);
                }
            } catch (java.lang.Throwable th) {
                try {
                    gZIPInputStream.close();
                } catch (java.lang.Throwable th2) {
                    try {
                        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                    } catch (java.lang.Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            f2221a.b("IOException during patching %s.", e.getMessage());
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Error patching slice %s of pack %s.", efVar.f, efVar.l), e, efVar.k);
        }
    }
}

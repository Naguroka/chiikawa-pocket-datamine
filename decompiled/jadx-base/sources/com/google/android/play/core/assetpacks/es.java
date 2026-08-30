package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class es {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2231a = new com.google.android.play.core.assetpacks.internal.o("VerifySliceTaskHandler");
    private final com.google.android.play.core.assetpacks.bh b;

    es(com.google.android.play.core.assetpacks.bh bhVar) {
        this.b = bhVar;
    }

    private final void b(com.google.android.play.core.assetpacks.er erVar, java.io.File file) {
        try {
            java.io.File fileO = this.b.o(erVar.l, erVar.f2230a, erVar.b, erVar.c);
            if (!fileO.exists()) {
                throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Cannot find metadata files for slice %s.", erVar.c), erVar.k);
            }
            try {
                if (!com.google.android.play.core.assetpacks.dq.a(com.google.android.play.core.assetpacks.eq.a(file, fileO)).equals(erVar.d)) {
                    throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Verification failed for slice %s.", erVar.c), erVar.k);
                }
                f2231a.d("Verification of slice %s of pack %s successful.", erVar.c, erVar.l);
            } catch (java.io.IOException e) {
                throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Could not digest file during verification for slice %s.", erVar.c), e, erVar.k);
            } catch (java.security.NoSuchAlgorithmException e2) {
                throw new com.google.android.play.core.assetpacks.ck("SHA256 algorithm not supported.", e2, erVar.k);
            }
        } catch (java.io.IOException e3) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Could not reconstruct slice archive during verification for slice %s.", erVar.c), e3, erVar.k);
        }
    }

    public final void a(com.google.android.play.core.assetpacks.er erVar) {
        java.io.File fileP = this.b.p(erVar.l, erVar.f2230a, erVar.b, erVar.c);
        if (!fileP.exists()) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Cannot find unverified files for slice %s.", erVar.c), erVar.k);
        }
        b(erVar, fileP);
        java.io.File fileQ = this.b.q(erVar.l, erVar.f2230a, erVar.b, erVar.c);
        if (!fileQ.exists()) {
            fileQ.mkdirs();
        }
        if (!fileP.renameTo(fileQ)) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Failed to move slice %s after verification.", erVar.c), erVar.k);
        }
    }
}

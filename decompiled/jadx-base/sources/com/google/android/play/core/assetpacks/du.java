package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.assetpacks.internal.o f2209a = new com.google.android.play.core.assetpacks.internal.o("MergeSliceTaskHandler");
    private final com.google.android.play.core.assetpacks.bh b;

    du(com.google.android.play.core.assetpacks.bh bhVar) {
        this.b = bhVar;
    }

    private static void b(java.io.File file, java.io.File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                throw new com.google.android.play.core.assetpacks.ck("File clashing with existing file from other slice: ".concat(file2.toString()));
            }
            if (!file.renameTo(file2)) {
                throw new com.google.android.play.core.assetpacks.ck("Unable to move file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(file))));
            }
            return;
        }
        file2.mkdirs();
        for (java.io.File file3 : file.listFiles()) {
            b(file3, new java.io.File(file2, file3.getName()));
        }
        if (!file.delete()) {
            throw new com.google.android.play.core.assetpacks.ck("Unable to delete directory: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(file))));
        }
    }

    public final void a(com.google.android.play.core.assetpacks.dt dtVar) {
        java.io.File fileQ = this.b.q(dtVar.l, dtVar.f2208a, dtVar.b, dtVar.c);
        if (!fileQ.exists()) {
            throw new com.google.android.play.core.assetpacks.ck(java.lang.String.format("Cannot find verified files for slice %s.", dtVar.c), dtVar.k);
        }
        java.io.File fileJ = this.b.j(dtVar.l, dtVar.f2208a, dtVar.b);
        if (!fileJ.exists()) {
            fileJ.mkdirs();
        }
        b(fileQ, fileJ);
        try {
            this.b.A(dtVar.l, dtVar.f2208a, dtVar.b, this.b.b(dtVar.l, dtVar.f2208a, dtVar.b) + 1);
        } catch (java.io.IOException e) {
            f2209a.b("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new com.google.android.play.core.assetpacks.ck("Writing merge checkpoint failed.", e, dtVar.k);
        }
    }
}

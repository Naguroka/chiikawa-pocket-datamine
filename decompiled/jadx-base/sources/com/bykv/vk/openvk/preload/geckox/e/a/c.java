package com.bykv.vk.openvk.preload.geckox.e.a;

/* JADX INFO: compiled from: NormalFileLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.bykv.vk.openvk.preload.geckox.e.a.a {
    public c(java.io.File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    protected final java.io.InputStream a(java.io.File file, java.lang.String str) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, "res" + java.io.File.separator + str);
        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            throw new java.io.IOException("file not found");
        }
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
        return new java.io.FileInputStream(file2.getCanonicalFile());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    protected final boolean b(java.io.File file, java.lang.String str) throws java.io.IOException {
        return new java.io.File(file, "res" + java.io.File.separator + str).exists();
    }
}

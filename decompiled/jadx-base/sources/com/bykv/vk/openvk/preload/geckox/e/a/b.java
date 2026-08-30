package com.bykv.vk.openvk.preload.geckox.e.a;

/* JADX INFO: compiled from: MyArchiveFileLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.bykv.vk.openvk.preload.geckox.e.a.a {
    public b(java.io.File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    protected final java.io.InputStream a(java.io.File file, java.lang.String str) throws java.io.IOException {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "MyArchiveFileLoader, file:", new java.io.File(str).getCanonicalPath());
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.e.a.a
    protected final boolean b(java.io.File file, java.lang.String str) throws java.io.IOException {
        new java.io.File(str).getCanonicalPath();
        return false;
    }
}

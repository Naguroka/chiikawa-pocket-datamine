package com.bykv.vk.openvk.preload.geckox.d.b.b;

/* JADX INFO: compiled from: RenameMergedZipDirInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends com.bykv.vk.openvk.preload.b.d<android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>, android.util.Pair<java.lang.String, java.lang.Long>> {
    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.b.b<android.util.Pair<java.lang.String, java.lang.Long>> bVar, android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair2 = pair;
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start active merged zip file, channel:", ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair2.second).getChannel());
        java.io.File parentFile = ((java.io.File) pair2.first).getParentFile();
        long version = ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair2.second).getVersion();
        java.io.File file = new java.io.File(parentFile.getParentFile(), java.lang.String.valueOf(version));
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
        if (!parentFile.renameTo(file)) {
            throw new java.lang.RuntimeException("active merged zip file failed:" + parentFile.getAbsolutePath());
        }
        return bVar.a(new android.util.Pair<>(((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair2.second).getChannel(), java.lang.Long.valueOf(version)));
    }
}

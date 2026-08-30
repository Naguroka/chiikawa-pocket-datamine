package com.bykv.vk.openvk.preload.geckox.d.b.b;

/* JADX INFO: compiled from: UnZipMergedZipInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends com.bykv.vk.openvk.preload.b.d<android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>, android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> {
    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* bridge */ /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.b.b<android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        return a2(bVar, pair);
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static java.lang.Object a2(com.bykv.vk.openvk.preload.b.b<android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start unzip merged zip file, channel:", ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage = (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second;
        aVar.b(0L);
        java.io.File parentFile = aVar.f().getParentFile();
        try {
            com.bykv.vk.openvk.preload.geckox.utils.h.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(aVar), parentFile.getAbsolutePath(), updatePackage.getChannel());
            aVar.a();
            java.io.File file = new java.io.File(parentFile, "res");
            com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
            if (!new java.io.File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                throw new java.lang.RuntimeException("rename unzip merged zip file failed:" + parentFile.getAbsolutePath());
            }
            return bVar.a(new android.util.Pair<>(aVar.f(), updatePackage));
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("unzip merged zip file failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + e.getMessage(), e);
        }
    }
}

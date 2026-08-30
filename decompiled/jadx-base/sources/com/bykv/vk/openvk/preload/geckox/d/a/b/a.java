package com.bykv.vk.openvk.preload.geckox.d.a.b;

/* JADX INFO: compiled from: CheckMergedSingleFileMD5Interceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.bykv.vk.openvk.preload.b.d<android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>, android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> {
    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* bridge */ /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.b.b<android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        return a2(bVar, pair);
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static java.lang.Object a2(com.bykv.vk.openvk.preload.b.b<android.util.Pair<java.io.File, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start check merged single file, channel:", ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        aVar.b(0L);
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage = (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second;
        try {
            com.bykv.vk.openvk.preload.geckox.utils.d.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(aVar), updatePackage.getFullPackage().getMd5());
            return bVar.a(new android.util.Pair<>(aVar.f(), updatePackage));
        } catch (java.lang.Throwable th) {
            throw new java.lang.RuntimeException("check merged single file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}

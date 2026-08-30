package com.bykv.vk.openvk.preload.geckox.d;

/* JADX INFO: compiled from: FullPatchRetryInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends com.bykv.vk.openvk.preload.b.j<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> {
    @Override // com.bykv.vk.openvk.preload.b.j
    protected final /* synthetic */ java.lang.String a(com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage) {
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage2 = updatePackage;
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package patch = updatePackage2.getPatch();
        if (patch == null) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        java.util.List<java.lang.String> urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
        return "patch";
    }

    @Override // com.bykv.vk.openvk.preload.b.j
    protected final /* synthetic */ java.lang.String a(com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage, java.lang.Throwable th, java.lang.String str) {
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage2 = updatePackage;
        if (!"patch".equals(str)) {
            throw new java.lang.RuntimeException("full update failed, caused by:" + th.getMessage(), th);
        }
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
        return "full";
    }
}

package com.bykv.vk.openvk.preload.geckox.d;

/* JADX INFO: compiled from: RetryFullDownloadInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends com.bykv.vk.openvk.preload.b.k<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage, android.util.Pair<android.net.Uri, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> {
    private int d = 0;

    @Override // com.bykv.vk.openvk.preload.b.k
    protected final boolean a(java.lang.Throwable th) {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "full update failed and retry", th);
        if (this.d >= g().getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    @Override // com.bykv.vk.openvk.preload.b.k
    protected final /* synthetic */ android.util.Pair<android.net.Uri, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> a() {
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackageG = g();
        java.util.List<java.lang.String> urlList = updatePackageG.getFullPackage().getUrlList();
        int i = this.d;
        this.d = i + 1;
        return new android.util.Pair<>(android.net.Uri.parse(urlList.get(i)), updatePackageG);
    }
}

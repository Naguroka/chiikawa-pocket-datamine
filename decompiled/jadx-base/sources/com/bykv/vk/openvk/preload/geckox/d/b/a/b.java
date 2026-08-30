package com.bykv.vk.openvk.preload.geckox.d.b.a;

/* JADX INFO: compiled from: DownloadFullZipInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends com.bykv.vk.openvk.preload.b.d<android.util.Pair<android.net.Uri, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private java.io.File e;

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (java.io.File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public java.lang.Object a(com.bykv.vk.openvk.preload.b.b<android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<android.net.Uri, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start download full zip file, channel:", ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage = (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second;
        java.lang.String string = ((android.net.Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        java.io.File file = new java.io.File(this.e, updatePackage.getAccessKey() + java.io.File.separator + updatePackage.getChannel() + java.io.File.separator + updatePackage.getVersion() + "--updating");
        file.mkdirs();
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new java.io.File(file, "res.zip"), length);
        try {
            this.d.i().downloadFile(string, length, new com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream(aVarA));
            try {
                return bVar.a(new android.util.Pair<>(aVarA, updatePackage));
            } finally {
                aVarA.e();
            }
        } catch (java.lang.Throwable th) {
            aVarA.e();
            throw new com.bykv.vk.openvk.preload.geckox.b.a("download full zip file failed, url:" + string + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}

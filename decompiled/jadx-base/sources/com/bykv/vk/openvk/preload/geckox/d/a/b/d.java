package com.bykv.vk.openvk.preload.geckox.d.a.b;

/* JADX INFO: compiled from: MergePatchSingleFileInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* bridge */ /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.b.b<android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        return a2(bVar, pair);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static java.lang.Object a2(com.bykv.vk.openvk.preload.b.b<android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start merge patch single file, channel:", ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        java.io.File fileF = aVar.f();
        aVar.a();
        aVar.e();
        java.io.File parentFile = fileF.getParentFile().getParentFile();
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage = (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second;
        java.io.File file = new java.io.File(parentFile, updatePackage.getLocalVersion() + java.io.File.separator + "res");
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            throw new java.lang.RuntimeException("can not found old full single file,:" + file.getAbsolutePath());
        }
        java.io.File file2 = fileArrListFiles[0];
        java.io.File file3 = new java.io.File(fileF.getParentFile(), "res" + java.io.File.separator + com.bykv.vk.openvk.preload.geckox.d.a.a.b.a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file3);
        try {
            try {
                com.bykv.vk.openvk.preload.geckox.utils.BsPatch.a(file2, fileF, file3.getParentFile(), file3.getName());
                com.bykv.vk.openvk.preload.geckox.utils.b.a(fileF);
                com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, file3.length());
                try {
                    return bVar.a(new android.util.Pair<>(aVarA, updatePackage));
                } finally {
                    aVarA.e();
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException("merge patch single file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
            }
        } catch (java.lang.Throwable th) {
            com.bykv.vk.openvk.preload.geckox.utils.b.a(fileF);
            throw th;
        }
    }
}

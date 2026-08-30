package com.bykv.vk.openvk.preload.geckox.d;

/* JADX INFO: compiled from: FileTypeBranchInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.bykv.vk.openvk.preload.b.a<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> {
    @Override // com.bykv.vk.openvk.preload.b.a
    protected final /* synthetic */ java.lang.String a(com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        throw new java.lang.RuntimeException("unknow file type: ".concat(java.lang.String.valueOf(packageType)));
    }
}

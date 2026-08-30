package com.bykv.vk.openvk.preload.geckox.d.a.a;

/* JADX INFO: compiled from: DownloadFullSingleFileInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends com.bykv.vk.openvk.preload.b.d<android.util.Pair<android.net.Uri, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>, android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private java.io.File e;

    public static java.lang.String a(com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("url empty, channel:" + updatePackage.getChannel());
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            throw new java.lang.RuntimeException("url path illegal, url:".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String strSubstring = str.substring(iLastIndexOf + 1);
        if (android.text.TextUtils.isEmpty(strSubstring)) {
            throw new java.lang.RuntimeException("url path illegal, url:".concat(java.lang.String.valueOf(str)));
        }
        return strSubstring;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (java.io.File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public java.lang.Object a(com.bykv.vk.openvk.preload.b.b<android.util.Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> bVar, android.util.Pair<android.net.Uri, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage> pair) throws java.lang.Throwable {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", ((com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage updatePackage = (com.bykv.vk.openvk.preload.geckox.model.UpdatePackage) pair.second;
        java.lang.String string = ((android.net.Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        java.io.File file = new java.io.File(this.e, updatePackage.getAccessKey() + java.io.File.separator + updatePackage.getChannel() + java.io.File.separator + updatePackage.getVersion() + "--updating");
        file.mkdirs();
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new java.io.File(file, "res" + java.io.File.separator + a(updatePackage, string)), length);
        try {
            this.d.i().downloadFile(string, length, new com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream(aVarA));
            try {
                try {
                    java.lang.Object objA = bVar.a(new android.util.Pair<>(aVarA, updatePackage));
                    try {
                        aVarA.e();
                    } catch (java.lang.Exception e) {
                        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e);
                    }
                    return objA;
                } catch (java.lang.Exception e2) {
                    throw e2;
                }
            } catch (java.lang.Throwable th) {
                try {
                    aVarA.e();
                } catch (java.lang.Exception e3) {
                    com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e3);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            aVarA.e();
            throw new com.bykv.vk.openvk.preload.geckox.b.a("download full single file failed! url:" + string + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th2.getMessage(), th2);
        }
    }
}

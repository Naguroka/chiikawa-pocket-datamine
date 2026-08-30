package com.bykv.vk.openvk.preload.geckox.d;

/* JADX INFO: compiled from: LoadLocalChannelVersionInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<java.util.List<java.lang.String>, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> {
    private java.io.File d;
    private java.lang.String e;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.b.b<java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>> bVar, java.util.List<java.lang.String> list) throws java.lang.Throwable {
        java.util.List<java.lang.String> list2 = list;
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        java.io.File file = new java.io.File(this.d, this.e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list2) {
            java.lang.Long lA = com.bykv.vk.openvk.preload.geckox.utils.g.a(new java.io.File(file, str));
            arrayList.add(new android.util.Pair<>(str, java.lang.Long.valueOf(lA == null ? 0L : lA.longValue())));
        }
        return bVar.a(arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        super.a(objArr);
        this.d = (java.io.File) objArr[0];
        this.e = (java.lang.String) objArr[1];
    }
}

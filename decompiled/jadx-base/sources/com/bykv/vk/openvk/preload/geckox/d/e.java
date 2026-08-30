package com.bykv.vk.openvk.preload.geckox.d;

/* JADX INFO: compiled from: LoadLocalChannelVersionInterceptorMulti.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends com.bykv.vk.openvk.preload.b.d<java.lang.String, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>>> {
    private java.io.File d;
    private java.util.List<java.lang.String> e;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ java.lang.Object a(com.bykv.vk.openvk.preload.b.b<java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.Long>>>> bVar, java.lang.String str) throws java.lang.Throwable {
        java.lang.Long lA;
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.d("gecko-debug-tag", "get local channel version:", str);
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str2 : this.e) {
            java.io.File file = new java.io.File(this.d, str2);
            java.lang.String[] list = file.list();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list != null && list.length > 0) {
                for (java.lang.String str3 : list) {
                    java.io.File file2 = new java.io.File(file, str3);
                    if (file2.isDirectory() && (lA = com.bykv.vk.openvk.preload.geckox.utils.g.a(file2)) != null) {
                        arrayList.add(new android.util.Pair<>(str3, lA));
                    }
                }
            }
            map.put(str2, arrayList);
        }
        return bVar.a(map);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    protected final void a(java.lang.Object... objArr) {
        super.a(objArr);
        this.d = (java.io.File) objArr[0];
        this.e = (java.util.List) objArr[1];
    }
}

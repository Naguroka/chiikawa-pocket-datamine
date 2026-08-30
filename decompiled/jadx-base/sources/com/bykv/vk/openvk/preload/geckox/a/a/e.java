package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: compiled from: FIFOCachePolicy.java */
/* JADX INFO: loaded from: classes3.dex */
final class e extends com.bykv.vk.openvk.preload.geckox.a.a.b {
    e() {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar, java.io.File file, java.util.List<java.lang.String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        java.util.Iterator<java.lang.String> it = this.e.iterator();
        while (it.hasNext()) {
            java.util.List<java.io.File> listB = com.bykv.vk.openvk.preload.geckox.utils.b.b(new java.io.File(this.d, it.next()));
            if (listB != null && listB.size() > this.c.f1713a) {
                java.util.Iterator<java.io.File> it2 = listB.subList(0, listB.size() - this.c.f1713a).iterator();
                while (it2.hasNext()) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(it2.next().getAbsolutePath());
                }
            }
        }
    }
}

package com.bykv.vk.openvk.preload.geckox.statistic;

/* JADX INFO: compiled from: StatisticDataManager.java */
/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.Long, com.bykv.vk.openvk.preload.geckox.statistic.a> f1746a = new java.util.HashMap();
    private final java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> b = new java.util.HashMap();

    a() {
    }

    static com.bykv.vk.openvk.preload.geckox.statistic.a a(long j) {
        com.bykv.vk.openvk.preload.geckox.statistic.a aVar;
        java.util.Map<java.lang.Long, com.bykv.vk.openvk.preload.geckox.statistic.a> map = f1746a;
        synchronized (map) {
            aVar = map.get(java.lang.Long.valueOf(j));
            if (aVar == null) {
                aVar = new com.bykv.vk.openvk.preload.geckox.statistic.a();
                map.put(java.lang.Long.valueOf(j), aVar);
            }
        }
        return aVar;
    }

    final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(java.lang.String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.b) {
            aVar = this.b.get(str);
            if (aVar == null) {
                aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                this.b.put(str, aVar);
            }
        }
        return aVar;
    }

    final java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        java.util.ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new java.util.ArrayList(this.b.values());
        }
        return arrayList;
    }
}

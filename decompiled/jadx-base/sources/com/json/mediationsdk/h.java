package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public class h {
    public static final int c = -1;
    public static final int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.ironsource.mediationsdk.h.a>> f2976a = new java.util.concurrent.ConcurrentHashMap<>();
    private int b;

    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public h(java.util.List<com.json.mediationsdk.model.NetworkSettings> list, int i) {
        this.b = i;
        for (com.json.mediationsdk.model.NetworkSettings networkSettings : list) {
            this.f2976a.put(networkSettings.getProviderName(), new java.util.ArrayList<>());
        }
    }

    public java.lang.String a(java.lang.String str) {
        java.util.ArrayList<com.ironsource.mediationsdk.h.a> arrayList = this.f2976a.get(str);
        java.lang.String string = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator<com.ironsource.mediationsdk.h.a> it = arrayList.iterator();
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("").append(it.next().ordinal());
            while (true) {
                string = sbAppend.toString();
                if (!it.hasNext()) {
                    break;
                }
                sbAppend = new java.lang.StringBuilder().append(string + ",").append(it.next().ordinal());
            }
        }
        return string;
    }

    public void a(java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h.a> concurrentHashMap) {
        if (this.b == 0) {
            return;
        }
        for (java.lang.String str : this.f2976a.keySet()) {
            com.ironsource.mediationsdk.h.a aVar = com.ironsource.mediationsdk.h.a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            java.util.ArrayList<com.ironsource.mediationsdk.h.a> arrayList = this.f2976a.get(str);
            if (this.b != -1 && arrayList.size() == this.b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}

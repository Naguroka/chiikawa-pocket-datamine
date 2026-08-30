package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> f2991a;
    protected com.json.r b;
    protected com.json.mediationsdk.IronSourceSegment c;
    protected com.json.mediationsdk.adunit.adapter.utility.AdInfo d;

    public m(java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> hashSet, com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        new java.util.HashSet();
        this.f2991a = hashSet;
        this.b = new com.json.r();
        this.c = ironSourceSegment;
    }

    protected void a(com.json.j5 j5Var, java.lang.String str) {
        java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> hashSet;
        if (j5Var == null) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionDataA = j5Var.a(str);
        if (impressionDataA != null) {
            synchronized (this) {
                hashSet = (java.util.HashSet) this.f2991a.clone();
            }
            for (com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener : hashSet) {
                com.json.mediationsdk.logger.IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + impressionDataA);
                impressionDataListener.onImpressionSuccess(impressionDataA);
            }
        }
    }

    protected void a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, false);
    }

    public void a(com.json.mediationsdk.IronSourceSegment ironSourceSegment) {
        this.c = ironSourceSegment;
    }

    public void a(com.json.mediationsdk.impressionData.ImpressionData impressionData, com.json.wl wlVar) {
        if (impressionData != null) {
            this.d = new com.json.mediationsdk.adunit.adapter.utility.AdInfo(impressionData, wlVar);
        }
    }

    public void a(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f2991a.remove(impressionDataListener);
        }
    }

    protected void a(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, jSONObject != null ? jSONObject.optBoolean(com.json.mediationsdk.d.f, false) : false);
    }

    public void b(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f2991a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f2991a.clear();
        }
    }

    protected java.lang.String e() {
        return "fallback_" + java.lang.System.currentTimeMillis();
    }

    public void f() {
        this.d = null;
    }
}

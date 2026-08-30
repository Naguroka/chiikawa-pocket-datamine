package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.b2 f2542a;

    public bv(com.json.b2 b2Var) {
        this.f2542a = b2Var;
    }

    private java.lang.String a(long j, long j2, long j3) {
        return "interval: " + j + ", remainingTime: " + j2 + ", timePassed: " + j3;
    }

    public void a() {
        this.f2542a.a(com.json.y1.TROUBLESHOOT_DISPOSE, null);
    }

    public void a(int i, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, map);
    }

    public void a(int i, java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        map.put("reason", str);
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str2);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_NOTIFICATION_ERROR, map);
    }

    public void a(long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        this.f2542a.a(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, map);
    }

    public void a(com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(levelPlayAdError.getErrorCode()));
        map.put("reason", levelPlayAdError.getErrorMessage());
        this.f2542a.a(com.json.y1.TROUBLESHOOT_SHOW_FAILED, map);
    }

    public void a(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo2) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.format(java.util.Locale.ENGLISH, "oldInstanceName=%s;oldRevenue=%.3f;oldPrecision=%s;newInstanceName=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getInstanceName(), java.lang.Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getInstanceName(), java.lang.Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), java.lang.Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f2542a.a(com.json.y1.TROUBLESHOOT_AD_INFO_CHANGED, map);
    }

    public void a(java.lang.Long l) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", l);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_LOAD_WHILE_LOADED, map);
    }

    public void a(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(java.lang.String str, long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, (str.isEmpty() ? "" : "provider=" + str + ";") + "expirationDuration=" + j);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_AD_EXPIRED, map);
    }

    public void a(java.lang.String str, long j, long j2, long j3) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, a(j, j2, j3));
        this.f2542a.a(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, map);
    }

    public void a(boolean z, long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        map.put("duration", java.lang.Long.valueOf(j));
        this.f2542a.a(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, map);
    }

    public void b() {
        this.f2542a.a(com.json.y1.TROUBLESHOOT_LOAD, null);
    }

    public void b(int i, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_LOAD_FAILED, map);
    }

    public void b(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_IMPRESSION_TIMEOUT, map);
    }

    public void b(java.lang.String str, long j, long j2, long j3) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, a(j, j2, j3));
        this.f2542a.a(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, map);
    }

    public void c() {
        this.f2542a.a(com.json.y1.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void c(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, map);
    }

    public void d() {
        this.f2542a.a(com.json.y1.TROUBLESHOOT_SHOW, null);
    }

    public void d(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, map);
    }

    public void e() {
        this.f2542a.a(com.json.y1.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void e(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, map);
    }

    public void f(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_ILLEGAL_STATE, map);
    }

    public void g(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_INTERNAL_ERROR, map);
    }

    public void h(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, map);
    }

    public void i(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, map);
    }

    public void j(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, map);
    }

    public void k(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_CLOSED, map);
    }

    public void l(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, map);
    }

    public void m(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, map);
    }

    public void n(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, map);
    }

    public void o(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, map);
    }

    public void p(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_OPENED, map);
    }

    public void q(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, map);
    }

    public void r(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, map);
    }

    public void s(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, map);
    }

    public void t(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, map);
    }

    public void u(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("reason", str);
        this.f2542a.a(com.json.y1.TROUBLESHOOT_WATERFALL_OVERHEAD, map);
    }
}

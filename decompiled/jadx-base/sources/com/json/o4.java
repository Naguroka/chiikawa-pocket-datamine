package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.b2 f3110a;

    public o4(com.json.b2 b2Var) {
        this.f3110a = b2Var;
    }

    java.lang.String a(int i, int i2, int i3, int i4) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("interstitial=");
        sb.append(i).append(";rewarded=").append(i2).append(";banner=").append(i3).append(";native=").append(i4);
        return sb.toString();
    }

    public void a() {
        this.f3110a.a(com.json.y1.AUCTION_REQUEST, null);
    }

    public void a(int i, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f3110a.a(com.json.y1.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j, int i, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f3110a.a(com.json.y1.AUCTION_FAILED, map);
    }

    public void a(long j, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        this.f3110a.a(com.json.y1.AUCTION_SUCCESS, map);
    }

    public void a(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("auctionId", str);
        this.f3110a.a(com.json.y1.AD_FORMAT_CAPPED, map);
    }

    public void b(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        this.f3110a.a(com.json.y1.AUCTION_REQUEST_WATERFALL, map);
    }

    public void c(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str);
        this.f3110a.a(com.json.y1.AUCTION_RESULT_WATERFALL, map);
    }
}

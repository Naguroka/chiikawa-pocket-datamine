package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.b2 f3505a;

    public vl(com.json.b2 b2Var) {
        this.f3505a = b2Var;
    }

    public void a() {
        this.f3505a.a(com.json.y1.RELOAD_AD, new java.util.HashMap());
    }

    public void a(int i) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("sessionDepth", java.lang.Integer.valueOf(i));
        this.f3505a.a(com.json.y1.DESTROY_AD, map);
    }

    public void a(long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        this.f3505a.a(com.json.y1.RELOAD_AD_SUCCESS, map);
    }

    public void a(long j, int i) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        this.f3505a.a(com.json.y1.LOAD_AD_NO_FILL, map);
    }

    public void a(long j, int i, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f3505a.a(com.json.y1.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j, int i, java.lang.String str, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        this.f3505a.a(com.json.y1.LOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j, int i, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        if (z) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        this.f3505a.a(com.json.y1.LOAD_AD_FAILED, map);
    }

    public void a(long j, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        if (z) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        this.f3505a.a(com.json.y1.LOAD_AD_SUCCESS, map);
    }

    public void a(java.lang.Boolean bool, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f3505a.a(bool.booleanValue() ? com.json.y1.AD_READY_TRUE : com.json.y1.AD_READY_FALSE, map);
    }

    public void a(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        if (z) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PUBLISHER_LOAD, java.lang.Boolean.TRUE);
        }
        this.f3505a.a(com.json.y1.LOAD_AD, map);
    }

    public void a(boolean z, long j, boolean z2) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        if (z2) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        this.f3505a.a(z ? com.json.y1.AD_AVAILABILITY_CHANGED_TRUE : com.json.y1.AD_AVAILABILITY_CHANGED_FALSE, map);
    }

    public void b(int i) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        this.f3505a.a(com.json.y1.SKIP_RELOAD_AD, map);
    }

    public void b(long j, int i) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        this.f3505a.a(com.json.y1.RELOAD_AD_NO_FILL, map);
    }
}

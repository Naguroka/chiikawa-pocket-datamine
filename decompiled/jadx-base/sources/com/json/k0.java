package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.b2 f2834a;

    public k0(com.json.b2 b2Var) {
        this.f2834a = b2Var;
    }

    public void a() {
        this.f2834a.a(com.json.y1.SESSION_CAPPED, null);
    }

    public void a(android.app.Activity activity, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (activity != null) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, com.json.mediationsdk.utils.IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f2834a.a(com.json.y1.SHOW_AD, map);
    }

    public void a(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f2834a.a(com.json.y1.AD_CLICKED, map);
    }

    public void a(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        map.put("reason", str2);
        if (!android.text.TextUtils.isEmpty(str3)) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str3);
        }
        this.f2834a.a(com.json.y1.SHOW_AD_FAILED, map);
    }

    public void a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f2834a.a(com.json.y1.AD_CLOSED, map);
    }

    public void a(java.lang.String str, java.lang.String str2, int i, long j, java.lang.String str3, long j2, java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str4) {
        java.util.HashMap map2 = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map2.put("placement", str);
        }
        map2.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, str2);
        map2.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(i));
        map2.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            map2.put("duration", java.lang.Long.valueOf(j2));
        }
        if (map != null) {
            map2.putAll(map);
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            map2.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f2834a.a(com.json.y1.AD_REWARDED, map2, j);
    }

    public void a(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("isMultipleAdUnits", 1);
        map.put("placement", str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, z ? com.json.mediationsdk.metadata.a.g : "false");
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f2834a.a(com.json.y1.CHECK_PLACEMENT_CAPPED, map);
    }

    public void a(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("status", z ? com.json.mediationsdk.metadata.a.g : "false");
        this.f2834a.a(com.json.y1.SHOW_AD_CHANCE, map);
    }

    public void b(java.lang.String str) {
        a(str, (java.lang.String) null);
    }

    public void b(java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("placement", str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            map.put("reason", str2);
        }
        this.f2834a.a(com.json.y1.PLACEMENT_CAPPED, map);
    }

    public void c(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("placement", str);
        this.f2834a.a(com.json.y1.AD_DISMISS_SCREEN, map);
    }

    public void d(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f2834a.a(com.json.y1.AD_ENDED, map);
    }

    public void e(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f2834a.a(com.json.y1.AD_INFO_CHANGED, map);
    }

    public void f(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("placement", str);
        this.f2834a.a(com.json.y1.AD_LEFT_APPLICATION, map);
    }

    public void g(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f2834a.a(com.json.y1.AD_OPENED, map);
    }

    public void h(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("placement", str);
        this.f2834a.a(com.json.y1.AD_PRESENT_SCREEN, map);
    }

    public void i(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f2834a.a(com.json.y1.AD_STARTED, map);
    }

    public void j(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("placement", str);
        this.f2834a.a(com.json.y1.AD_VIEW_BOUND, map);
    }

    public void k(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f2834a.a(com.json.y1.AD_VISIBLE, map);
    }

    public void l(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("placement", str);
        }
        this.f2834a.a(com.json.y1.SHOW_AD_SUCCESS, map);
    }
}

package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.b2 f2657a;

    public fi(com.json.b2 b2Var) {
        this.f2657a = b2Var;
    }

    public void a() {
        this.f2657a.a(com.json.y1.INIT_SUCCESS, null);
    }

    public void a(int i, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, java.lang.Integer.valueOf(i));
        map.put("reason", str);
        this.f2657a.a(com.json.y1.INIT_FAILED, map);
    }

    public void a(long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        this.f2657a.a(com.json.y1.INIT_ENDED, map);
    }

    public void a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f2657a.a(com.json.y1.INIT_STARTED, map);
    }
}

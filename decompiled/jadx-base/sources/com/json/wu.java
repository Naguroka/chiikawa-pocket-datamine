package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class wu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.b2 f3543a;

    public wu(com.json.b2 b2Var) {
        this.f3543a = b2Var;
    }

    public void a() {
        this.f3543a.a(com.json.y1.COLLECT_TOKEN, new java.util.HashMap());
    }

    public void a(long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("duration", java.lang.Long.valueOf(j));
        this.f3543a.a(com.json.y1.COLLECT_TOKENS_COMPLETED, map);
    }

    public void a(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f3543a.a(com.json.y1.COLLECT_TOKENS_FAILED, map);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.HashMap map2 = new java.util.HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f3543a.a(com.json.y1.INSTANCE_COLLECT_TOKEN, map2);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map, long j) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("duration", java.lang.Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f3543a.a(com.json.y1.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map, long j, java.lang.String str) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("duration", java.lang.Long.valueOf(j));
        if (!android.text.TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f3543a.a(com.json.y1.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }

    public void b(java.util.Map<java.lang.String, java.lang.Object> map, long j) {
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("duration", java.lang.Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f3543a.a(com.json.y1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }
}

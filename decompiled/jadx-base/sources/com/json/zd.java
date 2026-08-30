package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class zd {
    public static final java.lang.String b = "userId";
    public static final java.lang.String c = "appKey";
    private static com.json.zd d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f3612a = new org.json.JSONObject();

    private zd() {
    }

    public static synchronized com.json.zd a() {
        if (d == null) {
            d = new com.json.zd();
        }
        return d;
    }

    public synchronized java.lang.String a(java.lang.String str) {
        return this.f3612a.optString(str);
    }

    public synchronized void a(java.lang.String str, java.lang.Object obj) {
        try {
            this.f3612a.put(str, obj);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
        }
    }

    public synchronized void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized org.json.JSONObject b() {
        return this.f3612a;
    }
}

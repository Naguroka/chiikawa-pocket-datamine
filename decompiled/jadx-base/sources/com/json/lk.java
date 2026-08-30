package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class lk {
    private static com.json.lk c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> f2892a = new java.util.HashSet<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> b = new java.util.concurrent.ConcurrentHashMap<>();

    lk() {
    }

    public static synchronized com.json.lk b() {
        if (c == null) {
            c = new com.json.lk();
        }
        return c;
    }

    public java.util.HashSet<com.json.mediationsdk.impressionData.ImpressionDataListener> a() {
        return this.f2892a;
    }

    public void a(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f2892a.add(impressionDataListener);
        }
    }

    public void a(java.lang.String str, java.util.List<java.lang.String> list) {
        this.b.put(str, list);
    }

    public void b(com.json.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f2892a.remove(impressionDataListener);
        }
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.f2892a.clear();
        }
    }
}

package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class sa {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3268a;
    private java.lang.String b;
    private int c;
    private java.util.Map<java.lang.String, java.lang.String> d;
    private int e;
    private boolean f;
    private com.json.mj g;

    public sa(com.json.mj mjVar) {
        this(mjVar.e(), mjVar.g(), mjVar.a(), mjVar.b());
        this.g = mjVar;
    }

    public sa(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, com.json.eo eoVar) {
        this.c = -1;
        this.b = str;
        this.f3268a = str2;
        this.d = map;
        this.e = 0;
        this.f = false;
        this.g = null;
    }

    public void a() {
        java.util.Map<java.lang.String, java.lang.String> map = this.d;
        if (map != null) {
            map.clear();
        }
        this.d = null;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean a(int i2) {
        return this.c == i2;
    }

    public java.util.Map<java.lang.String, java.lang.String> b() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("demandSourceId", this.b);
        map.put("demandSourceName", this.f3268a);
        java.util.Map<java.lang.String, java.lang.String> map2 = this.d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public synchronized void b(int i2) {
        this.e = i2;
    }

    public com.json.mj c() {
        return this.g;
    }

    public void c(int i2) {
        this.c = i2;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    public java.lang.String f() {
        return this.f3268a;
    }

    public java.util.Map<java.lang.String, java.lang.String> g() {
        return this.d;
    }

    public java.lang.String h() {
        return this.b;
    }

    public com.json.eo i() {
        if (this.g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.c;
    }

    public boolean k() {
        java.util.Map<java.lang.String, java.lang.String> map = this.d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return java.lang.Boolean.parseBoolean(this.d.get("rewarded"));
    }
}

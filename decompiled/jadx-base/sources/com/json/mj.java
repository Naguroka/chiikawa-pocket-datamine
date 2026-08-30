package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3043a;
    private java.lang.String b;
    private java.lang.String c;
    private boolean d;
    private com.json.og e;
    private java.util.Map<java.lang.String, java.lang.String> f;
    private com.json.eo g;
    private java.lang.String h;
    private boolean i;
    private boolean j;

    mj(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.json.eo eoVar, com.json.og ogVar) {
        this.b = str;
        this.c = str2;
        this.f3043a = z;
        this.d = z2;
        this.f = map;
        this.g = eoVar;
        this.e = ogVar;
        this.i = z3;
        this.j = z4;
        this.h = str3;
    }

    public java.util.Map<java.lang.String, java.lang.String> a() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("instanceId", this.b);
        map.put("instanceName", this.c);
        map.put("rewarded", java.lang.Boolean.toString(this.f3043a));
        map.put("inAppBidding", java.lang.Boolean.toString(this.d));
        map.put("isOneFlow", java.lang.Boolean.toString(this.i));
        map.put(com.json.y8.r, java.lang.String.valueOf(2));
        com.json.og ogVar = this.e;
        map.put("width", ogVar != null ? java.lang.Integer.toString(ogVar.c()) : "0");
        com.json.og ogVar2 = this.e;
        map.put("height", ogVar2 != null ? java.lang.Integer.toString(ogVar2.a()) : "0");
        com.json.og ogVar3 = this.e;
        map.put("label", ogVar3 != null ? ogVar3.b() : "");
        map.put(com.json.y8.v, java.lang.Boolean.toString(i()));
        if (this.j) {
            map.put("isMultipleAdObjects", com.json.mediationsdk.metadata.a.g);
        }
        java.lang.String str = this.h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = this.f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void a(com.json.eo eoVar) {
        this.g = eoVar;
    }

    public void a(java.lang.String str) {
        this.h = str;
    }

    public final com.json.eo b() {
        return this.g;
    }

    public java.lang.String c() {
        return this.h;
    }

    public java.util.Map<java.lang.String, java.lang.String> d() {
        return this.f;
    }

    public java.lang.String e() {
        return this.b;
    }

    public java.lang.String f() {
        return this.c.replaceAll("IronSource_", "");
    }

    public java.lang.String g() {
        return this.c;
    }

    public com.json.og h() {
        return this.e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.f3043a;
    }
}

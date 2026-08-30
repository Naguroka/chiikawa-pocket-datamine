package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class lv {
    private int b = 4;
    private int c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.Boolean> f2903a = new com.ironsource.lv.a();

    class a extends java.util.HashMap<java.lang.String, java.lang.Boolean> {
        a() {
            put(com.json.pg.k, java.lang.Boolean.valueOf(com.json.lv.this.b == 0));
            put(com.json.pg.l, java.lang.Boolean.valueOf(com.json.lv.this.c == 0));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            put(com.json.pg.m, bool);
            put(com.json.pg.n, bool);
        }
    }

    lv() {
    }

    public org.json.JSONObject a() {
        return new org.json.JSONObject(this.f2903a);
    }

    void a(java.lang.String str, int i, boolean z) {
        if (this.f2903a.containsKey(str)) {
            this.f2903a.put(str, java.lang.Boolean.valueOf(i == 0));
        }
        this.f2903a.put(com.json.pg.m, java.lang.Boolean.valueOf(z));
        this.f2903a.put(com.json.pg.n, java.lang.Boolean.valueOf((this.f2903a.get(com.json.pg.l).booleanValue() || this.f2903a.get(com.json.pg.k).booleanValue()) && this.f2903a.get(com.json.pg.m).booleanValue()));
    }
}

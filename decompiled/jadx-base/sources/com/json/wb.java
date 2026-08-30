package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class wb {
    static final java.lang.String e = "euid";
    static final java.lang.String f = "esat";
    static final java.lang.String g = "esfr";
    static final int h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3531a;
    private long b;
    private int c;
    private final org.json.JSONObject d;

    public wb(int i, long j, java.lang.String str) throws org.json.JSONException {
        this(i, j, new org.json.JSONObject(str));
    }

    public wb(int i, long j, org.json.JSONObject jSONObject) {
        this.c = 1;
        this.f3531a = i;
        this.b = j;
        jSONObject = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        this.d = jSONObject;
        if (!jSONObject.has(e)) {
            a(e, java.util.UUID.randomUUID().toString());
        }
        if (jSONObject.has(f)) {
            this.c = jSONObject.optInt(f, 1);
        } else {
            a(f, java.lang.Integer.valueOf(this.c));
        }
    }

    public wb(int i, org.json.JSONObject jSONObject) {
        this(i, new com.ironsource.n9.a().a(), jSONObject);
    }

    public java.lang.String a() {
        return this.d.toString();
    }

    public void a(int i) {
        this.f3531a = i;
    }

    public void a(java.lang.String str) {
        a(g, str);
        int i = this.c + 1;
        this.c = i;
        a(f, java.lang.Integer.valueOf(i));
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    public org.json.JSONObject b() {
        return this.d;
    }

    public int c() {
        return this.f3531a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.json.wb wbVar = (com.json.wb) obj;
        return this.f3531a == wbVar.f3531a && this.b == wbVar.b && this.c == wbVar.c && com.json.C1526sk.a(this.d, wbVar.d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f3531a) * 31) + java.lang.Long.hashCode(this.b)) * 31) + this.d.toString().hashCode()) * 31) + this.c;
    }

    public java.lang.String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }
}

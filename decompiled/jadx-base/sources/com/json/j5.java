package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class j5 {
    public static final java.lang.String A = "nurl";
    public static final java.lang.String o = "adMarkup";
    public static final java.lang.String p = "instance";
    public static final java.lang.String q = "adData";
    public static final java.lang.String r = "price";
    public static final java.lang.String s = "serverData";
    public static final java.lang.String t = "loadTimeout";
    public static final java.lang.String u = "order";
    public static final java.lang.String v = "show";
    public static final java.lang.String w = "price";
    public static final java.lang.String x = "notifications";
    public static final java.lang.String y = "burl";
    public static final java.lang.String z = "lurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2807a;
    private java.lang.String b;
    private org.json.JSONObject c;
    private java.lang.String d;
    private java.lang.Integer e;
    private int f;
    private int g;
    private int h;
    private final java.util.List<java.lang.String> i;
    private final java.util.List<java.lang.String> j;
    private final java.util.List<java.lang.String> k;
    private com.json.mediationsdk.impressionData.ImpressionData l;
    private com.json.wl m;
    private boolean n;

    public j5(java.lang.String str) {
        this.f2807a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = new java.util.ArrayList();
        this.j = new java.util.ArrayList();
        this.k = new java.util.ArrayList();
        this.l = null;
        this.m = null;
        this.n = true;
        this.f2807a = str;
    }

    public j5(org.json.JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0082 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0043, B:5:0x0049, B:6:0x004f, B:8:0x0055, B:12:0x0068, B:13:0x006a, B:15:0x0082, B:16:0x0095, B:18:0x00b3, B:20:0x00bd, B:22:0x00c5, B:23:0x00d4, B:9:0x005a, B:11:0x0060), top: B:28:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b3 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0043, B:5:0x0049, B:6:0x004f, B:8:0x0055, B:12:0x0068, B:13:0x006a, B:15:0x0082, B:16:0x0095, B:18:0x00b3, B:20:0x00bd, B:22:0x00c5, B:23:0x00d4, B:9:0x005a, B:11:0x0060), top: B:28:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c5 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x0043, B:5:0x0049, B:6:0x004f, B:8:0x0055, B:12:0x0068, B:13:0x006a, B:15:0x0082, B:16:0x0095, B:18:0x00b3, B:20:0x00bd, B:22:0x00c5, B:23:0x00d4, B:9:0x005a, B:11:0x0060), top: B:28:0x0043 }] */
    public j5(org.json.JSONObject jSONObject, int i, org.json.JSONObject jSONObject2) {
        com.json.wl wlVarA;
        java.lang.String string;
        this.f2807a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.i = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.j = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.k = arrayList3;
        this.l = null;
        this.m = null;
        this.n = true;
        try {
            if (jSONObject.has(p)) {
                this.f2807a = jSONObject.getString(p);
            }
            if (!jSONObject.has("adMarkup")) {
                string = jSONObject.has(s) ? jSONObject.getJSONObject(s).toString() : string;
                this.c = jSONObject.optJSONObject("adData");
                this.d = jSONObject.optString("price", "0");
                if (jSONObject.has(x)) {
                    org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(x);
                    a(jSONObject3, y, arrayList);
                    a(jSONObject3, z, arrayList2);
                    a(jSONObject3, A, arrayList3);
                }
                this.l = new com.json.mediationsdk.impressionData.ImpressionData(com.json.hk.a(jSONObject2, jSONObject.optJSONObject(com.json.mediationsdk.d.d)));
                if (jSONObject.has(com.json.mediationsdk.d.e)) {
                    wlVarA = com.json.wl.a(jSONObject.getJSONObject(com.json.mediationsdk.d.e));
                } else {
                    wlVarA = null;
                }
                this.m = wlVarA;
                this.e = jSONObject.has(t) ? java.lang.Integer.valueOf((int) java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(t))) : null;
                a(jSONObject.optJSONObject(u), i);
            }
            string = jSONObject.getString("adMarkup");
            this.b = string;
            this.c = jSONObject.optJSONObject("adData");
            this.d = jSONObject.optString("price", "0");
            if (jSONObject.has(x)) {
                org.json.JSONObject jSONObject4 = jSONObject.getJSONObject(x);
                a(jSONObject4, y, arrayList);
                a(jSONObject4, z, arrayList2);
                a(jSONObject4, A, arrayList3);
            }
            this.l = new com.json.mediationsdk.impressionData.ImpressionData(com.json.hk.a(jSONObject2, jSONObject.optJSONObject(com.json.mediationsdk.d.d)));
            if (jSONObject.has(com.json.mediationsdk.d.e)) {
                wlVarA = com.json.wl.a(jSONObject.getJSONObject(com.json.mediationsdk.d.e));
            } else {
                wlVarA = null;
            }
            this.m = wlVarA;
            this.e = jSONObject.has(t) ? java.lang.Integer.valueOf((int) java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(t))) : null;
            a(jSONObject.optJSONObject(u), i);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            this.n = false;
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e.getMessage());
        }
    }

    private void a(org.json.JSONObject jSONObject, int i) {
        this.f = i;
        this.g = i;
        this.h = i;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(v, i);
            this.g = iOptInt;
            this.h = jSONObject.optInt("price", iOptInt);
        }
    }

    private void a(org.json.JSONObject jSONObject, java.lang.String str, java.util.List<java.lang.String> list) throws org.json.JSONException {
        if (jSONObject.has(str)) {
            list.addAll(com.json.hk.b(jSONObject.getJSONArray(str)));
        }
    }

    public com.json.mediationsdk.impressionData.ImpressionData a(java.lang.String str) {
        com.json.mediationsdk.impressionData.ImpressionData impressionData = this.l;
        if (impressionData == null) {
            return null;
        }
        com.json.mediationsdk.impressionData.ImpressionData impressionData2 = new com.json.mediationsdk.impressionData.ImpressionData(impressionData);
        impressionData2.replaceMacroForPlacementWithValue(com.json.mediationsdk.d.r, str);
        return impressionData2;
    }

    public org.json.JSONObject a() {
        return this.c;
    }

    public java.util.List<java.lang.String> b() {
        return this.i;
    }

    public java.lang.String c() {
        return this.f2807a;
    }

    public com.json.wl d() {
        return this.m;
    }

    public int e() {
        return this.f;
    }

    public java.lang.Integer f() {
        return this.e;
    }

    public java.util.List<java.lang.String> g() {
        return this.j;
    }

    public java.util.List<java.lang.String> h() {
        return this.k;
    }

    public java.lang.String i() {
        return this.d;
    }

    public int j() {
        return this.h;
    }

    public java.lang.String k() {
        return this.b;
    }

    public int l() {
        return this.g;
    }

    public boolean m() {
        return this.n;
    }
}

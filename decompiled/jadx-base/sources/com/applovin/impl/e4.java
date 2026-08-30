package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f745a = {7, 4, 2, 1, 11};
    private static final int[] b = {5, 6, 12, 10, 3, 9, 8, 14};
    private static final int[] c = {15, 13};
    private static final int[] d = {20};

    public static java.lang.String g(com.applovin.impl.sdk.j jVar) {
        android.net.NetworkInfo networkInfoB = b(com.applovin.impl.sdk.j.m());
        if (networkInfoB == null) {
            return "unknown";
        }
        int type = networkInfoB.getType();
        int subtype = networkInfoB.getSubtype();
        if (type == 1) {
            return com.json.u8.b;
        }
        if (type != 0) {
            return "unknown";
        }
        if (a(subtype, f745a)) {
            return "2g";
        }
        if (a(subtype, b)) {
            return com.json.u8.f3464a;
        }
        if (a(subtype, c)) {
            return "4g";
        }
        return a(subtype, d) ? "5g" : "mobile";
    }

    public static java.lang.String b(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        return a((java.lang.String) jVar.a(com.applovin.impl.sj.t0), str, jVar);
    }

    public static java.lang.String a(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        return a((java.lang.String) jVar.a(com.applovin.impl.sj.u0), str, jVar);
    }

    public static java.util.Map c(com.applovin.impl.sdk.j jVar) {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String str = (java.lang.String) jVar.a(com.applovin.impl.sj.k);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((java.lang.Boolean) jVar.a(com.applovin.impl.sj.a5)).booleanValue()) {
            map.put("api_key", jVar.a0());
        }
        map.putAll(com.applovin.impl.yp.a(jVar.x().e()));
        return map;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        if (str == null || str.length() < 4) {
            throw new java.lang.IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("No endpoint specified");
        }
        if (jVar != null) {
            return str + str2;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified");
    }

    public static void c(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            throw new java.lang.IllegalArgumentException("No response specified");
        }
        if (jVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    com.applovin.impl.tj tjVarG0 = jVar.g0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    tjVarG0.a(jSONObject.getJSONObject("settings"));
                    tjVarG0.e();
                    return;
                }
                return;
            } catch (org.json.JSONException e) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("ConnectionUtils", "Unable to parse settings out of API response", e);
                    return;
                }
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("No sdk specified");
    }

    public static java.lang.String e(com.applovin.impl.sdk.j jVar) {
        return a((java.lang.String) jVar.a(com.applovin.impl.sj.r0), "4.0/ad", jVar);
    }

    public static java.lang.String d(com.applovin.impl.sdk.j jVar) {
        return a((java.lang.String) jVar.a(com.applovin.impl.sj.s0), "4.0/ad", jVar);
    }

    public static java.lang.Long f(com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.d4.d dVarA = jVar.t().a();
        if (dVarA == null) {
            return null;
        }
        double dC = com.applovin.impl.yp.c(dVarA.b());
        double d2 = com.applovin.impl.yp.d(dVarA.a());
        if (d2 == 0.0d) {
            return null;
        }
        return java.lang.Long.valueOf((long) (dC / d2));
    }

    public static java.lang.String b(com.applovin.impl.sdk.j jVar) {
        return a((java.lang.String) jVar.a(com.applovin.impl.sj.r0), ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.j3)).booleanValue() ? "5.0/ad" : "4.0/ad", jVar);
    }

    public static java.lang.String a(com.applovin.impl.sdk.j jVar) {
        return a((java.lang.String) jVar.a(com.applovin.impl.sj.s0), ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.j3)).booleanValue() ? "5.0/ad" : "4.0/ad", jVar);
    }

    private static android.net.NetworkInfo b(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void a(int i, com.applovin.impl.sdk.j jVar) {
        if (i == 401) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "SDK key \"" + jVar.a0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i == 418) {
            jVar.g0().a(com.applovin.impl.sj.f, java.lang.Boolean.TRUE);
            jVar.g0().e();
        } else if (i >= 400 && i < 500) {
            if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.h)).booleanValue()) {
                jVar.Q0();
            }
        } else if (i == -1 && ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.h)).booleanValue()) {
            jVar.Q0();
        }
    }

    public static void b(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "persisted_data", null);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
            jVar.b(com.applovin.impl.uj.H, string);
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(android.content.Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        android.net.NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    public static byte[] a(java.io.InputStream inputStream, com.applovin.impl.sdk.j jVar) throws java.io.IOException {
        if (inputStream == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[((java.lang.Integer) jVar.a(com.applovin.impl.sj.c3)).intValue()];
        while (true) {
            int i = inputStream.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void a(org.json.JSONObject jSONObject, boolean z, com.applovin.impl.sdk.j jVar) {
        jVar.q().a(jSONObject, z);
    }

    public static void a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "filesystem_values", (org.json.JSONObject) null);
        if (jSONObject2 != null) {
            android.content.SharedPreferences.Editor editorEdit = android.preference.PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.j.m()).edit();
            java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object object = com.applovin.impl.sdk.utils.JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    com.applovin.impl.vj.a(next, object, (android.content.SharedPreferences) null, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }
}

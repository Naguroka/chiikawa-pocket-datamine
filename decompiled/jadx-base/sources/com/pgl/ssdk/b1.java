package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3779a = 504;
    static boolean b = false;
    public static java.lang.String c = null;
    public static java.lang.String d = "";
    private static long e;
    private static android.content.Context f;

    public static void a(android.content.Context context, java.lang.String str) {
        a(context, str, null);
    }

    public static synchronized java.lang.String b() {
        if (android.text.TextUtils.isEmpty(d)) {
            d = (java.lang.String) com.pgl.ssdk.ces.a.meta(303, f, null);
        }
        return d;
    }

    public static void c() {
        android.content.Context context = f;
        if (context != null) {
            f3779a = 102;
            com.pgl.ssdk.o0.b(new com.pgl.ssdk.c1(context, null));
            com.pgl.ssdk.ces.b.h().a();
            com.pgl.ssdk.x.a();
        }
    }

    public static void a(android.content.Context context, java.lang.String str, com.pgl.ssdk.d1 d1Var) {
        if (f == null) {
            f = context;
        }
        int i = f3779a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        e = java.lang.System.currentTimeMillis();
        b = false;
        c = str;
        f3779a = 102;
        com.pgl.ssdk.o0.b(new com.pgl.ssdk.c1(context, d1Var));
    }

    public static synchronized java.lang.Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f, bArr);
    }

    public static java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.json.ce.y, com.json.y8.d);
            jSONObject.put("version", "6.4.0.0.overseas-rc.5");
            java.lang.String str = d;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", d);
            } else {
                try {
                    jSONObject.put("token_id", b());
                } catch (java.lang.Throwable unused) {
                    jSONObject.put("token_id", "");
                }
            }
            jSONObject.put("code", f3779a);
            return android.util.Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (java.lang.Throwable unused2) {
            com.pgl.ssdk.r0.a("getGrilock Error");
            return "";
        }
    }
}

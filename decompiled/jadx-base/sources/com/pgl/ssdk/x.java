package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static android.content.Context f3817a;

    static class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.pgl.ssdk.y.c(com.pgl.ssdk.x.b());
            com.pgl.ssdk.ces.a.meta(226, com.pgl.ssdk.x.b(), null);
        }
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    private static java.lang.String a(java.lang.Throwable th) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("status", 3);
            jSONObject.put("exception", th.toString());
            jSONObject.put("stacktrace", java.util.Arrays.toString(th.getStackTrace()));
            jSONObject.put("cause", java.lang.String.valueOf(th.getCause()));
            return android.util.Base64.encodeToString(jSONObject.toString().getBytes(com.adjust.sdk.Constants.ENCODING), 0);
        } catch (java.lang.Throwable unused) {
            return "eyJzdGF0dXMiOjN9";
        }
    }

    public static android.content.Context b() {
        return f3817a;
    }

    public static void c(android.content.Context context) {
        f3817a = context;
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static java.lang.String b(android.content.Context context) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", 0);
            jSONObject.put("envcode", ((java.lang.Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", com.pgl.ssdk.u.a(context));
            jSONObject.put("usb_debug", com.pgl.ssdk.u.d(context));
            org.json.JSONArray[] jSONArrayArrC = com.pgl.ssdk.u.c(context);
            if (jSONArrayArrC != null) {
                jSONObject.put("sdata", jSONArrayArrC[0]);
                jSONObject.put("sdmta", jSONArrayArrC[1]);
                jSONObject.put("curtime", java.lang.System.currentTimeMillis() / 1000);
            }
            jSONObject.put("camera_count", com.pgl.ssdk.v.a());
            jSONObject.put("sim", com.pgl.ssdk.v.c(context));
            jSONObject.put("virtual_display", com.pgl.ssdk.y.b(context));
            jSONObject.put("acbs", com.pgl.ssdk.s.b(context));
            jSONObject.put("bl_unlock", com.pgl.ssdk.u.b(context));
            com.pgl.ssdk.w.g();
            com.pgl.ssdk.w.a(jSONObject);
            java.lang.String strE = com.pgl.ssdk.t.e();
            jSONObject.put("romtype", com.pgl.ssdk.u.c());
            jSONObject.put("root", com.pgl.ssdk.u.e());
            if (!android.text.TextUtils.isEmpty(strE)) {
                jSONObject.put("sign", strE);
            }
            return (java.lang.String) com.pgl.ssdk.ces.a.meta(227, context, jSONObject.toString());
        } catch (java.lang.Throwable th) {
            return a(th);
        }
    }

    public static java.lang.String c() {
        java.lang.String strB = b(b());
        a();
        return strB;
    }

    public static long a(android.content.Context context) {
        try {
            return ((java.lang.Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    @com.pgl.ssdk.ces.out.DungeonFlag
    public static void a() {
        com.pgl.ssdk.o0.b(new com.pgl.ssdk.x.a());
    }
}

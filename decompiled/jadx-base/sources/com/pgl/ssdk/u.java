package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f3810a;
    private static long[][] b;
    private static java.lang.String c;

    static class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.text.TextUtils.isEmpty(com.pgl.ssdk.u.c)) {
                java.lang.String unused = com.pgl.ssdk.u.c = com.pgl.ssdk.u.d();
                com.pgl.ssdk.u0.b(com.pgl.ssdk.x.b(), "romtype", com.pgl.ssdk.u.c);
            }
        }
    }

    public static org.json.JSONArray[] c(android.content.Context context) {
        if (b == null) {
            b = (long[][]) com.pgl.ssdk.ces.a.meta(157, context, null);
        }
        long[][] jArr = b;
        if (jArr == null || jArr.length != 2) {
            b = null;
            return null;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        long[][] jArr2 = b;
        long[] jArr3 = jArr2[0];
        long[] jArr4 = jArr2[1];
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jArr3.length; i++) {
            try {
                jSONArray.put(i, jCurrentTimeMillis - jArr3[i]);
                jSONArray2.put(i, jCurrentTimeMillis - jArr4[i]);
            } catch (org.json.JSONException unused) {
            }
        }
        return new org.json.JSONArray[]{jSONArray, jSONArray2};
    }

    public static boolean d(android.content.Context context) {
        java.lang.Object objMeta = com.pgl.ssdk.ces.a.meta(155, context, null);
        if (objMeta instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) objMeta).booleanValue();
        }
        return false;
    }

    public static int e() {
        return ((java.lang.Integer) com.pgl.ssdk.ces.a.meta(org.objectweb.asm.Opcodes.IF_ICMPGE, null, null)).intValue();
    }

    public static boolean b(android.content.Context context) {
        java.lang.Object objMeta = com.pgl.ssdk.ces.a.meta(156, context, null);
        if (objMeta instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) objMeta).booleanValue();
        }
        return false;
    }

    public static java.lang.String a(android.content.Context context) {
        java.lang.String str = f3810a;
        if (str != null) {
            return str;
        }
        java.lang.String string = android.provider.Settings.Global.getString(context.getContentResolver(), "boot_count");
        f3810a = string;
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String d() {
        if (b("com.samsung.android.knox.SemPersonaManager") || b("com.samsung.android.knoxguard.KnoxGuardManager")) {
            return com.adjust.sdk.Constants.REFERRER_API_SAMSUNG;
        }
        if (b("androidhnext.Manifest") || b("androidhnext.R")) {
            return "honor";
        }
        if (b("androidhwext.Manifest") || b("androidhwext.R")) {
            return "huawei";
        }
        if (b("oppo.Manifest") || b("oppo.R") || b("oplus.Manifest") || b("oplus.R") || b("com.oneplus.Manifest") || b("com.oneplus.R")) {
            return "oppo";
        }
        if (b("vivo.Manifest") || b("vivo.R")) {
            return com.adjust.sdk.Constants.REFERRER_API_VIVO;
        }
        if (b("miui.Manifest") || b("miui.R") || b("miui.os.Build")) {
            return com.adjust.sdk.Constants.REFERRER_API_XIAOMI;
        }
        if (b("lineageos.platform.Manifest") || b("lineageos.platform.R")) {
            return "lineage";
        }
        if (c("/system/framework/com.motorola.motosignature.jar")) {
            return "moto";
        }
        return (c("/system/framework/transsion-framework.jar") || c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }

    private static boolean b(java.lang.String str) {
        try {
            java.lang.Class.forName(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static boolean c(java.lang.String str) {
        try {
            return new java.io.File(str).exists();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static java.lang.String c() {
        if (!android.text.TextUtils.isEmpty(c)) {
            return c;
        }
        java.lang.String strA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b(), "romtype", (java.lang.String) null);
        c = strA;
        if (!android.text.TextUtils.isEmpty(strA)) {
            return c;
        }
        com.pgl.ssdk.o0.b(new com.pgl.ssdk.u.a());
        return "";
    }
}

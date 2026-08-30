package com.apm.insight.l;

/* JADX INFO: compiled from: RomUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.CharSequence f451a = "amigo";
    private static final java.lang.CharSequence b = "funtouch";

    public static java.lang.String a() {
        if (com.apm.insight.l.d.b()) {
            return com.apm.insight.l.d.b() ? "miui_" + a("ro.miui.ui.version.name") + "_" + android.os.Build.VERSION.INCREMENTAL : "";
        }
        if (!com.apm.insight.l.d.c()) {
            if (b()) {
                return b() ? "coloros_" + a("ro.build.version.opporom") + "_" + android.os.Build.DISPLAY : "";
            }
            java.lang.String strA = com.apm.insight.l.d.a();
            java.lang.String str = (strA == null || !strA.toLowerCase(java.util.Locale.getDefault()).contains("emotionui")) ? "" : strA + "_" + android.os.Build.DISPLAY;
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
            java.lang.String strA2 = a("ro.vivo.os.build.display.id");
            boolean z = false;
            if (!android.text.TextUtils.isEmpty(strA2) && strA2.toLowerCase(java.util.Locale.getDefault()).contains(b)) {
                return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
            }
            if (!android.text.TextUtils.isEmpty(android.os.Build.DISPLAY) && android.os.Build.DISPLAY.toLowerCase(java.util.Locale.getDefault()).contains(f451a)) {
                return android.os.Build.DISPLAY + "_" + a("ro.gn.sv.version");
            }
            java.lang.String str2 = android.os.Build.MANUFACTURER + android.os.Build.BRAND;
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.getDefault());
                if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                    z = true;
                }
            }
            if (z) {
                return a("ro.build.uiversion") + "_" + android.os.Build.DISPLAY;
            }
            java.lang.String str3 = android.text.TextUtils.isEmpty(a("ro.letv.release.version")) ^ true ? "eui_" + a("ro.letv.release.version") + "_" + android.os.Build.DISPLAY : "";
            return !android.text.TextUtils.isEmpty(str3) ? str3 : android.os.Build.DISPLAY;
        }
        java.lang.String str4 = android.os.Build.DISPLAY;
        return (str4 == null || !str4.toLowerCase(java.util.Locale.getDefault()).contains("flyme")) ? "" : str4;
    }

    private static boolean b() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(java.util.Locale.getDefault()).contains("oppo");
    }

    private static java.lang.String a(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.lang.String line = "";
        try {
            java.lang.Process processExec = java.lang.Runtime.getRuntime().exec("getprop ".concat(java.lang.String.valueOf(str)));
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                processExec.destroy();
                com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                return line;
            } catch (java.lang.Throwable unused) {
                com.apm.insight.a.a((java.io.Closeable) bufferedReader);
                return line;
            }
        } catch (java.lang.Throwable unused2) {
            bufferedReader = null;
        }
    }
}

package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class JAA {
    public static boolean IL = false;
    public static boolean bg = false;
    private static int ldr = Integer.MAX_VALUE;
    private static java.lang.String zx;
    private static final java.lang.CharSequence bX = "amigo";
    private static final java.lang.CharSequence eqN = "funtouch";
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> iR = new java.util.concurrent.ConcurrentHashMap<>();

    public static java.lang.String bg() {
        if (!android.text.TextUtils.isEmpty(zx)) {
            return zx;
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.core.WR.bg("sdk_local_rom_info", 604800000L);
        zx = strBg;
        if (android.text.TextUtils.isEmpty(strBg)) {
            java.lang.String strTC = tC();
            zx = strTC;
            com.bytedance.sdk.openadsdk.core.WR.bg("sdk_local_rom_info", strTC);
        }
        return zx;
    }

    private static java.lang.String tC() {
        if (Lq()) {
            return vb();
        }
        if (zx()) {
            return PX();
        }
        if (IL()) {
            return xxp();
        }
        if (VzQ()) {
            return tuV();
        }
        java.lang.String strTa = Ta();
        if (!android.text.TextUtils.isEmpty(strTa)) {
            return strTa;
        }
        if (iR()) {
            return ldr();
        }
        if (Kg()) {
            return WR();
        }
        if (eqN()) {
            return bX();
        }
        java.lang.String strEo = eo();
        return !android.text.TextUtils.isEmpty(strEo) ? strEo : android.os.Build.DISPLAY;
    }

    public static boolean IL() {
        return android.os.Build.DISPLAY.contains("Flyme") || android.os.Build.USER.equals("flyme");
    }

    public static java.lang.String bX() {
        return eqN("ro.build.uiversion") + "_" + android.os.Build.DISPLAY;
    }

    public static boolean eqN() {
        java.lang.String str = android.os.Build.MANUFACTURER + android.os.Build.BRAND;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean zx() {
        if (!IL) {
            try {
                if (java.lang.Class.forName("miui.os.Build") != null) {
                    bg = true;
                    IL = true;
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
            IL = true;
        }
        return bg;
    }

    public static java.lang.String ldr() {
        return eqN("ro.vivo.os.build.display.id") + "_" + eqN("ro.vivo.product.version");
    }

    public static boolean iR() {
        java.lang.String strEqN = eqN("ro.vivo.os.build.display.id");
        return !android.text.TextUtils.isEmpty(strEqN) && strEqN.toLowerCase().contains(eqN);
    }

    public static boolean Kg() {
        return !android.text.TextUtils.isEmpty(android.os.Build.DISPLAY) && android.os.Build.DISPLAY.toLowerCase().contains(bX);
    }

    public static java.lang.String WR() {
        return android.os.Build.DISPLAY + "_" + eqN("ro.gn.sv.version");
    }

    public static java.lang.String eo() {
        return VB() ? "eui_" + eqN("ro.letv.release.version") + "_" + android.os.Build.DISPLAY : "";
    }

    public static boolean VB() {
        return !android.text.TextUtils.isEmpty(eqN("ro.letv.release.version"));
    }

    public static java.lang.String PX() {
        return zx() ? "miui_" + eqN("ro.miui.ui.version.name") + "_" + android.os.Build.VERSION.INCREMENTAL : "";
    }

    public static java.lang.String Ta() {
        java.lang.String strYDt = yDt();
        return (strYDt == null || !strYDt.toLowerCase().contains("emotionui")) ? "" : strYDt + "_" + android.os.Build.DISPLAY;
    }

    public static java.lang.String yDt() {
        return eqN("ro.build.version.emui");
    }

    public static boolean Lq() {
        return "smartisan".equalsIgnoreCase(android.os.Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(android.os.Build.BRAND);
    }

    public static java.lang.String vb() {
        if (Lq()) {
            try {
                return "smartisan_".concat(java.lang.String.valueOf(eqN("ro.smartisan.version")));
            } catch (java.lang.Throwable unused) {
            }
        }
        return android.os.Build.DISPLAY;
    }

    public static java.lang.String xxp() {
        java.lang.String str = android.os.Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean VzQ() {
        if (ldr == Integer.MAX_VALUE) {
            java.lang.String str = android.os.Build.MANUFACTURER;
            java.lang.String strIR = com.bytedance.sdk.openadsdk.utils.ayS.iR("kllk");
            if (!android.text.TextUtils.isEmpty(str) && str.toLowerCase().contains(strIR)) {
                ldr = 1;
            } else {
                ldr = 0;
            }
        }
        return ldr == 1;
    }

    public static java.lang.String tuV() {
        if (!VzQ()) {
            return "";
        }
        return "coloros_" + eqN(com.bytedance.sdk.openadsdk.utils.ayS.iR("ro.build.version.kllkrom")) + "_" + android.os.Build.DISPLAY;
    }

    public static boolean Fy() {
        try {
            return (!android.text.TextUtils.isEmpty(android.os.Build.BRAND) && android.os.Build.BRAND.toLowerCase().startsWith("huawei")) || (!android.text.TextUtils.isEmpty(android.os.Build.MANUFACTURER) && android.os.Build.MANUFACTURER.toLowerCase().startsWith("huawei"));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = yDt();
        }
        return (!android.text.TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || Fy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String bX(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.lang.Throwable th;
        java.lang.String line = "";
        java.lang.Process process = null;
        try {
            try {
                try {
                    java.lang.Process processExec = java.lang.Runtime.getRuntime().exec("getprop ".concat(java.lang.String.valueOf(str)));
                    try {
                        bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()), 1024);
                        try {
                            line = bufferedReader.readLine();
                            processExec.exitValue();
                            bufferedReader.close();
                        } catch (java.lang.IllegalThreadStateException unused) {
                            process = processExec;
                            try {
                                process.destroy();
                            } catch (java.lang.Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return line;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            try {
                                com.bytedance.sdk.component.utils.PX.bg("ToolUtils", "Unable to read sysprop ".concat(java.lang.String.valueOf(str)), th);
                                return line;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (java.io.IOException e) {
                                        com.bytedance.sdk.component.utils.PX.bg("ToolUtils", "Exception while closing InputStream", e);
                                    }
                                }
                            }
                        }
                    } catch (java.lang.IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (java.io.IOException e2) {
                    com.bytedance.sdk.component.utils.PX.bg("ToolUtils", "Exception while closing InputStream", e2);
                }
            } catch (java.lang.IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            return line;
        } catch (java.lang.Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static java.lang.String eqN(java.lang.String str) {
        java.lang.String str2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str3 = iR.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (android.text.TextUtils.isEmpty("")) {
                final com.bytedance.sdk.component.Kg.iR iRVar = new com.bytedance.sdk.component.Kg.iR(new com.bytedance.sdk.openadsdk.utils.JAA.bg(str), 5, 2);
                com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.JAA.1
                    @Override // java.lang.Runnable
                    public void run() {
                        iRVar.run();
                    }
                });
                str2 = (java.lang.String) iRVar.get(1L, java.util.concurrent.TimeUnit.SECONDS);
            } else {
                str2 = "";
            }
        } catch (java.lang.Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    public static class bg implements java.util.concurrent.Callable<java.lang.String> {
        private final java.lang.String bg;

        public bg(java.lang.String str) {
            this.bg = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public java.lang.String call() throws java.lang.Exception {
            java.lang.String str = (java.lang.String) com.bytedance.sdk.openadsdk.utils.JAA.iR.get(this.bg);
            if (str != null) {
                return str;
            }
            java.lang.System.currentTimeMillis();
            java.lang.String strBX = com.bytedance.sdk.openadsdk.utils.JAA.bX(this.bg);
            java.lang.System.currentTimeMillis();
            if (strBX != null) {
                com.bytedance.sdk.openadsdk.utils.JAA.iR.put(this.bg, strBX);
            }
            return strBX;
        }
    }
}

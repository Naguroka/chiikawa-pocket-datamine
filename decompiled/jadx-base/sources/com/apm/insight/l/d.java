package com.apm.insight.l;

/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f441a = false;
    private static int b = -1;
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^0-([\\d]+)$");

    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = b("ro.build.version.emui");
        }
        if (android.text.TextUtils.isEmpty(str) || !str.toLowerCase(java.util.Locale.getDefault()).startsWith("emotionui")) {
            return e();
        }
        return true;
    }

    public static java.lang.String a() {
        return b("ro.build.version.emui");
    }

    private static java.lang.String b(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        java.lang.String line = null;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("getprop ".concat(java.lang.String.valueOf(str))).getInputStream()), 1024);
            try {
                line = bufferedReader.readLine();
                bufferedReader.close();
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

    private static boolean e() {
        try {
            return (!android.text.TextUtils.isEmpty(android.os.Build.BRAND) && android.os.Build.BRAND.toLowerCase(java.util.Locale.getDefault()).startsWith("huawei")) || (!android.text.TextUtils.isEmpty(android.os.Build.MANUFACTURER) && android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.getDefault()).startsWith("huawei"));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean b() {
        if (!f441a) {
            try {
                if (java.lang.Class.forName("miui.os.Build") != null) {
                    com.apm.insight.k.e.f429a = true;
                    f441a = true;
                    return com.apm.insight.k.e.f429a;
                }
            } catch (java.lang.Exception unused) {
            }
            f441a = true;
        }
        return com.apm.insight.k.e.f429a;
    }

    public static boolean c() {
        return android.os.Build.DISPLAY.contains("Flyme") || android.os.Build.USER.equals("flyme");
    }

    public static int d() {
        int i = b;
        if (i > 0) {
            return i;
        }
        int iC = c("/sys/devices/system/cpu/possible");
        if (iC <= 0) {
            iC = c("/sys/devices/system/cpu/present");
        }
        if (iC <= 0) {
            iC = e("/sys/devices/system/cpu/");
        }
        if (iC <= 0) {
            iC = java.lang.Runtime.getRuntime().availableProcessors();
        }
        if (iC <= 0) {
            iC = 1;
        }
        b = iC;
        return iC;
    }

    private static int c(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(str)));
            try {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    int iD = d(line);
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException unused) {
                    }
                    return iD;
                }
            } catch (java.lang.Throwable unused2) {
                if (bufferedReader == null) {
                    return -1;
                }
            }
        } catch (java.lang.Throwable unused3) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
            return -1;
        } catch (java.io.IOException unused4) {
            return -1;
        }
    }

    private static int d(java.lang.String str) {
        java.util.regex.Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            try {
                return java.lang.Integer.parseInt(matcher.group(1)) + 1;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return -1;
    }

    private static int e(java.lang.String str) {
        try {
            java.io.File[] fileArrListFiles = new java.io.File(str).listFiles(new java.io.FilenameFilter() { // from class: com.apm.insight.l.d.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final java.util.regex.Pattern f442a = java.util.regex.Pattern.compile("^cpu[\\d]+$");

                @Override // java.io.FilenameFilter
                public final boolean accept(java.io.File file, java.lang.String str2) {
                    return this.f442a.matcher(str2).matches();
                }
            });
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return -1;
            }
            return fileArrListFiles.length;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }
}

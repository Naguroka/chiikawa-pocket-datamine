package com.apm.insight.l;

/* JADX INFO: compiled from: LogPath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f449a;
    private static java.io.File b;
    private static java.io.File c;

    public static java.io.File a(android.content.Context context) {
        return new java.io.File(j(context), "apminsight/CrashLogJava");
    }

    public static java.io.File b(android.content.Context context) {
        return new java.io.File(j(context), "apminsight/CrashLogSimple");
    }

    public static java.io.File c(android.content.Context context) {
        return new java.io.File(j(context), "apminsight/RuntimeContext");
    }

    public static java.io.File d(android.content.Context context) {
        if (b == null) {
            if (context == null) {
                context = com.apm.insight.e.g();
            }
            b = new java.io.File(j(context), "apminsight/CrashLogNative");
        }
        return b;
    }

    public static java.io.File a() {
        java.io.File file = b;
        return file == null ? d(com.apm.insight.e.g()) : file;
    }

    public static java.io.File e(android.content.Context context) {
        if (c == null) {
            c = new java.io.File(j(context) + "/apminsight/CrashCommonLog/" + com.apm.insight.e.f());
        }
        return c;
    }

    public static java.io.File a(android.content.Context context, java.lang.String str) {
        return new java.io.File(j(context) + "/apminsight/CrashCommonLog/" + str);
    }

    public static java.io.File f(android.content.Context context) {
        return new java.io.File(j(context), "apminsight/CrashCommonLog");
    }

    public static java.io.File g(android.content.Context context) {
        return new java.io.File(j(context), "apminsight/issueCrashTimes");
    }

    public static java.io.File h(android.content.Context context) {
        return new java.io.File(j(context) + "/apminsight/issueCrashTimes/current.times");
    }

    public static java.io.File i(android.content.Context context) {
        return new java.io.File(j(context), "apminsight/alogCrash");
    }

    public static java.lang.String a(java.lang.String str) {
        return "dart_".concat(java.lang.String.valueOf(str));
    }

    public static java.lang.String b() {
        return "anr_" + com.apm.insight.e.e();
    }

    public static java.lang.String c() {
        return java.lang.String.format("ensure_%s", com.apm.insight.e.e());
    }

    public static java.io.File a(java.io.File file, java.lang.String str) {
        return new java.io.File(file, file.getName() + str);
    }

    public static java.io.File a(java.io.File file) {
        return new java.io.File(file, "flog.txt");
    }

    public static java.io.File b(java.io.File file) {
        return new java.io.File(file, "tombstone.txt");
    }

    public static java.io.File c(java.io.File file) {
        return new java.io.File(file, "header.bin");
    }

    public static java.io.File d(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "maps.txt");
    }

    public static java.io.File e(java.io.File file) {
        return new java.io.File(file, "callback.json");
    }

    public static java.io.File f(java.io.File file) {
        return new java.io.File(file, "upload.json");
    }

    public static java.io.File g(java.io.File file) {
        return new java.io.File(file, "javastack.txt");
    }

    public static java.io.File h(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "logcat.txt");
    }

    public static java.io.File i(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "fds.txt");
    }

    public static java.io.File j(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "threads.txt");
    }

    public static java.io.File k(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "meminfo.txt");
    }

    public static java.io.File b(java.lang.String str) {
        return new java.io.File(a(com.apm.insight.e.g(), str), "fds.txt");
    }

    public static java.io.File c(java.lang.String str) {
        return new java.io.File(a(com.apm.insight.e.g(), str), "threads.txt");
    }

    public static java.io.File d(java.lang.String str) {
        return new java.io.File(a(com.apm.insight.e.g(), str), "meminfo.txt");
    }

    public static java.io.File l(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "pthreads.txt");
    }

    public static java.io.File m(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "rountines.txt");
    }

    public static java.io.File n(java.io.File file) {
        return new java.io.File(a(com.apm.insight.e.g(), file.getName()), "leakd_threads.txt");
    }

    public static java.io.File e(java.lang.String str) {
        return new java.io.File(a(com.apm.insight.e.g(), str), "pthreads.txt");
    }

    public static java.io.File f(java.lang.String str) {
        return new java.io.File(a(com.apm.insight.e.g(), str), "rountines.txt");
    }

    public static java.io.File g(java.lang.String str) {
        return new java.io.File(a(com.apm.insight.e.g(), str), "leakd_threads.txt");
    }

    public static java.io.File o(java.io.File file) {
        return new java.io.File(file, "abortmsg.txt");
    }

    public static java.lang.String j(android.content.Context context) {
        if (android.text.TextUtils.isEmpty(f449a)) {
            try {
                f449a = context.getFilesDir().getAbsolutePath();
            } catch (java.lang.Exception e) {
                f449a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f449a;
    }
}

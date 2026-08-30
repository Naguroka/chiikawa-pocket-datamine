package com.apm.insight.nativecrash;

/* JADX INFO: loaded from: classes3.dex */
public class NativeImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f455a = false;
    private static volatile boolean b = false;
    private static boolean c = true;

    public static void c() {
    }

    public static void d() {
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i);

    private static native int doCreateCallbackThread();

    private static native void doDump(java.lang.String str);

    private static native void doDumpFds(java.lang.String str);

    private static native void doDumpHprof(java.lang.String str);

    private static native void doDumpLogcat(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static native void doDumpMaps(java.lang.String str);

    private static native void doDumpMemInfo(java.lang.String str);

    private static native void doDumpThreads(java.lang.String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native java.lang.String doGetCrashHeader(java.lang.String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native java.lang.String[] doGetFdDump(int i, int i2, int[] iArr, java.lang.String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(java.lang.String str, int i);

    private static native int doOpenFile(java.lang.String str);

    private static native void doRebuildTombstone(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static native void doSetAlogConfigPath(java.lang.String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetResendSigQuit(int i);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2);

    private static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, java.lang.String str, int i2);

    private static native boolean is64Bit();

    public static boolean a() {
        if (b) {
            return f455a;
        }
        b = true;
        if (!f455a) {
            f455a = com.apm.insight.a.b("apminsighta");
        }
        return f455a;
    }

    public static boolean a(android.content.Context context) {
        java.lang.String strA;
        boolean zA = a();
        if (zA) {
            java.lang.String str = com.apm.insight.l.j.j(context) + "/apminsight";
            if (new java.io.File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                strA = context.getApplicationInfo().nativeLibraryDir;
            } else {
                strA = com.apm.insight.h.b.a();
                com.apm.insight.h.b.b("apminsightb");
            }
            doStart(android.os.Build.VERSION.SDK_INT, strA, str, com.apm.insight.e.f(), com.apm.insight.e.m());
        }
        return zA;
    }

    public static int b() {
        if (f455a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    public static void a(long j) {
        if (f455a) {
            try {
                doSetAlogFlushAddr(j);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void b(long j) {
        if (f455a) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static java.lang.String a(java.lang.String str) {
        if (f455a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    public static void a(java.io.File file) {
        if (f455a) {
            doRebuildTombstone(com.apm.insight.l.j.c(file).getAbsolutePath(), com.apm.insight.l.j.b(file).getAbsolutePath(), com.apm.insight.l.j.d(file).getAbsolutePath());
        }
    }

    public static void b(java.lang.String str) {
        if (f455a) {
            doDumpHprof(str);
        }
    }

    public static boolean e() {
        if (!f455a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean f() {
        if (!f455a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static void g() {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.apm.insight.nativecrash.NativeImpl.l();
                } catch (java.lang.Throwable th) {
                    try {
                        com.apm.insight.c.a(th, "NPTH_ANR_MONITOR_ERROR");
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor").start();
    }

    private static void reportEventForAnrMonitor() {
        try {
            java.lang.System.currentTimeMillis();
            com.apm.insight.e.j();
            com.apm.insight.b.d.c();
            com.apm.insight.b.f.a(com.apm.insight.e.g()).a().e();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static int c(java.lang.String str) {
        if (f455a && !android.text.TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (java.lang.Throwable unused) {
            }
        }
        return -1;
    }

    public static int a(int i) {
        if (f455a && i >= 0) {
            try {
                return doLock("", i);
            } catch (java.lang.Throwable unused) {
            }
        }
        return -1;
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (f455a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void d(java.lang.String str) {
        if (f455a) {
            try {
                doDumpMemInfo(str);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void e(java.lang.String str) {
        if (f455a) {
            try {
                doDumpFds(str);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void f(java.lang.String str) {
        if (f455a) {
            try {
                doDumpMaps(str);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void g(java.lang.String str) {
        if (f455a) {
            try {
                doDumpThreads(str);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static int h(java.lang.String str) {
        if (!f455a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public static void a(int i, java.lang.String str) {
        if (!f455a || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            doWriteFile(i, str, str.length());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void b(int i) {
        if (f455a) {
            try {
                doCloseFile(i);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private static void handleNativeCrash(java.lang.String str) {
        com.apm.insight.nativecrash.NativeCrashCollector.onNativeCrash(str);
    }

    public static void i(java.lang.String str) {
        if (f455a) {
            doDump(str);
        }
    }

    public static void a(boolean z) {
        c = z;
        if (f455a) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }

    public static boolean h() {
        return c;
    }

    public static long c(int i) {
        if (f455a) {
            return doGetThreadCpuTime(i);
        }
        return 0L;
    }

    public static void i() {
        if (f455a) {
            doSignalMainThread();
        }
    }

    public static void j() {
        if (f455a) {
            doSetUploadEnd();
        }
    }

    public static void k() {
        if (f455a) {
            doInitThreadDump();
        }
    }

    static /* synthetic */ void l() {
        if (f455a) {
            try {
                doStartAnrMonitor(android.os.Build.VERSION.SDK_INT);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}

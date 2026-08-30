package com.apm.insight.runtime;

/* JADX INFO: compiled from: MonitorCrashInner.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.MonitorCrash f484a = null;
    private static int b = -1;
    private static int c;

    public static com.apm.insight.MonitorCrash a() {
        if (f484a == null) {
            com.apm.insight.MonitorCrash monitorCrashInitSDK = com.apm.insight.MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 1030851L, "1.3.8.nourl-rc.1", "com.apm.insight");
            f484a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f484a;
    }

    public static void a(java.lang.Throwable th, java.lang.String str) {
        boolean z;
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (b == -1) {
            b = 5;
        }
        int i = c;
        if (i < b) {
            z = true;
            c = i + 1;
        } else {
            z = false;
        }
        if (z) {
            a().reportCustomErr(str, "INNER", th);
        }
    }
}

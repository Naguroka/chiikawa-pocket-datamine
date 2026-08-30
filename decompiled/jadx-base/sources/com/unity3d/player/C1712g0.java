package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1712g0 implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile java.lang.Thread.UncaughtExceptionHandler f3922a;
    private java.lang.String b;

    C1712g0() {
    }

    static void a(java.lang.String str) {
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof com.unity3d.player.C1712g0) {
            com.unity3d.player.C1712g0 c1712g0 = (com.unity3d.player.C1712g0) defaultUncaughtExceptionHandler;
            int i = -1;
            int i2 = -1;
            while (true) {
                int iIndexOf = str.indexOf(47, i + 1);
                if (iIndexOf == -1) {
                    break;
                }
                i2 = i;
                i = iIndexOf;
            }
            c1712g0.b = i2 < 0 ? "Unknown" : str.substring(i2 + 1);
        }
    }

    final synchronized void a() {
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == this) {
            return;
        }
        this.f3922a = defaultUncaughtExceptionHandler;
        this.b = "Unknown";
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            java.lang.Error error = new java.lang.Error(java.lang.String.format("FATAL EXCEPTION [%s]\n", thread.getName()) + java.lang.String.format("Unity version     : %s\n", "2022.3.64f1") + java.lang.String.format("Device model      : %s %s\n", android.os.Build.MANUFACTURER, android.os.Build.MODEL) + java.lang.String.format("Device fingerprint: %s\n", android.os.Build.FINGERPRINT) + java.lang.String.format("CPU supported ABI : %s\n", java.util.Arrays.toString(android.os.Build.SUPPORTED_ABIS)) + java.lang.String.format("Build Type        : %s\n", "Release") + java.lang.String.format("Scripting Backend : %s\n", "IL2CPP") + java.lang.String.format("Libs loaded from  : %s\n", this.b) + java.lang.String.format("Strip Engine Code : %s\n", java.lang.Boolean.TRUE));
            error.setStackTrace(new java.lang.StackTraceElement[0]);
            error.initCause(th);
            this.f3922a.uncaughtException(thread, error);
        } catch (java.lang.Throwable unused) {
            this.f3922a.uncaughtException(thread, th);
        }
    }
}

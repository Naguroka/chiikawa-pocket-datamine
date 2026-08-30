package com.apm.insight;

/* JADX INFO: loaded from: classes3.dex */
public final class Npth {
    private static boolean sInit;

    public static void setAlogWriteAddr(long j) {
    }

    public static boolean isJavaCrashEnable() {
        return com.apm.insight.runtime.m.b();
    }

    public static boolean isANREnable() {
        return com.apm.insight.runtime.m.c();
    }

    public static boolean isNativeCrashEnable() {
        return com.apm.insight.runtime.m.d();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static void openJavaCrashMonitor() {
        com.apm.insight.runtime.m.f();
    }

    public static void openANRMonitor() {
        com.apm.insight.runtime.m.g();
    }

    public static boolean openNativeCrashMonitor() {
        return com.apm.insight.runtime.m.h();
    }

    public static synchronized void initMiniApp(android.content.Context context, com.apm.insight.ICommonParams iCommonParams) {
        com.apm.insight.e.o();
        init(context, iCommonParams, true, false, true, true);
    }

    public static synchronized void initMiniApp(android.content.Context context, com.apm.insight.ICommonParams iCommonParams, int i, java.lang.String str) {
        com.apm.insight.e.o();
        com.apm.insight.e.b(i, str);
        init(context, iCommonParams, true, true, true, true);
    }

    public static synchronized void init(android.content.Context context, com.apm.insight.ICommonParams iCommonParams) {
        init(context, iCommonParams, true, false, false);
    }

    public static synchronized void init(android.content.Context context, com.apm.insight.ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        init(context, iCommonParams, z, z, z2, z3);
    }

    public static void setCurProcessName(java.lang.String str) {
        com.apm.insight.l.a.a(str);
    }

    public static void enableThreadsBoost() {
        com.apm.insight.e.l();
    }

    public static synchronized void init(android.content.Context context, com.apm.insight.ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        init(context, iCommonParams, z, z2, z3, z4, 0L);
    }

    public static synchronized void init(android.content.Context context, com.apm.insight.ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        android.app.Application applicationH;
        android.content.Context baseContext = context;
        synchronized (com.apm.insight.Npth.class) {
            if (com.apm.insight.e.h() != null) {
                applicationH = com.apm.insight.e.h();
            } else if (baseContext instanceof android.app.Application) {
                applicationH = (android.app.Application) baseContext;
                if (applicationH.getBaseContext() == null) {
                    throw new java.lang.IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
            } else {
                try {
                    applicationH = (android.app.Application) context.getApplicationContext();
                    if (applicationH == null) {
                        throw new java.lang.IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                    }
                    if (applicationH.getBaseContext() != null) {
                        baseContext = applicationH.getBaseContext();
                    }
                } catch (java.lang.Throwable unused) {
                    throw new java.lang.IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
            }
            init(applicationH, baseContext, iCommonParams, z, z2, z3, z4, j);
        }
    }

    public static void setApplication(android.app.Application application) {
        com.apm.insight.e.a(application);
    }

    public static synchronized void init(android.app.Application application, android.content.Context context, com.apm.insight.ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        if (sInit) {
            return;
        }
        sInit = true;
        com.apm.insight.runtime.m.a(application, context);
        com.apm.insight.e.a(application, context, iCommonParams);
        java.util.Map<java.lang.String, java.lang.Object> mapA = com.apm.insight.e.a().a();
        com.apm.insight.MonitorCrash monitorCrashInit = com.apm.insight.MonitorCrash.init(context, java.lang.String.valueOf(com.apm.insight.l.c.AnonymousClass1.a(mapA.get(com.json.tk.SESSION_HISTORY_KEY_AD_ID), 4444)), com.apm.insight.l.c.AnonymousClass1.a(mapA.get("update_version_code"), 0), java.lang.String.valueOf(mapA.get("app_version")));
        if (monitorCrashInit != null) {
            monitorCrashInit.config().setDeviceId(com.apm.insight.e.a().d()).setChannel(java.lang.String.valueOf(mapA.get("channel")));
        }
    }

    public static boolean isRunning() {
        return com.apm.insight.runtime.m.i();
    }

    public static void reportDartError(java.lang.String str) {
        com.apm.insight.runtime.m.a(str);
    }

    @java.lang.Deprecated
    public static void reportError(java.lang.Throwable th) {
        com.apm.insight.runtime.m.a(th);
    }

    @java.lang.Deprecated
    public static void reportError(java.lang.String str) {
        com.apm.insight.runtime.m.b(str);
    }

    public static com.apm.insight.runtime.ConfigManager getConfigManager() {
        return com.apm.insight.e.i();
    }

    public static void registerCrashCallback(com.apm.insight.ICrashCallback iCrashCallback, com.apm.insight.CrashType crashType) {
        com.apm.insight.runtime.m.a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(com.apm.insight.IOOMCallback iOOMCallback) {
        com.apm.insight.runtime.m.a(iOOMCallback);
    }

    public static void unregisterCrashCallback(com.apm.insight.ICrashCallback iCrashCallback, com.apm.insight.CrashType crashType) {
        com.apm.insight.runtime.m.b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(com.apm.insight.IOOMCallback iOOMCallback, com.apm.insight.CrashType crashType) {
        com.apm.insight.runtime.m.b(iOOMCallback);
    }

    public static void setCrashFilter(com.apm.insight.ICrashFilter iCrashFilter) {
        com.apm.insight.e.b().a(iCrashFilter);
    }

    @java.lang.Deprecated
    public static void setAttachUserData(com.apm.insight.AttachUserData attachUserData, com.apm.insight.CrashType crashType) {
        if (attachUserData != null) {
            com.apm.insight.e.b().a(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(com.apm.insight.AttachUserData attachUserData, com.apm.insight.CrashType crashType) {
        if (attachUserData != null) {
            com.apm.insight.e.b().a(attachUserData, crashType);
        }
    }

    public static void addAttachLongUserData(com.apm.insight.AttachUserData attachUserData, com.apm.insight.CrashType crashType) {
        if (attachUserData != null) {
            com.apm.insight.e.b().b(attachUserData, crashType);
        }
    }

    public static void removeAttachUserData(com.apm.insight.AttachUserData attachUserData, com.apm.insight.CrashType crashType) {
        if (attachUserData != null) {
            com.apm.insight.e.b().a(crashType, attachUserData);
        }
    }

    public static void removeAttachLongUserData(com.apm.insight.AttachUserData attachUserData, com.apm.insight.CrashType crashType) {
        if (attachUserData != null) {
            com.apm.insight.e.b().b(crashType, attachUserData);
        }
    }

    public static void setBusiness(java.lang.String str) {
        if (str != null) {
            com.apm.insight.e.a(str);
        }
    }

    public static void addTags(java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        com.apm.insight.e.b().a(map);
    }

    public static void stopAnr() {
        com.apm.insight.runtime.m.j();
    }

    public static void registerSdk(int i, java.lang.String str) {
        com.apm.insight.e.a(i, str);
    }

    public static void setAlogFlushAddr(long j) {
        com.apm.insight.runtime.m.k();
    }

    public static void setAlogFlushV2Addr(long j) {
        com.apm.insight.runtime.m.a(j);
    }

    public static void setAlogLogDirAddr(long j) {
        com.apm.insight.runtime.m.b(j);
    }

    public static boolean hasCrash() {
        return com.apm.insight.runtime.m.l();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return com.apm.insight.runtime.m.m();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return com.apm.insight.runtime.m.n();
    }

    public static void dumpHprof(java.lang.String str) {
        com.apm.insight.runtime.m.c(str);
    }

    public static boolean isStopUpload() {
        return com.apm.insight.runtime.m.o();
    }

    public static void stopUpload() {
        com.apm.insight.runtime.m.p();
    }

    public static void enableLoopMonitor(boolean z) {
        com.apm.insight.runtime.m.a(z);
    }

    public static void enableAnrInfo(boolean z) {
        com.apm.insight.runtime.m.b(z);
    }

    public static void checkInnerNpth(boolean z) {
        com.apm.insight.runtime.m.c(z);
    }

    public static void enableNativeDump(boolean z) {
        com.apm.insight.runtime.m.d(z);
    }
}

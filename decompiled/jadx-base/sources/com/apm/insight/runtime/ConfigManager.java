package com.apm.insight.runtime;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigManager {
    public static final long BLOCK_MONITOR_INTERVAL = 1000;
    private static final long BLOCK_MONITOR_MIN_INTERVAL = 10;
    public static final java.lang.String CONFIG_URL_SUFFIX = "/settings/get";
    public static final java.lang.String EXCEPTION_URL_SUFFIX = "/monitor/collect/c/exception";
    public static final java.lang.String JAVA_URL_SUFFIX = "/monitor/collect/c/crash";
    private static final long LAUNCH_CRASH_INTERVAL = 8000;
    public static final java.lang.String LAUNCH_URL_SUFFIX = "/monitor/collect/c/exception/dump_collection";
    public static final java.lang.String LOG_TYPE_ALL_STACK = "npth_enable_all_thread_stack";
    public static final java.lang.String NATIVE_URL_SUFFIX = "/monitor/collect/c/native_bin_crash";
    private java.util.concurrent.ThreadPoolExecutor mThreadPoolExecutor;
    private boolean reportErrorEnable = true;
    private java.lang.String mNativeMemUrl = "";
    private java.lang.String mCoreDumpUrl = "";
    private java.lang.String mJavaCrashUploadUrl = "";
    private java.lang.String mLaunchCrashUploadUrl = "";
    private java.lang.String mExceptionUploadUrl = "";
    private java.lang.String mConfigUrl = "";
    private java.lang.String mNativeCrashUploadUrl = "";
    private java.lang.String mAlogUploadUrl = "";
    private java.lang.String mAsanReportUploadUrl = "";
    private long mLaunchCrashInterval = LAUNCH_CRASH_INTERVAL;
    private com.apm.insight.b.i.a mEncryptImpl$1c14659d = new com.apm.insight.b.i.a() { // from class: com.apm.insight.runtime.ConfigManager.1
    };
    private int mLogcatDumpCount = 512;
    private int mLogcatLevel = 1;
    private boolean mNativeCrashMiniDump = true;
    private boolean mEnsureEnable = true;
    private boolean mEnsureWithLogcat = false;
    private long mBlockMonitorInterval = 1000;
    private boolean mBlockMonitorEnable = false;
    private boolean mIsDebugMode = false;

    public void setLaunchCrashUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mExceptionUploadUrl = str;
        int iIndexOf = str.indexOf("//");
        if (iIndexOf == -1) {
            this.mLaunchCrashUploadUrl = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/exception/dump_collection";
        } else {
            this.mLaunchCrashUploadUrl = str.substring(0, str.indexOf("/", iIndexOf + 2) + 1) + "monitor/collect/c/exception/dump_collection";
        }
    }

    public void setConfigUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mConfigUrl = str;
    }

    public static void setDefaultCommonParams(com.apm.insight.ICommonParams iCommonParams, android.content.Context context) {
        com.apm.insight.e.a(new com.apm.insight.nativecrash.b(context, iCommonParams));
    }

    public static void updateDid(final java.lang.String str) {
        com.apm.insight.runtime.n.a().a(new java.lang.Runnable() { // from class: com.apm.insight.runtime.ConfigManager.2
            @Override // java.lang.Runnable
            public final void run() {
                com.apm.insight.e.c().a(str);
                com.apm.insight.j.b.c();
            }
        });
    }

    public void setNativeCrashUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mNativeCrashUploadUrl = str;
    }

    public void setAlogUploadUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mAlogUploadUrl = str;
    }

    public void setBlockMonitorInterval(long j) {
        this.mBlockMonitorInterval = j;
    }

    public boolean isNativeCrashMiniDump() {
        return this.mNativeCrashMiniDump;
    }

    public java.lang.String getNativeCrashUploadUrl() {
        return this.mNativeCrashUploadUrl;
    }

    public java.lang.String getConfigUrl() {
        return this.mConfigUrl;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    public void setReportErrorEnable(boolean z) {
        this.reportErrorEnable = z;
    }

    public java.lang.String getLaunchCrashUploadUrl() {
        return this.mLaunchCrashUploadUrl;
    }

    public java.lang.String getExceptionUploadUrl() {
        return this.mExceptionUploadUrl;
    }

    public java.lang.String getJavaCrashUploadUrl() {
        return this.mJavaCrashUploadUrl;
    }

    public java.lang.String getNativeMemUrl() {
        return this.mNativeMemUrl;
    }

    public java.lang.String getCoreDumpUrl() {
        return this.mCoreDumpUrl;
    }

    public java.lang.String getAsanReportUploadUrl() {
        return this.mAsanReportUploadUrl;
    }

    public void setJavaCrashUploadUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mJavaCrashUploadUrl = str;
    }

    public java.lang.String getAlogUploadUrl() {
        return this.mAlogUploadUrl;
    }

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public void setLaunchCrashInterval(long j) {
        if (j > 0) {
            this.mLaunchCrashInterval = j;
        }
    }

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public void setLogcatDumpCount(int i) {
        if (i > 0) {
            this.mLogcatDumpCount = i;
        }
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public void setLogcatLevel(int i) {
        if (i < 0 || i > 4) {
            return;
        }
        this.mLogcatLevel = i;
    }

    public java.util.Set<java.lang.String> getFilterThreadSet() {
        return com.apm.insight.l.g.a();
    }

    public boolean isEnsureEnable() {
        return this.mEnsureEnable;
    }

    public void setEnsureEnable(boolean z) {
        this.mEnsureEnable = z;
    }

    public boolean isEnsureWithLogcat() {
        return this.mEnsureWithLogcat;
    }

    public void setEnsureWithLogcat(boolean z) {
        this.mEnsureWithLogcat = z;
    }

    public long getBlockInterval() {
        return this.mBlockMonitorInterval;
    }

    public boolean isBlockMonitorEnable() {
        return this.mBlockMonitorEnable;
    }

    public void setBlockMonitorEnable(boolean z) {
        this.mBlockMonitorEnable = z;
    }

    public void setCurrentProcessName(java.lang.String str) {
        com.apm.insight.l.a.a(str);
    }

    public com.apm.insight.b.i.a getEncryptImpl$1546c4a2() {
        return this.mEncryptImpl$1c14659d;
    }

    public void setEncryptImpl$22f2d42e(com.apm.insight.b.i.a aVar) {
        if (aVar != null) {
            this.mEncryptImpl$1c14659d = aVar;
        }
    }

    public boolean isDebugMode() {
        return this.mIsDebugMode;
    }

    public void setDebugMode(boolean z) {
        this.mIsDebugMode = z;
    }

    public void setThreadPoolExecutor(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        this.mThreadPoolExecutor = threadPoolExecutor;
    }

    public java.util.concurrent.ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isCrashIgnored(final java.lang.String str) {
        try {
            com.apm.insight.runtime.e eVar = new com.apm.insight.runtime.e() { // from class: com.apm.insight.runtime.ConfigManager.3
                @Override // com.apm.insight.runtime.e
                public final java.lang.Object a(java.lang.String str2) {
                    if (str2.equals("md5")) {
                        return str;
                    }
                    return super.a(str2);
                }
            };
            if (com.apm.insight.runtime.l.a("java_crash_ignore", eVar)) {
                return true;
            }
            if (!com.apm.insight.l.k.b(com.apm.insight.e.g())) {
                return false;
            }
            com.apm.insight.k.a.d();
            return com.apm.insight.runtime.l.a("java_crash_ignore", eVar);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public boolean isApmExists() {
        return com.apm.insight.k.a.c();
    }
}

package com.apm.insight;

/* JADX INFO: loaded from: classes3.dex */
public class MonitorCrash {
    private static volatile boolean sAppMonitorCrashInit = false;
    com.apm.insight.MonitorCrash.Config mConfig;
    com.apm.insight.AttachUserData mCustomData;
    com.apm.insight.AttachUserData mCustomLongData;
    com.apm.insight.MonitorCrash.HeaderParams mParams;
    java.util.HashMap<java.lang.String, java.lang.String> mTagMap = new java.util.HashMap<>();

    public interface HeaderParams {
        java.util.Map<java.lang.String, java.lang.Object> getCommonParams();
    }

    private MonitorCrash(android.content.Context context, java.lang.String str, long j, java.lang.String str2) {
        com.apm.insight.MonitorCrash.Config config = new com.apm.insight.MonitorCrash.Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        com.apm.insight.d.a(context, this);
    }

    private MonitorCrash(java.lang.String str, long j, java.lang.String str2, java.lang.String... strArr) {
        com.apm.insight.MonitorCrash.Config config = new com.apm.insight.MonitorCrash.Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        this.mConfig.mPackageName = strArr;
        com.apm.insight.d.a(this);
    }

    public static com.apm.insight.MonitorCrash init(android.content.Context context, java.lang.String str, long j, java.lang.String str2) {
        if (sAppMonitorCrashInit) {
            return null;
        }
        synchronized (com.apm.insight.MonitorCrash.class) {
            if (sAppMonitorCrashInit) {
                return null;
            }
            sAppMonitorCrashInit = true;
            com.apm.insight.runtime.m.a(context);
            return new com.apm.insight.MonitorCrash(context, str, j, str2);
        }
    }

    public static com.apm.insight.MonitorCrash initSDK(android.content.Context context, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        com.apm.insight.runtime.m.a(context);
        com.apm.insight.MonitorCrash monitorCrash = new com.apm.insight.MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3).setSoList(strArr);
        return monitorCrash;
    }

    public static com.apm.insight.MonitorCrash initSDK(android.content.Context context, java.lang.String str, long j, java.lang.String str2, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.apm.insight.runtime.m.a(context);
        com.apm.insight.MonitorCrash monitorCrash = new com.apm.insight.MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr).setSoList(strArr2);
        return monitorCrash;
    }

    public static com.apm.insight.MonitorCrash initSDK(android.content.Context context, java.lang.String str, long j, java.lang.String str2, java.lang.String str3) {
        com.apm.insight.runtime.m.a(context);
        com.apm.insight.MonitorCrash monitorCrash = new com.apm.insight.MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3);
        return monitorCrash;
    }

    public static com.apm.insight.MonitorCrash initSDK(android.content.Context context, java.lang.String str, long j, java.lang.String str2, java.lang.String... strArr) {
        com.apm.insight.runtime.m.a(context);
        com.apm.insight.MonitorCrash monitorCrash = new com.apm.insight.MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr);
        return monitorCrash;
    }

    public com.apm.insight.MonitorCrash.Config config() {
        return this.mConfig;
    }

    public class Config {
        java.lang.String mAid;
        java.lang.String mChannel;
        java.lang.String mDeviceId;
        java.lang.String[] mPackageName;
        java.lang.String mSSID;
        java.lang.String[] mSoList;
        java.lang.String[] mThreadList;
        java.lang.String mUID;
        long mVersionInt = -1;
        java.lang.String mVersionStr;

        public Config() {
        }

        public com.apm.insight.MonitorCrash.Config setThreadList(java.lang.String[] strArr) {
            this.mThreadList = strArr;
            com.apm.insight.j.b.c();
            return this;
        }

        public com.apm.insight.MonitorCrash.Config setSoList(java.lang.String[] strArr) {
            this.mSoList = strArr;
            com.apm.insight.j.b.c();
            return this;
        }

        public com.apm.insight.MonitorCrash.Config setChannel(java.lang.String str) {
            this.mChannel = str;
            com.apm.insight.j.b.c();
            return this;
        }

        public com.apm.insight.MonitorCrash.Config setPackageName(java.lang.String... strArr) {
            this.mPackageName = strArr;
            com.apm.insight.j.b.c();
            return this;
        }

        public com.apm.insight.MonitorCrash.Config setPackageName(java.lang.String str) {
            return setPackageName(str);
        }

        public com.apm.insight.MonitorCrash.Config setDeviceId(java.lang.String str) {
            this.mDeviceId = str;
            com.apm.insight.j.b.c();
            return this;
        }

        public com.apm.insight.MonitorCrash.Config setUID(java.lang.String str) {
            this.mUID = str;
            com.apm.insight.j.b.c();
            return this;
        }

        public com.apm.insight.MonitorCrash.Config setSSID(java.lang.String str) {
            this.mSSID = str;
            com.apm.insight.j.b.c();
            return this;
        }
    }

    public com.apm.insight.MonitorCrash withOtherHeaders(com.apm.insight.MonitorCrash.HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }

    public com.apm.insight.MonitorCrash setCustomDataCallback(com.apm.insight.AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public com.apm.insight.MonitorCrash addTags(java.lang.String str, java.lang.String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public com.apm.insight.MonitorCrash setReportUrl(java.lang.String str) {
        int i;
        if (android.text.TextUtils.isEmpty(str)) {
            return this;
        }
        int iIndexOf = str.indexOf("://");
        if (iIndexOf < 0) {
            str = "https://".concat(java.lang.String.valueOf(str));
            i = 8;
        } else {
            i = iIndexOf + 3;
        }
        int iIndexOf2 = str.indexOf("/", i);
        if (iIndexOf2 >= 0) {
            str = str.substring(0, iIndexOf2);
        }
        com.apm.insight.a.a((java.lang.Object) "set url ".concat(java.lang.String.valueOf(str)));
        com.apm.insight.e.i().setLaunchCrashUrl(str + com.apm.insight.runtime.ConfigManager.EXCEPTION_URL_SUFFIX);
        com.apm.insight.e.i().setJavaCrashUploadUrl(str + com.apm.insight.runtime.ConfigManager.JAVA_URL_SUFFIX);
        com.apm.insight.e.i().setNativeCrashUrl(str + com.apm.insight.runtime.ConfigManager.NATIVE_URL_SUFFIX);
        com.apm.insight.e.i().setConfigUrl(str + com.apm.insight.runtime.ConfigManager.CONFIG_URL_SUFFIX);
        return this;
    }

    public void reportCustomErr(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.apm.insight.f.b.a(this, th, str, str2, "core_exception_monitor");
    }

    public void registerCrashCallback(com.apm.insight.ICrashCallback iCrashCallback, com.apm.insight.CrashType crashType) {
        if (this == com.apm.insight.d.f383a) {
            com.apm.insight.runtime.m.a(iCrashCallback, crashType);
        } else {
            com.apm.insight.runtime.m.a(new com.apm.insight.b(this.mConfig.mAid, iCrashCallback), crashType);
        }
    }

    public void registerOOMCallback(com.apm.insight.IOOMCallback iOOMCallback) {
        if (this == com.apm.insight.d.f383a) {
            com.apm.insight.runtime.m.a(iOOMCallback);
        } else {
            com.apm.insight.runtime.m.a(new com.apm.insight.b(this.mConfig.mAid, iOOMCallback));
        }
    }
}

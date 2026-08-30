package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
public abstract class StaticSessionData {
    public abstract com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData();

    public abstract com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData();

    public abstract com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData();

    public static com.google.firebase.crashlytics.internal.model.StaticSessionData create(com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData, com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData, com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData) {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData(appData, osData, deviceData);
    }

    public static abstract class AppData {
        public abstract java.lang.String appIdentifier();

        public abstract int deliveryMechanism();

        public abstract com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider();

        public abstract java.lang.String installUuid();

        public abstract java.lang.String versionCode();

        public abstract java.lang.String versionName();

        public static com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData create(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider) {
            return new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_AppData(str, str2, str3, str4, i, developmentPlatformProvider);
        }
    }

    public static abstract class OsData {
        public abstract boolean isRooted();

        public abstract java.lang.String osCodeName();

        public abstract java.lang.String osRelease();

        public static com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData create(java.lang.String str, java.lang.String str2, boolean z) {
            return new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_OsData(str, str2, z);
        }
    }

    public static abstract class DeviceData {
        public abstract int arch();

        public abstract int availableProcessors();

        public abstract long diskSpace();

        public abstract boolean isEmulator();

        public abstract java.lang.String manufacturer();

        public abstract java.lang.String model();

        public abstract java.lang.String modelClass();

        public abstract int state();

        public abstract long totalRam();

        public static com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData create(int i, java.lang.String str, int i2, long j, long j2, boolean z, int i3, java.lang.String str2, java.lang.String str3) {
            return new com.google.firebase.crashlytics.internal.model.AutoValue_StaticSessionData_DeviceData(i, str, i2, j, j2, z, i3, str2, str3);
        }
    }
}

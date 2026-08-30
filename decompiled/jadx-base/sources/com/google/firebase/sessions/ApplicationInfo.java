package com.google.firebase.sessions;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", "", "appId", "", com.ironsource.y8.i.l, "sessionSdkVersion", "osVersion", "logEnvironment", "Lcom/google/firebase/sessions/LogEnvironment;", "androidAppInfo", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)V", "getAndroidAppInfo", "()Lcom/google/firebase/sessions/AndroidApplicationInfo;", "getAppId", "()Ljava/lang/String;", "getDeviceModel", "getLogEnvironment", "()Lcom/google/firebase/sessions/LogEnvironment;", "getOsVersion", "getSessionSdkVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ApplicationInfo {
    private final com.google.firebase.sessions.AndroidApplicationInfo androidAppInfo;
    private final java.lang.String appId;
    private final java.lang.String deviceModel;
    private final com.google.firebase.sessions.LogEnvironment logEnvironment;
    private final java.lang.String osVersion;
    private final java.lang.String sessionSdkVersion;

    public static /* synthetic */ com.google.firebase.sessions.ApplicationInfo copy$default(com.google.firebase.sessions.ApplicationInfo applicationInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.firebase.sessions.LogEnvironment logEnvironment, com.google.firebase.sessions.AndroidApplicationInfo androidApplicationInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = applicationInfo.appId;
        }
        if ((i & 2) != 0) {
            str2 = applicationInfo.deviceModel;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = applicationInfo.sessionSdkVersion;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = applicationInfo.osVersion;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            logEnvironment = applicationInfo.logEnvironment;
        }
        com.google.firebase.sessions.LogEnvironment logEnvironment2 = logEnvironment;
        if ((i & 32) != 0) {
            androidApplicationInfo = applicationInfo.androidAppInfo;
        }
        return applicationInfo.copy(str, str5, str6, str7, logEnvironment2, androidApplicationInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.google.firebase.sessions.LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final com.google.firebase.sessions.AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    public final com.google.firebase.sessions.ApplicationInfo copy(java.lang.String appId, java.lang.String deviceModel, java.lang.String sessionSdkVersion, java.lang.String osVersion, com.google.firebase.sessions.LogEnvironment logEnvironment, com.google.firebase.sessions.AndroidApplicationInfo androidAppInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new com.google.firebase.sessions.ApplicationInfo(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.firebase.sessions.ApplicationInfo)) {
            return false;
        }
        com.google.firebase.sessions.ApplicationInfo applicationInfo = (com.google.firebase.sessions.ApplicationInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.appId, applicationInfo.appId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceModel, applicationInfo.deviceModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && kotlin.jvm.internal.Intrinsics.areEqual(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    public int hashCode() {
        return (((((((((this.appId.hashCode() * 31) + this.deviceModel.hashCode()) * 31) + this.sessionSdkVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.logEnvironment.hashCode()) * 31) + this.androidAppInfo.hashCode();
    }

    public java.lang.String toString() {
        return "ApplicationInfo(appId=" + this.appId + ", deviceModel=" + this.deviceModel + ", sessionSdkVersion=" + this.sessionSdkVersion + ", osVersion=" + this.osVersion + ", logEnvironment=" + this.logEnvironment + ", androidAppInfo=" + this.androidAppInfo + ')';
    }

    public ApplicationInfo(java.lang.String appId, java.lang.String deviceModel, java.lang.String sessionSdkVersion, java.lang.String osVersion, com.google.firebase.sessions.LogEnvironment logEnvironment, com.google.firebase.sessions.AndroidApplicationInfo androidAppInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.appId = appId;
        this.deviceModel = deviceModel;
        this.sessionSdkVersion = sessionSdkVersion;
        this.osVersion = osVersion;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidAppInfo;
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    public final java.lang.String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final com.google.firebase.sessions.LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    public final com.google.firebase.sessions.AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }
}

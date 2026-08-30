package com.google.firebase.sessions;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "versionName", "appBuildVersion", "deviceManufacturer", "currentProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "appProcessDetails", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "getAppBuildVersion", "()Ljava/lang/String;", "getAppProcessDetails", "()Ljava/util/List;", "getCurrentProcessDetails", "()Lcom/google/firebase/sessions/ProcessDetails;", "getDeviceManufacturer", "getPackageName", "getVersionName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AndroidApplicationInfo {
    private final java.lang.String appBuildVersion;
    private final java.util.List<com.google.firebase.sessions.ProcessDetails> appProcessDetails;
    private final com.google.firebase.sessions.ProcessDetails currentProcessDetails;
    private final java.lang.String deviceManufacturer;
    private final java.lang.String packageName;
    private final java.lang.String versionName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.google.firebase.sessions.AndroidApplicationInfo copy$default(com.google.firebase.sessions.AndroidApplicationInfo androidApplicationInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.firebase.sessions.ProcessDetails processDetails, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((i & 2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        com.google.firebase.sessions.ProcessDetails processDetails2 = processDetails;
        if ((i & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        return androidApplicationInfo.copy(str, str5, str6, str7, processDetails2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getVersionName() {
        return this.versionName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.google.firebase.sessions.ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final java.util.List<com.google.firebase.sessions.ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    public final com.google.firebase.sessions.AndroidApplicationInfo copy(java.lang.String packageName, java.lang.String versionName, java.lang.String appBuildVersion, java.lang.String deviceManufacturer, com.google.firebase.sessions.ProcessDetails currentProcessDetails, java.util.List<com.google.firebase.sessions.ProcessDetails> appProcessDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionName, "versionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new com.google.firebase.sessions.AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.firebase.sessions.AndroidApplicationInfo)) {
            return false;
        }
        com.google.firebase.sessions.AndroidApplicationInfo androidApplicationInfo = (com.google.firebase.sessions.AndroidApplicationInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, androidApplicationInfo.packageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.versionName, androidApplicationInfo.versionName) && kotlin.jvm.internal.Intrinsics.areEqual(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    public int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
    }

    public java.lang.String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }

    public AndroidApplicationInfo(java.lang.String packageName, java.lang.String versionName, java.lang.String appBuildVersion, java.lang.String deviceManufacturer, com.google.firebase.sessions.ProcessDetails currentProcessDetails, java.util.List<com.google.firebase.sessions.ProcessDetails> appProcessDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionName, "versionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
        this.currentProcessDetails = currentProcessDetails;
        this.appProcessDetails = appProcessDetails;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final java.lang.String getVersionName() {
        return this.versionName;
    }

    public final java.lang.String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final com.google.firebase.sessions.ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final java.util.List<com.google.firebase.sessions.ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }
}

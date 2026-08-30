package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
class SettingsRequest {
    public final java.lang.String buildVersion;
    public final java.lang.String deviceModel;
    public final java.lang.String displayVersion;
    public final java.lang.String googleAppId;
    public final com.google.firebase.crashlytics.internal.common.InstallIdProvider installIdProvider;
    public final java.lang.String instanceId;
    public final java.lang.String osBuildVersion;
    public final java.lang.String osDisplayVersion;
    public final int source;

    public SettingsRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.firebase.crashlytics.internal.common.InstallIdProvider installIdProvider, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i) {
        this.googleAppId = str;
        this.deviceModel = str2;
        this.osBuildVersion = str3;
        this.osDisplayVersion = str4;
        this.installIdProvider = installIdProvider;
        this.instanceId = str5;
        this.displayVersion = str6;
        this.buildVersion = str7;
        this.source = i;
    }
}

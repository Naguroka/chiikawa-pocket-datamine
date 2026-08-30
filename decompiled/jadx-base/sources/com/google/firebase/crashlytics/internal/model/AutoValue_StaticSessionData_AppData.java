package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_StaticSessionData_AppData extends com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData {
    private final java.lang.String appIdentifier;
    private final int deliveryMechanism;
    private final com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider;
    private final java.lang.String installUuid;
    private final java.lang.String versionCode;
    private final java.lang.String versionName;

    AutoValue_StaticSessionData_AppData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null appIdentifier");
        }
        this.appIdentifier = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null versionCode");
        }
        this.versionCode = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null versionName");
        }
        this.versionName = str3;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null installUuid");
        }
        this.installUuid = str4;
        this.deliveryMechanism = i;
        if (developmentPlatformProvider == null) {
            throw new java.lang.NullPointerException("Null developmentPlatformProvider");
        }
        this.developmentPlatformProvider = developmentPlatformProvider;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String appIdentifier() {
        return this.appIdentifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String versionCode() {
        return this.versionCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String versionName() {
        return this.versionName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public java.lang.String installUuid() {
        return this.installUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.deliveryMechanism;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.developmentPlatformProvider;
    }

    public java.lang.String toString() {
        return "AppData{appIdentifier=" + this.appIdentifier + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", installUuid=" + this.installUuid + ", deliveryMechanism=" + this.deliveryMechanism + ", developmentPlatformProvider=" + this.developmentPlatformProvider + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData = (com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData) obj;
        return this.appIdentifier.equals(appData.appIdentifier()) && this.versionCode.equals(appData.versionCode()) && this.versionName.equals(appData.versionName()) && this.installUuid.equals(appData.installUuid()) && this.deliveryMechanism == appData.deliveryMechanism() && this.developmentPlatformProvider.equals(appData.developmentPlatformProvider());
    }

    public int hashCode() {
        return ((((((((((this.appIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.versionCode.hashCode()) * 1000003) ^ this.versionName.hashCode()) * 1000003) ^ this.installUuid.hashCode()) * 1000003) ^ this.deliveryMechanism) * 1000003) ^ this.developmentPlatformProvider.hashCode();
    }
}

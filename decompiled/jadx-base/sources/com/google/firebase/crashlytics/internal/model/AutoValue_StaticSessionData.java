package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_StaticSessionData extends com.google.firebase.crashlytics.internal.model.StaticSessionData {
    private final com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData;
    private final com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData;
    private final com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData;

    AutoValue_StaticSessionData(com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData, com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData, com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData) {
        if (appData == null) {
            throw new java.lang.NullPointerException("Null appData");
        }
        this.appData = appData;
        if (osData == null) {
            throw new java.lang.NullPointerException("Null osData");
        }
        this.osData = osData;
        if (deviceData == null) {
            throw new java.lang.NullPointerException("Null deviceData");
        }
        this.deviceData = deviceData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData appData() {
        return this.appData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData() {
        return this.osData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData deviceData() {
        return this.deviceData;
    }

    public java.lang.String toString() {
        return "StaticSessionData{appData=" + this.appData + ", osData=" + this.osData + ", deviceData=" + this.deviceData + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.StaticSessionData)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.StaticSessionData staticSessionData = (com.google.firebase.crashlytics.internal.model.StaticSessionData) obj;
        return this.appData.equals(staticSessionData.appData()) && this.osData.equals(staticSessionData.osData()) && this.deviceData.equals(staticSessionData.deviceData());
    }

    public int hashCode() {
        return ((((this.appData.hashCode() ^ 1000003) * 1000003) ^ this.osData.hashCode()) * 1000003) ^ this.deviceData.hashCode();
    }
}

package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_StaticSessionData_OsData extends com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData {
    private final boolean isRooted;
    private final java.lang.String osCodeName;
    private final java.lang.String osRelease;

    AutoValue_StaticSessionData_OsData(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null osRelease");
        }
        this.osRelease = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null osCodeName");
        }
        this.osCodeName = str2;
        this.isRooted = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public java.lang.String osRelease() {
        return this.osRelease;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public java.lang.String osCodeName() {
        return this.osCodeName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.isRooted;
    }

    public java.lang.String toString() {
        return "OsData{osRelease=" + this.osRelease + ", osCodeName=" + this.osCodeName + ", isRooted=" + this.isRooted + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData osData = (com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData) obj;
        return this.osRelease.equals(osData.osRelease()) && this.osCodeName.equals(osData.osCodeName()) && this.isRooted == osData.isRooted();
    }

    public int hashCode() {
        return ((((this.osRelease.hashCode() ^ 1000003) * 1000003) ^ this.osCodeName.hashCode()) * 1000003) ^ (this.isRooted ? 1231 : 1237);
    }
}

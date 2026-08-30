package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_InstallIdProvider_InstallIds extends com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds {
    private final java.lang.String crashlyticsInstallId;
    private final java.lang.String firebaseAuthenticationToken;
    private final java.lang.String firebaseInstallationId;

    AutoValue_InstallIdProvider_InstallIds(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null crashlyticsInstallId");
        }
        this.crashlyticsInstallId = str;
        this.firebaseInstallationId = str2;
        this.firebaseAuthenticationToken = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public java.lang.String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public java.lang.String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public java.lang.String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public java.lang.String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.crashlyticsInstallId + ", firebaseInstallationId=" + this.firebaseInstallationId + ", firebaseAuthenticationToken=" + this.firebaseAuthenticationToken + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds installIds = (com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds) obj;
        if (this.crashlyticsInstallId.equals(installIds.getCrashlyticsInstallId()) && ((str = this.firebaseInstallationId) != null ? str.equals(installIds.getFirebaseInstallationId()) : installIds.getFirebaseInstallationId() == null)) {
            java.lang.String str2 = this.firebaseAuthenticationToken;
            if (str2 == null) {
                if (installIds.getFirebaseAuthenticationToken() == null) {
                    return true;
                }
            } else if (str2.equals(installIds.getFirebaseAuthenticationToken())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.crashlyticsInstallId.hashCode() ^ 1000003) * 1000003;
        java.lang.String str = this.firebaseInstallationId;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.firebaseAuthenticationToken;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }
}

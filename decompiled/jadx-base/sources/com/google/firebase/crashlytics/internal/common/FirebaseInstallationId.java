package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: FirebaseInstallationId.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/crashlytics/internal/common/FirebaseInstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FirebaseInstallationId {
    private final java.lang.String authToken;
    private final java.lang.String fid;

    public static /* synthetic */ com.google.firebase.crashlytics.internal.common.FirebaseInstallationId copy$default(com.google.firebase.crashlytics.internal.common.FirebaseInstallationId firebaseInstallationId, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = firebaseInstallationId.fid;
        }
        if ((i & 2) != 0) {
            str2 = firebaseInstallationId.authToken;
        }
        return firebaseInstallationId.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getFid() {
        return this.fid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getAuthToken() {
        return this.authToken;
    }

    public final com.google.firebase.crashlytics.internal.common.FirebaseInstallationId copy(java.lang.String fid, java.lang.String authToken) {
        return new com.google.firebase.crashlytics.internal.common.FirebaseInstallationId(fid, authToken);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.firebase.crashlytics.internal.common.FirebaseInstallationId)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.common.FirebaseInstallationId firebaseInstallationId = (com.google.firebase.crashlytics.internal.common.FirebaseInstallationId) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fid, firebaseInstallationId.fid) && kotlin.jvm.internal.Intrinsics.areEqual(this.authToken, firebaseInstallationId.authToken);
    }

    public int hashCode() {
        java.lang.String str = this.fid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.authToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FirebaseInstallationId(fid=" + this.fid + ", authToken=" + this.authToken + ')';
    }

    public FirebaseInstallationId(java.lang.String str, java.lang.String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    public final java.lang.String getAuthToken() {
        return this.authToken;
    }

    public final java.lang.String getFid() {
        return this.fid;
    }
}

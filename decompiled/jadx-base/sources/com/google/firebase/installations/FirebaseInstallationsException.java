package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseInstallationsException extends com.google.firebase.FirebaseException {
    private final com.google.firebase.installations.FirebaseInstallationsException.Status status;

    public enum Status {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(com.google.firebase.installations.FirebaseInstallationsException.Status status) {
        this.status = status;
    }

    public FirebaseInstallationsException(java.lang.String str, com.google.firebase.installations.FirebaseInstallationsException.Status status) {
        super(str);
        this.status = status;
    }

    public FirebaseInstallationsException(java.lang.String str, com.google.firebase.installations.FirebaseInstallationsException.Status status, java.lang.Throwable th) {
        super(str, th);
        this.status = status;
    }

    public com.google.firebase.installations.FirebaseInstallationsException.Status getStatus() {
        return this.status;
    }
}

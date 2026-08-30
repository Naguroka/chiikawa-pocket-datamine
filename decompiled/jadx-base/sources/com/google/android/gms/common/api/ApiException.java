package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ApiException extends java.lang.Exception {

    @java.lang.Deprecated
    protected final com.google.android.gms.common.api.Status mStatus;

    public ApiException(com.google.android.gms.common.api.Status status) {
        super(status.getStatusCode() + ": " + (status.getStatusMessage() != null ? status.getStatusMessage() : ""));
        this.mStatus = status;
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @java.lang.Deprecated
    public java.lang.String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}

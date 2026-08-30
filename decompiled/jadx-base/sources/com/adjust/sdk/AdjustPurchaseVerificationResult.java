package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustPurchaseVerificationResult {
    private final int code;
    private final java.lang.String message;
    private final java.lang.String verificationStatus;

    public AdjustPurchaseVerificationResult(java.lang.String str, int i, java.lang.String str2) {
        this.verificationStatus = str;
        this.code = i;
        this.message = str2;
    }

    public int getCode() {
        return this.code;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.lang.String getVerificationStatus() {
        return this.verificationStatus;
    }
}

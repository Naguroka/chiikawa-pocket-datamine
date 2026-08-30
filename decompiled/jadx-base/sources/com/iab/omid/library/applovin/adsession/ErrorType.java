package com.iab.omid.library.applovin.adsession;

/* JADX INFO: loaded from: classes5.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO("video");

    private final java.lang.String errorType;

    ErrorType(java.lang.String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.errorType;
    }
}

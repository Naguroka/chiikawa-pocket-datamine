package com.applovin.impl.privacy.cmp;

/* JADX INFO: loaded from: classes3.dex */
public class CmpErrorImpl implements com.applovin.sdk.AppLovinCmpError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.sdk.AppLovinCmpError.Code f1155a;
    private final java.lang.String b;
    private final int c;
    private final java.lang.String d;

    public CmpErrorImpl(com.applovin.sdk.AppLovinCmpError.Code code, java.lang.String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public java.lang.String getCmpMessage() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public com.applovin.sdk.AppLovinCmpError.Code getCode() {
        return this.f1155a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public java.lang.String getMessage() {
        return this.b;
    }

    public java.lang.String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(com.applovin.sdk.AppLovinCmpError.Code code, java.lang.String str, int i, java.lang.String str2) {
        this.f1155a = code;
        this.b = str;
        this.c = i;
        this.d = str2;
    }
}

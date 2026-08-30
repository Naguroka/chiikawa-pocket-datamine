package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0780Jh extends java.lang.Exception {
    public final com.facebook.ads.internal.protocol.AdErrorType A00;
    public final java.lang.String A01;

    public C0780Jh(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        this(adErrorType, str, null);
    }

    public C0780Jh(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public final com.facebook.ads.internal.protocol.AdErrorType A00() {
        return this.A00;
    }

    public final java.lang.String A01() {
        return this.A01;
    }
}

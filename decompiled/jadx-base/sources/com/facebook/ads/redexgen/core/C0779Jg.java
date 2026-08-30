package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0779Jg {
    public final com.facebook.ads.internal.protocol.AdErrorType A00;
    public final java.lang.String A01;

    public C0779Jg(int i, java.lang.String str) {
        this(com.facebook.ads.internal.protocol.AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C0779Jg(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        str = android.text.TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static com.facebook.ads.redexgen.core.C0779Jg A00(com.facebook.ads.internal.protocol.AdErrorType adErrorType) {
        return new com.facebook.ads.redexgen.core.C0779Jg(adErrorType, (java.lang.String) null);
    }

    public static com.facebook.ads.redexgen.core.C0779Jg A01(com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C0779Jg(adErrorType, str);
    }

    public static com.facebook.ads.redexgen.core.C0779Jg A02(com.facebook.ads.redexgen.core.C0780Jh c0780Jh) {
        return new com.facebook.ads.redexgen.core.C0779Jg(c0780Jh.A00(), c0780Jh.A01());
    }

    public final com.facebook.ads.internal.protocol.AdErrorType A03() {
        return this.A00;
    }

    public final java.lang.String A04() {
        return this.A01;
    }
}

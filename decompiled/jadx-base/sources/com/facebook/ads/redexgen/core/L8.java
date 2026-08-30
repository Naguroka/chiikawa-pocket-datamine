package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class L8 {
    public static com.facebook.ads.AdError A00(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        if (c0779Jg.A03().isPublicError()) {
            return new com.facebook.ads.AdError(c0779Jg.A03().getErrorCode(), c0779Jg.A04());
        }
        return new com.facebook.ads.AdError(com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR.getErrorCode(), com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}

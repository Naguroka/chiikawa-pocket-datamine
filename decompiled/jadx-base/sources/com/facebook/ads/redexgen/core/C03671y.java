package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public /* synthetic */ class C03671y {
    public static final /* synthetic */ int[] A00 = new int[com.facebook.ads.AdSettings.IntegrationErrorMode.values().length];

    static {
        try {
            A00[com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            A00[com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}

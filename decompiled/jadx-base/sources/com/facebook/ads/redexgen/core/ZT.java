package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZT implements com.facebook.ads.redexgen.core.InterfaceC05037o {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C7j A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public ZT(com.facebook.ads.redexgen.core.C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A6c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A7R() {
        return com.facebook.ads.redexgen.core.KE.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A7S() {
        return com.facebook.ads.internal.bridge.fbsdk.FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A7n() {
        return com.facebook.ads.internal.settings.AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A7t() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final com.facebook.ads.redexgen.core.C7n A8D() {
        com.facebook.ads.internal.bridge.gms.AdvertisingId advertisingIdInfoDirectly = com.facebook.ads.internal.bridge.gms.AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.ZU(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A8d() {
        return com.facebook.ads.internal.settings.AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A8f() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final java.lang.String A8g() {
        return com.facebook.ads.internal.api.BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05037o
    public final boolean A9O() {
        return com.facebook.ads.internal.api.BuildConfigApi.isDebug();
    }
}

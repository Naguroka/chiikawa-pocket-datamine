package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZU implements com.facebook.ads.redexgen.core.C7n {
    public final /* synthetic */ com.facebook.ads.internal.bridge.gms.AdvertisingId A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.ZT A01;

    public ZU(com.facebook.ads.redexgen.core.ZT zt, com.facebook.ads.internal.bridge.gms.AdvertisingId advertisingId) {
        this.A01 = zt;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.core.C7n
    public final boolean A9W() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.core.C7n
    public final java.lang.String getId() {
        return this.A00.getId();
    }
}

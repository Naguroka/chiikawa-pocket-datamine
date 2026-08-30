package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1345cH implements com.facebook.ads.redexgen.core.InterfaceC03320p {
    public int A00;
    public long A01;
    public com.facebook.ads.RewardData A02;

    public abstract int A0G();

    public abstract com.facebook.ads.redexgen.core.C1E A0H();

    public abstract boolean A0I();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(com.facebook.ads.RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final com.facebook.ads.internal.protocol.AdPlacementType A82() {
        return com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO;
    }
}

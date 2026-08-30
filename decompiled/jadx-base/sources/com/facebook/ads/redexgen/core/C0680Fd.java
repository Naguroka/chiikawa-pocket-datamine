package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0680Fd extends com.facebook.ads.redexgen.core.AbstractC1310bi {
    public static final com.facebook.ads.redexgen.core.AnonymousClass25 A02 = new com.facebook.ads.redexgen.core.C1297bV();
    public com.facebook.ads.redexgen.core.C1303bb A00;
    public final com.facebook.ads.redexgen.core.C1299bX A01;

    public C0680Fd(com.facebook.ads.redexgen.core.C1299bX c1299bX, java.lang.String str) {
        super(c1299bX.A05(), str, A02.A53(c1299bX));
        this.A01 = c1299bX;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1310bi
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AGM(com.facebook.ads.redexgen.core.EnumC03681z.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1310bi
    public final void A09() {
        this.A00 = new com.facebook.ads.redexgen.core.C1303bb(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    public final void A0D(com.facebook.ads.InterstitialAd interstitialAd, java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags, java.lang.String str) {
        if (super.A00.A5z()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (com.facebook.ads.redexgen.core.AbstractC0764Ip.A07(this.A02) && com.facebook.ads.redexgen.core.AbstractC0764Ip.A08(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(com.facebook.ads.RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(1013, com.facebook.ads.redexgen.core.C2K.A00(new android.os.Bundle(), rewardData));
        }
    }

    public final boolean A0F() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && com.facebook.ads.redexgen.core.C0841Lu.A00() > this.A01.A00();
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6J() == com.facebook.ads.redexgen.core.EnumC03681z.A05;
    }

    public final boolean A0H(com.facebook.ads.InterstitialAd interstitialAd, com.facebook.ads.InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A60()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        }
        if (this.A00 != null) {
            return this.A00.A0J();
        }
        this.A00 = new com.facebook.ads.redexgen.core.C1303bb(this.A01, this, A04());
        this.A00.A0J();
        return false;
    }
}

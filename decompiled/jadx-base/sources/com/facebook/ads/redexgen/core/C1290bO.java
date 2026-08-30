package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1290bO implements com.facebook.ads.redexgen.core.InterfaceC04967f {
    public int A00 = -1;
    public long A01 = -1;
    public com.facebook.ads.AdExperienceType A02;
    public com.facebook.ads.RewardData A03;
    public com.facebook.ads.RewardedVideoAdListener A04;
    public java.lang.String A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public boolean A08;
    public com.facebook.ads.Ad A09;
    public java.lang.ref.WeakReference<com.facebook.ads.Ad> A0A;
    public final com.facebook.ads.redexgen.core.C1199Zs A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC05148d A0C;
    public final java.lang.String A0D;

    public C1290bO(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.Ad ad, com.facebook.ads.redexgen.core.InterfaceC05148d interfaceC05148d) {
        this.A0B = c1199Zs;
        this.A0D = str;
        this.A09 = ad;
        this.A0A = new java.lang.ref.WeakReference<>(ad);
        this.A0C = interfaceC05148d;
        c1199Zs.A0M(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC04967f
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.RewardedVideoAdListener A6I() {
        return this.A04;
    }

    public final com.facebook.ads.redexgen.core.C1199Zs A01() {
        return this.A0B;
    }

    public final void A02(com.facebook.ads.Ad ad) {
        if (ad == null && !com.facebook.ads.redexgen.core.C0762Im.A0r(this.A0B)) {
            return;
        }
        this.A09 = ad;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04967f
    public final com.facebook.ads.Ad A6E() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}

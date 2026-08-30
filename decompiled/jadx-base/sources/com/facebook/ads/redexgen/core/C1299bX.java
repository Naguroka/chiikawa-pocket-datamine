package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1299bX implements com.facebook.ads.redexgen.core.InterfaceC04967f {
    public long A00;
    public com.facebook.ads.InterstitialAd A01;
    public com.facebook.ads.InterstitialAdListener A02;
    public com.facebook.ads.RewardData A03;
    public com.facebook.ads.RewardedAdListener A04;
    public java.lang.String A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public java.util.EnumSet<com.facebook.ads.CacheFlag> A08;
    public final com.facebook.ads.redexgen.core.InterfaceC05148d A09;
    public final com.facebook.ads.redexgen.core.C1199Zs A0A;
    public final java.lang.String A0B;
    public final java.lang.ref.WeakReference<com.facebook.ads.InterstitialAd> A0C;

    public C1299bX(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.InterstitialAd interstitialAd, java.lang.String str) {
        this(c1199Zs, interstitialAd, str, new com.facebook.ads.redexgen.core.C1309bh());
    }

    public C1299bX(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.InterstitialAd interstitialAd, java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC05148d interfaceC05148d) {
        this.A0A = c1199Zs;
        this.A0B = str;
        this.A01 = interstitialAd;
        this.A0C = new java.lang.ref.WeakReference<>(interstitialAd);
        this.A00 = -1L;
        c1199Zs.A0M(this);
        this.A09 = interfaceC05148d;
    }

    public final long A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04967f
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.InterstitialAd A6E() {
        return this.A01 != null ? this.A01 : this.A0C.get();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04967f
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.InterstitialAdListener A6I() {
        return this.A02;
    }

    public final com.facebook.ads.RewardData A03() {
        return this.A03;
    }

    public final com.facebook.ads.RewardedAdListener A04() {
        return this.A04;
    }

    public final com.facebook.ads.redexgen.core.C1199Zs A05() {
        return this.A0A;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC05148d A06() {
        return this.A09;
    }

    public final java.lang.String A07() {
        return this.A05;
    }

    public final java.lang.String A08() {
        return this.A06;
    }

    public final java.lang.String A09() {
        return this.A07;
    }

    public final java.lang.String A0A() {
        return this.A0B;
    }

    public final java.util.EnumSet<com.facebook.ads.CacheFlag> A0B() {
        return this.A08;
    }

    public final void A0C(long j) {
        this.A00 = j;
    }

    public final void A0D(com.facebook.ads.InterstitialAd interstitialAd) {
        if (interstitialAd == null && !com.facebook.ads.redexgen.core.C0762Im.A0r(this.A0A)) {
            return;
        }
        this.A01 = interstitialAd;
    }

    public final void A0E(com.facebook.ads.InterstitialAdListener interstitialAdListener) {
        this.A02 = interstitialAdListener;
    }

    public final void A0F(com.facebook.ads.RewardData rewardData) {
        this.A03 = rewardData;
    }

    public final void A0G(com.facebook.ads.RewardedAdListener rewardedAdListener) {
        this.A04 = rewardedAdListener;
    }

    public final void A0H(java.lang.String str) {
        this.A05 = str;
    }

    public final void A0I(java.lang.String str) {
        this.A06 = str;
    }

    public final void A0J(java.lang.String str) {
        this.A07 = str;
    }

    public final void A0K(java.util.EnumSet<com.facebook.ads.CacheFlag> flags) {
        this.A08 = flags;
    }
}

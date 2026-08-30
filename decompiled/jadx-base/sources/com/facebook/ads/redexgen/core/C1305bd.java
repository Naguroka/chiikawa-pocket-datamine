package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1305bd extends com.facebook.ads.redexgen.core.AbstractC03330q {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1303bb A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, okio.Utf8.REPLACEMENT_BYTE, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C1305bd(com.facebook.ads.redexgen.core.C1303bb c1303bb) {
        this.A00 = c1303bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A02() {
        if (this.A00.A01 == null) {
            this.A00.A04 = false;
            this.A00.A07.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A04() {
        if (this.A00.A01 != null) {
            this.A00.A01.show();
            return;
        }
        this.A00.A04 = false;
        if (this.A00.A03 != null && com.facebook.ads.redexgen.core.C0762Im.A22(this.A00.A06)) {
            this.A00.A03.A0R(new com.facebook.ads.redexgen.core.C1306be(this));
            this.A00.A03.A0M();
            this.A00.A03.A0J();
            this.A00.A03 = null;
        }
        this.A00.A07.onInterstitialDismissed(this.A00.A08.A6E());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A05() {
        this.A00.A07.onInterstitialDisplayed(this.A00.A08.A6E());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A06() {
        this.A00.A07.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A07() {
        this.A00.A07.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A08() {
        this.A00.A07.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0C() {
        this.A00.A06.A0E().A35();
        this.A00.A07.onAdClicked(this.A00.A08.A6E());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0D() {
        this.A00.A07.onLoggingImpression(this.A00.A08.A6E());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0E(android.view.View view) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0F(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p) {
        if (this.A00.A03 != null) {
            this.A00.A05 = true;
            this.A00.A02 = this.A00.A03.A0H();
            if (!(this.A00.A02 instanceof com.facebook.ads.redexgen.core.AbstractC1341cD)) {
                com.facebook.ads.InterstitialAdExtendedListener interstitialAdExtendedListener = this.A00.A07;
                java.lang.String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    java.lang.String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    interstitialAdExtendedListener.onAdLoaded(this.A00.A08.A6E());
                    return;
                }
            } else {
                final com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD = (com.facebook.ads.redexgen.core.AbstractC1341cD) this.A00.A02;
                if (abstractC1341cD.A1N() > 0) {
                    com.facebook.ads.redexgen.core.L6 l6 = new com.facebook.ads.redexgen.core.L6();
                    if (l6.A09(this.A00.A06, this.A00.A08.A08(), abstractC1341cD.A1N())) {
                        l6.A08(this.A00.A06, true);
                        this.A00.A01 = l6.A06(this.A00.A06, this.A00.A08.A0A(), this.A00.A08.A08());
                    } else {
                        com.facebook.ads.redexgen.core.C1303bb c1303bb = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            l6.A08(c1303bb.A06, false);
                        } else {
                            java.lang.String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            l6.A08(c1303bb.A06, false);
                        }
                    }
                }
                com.facebook.ads.redexgen.core.C1303bb c1303bb2 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    if (c1303bb2.A01 != null) {
                        abstractC1341cD.A1Z(true);
                        com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig loadAdConfig = this.A00.A01.buildLoadAdConfig().withAdListener(new com.facebook.ads.InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.23
                            @Override // com.facebook.ads.AdListener
                            public final void onAdClicked(com.facebook.ads.Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onAdLoaded(com.facebook.ads.Ad ad) {
                                this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6E());
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
                                this.A01.A00.A01 = null;
                                abstractC1341cD.A1Z(false);
                                this.A01.A00.A07.onAdLoaded(this.A01.A00.A08.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
                                this.A01.A00.A04 = false;
                                if (this.A01.A00.A03 != null) {
                                    this.A01.A00.A03.A0R(new com.facebook.ads.redexgen.core.C1307bf(this));
                                    this.A01.A00.A03.A0M();
                                    this.A01.A00.A03.A0J();
                                    this.A01.A00.A03 = null;
                                }
                                this.A01.A00.A07.onInterstitialDismissed(this.A01.A00.A08.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onLoggingImpression(com.facebook.ads.Ad ad) {
                            }
                        }).withCacheFlags(this.A00.A08.A0B()).withRewardData(this.A00.A08.A03()).build();
                        this.A00.A01.loadAd(loadAdConfig);
                        return;
                    }
                    com.facebook.ads.redexgen.core.C1303bb c1303bb3 = this.A00;
                    java.lang.String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        c1303bb3.A07.onAdLoaded(this.A00.A08.A6E());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        c1303bb3.A07.onAdLoaded(this.A00.A08.A6E());
                        return;
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
        this.A00.A06.A07().AA0(A00(0, 3, 98), com.facebook.ads.redexgen.core.C8E.A0N, new com.facebook.ads.redexgen.core.C8F(A00(3, 18, 46)));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0G(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        this.A00.A06.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00.A00), c0779Jg.A03().getErrorCode(), c0779Jg.A04());
        this.A00.A07.onError(this.A00.A08.A6E(), com.facebook.ads.redexgen.core.L8.A00(c0779Jg));
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1296bU implements com.facebook.ads.redexgen.core.C2C {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"41kFMkgYcMqjBdEAHWyZzQ9Q1YQDMkZo", "a1qrqbdzoLKte5dp2TdqsHV2Btmo8HIO", "VlRnhGghZyM7Xz", "WVmrs7jRPAo6ieNv", "abQhu9SgesOIRxLkCU6L7yAdrfeNFYXV", "iVqBhi5IkesALAcr", "e6wMTa30i0R6i9", "GTVyj1NjpD4uWxM1mBTnBnh1LH0X6W6g"};
    public final com.facebook.ads.redexgen.core.AbstractC1310bi A00;
    public final com.facebook.ads.redexgen.core.AnonymousClass20 A01;
    public final com.facebook.ads.redexgen.core.C1299bX A02;
    public final com.facebook.ads.redexgen.core.AnonymousClass27 A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{110, 75, 15, 64, 77, 69, 74, 76, 91, 15, 70, 92, 15, 65, 90, 67, 67, 9, 30, 5, 15, 7, 14, 20, 14, 19, 31, 25, 10, 24, 20, 0, 14, 18, 47, 43, 40, 28, 13, 0, 12, 7, 10, 12, 39, 12, 29, 30, 6, 27, 2, 87, 80, 74, 65, 91, 76, 76, 81, 76, 65, 93, 81, 90, 91, 65, 85, 91, 71, 14, 13, 12, 5, 29, 11, 12, 20, 3, 14, 11, 6, 3, 22, 11, 13, 12, 29, 22, 11, 15, 7, 29, 9, 7, 27, 39, 15, 25, 25, 11, 13, 15, 80, 74, 118, 82, 72, 72, 82, 85, 92, 27, 89, 78, 85, 95, 87, 94, 27, 93, 84, 73, 27, 86, 94, 72, 72, 90, 92, 94, 21, 35, 36, 34, 47, 53, 34, 34, okio.Utf8.REPLACEMENT_BYTE, 34, 47, kotlin.io.encoding.Base64.padSymbol, 53, 35, 35, 49, 55, 53, 47, 59, 53, 41, 72, 89, 64};
    }

    static {
        A01();
    }

    public C1296bU(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1299bX c1299bX, com.facebook.ads.redexgen.core.AnonymousClass20 anonymousClass20, com.facebook.ads.redexgen.core.AbstractC1310bi abstractC1310bi, com.facebook.ads.redexgen.core.AnonymousClass27 anonymousClass27) {
        this.A04 = c1199Zs;
        this.A02 = c1299bX;
        this.A01 = anonymousClass20;
        this.A00 = abstractC1310bi;
        this.A03 = anonymousClass27;
    }

    @Override // com.facebook.ads.redexgen.core.C2C
    public final android.os.Bundle A50(java.lang.String str) {
        return com.facebook.ads.redexgen.core.C2J.A02(str, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.C2C
    public final void A5S() {
        this.A03.A0F(1012, null);
        this.A03.A0C();
        this.A02.A0D(null);
    }

    @Override // com.facebook.ads.redexgen.core.C2C
    public final int A7h() {
        return 1010;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0111  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:35:0x0128 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:39:0x0139  */
    /* JADX WARN: Code duplicated, block: B:40:0x0143  */
    /* JADX WARN: Code duplicated, block: B:42:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.C2C
    public final void A8u(android.os.Message message) {
        int i;
        java.lang.String[] strArr;
        com.facebook.ads.InterstitialAd interstitialAdA6E = this.A02.A6E();
        java.lang.String strA00 = A00(org.objectweb.asm.Opcodes.DCMPG, 3, 89);
        if (interstitialAdA6E == null) {
            this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0K, new com.facebook.ads.redexgen.core.C8F(A00(0, 17, 95)));
            return;
        }
        int i2 = message.what;
        java.lang.String strA01 = A00(95, 9, 26);
        java.lang.String strA02 = A00(104, 27, 75);
        java.lang.String strA03 = A00(17, 17, 59);
        switch (i2) {
            case 10:
            case 1023:
                android.os.Bundle bundle = message.getData().getBundle(strA03);
                if (bundle != null) {
                    int i3 = bundle.getInt(A00(51, 18, 110));
                    java.lang.String string = bundle.getString(A00(org.objectweb.asm.Opcodes.LXOR, 21, 0));
                    com.facebook.ads.AdError adError = new com.facebook.ads.AdError(i3, string);
                    this.A01.AGQ(adError);
                    if (this.A02.A6I() != null) {
                        this.A02.A6I().onError(interstitialAdA6E, adError);
                    } else {
                        android.util.Log.e(A00(34, 17, 25), string);
                    }
                } else {
                    this.A01.AGM(com.facebook.ads.redexgen.core.EnumC03681z.A04);
                    this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0V, new com.facebook.ads.redexgen.core.C8F(strA02, strA01 + message));
                }
                this.A02.A0D(null);
                return;
            case 1020:
                this.A01.AGV();
                android.os.Bundle bundle2 = message.getData().getBundle(strA03);
                if (bundle2 != null) {
                    this.A02.A0C(bundle2.getLong(A00(69, 26, 50)));
                } else {
                    this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0V, new com.facebook.ads.redexgen.core.C8F(strA02, strA01 + message));
                }
                this.A02.A0D(null);
                break;
            case 1022:
                this.A01.AGf();
                break;
        }
        if (this.A02.A6I() == null) {
            return;
        }
        int i4 = message.what;
        java.lang.String[] strArr2 = A06;
        if (strArr2[4].charAt(13) == strArr2[7].charAt(13)) {
            java.lang.String[] strArr3 = A06;
            strArr3[1] = "311XYum1gU07qORRQ11S6l3eVKorNtDz";
            strArr3[0] = "91xN7y0ETPjwD6LsGrgnzhnoOTtOTKl3";
            switch (i4) {
                case 1020:
                    this.A02.A6I().onAdLoaded(interstitialAdA6E);
                    return;
                case 1021:
                    this.A02.A6I().onInterstitialDisplayed(interstitialAdA6E);
                    return;
                case 1022:
                    this.A02.A6I().onInterstitialDismissed(interstitialAdA6E);
                    return;
                case 1023:
                default:
                    if (this.A02.A04() == null) {
                        return;
                    }
                    i = message.what;
                    strArr = A06;
                    if (strArr[5].length() != strArr[3].length()) {
                        switch (i) {
                            case 3000:
                                this.A02.A04().onRewardedAdCompleted();
                                return;
                            case 3001:
                                this.A02.A04().onRewardedAdServerSucceeded();
                                return;
                            case 3002:
                                this.A02.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                    java.lang.String[] strArr4 = A06;
                    strArr4[4] = "s5jamizIFVbotxZqKkKlcngcWbLxgQvF";
                    strArr4[7] = "aiBjTIjz8RGRWx4VpHoYFj9LDTOMQV9R";
                    switch (i) {
                        case 3000:
                            this.A02.A04().onRewardedAdCompleted();
                            return;
                        case 3001:
                            this.A02.A04().onRewardedAdServerSucceeded();
                            return;
                        case 3002:
                            this.A02.A04().onRewardedAdServerFailed();
                            return;
                        default:
                            return;
                    }
                case 1024:
                    this.A02.A6I().onAdClicked(interstitialAdA6E);
                    return;
                case 1025:
                    this.A02.A6I().onLoggingImpression(interstitialAdA6E);
                    return;
                case 1026:
                    boolean z = this.A02.A6I() instanceof com.facebook.ads.InterstitialAdExtendedListener;
                    java.lang.String[] strArr5 = A06;
                    if (strArr5[2].length() == strArr5[6].length()) {
                        java.lang.String[] strArr6 = A06;
                        strArr6[2] = "qw7ApZ7ipfHbwj";
                        strArr6[6] = "LJsV5SavG50yIX";
                        if (z) {
                            ((com.facebook.ads.InterstitialAdExtendedListener) this.A02.A6I()).onInterstitialActivityDestroyed();
                        }
                        if (this.A02.A04() == null) {
                            return;
                        }
                        i = message.what;
                        strArr = A06;
                        if (strArr[5].length() != strArr[3].length()) {
                            switch (i) {
                                case 3000:
                                    this.A02.A04().onRewardedAdCompleted();
                                    return;
                                case 3001:
                                    this.A02.A04().onRewardedAdServerSucceeded();
                                    return;
                                case 3002:
                                    this.A02.A04().onRewardedAdServerFailed();
                                    return;
                                default:
                                    return;
                            }
                        }
                        java.lang.String[] strArr7 = A06;
                        strArr7[4] = "s5jamizIFVbotxZqKkKlcngcWbLxgQvF";
                        strArr7[7] = "aiBjTIjz8RGRWx4VpHoYFj9LDTOMQV9R";
                        switch (i) {
                            case 3000:
                                this.A02.A04().onRewardedAdCompleted();
                                return;
                            case 3001:
                                this.A02.A04().onRewardedAdServerSucceeded();
                                return;
                            case 3002:
                                this.A02.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                    break;
            }
        }
        throw new java.lang.RuntimeException();
    }
}

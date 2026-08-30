package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class K9 {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final com.facebook.ads.redexgen.core.M6 A09;
    public static final java.util.concurrent.Executor A0A;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.KD> A0B;
    public long A00;
    public com.facebook.ads.redexgen.core.K8 A01;
    public java.util.Map<java.lang.String, java.lang.String> A02;
    public final com.facebook.ads.redexgen.core.C2S A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;
    public final com.facebook.ads.redexgen.core.KA A05;
    public final java.lang.String A06;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{112, 115, -101, 113, 106, -101, -97, 106, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, 89, -117, -121, 115, 89, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, 11, -30, 5, 8, 8, -28, 11, 11, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0A();
        A09 = new com.facebook.ads.redexgen.core.M6();
        A0A = java.util.concurrent.Executors.newCachedThreadPool(A09);
        A0B = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public K9(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(c1199Zs, com.facebook.ads.redexgen.core.C2T.A00(c1199Zs.A01()));
    }

    public K9(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C2S c2s) {
        this.A00 = -1L;
        this.A04 = c1199Zs;
        this.A05 = com.facebook.ads.redexgen.core.KA.A00();
        this.A06 = com.facebook.ads.redexgen.core.KE.A01(c1199Zs);
        this.A03 = c2s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.C1103Vx A02(long j, com.facebook.ads.redexgen.core.K6 k6) {
        return new com.facebook.ads.redexgen.core.C1103Vx(this, k6, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A04 == null || !com.facebook.ads.redexgen.core.S8.A0A(this.A04)) {
            return;
        }
        com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A05(8, 5, 102));
        c8f.A05(1);
        this.A04.A07().AA0(A05(86, 7, 32), com.facebook.ads.redexgen.core.C8E.A1x, c8f);
    }

    private void A0B(int i, java.lang.String str) {
        java.lang.String strA05 = A05(37, 16, 59);
        java.lang.String strA06 = A05(0, 8, 1);
        java.lang.String strA07 = A05(93, 10, 99);
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(strA07, strA05, strA06);
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A04(strA07, java.lang.String.format(java.util.Locale.US, A05(53, 26, 82), java.lang.Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        if (this.A01 != null) {
            this.A01.ABs(c0779Jg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new com.facebook.ads.redexgen.core.C1101Vv(this, c0779Jg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(com.facebook.ads.redexgen.core.Vu vu) {
        if (this.A01 != null) {
            this.A01.ADj(vu);
        } else {
            if (vu.A00() == null || vu.A00().A06() == null) {
                return;
            }
            com.facebook.ads.redexgen.core.C0805Kh.A00(this.A04).A0D(vu.A00().A06().toString(), vu.A00().A0B());
        }
    }

    private void A0L(com.facebook.ads.redexgen.core.Vu vu) {
        com.facebook.ads.redexgen.core.InterfaceC05047p syncModule;
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new com.facebook.ads.redexgen.core.C1102Vw(this, vu));
        if (com.facebook.ads.redexgen.core.C0762Im.A2R(this.A04) && (syncModule = this.A04.A05()) != null) {
            syncModule.A68();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(java.lang.String str, long j, com.facebook.ads.redexgen.core.K6 k6) {
        java.lang.String str2;
        try {
            try {
                com.facebook.ads.redexgen.core.KC kcA06 = this.A05.A06(this.A04, str, j);
                com.facebook.ads.redexgen.core.C8W c8wA00 = kcA06.A00();
                if (c8wA00 != null) {
                    com.facebook.ads.redexgen.core.C0762Im.A0T(this.A04).A2t(c8wA00.A0A());
                    if (com.facebook.ads.redexgen.core.C0762Im.A0u(this.A04) && c8wA00.A08() != null) {
                        com.facebook.ads.redexgen.core.AbstractC05178g.A04(this.A04.A01(), c8wA00.A08());
                    }
                    if (com.facebook.ads.redexgen.core.C0762Im.A0v(this.A04) && c8wA00.A0D() != null) {
                        com.facebook.ads.redexgen.core.AbstractC05178g.A05(this.A04.A01(), c8wA00.A0D());
                    }
                    this.A04.A07().AAl();
                    this.A03.A0N(c8wA00.A07());
                    com.facebook.ads.redexgen.core.K5.A05(c8wA00.A05().A0B(), k6);
                    com.facebook.ads.redexgen.core.MH.A01(this.A04, A0A, c8wA00);
                    com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A05(30, 7, 0) + com.facebook.ads.redexgen.core.LQ.A02());
                    c8f.A06(1);
                    c8f.A0A(false);
                    this.A04.A07().AAa(A05(79, 7, 63), com.facebook.ads.redexgen.core.C8E.A1W, c8f);
                }
                switch (kcA06.A01()) {
                    case A02:
                        com.facebook.ads.redexgen.core.Vu vu = (com.facebook.ads.redexgen.core.Vu) kcA06;
                        if (c8wA00 != null) {
                            if (c8wA00.A05().A0E()) {
                                com.facebook.ads.redexgen.core.K5.A07(str, k6);
                            }
                            if (this.A02 != null) {
                                str2 = this.A02.get(A05(13, 17, 107));
                            } else {
                                str2 = null;
                            }
                            if (!android.text.TextUtils.isEmpty(kcA06.A02()) && !android.text.TextUtils.isEmpty(str2)) {
                                this.A04.A02().AFp(this.A04, str2, kcA06.A02());
                            }
                        }
                        this.A04.A0E().A3I(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00));
                        A0L(vu);
                        break;
                    case A03:
                        com.facebook.ads.redexgen.core.C1100Vt c1100Vt = (com.facebook.ads.redexgen.core.C1100Vt) kcA06;
                        java.lang.String strA04 = c1100Vt.A04();
                        com.facebook.ads.internal.protocol.AdErrorType adErrorTypeAdErrorTypeFromCode = com.facebook.ads.internal.protocol.AdErrorType.adErrorTypeFromCode(c1100Vt.A03(), com.facebook.ads.internal.protocol.AdErrorType.ERROR_MESSAGE);
                        A0B(c1100Vt.A03(), strA04);
                        if (strA04 == null) {
                            strA04 = str;
                        }
                        this.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                        A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorTypeAdErrorTypeFromCode, strA04));
                        break;
                    default:
                        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_RESPONSE;
                        this.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType, str));
                        break;
                }
            } catch (java.lang.Exception e) {
                e = e;
                java.lang.String message = e.getMessage();
                com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.PARSER_FAILURE;
                this.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType2, message));
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(java.lang.String str, long j, com.facebook.ads.redexgen.core.K6 k6) {
        A0A.execute(new com.facebook.ads.redexgen.core.C1104Vy(this, str, j, k6));
    }

    private boolean A0O(com.facebook.ads.redexgen.core.K6 k6) {
        java.lang.String string = k6.A06().toString();
        if (com.facebook.ads.redexgen.core.C0805Kh.A00(this.A04).A0F(string)) {
            return false;
        }
        int iA0A = com.facebook.ads.redexgen.core.C0805Kh.A00(this.A04).A0A(string);
        int storedAdsCount = com.facebook.ads.redexgen.core.C0762Im.A0H(this.A04);
        int iA09 = com.facebook.ads.redexgen.core.C0805Kh.A00(this.A04).A09(string);
        if (iA0A >= storedAdsCount || iA0A > iA09) {
            com.facebook.ads.redexgen.core.C0805Kh c0805KhA00 = com.facebook.ads.redexgen.core.C0805Kh.A00(this.A04);
            java.lang.String type = k6.A06().toString();
            android.util.Pair<java.lang.String, java.lang.String> pairA0B = c0805KhA00.A0B(type);
            if (pairA0B != null) {
                java.lang.Object obj = pairA0B.second;
                java.lang.String[] strArr = A08;
                java.lang.String str = strArr[1];
                java.lang.String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A08;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && pairA0B.first != null) {
                    A0N(pairA0B.second.toString(), 0L, k6);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0P(com.facebook.ads.redexgen.core.K6 k6) {
        this.A00 = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.C8N.A0B(this.A04);
        A0B.get();
        if (0 != 0) {
            throw new java.lang.NullPointerException(A05(103, 7, 52));
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A02(this.A04) > 0 && A0O(k6)) {
            return;
        }
        if (com.facebook.ads.redexgen.core.K5.A08(k6)) {
            com.facebook.ads.redexgen.core.M8.A06.execute(new com.facebook.ads.redexgen.core.W0(this));
            java.lang.String strA02 = com.facebook.ads.redexgen.core.K5.A02(k6);
            if (strA02 != null) {
                this.A04.A0E().AHL();
                A0N(strA02, 0L, k6);
                return;
            } else {
                com.facebook.ads.internal.protocol.AdErrorType error = com.facebook.ads.internal.protocol.AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0E().A3H(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0D(com.facebook.ads.redexgen.core.C0779Jg.A01(error, null));
                return;
            }
        }
        A0A.execute(new com.facebook.ads.redexgen.core.C1105Vz(this, k6));
    }

    public final void A0Q(com.facebook.ads.redexgen.core.K8 k8) {
        this.A01 = k8;
    }
}

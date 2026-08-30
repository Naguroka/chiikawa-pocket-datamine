package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y7 implements com.facebook.ads.redexgen.core.D3 {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"U6xxaTgwnpyvNF7dBrF7jy8H0ccYS7uh", "pwqCU4MsG0tpC07kMa2Cozx", "ro9PG3kfplkcrc4zDf47Uz", "tgqRKbRXEgm18AdaPVJDwdGzzx4woeSa", "ILDgXZMCDuz6PSZvyES1oo4T", "cxVIvU", "tSDqSS", "Q0WPqxsOUB7bJ5SYfd3WG"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public com.facebook.ads.redexgen.core.C9 A05;
    public java.lang.String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final com.facebook.ads.redexgen.core.D4 A0B = new com.facebook.ads.redexgen.core.D4(128);

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            java.lang.String[] strArr = A0E;
            if (strArr[3].charAt(9) == strArr[0].charAt(9)) {
                throw new java.lang.RuntimeException();
            }
            A0E[7] = "RfqzANvJ1I6uK4DDRBmzx";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 103);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{53, 42, 39, 38, 44, 108, 46, 51, 38, 36, 113};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static android.util.Pair<com.facebook.ads.internal.exoplayer2.thirdparty.Format, java.lang.Long> A00(com.facebook.ads.redexgen.core.D4 d4, java.lang.String str) {
        byte[] bArrCopyOf = java.util.Arrays.copyOf(d4.A02, d4.A00);
        int i = bArrCopyOf[4] & 255;
        int firstByte = bArrCopyOf[5] & 255;
        int i2 = (i << 4) | (firstByte >> 4);
        int i3 = ((firstByte & 15) << 8) | (bArrCopyOf[6] & 255);
        float f = 1.0f;
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                int frameRateExtensionD = i3 * 4;
                float f2 = frameRateExtensionD;
                int frameRateExtensionD2 = i2 * 3;
                f = f2 / frameRateExtensionD2;
                break;
            case 3:
                int frameRateExtensionD3 = i3 * 16;
                float f3 = frameRateExtensionD3;
                int frameRateExtensionD4 = i2 * 9;
                f = f3 / frameRateExtensionD4;
                break;
            case 4:
                int frameRateExtensionD5 = i3 * 121;
                float f4 = frameRateExtensionD5;
                int frameRateExtensionD6 = i2 * 100;
                f = f4 / frameRateExtensionD6;
                break;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA03 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A03(str, A01(0, 11, 36), null, -1, -1, i2, i3, -1.0f, java.util.Collections.singletonList(bArrCopyOf), -1, f, null);
        long j = 0;
        int i4 = (bArrCopyOf[7] & 15) - 1;
        if (i4 >= 0 && i4 < A0F.length) {
            double d = A0F[i4];
            int aspectRatioCode = d4.A01;
            int i5 = (bArrCopyOf[aspectRatioCode + 9] & 96) >> 5;
            int aspectRatioCode2 = bArrCopyOf[aspectRatioCode + 9] & 31;
            if (i5 != aspectRatioCode2) {
                double d2 = ((double) i5) + 1.0d;
                int thirdByte = aspectRatioCode2 + 1;
                java.lang.String[] strArr = A0E;
                java.lang.String str2 = strArr[5];
                java.lang.String str3 = strArr[6];
                int length = str2.length();
                int frameRateExtensionD7 = str3.length();
                if (length != frameRateExtensionD7) {
                    throw new java.lang.RuntimeException();
                }
                A0E[7] = "NpF2DYCqOiHWIi5aD2n7H";
                d *= d2 / ((double) thirdByte);
            }
            j = (long) (1000000.0d / d);
        }
        return android.util.Pair.create(formatA03, java.lang.Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.ads.redexgen.core.D3
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        long j;
        int iA06 = i4.A06();
        int iA07 = i4.A07();
        byte[] bArr = i4.A00;
        this.A04 += (long) i4.A04();
        this.A05.AFv(i4, i4.A04());
        while (true) {
            int iA04 = com.facebook.ads.redexgen.core.I0.A04(bArr, iA06, iA07, this.A0C);
            if (iA04 == iA07) {
                if (!this.A07) {
                    this.A0B.A01(bArr, iA06, iA07);
                    return;
                }
                return;
            }
            int i = i4.A00[iA04 + 3] & 255;
            if (!this.A07) {
                int i2 = iA04 - iA06;
                if (A0E[7].length() != 21) {
                    throw new java.lang.RuntimeException();
                }
                A0E[7] = "NNFjPZ2LdqS2orBMPTJCg";
                if (i2 > 0) {
                    this.A0B.A01(bArr, iA06, iA04);
                }
                if (this.A0B.A02(i, i2 < 0 ? -i2 : 0)) {
                    android.util.Pair<com.facebook.ads.internal.exoplayer2.thirdparty.Format, java.lang.Long> pairA00 = A00(this.A0B, this.A06);
                    this.A05.A69((com.facebook.ads.internal.exoplayer2.thirdparty.Format) pairA00.first);
                    this.A00 = ((java.lang.Long) pairA00.second).longValue();
                    this.A07 = true;
                }
            }
            if (i == 0 || i == 179) {
                int i3 = iA07 - iA04;
                if (this.A0A) {
                    boolean z = this.A08;
                    if (A0E[2].length() != 22) {
                        java.lang.String[] strArr = A0E;
                        strArr[3] = "qZ11y6yoX2AAIK0UMJVO1NMp8j0oB732";
                        strArr[0] = "NWeKzAcPml4GtwYeeUzsjci1EgdzRbY9";
                        if (z) {
                            if (this.A07) {
                                this.A05.AFw(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i3, i3, null);
                            }
                        }
                    } else {
                        java.lang.String[] strArr2 = A0E;
                        strArr2[5] = "icQ0QL";
                        strArr2[6] = "7eJwtt";
                        if (z) {
                            if (this.A07) {
                                this.A05.AFw(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i3, i3, null);
                            }
                        }
                    }
                }
                if (!this.A0A || this.A08) {
                    long j2 = this.A04;
                    if (A0E[4].length() != 24) {
                        throw new java.lang.RuntimeException();
                    }
                    A0E[4] = "clfheL6NAri2rf9l7lKOXyBv";
                    this.A02 = j2 - ((long) i3);
                    if (this.A01 != androidx.media3.common.C.TIME_UNSET) {
                        j = this.A01;
                    } else {
                        j = this.A0A ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j;
                    this.A09 = false;
                    this.A01 = androidx.media3.common.C.TIME_UNSET;
                    this.A0A = true;
                }
                this.A08 = i == 0;
            } else if (i == 184) {
                this.A09 = true;
            }
            iA06 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void A5B(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        dh.A05();
        this.A06 = dh.A04();
        this.A05 = interfaceC0611Bz.AHA(dh.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AEM(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.core.D3
    public final void AG6() {
        com.facebook.ads.redexgen.core.I0.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}

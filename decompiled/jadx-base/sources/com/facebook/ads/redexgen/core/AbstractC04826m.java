package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04826m extends com.facebook.ads.redexgen.core.AbstractC0666Ee {
    public static byte[] A0d;
    public static java.lang.String[] A0e = {"Ge6L00ZjjOeYHDl50zGOOqrmdGovIqOu", "cZwDGWYiz", "7CqInds9V1jaFSNLfCM07V3", "b7rrbxwR0Y2sYL3PAoER7xvxvxjYzaQU", "wmBwCsiUZd1Ya1BvurlHvY1RuH3FyZYs", "2ZpOIbX2LW06otFhCB4sq8DtxFPNNyvf", "JjLmntNee2XyXIifQDqG0Yu", "8KAQonnGP"};
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public android.media.MediaCodec A06;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A07;
    public com.facebook.ads.redexgen.core.InterfaceC0592Bg<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> A08;
    public com.facebook.ads.redexgen.core.InterfaceC0592Bg<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> A09;
    public com.facebook.ads.redexgen.core.DL A0A;
    public java.nio.ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public java.nio.ByteBuffer[] A0S;
    public java.nio.ByteBuffer[] A0T;
    public com.facebook.ads.redexgen.core.BH A0U;
    public final android.media.MediaCodec.BufferInfo A0V;
    public final com.facebook.ads.redexgen.core.C05569u A0W;
    public final com.facebook.ads.redexgen.core.C1177Yw A0X;
    public final com.facebook.ads.redexgen.core.C1177Yw A0Y;
    public final com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> A0Z;
    public final com.facebook.ads.redexgen.core.DR A0a;
    public final java.util.List<java.lang.Long> A0b;
    public final boolean A0c;

    public static java.lang.String A0Z(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 62);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0j() {
        A0d = new byte[]{-60, -72, -6, 13, 12, -72, 6, 7, -72, 11, -3, -5, 13, 10, -3, -72, -4, -3, -5, 7, -4, -3, 10, -72, -7, 14, -7, 1, 4, -7, -6, 4, -3, -58, -72, -20, 10, 17, 1, 6, -1, -72, 12, 7, -72, 8, 10, 7, -5, -3, -3, -4, -72, 15, 1, 12, 0, -72, -90, -117, -117, -117, -117, -117, -116, -111, -110, -113, -115, -98, -117, -117, -99, -97, -100, -115, -112, -108, -117, -117, -117, -117, -117, -117, -116, -111, -109, -98, -96, -117, -95, -116, -114, -115, -117, -117, -117, -117, -117, -117, -116, -111, -112, -109, -109, -109, -113, -117, -97, -98, -96, -110, -116, -116, -109, -100, -117, -117, -117, -115, -95, -99, -95, -116, -98, -114, -116, -98, -114, -115, -110, -112, -97, -110, -109, -44, -39, -25, -26, -23, 21, 9, 34, 23, 22, -70, -24, -29, -106, -23, -37, -23, -23, -33, -27, -28, -106, -24, -37, -25, -21, -33, -24, -37, -23, -106, -23, -37, -39, -21, -24, -37, -106, -38, -37, -39, -27, -38, -37, -24, -106, -36, -27, -24, -106, -12, 12, 11, 16, 8, -57, 25, 12, 24, 28, 16, 25, 12, 26, -57, 8, -57, -21, 25, 20, -6, 12, 26, 26, 16, 22, 21, -12, 8, 21, 8, 14, 12, 25, -66, -42, -43, -38, -46, -76, -32, -43, -42, -44, -61, -42, -33, -43, -42, -29, -42, -29, -50, -52, -41, -83, -60, -9, -8, -19, -18, -14, -83, -32, -11, -30, -83, -29, -28, -30, -103, -105, -94, 120, -113, -62, -61, -72, -71, -67, 120, -85, -64, -83, 120, -82, -81, -83, 120, -67, -81, -83, -65, -68, -81, 12, 10, 21, -21, 10, 17, 8, -21, -2, 18, 1, 6, 12, -21, 1, 2, 0, 12, 1, 2, 15, -21, 10, 13, -16, -42, -44, -33, -75, -44, -37, -46, -75, -35, -48, -53, -52, -42, -75, -53, -52, -54, -42, -53, -52, -39, -75, -56, -35, -54, 2, 0, 11, -31, 1, 41, 28, 23, 28, 20, -31, 27, -27, -23, -25, -31, 23, 24, 22, 34, 23, 24, -35, -37, -26, -68, -36, 4, -9, -14, -9, -17, -68, -10, -64, -60, -62, -68, -14, -13, -15, -3, -14, -13, -68, 1, -13, -15, 3, 0, -13, -28, -30, -19, -61, -24, -38, -40, -61, -10, 11, -8, -61, -7, -6, -8, -66, -68, -57, -99, -62, -76, -78, -99, -48, -27, -46, -99, -45, -44, -46, -99, -30, -44, -46, -28, -31, -44, 3, 1, 12, -30, 21, 32, 32, 43, 29, 34, 34, 25, 38, -30, 42, 29, 24, 25, 35, -30, 24, 25, 23, 35, 24, 25, 38, -30, 21, 42, 23, -72, -74, -63, -105, -54, -42, -43, -40, -48, -46, -52, -105, -54, -33, -52, -105, -51, -50, -52, -40, -51, -50, -37, -105, -54, -32, -50, -36, -40, -42, -50, -17, -19, -8, -50, 1, 13, 12, 15, 7, 9, 3, -50, 1, 22, 3, -50, 4, 5, 3, 15, 4, 5, 18, -50, 1, 23, 5, 19, 15, 13, 5, -50, 19, 5, 3, 21, 18, 5, -60, -62, -51, -93, -36, -28, -28, -36, -31, -38, -93, -42, -42, -40, -93, -39, -38, -40, -28, -39, -38, -25, -44, -46, -35, -77, -20, -12, -12, -20, -15, -22, -77, -5, -12, -9, -25, -18, -8, -77, -23, -22, -24, -12, -23, -22, -9, -56, -58, -47, -89, -21, -28, -89, -17, -30, -35, -34, -24, -40, -35, -34, -36, -24, -35, -34, -21, -89, -38, -17, -36, -9, -15, -47, -27, -39, -43, -44, -12, -18, -50, -30, -42, -45, -47, -53, -59, -91, -65, -80, -88, -88, -34, -40, -72, -43, -62, -69, -69, -95, -101, 123, -94, -125, -122, -125, -65, -63, -49, -45, -57, -48, -61, -79, -61, -47, -47, -57, -51, -52, -61, -56, -63, -50, -50, -59, -52, -115, -61, -49, -43, -50, -44, 13, 25, 24, 16, 19, 17, 31, 28, 15, -19, 25, 14, 15, 13, 30, 45, 32, 28, 47, 32, -2, 42, 31, 32, 30, -11, -86, -72, -89, -81, -76, -121, -76, -86, -116, -85, -85, -86, -72, -66, -63, -57, -64, -74, -73, -60, -82, -76, -73, -67, -74, -84, -83, -70, -89, -76, -68, -83, -65, -67, -52, -91, -67, -68, -63, -71, -101, -54, -47, -56, -52, -57, -41, -43, -28, -61, -28, -47, -28, -43, -42, -31, -34, -28, -33, -44, -31, -41, -47, -95, -97, -97, -97, -10, -13, -9, -11, -10, 2, 9, -4, 3, -4, -8, 10, -4, -22, -4, 10, 10, 0, 6, 5, -60, -59, -78, -61, -59, -108, -64, -75, -74, -76, 31, 20, 23, 12, 27, 20, 12, -54, -68, -73, -57, -69};
    }

    public abstract int A1B(android.media.MediaCodec mediaCodec, com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.internal.exoplayer2.thirdparty.Format format2);

    public abstract int A1C(com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.DU;

    public abstract void A1L(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) throws com.facebook.ads.redexgen.core.C05449h;

    public abstract void A1N(com.facebook.ads.redexgen.core.C1177Yw c1177Yw);

    public abstract void A1O(com.facebook.ads.redexgen.core.DL dl, android.media.MediaCodec mediaCodec, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, android.media.MediaCrypto mediaCrypto) throws com.facebook.ads.redexgen.core.DU;

    public abstract void A1P(java.lang.String str, long j, long j2);

    public abstract boolean A1Q(long j, long j2, android.media.MediaCodec mediaCodec, java.nio.ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws com.facebook.ads.redexgen.core.C05449h;

    static {
        A0j();
        A0f = com.facebook.ads.redexgen.core.IK.A0h(A0Z(59, 76, 29));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public AbstractC04826m(int i, com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, boolean z) {
        super(i);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(com.facebook.ads.redexgen.core.IK.A02 >= 16);
        this.A0a = (com.facebook.ads.redexgen.core.DR) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(dr);
        this.A0Z = interfaceC0593Bh;
        this.A0c = z;
        this.A0X = new com.facebook.ads.redexgen.core.C1177Yw(0);
        this.A0Y = com.facebook.ads.redexgen.core.C1177Yw.A02();
        this.A0W = new com.facebook.ads.redexgen.core.C05569u();
        this.A0b = new java.util.ArrayList();
        this.A0V = new android.media.MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.IK.A02 <= 25 && A0Z(255, 25, 12).equals(str) && (com.facebook.ads.redexgen.core.IK.A06.startsWith(A0Z(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 7, 16)) || com.facebook.ads.redexgen.core.IK.A06.startsWith(A0Z(589, 7, 102)) || com.facebook.ads.redexgen.core.IK.A06.startsWith(A0Z(596, 7, 99)) || com.facebook.ads.redexgen.core.IK.A06.startsWith(A0Z(610, 7, 77)))) {
            return 2;
        }
        if (com.facebook.ads.redexgen.core.IK.A02 < 24) {
            if (A0Z(330, 22, 117).equals(str) || A0Z(352, 29, 80).equals(str)) {
                if (!A0Z(689, 8, 20).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                    if (!A0Z(697, 12, 10).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                        if (A0Z(731, 7, 49).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                            return 1;
                        }
                        java.lang.String str2 = com.facebook.ads.redexgen.core.IK.A03;
                        java.lang.String[] strArr = A0e;
                        if (strArr[6].length() != strArr[2].length()) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A0e;
                        strArr2[3] = "43oznx1K6tCWccJtXh9NlXjZt23I2ujy";
                        strArr2[5] = "jAN4QtnmbEUtPK1QH8WvPT0xHUSBcaS7";
                        if (A0Z(774, 7, 109).equals(str2)) {
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0X() {
        return 0L;
    }

    public static android.media.MediaCodec.CryptoInfo A0Y(com.facebook.ads.redexgen.core.C1177Yw c1177Yw, int i) {
        android.media.MediaCodec.CryptoInfo cryptoInfoA02 = c1177Yw.A02.A02();
        if (i == 0) {
            return cryptoInfoA02;
        }
        if (cryptoInfoA02.numBytesOfClearData == null) {
            int[] iArr = new int[1];
            java.lang.String[] strArr = A0e;
            if (strArr[1].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0e;
            strArr2[3] = "onz7wliqp2XHHKkpQRZifpXAce3CX6Fj";
            strArr2[5] = "Cbb9E5A8AJ3RRtQIFMKO1cbLALBvOm0W";
            cryptoInfoA02.numBytesOfClearData = iArr;
        }
        int[] iArr2 = cryptoInfoA02.numBytesOfClearData;
        java.lang.String[] strArr3 = A0e;
        if (strArr3[0].charAt(11) != strArr3[4].charAt(11)) {
            java.lang.String[] strArr4 = A0e;
            strArr4[0] = "V8kNlZfFrOKYWg4XKudgCI5cCGlMDu3O";
            strArr4[4] = "pHzAarahmuxYCg6YLY7OHuu6gmd0r2pS";
            iArr2[0] = iArr2[0] + i;
            return cryptoInfoA02;
        }
        java.lang.String[] strArr5 = A0e;
        strArr5[3] = "bMCkxjPsyY31VLvavBARR2r8FlYARPlk";
        strArr5[5] = "GfpaQbDO32ffC6mv5qdHc7m8OEvdxJfK";
        iArr2[0] = iArr2[0] + i;
        return cryptoInfoA02;
    }

    private java.nio.ByteBuffer A0a(int i) {
        if (com.facebook.ads.redexgen.core.IK.A02 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        return this.A0S[i];
    }

    private java.nio.ByteBuffer A0b(int i) {
        if (com.facebook.ads.redexgen.core.IK.A02 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        java.nio.ByteBuffer byteBuffer = this.A0T[i];
        java.lang.String[] strArr = A0e;
        if (strArr[1].length() != strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0e;
        strArr2[6] = "Q1Mn8yvPCAsyenBcYQo9bc0";
        strArr2[2] = "s1CLkHC4BsHt65fSKCGpIac";
        return byteBuffer;
    }

    private void A0c() {
        if (com.facebook.ads.redexgen.core.IK.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0d() throws com.facebook.ads.redexgen.core.C05449h {
        if (this.A02 == 2) {
            A1H();
            A1J();
        } else {
            this.A0N = true;
            A1I();
        }
    }

    private void A0e() {
        if (com.facebook.ads.redexgen.core.IK.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws com.facebook.ads.redexgen.core.C05449h {
        android.media.MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0Z(781, 5, 21)) == 32 && outputFormat.getInteger(A0Z(744, 6, 80)) == 32) {
            this.A0O = true;
            return;
        }
        boolean z = this.A0I;
        java.lang.String[] strArr = A0e;
        if (strArr[0].charAt(11) != strArr[4].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0e;
        strArr2[3] = "V1ANh4pRI8qXsXATmIh4DpaxZ3qun5MS";
        strArr2[5] = "hhvMepvRH7Mwz24exxX4ZNsDPU6bsVl4";
        if (z) {
            outputFormat.setInteger(A0Z(638, 13, 34), 1);
        }
        A1L(this.A06, outputFormat);
    }

    private void A0g() {
        if (com.facebook.ads.redexgen.core.IK.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(com.facebook.ads.redexgen.core.DN dn) throws com.facebook.ads.redexgen.core.C05449h {
        throw com.facebook.ads.redexgen.core.C05449h.A01(dn, A0z());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0221  */
    /* JADX WARN: Code duplicated, block: B:103:0x0230  */
    /* JADX WARN: Code duplicated, block: B:106:0x023e A[Catch: CryptoException -> 0x0283, TryCatch #1 {CryptoException -> 0x0283, blocks: (B:104:0x0232, B:106:0x023e, B:107:0x0247, B:109:0x0253, B:111:0x0274, B:110:0x0263), top: B:118:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0253 A[Catch: CryptoException -> 0x0283, TryCatch #1 {CryptoException -> 0x0283, blocks: (B:104:0x0232, B:106:0x023e, B:107:0x0247, B:109:0x0253, B:111:0x0274, B:110:0x0263), top: B:118:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0263 A[Catch: CryptoException -> 0x0283, TryCatch #1 {CryptoException -> 0x0283, blocks: (B:104:0x0232, B:106:0x023e, B:107:0x0247, B:109:0x0253, B:111:0x0274, B:110:0x0263), top: B:118:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[LOOP:0: B:41:0x00c6->B:43:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:67:0x0157  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x0183  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01da  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x020f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0220 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
    
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0154, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0191, code lost:
    
        if (r13.A0G == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0194, code lost:
    
        r13.A0K = true;
        r13.A06.queueInputBuffer(r13.A03, 0, 0, 0, 4);
        A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a6, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01af, code lost:
    
        throw com.facebook.ads.redexgen.core.C05449h.A01(r1, A0z());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0l() throws com.facebook.ads.redexgen.core.C05449h {
        boolean z;
        java.lang.String[] strArr;
        int iPosition;
        int iA11;
        int result;
        boolean zA0A;
        boolean z2;
        java.lang.String[] strArr2;
        boolean z3;
        java.lang.String[] strArr3;
        long j;
        boolean bufferEncrypted;
        boolean zA05;
        java.lang.String[] strArr4;
        java.lang.String[] strArr5;
        if (this.A06 == null || this.A02 == 2 || this.A0M) {
            return false;
        }
        if (this.A03 < 0) {
            android.media.MediaCodec mediaCodec = this.A06;
            java.lang.String[] strArr6 = A0e;
            if (strArr6[1].length() == strArr6[7].length()) {
                java.lang.String[] strArr7 = A0e;
                strArr7[3] = "tqhLMzq7Gk8kIFWvQYp4SVi1xGG4cQVy";
                strArr7[5] = "ggYw3mZ1weZn9cIb2Gfzrb9GN9hzw5oe";
                this.A03 = mediaCodec.dequeueInputBuffer(0L);
                if (this.A03 < 0) {
                    return false;
                }
                this.A0X.A01 = A0a(this.A03);
                this.A0X.A07();
                if (this.A02 == 1) {
                    if (!this.A0G) {
                        this.A0K = true;
                        this.A06.queueInputBuffer(this.A03, 0, 0, 0L, 4);
                        A0h();
                    }
                    this.A02 = 2;
                    return false;
                }
                z = this.A0C;
                strArr = A0e;
                if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                    java.lang.String[] strArr8 = A0e;
                    strArr8[0] = "blFNRAsfOtIYU5LjDQdz6ZyO7UcUl7zH";
                    strArr8[4] = "BgWl55dyGPcYdCpEELUA80dyaOop4pPh";
                    if (z) {
                        this.A0C = false;
                        this.A0X.A01.put(A0f);
                        this.A06.queueInputBuffer(this.A03, 0, A0f.length, 0L, 0);
                        A0h();
                        this.A0J = true;
                        return true;
                    }
                    iPosition = 0;
                    if (this.A0R) {
                        iA11 = -4;
                    } else {
                        if (this.A01 == 1) {
                            for (result = 0; result < this.A07.A0P.size(); result++) {
                                this.A0X.A01.put(this.A07.A0P.get(result));
                            }
                            this.A01 = 2;
                        }
                        iPosition = this.A0X.A01.position();
                        iA11 = A11(this.A0W, this.A0X, false);
                    }
                    if (iA11 == -3) {
                        return false;
                    }
                    if (iA11 == -5) {
                        if (this.A01 == 2) {
                            this.A0X.A07();
                            this.A01 = 1;
                        }
                        A1M(this.A0W.A00);
                        return true;
                    }
                    if (this.A0X.A04()) {
                        if (this.A01 == 2) {
                            this.A0X.A07();
                            this.A01 = 1;
                        }
                        this.A0M = true;
                        boolean z4 = this.A0J;
                        strArr5 = A0e;
                        if (strArr5[6].length() != strArr5[2].length()) {
                            java.lang.String[] strArr9 = A0e;
                            strArr9[3] = "C1ZAohqWm8cIO5WPihLYWGGRleuYz6Cd";
                            strArr9[5] = "RjXK9f2Zla7A3gu5iKY2tAMeR9xrDr0d";
                        } else {
                            java.lang.String[] strArr10 = A0e;
                            strArr10[6] = "uRTXylqosmkEoqXspM2R7A2";
                            strArr10[2] = "lrp8dscfZo5nm7o9TX0HPun";
                        }
                    } else {
                        if (this.A0Q) {
                            zA05 = this.A0X.A05();
                            strArr4 = A0e;
                            if (strArr4[3].charAt(27) != strArr4[5].charAt(27)) {
                                java.lang.String[] strArr11 = A0e;
                                strArr11[3] = "FnSeCRjgzCsuIYxjvRheoIljQsjeiySf";
                                strArr11[5] = "AnHjIvJP4o6vl1O98aVAE3jABRwNDRpA";
                                if (!zA05) {
                                    this.A0X.A07();
                                    if (this.A01 == 2) {
                                        this.A01 = 1;
                                    }
                                    return true;
                                }
                            }
                        }
                        this.A0Q = false;
                        zA0A = this.A0X.A0A();
                        boolean bufferEncrypted2 = A0v(zA0A);
                        this.A0R = bufferEncrypted2;
                        z2 = this.A0R;
                        strArr2 = A0e;
                        if (strArr2[0].charAt(11) != strArr2[4].charAt(11)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr12 = A0e;
                        strArr12[0] = "wTV9pqb3h0MYlEKbKpom8CyZJZKquGvc";
                        strArr12[4] = "PbxrTb4JoKTYKdR9QCAlM70M7M9Mdqas";
                        if (z2) {
                            return false;
                        }
                        z3 = this.A0D;
                        strArr3 = A0e;
                        if (strArr3[0].charAt(11) != strArr3[4].charAt(11)) {
                            java.lang.String[] strArr13 = A0e;
                            strArr13[6] = "PTDz9WccjROCxER5t1ySeXx";
                            strArr13[2] = "ZzjmMuESXdr8ldCnWqS9k1D";
                            if (z3) {
                                if (!zA0A) {
                                    com.facebook.ads.redexgen.core.I0.A0A(this.A0X.A01);
                                    if (this.A0X.A01.position() == 0) {
                                        return true;
                                    }
                                    this.A0D = false;
                                }
                            }
                        } else {
                            java.lang.String[] strArr14 = A0e;
                            strArr14[1] = "R0IYoDBNu";
                            strArr14[7] = "CxxeNPWZ6";
                            if (z3) {
                                if (!zA0A) {
                                    com.facebook.ads.redexgen.core.I0.A0A(this.A0X.A01);
                                    if (this.A0X.A01.position() == 0) {
                                        return true;
                                    }
                                    this.A0D = false;
                                }
                            }
                        }
                        try {
                            j = this.A0X.A00;
                            bufferEncrypted = this.A0X.A03();
                            if (bufferEncrypted) {
                                this.A0b.add(java.lang.Long.valueOf(j));
                            }
                            this.A0X.A08();
                            A1N(this.A0X);
                            if (zA0A) {
                                this.A06.queueInputBuffer(this.A03, 0, this.A0X.A01.limit(), j, 0);
                            } else {
                                this.A06.queueSecureInputBuffer(this.A03, 0, A0Y(this.A0X, iPosition), j, 0);
                            }
                            A0h();
                            this.A0J = true;
                            this.A01 = 0;
                            this.A0U.A04++;
                            return true;
                        } catch (android.media.MediaCodec.CryptoException e) {
                            throw com.facebook.ads.redexgen.core.C05449h.A01(e, A0z());
                        }
                    }
                }
            }
        } else {
            if (this.A02 == 1) {
                if (!this.A0G) {
                    this.A0K = true;
                    this.A06.queueInputBuffer(this.A03, 0, 0, 0L, 4);
                    A0h();
                }
                this.A02 = 2;
                return false;
            }
            z = this.A0C;
            strArr = A0e;
            if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                java.lang.String[] strArr15 = A0e;
                strArr15[0] = "blFNRAsfOtIYU5LjDQdz6ZyO7UcUl7zH";
                strArr15[4] = "BgWl55dyGPcYdCpEELUA80dyaOop4pPh";
                if (z) {
                    this.A0C = false;
                    this.A0X.A01.put(A0f);
                    this.A06.queueInputBuffer(this.A03, 0, A0f.length, 0L, 0);
                    A0h();
                    this.A0J = true;
                    return true;
                }
                iPosition = 0;
                if (this.A0R) {
                    iA11 = -4;
                } else {
                    if (this.A01 == 1) {
                        while (result < this.A07.A0P.size()) {
                            this.A0X.A01.put(this.A07.A0P.get(result));
                        }
                        this.A01 = 2;
                    }
                    iPosition = this.A0X.A01.position();
                    iA11 = A11(this.A0W, this.A0X, false);
                }
                if (iA11 == -3) {
                    return false;
                }
                if (iA11 == -5) {
                    if (this.A01 == 2) {
                        this.A0X.A07();
                        this.A01 = 1;
                    }
                    A1M(this.A0W.A00);
                    return true;
                }
                if (this.A0X.A04()) {
                    if (this.A01 == 2) {
                        this.A0X.A07();
                        this.A01 = 1;
                    }
                    this.A0M = true;
                    boolean z5 = this.A0J;
                    strArr5 = A0e;
                    if (strArr5[6].length() != strArr5[2].length()) {
                        java.lang.String[] strArr16 = A0e;
                        strArr16[3] = "C1ZAohqWm8cIO5WPihLYWGGRleuYz6Cd";
                        strArr16[5] = "RjXK9f2Zla7A3gu5iKY2tAMeR9xrDr0d";
                    } else {
                        java.lang.String[] strArr17 = A0e;
                        strArr17[6] = "uRTXylqosmkEoqXspM2R7A2";
                        strArr17[2] = "lrp8dscfZo5nm7o9TX0HPun";
                    }
                } else {
                    if (this.A0Q) {
                        zA05 = this.A0X.A05();
                        strArr4 = A0e;
                        if (strArr4[3].charAt(27) != strArr4[5].charAt(27)) {
                            java.lang.String[] strArr18 = A0e;
                            strArr18[3] = "FnSeCRjgzCsuIYxjvRheoIljQsjeiySf";
                            strArr18[5] = "AnHjIvJP4o6vl1O98aVAE3jABRwNDRpA";
                            if (!zA05) {
                                this.A0X.A07();
                                if (this.A01 == 2) {
                                    this.A01 = 1;
                                }
                                return true;
                            }
                        }
                    }
                    this.A0Q = false;
                    zA0A = this.A0X.A0A();
                    boolean bufferEncrypted3 = A0v(zA0A);
                    this.A0R = bufferEncrypted3;
                    z2 = this.A0R;
                    strArr2 = A0e;
                    if (strArr2[0].charAt(11) != strArr2[4].charAt(11)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr19 = A0e;
                    strArr19[0] = "wTV9pqb3h0MYlEKbKpom8CyZJZKquGvc";
                    strArr19[4] = "PbxrTb4JoKTYKdR9QCAlM70M7M9Mdqas";
                    if (z2) {
                        return false;
                    }
                    z3 = this.A0D;
                    strArr3 = A0e;
                    if (strArr3[0].charAt(11) != strArr3[4].charAt(11)) {
                        java.lang.String[] strArr110 = A0e;
                        strArr110[6] = "PTDz9WccjROCxER5t1ySeXx";
                        strArr110[2] = "ZzjmMuESXdr8ldCnWqS9k1D";
                        if (z3) {
                            if (!zA0A) {
                                com.facebook.ads.redexgen.core.I0.A0A(this.A0X.A01);
                                if (this.A0X.A01.position() == 0) {
                                    return true;
                                }
                                this.A0D = false;
                            }
                        }
                    } else {
                        java.lang.String[] strArr111 = A0e;
                        strArr111[1] = "R0IYoDBNu";
                        strArr111[7] = "CxxeNPWZ6";
                        if (z3) {
                            if (!zA0A) {
                                com.facebook.ads.redexgen.core.I0.A0A(this.A0X.A01);
                                if (this.A0X.A01.position() == 0) {
                                    return true;
                                }
                                this.A0D = false;
                            }
                        }
                    }
                    j = this.A0X.A00;
                    bufferEncrypted = this.A0X.A03();
                    if (bufferEncrypted) {
                        this.A0b.add(java.lang.Long.valueOf(j));
                    }
                    this.A0X.A08();
                    A1N(this.A0X);
                    if (zA0A) {
                        this.A06.queueInputBuffer(this.A03, 0, this.A0X.A01.limit(), j, 0);
                    } else {
                        this.A06.queueSecureInputBuffer(this.A03, 0, A0Y(this.A0X, iPosition), j, 0);
                    }
                    A0h();
                    this.A0J = true;
                    this.A01 = 0;
                    this.A0U.A04++;
                    return true;
                }
            }
        }
        throw new java.lang.RuntimeException();
    }

    private boolean A0m() {
        return this.A04 >= 0;
    }

    private boolean A0n(long j) {
        int size = this.A0b.size();
        for (int i = 0; i < size; i++) {
            if (this.A0b.get(i).longValue() == j) {
                this.A0b.remove(i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    private boolean A0o(long j, long j2) throws com.facebook.ads.redexgen.core.C05449h {
        boolean processedOutputBuffer;
        boolean processedOutputBuffer2;
        int iDequeueOutputBuffer;
        if (!A0m()) {
            if (this.A0F && this.A0K) {
                try {
                    iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
                } catch (java.lang.IllegalStateException unused) {
                    A0d();
                    java.lang.String[] strArr = A0e;
                    if (strArr[6].length() != strArr[2].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0e;
                    strArr2[0] = "C47NeXUtfeeYUWYXixZLIJFJDRvYW48T";
                    strArr2[4] = "LdGtXXDgZcSYCfjGeBe8u5ZV2ts8VuEV";
                    if (this.A0N) {
                        A1H();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0X());
            }
            if (iDequeueOutputBuffer < 0) {
                java.lang.String[] strArr3 = A0e;
                java.lang.String str = strArr3[1];
                java.lang.String str2 = strArr3[7];
                int length = str.length();
                int outputIndex = str2.length();
                if (length != outputIndex) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr4 = A0e;
                strArr4[3] = "VcSTnmxgSgrW5IXoHE7n6IMkNmiiiJxM";
                strArr4[5] = "mtHXmDzWH9F9ftXOegB4WmerXjQVZKcR";
                if (iDequeueOutputBuffer == -2) {
                    A0f();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    A0e();
                    return true;
                }
                if (this.A0G && (this.A0M || this.A02 == 2)) {
                    A0d();
                }
                return false;
            }
            if (this.A0O) {
                this.A0O = false;
                this.A06.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            int outputIndex2 = this.A0V.size;
            if (outputIndex2 == 0) {
                int outputIndex3 = this.A0V.flags;
                if ((outputIndex3 & 4) != 0) {
                    A0d();
                    return false;
                }
            }
            this.A04 = iDequeueOutputBuffer;
            this.A0B = A0b(iDequeueOutputBuffer);
            if (this.A0B != null) {
                java.nio.ByteBuffer byteBuffer = this.A0B;
                int outputIndex4 = this.A0V.offset;
                byteBuffer.position(outputIndex4);
                java.nio.ByteBuffer byteBuffer2 = this.A0B;
                int i = this.A0V.offset;
                int outputIndex5 = this.A0V.size;
                byteBuffer2.limit(i + outputIndex5);
            }
            this.A0P = A0n(this.A0V.presentationTimeUs);
        }
        if (this.A0F && this.A0K) {
            try {
                processedOutputBuffer = A1Q(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            } catch (java.lang.IllegalStateException unused2) {
                A0d();
                if (this.A0N) {
                    A1H();
                }
                return false;
            }
        } else {
            processedOutputBuffer = A1Q(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
        }
        if (processedOutputBuffer) {
            A1K(this.A0V.presentationTimeUs);
            android.media.MediaCodec.BufferInfo bufferInfo = this.A0V;
            java.lang.String[] strArr5 = A0e;
            if (strArr5[1].length() == strArr5[7].length()) {
                java.lang.String[] strArr6 = A0e;
                strArr6[0] = "ufUlc5ue4I6YskufwI4llIUBwuiRH74w";
                strArr6[4] = "howAl2gcIocYdaAItHqwPW4O8gQJhjfW";
                if ((bufferInfo.flags & 4) != 0) {
                    processedOutputBuffer2 = true;
                } else {
                    processedOutputBuffer2 = false;
                }
            } else if ((bufferInfo.flags & 4) != 0) {
                processedOutputBuffer2 = true;
            } else {
                processedOutputBuffer2 = false;
            }
            A0i();
            if (!processedOutputBuffer2) {
                return true;
            }
            A0d();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0048  */
    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090 A[DONT_INVERT] */
    public static boolean A0p(com.facebook.ads.redexgen.core.DL dl) {
        java.lang.String str;
        java.lang.String name;
        java.lang.String strA0Z;
        java.lang.String name2;
        boolean z;
        java.lang.String[] strArr;
        java.lang.String str2 = dl.A02;
        if (com.facebook.ads.redexgen.core.IK.A02 <= 17) {
            java.lang.String name3 = A0Z(565, 24, 59);
            if (!name3.equals(str2)) {
                java.lang.String strA0Z2 = A0Z(418, 31, 118);
                java.lang.String[] strArr2 = A0e;
                if (strArr2[3].charAt(27) == strArr2[5].charAt(27)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr3 = A0e;
                strArr3[1] = "T6E03jzw5";
                strArr3[7] = "yprIxAfnT";
                if (!strA0Z2.equals(str2)) {
                    str = com.facebook.ads.redexgen.core.IK.A05;
                    name = A0Z(139, 6, 106);
                    if (name.equals(str)) {
                        strA0Z = A0Z(135, 4, 85);
                        name2 = com.facebook.ads.redexgen.core.IK.A06;
                        if (strA0Z.equals(name2)) {
                            z = dl.A05;
                            strArr = A0e;
                            if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                                java.lang.String[] strArr4 = A0e;
                                strArr4[3] = "BJGPxEdVUzMLNtirl91eFhgnBGweQDs4";
                                strArr4[5] = "zlX9yGsKra4NhbpSqGzMUztPzbxTVPIW";
                                if (z) {
                                }
                            } else if (z) {
                            }
                        }
                    }
                    return false;
                }
            }
        } else {
            str = com.facebook.ads.redexgen.core.IK.A05;
            name = A0Z(139, 6, 106);
            if (name.equals(str)) {
                strA0Z = A0Z(135, 4, 85);
                name2 = com.facebook.ads.redexgen.core.IK.A06;
                if (strA0Z.equals(name2)) {
                    z = dl.A05;
                    strArr = A0e;
                    if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                        java.lang.String[] strArr5 = A0e;
                        strArr5[3] = "BJGPxEdVUzMLNtirl91eFhgnBGweQDs4";
                        strArr5[5] = "zlX9yGsKra4NhbpSqGzMUztPzbxTVPIW";
                        if (z) {
                        }
                    } else if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0q(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.IK.A02 > 23 || !A0Z(540, 25, 71).equals(str)) {
            int i = com.facebook.ads.redexgen.core.IK.A02;
            java.lang.String[] strArr = A0e;
            if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0e;
            strArr2[6] = "9RImieNhPQC6RsB3uCQpNzq";
            strArr2[2] = "LbY4QmV7JG8OGYeLFRPqX8R";
            if (i <= 19) {
                if (!A0Z(738, 6, 49).equals(com.facebook.ads.redexgen.core.IK.A03) || (!A0Z(449, 31, 43).equals(str) && !A0Z(480, 38, 98).equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0r(java.lang.String str) {
        return com.facebook.ads.redexgen.core.IK.A02 == 21 && A0Z(518, 22, 55).equals(str);
    }

    public static boolean A0s(java.lang.String str) {
        return com.facebook.ads.redexgen.core.IK.A02 < 18 || (com.facebook.ads.redexgen.core.IK.A02 == 18 && (A0Z(381, 15, 87).equals(str) || A0Z(396, 22, 49).equals(str))) || (com.facebook.ads.redexgen.core.IK.A02 == 19 && com.facebook.ads.redexgen.core.IK.A06.startsWith(A0Z(603, 7, 58)) && (A0Z(237, 18, 65).equals(str) || A0Z(255, 25, 12).equals(str)));
    }

    public static boolean A0t(java.lang.String str, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        if (com.facebook.ads.redexgen.core.IK.A02 < 21 && format.A0P.isEmpty()) {
            boolean zEquals = A0Z(305, 25, 73).equals(str);
            java.lang.String[] strArr = A0e;
            if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0e;
            strArr2[6] = "MfUpXDWwlgjpIzkQpGQ69jh";
            strArr2[2] = "6M28L7pIoNUbygZ8mQEy8q1";
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0u(java.lang.String str, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        return com.facebook.ads.redexgen.core.IK.A02 <= 18 && format.A05 == 1 && A0Z(280, 25, 127).equals(str);
    }

    private boolean A0v(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        if (0 == 0 || (!z && this.A0c)) {
            return false;
        }
        throw new java.lang.NullPointerException(A0Z(723, 8, 50));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public void A15() {
        this.A07 = null;
        try {
            A1H();
            if (0 != 0) {
                try {
                    throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                } catch (java.lang.Throwable th) {
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                        } catch (java.lang.Throwable th2) {
                            this.A08 = null;
                            this.A09 = null;
                            throw th2;
                        }
                    }
                    this.A08 = null;
                    this.A09 = null;
                    throw th;
                }
            }
            if (0 != 0 && 0 != 0) {
                try {
                    throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                } catch (java.lang.Throwable th3) {
                    this.A08 = null;
                    this.A09 = null;
                    throw th3;
                }
            }
            this.A08 = null;
            java.lang.String[] strArr = A0e;
            if (strArr[1].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0e;
            strArr2[6] = "grBGXm61Y9KpFOsllqLilTu";
            strArr2[2] = "sgN5ocMNWUzsZlDnPC4yFnx";
            this.A09 = null;
        } catch (java.lang.Throwable th4) {
            if (0 != 0) {
                try {
                    throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                } catch (java.lang.Throwable th5) {
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                        } catch (java.lang.Throwable th6) {
                            this.A08 = null;
                            this.A09 = null;
                            throw th6;
                        }
                    }
                    this.A08 = null;
                    this.A09 = null;
                    throw th5;
                }
            }
            if (0 != 0 && 0 != 0) {
                try {
                    throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                } catch (java.lang.Throwable th7) {
                    this.A08 = null;
                    this.A09 = null;
                    throw th7;
                }
            }
            this.A08 = null;
            this.A09 = null;
            throw th4;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public void A16(long j, boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1G();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public void A17(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        this.A0U = new com.facebook.ads.redexgen.core.BH();
    }

    public final android.media.MediaCodec A1D() {
        return this.A06;
    }

    public final com.facebook.ads.redexgen.core.DL A1E() {
        return this.A0A;
    }

    public com.facebook.ads.redexgen.core.DL A1F(com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, boolean z) throws com.facebook.ads.redexgen.core.DU {
        return dr.A7A(format.A0O, z);
    }

    public void A1G() throws com.facebook.ads.redexgen.core.C05449h {
        this.A05 = androidx.media3.common.C.TIME_UNSET;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H) {
            A1H();
            A1J();
        } else {
            boolean z = this.A0E;
            java.lang.String[] strArr = A0e;
            if (strArr[1].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0e;
            strArr2[3] = "AcAf7FDebpG1tI2m1dN3Mb3j6Ch0chZ8";
            strArr2[5] = "r6t4NoBnkCgbgPTEJXdySK25KRKv5vPZ";
            if ((z && this.A0K) || this.A02 != 0) {
                A1H();
                A1J();
            } else {
                this.A06.flush();
                this.A0J = false;
            }
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1H() {
        this.A05 = androidx.media3.common.C.TIME_UNSET;
        A0h();
        A0i();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0g();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    if (0 != 0) {
                        java.lang.String[] strArr = A0e;
                        if (strArr[6].length() != strArr[2].length()) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A0e;
                        strArr2[0] = "0w4YqF15pbfYhi8hBAmOHeRcKTIYDC15";
                        strArr2[4] = "pbmkRjY64OMYpYUCMjYZppA8YisD1A9o";
                        if (0 != 0) {
                            try {
                                throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                            } catch (java.lang.Throwable th) {
                                this.A08 = null;
                                throw th;
                            }
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                        } catch (java.lang.Throwable th3) {
                            this.A08 = null;
                            throw th3;
                        }
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th4) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                        } catch (java.lang.Throwable th5) {
                            this.A08 = null;
                            throw th5;
                        }
                    }
                    throw th4;
                } catch (java.lang.Throwable th6) {
                    this.A06 = null;
                    if (0 != 0 && 0 != 0) {
                        try {
                            throw new java.lang.NullPointerException(A0Z(750, 14, 89));
                        } catch (java.lang.Throwable th7) {
                            this.A08 = null;
                            throw th7;
                        }
                    }
                    throw th6;
                }
            }
        }
    }

    public void A1I() throws com.facebook.ads.redexgen.core.C05449h {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009e A[Catch: DU -> 0x0116, TRY_LEAVE, TryCatch #1 {DU -> 0x0116, blocks: (B:22:0x007f, B:25:0x008f, B:27:0x009e), top: B:58:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void A1J() throws com.facebook.ads.redexgen.core.C05449h {
        long jElapsedRealtime;
        if (this.A06 == null) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format format = this.A07;
            java.lang.String[] strArr = A0e;
            if (strArr[0].charAt(11) == strArr[4].charAt(11)) {
                java.lang.String[] strArr2 = A0e;
                strArr2[3] = "bUGgWBSznQkBKSqt9qRvphJYsOp2SSuW";
                strArr2[5] = "pE9OhEIelFRk0p3jLA8Fl3FHDqSHIuWZ";
                if (format == null) {
                    return;
                }
                this.A08 = null;
                java.lang.String str = this.A07.A0O;
                if (0 != 0) {
                    throw new java.lang.NullPointerException(A0Z(709, 14, 26));
                }
                com.facebook.ads.redexgen.core.DL dl = this.A0A;
                java.lang.String[] strArr3 = A0e;
                if (strArr3[0].charAt(11) != strArr3[4].charAt(11)) {
                    java.lang.String[] strArr4 = A0e;
                    strArr4[1] = "iDJoTEcXh";
                    strArr4[7] = "7yzsCOtv6";
                    if (dl == null) {
                        try {
                            this.A0A = A1F(this.A0a, this.A07, false);
                            if (this.A0A == null && 0 != 0) {
                                this.A0A = A1F(this.A0a, this.A07, false);
                                if (this.A0A != null) {
                                    java.lang.String strA0Z = A0Z(219, 18, 51);
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.lang.String mimeType = A0Z(org.objectweb.asm.Opcodes.I2B, 40, 56);
                                    java.lang.StringBuilder sbAppend = sb.append(mimeType).append(str);
                                    java.lang.String mimeType2 = A0Z(0, 58, 90);
                                    java.lang.StringBuilder sbAppend2 = sbAppend.append(mimeType2);
                                    java.lang.String mimeType3 = this.A0A.A02;
                                    java.lang.StringBuilder sbAppend3 = sbAppend2.append(mimeType3);
                                    java.lang.String mimeType4 = A0Z(58, 1, 58);
                                    android.util.Log.w(strA0Z, sbAppend3.append(mimeType4).toString());
                                }
                            }
                            if (this.A0A == null) {
                                A0k(new com.facebook.ads.redexgen.core.DN(this.A07, (java.lang.Throwable) null, false, -49999));
                                throw null;
                            }
                        } catch (com.facebook.ads.redexgen.core.DU e) {
                            A0k(new com.facebook.ads.redexgen.core.DN(this.A07, (java.lang.Throwable) e, false, -49998));
                            throw null;
                        }
                    }
                } else {
                    java.lang.String[] strArr5 = A0e;
                    strArr5[3] = "8yfSRRU54X3X1T5EMVUqSUKIlkqUBArx";
                    strArr5[5] = "VNDhHeg50CeXxatj1m86TNnuwUj9BuQb";
                    if (dl == null) {
                        this.A0A = A1F(this.A0a, this.A07, false);
                        if (this.A0A == null) {
                            this.A0A = A1F(this.A0a, this.A07, false);
                            if (this.A0A != null) {
                                java.lang.String strA0Z2 = A0Z(219, 18, 51);
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                java.lang.String mimeType5 = A0Z(org.objectweb.asm.Opcodes.I2B, 40, 56);
                                java.lang.StringBuilder sbAppend4 = sb2.append(mimeType5).append(str);
                                java.lang.String mimeType6 = A0Z(0, 58, 90);
                                java.lang.StringBuilder sbAppend5 = sbAppend4.append(mimeType6);
                                java.lang.String mimeType7 = this.A0A.A02;
                                java.lang.StringBuilder sbAppend6 = sbAppend5.append(mimeType7);
                                java.lang.String mimeType8 = A0Z(58, 1, 58);
                                android.util.Log.w(strA0Z2, sbAppend6.append(mimeType8).toString());
                            }
                        }
                        if (this.A0A == null) {
                            A0k(new com.facebook.ads.redexgen.core.DN(this.A07, (java.lang.Throwable) null, false, -49999));
                            throw null;
                        }
                    }
                }
                boolean zA1R = A1R(this.A0A);
                java.lang.String[] strArr6 = A0e;
                java.lang.String str2 = strArr6[6];
                java.lang.String mimeType9 = strArr6[2];
                if (str2.length() == mimeType9.length()) {
                    java.lang.String[] strArr7 = A0e;
                    strArr7[1] = "T0kOg2K1f";
                    strArr7[7] = "P8Drvnvfp";
                    if (!zA1R) {
                        return;
                    }
                    java.lang.String str3 = this.A0A.A02;
                    this.A00 = A0W(str3);
                    this.A0D = A0t(str3, this.A07);
                    this.A0H = A0s(str3);
                    this.A0G = A0p(this.A0A);
                    this.A0E = A0q(str3);
                    this.A0F = A0r(str3);
                    this.A0I = A0u(str3, this.A07);
                    try {
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        java.lang.String mimeType10 = A0Z(665, 12, 125);
                        com.facebook.ads.redexgen.core.IH.A02(sb3.append(mimeType10).append(str3).toString());
                        this.A06 = android.media.MediaCodec.createByCodecName(str3);
                        com.facebook.ads.redexgen.core.IH.A00();
                        java.lang.String mimeType11 = A0Z(651, 14, 108);
                        com.facebook.ads.redexgen.core.IH.A02(mimeType11);
                        A1O(this.A0A, this.A06, this.A07, null);
                        com.facebook.ads.redexgen.core.IH.A00();
                        java.lang.String mimeType12 = A0Z(764, 10, 19);
                        com.facebook.ads.redexgen.core.IH.A02(mimeType12);
                        this.A06.start();
                        com.facebook.ads.redexgen.core.IH.A00();
                        long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                        A1P(str3, jElapsedRealtime3, jElapsedRealtime3 - jElapsedRealtime2);
                        A0c();
                        if (A8P() == 2) {
                            jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + 1000;
                        } else {
                            jElapsedRealtime = androidx.media3.common.C.TIME_UNSET;
                        }
                        this.A05 = jElapsedRealtime;
                        A0h();
                        A0i();
                        java.lang.String[] strArr8 = A0e;
                        java.lang.String str4 = strArr8[6];
                        java.lang.String mimeType13 = strArr8[2];
                        if (str4.length() != mimeType13.length()) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr9 = A0e;
                        strArr9[6] = "lPLsFaGBdunuftytlmVmE5U";
                        strArr9[2] = "1oPCWqlNg5GTRHTUlg1n75L";
                        this.A0Q = true;
                        this.A0U.A00++;
                        return;
                    } catch (java.lang.Exception e2) {
                        A0k(new com.facebook.ads.redexgen.core.DN(this.A07, (java.lang.Throwable) e2, false, str3));
                        throw null;
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
    }

    public void A1K(long j) {
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    public void A1M(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData;
        boolean z;
        com.facebook.ads.internal.exoplayer2.thirdparty.Format format2 = this.A07;
        this.A07 = format;
        com.facebook.ads.internal.exoplayer2.thirdparty.Format oldFormat = this.A07;
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData2 = oldFormat.A0H;
        if (format2 == null) {
            drmInitData = null;
        } else {
            drmInitData = format2.A0H;
        }
        if (!com.facebook.ads.redexgen.core.IK.A0g(drmInitData2, drmInitData)) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format oldFormat2 = this.A07;
            if (oldFormat2.A0H != null) {
                if (0 != 0) {
                    android.os.Looper.myLooper();
                    throw new java.lang.NullPointerException(A0Z(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 14, 32));
                }
                throw com.facebook.ads.redexgen.core.C05449h.A01(new java.lang.IllegalStateException(A0Z(org.objectweb.asm.Opcodes.INVOKEINTERFACE, 34, 105)), A0z());
            }
            this.A09 = null;
        }
        boolean z2 = false;
        if (0 == 0) {
            android.media.MediaCodec mediaCodec = this.A06;
            java.lang.String[] strArr = A0e;
            if (strArr[0].charAt(11) == strArr[4].charAt(11)) {
                java.lang.String[] strArr2 = A0e;
                strArr2[1] = "PyaEaLonZ";
                strArr2[7] = "QvQAspLXO";
                if (mediaCodec != null) {
                    android.media.MediaCodec mediaCodec2 = this.A06;
                    com.facebook.ads.redexgen.core.DL dl = this.A0A;
                    com.facebook.ads.internal.exoplayer2.thirdparty.Format oldFormat3 = this.A07;
                    switch (A1B(mediaCodec2, dl, format2, oldFormat3)) {
                        case 0:
                            break;
                        case 1:
                            z2 = true;
                            break;
                        case 2:
                        default:
                            throw new java.lang.IllegalStateException();
                        case 3:
                            z2 = true;
                            this.A0L = true;
                            this.A01 = 1;
                            if (this.A00 != 2) {
                                if (this.A00 == 1) {
                                    com.facebook.ads.internal.exoplayer2.thirdparty.Format oldFormat4 = this.A07;
                                    if (oldFormat4.A0F == format2.A0F) {
                                        com.facebook.ads.internal.exoplayer2.thirdparty.Format oldFormat5 = this.A07;
                                        z = oldFormat5.A08 == format2.A08;
                                    }
                                }
                            }
                            this.A0C = z;
                            break;
                    }
                }
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        if (!z2) {
            if (this.A0J) {
                this.A02 = 1;
            } else {
                A1H();
                A1J();
            }
        }
    }

    public boolean A1R(com.facebook.ads.redexgen.core.DL dl) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public boolean A9Q() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public boolean A9b() {
        return (this.A07 == null || this.A0R || (!A19() && !A0m() && (this.A05 == androidx.media3.common.C.TIME_UNSET || android.os.SystemClock.elapsedRealtime() >= this.A05))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r0 == (-5)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        A1M(r6.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r0 == (-5)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r0 != (-4)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(r6.A0Y.A04());
        r6.A0M = true;
        A0d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
    
        return;
     */
    @Override // com.facebook.ads.redexgen.core.ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFe(long j, long j2) throws com.facebook.ads.redexgen.core.C05449h {
        int result;
        if (this.A0N) {
            A1I();
            return;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.Format format = this.A07;
        java.lang.String[] strArr = A0e;
        if (strArr[0].charAt(11) != strArr[4].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0e;
        strArr2[0] = "UGwTrAi0nsGY68u9HqfK8PAJCkvHRv1E";
        strArr2[4] = "F0xlQ2xYxM0Y9K9HN1S0lEKiOWAC93ey";
        if (format == null) {
            this.A0Y.A07();
            java.lang.String[] strArr3 = A0e;
            if (strArr3[3].charAt(27) != strArr3[5].charAt(27)) {
                java.lang.String[] strArr4 = A0e;
                strArr4[1] = "aZhvvzNyr";
                strArr4[7] = "X3dNF4Olv";
                result = A11(this.A0W, this.A0Y, true);
            } else {
                result = A11(this.A0W, this.A0Y, true);
            }
        }
        A1J();
        if (this.A06 != null) {
            com.facebook.ads.redexgen.core.IH.A02(A0Z(677, 12, 8));
            while (A0o(j, j2)) {
            }
            while (A0l()) {
            }
            com.facebook.ads.redexgen.core.IH.A00();
        } else {
            this.A0U.A07 += A10(j);
            this.A0Y.A07();
            int result2 = A11(this.A0W, this.A0Y, false);
            if (result2 == -5) {
                A1M(this.A0W.A00);
            } else if (result2 == -4) {
                com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A0Y.A04());
                this.A0M = true;
                A0d();
            }
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.core.AF
    public final int AH6(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.C05449h {
        try {
            return A1C(this.A0a, null, format);
        } catch (com.facebook.ads.redexgen.core.DU e) {
            throw com.facebook.ads.redexgen.core.C05449h.A01(e, A0z());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee, com.facebook.ads.redexgen.core.AF
    public final int AH8() {
        return 8;
    }
}

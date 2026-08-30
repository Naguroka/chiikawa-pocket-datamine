package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3G extends com.facebook.ads.redexgen.core.AbstractC04826m implements com.facebook.ads.redexgen.core.InterfaceC0746Hv {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"L3tWfB", "F", "EhmjBoqWglyFdQALN75wPmPOVrs4sx1V", "uULe", "m", "RQeZ6095wSpXx7VlLYK0RIZgP3RCEpJD", "T11R5eeuDEJdKCYsxGC1ZLgakYf", "g49TrngkoNyO86UN189kQplFANk"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public android.media.MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final android.content.Context A0B;
    public final com.facebook.ads.redexgen.core.C0575An A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC0581At A0D;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{47, 45, 56, 78, 51, 37, 35, 78, 1, 1, 3, 78, 4, 5, 3, 55, 53, 32, 86, 31, 23, 23, 31, 20, 29, 86, 10, 25, 15, 86, 28, 29, 27, 23, 28, 29, 10, 53, 58, 48, 38, 59, kotlin.io.encoding.Base64.padSymbol, 48, 122, 39, 59, 50, 32, 35, 53, 38, 49, 122, 56, 49, 53, 58, 54, 53, 55, okio.Utf8.REPLACEMENT_BYTE, 117, 97, 112, 125, 123, 59, 102, 117, 99, 13, 6, 15, 0, 0, 11, 2, 67, 13, 1, 27, 0, 26, 14, 3, 20, 9, 10, 18, 3, 102, 107, 124, 97, 127, 98, 122, 107, 84, 88, 65, 20, 80, 87, 73, 76, 77, 20, 74, 80, 67, 92, 5, 1, 5, 13, 51, 49, 42, 44, 49, 42, 55, 58, 36, 54, 58, 39, 59, 50, 122, 37, 54, 35, 50, 30, 12, 0, 30, 24, 3, 10, 98, 125, 106, 119, 126, 116, 108, 125};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(android.content.Context context, com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, boolean z, android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC0576Ao interfaceC0576Ao, com.facebook.ads.redexgen.core.AZ az, com.facebook.ads.redexgen.core.InterfaceC0568Ag... interfaceC0568AgArr) {
        this(context, dr, interfaceC0593Bh, z, handler, interfaceC0576Ao, new com.facebook.ads.redexgen.core.Z3(az, interfaceC0568AgArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3G(android.content.Context context, com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, boolean z, android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC0576Ao interfaceC0576Ao, com.facebook.ads.redexgen.core.InterfaceC0581At interfaceC0581At) {
        super(1, dr, interfaceC0593Bh, z);
        this.A0B = context.getApplicationContext();
        this.A0D = interfaceC0581At;
        this.A0C = new com.facebook.ads.redexgen.core.C0575An(handler, interfaceC0576Ao);
        interfaceC0581At.AGU(new com.facebook.ads.redexgen.core.Z1(this));
    }

    private int A00(com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        android.content.pm.PackageManager packageManager;
        if (com.facebook.ads.redexgen.core.IK.A02 < 24 && A04(15, 22, 57).equals(dl.A02)) {
            boolean z = true;
            if (com.facebook.ads.redexgen.core.IK.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null) {
                boolean needsRawDecoderWorkaround = packageManager.hasSystemFeature(A04(37, 25, 21));
                if (needsRawDecoderWorkaround) {
                    z = false;
                }
            }
            if (z) {
                return -1;
            }
        }
        int i = format.A09;
        if (A0F[4].length() == 17) {
            throw new java.lang.RuntimeException();
        }
        A0F[2] = "fXqyV5kw6OT7Wtv8kj4AmKP3XzDFjN9J";
        return i;
    }

    private final int A01(com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr) {
        int maxInputSize = A00(dl, format);
        return maxInputSize;
    }

    private final android.media.MediaFormat A02(com.facebook.ads.internal.exoplayer2.thirdparty.Format format, java.lang.String str, int i) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString(A04(113, 4, 41), str);
        mediaFormat.setInteger(A04(71, 13, 47), format.A05);
        mediaFormat.setInteger(A04(125, 11, 22), format.A0C);
        com.facebook.ads.redexgen.core.DX.A06(mediaFormat, format.A0P);
        com.facebook.ads.redexgen.core.DX.A04(mediaFormat, A04(99, 14, 120), i);
        if (com.facebook.ads.redexgen.core.IK.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 2), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long jA72 = this.A0D.A72(A9Q());
        if (jA72 != Long.MIN_VALUE) {
            if (!this.A08) {
                long newCurrentPositionUs = this.A05;
                jA72 = java.lang.Math.max(newCurrentPositionUs, jA72);
            }
            this.A05 = jA72;
            this.A08 = false;
        }
    }

    public static boolean A08(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.IK.A02 < 24 && A04(0, 15, 33).equals(str)) {
            if (A04(136, 7, 44).equals(com.facebook.ads.redexgen.core.IK.A05) && (com.facebook.ads.redexgen.core.IK.A03.startsWith(A04(org.objectweb.asm.Opcodes.D2L, 8, 89)) || com.facebook.ads.redexgen.core.IK.A03.startsWith(A04(84, 7, 39)) || com.facebook.ads.redexgen.core.IK.A03.startsWith(A04(91, 8, 79)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(java.lang.String str) {
        int iA00 = com.facebook.ads.redexgen.core.AbstractC0748Hx.A00(str);
        return iA00 != 0 && this.A0D.A9P(iA00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A13() {
        super.A13();
        this.A0D.AEV();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A15() {
        try {
            this.A0D.AEy();
            try {
                super.A15();
            } finally {
                this.A0U.A00();
                this.A0C.A04(this.A0U);
            }
        } catch (java.lang.Throwable th) {
            try {
                super.A15();
                throw th;
            } finally {
                this.A0U.A00();
                this.A0C.A04(this.A0U);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A16(long j, boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        super.A16(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A17(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        super.A17(z);
        this.A0C.A05(this.A0U);
        int i = A12().A00;
        if (i != 0) {
            this.A0D.A5s(i);
        } else {
            this.A0D.A5V();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final int A1B(android.media.MediaCodec mediaCodec, com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.internal.exoplayer2.thirdparty.Format format2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final int A1C(com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.DU {
        java.lang.String str = format.A0O;
        boolean z = false;
        if (!com.facebook.ads.redexgen.core.AbstractC0748Hx.A09(str)) {
            return 0;
        }
        int i = com.facebook.ads.redexgen.core.IK.A02 >= 21 ? 32 : 0;
        boolean zA0y = com.facebook.ads.redexgen.core.AbstractC0666Ee.A0y(interfaceC0593Bh, format.A0H);
        int i2 = 4;
        if (zA0y && A09(str) && dr.A80() != null) {
            return i | 8 | 4;
        }
        java.lang.String mimeType = A04(62, 9, 85);
        if ((mimeType.equals(str) && !this.A0D.A9P(format.A0A)) || !this.A0D.A9P(2)) {
            return 1;
        }
        boolean supportsFormatDrm = false;
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData = format.A0H;
        if (drmInitData != null) {
            for (int tunnelingSupport = 0; tunnelingSupport < drmInitData.A01; tunnelingSupport++) {
                supportsFormatDrm |= drmInitData.A01(tunnelingSupport).A03;
            }
        }
        com.facebook.ads.redexgen.core.DL dlA7A = dr.A7A(str, supportsFormatDrm);
        if (dlA7A == null) {
            return (!supportsFormatDrm || dr.A7A(str, false) == null) ? 1 : 2;
        }
        if (!zA0y) {
            return 2;
        }
        if (com.facebook.ads.redexgen.core.IK.A02 < 21 || ((format.A0C == -1 || dlA7A.A0G(format.A0C)) && (format.A05 == -1 || dlA7A.A0F(format.A05)))) {
            z = true;
        }
        if (!z) {
            i2 = 3;
        }
        return i | 8 | i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final com.facebook.ads.redexgen.core.DL A1F(com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, boolean z) throws com.facebook.ads.redexgen.core.DU {
        if (A09(format.A0O)) {
            com.facebook.ads.redexgen.core.DL dlA80 = dr.A80();
            if (A0F[4].length() == 17) {
                throw new java.lang.RuntimeException();
            }
            A0F[5] = "METof3tp25mzHZV7OR2UQ1qqc32h0eLf";
            if (dlA80 != null) {
                return dlA80;
            }
        }
        com.facebook.ads.redexgen.core.DL passthroughDecoderInfo = super.A1F(dr, format, z);
        return passthroughDecoderInfo;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1I() throws com.facebook.ads.redexgen.core.C05449h {
        try {
            this.A0D.AEW();
        } catch (com.facebook.ads.redexgen.core.C0580As e) {
            throw com.facebook.ads.redexgen.core.C05449h.A01(e, A0z());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1L(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) throws com.facebook.ads.redexgen.core.C05449h {
        int i;
        int[] iArr;
        if (this.A06 != null) {
            i = com.facebook.ads.redexgen.core.AbstractC0748Hx.A00(this.A06.getString(A04(113, 4, 41)));
            mediaFormat = this.A06;
        } else {
            i = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 47));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 22));
        if (this.A09 && integer == 6) {
            int encoding = this.A00;
            if (encoding < 6) {
                int encoding2 = this.A00;
                iArr = new int[encoding2];
                for (int i2 = 0; i2 < encoding; i2++) {
                    iArr[i2] = i2;
                }
            } else {
                iArr = null;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A4l(i, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (com.facebook.ads.redexgen.core.C0577Ap e) {
            int encoding3 = A0z();
            throw com.facebook.ads.redexgen.core.C05449h.A01(e, encoding3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1M(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.C05449h {
        int i;
        super.A1M(format);
        this.A0C.A03(format);
        if (A04(62, 9, 85).equals(format.A0O)) {
            i = format.A0A;
        } else {
            i = 2;
        }
        this.A04 = i;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1N(com.facebook.ads.redexgen.core.C1177Yw c1177Yw) {
        if (!this.A07 || c1177Yw.A03()) {
            return;
        }
        if (java.lang.Math.abs(c1177Yw.A00 - this.A05) > 500000) {
            this.A05 = c1177Yw.A00;
        }
        if (A0F[2].charAt(22) != 'P') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0F;
        strArr[6] = "FWwhG0BBvDuToIoVEugJsm3ERbG";
        strArr[7] = "3ppC0HmXHA3R3HDH3tVsAea2i0b";
        this.A07 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1O(com.facebook.ads.redexgen.core.DL dl, android.media.MediaCodec mediaCodec, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, android.media.MediaCrypto mediaCrypto) {
        this.A01 = A01(dl, format, A1A());
        this.A09 = A08(dl.A02);
        this.A0A = dl.A04;
        android.media.MediaFormat mediaFormatA02 = A02(format, dl.A01 == null ? A04(62, 9, 85) : dl.A01, this.A01);
        mediaCodec.configure(mediaFormatA02, (android.view.Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = mediaFormatA02;
            android.media.MediaFormat mediaFormat = this.A06;
            java.lang.String strA04 = A04(113, 4, 41);
            java.lang.String codecMimeType = format.A0O;
            mediaFormat.setString(strA04, codecMimeType);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1P(java.lang.String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final boolean A1Q(long j, long j2, android.media.MediaCodec mediaCodec, java.nio.ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws java.lang.Exception {
        if (this.A0A && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A08++;
            this.A0D.A8s();
            return true;
        }
        try {
            if (!this.A0D.A8p(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A06++;
            return true;
        } catch (com.facebook.ads.redexgen.core.C0578Aq | com.facebook.ads.redexgen.core.C0580As e) {
            throw com.facebook.ads.redexgen.core.C05449h.A01(e, A0z());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee, com.facebook.ads.redexgen.core.ZA
    public final com.facebook.ads.redexgen.core.InterfaceC0746Hv A7l() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final com.facebook.ads.redexgen.core.A2 A85() {
        return this.A0D.A85();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final long A88() {
        if (A8P() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee, com.facebook.ads.redexgen.core.AC
    public final void A8t(int i, java.lang.Object obj) throws com.facebook.ads.redexgen.core.C05449h {
        switch (i) {
            case 2:
                this.A0D.setVolume(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                this.A0D.AGI((com.facebook.ads.redexgen.core.AY) obj);
                break;
            default:
                super.A8t(i, obj);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.ZA
    public final boolean A9Q() {
        return super.A9Q() && this.A0D.A9Q();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.ZA
    public final boolean A9b() {
        if (!this.A0D.A8y()) {
            boolean zA9b = super.A9b();
            if (A0F[2].charAt(22) != 'P') {
                throw new java.lang.RuntimeException();
            }
            A0F[4] = "YoWTwZwJQMw1hShhdJ";
            if (!zA9b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final com.facebook.ads.redexgen.core.A2 AGa(com.facebook.ads.redexgen.core.A2 a2) {
        return this.A0D.AGa(a2);
    }
}

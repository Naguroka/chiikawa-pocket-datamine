package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1125Wt implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"IyNPMRe3Wq3129mSM2JJi0NNMuNXY8W9", "C94SuBGu", "p8v8XXVPXz4O90kPZAm39VV3npkMPwoF", "0JhHJN6IXOb6Rl6r4FoMpOTStQ2rHZcY", "4KvwhmNBIb78DyW3SVt3pB4MzWrcxbsc", "bfcMZdwzM", "6zjZIoJfL0coyOt5OBcRR6INW9DxFi9j", "1ahrRgqwtfgXyv4XYnMKvvM4rwUartmI"};
    public long A00;
    public android.content.res.AssetFileDescriptor A01;
    public android.net.Uri A02;
    public java.io.InputStream A03;
    public boolean A04;
    public final android.content.res.Resources A05;
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.C1125Wt> A06;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{9, 28, 42, 38, 44, 41, 26, 28, -41, 32, 27, 28, 37, 43, 32, 29, 32, 28, 41, -41, 36, 44, 42, 43, -41, 25, 28, -41, 24, 37, -41, 32, 37, 43, 28, 30, 28, 41, -27, 24, 21, 12, -29, 48, 56, 54, 55, -29, 56, 54, 40, -29, 54, 38, 43, 40, 48, 40, -29, 53, 36, 58, 53, 40, 54, 50, 56, 53, 38, 40, -13, -30, -8, -13, -26, -12, -16, -10, -13, -28, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws com.facebook.ads.redexgen.core.HK {
        try {
            this.A02 = h3.A04;
            if (!android.text.TextUtils.equals(A00(70, 11, 29), this.A02.getScheme())) {
                throw new com.facebook.ads.redexgen.core.HK(A00(39, 31, 95));
            }
            try {
                this.A01 = this.A05.openRawResourceFd(java.lang.Integer.parseInt(this.A02.getLastPathSegment()));
                this.A03 = new java.io.FileInputStream(this.A01.getFileDescriptor());
                this.A03.skip(this.A01.getStartOffset());
                if (this.A03.skip(h3.A03) < h3.A03) {
                    throw new java.io.EOFException();
                }
                long j = h3.A02;
                if (A08[7].charAt(18) != 'M') {
                    throw new java.lang.RuntimeException();
                }
                A08[2] = "NeR0SJjHXwq6S99lykBHPSy65ApZKYsP";
                if (j != -1) {
                    this.A00 = h3.A02;
                } else {
                    long length = this.A01.getLength();
                    this.A00 = length != -1 ? length - h3.A03 : -1L;
                }
                this.A04 = true;
                if (this.A06 != null) {
                    this.A06.ADs(this, h3);
                }
                long j2 = this.A00;
                if (A08[5].length() != 9) {
                    A08[5] = "brCRBkm5E";
                    return j2;
                }
                A08[1] = "jAn2ZAPLqPp6gMTdEbZr";
                return j2;
            } catch (java.lang.NumberFormatException unused) {
                throw new com.facebook.ads.redexgen.core.HK(A00(0, 39, 83));
            }
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.HK(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public C1125Wt(android.content.Context context, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.C1125Wt> hl) {
        this.A05 = context.getResources();
        this.A06 = hl;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return this.A02;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004b */
    /* JADX WARN: Bottom block not found for handler: all -> 0x00aa */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws com.facebook.ads.redexgen.core.HK {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.C1125Wt> hl = this.A06;
                            if (A08[5].length() != 9) {
                                throw new java.lang.RuntimeException();
                            }
                            A08[1] = "2MhjdMt8WeGViEW378NV";
                            hl.ADr(this);
                        }
                    }
                } catch (java.io.IOException e) {
                    throw new com.facebook.ads.redexgen.core.HK(e);
                }
            } catch (java.lang.Throwable th) {
                this.A03 = null;
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                    throw th;
                } catch (java.io.IOException e2) {
                    throw new com.facebook.ads.redexgen.core.HK(e2);
                }
            }
        } catch (java.io.IOException e3) {
            throw new com.facebook.ads.redexgen.core.HK(e3);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            java.lang.String[] strArr = A08;
            if (strArr[4].charAt(20) != strArr[3].charAt(20)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[0] = "YO0PXEoDNxNkeyj6J5zVBwlvhUUksa7C";
            strArr2[6] = "J54PJiBLJytnlOojbjnozVdd3pHXhFgw";
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i2 = (int) java.lang.Math.min(this.A00, i2);
            }
            int i3 = this.A03.read(bArr, i, i2);
            if (i3 == -1) {
                if (this.A00 == -1) {
                    return -1;
                }
                throw new com.facebook.ads.redexgen.core.HK(new java.io.EOFException());
            }
            if (this.A00 != -1) {
                this.A00 -= (long) i3;
            }
            if (this.A06 != null) {
                this.A06.ABS(this, i3);
            }
            return i3;
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.HK(e);
        }
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1179Yy implements com.facebook.ads.redexgen.core.InterfaceC0568Ag {
    public static java.lang.String[] A0D = {"NxTbi7bx", "NV", "29YIJTQraO09", "tSBtmW6rpVAi", "UK8XAzXUIUX", com.json.zb.q, "AP", "UABkszmBYQrswcP0tzS304augAMBuSYm"};
    public long A06;
    public long A07;
    public com.facebook.ads.redexgen.core.BB A08;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;
    public java.nio.ByteBuffer A09 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    public java.nio.ShortBuffer A0B = this.A09.asShortBuffer();
    public java.nio.ByteBuffer A0A = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    public int A04 = -1;

    public final float A00(float f) {
        float fA00 = com.facebook.ads.redexgen.core.IK.A00(f, 0.1f, 8.0f);
        if (this.A00 != fA00) {
            this.A00 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final float A01(float f) {
        float fA00 = com.facebook.ads.redexgen.core.IK.A00(f, 0.1f, 8.0f);
        if (this.A01 != fA00) {
            this.A01 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final long A02(long j) {
        if (this.A07 >= 1024) {
            if (this.A03 == this.A05) {
                return com.facebook.ads.redexgen.core.IK.A0F(j, this.A06, this.A07);
            }
            return com.facebook.ads.redexgen.core.IK.A0F(j, this.A06 * ((long) this.A03), this.A07 * ((long) this.A05));
        }
        return (long) (((double) this.A01) * j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A4m(int i, int i2, int i3) throws com.facebook.ads.redexgen.core.C0567Af {
        int i4;
        if (i3 == 2) {
            if (this.A04 == -1) {
                i4 = i;
            } else {
                i4 = this.A04;
            }
            int outputSampleRateHz = this.A05;
            if (outputSampleRateHz == i) {
                int outputSampleRateHz2 = this.A02;
                if (outputSampleRateHz2 == i2) {
                    int outputSampleRateHz3 = this.A03;
                    if (outputSampleRateHz3 == i4) {
                        return false;
                    }
                }
            }
            this.A05 = i;
            this.A02 = i2;
            this.A03 = i4;
            this.A08 = null;
            return true;
        }
        throw new com.facebook.ads.redexgen.core.C0567Af(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final java.nio.ByteBuffer A7u() {
        java.nio.ByteBuffer byteBuffer = this.A0A;
        java.nio.ByteBuffer outputBuffer = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A0A = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7v() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7x() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9L() {
        return this.A05 != -1 && (java.lang.Math.abs(this.A01 - 1.0f) >= 0.01f || java.lang.Math.abs(this.A00 - 1.0f) >= 0.01f || this.A03 != this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9Q() {
        if (this.A0C) {
            if (this.A08 != null) {
                com.facebook.ads.redexgen.core.BB bb = this.A08;
                if (A0D[4].length() != 11) {
                    throw new java.lang.RuntimeException();
                }
                A0D[7] = "db88kXXxHhEdgH646vKmXFO9QUk0hgxF";
                if (bb.A0H() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEh() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A08 != null);
        this.A08.A0J();
        this.A0C = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEi(java.nio.ByteBuffer byteBuffer) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A08 != null);
        boolean zHasRemaining = byteBuffer.hasRemaining();
        java.lang.String[] strArr = A0D;
        if (strArr[5].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0D;
        strArr2[5] = androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY;
        strArr2[0] = "UChWpKt8";
        if (zHasRemaining) {
            java.nio.ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.A06 += (long) iRemaining;
            this.A08.A0L(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iA0H = this.A08.A0H() * this.A02 * 2;
        if (iA0H > 0) {
            java.nio.ByteBuffer byteBuffer2 = this.A09;
            java.lang.String[] strArr3 = A0D;
            java.lang.String str = strArr3[6];
            java.lang.String str2 = strArr3[1];
            int length = str.length();
            int outputSize = str2.length();
            if (length != outputSize) {
                int outputSize2 = byteBuffer2.capacity();
                if (outputSize2 < iA0H) {
                    this.A09 = java.nio.ByteBuffer.allocateDirect(iA0H).order(java.nio.ByteOrder.nativeOrder());
                    this.A0B = this.A09.asShortBuffer();
                } else {
                    this.A09.clear();
                    this.A0B.clear();
                }
            } else {
                A0D[4] = "5PqBhzTCE0A";
                int outputSize3 = byteBuffer2.capacity();
                if (outputSize3 < iA0H) {
                    this.A09 = java.nio.ByteBuffer.allocateDirect(iA0H).order(java.nio.ByteOrder.nativeOrder());
                    this.A0B = this.A09.asShortBuffer();
                } else {
                    this.A09.clear();
                    this.A0B.clear();
                }
            }
            this.A08.A0K(this.A0B);
            this.A07 += (long) iA0H;
            this.A09.limit(iA0H);
            this.A0A = this.A09;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void flush() {
        if (A9L()) {
            if (this.A08 == null) {
                this.A08 = new com.facebook.ads.redexgen.core.BB(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                com.facebook.ads.redexgen.core.BB bb = this.A08;
                if (A0D[4].length() != 11) {
                    throw new java.lang.RuntimeException();
                }
                A0D[7] = "o7knR9hqYviLmp7iDxNouRnOfflm0cpl";
                bb.A0I();
            }
        }
        this.A0A = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        this.A09 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A0B = this.A09.asShortBuffer();
        this.A0A = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}

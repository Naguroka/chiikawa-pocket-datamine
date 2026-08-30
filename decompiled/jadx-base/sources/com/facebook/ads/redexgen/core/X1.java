package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X1 implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"aq4IliIWDDncC3AYch6yko", "K", "7WihoyLotnvTQHZz2idft8ZXTVKY4zx7", "gI1erRXXD147Xe9Gq10kF", "pKYfB4E7PRZj7oqyTjC", "XBwEDGx62tHxzBOzLhjigx6FF1XIbcg4", "Gmgd", "152cUSbY7JMQW"};
    public long A00;
    public android.net.Uri A01;
    public java.io.RandomAccessFile A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.X1> A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{15};
    }

    static {
        A01();
    }

    public X1() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public X1(com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.X1> hl) {
        this.A04 = hl;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        try {
            this.A01 = h3.A04;
            this.A02 = new java.io.RandomAccessFile(h3.A04.getPath(), A00(0, 1, 46));
            this.A02.seek(h3.A03);
            this.A00 = h3.A02 == -1 ? this.A02.length() - h3.A03 : h3.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                if (this.A04 != null) {
                    com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.X1> hl = this.A04;
                    if (A06[3].length() == 0) {
                        throw new java.lang.RuntimeException();
                    }
                    A06[4] = "kaTpwzrFHguK6C5ilEAmkkkNX";
                    hl.ADs(this, h3);
                }
                return this.A00;
            }
            throw new java.io.EOFException();
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.H6(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws com.facebook.ads.redexgen.core.H6 {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                if (this.A03) {
                    this.A03 = false;
                    if (this.A04 != null) {
                        this.A04.ADr(this);
                    }
                }
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.H6(e);
            }
        } catch (java.lang.Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                if (this.A04 != null) {
                    this.A04.ADr(this);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            if (A06[3].length() == 0) {
                throw new java.lang.RuntimeException();
            }
            A06[3] = "SS1vrryUNPm";
            return -1;
        }
        try {
            int i3 = this.A02.read(bArr, i, (int) java.lang.Math.min(this.A00, i2));
            if (i3 > 0) {
                this.A00 -= (long) i3;
                if (this.A04 != null) {
                    this.A04.ABS(this, i3);
                }
            }
            return i3;
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.H6(e);
        }
    }
}

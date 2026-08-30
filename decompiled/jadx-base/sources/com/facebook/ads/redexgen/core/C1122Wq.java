package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1122Wq implements com.facebook.ads.redexgen.core.InterfaceC0722Gx {
    public static java.lang.String[] A0B = {"O9FvuKNm9Ic7vWVIOgmWo6M6Rn16GEKF", "jzCTQcr3kWPaI80CUjbIE10W230TUzkC", "OGCWJ8MD0aQs1rzTOn0Vjde8DqfkZq8g", "ED1Lm6gLEaTbYzKuTAynsKw0VrQmiyDF", "ADZm06Sr8xsGprSkDFbUPye7calVVjK5", "4YYO9RaBhRqFLuXkLeBvFQjBmPoVatzd", "qTUPArcDYrTCckej64g9Bs5w5vMlxcQY", "EfRxebdqtmYzM7REr089ZAH8rT5xoOFL"};
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.H3 A02;
    public com.facebook.ads.redexgen.core.IB A03;
    public java.io.File A04;
    public java.io.FileOutputStream A05;
    public java.io.OutputStream A06;
    public final int A07;
    public final long A08;
    public final com.facebook.ads.redexgen.core.HP A09;
    public final boolean A0A;

    public C1122Wq(com.facebook.ads.redexgen.core.HP hp, long j) {
        this(hp, j, androidx.media3.datasource.cache.CacheDataSink.DEFAULT_BUFFER_SIZE, true);
    }

    public C1122Wq(com.facebook.ads.redexgen.core.HP hp, long j, int i, boolean z) {
        this.A09 = (com.facebook.ads.redexgen.core.HP) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(hp);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() throws java.io.IOException {
        if (this.A06 == null) {
            return;
        }
        boolean z = false;
        try {
            this.A06.flush();
            if (this.A0A) {
                this.A05.getFD().sync();
            }
            boolean z2 = true;
            java.lang.Object[] objArr = objArr == true ? 1 : 0;
        } finally {
            com.facebook.ads.redexgen.core.IK.A0X(this.A06);
            this.A06 = null;
            java.io.File file = this.A04;
            this.A04 = null;
            if (z) {
                this.A09.A4j(file);
            } else {
                file.delete();
            }
        }
    }

    private void A01() throws java.io.IOException {
        long maxLength;
        if (this.A02.A02 == -1) {
            maxLength = this.A08;
        } else {
            maxLength = java.lang.Math.min(this.A02.A02 - this.A00, this.A08);
        }
        this.A04 = this.A09.AGu(this.A02.A05, this.A00 + this.A02.A01, maxLength);
        this.A05 = new java.io.FileOutputStream(this.A04);
        if (this.A07 > 0) {
            if (this.A03 == null) {
                this.A03 = new com.facebook.ads.redexgen.core.IB(this.A05, this.A07);
            } else {
                this.A03.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
        if (A0B[1].charAt(8) == 'w') {
            throw new java.lang.RuntimeException();
        }
        A0B[1] = "Vc4jFbtJFhDJOpD2utN43xt10XGoOu5t";
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0722Gx
    public final void AEG(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        if (h3.A02 == -1 && !h3.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = h3;
        this.A00 = 0L;
        try {
            A01();
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1123Wr(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0722Gx
    public final void close() throws java.io.IOException {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1123Wr(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0722Gx
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.A02 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.A01 == this.A08) {
                    A00();
                    A01();
                }
                int bytesWritten = i2 - i3;
                int iMin = (int) java.lang.Math.min(bytesWritten, this.A08 - this.A01);
                int bytesWritten2 = i + i3;
                this.A06.write(bArr, bytesWritten2, iMin);
                i3 += iMin;
                this.A01 += (long) iMin;
                this.A00 += (long) iMin;
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.C1123Wr(e);
            }
        }
    }
}

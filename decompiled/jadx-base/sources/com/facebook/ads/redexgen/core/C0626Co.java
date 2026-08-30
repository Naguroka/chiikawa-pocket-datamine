package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0626Co {
    public int A01;
    public boolean A02;
    public final com.facebook.ads.redexgen.core.C0627Cp A03 = new com.facebook.ads.redexgen.core.C0627Cp();
    public final com.facebook.ads.redexgen.core.I4 A04 = new com.facebook.ads.redexgen.core.I4(new byte[androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    public int A00 = -1;

    private int A00(int i) {
        this.A01 = 0;
        int i2 = 0;
        while (i < size) {
            int[] iArr = this.A03.A09;
            int i3 = this.A01;
            int size = i3 + 1;
            this.A01 = size;
            int segmentLength = iArr[i3 + i];
            i2 += segmentLength;
            if (segmentLength != 255) {
                break;
            }
        }
        return i2;
    }

    public final com.facebook.ads.redexgen.core.C0627Cp A01() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.I4 A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        this.A04.A00 = java.util.Arrays.copyOf(this.A04.A00, java.lang.Math.max(androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, this.A04.A07()));
    }

    public final boolean A05(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(interfaceC0610By != null);
        if (this.A02) {
            this.A02 = false;
            this.A04.A0V();
        }
        while (!this.A02) {
            if (this.A00 < 0) {
                if (!this.A03.A03(interfaceC0610By, true)) {
                    return false;
                }
                int segmentIndex = 0;
                int iA00 = this.A03.A01;
                if ((this.A03.A04 & 1) == 1 && this.A04.A07() == 0) {
                    iA00 += A00(0);
                    segmentIndex = 0 + this.A01;
                }
                interfaceC0610By.AGq(iA00);
                this.A00 = segmentIndex;
            }
            int iA01 = A00(this.A00);
            int size = this.A00 + this.A01;
            if (iA01 > 0) {
                if (this.A04.A05() < this.A04.A07() + iA01) {
                    this.A04.A00 = java.util.Arrays.copyOf(this.A04.A00, this.A04.A07() + iA01);
                }
                interfaceC0610By.readFully(this.A04.A00, this.A04.A07(), iA01);
                this.A04.A0X(this.A04.A07() + iA01);
                this.A02 = this.A03.A09[size + (-1)] != 255;
            }
            if (size == this.A03.A02) {
                size = -1;
            }
            this.A00 = size;
        }
        return true;
    }
}

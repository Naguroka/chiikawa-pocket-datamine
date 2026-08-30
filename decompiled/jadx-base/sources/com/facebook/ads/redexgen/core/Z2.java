package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z2 implements com.facebook.ads.redexgen.core.InterfaceC0568Ag {
    public static java.lang.String[] A06 = {"sNaJDElCp9cCYWYxYRwKU5WVGnQK3THd", "6iN20dDIHc3laoZszST3X2V8JHbMwesE", "WJ2r6eqwNngLa5n94Jh8ZvF", "QMIaZXPM6pynUAzwsdBa2h7UbkKjwIrX", "0KCAAUDfv21yomJIoulyUBykFyq3BOhp", "wPQqgsrO3MAOXcdZXrdV1WawN6tKhXR", "hbMvKz96yGU44IBt9IAKrTB8rFgNUtiF", "o3fpCyt11"};
    public static final int A07 = java.lang.Float.floatToIntBits(Float.NaN);
    public boolean A05;
    public int A01 = -1;
    public int A00 = -1;
    public int A02 = 0;
    public java.nio.ByteBuffer A03 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    public java.nio.ByteBuffer A04 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;

    public static void A00(int i, java.nio.ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (((double) i) * 4.656612875245797E-10d);
        int floatBits = java.lang.Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A07) {
            floatBits = java.lang.Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A4m(int i, int i2, int i3) throws com.facebook.ads.redexgen.core.C0567Af {
        if (com.facebook.ads.redexgen.core.IK.A0b(i3)) {
            if (this.A01 == i) {
                int i4 = this.A00;
                if (A06[6].charAt(12) != '4') {
                    throw new java.lang.RuntimeException();
                }
                A06[0] = "qGQ22GZNFdEfH23m47dfyhgZCsriR0f5";
                if (i4 == i2 && this.A02 == i3) {
                    return false;
                }
            }
            this.A01 = i;
            this.A00 = i2;
            this.A02 = i3;
            return true;
        }
        throw new com.facebook.ads.redexgen.core.C0567Af(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final java.nio.ByteBuffer A7u() {
        java.nio.ByteBuffer byteBuffer = this.A04;
        java.nio.ByteBuffer outputBuffer = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7v() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7w() {
        return 4;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7x() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9L() {
        return com.facebook.ads.redexgen.core.IK.A0b(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9Q() {
        return this.A05 && this.A04 == com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEh() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEi(java.nio.ByteBuffer byteBuffer) {
        boolean z = this.A02 == 1073741824;
        int resampledSize = byteBuffer.position();
        int size = byteBuffer.limit();
        int position = size - resampledSize;
        if (!z) {
            int i = position / 3;
            java.lang.String[] strArr = A06;
            if (strArr[2].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "SEhS82f1utJV4VSuTRIDotCQPw8rIShK";
            position = i * 4;
        }
        if (this.A03.capacity() < position) {
            this.A03 = java.nio.ByteBuffer.allocateDirect(position).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        if (z) {
            while (resampledSize < size) {
                A00((byteBuffer.get(resampledSize) & 255) | ((byteBuffer.get(resampledSize + 1) & 255) << 8) | ((byteBuffer.get(resampledSize + 2) & 255) << 16) | ((byteBuffer.get(resampledSize + 3) & 255) << 24), this.A03);
                resampledSize += 4;
            }
        } else {
            while (resampledSize < size) {
                A00(((byteBuffer.get(resampledSize) & 255) << 8) | ((byteBuffer.get(resampledSize + 1) & 255) << 16) | ((byteBuffer.get(resampledSize + 2) & 255) << 24), this.A03);
                resampledSize += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void flush() {
        this.A04 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void reset() {
        flush();
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 0;
        this.A03 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    }
}

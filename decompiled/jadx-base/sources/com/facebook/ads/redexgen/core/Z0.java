package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z0 implements com.facebook.ads.redexgen.core.InterfaceC0568Ag {
    public static java.lang.String[] A06 = {"x4SLKw0ecPcHsWHgO1Td4vJ14144RMMS", "Zh7tfC3TFBRtLhPe9z1RavfnQghohUvM", "5a1nSgSc9ubjxiTpcQH3XZ5BSJHYyomE", "9hzCYTVbSoKGzhiGE0INbgm8vz2Ul1tD", "U5QynYTJKvqXrBDteFA3kKN8MUDMbs9q", "vYVMMAOqO79qbNxEgxq93Z6FBxHJHfxt", "X8bjNxmBNAlkg", "EWWs7bfWX2zABqEPcCAhkdtns4Cu5rHI"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public java.nio.ByteBuffer A03 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    public java.nio.ByteBuffer A04 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A4m(int i, int i2, int i3) throws com.facebook.ads.redexgen.core.C0567Af {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.A02 == i && this.A00 == i2 && this.A01 == i3) {
                return false;
            }
            this.A02 = i;
            this.A00 = i2;
            this.A01 = i3;
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
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final int A7x() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9L() {
        return (this.A01 == 0 || this.A01 == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final boolean A9Q() {
        if (this.A05) {
            java.nio.ByteBuffer byteBuffer = this.A04;
            java.nio.ByteBuffer byteBuffer2 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
            if (A06[3].charAt(27) != 'U') {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "37MFS79N5bC4O";
            if (byteBuffer == byteBuffer2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEh() {
        this.A05 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void AEi(java.nio.ByteBuffer byteBuffer) {
        int limit;
        int i = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int limit2 = resampledSize - i;
        int position = this.A01;
        switch (position) {
            case Integer.MIN_VALUE:
                int position2 = limit2 / 3;
                limit = position2 * 2;
                break;
            case 3:
                limit = limit2 * 2;
                break;
            case 1073741824:
                limit = limit2 / 2;
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        int position3 = this.A03.capacity();
        if (position3 < limit) {
            this.A03 = java.nio.ByteBuffer.allocateDirect(limit).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        int i2 = this.A01;
        java.lang.String[] strArr = A06;
        java.lang.String str = strArr[1];
        java.lang.String str2 = strArr[0];
        int limit3 = str.charAt(21);
        int position4 = str2.charAt(21);
        if (limit3 != position4) {
            throw new java.lang.RuntimeException();
        }
        A06[4] = "sqNpl1OaV4AX2PiDopzrEiO6zTyyi8x2";
        switch (i2) {
            case Integer.MIN_VALUE:
                while (i < resampledSize) {
                    int position5 = i + 1;
                    this.A03.put(byteBuffer.get(position5));
                    int position6 = i + 2;
                    this.A03.put(byteBuffer.get(position6));
                    i += 3;
                }
                int position7 = byteBuffer.limit();
                byteBuffer.position(position7);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case 3:
                while (i < resampledSize) {
                    this.A03.put((byte) 0);
                    java.nio.ByteBuffer byteBuffer2 = this.A03;
                    int position8 = byteBuffer.get(i);
                    byteBuffer2.put((byte) ((position8 & 255) - 128));
                    i++;
                }
                int position9 = byteBuffer.limit();
                byteBuffer.position(position9);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case 1073741824:
                while (i < resampledSize) {
                    int position10 = i + 2;
                    this.A03.put(byteBuffer.get(position10));
                    int position11 = i + 3;
                    this.A03.put(byteBuffer.get(position11));
                    i += 4;
                }
                int position12 = byteBuffer.limit();
                byteBuffer.position(position12);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void flush() {
        this.A04 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0568Ag
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = com.facebook.ads.redexgen.core.InterfaceC0568Ag.A00;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1164Yj implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"zt1pBITgxzsmHMUWvaAytB5oIAm5U4mW", "7u7ZtLLpgpZX2JaKu3RBSVq4wIGxJUML", "IvG2IiuARv1bNydH7ZsGtUjBB55Zn0nQ", "kdo0JSRc9pvnigPvue4Xab18IyA3oBmw", "se0649YBVELxvg2u8qjfRL4a8hOqLiYD", "LLzBmDnTsaXnYpxdfV28zI1qxXqBoOSY", "SE3z471WcNKVQWc5YUCjUdJ92skp7xN1", "sOf0Ss8IsRLfs7RvuxpnH3345ckjOUQ1"};
    public static final com.facebook.ads.redexgen.core.C0 A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A06;
    public com.facebook.ads.redexgen.core.C1166Yl A07;
    public com.facebook.ads.redexgen.core.C1161Yg A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.I4 A0C = new com.facebook.ads.redexgen.core.I4(4);
    public final com.facebook.ads.redexgen.core.I4 A0B = new com.facebook.ads.redexgen.core.I4(9);
    public final com.facebook.ads.redexgen.core.I4 A0E = new com.facebook.ads.redexgen.core.I4(11);
    public final com.facebook.ads.redexgen.core.I4 A0D = new com.facebook.ads.redexgen.core.I4();
    public final com.facebook.ads.redexgen.core.C1163Yi A0A = new com.facebook.ads.redexgen.core.C1163Yi();
    public int A01 = 1;
    public long A04 = androidx.media3.common.C.TIME_UNSET;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{53, okio.Utf8.REPLACEMENT_BYTE, 37};
    }

    static {
        A03();
        A0H = new com.facebook.ads.redexgen.core.C1165Yk();
        A0I = com.facebook.ads.redexgen.core.IK.A08(A01(0, 3, 2));
    }

    private com.facebook.ads.redexgen.core.I4 A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A02 > this.A0D.A05()) {
            this.A0D.A0b(new byte[java.lang.Math.max(this.A0D.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0610By.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.AG8(new com.facebook.ads.redexgen.core.C1169Yo(androidx.media3.common.C.TIME_UNSET));
            this.A09 = true;
        }
        if (this.A04 != androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        this.A04 = this.A0A.A0D() == androidx.media3.common.C.TIME_UNSET ? -this.A05 : 0L;
    }

    private void A04(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AGq(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (!interfaceC0610By.AEp(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        this.A0B.A0Y(0);
        this.A0B.A0Z(4);
        int iA0E = this.A0B.A0E();
        int flags = iA0E & 4;
        boolean hasVideo = flags != 0;
        int flags2 = iA0E & 1;
        boolean z = flags2 != 0;
        if (hasVideo && this.A07 == null) {
            this.A07 = new com.facebook.ads.redexgen.core.C1166Yl(this.A06.AHA(8, 1));
        }
        if (z && this.A08 == null) {
            this.A08 = new com.facebook.ads.redexgen.core.C1161Yg(this.A06.AHA(9, 2));
        }
        this.A06.A5u();
        int flags3 = this.A0B.A08();
        this.A00 = (flags3 - 9) + 4;
        this.A01 = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    private boolean A06(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        boolean z = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(interfaceC0610By), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC0610By), this.A04 + this.A05);
        } else if (this.A03 == 18) {
            boolean wasConsumed = this.A09;
            if (!wasConsumed) {
                com.facebook.ads.redexgen.core.C1163Yi c1163Yi = this.A0A;
                com.facebook.ads.redexgen.core.I4 i4A00 = A00(interfaceC0610By);
                long j = this.A05;
                if (A0G[5].charAt(21) == 'w') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0G;
                strArr[7] = "mj80KOMEu16tqWUXBnNHxeaKVPo5oU6C";
                strArr[1] = "zxPOngcXIHhvnVp4vPZDAIcXSgjgtU2G";
                c1163Yi.A00(i4A00, j);
                long jA0D = this.A0A.A0D();
                if (jA0D != androidx.media3.common.C.TIME_UNSET) {
                    this.A06.AG8(new com.facebook.ads.redexgen.core.C1169Yo(jA0D));
                    this.A09 = true;
                }
            } else {
                interfaceC0610By.AGq(this.A02);
                z = false;
            }
        } else {
            interfaceC0610By.AGq(this.A02);
            z = false;
        }
        java.lang.String[] strArr2 = A0G;
        if (strArr2[3].charAt(30) != strArr2[0].charAt(30)) {
            throw new java.lang.RuntimeException();
        }
        A0G[5] = "NAWWjYKyn9shN6r2ddcZ6FkIefXbre7e";
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A07(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (!interfaceC0610By.AEp(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Y(0);
        this.A03 = this.A0E.A0E();
        this.A02 = this.A0E.A0G();
        this.A05 = this.A0E.A0G();
        this.A05 = (((long) (this.A0E.A0E() << 24)) | this.A05) * 1000;
        this.A0E.A0Z(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A06 = interfaceC0611Bz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        while (true) {
            switch (this.A01) {
                case 1:
                    boolean zA05 = A05(interfaceC0610By);
                    if (A0G[2].charAt(16) != '7') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0G;
                    strArr[3] = "lzNTxUwdPYSEX7KxXdfoU9Jel9TdPRmy";
                    strArr[0] = "dwxFKqzmLOpJEVaesL1sqXFx2quAiAmV";
                    if (!zA05) {
                        return -1;
                    }
                    break;
                case 2:
                    A04(interfaceC0610By);
                    break;
                case 3:
                    if (!A07(interfaceC0610By)) {
                        return -1;
                    }
                    break;
                    break;
                case 4:
                    if (A06(interfaceC0610By)) {
                        return 0;
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A01 = 1;
        this.A04 = androidx.media3.common.C.TIME_UNSET;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AEO(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0610By.AEO(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC0610By.AEO(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int iA08 = this.A0C.A08();
        interfaceC0610By.AFq();
        if (A0G[2].charAt(16) != '7') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0G;
        strArr[3] = "jHm5wQ2h5CdJRaHq01DeTIzeP75tyemy";
        strArr[0] = "1pZwakHop6oqeKEv01FiWhbI6ptDvumC";
        interfaceC0610By.A3s(iA08);
        interfaceC0610By.AEO(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        return dataOffset == 0;
    }
}

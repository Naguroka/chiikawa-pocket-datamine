package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1386cw {
    public static byte[] A03;
    public java.io.File A00;
    public java.io.RandomAccessFile A01;
    public final com.facebook.ads.redexgen.core.C0B A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-90, -25, -7, -90, -22, -17, -7, -23, -90, -23, -25, -23, -18, -21, -112, -42, -33, -30, -112, -45, -33, -35, -32, -36, -43, -28, -39, -33, -34, -111, -33, 40, 50, -33, 34, 46, 44, 47, 43, 36, 51, 36, 35, -32, -44, 40, 35, -44, -50, 4, 15, 23, 14, 12, 15, 1, 4, -62, -32, -19, -90, -13, -97, -30, -21, -28, -32, -19, -97, -27, -24, -21, -28, -51, -6, -6, -9, -6, -88, -23, -8, -8, -19, -10, -20, -88, -21, -23, -21, -16, -19, -62, -88, -21, -23, -21, -16, -19, -88, -18, -15, -12, -19, -88, -29, 16, 16, 13, 16, -66, 1, 10, 13, 17, 7, 12, 5, -66, 4, 7, 10, 3, -66, -72, -27, -27, -30, -27, -109, -30, -29, -40, -31, -36, -31, -38, -109, -44, 1, 1, -2, 1, -81, 1, -12, -16, -13, -8, -3, -10, -81, -5, -12, -3, -10, 3, -9, -81, -2, -11, -81, -11, -8, -5, -12, -81, -119, -74, -74, -77, -74, 100, -74, -87, -78, -91, -79, -83, -78, -85, 100, -86, -83, -80, -87, 100, -68, -23, -23, -26, -23, -105, -20, -22, -32, -27, -34, -105, -35, -32, -29, -36, -105, -50, -5, -5, -8, -5, -87, 0, -5, -14, -3, -14, -9, -16, -87, -82, -19, -87, -21, 2, -3, -18, -4, -87, -3, -8, -87, -82, -4, -87, -17, -5, -8, -10, -87, -21, -2, -17, -17, -18, -5, -87, 0, -14, -3, -15, -87, -4, -14, 3, -18, -87, -82, -19, -16, -11, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07() throws com.facebook.ads.redexgen.core.C1384cu {
        if (A09()) {
            return;
        }
        A06();
        java.io.File file = new java.io.File(this.A00.getParentFile(), this.A00.getName().substring(0, this.A00.getName().length() - A00(48, 9, 95).length()));
        if (!this.A00.renameTo(file)) {
            throw new com.facebook.ads.redexgen.core.C1384cu(A00(org.objectweb.asm.Opcodes.IF_ACMPNE, 20, 3) + this.A00 + A00(44, 4, 115) + file + A00(14, 16, 47));
        }
        this.A00 = file;
        try {
            this.A01 = new java.io.RandomAccessFile(this.A00, A00(256, 1, 61));
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1384cu(A00(123, 14, 50) + this.A00 + A00(0, 14, 69), e);
        }
    }

    public C1386cw(java.io.File file, com.facebook.ads.redexgen.core.C0B c0b) throws com.facebook.ads.redexgen.core.C1384cu {
        try {
            if (c0b != null) {
                this.A02 = c0b;
                java.io.File directory = file.getParentFile();
                com.facebook.ads.redexgen.core.C0E.A06(directory);
                boolean zExists = file.exists();
                this.A00 = zExists ? file : new java.io.File(file.getParentFile(), file.getName() + A00(48, 9, 95));
                this.A01 = new java.io.RandomAccessFile(this.A00, zExists ? A00(256, 1, 61) : A00(257, 2, 66));
                return;
            }
            throw new java.lang.NullPointerException();
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1384cu(A00(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 17, 54) + file + A00(0, 14, 69), e);
        }
    }

    private boolean A02(java.io.File file) {
        return file.getName().endsWith(A00(48, 9, 95));
    }

    public final synchronized int A03() throws com.facebook.ads.redexgen.core.C1384cu {
        try {
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1384cu(A00(org.objectweb.asm.Opcodes.L2F, 29, 78) + this.A00, e);
        }
        return (int) this.A01.length();
    }

    public final java.io.File A04() {
        return this.A00;
    }

    public final synchronized void A05() throws com.facebook.ads.redexgen.core.C1384cu {
        try {
            this.A01.setLength(0L);
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1384cu(A00(57, 16, 62), e);
        }
    }

    public final synchronized void A06() throws com.facebook.ads.redexgen.core.C1384cu {
        try {
            this.A01.close();
            this.A02.AH9(this.A00);
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1384cu(A00(104, 19, 93) + this.A00, e);
        }
    }

    public final synchronized void A08(byte[] bArr, int i) throws com.facebook.ads.redexgen.core.C1384cu {
        try {
            if (!A09()) {
                this.A01.seek(A03());
                this.A01.write(bArr, 0, i);
            } else {
                throw new com.facebook.ads.redexgen.core.C1384cu(A00(73, 31, 71) + this.A00 + A00(30, 14, 126));
            }
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C1384cu(java.lang.String.format(java.util.Locale.US, A00(com.ironsource.g3.c.b.d, 53, 72), java.lang.Integer.valueOf(i), this.A01, java.lang.Integer.valueOf(bArr.length)), e);
        }
    }

    public final synchronized boolean A09() {
        return !A02(this.A00);
    }
}

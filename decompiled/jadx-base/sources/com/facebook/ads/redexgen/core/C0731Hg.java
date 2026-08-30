package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0731Hg extends java.io.OutputStream {
    public static byte[] A02;
    public boolean A00 = false;
    public final java.io.FileOutputStream A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-51, 0, -5, -7, -11, -17, -46, -11, -8, -15, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -27, -21, -32, -43, -110, -40, -37, -34, -41, -110, -42, -41, -27, -43, -28, -37, -30, -26, -31, -28, -84};
    }

    public C0731Hg(java.io.File file) throws java.io.FileNotFoundException {
        this.A01 = new java.io.FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        flush();
        try {
            this.A01.getFD().sync();
        } catch (java.io.IOException e) {
            android.util.Log.w(A00(0, 10, 34), A00(10, 31, 8), e);
        }
        this.A01.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.A01.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        this.A01.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        this.A01.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.A01.write(bArr, i, i2);
    }
}

package com.bytedance.sdk.component.zx.bX.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
class bX implements java.io.Closeable {
    private final java.nio.charset.Charset IL;
    private byte[] bX;
    private final java.io.InputStream bg;
    private int eqN;
    private int zx;

    public bX(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        this(inputStream, 8192, charset);
    }

    public bX(java.io.InputStream inputStream, int i, java.nio.charset.Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(com.bytedance.sdk.component.zx.bX.bg.bg.eqN.bg)) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding");
        }
        this.bg = inputStream;
        this.IL = charset;
        this.bX = new byte[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this.bg) {
            if (this.bX != null) {
                this.bX = null;
                this.bg.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public java.lang.String bg() throws java.io.IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.bg) {
            if (this.bX == null) {
                throw new java.io.IOException("LineReader is closed");
            }
            if (this.eqN >= this.zx) {
                bX();
            }
            for (int i3 = this.eqN; i3 != this.zx; i3++) {
                byte[] bArr2 = this.bX;
                if (bArr2[i3] == 10) {
                    if (i3 != this.eqN) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    byte[] bArr3 = this.bX;
                    int i4 = this.eqN;
                    java.lang.String str = new java.lang.String(bArr3, i4, i2 - i4, this.IL.name());
                    this.eqN = i3 + 1;
                    return str;
                }
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((this.zx - this.eqN) + 80) { // from class: com.bytedance.sdk.component.zx.bX.bg.bg.bX.1
                @Override // java.io.ByteArrayOutputStream
                public java.lang.String toString() {
                    try {
                        return new java.lang.String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, com.bytedance.sdk.component.zx.bX.bg.bg.bX.this.IL.name());
                    } catch (java.io.UnsupportedEncodingException e) {
                        throw new java.lang.AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr4 = this.bX;
                int i5 = this.eqN;
                byteArrayOutputStream.write(bArr4, i5, this.zx - i5);
                this.zx = -1;
                bX();
                i = this.eqN;
                while (i != this.zx) {
                    bArr = this.bX;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.eqN;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.eqN = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public boolean IL() {
        return this.zx == -1;
    }

    private void bX() throws java.io.IOException {
        java.io.InputStream inputStream = this.bg;
        byte[] bArr = this.bX;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new java.io.EOFException();
        }
        this.eqN = 0;
        this.zx = i;
    }
}

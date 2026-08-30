package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class dr extends java.io.InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Enumeration f2206a;
    private java.io.InputStream b;

    public dr(java.util.Enumeration enumeration) throws java.io.IOException {
        this.f2206a = enumeration;
        a();
    }

    final void a() throws java.io.IOException {
        java.io.InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.b = this.f2206a.hasMoreElements() ? new java.io.FileInputStream((java.io.File) this.f2206a.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
        java.io.InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
            this.b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        while (true) {
            java.io.InputStream inputStream = this.b;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.b == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.b.read(bArr, i, i2);
            if (i3 > 0) {
                return i3;
            }
            a();
        } while (this.b != null);
        return -1;
    }
}

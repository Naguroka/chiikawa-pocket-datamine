package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bw extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.ds f2164a;
    private byte[] b;
    private long c;
    private boolean d;
    private boolean e;

    bw(java.io.InputStream inputStream) {
        super(inputStream);
        this.f2164a = new com.google.android.play.core.assetpacks.ds();
        this.b = new byte[4096];
        this.d = false;
        this.e = false;
    }

    private final int e(byte[] bArr, int i, int i2) throws java.io.IOException {
        return java.lang.Math.max(0, super.read(bArr, i, i2));
    }

    private final boolean f(int i) throws java.io.IOException {
        int iE = e(this.b, 0, i);
        if (iE != i) {
            int i2 = i - iE;
            if (e(this.b, iE, i2) != i2) {
                this.f2164a.b(this.b, 0, iE);
                return false;
            }
        }
        this.f2164a.b(this.b, 0, i);
        return true;
    }

    final long a() {
        return this.c;
    }

    final com.google.android.play.core.assetpacks.eu b() throws java.io.IOException {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.d || this.e) {
            return new com.google.android.play.core.assetpacks.bq(null, -1L, -1, false, false, null);
        }
        if (!f(30)) {
            this.d = true;
            return this.f2164a.c();
        }
        com.google.android.play.core.assetpacks.eu euVarC = this.f2164a.c();
        if (euVarC.d()) {
            this.e = true;
            return euVarC;
        }
        if (euVarC.b() == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            throw new com.google.android.play.core.assetpacks.ck("Files bigger than 4GiB are not supported.");
        }
        int iA = this.f2164a.a() - 30;
        int length = this.b.length;
        long j = iA;
        if (j > length) {
            do {
                length += length;
            } while (length < j);
            this.b = java.util.Arrays.copyOf(this.b, length);
        }
        if (!f(iA)) {
            this.d = true;
            return this.f2164a.c();
        }
        com.google.android.play.core.assetpacks.eu euVarC2 = this.f2164a.c();
        this.c = euVarC2.b();
        return euVarC2;
    }

    final boolean c() {
        return this.e;
    }

    final boolean d() {
        return this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        long j = this.c;
        if (j <= 0 || this.d) {
            return -1;
        }
        int iE = e(bArr, i, (int) java.lang.Math.min(j, i2));
        this.c -= (long) iE;
        if (iE != 0) {
            return iE;
        }
        this.d = true;
        return 0;
    }
}

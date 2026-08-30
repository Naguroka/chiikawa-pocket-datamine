package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class cn extends java.io.OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.assetpacks.ds f2179a = new com.google.android.play.core.assetpacks.ds();
    private final java.io.File b;
    private final com.google.android.play.core.assetpacks.eo c;
    private long d;
    private long e;
    private java.io.FileOutputStream f;
    private com.google.android.play.core.assetpacks.eu g;

    cn(java.io.File file, com.google.android.play.core.assetpacks.eo eoVar) {
        this.b = file;
        this.c = eoVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        int iMin;
        while (i2 > 0) {
            if (this.d == 0 && this.e == 0) {
                int iB = this.f2179a.b(bArr, i, i2);
                if (iB == -1) {
                    return;
                }
                i += iB;
                i2 -= iB;
                com.google.android.play.core.assetpacks.eu euVarC = this.f2179a.c();
                this.g = euVarC;
                if (euVarC.d()) {
                    this.d = 0L;
                    this.c.l(this.g.f(), 0, this.g.f().length);
                    this.e = this.g.f().length;
                } else if (!this.g.h() || this.g.g()) {
                    byte[] bArrF = this.g.f();
                    this.c.l(bArrF, 0, bArrF.length);
                    this.d = this.g.b();
                } else {
                    this.c.j(this.g.f());
                    java.io.File file = new java.io.File(this.b, this.g.c());
                    file.getParentFile().mkdirs();
                    this.d = this.g.b();
                    this.f = new java.io.FileOutputStream(file);
                }
            }
            if (!this.g.g()) {
                if (this.g.d()) {
                    this.c.e(this.e, bArr, i, i2);
                    this.e += (long) i2;
                    iMin = i2;
                } else if (!this.g.h()) {
                    iMin = (int) java.lang.Math.min(i2, this.d);
                    this.c.e((((long) this.g.f().length) + this.g.b()) - this.d, bArr, i, iMin);
                    this.d -= (long) iMin;
                } else {
                    iMin = (int) java.lang.Math.min(i2, this.d);
                    this.f.write(bArr, i, iMin);
                    long j = this.d - ((long) iMin);
                    this.d = j;
                    if (j == 0) {
                        this.f.close();
                    }
                }
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}

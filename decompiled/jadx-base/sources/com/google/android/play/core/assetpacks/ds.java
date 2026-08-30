package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f2207a = new byte[4096];
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private java.lang.String i;

    public ds() {
        d();
    }

    private final int e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.b;
        if (i4 >= i) {
            return 0;
        }
        int iMin = java.lang.Math.min(i3, i - i4);
        java.lang.System.arraycopy(bArr, i2, this.f2207a, this.b, iMin);
        int i5 = this.b + iMin;
        this.b = i5;
        if (i5 < i) {
            return -1;
        }
        return iMin;
    }

    public final int a() {
        return this.f;
    }

    public final int b(byte[] bArr, int i, int i2) {
        int iE = e(30, bArr, i, i2);
        if (iE == -1) {
            return -1;
        }
        if (this.c == -1) {
            long jC = com.google.android.play.core.assetpacks.br.c(this.f2207a, 0);
            this.c = jC;
            if (jC == 67324752) {
                this.h = false;
                this.d = com.google.android.play.core.assetpacks.br.c(this.f2207a, 18);
                this.g = com.google.android.play.core.assetpacks.br.a(this.f2207a, 8);
                this.e = com.google.android.play.core.assetpacks.br.a(this.f2207a, 26);
                int iA = this.e + 30 + com.google.android.play.core.assetpacks.br.a(this.f2207a, 28);
                this.f = iA;
                int length = this.f2207a.length;
                if (length < iA) {
                    do {
                        length += length;
                    } while (length < iA);
                    this.f2207a = java.util.Arrays.copyOf(this.f2207a, length);
                }
            } else {
                this.h = true;
            }
        }
        int iE2 = e(this.f, bArr, i + iE, i2 - iE);
        if (iE2 == -1) {
            return -1;
        }
        int i3 = iE + iE2;
        if (!this.h && this.i == null) {
            this.i = new java.lang.String(this.f2207a, 30, this.e);
        }
        return i3;
    }

    public final com.google.android.play.core.assetpacks.eu c() {
        int i = this.b;
        int i2 = this.f;
        if (i < i2) {
            return new com.google.android.play.core.assetpacks.bq(this.i, this.d, this.g, true, this.h, java.util.Arrays.copyOf(this.f2207a, i));
        }
        com.google.android.play.core.assetpacks.bq bqVar = new com.google.android.play.core.assetpacks.bq(this.i, this.d, this.g, false, this.h, java.util.Arrays.copyOf(this.f2207a, i2));
        d();
        return bqVar;
    }

    public final void d() {
        this.b = 0;
        this.e = -1;
        this.c = -1L;
        this.h = false;
        this.f = 30;
        this.d = -1L;
        this.g = -1;
        this.i = null;
    }
}

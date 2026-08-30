package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f694a;
    private final int b;
    private int c;
    private int d;

    public cr(byte[] bArr) {
        this.f694a = bArr;
        this.b = bArr.length;
    }

    public boolean c() {
        boolean z = (((this.f694a[this.c] & 255) >> this.d) & 1) == 1;
        b(1);
        return z;
    }

    public int b() {
        return (this.c * 8) + this.d;
    }

    private void a() {
        int i;
        int i2 = this.c;
        com.applovin.impl.b1.b(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }

    public void b(int i) {
        int i2 = i / 8;
        int i3 = this.c + i2;
        this.c = i3;
        int i4 = this.d + (i - (i2 * 8));
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        a();
    }

    public int a(int i) {
        int i2 = this.c;
        int iMin = java.lang.Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.f694a[i2] & 255) >> this.d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f694a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        b(i);
        return i5;
    }
}

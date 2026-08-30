package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f1572a;
    private int b;
    private int c;
    private int d;

    public zg() {
        this.f1572a = com.applovin.impl.xp.f;
    }

    public zg(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public int b() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public int e() {
        return (this.b * 8) + this.c;
    }

    public int d() {
        com.applovin.impl.b1.b(this.c == 0);
        return this.b;
    }

    public void g() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        a();
    }

    public zg(byte[] bArr, int i) {
        this.f1572a = bArr;
        this.d = i;
    }

    public boolean f() {
        boolean z = (this.f1572a[this.b] & (128 >> this.c)) != 0;
        g();
        return z;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        a();
    }

    public void d(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public long b(int i) {
        if (i <= 32) {
            return com.applovin.impl.xp.i(a(i));
        }
        return com.applovin.impl.xp.c(a(i - 32), a(32));
    }

    private void a() {
        int i;
        int i2 = this.b;
        com.applovin.impl.b1.b(i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0)));
    }

    public void c(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public void e(int i) {
        com.applovin.impl.b1.b(this.c == 0);
        this.b += i;
        a();
    }

    public void b(byte[] bArr, int i, int i2) {
        com.applovin.impl.b1.b(this.c == 0);
        java.lang.System.arraycopy(this.f1572a, this.b, bArr, i, i2);
        this.b += i2;
        a();
    }

    public void a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = java.lang.Math.min(8 - this.c, i2);
        int i3 = this.c;
        int i4 = (8 - i3) - iMin;
        int i5 = (androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3) | ((1 << i4) - 1);
        byte[] bArr = this.f1572a;
        int i6 = this.b;
        byte b = (byte) (i5 & bArr[i6]);
        bArr[i6] = b;
        int i7 = i2 - iMin;
        bArr[i6] = (byte) (b | ((i >>> i7) << i4));
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f1572a[i8] = (byte) (i >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f1572a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i & ((1 << i7) - 1)) << i9) | b2);
        d(i2);
        a();
    }

    public int a(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.f1572a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f1572a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        a();
        return i7;
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f1572a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f1572a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.c = i8 - 8;
        }
        int i10 = this.c + i7;
        this.c = i10;
        byte[] bArr4 = this.f1572a;
        int i11 = this.b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.c = 0;
            this.b = i11 + 1;
        }
        a();
    }

    public java.lang.String a(int i, java.nio.charset.Charset charset) {
        byte[] bArr = new byte[i];
        b(bArr, 0, i);
        return new java.lang.String(bArr, charset);
    }

    public void a(com.applovin.impl.ah ahVar) {
        a(ahVar.c(), ahVar.e());
        c(ahVar.d() * 8);
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public void a(byte[] bArr, int i) {
        this.f1572a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }
}

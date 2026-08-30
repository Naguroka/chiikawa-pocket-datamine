package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f646a;
    private int b;
    private int c;
    private int d;

    public bh(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    public void g() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (c(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public boolean c() {
        boolean z = (this.f646a[this.c] & (128 >> this.d)) != 0;
        g();
        return z;
    }

    public boolean b() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !c()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.d = i2;
        return !z && a((i3 * 2) + 1);
    }

    public int f() {
        return d();
    }

    public int e() {
        int iD = d();
        return (iD % 2 == 0 ? -1 : 1) * ((iD + 1) / 2);
    }

    private int d() {
        int i = 0;
        while (!c()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? b(i) : 0);
    }

    private void a() {
        int i;
        int i2 = this.c;
        com.applovin.impl.b1.b(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }

    public void d(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.c) {
                if (c(i2)) {
                    this.c++;
                    i2 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }

    public int b(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            byte[] bArr = this.f646a;
            int i6 = this.c;
            i3 |= (bArr[i6] & 255) << i5;
            if (!c(i6 + 1)) {
                i4 = 1;
            }
            this.c = i6 + i4;
        }
        byte[] bArr2 = this.f646a;
        int i7 = this.c;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            this.c = i7 + (c(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public boolean a(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                break;
            }
            if (c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    private boolean c(int i) {
        if (2 <= i && i < this.b) {
            byte[] bArr = this.f646a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void a(byte[] bArr, int i, int i2) {
        this.f646a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        a();
    }
}

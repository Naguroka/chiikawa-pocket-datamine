package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class nk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1099a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public nk(int i, int i2, float f, float f2, int i3) {
        this.f1099a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public void e() {
        int i;
        int i2 = this.k;
        float f = this.c;
        float f2 = this.d;
        int i3 = this.m + ((int) ((((i2 / (f / f2)) + this.o) / (this.e * f2)) + 0.5f));
        this.j = c(this.j, i2, (this.h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.h * 2;
            int i5 = this.b;
            if (i4 >= i * i5) {
                break;
            }
            this.j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.k += i;
        d();
        if (this.m > i3) {
            this.m = i3;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    private short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : java.util.Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public int c() {
        return this.k * this.b * 2;
    }

    private void a(float f, int i) {
        int i2;
        int i3;
        if (this.m == i) {
            return;
        }
        int i4 = this.f1099a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        b(i);
        int i6 = 0;
        while (true) {
            int i7 = this.o - 1;
            if (i6 < i7) {
                while (true) {
                    i2 = this.p + 1;
                    int i8 = i2 * i5;
                    i3 = this.q;
                    if (i8 <= i3 * i4) {
                        break;
                    }
                    this.l = c(this.l, this.m, 1);
                    int i9 = 0;
                    while (true) {
                        int i10 = this.b;
                        if (i9 < i10) {
                            this.l[(this.m * i10) + i9] = b(this.n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                    }
                    this.q++;
                    this.m++;
                }
                this.p = i2;
                if (i2 == i4) {
                    this.p = 0;
                    com.applovin.impl.b1.b(i3 == i5);
                    this.q = 0;
                }
                i6++;
            } else {
                c(i7);
                return;
            }
        }
    }

    public int b() {
        return this.m * this.b * 2;
    }

    private void d() {
        int i = this.m;
        float f = this.c;
        float f2 = this.d;
        float f3 = f / f2;
        float f4 = this.e * f2;
        double d = f3;
        if (d <= 1.00001d && d >= 0.99999d) {
            a(this.j, 0, this.k);
            this.k = 0;
        } else {
            a(f3);
        }
        if (f4 != 1.0f) {
            a(f4, i);
        }
    }

    private void c(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.n;
        int i2 = this.b;
        java.lang.System.arraycopy(sArr, i * i2, sArr, 0, (this.o - i) * i2);
        this.o -= i;
    }

    private void d(int i) {
        int i2 = this.k - i;
        short[] sArr = this.j;
        int i3 = this.b;
        java.lang.System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.k = i2;
    }

    private short b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.b];
        int i4 = this.q * i2;
        int i5 = this.p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    private void a(float f) {
        int iA;
        int i = this.k;
        if (i < this.h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.r > 0) {
                iA = a(i2);
            } else {
                int iA2 = a(this.j, i2);
                if (f > 1.0d) {
                    iA = iA2 + b(this.j, i2, f, iA2);
                } else {
                    iA = a(this.j, i2, f, iA2);
                }
            }
            i2 += iA;
        } while (this.h + i2 <= i);
        d(i2);
    }

    private int a(int i) {
        int iMin = java.lang.Math.min(this.h, this.r);
        a(this.j, i, iMin);
        this.r -= iMin;
        return iMin;
    }

    private void b(int i) {
        int i2 = this.m - i;
        short[] sArrC = c(this.n, this.o, i2);
        this.n = sArrC;
        short[] sArr = this.l;
        int i3 = this.b;
        java.lang.System.arraycopy(sArr, i * i3, sArrC, this.o * i3, i3 * i2);
        this.m = i;
        this.o += i2;
    }

    public void b(java.nio.ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.b;
        int i2 = iRemaining / i;
        short[] sArrC = c(this.j, this.k, i2);
        this.j = sArrC;
        shortBuffer.get(sArrC, this.k * this.b, ((i * i2) * 2) / 2);
        this.k += i2;
        d();
    }

    private void a(short[] sArr, int i, int i2) {
        short[] sArrC = c(this.l, this.m, i2);
        this.l = sArrC;
        int i3 = this.b;
        java.lang.System.arraycopy(sArr, i * i3, sArrC, this.m * i3, i3 * i2);
        this.m += i2;
    }

    private int a(short[] sArr, int i) {
        int iA;
        int i2 = this.f1099a;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.b == 1 && i3 == 1) {
            iA = a(sArr, i, this.f, this.g);
        } else {
            b(sArr, i, i3);
            int iA2 = a(this.i, 0, this.f / i3, this.g / i3);
            if (i3 != 1) {
                int i4 = iA2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.g;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.b == 1) {
                    iA = a(sArr, i, i6, i7);
                } else {
                    b(sArr, i, 1);
                    iA = a(this.i, 0, i6, i7);
                }
            } else {
                iA = iA2;
            }
        }
        int i10 = a(this.u, this.v) ? this.s : iA;
        this.t = this.u;
        this.s = iA;
        return i10;
    }

    private int b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArrC = c(this.l, this.m, i3);
        this.l = sArrC;
        a(i3, this.b, sArrC, this.m, sArr, i, sArr, i + i2);
        this.m += i3;
        return i3;
    }

    private int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += java.lang.Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public void a() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public void a(java.nio.ShortBuffer shortBuffer) {
        int iMin = java.lang.Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * iMin);
        int i = this.m - iMin;
        this.m = i;
        short[] sArr = this.l;
        int i2 = this.b;
        java.lang.System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    private int a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrC = c(this.l, this.m, i4);
        this.l = sArrC;
        int i5 = this.b;
        java.lang.System.arraycopy(sArr, i * i5, sArrC, this.m * i5, i5 * i2);
        a(i3, this.b, this.l, this.m + i2, sArr, i + i2, sArr, i);
        this.m += i4;
        return i3;
    }

    private static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    private boolean a(int i, int i2) {
        return i != 0 && this.s != 0 && i2 <= i * 3 && i * 2 > this.t * 3;
    }
}

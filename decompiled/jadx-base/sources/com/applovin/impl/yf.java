package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f1540a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final java.lang.Object c = new java.lang.Object();
    private static int[] d = new int[10];

    public static int c(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int iA = 0;
            int i3 = 0;
            while (iA < i) {
                try {
                    iA = a(bArr, iA, i);
                    if (iA < i) {
                        int[] iArr = d;
                        if (iArr.length <= i3) {
                            d = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i3] = iA;
                        iA += 3;
                        i3++;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = d[i6] - i4;
                java.lang.System.arraycopy(bArr, i4, bArr, i5, i7);
                int i8 = i5 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i5 = i8 + 2;
                bArr[i9] = 0;
                i4 += i7 + 3;
            }
            java.lang.System.arraycopy(bArr, i4, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    public static com.applovin.impl.yf.b c(byte[] bArr, int i, int i2) {
        int iF;
        boolean zC;
        int iF2;
        boolean z;
        boolean zC2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        int i6;
        int i7;
        com.applovin.impl.bh bhVar = new com.applovin.impl.bh(bArr, i, i2);
        bhVar.d(8);
        int iB = bhVar.b(8);
        int iB2 = bhVar.b(8);
        int iB3 = bhVar.b(8);
        int iF3 = bhVar.f();
        int i8 = 1;
        if (iB == 100 || iB == 110 || iB == 122 || iB == 244 || iB == 44 || iB == 83 || iB == 86 || iB == 118 || iB == 128 || iB == 138) {
            iF = bhVar.f();
            zC = iF == 3 ? bhVar.c() : false;
            bhVar.f();
            bhVar.f();
            bhVar.g();
            if (bhVar.c()) {
                int i9 = iF != 3 ? 8 : 12;
                int i10 = 0;
                while (i10 < i9) {
                    if (bhVar.c()) {
                        a(bhVar, i10 < 6 ? 16 : 64);
                    }
                    i10++;
                }
            }
        } else {
            iF = 1;
            zC = false;
        }
        int iF4 = bhVar.f() + 4;
        int iF5 = bhVar.f();
        if (iF5 == 0) {
            iF2 = bhVar.f() + 4;
        } else {
            if (iF5 == 1) {
                boolean zC3 = bhVar.c();
                bhVar.e();
                bhVar.e();
                zC = zC;
                long jF = bhVar.f();
                iF = iF;
                for (int i11 = 0; i11 < jF; i11++) {
                    bhVar.f();
                }
                z = zC3;
                iF2 = 0;
            } else {
                iF2 = 0;
            }
            bhVar.f();
            bhVar.g();
            int iF6 = bhVar.f() + 1;
            int iF7 = bhVar.f() + 1;
            zC2 = bhVar.c();
            i3 = 2 - (zC2 ? 1 : 0);
            int i12 = iF7 * i3;
            if (!zC2) {
                bhVar.g();
            }
            bhVar.g();
            i4 = iF6 * 16;
            i5 = i12 * 16;
            if (bhVar.c()) {
                int iF8 = bhVar.f();
                int iF9 = bhVar.f();
                int iF10 = bhVar.f();
                int iF11 = bhVar.f();
                if (iF != 0) {
                    i6 = iF;
                    if (i6 == 3) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    i3 *= i6 == 1 ? 2 : 1;
                    i8 = i7;
                }
                i4 -= (iF8 + iF9) * i8;
                i5 -= (iF10 + iF11) * i3;
            }
            int i13 = i4;
            int i14 = i5;
            if (bhVar.c() || !bhVar.c()) {
                f = 1.0f;
                f2 = f;
            } else {
                int iB4 = bhVar.b(8);
                if (iB4 == 255) {
                    int iB5 = bhVar.b(16);
                    int iB6 = bhVar.b(16);
                    if (iB5 != 0 && iB6 != 0) {
                        f2 = iB5 / iB6;
                    }
                } else {
                    float[] fArr = b;
                    if (iB4 < fArr.length) {
                        f = fArr[iB4];
                    } else {
                        com.applovin.impl.oc.d("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iB4);
                    }
                    f2 = f;
                }
                f = 1.0f;
                f2 = f;
            }
            return new com.applovin.impl.yf.b(iB, iB2, iB3, iF3, i13, i14, f2, zC, zC2, iF4, iF5, iF2, z);
        }
        z = false;
        bhVar.f();
        bhVar.g();
        int iF12 = bhVar.f() + 1;
        int iF13 = bhVar.f() + 1;
        zC2 = bhVar.c();
        i3 = 2 - (zC2 ? 1 : 0);
        int i15 = iF13 * i3;
        if (!zC2) {
            bhVar.g();
        }
        bhVar.g();
        i4 = iF12 * 16;
        i5 = i15 * 16;
        if (bhVar.c()) {
            int iF14 = bhVar.f();
            int iF15 = bhVar.f();
            int iF16 = bhVar.f();
            int iF17 = bhVar.f();
            if (iF != 0) {
                i6 = iF;
                if (i6 == 3) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                i3 *= i6 == 1 ? 2 : 1;
                i8 = i7;
            }
            i4 -= (iF14 + iF15) * i8;
            i5 -= (iF16 + iF17) * i3;
        }
        int i16 = i4;
        int i17 = i5;
        if (bhVar.c()) {
            f = 1.0f;
            f2 = f;
        } else {
            f = 1.0f;
            f2 = f;
        }
        return new com.applovin.impl.yf.b(iB, iB2, iB3, iF3, i16, i17, f2, zC, zC2, iF4, iF5, iF2, z);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1542a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f1542a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = f;
            this.h = z;
            this.i = z2;
            this.j = i7;
            this.k = i8;
            this.l = i9;
            this.m = z3;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1541a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.f1541a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static int b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static com.applovin.impl.yf.a b(byte[] bArr, int i, int i2) {
        com.applovin.impl.bh bhVar = new com.applovin.impl.bh(bArr, i, i2);
        bhVar.d(8);
        int iF = bhVar.f();
        int iF2 = bhVar.f();
        bhVar.g();
        return new com.applovin.impl.yf.a(iF, iF2, bhVar.c());
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void a(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < iPosition) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        com.applovin.impl.b1.b(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    private static int a(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    private static void a(com.applovin.impl.bh bhVar, int i) {
        int iE = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iE != 0) {
                iE = ((bhVar.e() + i2) + 256) % 256;
            }
            if (iE != 0) {
                i2 = iE;
            }
        }
    }

    public static boolean a(java.lang.String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.ci.a f680a;
    public final com.applovin.impl.ci.a b;
    public final int c;
    public final boolean d;

    public static com.applovin.impl.ci a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5;
        int i6;
        float[] fArr;
        int i7;
        int i8 = i;
        int i9 = i2;
        com.applovin.impl.b1.a(f > 0.0f);
        com.applovin.impl.b1.a(i8 >= 1);
        com.applovin.impl.b1.a(i9 >= 1);
        com.applovin.impl.b1.a(f2 > 0.0f && f2 <= 180.0f);
        com.applovin.impl.b1.a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) java.lang.Math.toRadians(f2);
        float radians2 = (float) java.lang.Math.toRadians(f3);
        float f4 = radians / i8;
        float f5 = radians2 / i9;
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[i11 * 3];
        float[] fArr3 = new float[i11 * 2];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f6 = radians / 2.0f;
            float f7 = (i12 * f4) - f6;
            int i15 = i12 + 1;
            float f8 = (i15 * f4) - f6;
            int i16 = 0;
            while (i16 < i10) {
                float f9 = f7;
                int i17 = i15;
                int i18 = 0;
                int i19 = 2;
                while (i18 < i19) {
                    float f10 = i16 * f5;
                    float f11 = f5;
                    int i20 = i16;
                    double d = f;
                    float f12 = f4;
                    double d2 = (f10 + 3.1415927f) - (radians2 / 2.0f);
                    int i21 = i18;
                    double d3 = i18 == 0 ? f9 : f8;
                    float[] fArr4 = fArr3;
                    float f13 = f8;
                    fArr2[i13] = -((float) (java.lang.Math.sin(d2) * d * java.lang.Math.cos(d3)));
                    float f14 = radians;
                    float f15 = radians2;
                    fArr2[i13 + 1] = (float) (d * java.lang.Math.sin(d3));
                    int i22 = i13 + 3;
                    fArr2[i13 + 2] = (float) (d * java.lang.Math.cos(d2) * java.lang.Math.cos(d3));
                    fArr4[i14] = f10 / f15;
                    int i23 = i14 + 2;
                    fArr4[i14 + 1] = ((i12 + i21) * f12) / f14;
                    if (i20 == 0 && i21 == 0) {
                        i4 = i2;
                        i5 = i20;
                        i6 = i21;
                    } else {
                        i4 = i2;
                        i5 = i20;
                        i6 = i21;
                        if (i5 != i4 || i6 != 1) {
                            fArr = fArr4;
                            i7 = 2;
                            i14 = i23;
                            i13 = i22;
                        }
                        int i24 = i6 + 1;
                        fArr3 = fArr;
                        i19 = i7;
                        radians = f14;
                        i10 = i10;
                        f5 = f11;
                        f4 = f12;
                        f8 = f13;
                        i18 = i24;
                        i9 = i4;
                        i16 = i5;
                        radians2 = f15;
                    }
                    java.lang.System.arraycopy(fArr2, i13, fArr2, i22, 3);
                    i13 += 6;
                    fArr = fArr4;
                    i7 = 2;
                    java.lang.System.arraycopy(fArr, i14, fArr, i23, 2);
                    i14 += 4;
                    int i25 = i6 + 1;
                    fArr3 = fArr;
                    i19 = i7;
                    radians = f14;
                    i10 = i10;
                    f5 = f11;
                    f4 = f12;
                    f8 = f13;
                    i18 = i25;
                    i9 = i4;
                    i16 = i5;
                    radians2 = f15;
                }
                float f16 = radians2;
                int i26 = i16;
                int i27 = i9;
                int i28 = i26 + 1;
                f7 = f9;
                i15 = i17;
                f5 = f5;
                radians2 = f16;
                f8 = f8;
                i9 = i27;
                i16 = i28;
            }
            i8 = i;
            i12 = i15;
        }
        return new com.applovin.impl.ci(new com.applovin.impl.ci.a(new com.applovin.impl.ci.b(0, fArr2, fArr3, 1)), i3);
    }

    public ci(com.applovin.impl.ci.a aVar, int i) {
        this(aVar, aVar, i);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f682a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f682a = i;
            com.applovin.impl.b1.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }

        public int a() {
            return this.c.length / 3;
        }
    }

    public static com.applovin.impl.ci a(int i) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.ci.b[] f681a;

        public a(com.applovin.impl.ci.b... bVarArr) {
            this.f681a = bVarArr;
        }

        public com.applovin.impl.ci.b a(int i) {
            return this.f681a[i];
        }

        public int a() {
            return this.f681a.length;
        }
    }

    public ci(com.applovin.impl.ci.a aVar, com.applovin.impl.ci.a aVar2, int i) {
        this.f680a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }
}

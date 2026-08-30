package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface wj {
    int a();

    int a(int i);

    com.applovin.impl.wj a(int i, int i2);

    int b();

    int b(int i);

    com.applovin.impl.wj b(int i, int i2);

    int c();

    com.applovin.impl.wj d();

    public static class a implements com.applovin.impl.wj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Random f1468a;
        private final int[] b;
        private final int[] c;

        @Override // com.applovin.impl.wj
        public com.applovin.impl.wj d() {
            return new com.applovin.impl.wj.a(0, new java.util.Random(this.f1468a.nextLong()));
        }

        public a(int i) {
            this(i, new java.util.Random());
        }

        @Override // com.applovin.impl.wj
        public int c() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public com.applovin.impl.wj b(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f1468a.nextInt(this.b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f1468a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            java.util.Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = i7 + 1;
                        int i9 = iArr4[i7];
                        iArr3[i3] = i9;
                        if (i9 >= i) {
                            iArr3[i3] = i9 + i2;
                        }
                        i7 = i8;
                    }
                    i3++;
                } else {
                    return new com.applovin.impl.wj.a(iArr3, new java.util.Random(this.f1468a.nextLong()));
                }
            }
        }

        private a(int i, java.util.Random random) {
            this(a(i, random), random);
        }

        @Override // com.applovin.impl.wj
        public com.applovin.impl.wj a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.b;
                if (i4 < iArr2.length) {
                    int i6 = iArr2[i4];
                    if (i6 < i || i6 >= i2) {
                        int i7 = i4 - i5;
                        if (i6 >= i) {
                            i6 -= i3;
                        }
                        iArr[i7] = i6;
                    } else {
                        i5++;
                    }
                    i4++;
                } else {
                    return new com.applovin.impl.wj.a(iArr, new java.util.Random(this.f1468a.nextLong()));
                }
            }
        }

        private a(int[] iArr, java.util.Random random) {
            this.b = iArr;
            this.f1468a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        @Override // com.applovin.impl.wj
        public int b() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        private static int[] a(int i, java.util.Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // com.applovin.impl.wj
        public int b(int i) {
            int i2 = this.c[i] - 1;
            if (i2 >= 0) {
                return this.b[i2];
            }
            return -1;
        }

        @Override // com.applovin.impl.wj
        public int a() {
            return this.b.length;
        }

        @Override // com.applovin.impl.wj
        public int a(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }
    }
}

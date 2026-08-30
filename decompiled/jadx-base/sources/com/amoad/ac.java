package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class ac {
    private android.graphics.Bitmap A;
    private byte[] B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private int G;
    private int H;
    private byte[] I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f189a;
    int b;
    java.util.List<com.amoad.ac.a> c;
    int d;
    private java.io.InputStream e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private android.graphics.Bitmap z;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.graphics.Bitmap f190a;
        int b;

        public a(android.graphics.Bitmap bitmap, int i) {
            this.f190a = bitmap;
            this.b = i;
        }
    }

    ac(java.io.InputStream inputStream) {
        this.b = 1;
        this.B = new byte[256];
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.G = 0;
        b(inputStream);
    }

    ac(byte[] bArr) {
        this.b = 1;
        this.B = new byte[256];
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = false;
        this.G = 0;
        b(new java.io.ByteArrayInputStream(bArr));
    }

    public static final boolean a(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 6; i++) {
            try {
                sb.append((char) inputStream.read());
            } catch (java.lang.Exception e) {
                com.amoad.Logger.w("Gif", e.getLocalizedMessage());
                return false;
            }
        }
        return sb.toString().startsWith("GIF");
    }

    public static final boolean a(java.net.URL url) {
        try {
            return a(url.openStream());
        } catch (java.lang.Exception e) {
            com.amoad.Logger.w("Gif", e.getLocalizedMessage());
            return false;
        }
    }

    private final int b() {
        try {
            return this.e.read();
        } catch (java.lang.Exception unused) {
            this.f189a = -1;
            return 0;
        }
    }

    private final int b(java.io.InputStream inputStream) {
        this.f189a = 0;
        this.d = 0;
        this.c = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.j = null;
        this.k = null;
        if (inputStream != null) {
            this.e = inputStream;
            e();
            if (!a()) {
                d();
                if (this.d < 0) {
                    this.f189a = -1;
                }
            }
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                com.amoad.Logger.w("Gif", e);
            }
        } else {
            this.f189a = -2;
        }
        return this.f189a;
    }

    private final int[] b(int i) {
        int i2;
        int i3 = i * 3;
        byte[] bArr = new byte[i3];
        try {
            i2 = this.e.read(bArr);
        } catch (java.lang.Exception e) {
            com.amoad.Logger.w("Gif", e);
            i2 = 0;
        }
        if (i2 < i3) {
            this.f189a = -1;
            return null;
        }
        int[] iArr = new int[256];
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i4 + 1;
            int i7 = i6 + 1;
            iArr[i5] = ((bArr[i4] & 255) << 16) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK | ((bArr[i6] & 255) << 8) | (bArr[i7] & 255);
            i4 = i7 + 1;
        }
        return iArr;
    }

    private final int c() {
        int i;
        int iB = b();
        this.C = iB;
        int i2 = 0;
        if (iB > 0) {
            while (true) {
                try {
                    int i3 = this.C;
                    if (i2 >= i3 || (i = this.e.read(this.B, i2, i3 - i2)) == -1) {
                        break;
                    }
                    i2 += i;
                } catch (java.lang.Exception e) {
                    com.amoad.Logger.w("Gif", e);
                }
            }
            if (i2 < this.C) {
                this.f189a = -1;
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v36, types: [short] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3 */
    private final void d() {
        short s;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        short s2;
        short s3 = 0;
        boolean z3 = false;
        while (!z3 && !a()) {
            int iB = b();
            byte b = 255;
            if (iB != 33) {
                if (iB == 44) {
                    this.r = g();
                    this.s = g();
                    this.t = g();
                    this.u = g();
                    int iB2 = b();
                    short s4 = (iB2 & 128) != 0 ? (short) 1 : s3;
                    int iPow = (int) java.lang.Math.pow(2.0d, (iB2 & 7) + 1);
                    this.q = iPow;
                    this.p = (iB2 & 64) != 0 ? 1 : s3;
                    if (s4 != 0) {
                        int[] iArrB = b(iPow);
                        this.k = iArrB;
                        this.l = iArrB;
                    } else {
                        this.l = this.j;
                        if (this.m == this.H) {
                            this.n = s3;
                        }
                    }
                    if (this.F) {
                        int[] iArr = this.l;
                        int i5 = this.H;
                        i = iArr[i5];
                        iArr[i5] = s3;
                    } else {
                        i = s3;
                    }
                    if (this.l == null) {
                        this.f189a = -1;
                    }
                    if (!a()) {
                        int i6 = this.t * this.u;
                        byte[] bArr = this.I;
                        if (bArr == null || bArr.length < i6) {
                            this.I = new byte[i6];
                        }
                        short[] sArr = new short[4096];
                        byte[] bArr2 = new byte[4096];
                        byte[] bArr3 = new byte[androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
                        int iB3 = b();
                        int i7 = 1 << iB3;
                        int i8 = i7 + 1;
                        int i9 = i7 + 2;
                        int i10 = iB3 + 1;
                        int i11 = (1 << i10) - 1;
                        int i12 = s3;
                        while (i12 < i7) {
                            sArr[i12] = s3;
                            bArr2[i12] = (byte) i12;
                            i12++;
                            s3 = 0;
                        }
                        int i13 = -1;
                        int i14 = i10;
                        int i15 = i9;
                        int i16 = i11;
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        int iC = 0;
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 0;
                        while (true) {
                            if (i17 < i6) {
                                if (i19 != 0) {
                                    int i24 = i15;
                                    z = z3;
                                    i18 = i18;
                                    i13 = i13;
                                    i3 = i24;
                                    i4 = -1;
                                } else if (i18 >= i14) {
                                    int i25 = i20 & i16;
                                    i20 >>= i14;
                                    i18 -= i14;
                                    int i26 = i15;
                                    if (i25 <= i26 && i25 != i8) {
                                        if (i25 != i7) {
                                            z = z3;
                                            int i27 = i13;
                                            if (i27 != -1) {
                                                if (i25 == i26) {
                                                    bArr3[i19] = (byte) i22;
                                                    s2 = i27;
                                                    i19++;
                                                } else {
                                                    s2 = i25;
                                                }
                                                while (s2 > i7) {
                                                    bArr3[i19] = bArr2[s2];
                                                    s2 = sArr[s2];
                                                    i19++;
                                                }
                                                int i28 = bArr2[s2] & 255;
                                                if (i26 >= 4096) {
                                                    break;
                                                }
                                                int i29 = i19 + 1;
                                                byte b2 = (byte) i28;
                                                bArr3[i19] = b2;
                                                sArr[i26] = (short) i27;
                                                bArr2[i26] = b2;
                                                i3 = i26 + 1;
                                                if ((i3 & i16) == 0 && i3 < 4096) {
                                                    i14++;
                                                    i16 += i3;
                                                }
                                                i19 = i29;
                                                i4 = -1;
                                                i22 = i28;
                                                i18 = i18;
                                                i13 = i25;
                                            } else {
                                                bArr3[i19] = bArr2[i25];
                                                i19++;
                                                i22 = i25;
                                                z3 = z;
                                                i18 = i18;
                                                i13 = i22;
                                                i15 = i26;
                                                b = 255;
                                            }
                                        } else {
                                            i14 = i10;
                                            i15 = i9;
                                            i16 = i11;
                                            b = 255;
                                            i13 = -1;
                                        }
                                    }
                                } else {
                                    if (iC == 0) {
                                        iC = c();
                                        if (iC > 0) {
                                            i21 = 0;
                                        }
                                    }
                                    i20 += (this.B[i21] & b) << i18;
                                    i18 += 8;
                                    i21++;
                                    iC--;
                                }
                                i19 += i4;
                                this.I[i23] = bArr3[i19];
                                i17++;
                                i23++;
                                b = 255;
                                boolean z4 = z;
                                i15 = i3;
                                z3 = z4;
                            }
                            z = z3;
                            break;
                        }
                        for (int i30 = i23; i30 < i6; i30++) {
                            this.I[i30] = 0;
                        }
                        h();
                        if (a()) {
                            s = 0;
                        } else {
                            this.d++;
                            this.z = android.graphics.Bitmap.createBitmap(this.f, this.g, android.graphics.Bitmap.Config.ARGB_4444);
                            int[] iArr2 = new int[this.f * this.g];
                            int i31 = this.E;
                            if (i31 > 0) {
                                if (i31 == 3) {
                                    int i32 = this.d - 2;
                                    if (i32 > 0) {
                                        this.A = a(i32 - 1);
                                    } else {
                                        this.A = null;
                                    }
                                }
                                android.graphics.Bitmap bitmap = this.A;
                                if (bitmap != null) {
                                    int i33 = this.f;
                                    bitmap.getPixels(iArr2, 0, i33, 0, 0, i33, this.g);
                                    if (this.E == 2) {
                                        int i34 = !this.F ? this.o : 0;
                                        for (int i35 = 0; i35 < this.y; i35++) {
                                            int i36 = ((this.w + i35) * this.f) + this.v;
                                            int i37 = this.x + i36;
                                            while (i36 < i37) {
                                                iArr2[i36] = i34;
                                                i36++;
                                            }
                                        }
                                    }
                                }
                            }
                            int i38 = 8;
                            int i39 = 0;
                            int i40 = 1;
                            int i41 = 0;
                            while (true) {
                                int i42 = this.u;
                                if (i39 >= i42) {
                                    break;
                                }
                                if (this.p) {
                                    if (i41 >= i42) {
                                        i40++;
                                        if (i40 == 2) {
                                            i41 = 4;
                                        } else if (i40 == 3) {
                                            i38 = 4;
                                            i41 = 2;
                                        } else if (i40 == 4) {
                                            i38 = 2;
                                            i41 = 1;
                                        }
                                    }
                                    i2 = i41 + i38;
                                } else {
                                    i2 = i41;
                                    i41 = i39;
                                }
                                int i43 = i41 + this.s;
                                if (i43 < this.g) {
                                    int i44 = this.f;
                                    int i45 = i43 * i44;
                                    int i46 = this.r + i45;
                                    int i47 = this.t;
                                    int i48 = i46 + i47;
                                    if (i45 + i44 < i48) {
                                        i48 = i45 + i44;
                                    }
                                    int i49 = i47 * i39;
                                    while (i46 < i48) {
                                        int i50 = i49 + 1;
                                        int i51 = this.l[this.I[i49] & 255];
                                        if (i51 != 0) {
                                            iArr2[i46] = i51;
                                        }
                                        i46++;
                                        i49 = i50;
                                    }
                                }
                                i39++;
                                i41 = i2;
                            }
                            this.z = android.graphics.Bitmap.createBitmap(iArr2, this.f, this.g, android.graphics.Bitmap.Config.ARGB_4444);
                            this.c.add(new com.amoad.ac.a(this.z, this.G));
                            if (this.F) {
                                this.l[this.H] = i;
                            }
                            this.E = this.D;
                            this.v = this.r;
                            this.w = this.s;
                            this.x = this.t;
                            this.y = this.u;
                            this.A = this.z;
                            this.o = this.n;
                            s = 0;
                            this.D = 0;
                            this.F = false;
                            this.G = 0;
                            this.k = null;
                        }
                    }
                } else if (iB != 59) {
                    this.f189a = -1;
                } else {
                    z3 = true;
                }
                s = s3;
                z = z3;
            } else {
                s = s3;
                z = z3;
                int iB4 = b();
                if (iB4 == 249) {
                    b();
                    int iB5 = b();
                    int i52 = (iB5 & 28) >> 2;
                    this.D = i52;
                    if (i52 == 0) {
                        z2 = true;
                        this.D = 1;
                    } else {
                        z2 = true;
                    }
                    this.F = (iB5 & 1) != 0 ? z2 : s;
                    this.G = g() * 10;
                    this.H = b();
                    b();
                } else if (iB4 != 255) {
                    h();
                } else {
                    c();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (int i53 = s; i53 < 11; i53++) {
                        sb.append((char) this.B[i53]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        f();
                    } else {
                        h();
                    }
                }
            }
            s3 = s;
            z3 = z;
        }
    }

    private final void e() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) b());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f189a = -1;
            return;
        }
        this.f = g();
        this.g = g();
        int iB = b();
        this.h = (iB & 128) != 0;
        this.i = 2 << (iB & 7);
        this.m = b();
        b();
        if (!this.h || a()) {
            return;
        }
        int[] iArrB = b(this.i);
        this.j = iArrB;
        this.n = iArrB[this.m];
    }

    private final void f() {
        do {
            c();
            byte[] bArr = this.B;
            if (bArr[0] == 1) {
                this.b = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.C <= 0) {
                return;
            }
        } while (!a());
    }

    private final int g() {
        return b() | (b() << 8);
    }

    private final void h() {
        do {
            c();
            if (this.C <= 0) {
                return;
            }
        } while (!a());
    }

    final android.graphics.Bitmap a(int i) {
        int i2 = this.d;
        if (i2 <= 0) {
            return null;
        }
        return this.c.get(i % i2).f190a;
    }

    final boolean a() {
        return this.f189a != 0;
    }
}

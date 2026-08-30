package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class j7 {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Paint f909a;
    private final android.graphics.Paint b;
    private final android.graphics.Canvas c;
    private final com.applovin.impl.j7.b d;
    private final com.applovin.impl.j7.a e;
    private final com.applovin.impl.j7.h f;
    private android.graphics.Bitmap g;

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public j7(int i2, int i3) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f909a = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new android.graphics.Canvas();
        this.d = new com.applovin.impl.j7.b(androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.e = new com.applovin.impl.j7.a(0, a(), b(), c());
        this.f = new com.applovin.impl.j7.h(i2, i3);
    }

    public void d() {
        this.f.a();
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int i2;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = a(63, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i4 = i3 & 136;
                int i5 = org.objectweb.asm.Opcodes.TABLESWITCH;
                if (i4 == 0) {
                    int i6 = ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0);
                    int i7 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0);
                    i2 = (i3 & 4) == 0 ? 0 : 85;
                    if ((i3 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = a(255, i6, i7, i2 + i5);
                } else if (i4 == 8) {
                    int i8 = ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0);
                    int i9 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0);
                    i2 = (i3 & 4) == 0 ? 0 : 85;
                    if ((i3 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = a(127, i8, i9, i2 + i5);
                } else if (i4 == 128) {
                    iArr[i3] = a(255, ((i3 & 1) != 0 ? 43 : 0) + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i4 == 136) {
                    iArr[i3] = a(255, ((i3 & 1) != 0 ? 43 : 0) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static byte[] a(int i2, int i3, com.applovin.impl.zg zgVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) zgVar.a(i3);
        }
        return bArr;
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f917a;
        public final int b;
        public final android.util.SparseArray c = new android.util.SparseArray();
        public final android.util.SparseArray d = new android.util.SparseArray();
        public final android.util.SparseArray e = new android.util.SparseArray();
        public final android.util.SparseArray f = new android.util.SparseArray();
        public final android.util.SparseArray g = new android.util.SparseArray();
        public com.applovin.impl.j7.b h;
        public com.applovin.impl.j7.d i;

        public h(int i, int i2) {
            this.f917a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f911a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f911a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f913a;
        public final int b;
        public final int c;
        public final android.util.SparseArray d;

        public d(int i, int i2, int i3, android.util.SparseArray sparseArray) {
            this.f913a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f914a;
        public final int b;

        public e(int i, int i2) {
            this.f914a = i;
            this.b = i2;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f915a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final android.util.SparseArray k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, android.util.SparseArray sparseArray) {
            this.f915a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(com.applovin.impl.j7.f fVar) {
            android.util.SparseArray sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), (com.applovin.impl.j7.g) sparseArray.valueAt(i));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f916a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f916a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f910a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f910a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f912a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f912a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    private static int b(com.applovin.impl.zg zgVar, int[] iArr, byte[] bArr, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int i4;
        int iA;
        int iA2;
        int i5 = i2;
        boolean z = false;
        while (true) {
            int iA3 = zgVar.a(4);
            if (iA3 != 0) {
                z = z;
                i4 = 1;
            } else if (!zgVar.f()) {
                int iA4 = zgVar.a(3);
                if (iA4 != 0) {
                    i4 = iA4 + 2;
                    iA3 = 0;
                } else {
                    z = true;
                    iA3 = 0;
                    i4 = 0;
                }
            } else {
                if (!zgVar.f()) {
                    iA = zgVar.a(2) + 4;
                    iA2 = zgVar.a(4);
                } else {
                    int iA5 = zgVar.a(2);
                    if (iA5 == 0) {
                        i4 = 1;
                    } else if (iA5 == 1) {
                        i4 = 2;
                    } else if (iA5 == 2) {
                        iA = zgVar.a(4) + 9;
                        iA2 = zgVar.a(4);
                    } else if (iA5 != 3) {
                        z = z;
                        iA3 = 0;
                        i4 = 0;
                    } else {
                        iA = zgVar.a(8) + 25;
                        iA2 = zgVar.a(4);
                    }
                    iA3 = 0;
                }
                z = z;
                i4 = iA;
                iA3 = iA2;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iA3 = bArr[iA3];
                }
                paint.setColor(iArr[iA3]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z = z;
        }
    }

    private static int[] a() {
        return new int[]{0, -1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int c(com.applovin.impl.zg zgVar, int[] iArr, byte[] bArr, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        boolean z;
        int iA;
        int i4 = i2;
        boolean z2 = false;
        while (true) {
            int iA2 = zgVar.a(8);
            if (iA2 != 0) {
                z = z2;
                iA = 1;
            } else if (!zgVar.f()) {
                int iA3 = zgVar.a(7);
                if (iA3 != 0) {
                    z = z2;
                    iA = iA3;
                    iA2 = 0;
                } else {
                    z = true;
                    iA2 = 0;
                    iA = 0;
                }
            } else {
                z = z2;
                iA = zgVar.a(7);
                iA2 = zgVar.a(8);
            }
            if (iA != 0 && paint != null) {
                if (bArr != null) {
                    iA2 = bArr[iA2];
                }
                paint.setColor(iArr[iA2]);
                canvas.drawRect(i4, i3, i4 + iA, i3 + 1, paint);
            }
            i4 += iA;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static com.applovin.impl.j7.f c(com.applovin.impl.zg zgVar, int i2) {
        int i3;
        int iA;
        int iA2;
        int iA3 = zgVar.a(8);
        zgVar.d(4);
        boolean zF = zgVar.f();
        zgVar.d(3);
        int i4 = 16;
        int iA4 = zgVar.a(16);
        int iA5 = zgVar.a(16);
        int iA6 = zgVar.a(3);
        int iA7 = zgVar.a(3);
        int i5 = 2;
        zgVar.d(2);
        int iA8 = zgVar.a(8);
        int iA9 = zgVar.a(8);
        int iA10 = zgVar.a(4);
        int iA11 = zgVar.a(2);
        zgVar.d(2);
        int i6 = i2 - 10;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        while (i6 > 0) {
            int iA12 = zgVar.a(i4);
            int iA13 = zgVar.a(i5);
            int iA14 = zgVar.a(i5);
            int iA15 = zgVar.a(12);
            int i7 = iA11;
            zgVar.d(4);
            int iA16 = zgVar.a(12);
            int i8 = i6 - 6;
            if (iA13 != 1) {
                i3 = 2;
                if (iA13 != 2) {
                    iA = 0;
                    iA2 = 0;
                    i6 = i8;
                }
                sparseArray.put(iA12, new com.applovin.impl.j7.g(iA13, iA14, iA15, iA16, iA, iA2));
                i5 = i3;
                iA11 = i7;
                i4 = 16;
            } else {
                i3 = 2;
            }
            i6 -= 8;
            iA = zgVar.a(8);
            iA2 = zgVar.a(8);
            sparseArray.put(iA12, new com.applovin.impl.j7.g(iA13, iA14, iA15, iA16, iA, iA2));
            i5 = i3;
            iA11 = i7;
            i4 = 16;
        }
        return new com.applovin.impl.j7.f(iA3, zF, iA4, iA5, iA6, iA7, iA8, iA9, iA10, iA11, sparseArray);
    }

    private static com.applovin.impl.j7.c b(com.applovin.impl.zg zgVar) {
        byte[] bArr;
        int iA = zgVar.a(16);
        zgVar.d(4);
        int iA2 = zgVar.a(2);
        boolean zF = zgVar.f();
        zgVar.d(1);
        byte[] bArr2 = com.applovin.impl.xp.f;
        if (iA2 == 1) {
            zgVar.d(zgVar.a(8) * 16);
        } else {
            if (iA2 == 0) {
                int iA3 = zgVar.a(16);
                int iA4 = zgVar.a(16);
                if (iA3 > 0) {
                    bArr2 = new byte[iA3];
                    zgVar.b(bArr2, 0, iA3);
                }
                if (iA4 > 0) {
                    bArr = new byte[iA4];
                    zgVar.b(bArr, 0, iA4);
                }
            }
            return new com.applovin.impl.j7.c(iA, zF, bArr2, bArr);
        }
        bArr = bArr2;
        return new com.applovin.impl.j7.c(iA, zF, bArr2, bArr);
    }

    private static int a(com.applovin.impl.zg zgVar, int[] iArr, byte[] bArr, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int i4;
        int iA;
        int iA2;
        int i5 = i2;
        boolean z = false;
        while (true) {
            int iA3 = zgVar.a(2);
            if (iA3 != 0) {
                z = z;
                i4 = 1;
            } else {
                if (zgVar.f()) {
                    iA = zgVar.a(3) + 3;
                    iA2 = zgVar.a(2);
                } else {
                    if (zgVar.f()) {
                        i4 = 1;
                    } else {
                        int iA4 = zgVar.a(2);
                        if (iA4 == 0) {
                            z = true;
                        } else if (iA4 == 1) {
                            i4 = 2;
                        } else if (iA4 == 2) {
                            iA = zgVar.a(4) + 12;
                            iA2 = zgVar.a(2);
                        } else if (iA4 != 3) {
                            z = z;
                        } else {
                            iA = zgVar.a(8) + 29;
                            iA2 = zgVar.a(2);
                        }
                        iA3 = 0;
                        i4 = 0;
                    }
                    iA3 = 0;
                }
                z = z;
                i4 = iA;
                iA3 = iA2;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iA3 = bArr[iA3];
                }
                paint.setColor(iArr[iA3]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z = z;
        }
    }

    private static com.applovin.impl.j7.d b(com.applovin.impl.zg zgVar, int i2) {
        int iA = zgVar.a(8);
        int iA2 = zgVar.a(4);
        int iA3 = zgVar.a(2);
        zgVar.d(2);
        int i3 = i2 - 2;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        while (i3 > 0) {
            int iA4 = zgVar.a(8);
            zgVar.d(8);
            i3 -= 6;
            sparseArray.put(iA4, new com.applovin.impl.j7.e(zgVar.a(16), zgVar.a(16)));
        }
        return new com.applovin.impl.j7.d(iA, iA2, iA3, sparseArray);
    }

    private static void a(com.applovin.impl.j7.c cVar, com.applovin.impl.j7.a aVar, int i2, int i3, int i4, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = aVar.d;
        } else if (i2 == 2) {
            iArr = aVar.c;
        } else {
            iArr = aVar.b;
        }
        int[] iArr2 = iArr;
        a(cVar.c, iArr2, i2, i3, i4, paint, canvas);
        a(cVar.d, iArr2, i2, i3, i4 + 1, paint, canvas);
    }

    private static com.applovin.impl.j7.a a(com.applovin.impl.zg zgVar, int i2) {
        int[] iArr;
        int iA;
        int i3;
        int iA2;
        int iA3;
        int iA4;
        int i4 = 8;
        int iA5 = zgVar.a(8);
        zgVar.d(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i6 > 0) {
            int iA6 = zgVar.a(i4);
            int iA7 = zgVar.a(i4);
            if ((iA7 & 128) != 0) {
                iArr = iArrA;
            } else {
                iArr = (iA7 & 64) != 0 ? iArrB : iArrC;
            }
            if ((iA7 & 1) != 0) {
                iA3 = zgVar.a(i4);
                iA4 = zgVar.a(i4);
                iA = zgVar.a(i4);
                iA2 = zgVar.a(i4);
                i3 = i6 - 6;
            } else {
                int iA8 = zgVar.a(6) << i5;
                int iA9 = zgVar.a(4) << 4;
                iA = zgVar.a(4) << 4;
                i3 = i6 - 4;
                iA2 = zgVar.a(i5) << 6;
                iA3 = iA8;
                iA4 = iA9;
            }
            if (iA3 == 0) {
                iA2 = 255;
                iA4 = 0;
                iA = 0;
            }
            double d2 = iA3;
            double d3 = iA4 - 128;
            double d4 = iA - 128;
            iArr[iA6] = a((byte) (255 - (iA2 & 255)), com.applovin.impl.xp.a((int) (d2 + (1.402d * d3)), 0, 255), com.applovin.impl.xp.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), com.applovin.impl.xp.a((int) (d2 + (d4 * 1.772d)), 0, 255));
            i6 = i3;
            iA5 = iA5;
            i4 = 8;
            i5 = 2;
        }
        return new com.applovin.impl.j7.a(iA5, iArrA, iArrB, iArrC);
    }

    private static com.applovin.impl.j7.b a(com.applovin.impl.zg zgVar) {
        int i2;
        int i3;
        int i4;
        int iA;
        zgVar.d(4);
        boolean zF = zgVar.f();
        zgVar.d(3);
        int iA2 = zgVar.a(16);
        int iA3 = zgVar.a(16);
        if (zF) {
            int iA4 = zgVar.a(16);
            int iA5 = zgVar.a(16);
            int iA6 = zgVar.a(16);
            iA = zgVar.a(16);
            i4 = iA5;
            i3 = iA6;
            i2 = iA4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = iA2;
            iA = iA3;
        }
        return new com.applovin.impl.j7.b(iA2, iA3, i2, i4, i3, iA);
    }

    private static void a(com.applovin.impl.zg zgVar, com.applovin.impl.j7.h hVar) {
        com.applovin.impl.j7.f fVar;
        int iA = zgVar.a(8);
        int iA2 = zgVar.a(16);
        int iA3 = zgVar.a(16);
        int iD = zgVar.d() + iA3;
        if (iA3 * 8 > zgVar.b()) {
            com.applovin.impl.oc.d("DvbParser", "Data field length exceeds limit");
            zgVar.d(zgVar.b());
            return;
        }
        switch (iA) {
            case 16:
                if (iA2 == hVar.f917a) {
                    com.applovin.impl.j7.d dVar = hVar.i;
                    com.applovin.impl.j7.d dVarB = b(zgVar, iA3);
                    if (dVarB.c != 0) {
                        hVar.i = dVarB;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                    } else if (dVar != null && dVar.b != dVarB.b) {
                        hVar.i = dVarB;
                    }
                }
                break;
            case 17:
                com.applovin.impl.j7.d dVar2 = hVar.i;
                if (iA2 == hVar.f917a && dVar2 != null) {
                    com.applovin.impl.j7.f fVarC = c(zgVar, iA3);
                    if (dVar2.c == 0 && (fVar = (com.applovin.impl.j7.f) hVar.c.get(fVarC.f915a)) != null) {
                        fVarC.a(fVar);
                    }
                    hVar.c.put(fVarC.f915a, fVarC);
                }
                break;
            case 18:
                if (iA2 == hVar.f917a) {
                    com.applovin.impl.j7.a aVarA = a(zgVar, iA3);
                    hVar.d.put(aVarA.f910a, aVarA);
                } else if (iA2 == hVar.b) {
                    com.applovin.impl.j7.a aVarA2 = a(zgVar, iA3);
                    hVar.f.put(aVarA2.f910a, aVarA2);
                }
                break;
            case 19:
                if (iA2 == hVar.f917a) {
                    com.applovin.impl.j7.c cVarB = b(zgVar);
                    hVar.e.put(cVarB.f912a, cVarB);
                } else if (iA2 == hVar.b) {
                    com.applovin.impl.j7.c cVarB2 = b(zgVar);
                    hVar.g.put(cVarB2.f912a, cVarB2);
                }
                break;
            case 20:
                if (iA2 == hVar.f917a) {
                    hVar.h = a(zgVar);
                }
                break;
        }
        zgVar.e(iD - zgVar.d());
    }

    public java.util.List a(byte[] bArr, int i2) {
        int i3;
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(bArr, i2);
        while (zgVar.b() >= 48 && zgVar.a(8) == 15) {
            a(zgVar, this.f);
        }
        com.applovin.impl.j7.h hVar = this.f;
        com.applovin.impl.j7.d dVar = hVar.i;
        if (dVar == null) {
            return java.util.Collections.emptyList();
        }
        com.applovin.impl.j7.b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        android.graphics.Bitmap bitmap = this.g;
        if (bitmap == null || bVar.f911a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bVar.f911a + 1, bVar.b + 1, android.graphics.Bitmap.Config.ARGB_8888);
            this.g = bitmapCreateBitmap;
            this.c.setBitmap(bitmapCreateBitmap);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.SparseArray sparseArray = dVar.d;
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            this.c.save();
            com.applovin.impl.j7.e eVar = (com.applovin.impl.j7.e) sparseArray.valueAt(i4);
            com.applovin.impl.j7.f fVar = (com.applovin.impl.j7.f) this.f.c.get(sparseArray.keyAt(i4));
            int i5 = eVar.f914a + bVar.c;
            int i6 = eVar.b + bVar.e;
            this.c.clipRect(i5, i6, java.lang.Math.min(fVar.c + i5, bVar.d), java.lang.Math.min(fVar.d + i6, bVar.f));
            com.applovin.impl.j7.a aVar = (com.applovin.impl.j7.a) this.f.d.get(fVar.g);
            if (aVar == null && (aVar = (com.applovin.impl.j7.a) this.f.f.get(fVar.g)) == null) {
                aVar = this.e;
            }
            int i7 = 0;
            for (android.util.SparseArray sparseArray2 = fVar.k; i7 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i7);
                com.applovin.impl.j7.g gVar = (com.applovin.impl.j7.g) sparseArray2.valueAt(i7);
                com.applovin.impl.j7.c cVar = (com.applovin.impl.j7.c) this.f.e.get(iKeyAt);
                com.applovin.impl.j7.c cVar2 = cVar == null ? (com.applovin.impl.j7.c) this.f.g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    a(cVar2, aVar, fVar.f, gVar.c + i5, i6 + gVar.d, cVar2.b ? null : this.f909a, this.c);
                }
                i7++;
            }
            if (fVar.b) {
                int i8 = fVar.f;
                if (i8 == 3) {
                    i3 = aVar.d[fVar.h];
                } else if (i8 == 2) {
                    i3 = aVar.c[fVar.i];
                } else {
                    i3 = aVar.b[fVar.j];
                }
                this.b.setColor(i3);
                this.c.drawRect(i5, i6, fVar.c + i5, fVar.d + i6, this.b);
            }
            arrayList.add(new com.applovin.impl.a5.b().a(android.graphics.Bitmap.createBitmap(this.g, i5, i6, fVar.c, fVar.d)).b(i5 / bVar.f911a).b(0).a(i6 / bVar.b, 0).a(0).d(fVar.c / bVar.f911a).a(fVar.d / bVar.b).a());
            this.c.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(bArr);
        int iA = i3;
        int i5 = i4;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (zgVar.b() != 0) {
            int iA2 = zgVar.a(8);
            if (iA2 != 240) {
                switch (iA2) {
                    case 16:
                        if (i2 == 3) {
                            if (bArrA == null) {
                                bArr3 = i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrA;
                            }
                        } else if (i2 != 2) {
                            bArr2 = null;
                        } else if (bArrA3 == null) {
                            bArr3 = h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrA3;
                        }
                        iA = a(zgVar, iArr, bArr2, iA, i5, paint, canvas);
                        zgVar.c();
                        break;
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArrA2 == null ? j : bArrA2;
                        } else {
                            bArr4 = null;
                        }
                        iA = b(zgVar, iArr, bArr4, iA, i5, paint, canvas);
                        zgVar.c();
                        break;
                    case 18:
                        iA = c(zgVar, iArr, null, iA, i5, paint, canvas);
                        break;
                    default:
                        switch (iA2) {
                            case 32:
                                bArrA3 = a(4, 4, zgVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, zgVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, zgVar);
                                break;
                        }
                        break;
                }
            } else {
                i5 += 2;
                iA = i3;
            }
        }
    }
}

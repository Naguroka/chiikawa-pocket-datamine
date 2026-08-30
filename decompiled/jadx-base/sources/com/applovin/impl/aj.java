package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.n0 f624a;
    private final int b;
    private final com.applovin.impl.ah c;
    private com.applovin.impl.aj.a d;
    private com.applovin.impl.aj.a e;
    private com.applovin.impl.aj.a f;
    private long g;

    public aj(com.applovin.impl.n0 n0Var) {
        this.f624a = n0Var;
        int iC = n0Var.c();
        this.b = iC;
        this.c = new com.applovin.impl.ah(32);
        com.applovin.impl.aj.a aVar = new com.applovin.impl.aj.a(0L, iC);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public void c() {
        this.e = this.d;
    }

    private void a(com.applovin.impl.aj.a aVar) {
        if (aVar.c) {
            com.applovin.impl.aj.a aVar2 = this.f;
            boolean z = aVar2.c;
            int i = (z ? 1 : 0) + (((int) (aVar2.f625a - aVar.f625a)) / this.b);
            com.applovin.impl.m0[] m0VarArr = new com.applovin.impl.m0[i];
            for (int i2 = 0; i2 < i; i2++) {
                m0VarArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.f624a.a(m0VarArr);
        }
    }

    private int b(int i) {
        com.applovin.impl.aj.a aVar = this.f;
        if (!aVar.c) {
            aVar.a(this.f624a.b(), new com.applovin.impl.aj.a(this.f.b, this.b));
        }
        return java.lang.Math.min(i, (int) (this.f.b - this.g));
    }

    public void a(long j) {
        com.applovin.impl.aj.a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            this.f624a.a(aVar.d);
            this.d = this.d.a();
        }
        if (this.e.f625a < aVar.f625a) {
            this.e = aVar;
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f625a;
        public final long b;
        public boolean c;
        public com.applovin.impl.m0 d;
        public com.applovin.impl.aj.a e;

        public a(long j, int i) {
            this.f625a = j;
            this.b = j + ((long) i);
        }

        public com.applovin.impl.aj.a a() {
            this.d = null;
            com.applovin.impl.aj.a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void a(com.applovin.impl.m0 m0Var, com.applovin.impl.aj.a aVar) {
            this.d = m0Var;
            this.e = aVar;
            this.c = true;
        }

        public int a(long j) {
            return ((int) (j - this.f625a)) + this.d.b;
        }
    }

    private static com.applovin.impl.aj.a b(com.applovin.impl.aj.a aVar, com.applovin.impl.o5 o5Var, com.applovin.impl.bj.b bVar, com.applovin.impl.ah ahVar) {
        if (o5Var.h()) {
            aVar = a(aVar, o5Var, bVar, ahVar);
        }
        if (o5Var.c()) {
            ahVar.d(4);
            com.applovin.impl.aj.a aVarA = a(aVar, bVar.b, ahVar.c(), 4);
            int iA = ahVar.A();
            bVar.b += 4;
            bVar.f649a -= 4;
            o5Var.g(iA);
            com.applovin.impl.aj.a aVarA2 = a(aVarA, bVar.b, o5Var.c, iA);
            bVar.b += (long) iA;
            int i = bVar.f649a - iA;
            bVar.f649a = i;
            o5Var.h(i);
            return a(aVarA2, bVar.b, o5Var.g, bVar.f649a);
        }
        o5Var.g(bVar.f649a);
        return a(aVar, bVar.b, o5Var.c, bVar.f649a);
    }

    public void b(com.applovin.impl.o5 o5Var, com.applovin.impl.bj.b bVar) {
        this.e = b(this.e, o5Var, bVar, this.c);
    }

    public void b() {
        a(this.d);
        com.applovin.impl.aj.a aVar = new com.applovin.impl.aj.a(0L, this.b);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.f624a.a();
    }

    private static com.applovin.impl.aj.a a(com.applovin.impl.aj.a aVar, long j) {
        while (j >= aVar.b) {
            aVar = aVar.e;
        }
        return aVar;
    }

    public long a() {
        return this.g;
    }

    public void a(com.applovin.impl.o5 o5Var, com.applovin.impl.bj.b bVar) {
        b(this.e, o5Var, bVar, this.c);
    }

    private void a(int i) {
        long j = this.g + ((long) i);
        this.g = j;
        com.applovin.impl.aj.a aVar = this.f;
        if (j == aVar.b) {
            this.f = aVar.e;
        }
    }

    private static com.applovin.impl.aj.a a(com.applovin.impl.aj.a aVar, long j, java.nio.ByteBuffer byteBuffer, int i) {
        com.applovin.impl.aj.a aVarA = a(aVar, j);
        while (i > 0) {
            int iMin = java.lang.Math.min(i, (int) (aVarA.b - j));
            byteBuffer.put(aVarA.d.f1003a, aVarA.a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVarA.b) {
                aVarA = aVarA.e;
            }
        }
        return aVarA;
    }

    private static com.applovin.impl.aj.a a(com.applovin.impl.aj.a aVar, long j, byte[] bArr, int i) {
        com.applovin.impl.aj.a aVarA = a(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = java.lang.Math.min(i2, (int) (aVarA.b - j));
            java.lang.System.arraycopy(aVarA.d.f1003a, aVarA.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVarA.b) {
                aVarA = aVarA.e;
            }
        }
        return aVarA;
    }

    private static com.applovin.impl.aj.a a(com.applovin.impl.aj.a aVar, com.applovin.impl.o5 o5Var, com.applovin.impl.bj.b bVar, com.applovin.impl.ah ahVar) {
        long j = bVar.b;
        int iC = 1;
        ahVar.d(1);
        com.applovin.impl.aj.a aVarA = a(aVar, j, ahVar.c(), 1);
        long j2 = j + 1;
        byte b = ahVar.c()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        com.applovin.impl.z4 z4Var = o5Var.b;
        byte[] bArr = z4Var.f1559a;
        if (bArr == null) {
            z4Var.f1559a = new byte[16];
        } else {
            java.util.Arrays.fill(bArr, (byte) 0);
        }
        com.applovin.impl.aj.a aVarA2 = a(aVarA, j2, z4Var.f1559a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            ahVar.d(2);
            aVarA2 = a(aVarA2, j3, ahVar.c(), 2);
            j3 += 2;
            iC = ahVar.C();
        }
        int i2 = iC;
        int[] iArr = z4Var.d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = z4Var.e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            ahVar.d(i3);
            aVarA2 = a(aVarA2, j3, ahVar.c(), i3);
            j3 += (long) i3;
            ahVar.f(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = ahVar.C();
                iArr4[i4] = ahVar.A();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f649a - ((int) (j3 - bVar.b));
        }
        com.applovin.impl.qo.a aVar2 = (com.applovin.impl.qo.a) com.applovin.impl.xp.a(bVar.c);
        z4Var.a(i2, iArr2, iArr4, aVar2.b, z4Var.f1559a, aVar2.f1199a, aVar2.c, aVar2.d);
        long j4 = bVar.b;
        int i5 = (int) (j3 - j4);
        bVar.b = j4 + ((long) i5);
        bVar.f649a -= i5;
        return aVarA2;
    }

    public int a(com.applovin.impl.f5 f5Var, int i, boolean z) throws java.io.EOFException {
        int iB = b(i);
        com.applovin.impl.aj.a aVar = this.f;
        int iA = f5Var.a(aVar.d.f1003a, aVar.a(this.g), iB);
        if (iA != -1) {
            a(iA);
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public void a(com.applovin.impl.ah ahVar, int i) {
        while (i > 0) {
            int iB = b(i);
            com.applovin.impl.aj.a aVar = this.f;
            ahVar.a(aVar.d.f1003a, aVar.a(this.g), iB);
            i -= iB;
            a(iB);
        }
    }
}

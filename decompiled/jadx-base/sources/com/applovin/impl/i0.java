package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class i0 extends com.applovin.impl.f2 {
    private final com.applovin.impl.y1 h;
    private final long i;
    private final long j;
    private final long k;
    private final float l;
    private final float m;
    private final com.applovin.impl.db n;
    private final com.applovin.impl.l3 o;
    private float p;
    private int q;
    private int r;
    private long s;

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.db b(com.applovin.impl.g8.a[] aVarArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.applovin.impl.g8.a aVar : aVarArr) {
            if (aVar == null || aVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                com.applovin.impl.db.a aVarF = com.applovin.impl.db.f();
                aVarF.b(new com.applovin.impl.i0.a(0L, 0L));
                arrayList.add(aVarF);
            }
        }
        long[][] jArrC = c(aVarArr);
        int[] iArr = new int[jArrC.length];
        long[] jArr = new long[jArrC.length];
        for (int i = 0; i < jArrC.length; i++) {
            long[] jArr2 = jArrC[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        a(arrayList, jArr);
        com.applovin.impl.db dbVarA = a(jArrC);
        for (int i2 = 0; i2 < dbVarA.size(); i2++) {
            int iIntValue = ((java.lang.Integer) dbVarA.get(i2)).intValue();
            int i3 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i3;
            jArr[iIntValue] = jArrC[iIntValue][i3];
            a(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        a(arrayList, jArr);
        com.applovin.impl.db.a aVarF2 = com.applovin.impl.db.f();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            com.applovin.impl.db.a aVar2 = (com.applovin.impl.db.a) arrayList.get(i5);
            aVarF2.b(aVar2 == null ? com.applovin.impl.db.h() : aVar2.a());
        }
        return aVarF2.a();
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.g8
    public void f() {
    }

    public static class b implements com.applovin.impl.g8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f865a;
        private final int b;
        private final int c;
        private final float d;
        private final float e;
        private final com.applovin.impl.l3 f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, com.applovin.impl.l3.f976a);
        }

        @Override // com.applovin.impl.g8.b
        public final com.applovin.impl.g8[] a(com.applovin.impl.g8.a[] aVarArr, com.applovin.impl.y1 y1Var, com.applovin.impl.ae.a aVar, com.applovin.impl.fo foVar) {
            com.applovin.impl.g8 g8VarA;
            com.applovin.impl.db dbVarB = com.applovin.impl.i0.b(aVarArr);
            com.applovin.impl.g8[] g8VarArr = new com.applovin.impl.g8[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                com.applovin.impl.g8.a aVar2 = aVarArr[i];
                if (aVar2 != null) {
                    int[] iArr = aVar2.b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            g8VarA = new com.applovin.impl.s8(aVar2.f810a, iArr[0], aVar2.c);
                        } else {
                            g8VarA = a(aVar2.f810a, iArr, aVar2.c, y1Var, (com.applovin.impl.db) dbVarB.get(i));
                        }
                        g8VarArr[i] = g8VarA;
                    }
                }
            }
            return g8VarArr;
        }

        protected com.applovin.impl.i0 a(com.applovin.impl.oo ooVar, int[] iArr, int i, com.applovin.impl.y1 y1Var, com.applovin.impl.db dbVar) {
            return new com.applovin.impl.i0(ooVar, iArr, i, y1Var, this.f865a, this.b, this.c, this.d, this.e, dbVar, this.f);
        }

        public b(int i, int i2, int i3, float f, float f2, com.applovin.impl.l3 l3Var) {
            this.f865a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = f2;
            this.f = l3Var;
        }
    }

    protected i0(com.applovin.impl.oo ooVar, int[] iArr, int i, com.applovin.impl.y1 y1Var, long j, long j2, long j3, float f, float f2, java.util.List list, com.applovin.impl.l3 l3Var) {
        super(ooVar, iArr, i);
        if (j3 < j) {
            com.applovin.impl.oc.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.h = y1Var;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.k = j3 * 1000;
        this.l = f;
        this.m = f2;
        this.n = com.applovin.impl.db.a((java.util.Collection) list);
        this.o = l3Var;
        this.p = 1.0f;
        this.r = 0;
        this.s = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.g8
    public void i() {
        this.s = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.g8
    public int h() {
        return this.q;
    }

    private static long[][] c(com.applovin.impl.g8.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            com.applovin.impl.g8.a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = aVar.f810a.a(iArr[i2]).i;
                    i2++;
                }
                java.util.Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f864a;
        public final long b;

        public a(long j, long j2) {
            this.f864a = j;
            this.b = j2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.i0.a)) {
                return false;
            }
            com.applovin.impl.i0.a aVar = (com.applovin.impl.i0.a) obj;
            return this.f864a == aVar.f864a && this.b == aVar.b;
        }

        public int hashCode() {
            return (((int) this.f864a) * 31) + ((int) this.b);
        }
    }

    private static void a(java.util.List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            com.applovin.impl.db.a aVar = (com.applovin.impl.db.a) list.get(i);
            if (aVar != null) {
                aVar.b(new com.applovin.impl.i0.a(j, jArr[i]));
            }
        }
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.g8
    public void a(float f) {
        this.p = f;
    }

    private static com.applovin.impl.db a(long[][] jArr) {
        com.applovin.impl.ec ecVarB = com.applovin.impl.vf.a().a().b();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double dLog = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        dLog = java.lang.Math.log(j);
                    }
                    dArr[i2] = dLog;
                    i2++;
                }
                int i3 = length - 1;
                double d = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d2 = dArr[i4];
                    i4++;
                    ecVarB.put(java.lang.Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i4]) * 0.5d) - dArr[0]) / d), java.lang.Integer.valueOf(i));
                }
            }
        }
        return com.applovin.impl.db.a(ecVarB.values());
    }
}

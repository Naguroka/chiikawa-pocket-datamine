package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sc extends com.applovin.impl.vo {
    private com.applovin.impl.sc.a c;

    protected abstract android.util.Pair a(com.applovin.impl.sc.a aVar, int[][][] iArr, int[] iArr2, com.applovin.impl.ae.a aVar2, com.applovin.impl.fo foVar);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1248a;
        private final java.lang.String[] b;
        private final int[] c;
        private final com.applovin.impl.po[] d;
        private final int[] e;
        private final int[][][] f;
        private final com.applovin.impl.po g;

        a(java.lang.String[] strArr, int[] iArr, com.applovin.impl.po[] poVarArr, int[] iArr2, int[][][] iArr3, com.applovin.impl.po poVar) {
            this.b = strArr;
            this.c = iArr;
            this.d = poVarArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = poVar;
            this.f1248a = iArr.length;
        }

        public int a() {
            return this.f1248a;
        }

        public com.applovin.impl.po b(int i) {
            return this.d[i];
        }

        public int a(int i) {
            return this.c[i];
        }
    }

    private static int a(com.applovin.impl.ri[] riVarArr, com.applovin.impl.oo ooVar, int[] iArr, boolean z) {
        int length = riVarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < riVarArr.length; i2++) {
            com.applovin.impl.ri riVar = riVarArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < ooVar.f1127a; i3++) {
                iMax = java.lang.Math.max(iMax, com.applovin.impl.ri.d(riVar.a(ooVar.a(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] a(com.applovin.impl.ri riVar, com.applovin.impl.oo ooVar) {
        int[] iArr = new int[ooVar.f1127a];
        for (int i = 0; i < ooVar.f1127a; i++) {
            iArr[i] = riVar.a(ooVar.a(i));
        }
        return iArr;
    }

    private static int[] a(com.applovin.impl.ri[] riVarArr) {
        int length = riVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = riVarArr[i].m();
        }
        return iArr;
    }

    @Override // com.applovin.impl.vo
    public final void a(java.lang.Object obj) {
        this.c = (com.applovin.impl.sc.a) obj;
    }

    @Override // com.applovin.impl.vo
    public final com.applovin.impl.wo a(com.applovin.impl.ri[] riVarArr, com.applovin.impl.po poVar, com.applovin.impl.ae.a aVar, com.applovin.impl.fo foVar) {
        int[] iArrA;
        int[] iArr = new int[riVarArr.length + 1];
        int length = riVarArr.length + 1;
        com.applovin.impl.oo[][] ooVarArr = new com.applovin.impl.oo[length][];
        int[][][] iArr2 = new int[riVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = poVar.f1153a;
            ooVarArr[i] = new com.applovin.impl.oo[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrA2 = a(riVarArr);
        for (int i3 = 0; i3 < poVar.f1153a; i3++) {
            com.applovin.impl.oo ooVarA = poVar.a(i3);
            int iA = a(riVarArr, ooVarA, iArr, com.applovin.impl.hf.e(ooVarA.a(0).m) == 5);
            if (iA == riVarArr.length) {
                iArrA = new int[ooVarA.f1127a];
            } else {
                iArrA = a(riVarArr[iA], ooVarA);
            }
            int i4 = iArr[iA];
            ooVarArr[iA][i4] = ooVarA;
            iArr2[iA][i4] = iArrA;
            iArr[iA] = i4 + 1;
        }
        com.applovin.impl.po[] poVarArr = new com.applovin.impl.po[riVarArr.length];
        java.lang.String[] strArr = new java.lang.String[riVarArr.length];
        int[] iArr3 = new int[riVarArr.length];
        for (int i5 = 0; i5 < riVarArr.length; i5++) {
            int i6 = iArr[i5];
            poVarArr[i5] = new com.applovin.impl.po((com.applovin.impl.oo[]) com.applovin.impl.xp.a(ooVarArr[i5], i6));
            iArr2[i5] = (int[][]) com.applovin.impl.xp.a(iArr2[i5], i6);
            strArr[i5] = riVarArr[i5].getName();
            iArr3[i5] = riVarArr[i5].e();
        }
        com.applovin.impl.sc.a aVar2 = new com.applovin.impl.sc.a(strArr, iArr3, poVarArr, iArrA2, iArr2, new com.applovin.impl.po((com.applovin.impl.oo[]) com.applovin.impl.xp.a(ooVarArr[riVarArr.length], iArr[riVarArr.length])));
        android.util.Pair pairA = a(aVar2, iArr2, iArrA2, aVar, foVar);
        return new com.applovin.impl.wo((com.applovin.impl.si[]) pairA.first, (com.applovin.impl.g8[]) pairA.second, aVar2);
    }
}

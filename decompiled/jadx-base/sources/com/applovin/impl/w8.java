package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w8 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.applovin.impl.z8 f1458a;

        public a(com.applovin.impl.z8 z8Var) {
            this.f1458a = z8Var;
        }
    }

    public static boolean a(com.applovin.impl.k8 k8Var) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(4);
        k8Var.c(ahVar.c(), 0, 4);
        return ahVar.y() == 1716281667;
    }

    public static void d(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(4);
        k8Var.d(ahVar.c(), 0, 4);
        if (ahVar.y() != 1716281667) {
            throw com.applovin.impl.ch.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static com.applovin.impl.af a(com.applovin.impl.k8 k8Var, boolean z) {
        com.applovin.impl.af afVarA = new com.applovin.impl.ya().a(k8Var, z ? null : com.applovin.impl.wa.b);
        if (afVarA == null || afVarA.c() == 0) {
            return null;
        }
        return afVarA;
    }

    public static int b(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        k8Var.b();
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(2);
        k8Var.c(ahVar.c(), 0, 2);
        int iC = ahVar.C();
        if ((iC >> 2) == 16382) {
            k8Var.b();
            return iC;
        }
        k8Var.b();
        throw com.applovin.impl.ch.a("First frame does not start with sync code.", null);
    }

    private static com.applovin.impl.z8 c(com.applovin.impl.k8 k8Var) {
        byte[] bArr = new byte[38];
        k8Var.d(bArr, 0, 38);
        return new com.applovin.impl.z8(bArr, 4);
    }

    private static java.util.List c(com.applovin.impl.k8 k8Var, int i) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(i);
        k8Var.d(ahVar.c(), 0, i);
        ahVar.g(4);
        return java.util.Arrays.asList(com.applovin.impl.fr.a(ahVar, false, false).b);
    }

    public static boolean a(com.applovin.impl.k8 k8Var, com.applovin.impl.w8.a aVar) {
        k8Var.b();
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(new byte[4]);
        k8Var.c(zgVar.f1572a, 0, 4);
        boolean zF = zgVar.f();
        int iA = zgVar.a(7);
        int iA2 = zgVar.a(24) + 4;
        if (iA == 0) {
            aVar.f1458a = c(k8Var);
        } else {
            com.applovin.impl.z8 z8Var = aVar.f1458a;
            if (z8Var == null) {
                throw new java.lang.IllegalArgumentException();
            }
            if (iA == 3) {
                aVar.f1458a = z8Var.a(b(k8Var, iA2));
            } else if (iA == 4) {
                aVar.f1458a = z8Var.b(c(k8Var, iA2));
            } else if (iA == 6) {
                aVar.f1458a = z8Var.a(java.util.Collections.singletonList(a(k8Var, iA2)));
            } else {
                k8Var.a(iA2);
            }
        }
        return zF;
    }

    public static com.applovin.impl.af b(com.applovin.impl.k8 k8Var, boolean z) {
        k8Var.b();
        long jD = k8Var.d();
        com.applovin.impl.af afVarA = a(k8Var, z);
        k8Var.a((int) (k8Var.d() - jD));
        return afVarA;
    }

    public static com.applovin.impl.z8.a a(com.applovin.impl.ah ahVar) {
        ahVar.g(1);
        int iZ = ahVar.z();
        long jD = ((long) ahVar.d()) + ((long) iZ);
        int i = iZ / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jS = ahVar.s();
            if (jS == -1) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jS;
            jArrCopyOf2[i2] = ahVar.s();
            ahVar.g(2);
        }
        ahVar.g((int) (jD - ((long) ahVar.d())));
        return new com.applovin.impl.z8.a(jArrCopyOf, jArrCopyOf2);
    }

    private static com.applovin.impl.lh a(com.applovin.impl.k8 k8Var, int i) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(i);
        k8Var.d(ahVar.c(), 0, i);
        ahVar.g(4);
        int iJ = ahVar.j();
        java.lang.String strA = ahVar.a(ahVar.j(), com.applovin.exoplayer2.common.base.Charsets.US_ASCII);
        java.lang.String strC = ahVar.c(ahVar.j());
        int iJ2 = ahVar.j();
        int iJ3 = ahVar.j();
        int iJ4 = ahVar.j();
        int iJ5 = ahVar.j();
        int iJ6 = ahVar.j();
        byte[] bArr = new byte[iJ6];
        ahVar.a(bArr, 0, iJ6);
        return new com.applovin.impl.lh(iJ, strA, strC, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    private static com.applovin.impl.z8.a b(com.applovin.impl.k8 k8Var, int i) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(i);
        k8Var.d(ahVar.c(), 0, i);
        return a(ahVar);
    }
}

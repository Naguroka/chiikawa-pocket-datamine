package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v8 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1423a;
    }

    private static boolean a(com.applovin.impl.ah ahVar, com.applovin.impl.z8 z8Var, int i) {
        int iB = b(ahVar, i);
        return iB != -1 && iB <= z8Var.b;
    }

    private static boolean b(com.applovin.impl.ah ahVar, com.applovin.impl.z8 z8Var, int i) {
        int i2 = z8Var.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == z8Var.f;
        }
        if (i == 12) {
            return ahVar.w() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int iC = ahVar.C();
        if (i == 14) {
            iC *= 10;
        }
        return iC == i2;
    }

    private static boolean b(int i, com.applovin.impl.z8 z8Var) {
        if (i <= 7) {
            return i == z8Var.g - 1;
        }
        return i <= 10 && z8Var.g == 2;
    }

    private static boolean a(com.applovin.impl.ah ahVar, int i) {
        return ahVar.w() == com.applovin.impl.xp.b(ahVar.c(), i, ahVar.d() - 1, 0);
    }

    public static int b(com.applovin.impl.ah ahVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ahVar.w() + 1;
            case 7:
                return ahVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean a(com.applovin.impl.ah ahVar, com.applovin.impl.z8 z8Var, boolean z, com.applovin.impl.v8.a aVar) {
        try {
            long jD = ahVar.D();
            if (!z) {
                jD *= (long) z8Var.b;
            }
            aVar.f1423a = jD;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public static boolean a(com.applovin.impl.ah ahVar, com.applovin.impl.z8 z8Var, int i, com.applovin.impl.v8.a aVar) {
        int iD = ahVar.d();
        long jY = ahVar.y();
        long j = jY >>> 16;
        if (j != i) {
            return false;
        }
        return b((int) ((jY >> 4) & 15), z8Var) && a((int) ((jY >> 1) & 7), z8Var) && !(((jY & 1) > 1L ? 1 : ((jY & 1) == 1L ? 0 : -1)) == 0) && a(ahVar, z8Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(ahVar, z8Var, (int) ((jY >> 12) & 15)) && b(ahVar, z8Var, (int) ((jY >> 8) & 15)) && a(ahVar, iD);
    }

    private static boolean a(int i, com.applovin.impl.z8 z8Var) {
        return i == 0 || i == z8Var.i;
    }

    public static boolean a(com.applovin.impl.k8 k8Var, com.applovin.impl.z8 z8Var, int i, com.applovin.impl.v8.a aVar) {
        long jD = k8Var.d();
        byte[] bArr = new byte[2];
        k8Var.c(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            k8Var.b();
            k8Var.c((int) (jD - k8Var.f()));
            return false;
        }
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(16);
        java.lang.System.arraycopy(bArr, 0, ahVar.c(), 0, 2);
        ahVar.e(com.applovin.impl.m8.a(k8Var, ahVar.c(), 2, 14));
        k8Var.b();
        k8Var.c((int) (jD - k8Var.f()));
        return a(ahVar, z8Var, i, aVar);
    }

    public static long a(com.applovin.impl.k8 k8Var, com.applovin.impl.z8 z8Var) throws com.applovin.impl.ch {
        k8Var.b();
        k8Var.c(1);
        byte[] bArr = new byte[1];
        k8Var.c(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        k8Var.c(2);
        int i = z ? 7 : 6;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(i);
        ahVar.e(com.applovin.impl.m8.a(k8Var, ahVar.c(), 0, i));
        k8Var.b();
        com.applovin.impl.v8.a aVar = new com.applovin.impl.v8.a();
        if (a(ahVar, z8Var, z, aVar)) {
            return aVar.f1423a;
        }
        throw com.applovin.impl.ch.a(null, null);
    }
}

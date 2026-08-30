package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f995a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, androidx.media3.extractor.mp4.Atom.TYPE_avc1, androidx.media3.extractor.mp4.Atom.TYPE_hvc1, androidx.media3.extractor.mp4.Atom.TYPE_hev1, androidx.media3.extractor.mp4.Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, androidx.media3.extractor.mp4.Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f995a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(com.applovin.impl.k8 k8Var) {
        return a(k8Var, true, false);
    }

    private static boolean a(com.applovin.impl.k8 k8Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        long jA = k8Var.a();
        long j = -1;
        int i2 = (jA > (-1L) ? 1 : (jA == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && jA <= 4096) {
            j2 = jA;
        }
        int i3 = (int) j2;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(64);
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        while (true) {
            if (i4 < i3) {
                ahVar.d(8);
                if (k8Var.b(ahVar.c(), z8 ? 1 : 0, 8, true)) {
                    long jY = ahVar.y();
                    int iJ = ahVar.j();
                    if (jY == 1) {
                        k8Var.c(ahVar.c(), 8, 8);
                        ahVar.e(16);
                        i = 16;
                        jY = ahVar.s();
                    } else {
                        if (jY == 0) {
                            long jA2 = k8Var.a();
                            if (jA2 != j) {
                                jY = (jA2 - k8Var.d()) + ((long) 8);
                            }
                        }
                        i = 8;
                    }
                    long j3 = i;
                    if (jY < j3) {
                        return z8;
                    }
                    i4 += i;
                    if (iJ == 1836019574) {
                        i3 += (int) jY;
                        if (i2 != 0 && i3 > jA) {
                            i3 = (int) jA;
                        }
                    } else if (iJ == 1836019558 || iJ == 1836475768) {
                        z3 = z8 ? 1 : 0;
                        z4 = true;
                        z5 = true;
                    } else {
                        int i5 = i2;
                        if ((((long) i4) + jY) - j3 >= i3) {
                            z3 = false;
                            z4 = true;
                            z5 = z3 ? 1 : 0;
                        } else {
                            int i6 = (int) (jY - j3);
                            i4 += i6;
                            if (iJ != 1718909296) {
                                z6 = false;
                                if (i6 != 0) {
                                    z9 = z9;
                                    k8Var.c(i6);
                                    z9 = z9;
                                }
                            } else {
                                if (i6 < 8) {
                                    return false;
                                }
                                ahVar.d(i6);
                                k8Var.c(ahVar.c(), 0, i6);
                                int i7 = i6 / 4;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= i7) {
                                        z7 = z9;
                                        break;
                                    }
                                    if (i8 == 1) {
                                        ahVar.g(4);
                                    } else if (a(ahVar.j(), z2)) {
                                        z7 = true;
                                        break;
                                    }
                                    i8++;
                                }
                                z6 = false;
                                z9 = z7;
                                if (!z7) {
                                    return false;
                                }
                            }
                            z9 = z9;
                            z8 = z6;
                            i2 = i5;
                        }
                    }
                    j = -1;
                    z9 = z9;
                }
                return (z9 || z != z5) ? z3 : z4;
            }
            z3 = z8 ? 1 : 0;
            z4 = true;
            z5 = z3 ? 1 : 0;
            if (z9) {
            }
        }
    }

    public static boolean a(com.applovin.impl.k8 k8Var, boolean z) {
        return a(k8Var, false, z);
    }
}

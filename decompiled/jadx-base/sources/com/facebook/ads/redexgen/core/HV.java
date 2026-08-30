package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class HV {
    public static java.lang.String[] A00 = {"TbLLw7hS58Wjr59cfeSexk5oWyKF6s7C", "GpOyqB919hS11bb46l", "ubq0AnOQuLQbFAJR29OPJZIs2ZjnF7si", "RjLfiN5mdRoF0cuzHSo7oXSwBpNHH9g7", "VMhO8g9Caz8fI2muTjS3ZOWh9TiJbhjH", "4FvPrXeCmkf57cb8zYzpqv9yeWs0meic", "v7BrBjClyufuhZ3ukRXOOT1kcEOoG0uW", "kgJm8XvDyg2uL2T461lzWo2B48b2iSyN"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0088: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gz) STATIC call: com.facebook.ads.redexgen.X.IK.A0W(com.facebook.ads.redexgen.X.Gz):void A[MD:(com.facebook.ads.redexgen.X.Gz):void (m)], block:B:32:0x0088 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0092: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gz) STATIC call: com.facebook.ads.redexgen.X.IK.A0W(com.facebook.ads.redexgen.X.Gz):void A[MD:(com.facebook.ads.redexgen.X.Gz):void (m)], block:B:36:0x0092 */
    public static long A00(com.facebook.ads.redexgen.core.H3 h3, long j, long j2, com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz, byte[] bArr, com.facebook.ads.redexgen.core.I8 i8, int i, com.facebook.ads.redexgen.core.HU hu) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724GzA0W;
        com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724GzA0W2;
        while (true) {
            if (i8 != null) {
                i8.A01(i);
            }
            try {
                break;
            } catch (com.facebook.ads.redexgen.core.I7 unused) {
                com.facebook.ads.redexgen.core.IK.A0W(interfaceC0724GzA0W2);
            } catch (java.lang.Throwable th) {
                com.facebook.ads.redexgen.core.IK.A0W(interfaceC0724GzA0W);
                throw th;
            }
        }
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        com.facebook.ads.redexgen.core.H3 h4 = new com.facebook.ads.redexgen.core.H3(h3.A04, h3.A06, j, (h3.A03 + j) - h3.A01, -1L, h3.A05, h3.A00 | 2);
        long jAEE = interfaceC0724Gz.AEE(h4);
        if (hu.A01 == -1 && jAEE != -1) {
            hu.A01 = h4.A01 + jAEE;
        }
        long j3 = 0;
        while (j3 != j2) {
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            int i2 = interfaceC0724Gz.read(bArr, 0, j2 != -1 ? (int) java.lang.Math.min(bArr.length, j2 - j3) : bArr.length);
            if (i2 == -1) {
                if (hu.A01 != -1) {
                    break;
                }
                hu.A01 = h4.A01 + j3;
                break;
            }
            j3 += (long) i2;
            hu.A02 += (long) i2;
        }
        com.facebook.ads.redexgen.core.IK.A0W(interfaceC0724Gz);
        return j3;
    }

    public static java.lang.String A01(android.net.Uri uri) {
        return uri.toString();
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.H3 h3) {
        return h3.A05 != null ? h3.A05 : A01(h3.A04);
    }

    public static void A03(com.facebook.ads.redexgen.core.H3 h3, com.facebook.ads.redexgen.core.HP hp, com.facebook.ads.redexgen.core.C1121Wp c1121Wp, byte[] bArr, com.facebook.ads.redexgen.core.I8 i8, int i, com.facebook.ads.redexgen.core.HU hu, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.HU hu2 = hu;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(c1121Wp);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(bArr);
        if (hu2 != null) {
            A04(h3, hp, hu2);
        } else {
            hu2 = new com.facebook.ads.redexgen.core.HU();
        }
        java.lang.String strA02 = A02(h3);
        long j = h3.A01;
        long start = h3.A02;
        long start2 = start != -1 ? h3.A02 : hp.A6u(strA02);
        while (true) {
            long j2 = 0;
            if (start2 != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long jA6e = hp.A6e(strA02, j, start2 != -1 ? start2 : Long.MAX_VALUE);
                    if (jA6e <= 0) {
                        long j3 = -jA6e;
                        java.lang.String[] strArr = A00;
                        if (strArr[0].charAt(10) == strArr[6].charAt(10)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A00;
                        strArr2[0] = "77qYVnkdLN0tfKXQgo4rJmGlA7ZctylX";
                        strArr2[6] = "CkGRSfLM0RLyHx4Ni7P5pgRctjE9bwcv";
                        jA6e = j3;
                        if (A00(h3, j, j3, c1121Wp, bArr, i8, i, hu2) < jA6e) {
                            if (!z || start2 == -1) {
                                return;
                            } else {
                                throw new java.io.EOFException();
                            }
                        }
                    }
                    j += jA6e;
                    if (start2 != -1) {
                        j2 = jA6e;
                    }
                    start2 -= j2;
                } else {
                    throw new java.lang.InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.H3 h3, com.facebook.ads.redexgen.core.HP hp, com.facebook.ads.redexgen.core.HU hu) {
        long left;
        java.lang.String strA02 = A02(h3);
        long j = h3.A01;
        if (h3.A02 != -1) {
            left = h3.A02;
        } else {
            left = hp.A6u(strA02);
        }
        hu.A01 = left;
        hu.A00 = 0L;
        hu.A02 = 0L;
        while (left != 0) {
            long jA6e = hp.A6e(strA02, j, left != -1 ? left : Long.MAX_VALUE);
            if (jA6e > 0) {
                hu.A00 += jA6e;
            } else {
                jA6e = -jA6e;
                if (jA6e == Long.MAX_VALUE) {
                    return;
                }
            }
            j += jA6e;
            if (left == -1) {
                jA6e = 0;
            }
            left -= jA6e;
        }
    }

    public static void A05(com.facebook.ads.redexgen.core.HP hp, java.lang.String str) {
        java.util.Iterator<com.facebook.ads.redexgen.core.HT> it = hp.A6f(str).iterator();
        while (it.hasNext()) {
            try {
                hp.AFc(it.next());
            } catch (com.facebook.ads.redexgen.core.HN unused) {
            }
        }
    }
}

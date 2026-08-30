package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fr {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f800a;
        public final java.lang.String[] b;
        public final int c;

        public b(java.lang.String str, java.lang.String[] strArr, int i) {
            this.f800a = str;
            this.b = strArr;
            this.c = i;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f802a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;

        public d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f802a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = z;
            this.j = bArr;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f801a;
        public final int b;
        public final int c;
        public final int d;

        public c(boolean z, int i, int i2, int i3) {
            this.f801a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    private static com.applovin.impl.fr.c[] c(com.applovin.impl.cr crVar) {
        int iA = crVar.a(6) + 1;
        com.applovin.impl.fr.c[] cVarArr = new com.applovin.impl.fr.c[iA];
        for (int i = 0; i < iA; i++) {
            cVarArr[i] = new com.applovin.impl.fr.c(crVar.c(), crVar.a(16), crVar.a(16), crVar.a(8));
        }
        return cVarArr;
    }

    private static void d(com.applovin.impl.cr crVar) throws com.applovin.impl.ch {
        int iA = crVar.a(6) + 1;
        for (int i = 0; i < iA; i++) {
            if (crVar.a(16) <= 2) {
                crVar.b(24);
                crVar.b(24);
                crVar.b(24);
                int iA2 = crVar.a(6) + 1;
                crVar.b(8);
                int[] iArr = new int[iA2];
                for (int i2 = 0; i2 < iA2; i2++) {
                    iArr[i2] = ((crVar.c() ? crVar.a(5) : 0) * 8) + crVar.a(3);
                }
                for (int i3 = 0; i3 < iA2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            crVar.b(8);
                        }
                    }
                }
            } else {
                throw com.applovin.impl.ch.a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    private static void b(com.applovin.impl.cr crVar) throws com.applovin.impl.ch {
        int iA = crVar.a(6) + 1;
        for (int i = 0; i < iA; i++) {
            int iA2 = crVar.a(16);
            if (iA2 == 0) {
                crVar.b(8);
                crVar.b(16);
                crVar.b(16);
                crVar.b(6);
                crVar.b(8);
                int iA3 = crVar.a(4) + 1;
                for (int i2 = 0; i2 < iA3; i2++) {
                    crVar.b(8);
                }
            } else if (iA2 == 1) {
                int iA4 = crVar.a(5);
                int[] iArr = new int[iA4];
                int i3 = -1;
                for (int i4 = 0; i4 < iA4; i4++) {
                    int iA5 = crVar.a(4);
                    iArr[i4] = iA5;
                    if (iA5 > i3) {
                        i3 = iA5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = crVar.a(3) + 1;
                    int iA6 = crVar.a(2);
                    if (iA6 > 0) {
                        crVar.b(8);
                    }
                    for (int i7 = 0; i7 < (1 << iA6); i7++) {
                        crVar.b(8);
                    }
                }
                crVar.b(2);
                int iA7 = crVar.a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iA4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        crVar.b(iA7);
                        i9++;
                    }
                }
            } else {
                throw com.applovin.impl.ch.a("floor type greater than 1 not decodable: " + iA2, null);
            }
        }
    }

    private static long a(long j, long j2) {
        return (long) java.lang.Math.floor(java.lang.Math.pow(j, 1.0d / j2));
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f799a;
        public final int b;
        public final long[] c;
        public final int d;
        public final boolean e;

        public a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f799a = i;
            this.b = i2;
            this.c = jArr;
            this.d = i3;
            this.e = z;
        }
    }

    public static com.applovin.impl.fr.d b(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
        a(1, ahVar, false);
        int iQ = ahVar.q();
        int iW = ahVar.w();
        int iQ2 = ahVar.q();
        int iM = ahVar.m();
        if (iM <= 0) {
            iM = -1;
        }
        int iM2 = ahVar.m();
        if (iM2 <= 0) {
            iM2 = -1;
        }
        int iM3 = ahVar.m();
        if (iM3 <= 0) {
            iM3 = -1;
        }
        int iW2 = ahVar.w();
        return new com.applovin.impl.fr.d(iQ, iW, iQ2, iM, iM2, iM3, (int) java.lang.Math.pow(2.0d, iW2 & 15), (int) java.lang.Math.pow(2.0d, (iW2 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4), (ahVar.w() & 1) > 0, java.util.Arrays.copyOf(ahVar.c(), ahVar.e()));
    }

    private static com.applovin.impl.fr.a a(com.applovin.impl.cr crVar) throws com.applovin.impl.ch {
        if (crVar.a(24) == 5653314) {
            int iA = crVar.a(16);
            int iA2 = crVar.a(24);
            long[] jArr = new long[iA2];
            boolean zC = crVar.c();
            long jA = 0;
            if (!zC) {
                boolean zC2 = crVar.c();
                for (int i = 0; i < iA2; i++) {
                    if (zC2) {
                        if (crVar.c()) {
                            jArr[i] = crVar.a(5) + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        jArr[i] = crVar.a(5) + 1;
                    }
                }
            } else {
                int iA3 = crVar.a(5) + 1;
                int i2 = 0;
                while (i2 < iA2) {
                    int iA4 = crVar.a(a(iA2 - i2));
                    for (int i3 = 0; i3 < iA4 && i2 < iA2; i3++) {
                        jArr[i2] = iA3;
                        i2++;
                    }
                    iA3++;
                }
            }
            int iA5 = crVar.a(4);
            if (iA5 <= 2) {
                if (iA5 == 1 || iA5 == 2) {
                    crVar.b(32);
                    crVar.b(32);
                    int iA6 = crVar.a(4) + 1;
                    crVar.b(1);
                    if (iA5 != 1) {
                        jA = ((long) iA2) * ((long) iA);
                    } else if (iA != 0) {
                        jA = a(iA2, iA);
                    }
                    crVar.b((int) (jA * ((long) iA6)));
                }
                return new com.applovin.impl.fr.a(iA, iA2, jArr, iA5, zC);
            }
            throw com.applovin.impl.ch.a("lookup type greater than 2 not decodable: " + iA5, null);
        }
        throw com.applovin.impl.ch.a("expected code book to start with [0x56, 0x43, 0x42] at " + crVar.b(), null);
    }

    private static void a(int i, com.applovin.impl.cr crVar) throws com.applovin.impl.ch {
        int iA = crVar.a(6) + 1;
        for (int i2 = 0; i2 < iA; i2++) {
            int iA2 = crVar.a(16);
            if (iA2 != 0) {
                com.applovin.impl.oc.b("VorbisUtil", "mapping type other than 0 not supported: " + iA2);
            } else {
                int iA3 = crVar.c() ? crVar.a(4) + 1 : 1;
                if (crVar.c()) {
                    int iA4 = crVar.a(8) + 1;
                    for (int i3 = 0; i3 < iA4; i3++) {
                        int i4 = i - 1;
                        crVar.b(a(i4));
                        crVar.b(a(i4));
                    }
                }
                if (crVar.a(2) != 0) {
                    throw com.applovin.impl.ch.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iA3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        crVar.b(4);
                    }
                }
                for (int i6 = 0; i6 < iA3; i6++) {
                    crVar.b(8);
                    crVar.b(8);
                    crVar.b(8);
                }
            }
        }
    }

    public static com.applovin.impl.fr.b a(com.applovin.impl.ah ahVar) {
        return a(ahVar, true, true);
    }

    public static com.applovin.impl.fr.b a(com.applovin.impl.ah ahVar, boolean z, boolean z2) throws com.applovin.impl.ch {
        if (z) {
            a(3, ahVar, false);
        }
        java.lang.String strC = ahVar.c((int) ahVar.p());
        int length = strC.length();
        long jP = ahVar.p();
        java.lang.String[] strArr = new java.lang.String[(int) jP];
        int length2 = length + 15;
        for (int i = 0; i < jP; i++) {
            java.lang.String strC2 = ahVar.c((int) ahVar.p());
            strArr[i] = strC2;
            length2 = length2 + 4 + strC2.length();
        }
        if (z2 && (ahVar.w() & 1) == 0) {
            throw com.applovin.impl.ch.a("framing bit expected to be set", null);
        }
        return new com.applovin.impl.fr.b(strC, strArr, length2 + 1);
    }

    public static com.applovin.impl.fr.c[] a(com.applovin.impl.ah ahVar, int i) throws com.applovin.impl.ch {
        a(5, ahVar, false);
        int iW = ahVar.w() + 1;
        com.applovin.impl.cr crVar = new com.applovin.impl.cr(ahVar.c());
        crVar.b(ahVar.d() * 8);
        for (int i2 = 0; i2 < iW; i2++) {
            a(crVar);
        }
        int iA = crVar.a(6) + 1;
        for (int i3 = 0; i3 < iA; i3++) {
            if (crVar.a(16) != 0) {
                throw com.applovin.impl.ch.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        b(crVar);
        d(crVar);
        a(i, crVar);
        com.applovin.impl.fr.c[] cVarArrC = c(crVar);
        if (crVar.c()) {
            return cVarArrC;
        }
        throw com.applovin.impl.ch.a("framing bit after modes not set as expected", null);
    }

    public static boolean a(int i, com.applovin.impl.ah ahVar, boolean z) throws com.applovin.impl.ch {
        if (ahVar.a() < 7) {
            if (z) {
                return false;
            }
            throw com.applovin.impl.ch.a("too short header: " + ahVar.a(), null);
        }
        if (ahVar.w() != i) {
            if (z) {
                return false;
            }
            throw com.applovin.impl.ch.a("expected header type " + java.lang.Integer.toHexString(i), null);
        }
        if (ahVar.w() == 118 && ahVar.w() == 111 && ahVar.w() == 114 && ahVar.w() == 98 && ahVar.w() == 105 && ahVar.w() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw com.applovin.impl.ch.a("expected characters 'vorbis'", null);
    }
}

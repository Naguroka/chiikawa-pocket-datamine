package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f937a = com.applovin.impl.xp.c("OpusHead");

    private interface b {
        int a();

        int b();

        int c();
    }

    private static int a(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static long e(com.applovin.impl.ah ahVar) {
        ahVar.f(8);
        ahVar.g(com.applovin.impl.j1.c(ahVar.j()) != 0 ? 16 : 8);
        return ahVar.y();
    }

    private static com.applovin.impl.k1.f f(com.applovin.impl.ah ahVar) {
        long j;
        ahVar.f(8);
        int iC = com.applovin.impl.j1.c(ahVar.j());
        ahVar.g(iC == 0 ? 8 : 16);
        int iJ = ahVar.j();
        ahVar.g(4);
        int iD = ahVar.d();
        int i = iC == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = androidx.media3.common.C.TIME_UNSET;
            if (i3 < i) {
                if (ahVar.c()[iD + i3] != -1) {
                    long jY = iC == 0 ? ahVar.y() : ahVar.B();
                    if (jY == 0) {
                        break;
                    }
                    j = jY;
                    break;
                }
                i3++;
            } else {
                ahVar.g(i);
                break;
            }
        }
        ahVar.g(16);
        int iJ2 = ahVar.j();
        int iJ3 = ahVar.j();
        ahVar.g(4);
        int iJ4 = ahVar.j();
        int iJ5 = ahVar.j();
        if (iJ2 == 0 && iJ3 == 65536 && iJ4 == -65536 && iJ5 == 0) {
            i2 = 90;
        } else if (iJ2 == 0 && iJ3 == -65536 && iJ4 == 65536 && iJ5 == 0) {
            i2 = 270;
        } else if (iJ2 == -65536 && iJ3 == 0 && iJ4 == 0 && iJ5 == -65536) {
            i2 = org.objectweb.asm.Opcodes.GETFIELD;
        }
        return new com.applovin.impl.k1.f(iJ, j, i2);
    }

    private static int c(com.applovin.impl.ah ahVar) {
        ahVar.f(16);
        return ahVar.j();
    }

    private static android.util.Pair d(com.applovin.impl.ah ahVar) {
        ahVar.f(8);
        int iC = com.applovin.impl.j1.c(ahVar.j());
        ahVar.g(iC == 0 ? 8 : 16);
        long jY = ahVar.y();
        ahVar.g(iC == 0 ? 4 : 8);
        int iC2 = ahVar.C();
        return android.util.Pair.create(java.lang.Long.valueOf(jY), "" + ((char) (((iC2 >> 10) & 31) + 96)) + ((char) (((iC2 >> 5) & 31) + 96)) + ((char) ((iC2 & 31) + 96)));
    }

    private static com.applovin.impl.af e(com.applovin.impl.ah ahVar, int i) {
        ahVar.g(8);
        a(ahVar);
        while (ahVar.d() < i) {
            int iD = ahVar.d();
            int iJ = ahVar.j();
            if (ahVar.j() == 1768715124) {
                ahVar.f(iD);
                return b(ahVar, iD + iJ);
            }
            ahVar.f(iD + iJ);
        }
        return null;
    }

    static android.util.Pair b(com.applovin.impl.ah ahVar, int i, int i2) throws com.applovin.impl.ch {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        java.lang.String strC = null;
        java.lang.Integer numValueOf = null;
        while (i3 - i < i2) {
            ahVar.f(i3);
            int iJ = ahVar.j();
            int iJ2 = ahVar.j();
            if (iJ2 == 1718775137) {
                numValueOf = java.lang.Integer.valueOf(ahVar.j());
            } else if (iJ2 == 1935894637) {
                ahVar.g(4);
                strC = ahVar.c(4);
            } else if (iJ2 == 1935894633) {
                i4 = i3;
                i5 = iJ;
            }
            i3 += iJ;
        }
        if (!androidx.media3.common.C.CENC_TYPE_cenc.equals(strC) && !androidx.media3.common.C.CENC_TYPE_cbc1.equals(strC) && !androidx.media3.common.C.CENC_TYPE_cens.equals(strC) && !androidx.media3.common.C.CENC_TYPE_cbcs.equals(strC)) {
            return null;
        }
        com.applovin.impl.m8.a(numValueOf != null, "frma atom is mandatory");
        com.applovin.impl.m8.a(i4 != -1, "schi atom is mandatory");
        com.applovin.impl.mo moVarA = a(ahVar, i4, i5, strC);
        com.applovin.impl.m8.a(moVarA != null, "tenc atom is mandatory");
        return android.util.Pair.create(numValueOf, (com.applovin.impl.mo) com.applovin.impl.xp.a(moVarA));
    }

    private static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[com.applovin.impl.xp.a(4, 0, length)] && jArr[com.applovin.impl.xp.a(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f938a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final com.applovin.impl.ah f;
        private final com.applovin.impl.ah g;
        private int h;
        private int i;

        public a(com.applovin.impl.ah ahVar, com.applovin.impl.ah ahVar2, boolean z) throws com.applovin.impl.ch {
            this.g = ahVar;
            this.f = ahVar2;
            this.e = z;
            ahVar2.f(12);
            this.f938a = ahVar2.A();
            ahVar.f(12);
            this.i = ahVar.A();
            com.applovin.impl.m8.a(ahVar.j() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            long jY;
            int i = this.b + 1;
            this.b = i;
            if (i == this.f938a) {
                return false;
            }
            if (this.e) {
                jY = this.f.B();
            } else {
                jY = this.f.y();
            }
            this.d = jY;
            if (this.b == this.h) {
                this.c = this.g.A();
                this.g.g(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.A() - 1 : -1;
            }
            return true;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f942a;
        private final long b;
        private final int c;

        public f(int i, long j, int i2) {
            this.f942a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.mo[] f939a;
        public com.applovin.impl.e9 b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.f939a = new com.applovin.impl.mo[i];
        }
    }

    static final class d implements com.applovin.impl.k1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f940a;
        private final int b;
        private final com.applovin.impl.ah c;

        public d(com.applovin.impl.j1.b bVar, com.applovin.impl.e9 e9Var) {
            com.applovin.impl.ah ahVar = bVar.b;
            this.c = ahVar;
            ahVar.f(12);
            int iA = ahVar.A();
            if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(e9Var.m)) {
                int iB = com.applovin.impl.xp.b(e9Var.B, e9Var.z);
                if (iA == 0 || iA % iB != 0) {
                    com.applovin.impl.oc.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iA);
                    iA = iB;
                }
            }
            this.f940a = iA == 0 ? -1 : iA;
            this.b = ahVar.A();
        }

        @Override // com.applovin.impl.k1.b
        public int b() {
            return this.b;
        }

        @Override // com.applovin.impl.k1.b
        public int a() {
            return this.f940a;
        }

        @Override // com.applovin.impl.k1.b
        public int c() {
            int i = this.f940a;
            return i == -1 ? this.c.A() : i;
        }
    }

    static final class e implements com.applovin.impl.k1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.ah f941a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        @Override // com.applovin.impl.k1.b
        public int a() {
            return -1;
        }

        public e(com.applovin.impl.j1.b bVar) {
            com.applovin.impl.ah ahVar = bVar.b;
            this.f941a = ahVar;
            ahVar.f(12);
            this.c = ahVar.A() & 255;
            this.b = ahVar.A();
        }

        @Override // com.applovin.impl.k1.b
        public int b() {
            return this.b;
        }

        @Override // com.applovin.impl.k1.b
        public int c() {
            int i = this.c;
            if (i == 8) {
                return this.f941a.w();
            }
            if (i == 16) {
                return this.f941a.C();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int iW = this.f941a.w();
                this.e = iW;
                return (iW & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.e & 15;
        }
    }

    private static float c(com.applovin.impl.ah ahVar, int i) {
        ahVar.f(i + 8);
        return ahVar.A() / ahVar.A();
    }

    private static android.util.Pair d(com.applovin.impl.ah ahVar, int i, int i2) throws com.applovin.impl.ch {
        android.util.Pair pairB;
        int iD = ahVar.d();
        while (iD - i < i2) {
            ahVar.f(iD);
            int iJ = ahVar.j();
            com.applovin.impl.m8.a(iJ > 0, "childAtomSize must be positive");
            if (ahVar.j() == 1936289382 && (pairB = b(ahVar, iD, iJ)) != null) {
                return pairB;
            }
            iD += iJ;
        }
        return null;
    }

    private static int a(com.applovin.impl.ah ahVar, int i, int i2) throws com.applovin.impl.ch {
        int iD = ahVar.d();
        while (iD - i < i2) {
            ahVar.f(iD);
            int iJ = ahVar.j();
            com.applovin.impl.m8.a(iJ > 0, "childAtomSize must be positive");
            if (ahVar.j() == 1702061171) {
                return iD;
            }
            iD += iJ;
        }
        return -1;
    }

    private static com.applovin.impl.af d(com.applovin.impl.ah ahVar, int i) {
        ahVar.g(12);
        while (ahVar.d() < i) {
            int iD = ahVar.d();
            int iJ = ahVar.j();
            if (ahVar.j() == 1935766900) {
                if (iJ < 14) {
                    return null;
                }
                ahVar.g(5);
                int iW = ahVar.w();
                if (iW != 12 && iW != 13) {
                    return null;
                }
                float f2 = iW == 12 ? 240.0f : 120.0f;
                ahVar.g(1);
                return new com.applovin.impl.af(new com.applovin.impl.kk(f2, ahVar.w()));
            }
            ahVar.f(iD + iJ);
        }
        return null;
    }

    private static int b(com.applovin.impl.ah ahVar) {
        int iW = ahVar.w();
        int i = iW & 127;
        while ((iW & 128) == 128) {
            iW = ahVar.w();
            i = (i << 7) | (iW & 127);
        }
        return i;
    }

    public static void a(com.applovin.impl.ah ahVar) {
        int iD = ahVar.d();
        ahVar.g(4);
        if (ahVar.j() != 1751411826) {
            iD += 4;
        }
        ahVar.f(iD);
    }

    private static byte[] c(com.applovin.impl.ah ahVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            ahVar.f(i3);
            int iJ = ahVar.j();
            if (ahVar.j() == 1886547818) {
                return java.util.Arrays.copyOfRange(ahVar.c(), i3, iJ + i3);
            }
            i3 += iJ;
        }
        return null;
    }

    private static com.applovin.impl.af b(com.applovin.impl.ah ahVar, int i) {
        ahVar.g(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (ahVar.d() < i) {
            com.applovin.impl.af.b bVarB = com.applovin.impl.gf.b(ahVar);
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.impl.af(arrayList);
    }

    public static com.applovin.impl.af b(com.applovin.impl.j1.a aVar) {
        com.applovin.impl.j1.b bVarE = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_hdlr);
        com.applovin.impl.j1.b bVarE2 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_keys);
        com.applovin.impl.j1.b bVarE3 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_ilst);
        if (bVarE == null || bVarE2 == null || bVarE3 == null || c(bVarE.b) != 1835299937) {
            return null;
        }
        com.applovin.impl.ah ahVar = bVarE2.b;
        ahVar.f(12);
        int iJ = ahVar.j();
        java.lang.String[] strArr = new java.lang.String[iJ];
        for (int i = 0; i < iJ; i++) {
            int iJ2 = ahVar.j();
            ahVar.g(4);
            strArr[i] = ahVar.c(iJ2 - 8);
        }
        com.applovin.impl.ah ahVar2 = bVarE3.b;
        ahVar2.f(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (ahVar2.a() > 8) {
            int iD = ahVar2.d();
            int iJ3 = ahVar2.j();
            int iJ4 = ahVar2.j() - 1;
            if (iJ4 >= 0 && iJ4 < iJ) {
                com.applovin.impl.ed edVarA = com.applovin.impl.gf.a(ahVar2, iD + iJ3, strArr[iJ4]);
                if (edVarA != null) {
                    arrayList.add(edVarA);
                }
            } else {
                com.applovin.impl.oc.d("AtomParsers", "Skipped metadata with unknown key index: " + iJ4);
            }
            ahVar2.f(iD + iJ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.impl.af(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015b  */
    /* JADX WARN: Code duplicated, block: B:105:0x016a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0185  */
    /* JADX WARN: Code duplicated, block: B:137:0x0280  */
    /* JADX WARN: Code duplicated, block: B:139:0x028a  */
    /* JADX WARN: Code duplicated, block: B:140:0x028c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0293  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0151  */
    private static void a(com.applovin.impl.ah ahVar, int i, int i2, int i3, int i4, java.lang.String str, boolean z, com.applovin.impl.x6 x6Var, com.applovin.impl.k1.c cVar, int i5) throws com.applovin.impl.ch {
        int iC;
        int iX;
        int iA;
        com.applovin.impl.x6 x6VarA;
        java.lang.String str2;
        java.lang.String str3;
        int i6;
        java.lang.String str4;
        java.lang.String str5;
        java.util.List listA;
        int iJ;
        int iJ2;
        int iA2;
        byte[] bArr;
        java.util.List listA2;
        int i7 = i2;
        int i8 = i3;
        ahVar.f(i7 + 16);
        if (z) {
            iC = ahVar.C();
            ahVar.g(6);
        } else {
            ahVar.g(8);
            iC = 0;
        }
        boolean z2 = true;
        if (iC == 0 || iC == 1) {
            int iC2 = ahVar.C();
            ahVar.g(6);
            iX = ahVar.x();
            if (iC == 1) {
                ahVar.g(16);
            }
            iA = iC2;
        } else {
            if (iC != 2) {
                return;
            }
            ahVar.g(16);
            iX = (int) java.lang.Math.round(ahVar.h());
            iA = ahVar.A();
            ahVar.g(20);
        }
        int iD = ahVar.d();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            android.util.Pair pairD = d(ahVar, i7, i8);
            if (pairD != null) {
                iIntValue = ((java.lang.Integer) pairD.first).intValue();
                x6VarA = x6Var == null ? null : x6Var.a(((com.applovin.impl.mo) pairD.second).b);
                cVar.f939a[i5] = (com.applovin.impl.mo) pairD.second;
            } else {
                x6VarA = x6Var;
            }
            ahVar.f(iD);
        } else {
            x6VarA = x6Var;
        }
        if (iIntValue == 1633889587) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_AC4;
        } else if (iIntValue == 1685353315) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_DTS_X;
        } else if (iIntValue == 1935764850) {
            str2 = androidx.media3.common.MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue != 1935767394) {
                str3 = androidx.media3.common.MimeTypes.AUDIO_RAW;
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i6 = 2;
                } else if (iIntValue == 1953984371) {
                    i6 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHA1;
                } else if (iIntValue == 1835560241) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1;
                } else if (iIntValue == 1634492771) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_ALAC;
                } else if (iIntValue == 1634492791) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_ALAW;
                } else if (iIntValue == 1970037111) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MLAW;
                } else if (iIntValue == 1332770163) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_OPUS;
                } else if (iIntValue == 1716281667) {
                    str2 = androidx.media3.common.MimeTypes.AUDIO_FLAC;
                } else {
                    i6 = -1;
                    str3 = null;
                }
                str4 = str3;
                str5 = null;
                listA = null;
                while (iD - i7 < i8) {
                    ahVar.f(iD);
                    iJ = ahVar.j();
                    if (iJ <= 0) {
                        z2 = false;
                    }
                    com.applovin.impl.m8.a(z2, "childAtomSize must be positive");
                    iJ2 = ahVar.j();
                    if (iJ2 == 1835557187) {
                        int i9 = iJ - 13;
                        byte[] bArr2 = new byte[i9];
                        ahVar.f(iD + 13);
                        ahVar.a(bArr2, 0, i9);
                        listA2 = com.applovin.impl.db.a(bArr2);
                    } else {
                        if (iJ2 != 1702061171 || (z && iJ2 == 2002876005)) {
                            z2 = true;
                            if (iJ2 == 1702061171) {
                                iA2 = iD;
                            } else {
                                iA2 = a(ahVar, iD, iJ);
                            }
                            if (iA2 != -1) {
                                android.util.Pair pairA = a(ahVar, iA2);
                                str4 = (java.lang.String) pairA.first;
                                bArr = (byte[]) pairA.second;
                                if (bArr != null) {
                                    if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str4)) {
                                        com.applovin.impl.a.b bVarA = com.applovin.impl.a.a(bArr);
                                        iX = bVarA.f574a;
                                        iA = bVarA.b;
                                        str5 = bVarA.c;
                                    }
                                    listA = com.applovin.impl.db.a(bArr);
                                }
                            }
                        } else {
                            if (iJ2 == 1684103987) {
                                ahVar.f(iD + 8);
                                cVar.b = com.applovin.impl.k.a(ahVar, java.lang.Integer.toString(i4), str, x6VarA);
                            } else if (iJ2 == 1684366131) {
                                ahVar.f(iD + 8);
                                cVar.b = com.applovin.impl.k.b(ahVar, java.lang.Integer.toString(i4), str, x6VarA);
                            } else if (iJ2 == 1684103988) {
                                ahVar.f(iD + 8);
                                cVar.b = com.applovin.impl.n.a(ahVar, java.lang.Integer.toString(i4), str, x6VarA);
                            } else if (iJ2 == 1684305011) {
                                cVar.b = new com.applovin.impl.e9.b().h(i4).f(str4).c(iA).n(iX).a(x6VarA).e(str).a();
                            } else if (iJ2 == 1682927731) {
                                int i10 = iJ - 8;
                                byte[] bArr3 = f937a;
                                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr3, bArr3.length + i10);
                                ahVar.f(iD + 8);
                                ahVar.a(bArrCopyOf, bArr3.length, i10);
                                listA2 = com.applovin.impl.tg.a(bArrCopyOf);
                            } else if (iJ2 == 1684425825) {
                                byte[] bArr4 = new byte[iJ - 8];
                                bArr4[0] = 102;
                                z2 = true;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                ahVar.f(iD + 12);
                                ahVar.a(bArr4, 4, iJ - 12);
                                listA = com.applovin.impl.db.a(bArr4);
                            } else {
                                z2 = true;
                                if (iJ2 == 1634492771) {
                                    int i11 = iJ - 12;
                                    byte[] bArr5 = new byte[i11];
                                    ahVar.f(iD + 12);
                                    ahVar.a(bArr5, 0, i11);
                                    android.util.Pair pairA2 = com.applovin.impl.o3.a(bArr5);
                                    int iIntValue2 = ((java.lang.Integer) pairA2.first).intValue();
                                    int iIntValue3 = ((java.lang.Integer) pairA2.second).intValue();
                                    listA = com.applovin.impl.db.a(bArr5);
                                    iX = iIntValue2;
                                    iA = iIntValue3;
                                }
                            }
                            z2 = true;
                        }
                        iD += iJ;
                        i7 = i2;
                        i8 = i3;
                    }
                    listA = listA2;
                    z2 = true;
                    iD += iJ;
                    i7 = i2;
                    i8 = i3;
                }
                if (cVar.b == null || str4 == null) {
                }
                cVar.b = new com.applovin.impl.e9.b().h(i4).f(str4).a(str5).c(iA).n(iX).j(i6).a(listA).a(x6VarA).e(str).a();
                return;
            }
            str2 = androidx.media3.common.MimeTypes.AUDIO_AMR_WB;
        }
        str3 = str2;
        i6 = -1;
        str4 = str3;
        str5 = null;
        listA = null;
        while (iD - i7 < i8) {
            ahVar.f(iD);
            iJ = ahVar.j();
            if (iJ <= 0) {
                z2 = false;
            }
            com.applovin.impl.m8.a(z2, "childAtomSize must be positive");
            iJ2 = ahVar.j();
            if (iJ2 == 1835557187) {
                int i12 = iJ - 13;
                byte[] bArr6 = new byte[i12];
                ahVar.f(iD + 13);
                ahVar.a(bArr6, 0, i12);
                listA2 = com.applovin.impl.db.a(bArr6);
            } else {
                if (iJ2 != 1702061171) {
                    z2 = true;
                    if (iJ2 == 1702061171) {
                        iA2 = iD;
                    } else {
                        iA2 = a(ahVar, iD, iJ);
                    }
                    if (iA2 != -1) {
                        android.util.Pair pairA3 = a(ahVar, iA2);
                        str4 = (java.lang.String) pairA3.first;
                        bArr = (byte[]) pairA3.second;
                        if (bArr != null) {
                            if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str4)) {
                                com.applovin.impl.a.b bVarA2 = com.applovin.impl.a.a(bArr);
                                iX = bVarA2.f574a;
                                iA = bVarA2.b;
                                str5 = bVarA2.c;
                            }
                            listA = com.applovin.impl.db.a(bArr);
                        }
                    }
                } else {
                    z2 = true;
                    if (iJ2 == 1702061171) {
                        iA2 = iD;
                    } else {
                        iA2 = a(ahVar, iD, iJ);
                    }
                    if (iA2 != -1) {
                        android.util.Pair pairA4 = a(ahVar, iA2);
                        str4 = (java.lang.String) pairA4.first;
                        bArr = (byte[]) pairA4.second;
                        if (bArr != null) {
                            if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str4)) {
                                com.applovin.impl.a.b bVarA3 = com.applovin.impl.a.a(bArr);
                                iX = bVarA3.f574a;
                                iA = bVarA3.b;
                                str5 = bVarA3.c;
                            }
                            listA = com.applovin.impl.db.a(bArr);
                        }
                    }
                }
                iD += iJ;
                i7 = i2;
                i8 = i3;
            }
            listA = listA2;
            z2 = true;
            iD += iJ;
            i7 = i2;
            i8 = i3;
        }
        if (cVar.b == null) {
        }
    }

    private static android.util.Pair a(com.applovin.impl.j1.a aVar) {
        com.applovin.impl.j1.b bVarE = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_elst);
        if (bVarE == null) {
            return null;
        }
        com.applovin.impl.ah ahVar = bVarE.b;
        ahVar.f(8);
        int iC = com.applovin.impl.j1.c(ahVar.j());
        int iA = ahVar.A();
        long[] jArr = new long[iA];
        long[] jArr2 = new long[iA];
        for (int i = 0; i < iA; i++) {
            jArr[i] = iC == 1 ? ahVar.B() : ahVar.y();
            jArr2[i] = iC == 1 ? ahVar.s() : ahVar.j();
            if (ahVar.u() == 1) {
                ahVar.g(2);
            } else {
                throw new java.lang.IllegalArgumentException("Unsupported media rate.");
            }
        }
        return android.util.Pair.create(jArr, jArr2);
    }

    private static android.util.Pair a(com.applovin.impl.ah ahVar, int i) {
        ahVar.f(i + 12);
        ahVar.g(1);
        b(ahVar);
        ahVar.g(2);
        int iW = ahVar.w();
        if ((iW & 128) != 0) {
            ahVar.g(2);
        }
        if ((iW & 64) != 0) {
            ahVar.g(ahVar.C());
        }
        if ((iW & 32) != 0) {
            ahVar.g(2);
        }
        ahVar.g(1);
        b(ahVar);
        java.lang.String strA = com.applovin.impl.hf.a(ahVar.w());
        if (!androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(strA) && !androidx.media3.common.MimeTypes.AUDIO_DTS.equals(strA) && !androidx.media3.common.MimeTypes.AUDIO_DTS_HD.equals(strA)) {
            ahVar.g(12);
            ahVar.g(1);
            int iB = b(ahVar);
            byte[] bArr = new byte[iB];
            ahVar.a(bArr, 0, iB);
            return android.util.Pair.create(strA, bArr);
        }
        return android.util.Pair.create(strA, null);
    }

    private static void a(com.applovin.impl.ah ahVar, int i, int i2, int i3, com.applovin.impl.k1.c cVar) {
        ahVar.f(i2 + 16);
        if (i == 1835365492) {
            ahVar.t();
            java.lang.String strT = ahVar.t();
            if (strT != null) {
                cVar.b = new com.applovin.impl.e9.b().h(i3).f(strT).a();
            }
        }
    }

    private static com.applovin.impl.mo a(com.applovin.impl.ah ahVar, int i, int i2, java.lang.String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            ahVar.f(i5);
            int iJ = ahVar.j();
            if (ahVar.j() == 1952804451) {
                int iC = com.applovin.impl.j1.c(ahVar.j());
                ahVar.g(1);
                if (iC == 0) {
                    ahVar.g(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iW = ahVar.w();
                    i3 = iW & 15;
                    i4 = (iW & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z = ahVar.w() == 1;
                int iW2 = ahVar.w();
                byte[] bArr2 = new byte[16];
                ahVar.a(bArr2, 0, 16);
                if (z && iW2 == 0) {
                    int iW3 = ahVar.w();
                    bArr = new byte[iW3];
                    ahVar.a(bArr, 0, iW3);
                }
                return new com.applovin.impl.mo(z, str, iW2, bArr2, i4, i3, bArr);
            }
            i5 += iJ;
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:156:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x041a  */
    /* JADX WARN: Code duplicated, block: B:165:0x041c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0420  */
    /* JADX WARN: Code duplicated, block: B:171:0x043b  */
    /* JADX WARN: Code duplicated, block: B:172:0x043d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0442  */
    /* JADX WARN: Code duplicated, block: B:176:0x0445  */
    /* JADX WARN: Code duplicated, block: B:178:0x0448  */
    /* JADX WARN: Code duplicated, block: B:179:0x044b  */
    /* JADX WARN: Code duplicated, block: B:181:0x044e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0450  */
    /* JADX WARN: Code duplicated, block: B:184:0x0454  */
    /* JADX WARN: Code duplicated, block: B:185:0x0457  */
    /* JADX WARN: Code duplicated, block: B:189:0x0466  */
    /* JADX WARN: Code duplicated, block: B:191:0x0474  */
    /* JADX WARN: Code duplicated, block: B:192:0x0484  */
    /* JADX WARN: Code duplicated, block: B:195:0x048c  */
    /* JADX WARN: Code duplicated, block: B:208:0x0431 A[EDGE_INSN: B:208:0x0431->B:169:0x0431 BREAK  A[LOOP:2: B:152:0x03ce->B:168:0x0429], SYNTHETIC] */
    private static com.applovin.impl.ro a(com.applovin.impl.lo loVar, com.applovin.impl.j1.a aVar, com.applovin.impl.y9 y9Var) throws com.applovin.impl.ch {
        com.applovin.impl.k1.b eVar;
        boolean z;
        int iA;
        int iA2;
        int iA3;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        com.applovin.impl.lo loVar2;
        int i5;
        long[] jArr;
        int[] iArr;
        int i6;
        long j;
        long[] jArr2;
        int[] iArr2;
        int iJ;
        int i7;
        int i8;
        int i9;
        long[] jArr3;
        boolean z3;
        int[] iArr3;
        int[] iArr4;
        long[] jArr4;
        int i10;
        int i11;
        boolean z4;
        int i12;
        long[] jArr5;
        long[] jArr6;
        int[] iArr5;
        int i13;
        boolean z5;
        boolean z6;
        long[] jArr7;
        int[] iArr6;
        int i14;
        int[] iArr7;
        long[] jArr8;
        int i15;
        int[] iArr8;
        long j2;
        int i16;
        long j3;
        int i17;
        int i18;
        int[] iArr9;
        long j4;
        boolean z7;
        boolean z8;
        int i19;
        int i20;
        int i21;
        boolean z9;
        com.applovin.impl.j1.b bVarE = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_stsz);
        if (bVarE != null) {
            eVar = new com.applovin.impl.k1.d(bVarE, loVar.f);
        } else {
            com.applovin.impl.j1.b bVarE2 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_stz2);
            if (bVarE2 != null) {
                eVar = new com.applovin.impl.k1.e(bVarE2);
            } else {
                throw com.applovin.impl.ch.a("Track has no sample table size information", null);
            }
        }
        int iB = eVar.b();
        if (iB == 0) {
            return new com.applovin.impl.ro(loVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        com.applovin.impl.j1.b bVarE3 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_stco);
        if (bVarE3 == null) {
            bVarE3 = (com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_co64));
            z = true;
        } else {
            z = false;
        }
        com.applovin.impl.ah ahVar = bVarE3.b;
        com.applovin.impl.ah ahVar2 = ((com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_stsc))).b;
        com.applovin.impl.ah ahVar3 = ((com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_stts))).b;
        com.applovin.impl.j1.b bVarE4 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_stss);
        com.applovin.impl.ah ahVar4 = bVarE4 != null ? bVarE4.b : null;
        com.applovin.impl.j1.b bVarE5 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_ctts);
        com.applovin.impl.ah ahVar5 = bVarE5 != null ? bVarE5.b : null;
        com.applovin.impl.k1.a aVar2 = new com.applovin.impl.k1.a(ahVar2, ahVar, z);
        ahVar3.f(12);
        int iA4 = ahVar3.A() - 1;
        int iA5 = ahVar3.A();
        int iA6 = ahVar3.A();
        if (ahVar5 != null) {
            ahVar5.f(12);
            iA = ahVar5.A();
        } else {
            iA = 0;
        }
        if (ahVar4 != null) {
            ahVar4.f(12);
            iA3 = ahVar4.A();
            if (iA3 > 0) {
                iA2 = ahVar4.A() - 1;
            } else {
                iA2 = -1;
                ahVar4 = null;
            }
        } else {
            iA2 = -1;
            iA3 = 0;
        }
        int iA7 = eVar.a();
        java.lang.String str = loVar.f.m;
        if (iA7 != -1 && (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(str) || androidx.media3.common.MimeTypes.AUDIO_MLAW.equals(str) || androidx.media3.common.MimeTypes.AUDIO_ALAW.equals(str)) && iA4 == 0 && iA == 0 && iA3 == 0) {
            int i22 = aVar2.f938a;
            long[] jArr9 = new long[i22];
            int[] iArr10 = new int[i22];
            while (aVar2.a()) {
                int i23 = aVar2.b;
                jArr9[i23] = aVar2.d;
                iArr10[i23] = aVar2.c;
            }
            com.applovin.impl.r8.b bVarA = com.applovin.impl.r8.a(iA7, jArr9, iArr10, iA6);
            long[] jArr10 = bVarA.f1222a;
            int[] iArr11 = bVarA.b;
            int i24 = bVarA.c;
            long[] jArr11 = bVarA.d;
            int[] iArr12 = bVarA.e;
            long j5 = bVarA.f;
            loVar2 = loVar;
            i5 = iB;
            jArr = jArr10;
            iArr = iArr11;
            i6 = i24;
            iArr2 = iArr12;
            j = j5;
            jArr2 = jArr11;
        } else {
            long[] jArrCopyOf = new long[iB];
            int[] iArrCopyOf = new int[iB];
            long[] jArrCopyOf2 = new long[iB];
            int[] iArrCopyOf2 = new int[iB];
            int iA8 = iA2;
            int i25 = 0;
            int i26 = 0;
            int iJ2 = 0;
            int i27 = 0;
            int iA9 = 0;
            long j6 = 0;
            long j7 = 0;
            int i28 = iA;
            int i29 = iA6;
            int i30 = iA5;
            int i31 = iA4;
            int i32 = iA3;
            while (true) {
                i = i31;
                if (i25 >= iB) {
                    i2 = i30;
                    i3 = i27;
                    break;
                }
                long j8 = j7;
                int i33 = i27;
                boolean zA = true;
                while (i33 == 0) {
                    zA = aVar2.a();
                    if (!zA) {
                        break;
                    }
                    int i34 = i30;
                    long j9 = aVar2.d;
                    i33 = aVar2.c;
                    j8 = j9;
                    i30 = i34;
                    i29 = i29;
                    iB = iB;
                }
                int i35 = iB;
                i2 = i30;
                int i36 = i29;
                if (!zA) {
                    com.applovin.impl.oc.d("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i25);
                    iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i25);
                    jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i25);
                    iArrCopyOf2 = java.util.Arrays.copyOf(iArrCopyOf2, i25);
                    iB = i25;
                    i3 = i33;
                    break;
                }
                if (ahVar5 != null) {
                    while (iA9 == 0 && i28 > 0) {
                        iA9 = ahVar5.A();
                        iJ2 = ahVar5.j();
                        i28--;
                    }
                    iA9--;
                }
                int i37 = iJ2;
                jArrCopyOf[i25] = j8;
                int iC = eVar.c();
                iArrCopyOf[i25] = iC;
                if (iC > i26) {
                    i26 = iC;
                }
                jArrCopyOf2[i25] = j6 + ((long) i37);
                iArrCopyOf2[i25] = ahVar4 == null ? 1 : 0;
                if (i25 == iA8) {
                    iArrCopyOf2[i25] = 1;
                    i32--;
                    if (i32 > 0) {
                        iA8 = ((com.applovin.impl.ah) com.applovin.impl.b1.a(ahVar4)).A() - 1;
                    }
                }
                int i38 = iA8;
                j6 += (long) i36;
                int iA10 = i2 - 1;
                if (iA10 != 0 || i <= 0) {
                    iJ = i36;
                    i7 = i;
                } else {
                    iA10 = ahVar3.A();
                    iJ = ahVar3.j();
                    i7 = i - 1;
                }
                int i39 = iA10;
                long j10 = j8 + ((long) iArrCopyOf[i25]);
                i27 = i33 - 1;
                i25++;
                j7 = j10;
                iA8 = i38;
                i29 = iJ;
                iB = i35;
                iJ2 = i37;
                i31 = i7;
                i30 = i39;
            }
            long j11 = j6 + ((long) iJ2);
            if (ahVar5 == null) {
                z2 = true;
                break;
            }
            while (true) {
                if (i28 <= 0) {
                    z2 = true;
                    break;
                }
                if (ahVar5.A() != 0) {
                    z2 = false;
                    break;
                }
                ahVar5.j();
                i28--;
            }
            if (i32 == 0 && i2 == 0 && i3 == 0 && i == 0) {
                i4 = iA9;
                if (i4 == 0 && z2) {
                    loVar2 = loVar;
                }
                i5 = iB;
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                i6 = i26;
                j = j11;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
            } else {
                i4 = iA9;
            }
            loVar2 = loVar;
            com.applovin.impl.oc.d("AtomParsers", "Inconsistent stbl box for track " + loVar2.f997a + ": remainingSynchronizationSamples " + i32 + ", remainingSamplesAtTimestampDelta " + i2 + ", remainingSamplesInChunk " + i3 + ", remainingTimestampDeltaChanges " + i + ", remainingSamplesAtTimestampOffset " + i4 + (!z2 ? ", ctts invalid" : ""));
            i5 = iB;
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            i6 = i26;
            j = j11;
            jArr2 = jArrCopyOf2;
            iArr2 = iArrCopyOf2;
        }
        long jC = com.applovin.impl.xp.c(j, 1000000L, loVar2.c);
        long[] jArr12 = loVar2.h;
        if (jArr12 == null) {
            com.applovin.impl.xp.a(jArr2, 1000000L, loVar2.c);
            return new com.applovin.impl.ro(loVar, jArr, iArr, i6, jArr2, iArr2, jC);
        }
        if (jArr12.length == 1 && loVar2.b == 1 && jArr2.length >= 2) {
            long j12 = ((long[]) com.applovin.impl.b1.a(loVar2.i))[0];
            long jC2 = j12 + com.applovin.impl.xp.c(loVar2.h[0], loVar2.c, loVar2.d);
            i8 = i5;
            if (a(jArr2, j, j12, jC2)) {
                long jC3 = com.applovin.impl.xp.c(j12 - jArr2[0], loVar2.f.A, loVar2.c);
                i9 = i6;
                long jC4 = com.applovin.impl.xp.c(j - jC2, loVar2.f.A, loVar2.c);
                if ((jC3 != 0 || jC4 != 0) && jC3 <= 2147483647L && jC4 <= 2147483647L) {
                    y9Var.f1535a = (int) jC3;
                    y9Var.b = (int) jC4;
                    com.applovin.impl.xp.a(jArr2, 1000000L, loVar2.c);
                    return new com.applovin.impl.ro(loVar, jArr, iArr, i9, jArr2, iArr2, com.applovin.impl.xp.c(loVar2.h[0], 1000000L, loVar2.d));
                }
            }
            jArr3 = loVar2.h;
            if (jArr3.length != 1 && jArr3[0] == 0) {
                long j13 = ((long[]) com.applovin.impl.b1.a(loVar2.i))[0];
                for (int i40 = 0; i40 < jArr2.length; i40++) {
                    jArr2[i40] = com.applovin.impl.xp.c(jArr2[i40] - j13, 1000000L, loVar2.c);
                }
                return new com.applovin.impl.ro(loVar, jArr, iArr, i9, jArr2, iArr2, com.applovin.impl.xp.c(j - j13, 1000000L, loVar2.c));
            }
            if (loVar2.b == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            iArr3 = new int[jArr3.length];
            iArr4 = new int[jArr3.length];
            jArr4 = (long[]) com.applovin.impl.b1.a(loVar2.i);
            i10 = 0;
            i11 = 0;
            z4 = false;
            i12 = 0;
            while (true) {
                jArr5 = loVar2.h;
                if (i10 < jArr5.length) {
                    break;
                }
                long[] jArr13 = jArr;
                int[] iArr13 = iArr;
                j4 = jArr4[i10];
                if (j4 != -1) {
                    long j14 = jArr5[i10];
                    boolean z10 = z4;
                    i20 = i12;
                    long jC5 = com.applovin.impl.xp.c(j14, loVar2.c, loVar2.d);
                    iArr3[i10] = com.applovin.impl.xp.b(jArr2, j4, true, true);
                    z7 = z3;
                    iArr4[i10] = com.applovin.impl.xp.a(jArr2, j4 + jC5, z7, false);
                    while (true) {
                        i21 = iArr3[i10];
                        i19 = iArr4[i10];
                        if (i21 >= i19 || (iArr2[i21] & 1) != 0) {
                            break;
                        }
                        iArr3[i10] = i21 + 1;
                    }
                    i11 += i19 - i21;
                    if (i20 != i21) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z8 = z10 | z9;
                } else {
                    int i41 = i12;
                    z7 = z3;
                    z8 = z4;
                    i19 = i41;
                }
                i10++;
                z4 = z8;
                z3 = z7;
                jArr = jArr13;
                i12 = i19;
                iArr = iArr13;
            }
            jArr6 = jArr;
            iArr5 = iArr;
            boolean z11 = z4;
            i13 = 0;
            if (i11 != i8) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z11 | z5;
            if (z6) {
                jArr7 = new long[i11];
            } else {
                jArr7 = jArr6;
            }
            if (z6) {
                iArr6 = new int[i11];
            } else {
                iArr6 = iArr5;
            }
            if (z6) {
                i14 = 0;
            } else {
                i14 = i9;
            }
            if (z6) {
                iArr7 = new int[i11];
            } else {
                iArr7 = iArr2;
            }
            jArr8 = new long[i11];
            i15 = i14;
            iArr8 = iArr5;
            j2 = 0;
            i16 = 0;
            while (i13 < loVar2.h.length) {
                j3 = loVar2.i[i13];
                i17 = iArr3[i13];
                int[] iArr14 = iArr3;
                i18 = iArr4[i13];
                int[] iArr15 = iArr4;
                if (z6) {
                    int i42 = i18 - i17;
                    java.lang.System.arraycopy(jArr6, i17, jArr7, i16, i42);
                    iArr9 = iArr8;
                    java.lang.System.arraycopy(iArr9, i17, iArr6, i16, i42);
                    java.lang.System.arraycopy(iArr2, i17, iArr7, i16, i42);
                } else {
                    iArr9 = iArr8;
                }
                int i43 = i15;
                while (i17 < i18) {
                    int i44 = i13;
                    int[] iArr16 = iArr7;
                    long[] jArr14 = jArr2;
                    int[] iArr17 = iArr2;
                    long j15 = j2;
                    jArr8[i16] = com.applovin.impl.xp.c(j2, 1000000L, loVar2.d) + com.applovin.impl.xp.c(java.lang.Math.max(0L, jArr2[i17] - j3), 1000000L, loVar2.c);
                    if (!z6 && iArr6[i16] > i43) {
                        i43 = iArr9[i17];
                    }
                    i16++;
                    i17++;
                    iArr2 = iArr17;
                    j2 = j15;
                    jArr2 = jArr14;
                    iArr7 = iArr16;
                    i13 = i44;
                }
                int i45 = i13;
                i15 = i43;
                j2 += loVar2.h[i45];
                iArr8 = iArr9;
                iArr4 = iArr15;
                jArr6 = jArr6;
                iArr7 = iArr7;
                i13 = i45 + 1;
                iArr3 = iArr14;
            }
            return new com.applovin.impl.ro(loVar, jArr7, iArr6, i15, jArr8, iArr7, com.applovin.impl.xp.c(j2, 1000000L, loVar2.d));
        }
        i8 = i5;
        i9 = i6;
        jArr3 = loVar2.h;
        if (jArr3.length != 1) {
        }
        if (loVar2.b == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        iArr3 = new int[jArr3.length];
        iArr4 = new int[jArr3.length];
        jArr4 = (long[]) com.applovin.impl.b1.a(loVar2.i);
        i10 = 0;
        i11 = 0;
        z4 = false;
        i12 = 0;
        while (true) {
            jArr5 = loVar2.h;
            if (i10 < jArr5.length) {
                break;
                break;
            }
            long[] jArr15 = jArr;
            int[] iArr18 = iArr;
            j4 = jArr4[i10];
            if (j4 != -1) {
                long j16 = jArr5[i10];
                boolean z12 = z4;
                i20 = i12;
                long jC6 = com.applovin.impl.xp.c(j16, loVar2.c, loVar2.d);
                iArr3[i10] = com.applovin.impl.xp.b(jArr2, j4, true, true);
                z7 = z3;
                iArr4[i10] = com.applovin.impl.xp.a(jArr2, j4 + jC6, z7, false);
                while (true) {
                    i21 = iArr3[i10];
                    i19 = iArr4[i10];
                    if (i21 >= i19) {
                        break;
                    }
                    break;
                    break;
                    iArr3[i10] = i21 + 1;
                }
                i11 += i19 - i21;
                if (i20 != i21) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z8 = z12 | z9;
            } else {
                int i46 = i12;
                z7 = z3;
                z8 = z4;
                i19 = i46;
            }
            i10++;
            z4 = z8;
            z3 = z7;
            jArr = jArr15;
            i12 = i19;
            iArr = iArr18;
        }
        jArr6 = jArr;
        iArr5 = iArr;
        boolean z13 = z4;
        i13 = 0;
        if (i11 != i8) {
            z5 = true;
        } else {
            z5 = false;
        }
        z6 = z13 | z5;
        if (z6) {
            jArr7 = new long[i11];
        } else {
            jArr7 = jArr6;
        }
        if (z6) {
            iArr6 = new int[i11];
        } else {
            iArr6 = iArr5;
        }
        if (z6) {
            i14 = 0;
        } else {
            i14 = i9;
        }
        if (z6) {
            iArr7 = new int[i11];
        } else {
            iArr7 = iArr2;
        }
        jArr8 = new long[i11];
        i15 = i14;
        iArr8 = iArr5;
        j2 = 0;
        i16 = 0;
        while (i13 < loVar2.h.length) {
            j3 = loVar2.i[i13];
            i17 = iArr3[i13];
            int[] iArr19 = iArr3;
            i18 = iArr4[i13];
            int[] iArr110 = iArr4;
            if (z6) {
                int i47 = i18 - i17;
                java.lang.System.arraycopy(jArr6, i17, jArr7, i16, i47);
                iArr9 = iArr8;
                java.lang.System.arraycopy(iArr9, i17, iArr6, i16, i47);
                java.lang.System.arraycopy(iArr2, i17, iArr7, i16, i47);
            } else {
                iArr9 = iArr8;
            }
            int i48 = i15;
            while (i17 < i18) {
                int i49 = i13;
                int[] iArr111 = iArr7;
                long[] jArr16 = jArr2;
                int[] iArr112 = iArr2;
                long j17 = j2;
                jArr8[i16] = com.applovin.impl.xp.c(j2, 1000000L, loVar2.d) + com.applovin.impl.xp.c(java.lang.Math.max(0L, jArr2[i17] - j3), 1000000L, loVar2.c);
                if (!z6) {
                }
                i16++;
                i17++;
                iArr2 = iArr112;
                j2 = j17;
                jArr2 = jArr16;
                iArr7 = iArr111;
                i13 = i49;
            }
            int i410 = i13;
            i15 = i48;
            j2 += loVar2.h[i410];
            iArr8 = iArr9;
            iArr4 = iArr110;
            jArr6 = jArr6;
            iArr7 = iArr7;
            i13 = i410 + 1;
            iArr3 = iArr19;
        }
        return new com.applovin.impl.ro(loVar, jArr7, iArr6, i15, jArr8, iArr7, com.applovin.impl.xp.c(j2, 1000000L, loVar2.d));
    }

    private static com.applovin.impl.k1.c a(com.applovin.impl.ah ahVar, int i, int i2, java.lang.String str, com.applovin.impl.x6 x6Var, boolean z) throws com.applovin.impl.ch {
        int i3;
        ahVar.f(12);
        int iJ = ahVar.j();
        com.applovin.impl.k1.c cVar = new com.applovin.impl.k1.c(iJ);
        for (int i4 = 0; i4 < iJ; i4++) {
            int iD = ahVar.d();
            int iJ2 = ahVar.j();
            com.applovin.impl.m8.a(iJ2 > 0, "childAtomSize must be positive");
            int iJ3 = ahVar.j();
            if (iJ3 == 1635148593 || iJ3 == 1635148595 || iJ3 == 1701733238 || iJ3 == 1831958048 || iJ3 == 1836070006 || iJ3 == 1752589105 || iJ3 == 1751479857 || iJ3 == 1932670515 || iJ3 == 1211250227 || iJ3 == 1987063864 || iJ3 == 1987063865 || iJ3 == 1635135537 || iJ3 == 1685479798 || iJ3 == 1685479729 || iJ3 == 1685481573 || iJ3 == 1685481521) {
                i3 = iD;
                a(ahVar, iJ3, i3, iJ2, i, i2, x6Var, cVar, i4);
            } else if (iJ3 == 1836069985 || iJ3 == 1701733217 || iJ3 == 1633889587 || iJ3 == 1700998451 || iJ3 == 1633889588 || iJ3 == 1685353315 || iJ3 == 1685353317 || iJ3 == 1685353320 || iJ3 == 1685353324 || iJ3 == 1685353336 || iJ3 == 1935764850 || iJ3 == 1935767394 || iJ3 == 1819304813 || iJ3 == 1936684916 || iJ3 == 1953984371 || iJ3 == 778924082 || iJ3 == 778924083 || iJ3 == 1835557169 || iJ3 == 1835560241 || iJ3 == 1634492771 || iJ3 == 1634492791 || iJ3 == 1970037111 || iJ3 == 1332770163 || iJ3 == 1716281667) {
                i3 = iD;
                a(ahVar, iJ3, iD, iJ2, i, str, z, x6Var, cVar, i4);
            } else {
                if (iJ3 == 1414810956 || iJ3 == 1954034535 || iJ3 == 2004251764 || iJ3 == 1937010800 || iJ3 == 1664495672) {
                    a(ahVar, iJ3, iD, iJ2, i, str, cVar);
                } else if (iJ3 == 1835365492) {
                    a(ahVar, iJ3, iD, i, cVar);
                } else if (iJ3 == 1667329389) {
                    cVar.b = new com.applovin.impl.e9.b().h(i).f(androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION).a();
                }
                i3 = iD;
            }
            ahVar.f(i3 + iJ2);
        }
        return cVar;
    }

    private static void a(com.applovin.impl.ah ahVar, int i, int i2, int i3, int i4, java.lang.String str, com.applovin.impl.k1.c cVar) {
        ahVar.f(i2 + 16);
        java.lang.String str2 = androidx.media3.common.MimeTypes.APPLICATION_TTML;
        com.applovin.impl.db dbVarA = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                ahVar.a(bArr, 0, i5);
                dbVarA = com.applovin.impl.db.a(bArr);
                str2 = androidx.media3.common.MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = androidx.media3.common.MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                cVar.d = 1;
                str2 = androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
        cVar.b = new com.applovin.impl.e9.b().h(i4).f(str2).e(str).a(j).a(dbVarA).a();
    }

    private static com.applovin.impl.lo a(com.applovin.impl.j1.a aVar, com.applovin.impl.j1.b bVar, long j, com.applovin.impl.x6 x6Var, boolean z, boolean z2) throws com.applovin.impl.ch {
        long[] jArr;
        long[] jArr2;
        com.applovin.impl.j1.a aVarD;
        android.util.Pair pairA;
        com.applovin.impl.j1.a aVar2 = (com.applovin.impl.j1.a) com.applovin.impl.b1.a(aVar.d(androidx.media3.extractor.mp4.Atom.TYPE_mdia));
        int iA = a(c(((com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar2.e(androidx.media3.extractor.mp4.Atom.TYPE_hdlr))).b));
        if (iA == -1) {
            return null;
        }
        com.applovin.impl.k1.f fVarF = f(((com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_tkhd))).b);
        long jC = androidx.media3.common.C.TIME_UNSET;
        long j2 = j == androidx.media3.common.C.TIME_UNSET ? fVarF.b : j;
        long jE = e(bVar.b);
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            jC = com.applovin.impl.xp.c(j2, 1000000L, jE);
        }
        long j3 = jC;
        com.applovin.impl.j1.a aVar3 = (com.applovin.impl.j1.a) com.applovin.impl.b1.a(((com.applovin.impl.j1.a) com.applovin.impl.b1.a(aVar2.d(androidx.media3.extractor.mp4.Atom.TYPE_minf))).d(androidx.media3.extractor.mp4.Atom.TYPE_stbl));
        android.util.Pair pairD = d(((com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar2.e(androidx.media3.extractor.mp4.Atom.TYPE_mdhd))).b);
        com.applovin.impl.k1.c cVarA = a(((com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar3.e(androidx.media3.extractor.mp4.Atom.TYPE_stsd))).b, fVarF.f942a, fVarF.c, (java.lang.String) pairD.second, x6Var, z2);
        if (z || (aVarD = aVar.d(androidx.media3.extractor.mp4.Atom.TYPE_edts)) == null || (pairA = a(aVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairA.first;
            jArr2 = (long[]) pairA.second;
            jArr = jArr3;
        }
        if (cVarA.b == null) {
            return null;
        }
        return new com.applovin.impl.lo(fVarF.f942a, iA, ((java.lang.Long) pairD.first).longValue(), jE, j3, cVarA.b, cVarA.d, cVarA.f939a, cVarA.c, jArr, jArr2);
    }

    public static android.util.Pair a(com.applovin.impl.j1.b bVar) {
        com.applovin.impl.ah ahVar = bVar.b;
        ahVar.f(8);
        com.applovin.impl.af afVarE = null;
        com.applovin.impl.af afVarD = null;
        while (ahVar.a() >= 8) {
            int iD = ahVar.d();
            int iJ = ahVar.j();
            int iJ2 = ahVar.j();
            if (iJ2 == 1835365473) {
                ahVar.f(iD);
                afVarE = e(ahVar, iD + iJ);
            } else if (iJ2 == 1936553057) {
                ahVar.f(iD);
                afVarD = d(ahVar, iD + iJ);
            }
            ahVar.f(iD + iJ);
        }
        return android.util.Pair.create(afVarE, afVarD);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0195 A[PHI: r3
  0x0195: PHI (r3v34 int) = (r3v33 int), (r3v35 int) binds: [B:102:0x0189, B:105:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(com.applovin.impl.ah ahVar, int i, int i2, int i3, int i4, int i5, com.applovin.impl.x6 x6Var, com.applovin.impl.k1.c cVar, int i6) throws com.applovin.impl.ch {
        java.lang.String str;
        com.applovin.impl.x6 x6Var2;
        java.lang.String str2;
        com.applovin.impl.ah ahVar2 = ahVar;
        int i7 = i2;
        int i8 = i3;
        com.applovin.impl.x6 x6VarA = x6Var;
        ahVar2.f(i7 + 16);
        ahVar2.g(16);
        int iC = ahVar.C();
        int iC2 = ahVar.C();
        ahVar2.g(50);
        int iD = ahVar.d();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            android.util.Pair pairD = d(ahVar2, i7, i8);
            if (pairD != null) {
                iIntValue = ((java.lang.Integer) pairD.first).intValue();
                x6VarA = x6VarA == null ? null : x6VarA.a(((com.applovin.impl.mo) pairD.second).b);
                cVar.f939a[i6] = (com.applovin.impl.mo) pairD.second;
            }
            ahVar2.f(iD);
        }
        java.lang.String str3 = androidx.media3.common.MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = androidx.media3.common.MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? androidx.media3.common.MimeTypes.VIDEO_H263 : null;
        }
        float fC = 1.0f;
        int i9 = -1;
        java.lang.String str4 = null;
        java.util.List listA = null;
        byte[] bArrC = null;
        com.applovin.impl.r3 r3Var = null;
        boolean z = false;
        while (true) {
            if (iD - i7 >= i8) {
                x6Var2 = x6VarA;
                break;
            }
            ahVar2.f(iD);
            int iD2 = ahVar.d();
            java.lang.String str5 = str3;
            int iJ = ahVar.j();
            if (iJ == 0) {
                x6Var2 = x6VarA;
                if (ahVar.d() - i7 == i8) {
                    break;
                }
            } else {
                x6Var2 = x6VarA;
            }
            com.applovin.impl.m8.a(iJ > 0, "childAtomSize must be positive");
            int iJ2 = ahVar.j();
            if (iJ2 == 1635148611) {
                com.applovin.impl.m8.a(str == null, (java.lang.String) null);
                ahVar2.f(iD2 + 8);
                com.applovin.impl.w1 w1VarB = com.applovin.impl.w1.b(ahVar);
                listA = w1VarB.f1445a;
                cVar.c = w1VarB.b;
                if (!z) {
                    fC = w1VarB.e;
                }
                str4 = w1VarB.f;
                str2 = "video/avc";
            } else if (iJ2 == 1752589123) {
                com.applovin.impl.m8.a(str == null, (java.lang.String) null);
                ahVar2.f(iD2 + 8);
                com.applovin.impl.na naVarA = com.applovin.impl.na.a(ahVar);
                listA = naVarA.f1088a;
                cVar.c = naVarA.b;
                str4 = naVarA.c;
                str2 = "video/hevc";
            } else {
                if (iJ2 == 1685480259 || iJ2 == 1685485123) {
                    com.applovin.impl.w6 w6VarA = com.applovin.impl.w6.a(ahVar);
                    if (w6VarA != null) {
                        str4 = w6VarA.c;
                        str = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else if (iJ2 == 1987076931) {
                    com.applovin.impl.m8.a(str == null, (java.lang.String) null);
                    str2 = iIntValue == 1987063864 ? androidx.media3.common.MimeTypes.VIDEO_VP8 : androidx.media3.common.MimeTypes.VIDEO_VP9;
                } else if (iJ2 == 1635135811) {
                    com.applovin.impl.m8.a(str == null, (java.lang.String) null);
                    str = "video/av01";
                } else if (iJ2 == 1681012275) {
                    com.applovin.impl.m8.a(str == null, (java.lang.String) null);
                    str = str5;
                } else if (iJ2 == 1702061171) {
                    com.applovin.impl.m8.a(str == null, (java.lang.String) null);
                    android.util.Pair pairA = a(ahVar2, iD2);
                    java.lang.String str6 = (java.lang.String) pairA.first;
                    byte[] bArr = (byte[]) pairA.second;
                    if (bArr != null) {
                        listA = com.applovin.impl.db.a(bArr);
                    }
                    str = str6;
                } else if (iJ2 == 1885434736) {
                    fC = c(ahVar2, iD2);
                    z = true;
                } else if (iJ2 == 1937126244) {
                    bArrC = c(ahVar2, iD2, iJ);
                } else if (iJ2 == 1936995172) {
                    int iW = ahVar.w();
                    ahVar2.g(3);
                    if (iW == 0) {
                        int iW2 = ahVar.w();
                        if (iW2 != 0) {
                            int i10 = 1;
                            if (iW2 == 1) {
                                i9 = i10;
                            } else if (iW2 != 2) {
                                i10 = 3;
                                if (iW2 == 3) {
                                    i9 = i10;
                                }
                            } else {
                                i9 = 2;
                            }
                        } else {
                            i9 = 0;
                        }
                    }
                } else if (iJ2 == 1668246642) {
                    int iJ3 = ahVar.j();
                    boolean z2 = iJ3 == 1852009592;
                    if (!z2 && iJ3 != 1852009571) {
                        com.applovin.impl.oc.d("AtomParsers", "Unsupported color type: " + com.applovin.impl.j1.a(iJ3));
                    } else {
                        int iC3 = ahVar.C();
                        int iC4 = ahVar.C();
                        ahVar2.g(2);
                        r3Var = new com.applovin.impl.r3(com.applovin.impl.r3.a(iC3), z2 && (ahVar.w() & 128) != 0 ? 1 : 2, com.applovin.impl.r3.b(iC4), null);
                    }
                }
                iD += iJ;
                ahVar2 = ahVar;
                i7 = i2;
                i8 = i3;
                str3 = str5;
                x6VarA = x6Var2;
            }
            str = str2;
            iD += iJ;
            ahVar2 = ahVar;
            i7 = i2;
            i8 = i3;
            str3 = str5;
            x6VarA = x6Var2;
        }
        if (str == null) {
            return;
        }
        cVar.b = new com.applovin.impl.e9.b().h(i4).f(str).a(str4).q(iC).g(iC2).b(fC).m(i5).a(bArrC).p(i9).a(listA).a(x6Var2).a(r3Var).a();
    }

    public static java.util.List a(com.applovin.impl.j1.a aVar, com.applovin.impl.y9 y9Var, long j, com.applovin.impl.x6 x6Var, boolean z, boolean z2, com.applovin.exoplayer2.common.base.Function function) {
        com.applovin.impl.lo loVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < aVar.d.size(); i++) {
            com.applovin.impl.j1.a aVar2 = (com.applovin.impl.j1.a) aVar.d.get(i);
            if (aVar2.f902a == 1953653099 && (loVar = (com.applovin.impl.lo) function.apply(a(aVar2, (com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_mvhd)), j, x6Var, z, z2))) != null) {
                arrayList.add(a(loVar, (com.applovin.impl.j1.a) com.applovin.impl.b1.a(((com.applovin.impl.j1.a) com.applovin.impl.b1.a(((com.applovin.impl.j1.a) com.applovin.impl.b1.a(aVar2.d(androidx.media3.extractor.mp4.Atom.TYPE_mdia))).d(androidx.media3.extractor.mp4.Atom.TYPE_minf))).d(androidx.media3.extractor.mp4.Atom.TYPE_stbl)), y9Var));
            }
        }
        return arrayList;
    }
}

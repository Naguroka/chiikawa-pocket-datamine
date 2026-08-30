package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class wa extends com.applovin.impl.dk {
    public static final com.applovin.impl.wa.a b = new com.applovin.impl.wa.a() { // from class: com.applovin.impl.wa$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.wa.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return com.applovin.impl.wa.b(i, i2, i3, i4, i5);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.wa.a f1460a;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    private static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static java.lang.String b(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i != 2) {
            return i != 3 ? "ISO-8859-1" : com.adjust.sdk.Constants.ENCODING;
        }
        return "UTF-16BE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public wa() {
        this(null);
    }

    public wa(com.applovin.impl.wa.a aVar) {
        this.f1460a = aVar;
    }

    private static com.applovin.impl.zn e(com.applovin.impl.ah ahVar, int i) {
        if (i < 1) {
            return null;
        }
        int iW = ahVar.w();
        java.lang.String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        int iB = b(bArr, 0, iW);
        java.lang.String str = new java.lang.String(bArr, 0, iB, strB);
        int iA = iB + a(iW);
        return new com.applovin.impl.zn("TXXX", str, a(bArr, iA, b(bArr, iA, iW), strB));
    }

    private static com.applovin.impl.up f(com.applovin.impl.ah ahVar, int i) {
        if (i < 1) {
            return null;
        }
        int iW = ahVar.w();
        java.lang.String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        int iB = b(bArr, 0, iW);
        java.lang.String str = new java.lang.String(bArr, 0, iB, strB);
        int iA = iB + a(iW);
        return new com.applovin.impl.up("WXXX", str, a(bArr, iA, b(bArr, iA), "ISO-8859-1"));
    }

    private static com.applovin.impl.vh d(com.applovin.impl.ah ahVar, int i) {
        byte[] bArr = new byte[i];
        ahVar.a(bArr, 0, i);
        int iB = b(bArr, 0);
        return new com.applovin.impl.vh(new java.lang.String(bArr, 0, iB, "ISO-8859-1"), a(bArr, iB + 1, i));
    }

    private static com.applovin.impl.f3 b(com.applovin.impl.ah ahVar, int i, int i2, boolean z, int i3, com.applovin.impl.wa.a aVar) {
        int iD = ahVar.d();
        int iB = b(ahVar.c(), iD);
        java.lang.String str = new java.lang.String(ahVar.c(), iD, iB - iD, "ISO-8859-1");
        ahVar.f(iB + 1);
        int iW = ahVar.w();
        boolean z2 = (iW & 2) != 0;
        boolean z3 = (iW & 1) != 0;
        int iW2 = ahVar.w();
        java.lang.String[] strArr = new java.lang.String[iW2];
        for (int i4 = 0; i4 < iW2; i4++) {
            int iD2 = ahVar.d();
            int iB2 = b(ahVar.c(), iD2);
            strArr[i4] = new java.lang.String(ahVar.c(), iD2, iB2 - iD2, "ISO-8859-1");
            ahVar.f(iB2 + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i5 = iD + i;
        while (ahVar.d() < i5) {
            com.applovin.impl.xa xaVarA = a(i2, ahVar, z, i3, aVar);
            if (xaVarA != null) {
                arrayList.add(xaVarA);
            }
        }
        return new com.applovin.impl.f3(str, z2, z3, strArr, (com.applovin.impl.xa[]) arrayList.toArray(new com.applovin.impl.xa[0]));
    }

    private static com.applovin.impl.Cif c(com.applovin.impl.ah ahVar, int i) {
        int iC = ahVar.C();
        int iZ = ahVar.z();
        int iZ2 = ahVar.z();
        int iW = ahVar.w();
        int iW2 = ahVar.w();
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg();
        zgVar.a(ahVar);
        int i2 = ((i - 10) * 8) / (iW + iW2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = zgVar.a(iW);
            int iA2 = zgVar.a(iW2);
            iArr[i3] = iA;
            iArr2[i3] = iA2;
        }
        return new com.applovin.impl.Cif(iC, iZ, iZ2, iArr, iArr2);
    }

    private static int g(com.applovin.impl.ah ahVar, int i) {
        byte[] bArrC = ahVar.c();
        int iD = ahVar.d();
        int i2 = iD;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iD + i) {
                return i;
            }
            if ((bArrC[i2] & 255) == 255 && bArrC[i3] == 0) {
                java.lang.System.arraycopy(bArrC, i2 + 2, bArrC, i3, (i - (i2 - iD)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return com.applovin.impl.xp.f;
        }
        return java.util.Arrays.copyOfRange(bArr, i, i2);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1461a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.f1461a = i;
            this.b = z;
            this.c = i2;
        }
    }

    @Override // com.applovin.impl.dk
    protected com.applovin.impl.af a(com.applovin.impl.df dfVar, java.nio.ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static com.applovin.impl.z9 b(com.applovin.impl.ah ahVar, int i) {
        int iW = ahVar.w();
        java.lang.String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        int iB = b(bArr, 0);
        java.lang.String str = new java.lang.String(bArr, 0, iB, "ISO-8859-1");
        int i3 = iB + 1;
        int iB2 = b(bArr, i3, iW);
        java.lang.String strA = a(bArr, i3, iB2, strB);
        int iA = iB2 + a(iW);
        int iB3 = b(bArr, iA, iW);
        return new com.applovin.impl.z9(str, strA, a(bArr, iA, iB3, strB), a(bArr, iB3 + a(iW), i2));
    }

    private static com.applovin.impl.up c(com.applovin.impl.ah ahVar, int i, java.lang.String str) {
        byte[] bArr = new byte[i];
        ahVar.a(bArr, 0, i);
        return new com.applovin.impl.up(str, null, new java.lang.String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static com.applovin.impl.v0 a(com.applovin.impl.ah ahVar, int i, int i2) {
        int iB;
        java.lang.String str;
        int iW = ahVar.w();
        java.lang.String strB = b(iW);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        ahVar.a(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + com.applovin.exoplayer2.common.base.Ascii.toLowerCase(new java.lang.String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = androidx.media3.common.MimeTypes.IMAGE_JPEG;
            }
            iB = 2;
        } else {
            iB = b(bArr, 0);
            java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(new java.lang.String(bArr, 0, iB, "ISO-8859-1"));
            str = lowerCase.indexOf(47) == -1 ? "image/" + lowerCase : lowerCase;
        }
        int i4 = bArr[iB + 1] & 255;
        int i5 = iB + 2;
        int iB2 = b(bArr, i5, iW);
        return new com.applovin.impl.v0(str, new java.lang.String(bArr, i5, iB2 - i5, strB), i4, a(bArr, iB2 + a(iW), i3));
    }

    private static com.applovin.impl.zn b(com.applovin.impl.ah ahVar, int i, java.lang.String str) {
        if (i < 1) {
            return null;
        }
        int iW = ahVar.w();
        java.lang.String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        return new com.applovin.impl.zn(str, null, new java.lang.String(bArr, 0, b(bArr, 0, iW), strB));
    }

    private static com.applovin.impl.h2 a(com.applovin.impl.ah ahVar, int i, java.lang.String str) {
        byte[] bArr = new byte[i];
        ahVar.a(bArr, 0, i);
        return new com.applovin.impl.h2(str, bArr);
    }

    private static com.applovin.impl.e3 a(com.applovin.impl.ah ahVar, int i, int i2, boolean z, int i3, com.applovin.impl.wa.a aVar) {
        int iD = ahVar.d();
        int iB = b(ahVar.c(), iD);
        java.lang.String str = new java.lang.String(ahVar.c(), iD, iB - iD, "ISO-8859-1");
        ahVar.f(iB + 1);
        int iJ = ahVar.j();
        int iJ2 = ahVar.j();
        long jY = ahVar.y();
        long j = jY == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE ? -1L : jY;
        long jY2 = ahVar.y();
        long j2 = jY2 == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE ? -1L : jY2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i4 = iD + i;
        while (ahVar.d() < i4) {
            com.applovin.impl.xa xaVarA = a(i2, ahVar, z, i3, aVar);
            if (xaVarA != null) {
                arrayList.add(xaVarA);
            }
        }
        return new com.applovin.impl.e3(str, iJ, iJ2, j, j2, (com.applovin.impl.xa[]) arrayList.toArray(new com.applovin.impl.xa[0]));
    }

    private static int b(byte[] bArr, int i, int i2) {
        int iB = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(bArr, iB + 1);
        }
        return bArr.length;
    }

    private static com.applovin.impl.u3 a(com.applovin.impl.ah ahVar, int i) {
        if (i < 4) {
            return null;
        }
        int iW = ahVar.w();
        java.lang.String strB = b(iW);
        byte[] bArr = new byte[3];
        ahVar.a(bArr, 0, 3);
        java.lang.String str = new java.lang.String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ahVar.a(bArr2, 0, i2);
        int iB = b(bArr2, 0, iW);
        java.lang.String str2 = new java.lang.String(bArr2, 0, iB, strB);
        int iA = iB + a(iW);
        return new com.applovin.impl.u3(str, str2, a(bArr2, iA, b(bArr2, iA, iW), strB));
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:140:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ef A[Catch: all -> 0x012f, UnsupportedEncodingException -> 0x021b, Merged into TryCatch #1 {all -> 0x012f, UnsupportedEncodingException -> 0x021b, blocks: (B:91:0x011d, B:161:0x01f9, B:164:0x021b, B:93:0x0125, B:102:0x013e, B:104:0x0146, B:112:0x0160, B:121:0x0178, B:132:0x0193, B:139:0x01a5, B:145:0x01b4, B:151:0x01ce, B:158:0x01ea, B:159:0x01ef), top: B:171:0x0113 }] */
    private static com.applovin.impl.xa a(int i, com.applovin.impl.ah ahVar, boolean z, int i2, com.applovin.impl.wa.a aVar) {
        int iZ;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        com.applovin.impl.xa xaVarA;
        int iW = ahVar.w();
        int iW2 = ahVar.w();
        int iW3 = ahVar.w();
        int iW4 = i >= 3 ? ahVar.w() : 0;
        if (i == 4) {
            iZ = ahVar.A();
            if (!z) {
                iZ = (((iZ >> 24) & 255) << 21) | (iZ & 255) | (((iZ >> 8) & 255) << 7) | (((iZ >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            iZ = ahVar.A();
        } else {
            iZ = ahVar.z();
        }
        int i4 = iZ;
        int iC = i >= 3 ? ahVar.C() : 0;
        if (iW == 0 && iW2 == 0 && iW3 == 0 && iW4 == 0 && i4 == 0 && iC == 0) {
            ahVar.f(ahVar.e());
            return null;
        }
        int iD = ahVar.d() + i4;
        if (iD > ahVar.e()) {
            com.applovin.impl.oc.d("Id3Decoder", "Frame size exceeds remaining tag data");
            ahVar.f(ahVar.e());
            return null;
        }
        if (aVar != null) {
            i3 = iD;
            if (!aVar.a(i, iW, iW2, iW3, iW4)) {
                ahVar.f(i3);
                return null;
            }
        } else {
            i3 = iD;
        }
        if (i == 3) {
            int i5 = iC;
            z6 = (i5 & 128) != 0;
            z4 = (i5 & 64) != 0;
            z5 = false;
            z2 = (i5 & 32) != 0;
            z3 = z6;
        } else {
            int i6 = iC;
            if (i == 4) {
                z2 = (i6 & 64) != 0;
                z3 = (i6 & 8) != 0;
                z4 = (i6 & 4) != 0;
                z5 = (i6 & 2) != 0;
                if ((i6 & 1) != 0) {
                    z6 = true;
                }
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            z6 = false;
        }
        if (!z3 && !z4) {
            if (z2) {
                i4--;
                ahVar.g(1);
            }
            if (z6) {
                i4 -= 4;
                ahVar.g(4);
            }
            int iG = i4;
            if (z5) {
                iG = g(ahVar, iG);
            }
            int i7 = iG;
            try {
                if (iW == 84 && iW2 == 88 && iW3 == 88 && (i == 2 || iW4 == 88)) {
                    xaVarA = e(ahVar, i7);
                } else if (iW == 84) {
                    xaVarA = b(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                } else if (iW == 87 && iW2 == 88 && iW3 == 88 && (i == 2 || iW4 == 88)) {
                    xaVarA = f(ahVar, i7);
                } else if (iW == 87) {
                    xaVarA = c(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                } else if (iW == 80 && iW2 == 82 && iW3 == 73 && iW4 == 86) {
                    xaVarA = d(ahVar, i7);
                } else if (iW == 71 && iW2 == 69 && iW3 == 79 && (iW4 == 66 || i == 2)) {
                    xaVarA = b(ahVar, i7);
                } else if (i == 2) {
                    if (iW == 80 && iW2 == 73 && iW3 == 67) {
                        xaVarA = a(ahVar, i7, i);
                    } else if (iW != 67 && iW2 == 79 && iW3 == 77 && (iW4 == 77 || i == 2)) {
                        xaVarA = a(ahVar, i7);
                    } else if (iW != 67 && iW2 == 72 && iW3 == 65 && iW4 == 80) {
                        xaVarA = a(ahVar, i7, i, z, i2, aVar);
                    } else if (iW != 67 && iW2 == 84 && iW3 == 79 && iW4 == 67) {
                        xaVarA = b(ahVar, i7, i, z, i2, aVar);
                    } else if (iW != 77 && iW2 == 76 && iW3 == 76 && iW4 == 84) {
                        xaVarA = c(ahVar, i7);
                    } else {
                        xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                    }
                } else if (iW == 65 && iW2 == 80 && iW3 == 73 && iW4 == 67) {
                    xaVarA = a(ahVar, i7, i);
                } else if (iW != 67) {
                    if (iW != 67) {
                        if (iW != 67) {
                            if (iW != 77) {
                                xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                            } else {
                                xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                            }
                        } else if (iW != 77) {
                            xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                        } else {
                            xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                        }
                    } else if (iW != 67) {
                        if (iW != 77) {
                            xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                        } else {
                            xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                        }
                    } else if (iW != 77) {
                        xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                    } else {
                        xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                    }
                } else if (iW != 67) {
                    if (iW != 67) {
                        if (iW != 77) {
                            xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                        } else {
                            xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                        }
                    } else if (iW != 77) {
                        xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                    } else {
                        xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                    }
                } else if (iW != 67) {
                    if (iW != 77) {
                        xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                    } else {
                        xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                    }
                } else if (iW != 77) {
                    xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                } else {
                    xaVarA = a(ahVar, i7, a(i, iW, iW2, iW3, iW4));
                }
                if (xaVarA == null) {
                    com.applovin.impl.oc.d("Id3Decoder", "Failed to decode frame: id=" + a(i, iW, iW2, iW3, iW4) + ", frameSize=" + i7);
                }
                ahVar.f(i3);
                return xaVarA;
            } catch (java.io.UnsupportedEncodingException unused) {
                com.applovin.impl.oc.d(r4, "Unsupported character encoding");
                return null;
            } finally {
                ahVar.f(i3);
            }
        }
        com.applovin.impl.oc.d(r4, "Skipping unsupported compressed or encrypted frame");
        ahVar.f(i3);
        return null;
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static com.applovin.impl.wa.b a(com.applovin.impl.ah ahVar) {
        if (ahVar.a() < 10) {
            com.applovin.impl.oc.d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iZ = ahVar.z();
        boolean z = false;
        if (iZ != 4801587) {
            com.applovin.impl.oc.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + java.lang.String.format("%06X", java.lang.Integer.valueOf(iZ)));
            return null;
        }
        int iW = ahVar.w();
        ahVar.g(1);
        int iW2 = ahVar.w();
        int iV = ahVar.v();
        if (iW == 2) {
            if ((iW2 & 64) != 0) {
                com.applovin.impl.oc.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iW == 3) {
            if ((iW2 & 64) != 0) {
                int iJ = ahVar.j();
                ahVar.g(iJ);
                iV -= iJ + 4;
            }
        } else {
            if (iW != 4) {
                com.applovin.impl.oc.d("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iW);
                return null;
            }
            if ((iW2 & 64) != 0) {
                int iV2 = ahVar.v();
                ahVar.g(iV2 - 4);
                iV -= iV2;
            }
            if ((iW2 & 16) != 0) {
                iV -= 10;
            }
        }
        if (iW < 4 && (iW2 & 128) != 0) {
            z = true;
        }
        return new com.applovin.impl.wa.b(iW, z, iV);
    }

    private static java.lang.String a(byte[] bArr, int i, int i2, java.lang.String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new java.lang.String(bArr, i, i2 - i, str);
    }

    private static java.lang.String a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0087 A[PHI: r3
  0x0087: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:39:0x0084, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean a(com.applovin.impl.ah ahVar, int i, int i2, boolean z) {
        int iZ;
        long jZ;
        int iC;
        int i3;
        int iD = ahVar.d();
        while (true) {
            try {
                boolean z2 = true;
                if (ahVar.a() < i2) {
                    ahVar.f(iD);
                    return true;
                }
                if (i >= 3) {
                    iZ = ahVar.j();
                    jZ = ahVar.y();
                    iC = ahVar.C();
                } else {
                    iZ = ahVar.z();
                    jZ = ahVar.z();
                    iC = 0;
                }
                if (iZ == 0 && jZ == 0 && iC == 0) {
                    ahVar.f(iD);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jZ) != 0) {
                        ahVar.f(iD);
                        return false;
                    }
                    jZ = (((jZ >> 24) & 255) << 21) | (jZ & 255) | (((jZ >> 8) & 255) << 7) | (((jZ >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iC & 64) != 0 ? 1 : 0;
                    if ((iC & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iC & 32) != 0 ? 1 : 0;
                    if ((iC & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jZ < i3) {
                    ahVar.f(iD);
                    return false;
                }
                if (ahVar.a() < jZ) {
                    ahVar.f(iD);
                    return false;
                }
                ahVar.g((int) jZ);
            } catch (java.lang.Throwable th) {
                ahVar.f(iD);
                throw th;
            }
        }
    }

    public com.applovin.impl.af a(byte[] bArr, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bArr, i);
        com.applovin.impl.wa.b bVarA = a(ahVar);
        if (bVarA == null) {
            return null;
        }
        int iD = ahVar.d();
        int i2 = bVarA.f1461a == 2 ? 6 : 10;
        int iG = bVarA.c;
        if (bVarA.b) {
            iG = g(ahVar, bVarA.c);
        }
        ahVar.e(iD + iG);
        boolean z = false;
        if (!a(ahVar, bVarA.f1461a, i2, false)) {
            if (bVarA.f1461a != 4 || !a(ahVar, 4, i2, true)) {
                com.applovin.impl.oc.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarA.f1461a);
                return null;
            }
            z = true;
        }
        while (ahVar.a() >= i2) {
            com.applovin.impl.xa xaVarA = a(bVarA.f1461a, ahVar, z, i2, this.f1460a);
            if (xaVarA != null) {
                arrayList.add(xaVarA);
            }
        }
        return new com.applovin.impl.af(arrayList);
    }
}

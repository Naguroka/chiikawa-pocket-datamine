package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AV {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"feKkTIGaKBzYly9JWp1UGSpJz", "JpaSPsw5bhSGcni6SunY9qE9XqqxOTB4", "FdOEv1spqmDR0S1eel7tXx2JiMt3s7CT", "r67N7OmmUfE7C5kYOwS37DJ2khtydzMF", "kr3JWI8OgoIha1qlRfFHcWBfXWb0v", "RBj3wIWlApOb1m0jvRLNALJUkjzpgsHR", "X8Xzq1UvYCBYzPt3qtZ0CSa2Q2yi8g5o", "c5elHHscTrd0Xh0UaNxMEpwYBzse3bvH"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A07(com.facebook.ads.redexgen.core.I4 i4, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        int i = A05[(i4.A0E() & 192) >> 6];
        int iA0E = i4.A0E();
        int i2 = A04[(iA0E & 56) >> 3];
        if ((iA0E & 4) != 0) {
            i2++;
        }
        return com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(str, A0A(0, 9, 27), null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A08(com.facebook.ads.redexgen.core.I4 i4, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        i4.A0Z(2);
        int i = A05[(i4.A0E() & 192) >> 6];
        int iA0E = i4.A0E();
        int i2 = A04[(iA0E & 14) >> 1];
        if ((iA0E & 1) != 0) {
            i2++;
        }
        if (((i4.A0E() & 30) >> 1) > 0 && (i4.A0E() & 2) != 0) {
            i2 += 2;
        }
        java.lang.String strA0A = A0A(9, 10, 9);
        if (i4.A04() > 0 && (i4.A0E() & 1) != 0) {
            strA0A = A0A(19, 14, 6);
        }
        if (A01[4].length() != 29) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[5] = "hD3DRaYZXSMOR9zyDUbj39jX2JJ2nHPn";
        strArr[1] = "v3z9M6fGZsIfOS8Dc7RRmNft5mWEgAHm";
        return com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(str, strA0A, null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-84, -64, -81, -76, -70, 122, -84, -82, 126, -102, -82, -99, -94, -88, 104, -98, -102, -100, 108, -105, -85, -102, -97, -91, 101, -101, -105, -103, 105, 99, -96, -91, -103};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 44100, 32000};
        A06 = new int[]{24000, 22050, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, org.objectweb.asm.Opcodes.IF_ICMPNE, 192, 224, 256, 320, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, org.objectweb.asm.Opcodes.FRETURN, 208, 243, 278, 348, com.bytedance.sdk.openadsdk.TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int halfFrmsizecod = A05.length;
        if (i >= halfFrmsizecod || i2 < 0) {
            return -1;
        }
        int halfFrmsizecod2 = A07.length;
        if (i3 >= halfFrmsizecod2) {
            return -1;
        }
        int i4 = A05[i];
        if (i4 == 44100) {
            int halfFrmsizecod3 = i2 % 2;
            return (A07[i3] + halfFrmsizecod3) * 2;
        }
        int[] iArr = A02;
        if (A01[0].length() == 25) {
            java.lang.String[] strArr = A01;
            strArr[5] = "z2kqD8LOBdJ7Jqq56i3U3gKvsmG5ydnN";
            strArr[1] = "YMMRFpU7Ahc9T1mVgCBm1YbjvN5yyMtc";
            int sampleRate = iArr[i3];
            if (i4 == 32000) {
                int halfFrmsizecod4 = sampleRate * 6;
                return halfFrmsizecod4;
            }
            int i5 = sampleRate * 4;
            if (A01[2].charAt(5) != 89) {
                A01[3] = "t1FH6FzkE8u1jEcLtoSWphmlT7OPpQP7";
                return i5;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static int A02(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i = startIndex - 10;
        for (int i2 = iPosition; i2 <= i; i2++) {
            int startIndex2 = i2 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i2 - iPosition;
            }
        }
        java.lang.String[] strArr = A01;
        java.lang.String str = strArr[5];
        java.lang.String str2 = strArr[1];
        int endIndex2 = str.charAt(24);
        int startIndex3 = str2.charAt(24);
        if (endIndex2 == startIndex3) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "r38b7CGA0ZL34koDTyhy3Bv0CTT7Kabk";
        return -1;
    }

    public static int A03(java.nio.ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i * 256;
        return fscod2;
    }

    public static int A04(java.nio.ByteBuffer byteBuffer, int i) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        int frmsizecod = bArr[4] & okio.Utf8.REPLACEMENT_BYTE;
        return A01(fscod, frmsizecod);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:182:0x0310  */
    /* JADX WARN: Code duplicated, block: B:70:0x0156  */
    public static com.facebook.ads.redexgen.core.AU A09(com.facebook.ads.redexgen.core.I3 i3) {
        java.lang.String strA0A;
        int iA01;
        int i;
        int i2;
        int i4;
        int i5;
        int iA04;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iA03 = i3.A03();
        i3.A08(40);
        boolean z = i3.A04(5) == 16;
        i3.A07(iA03);
        int i12 = -1;
        if (z) {
            i3.A08(16);
            switch (i3.A04(2)) {
                case 0:
                    i12 = 0;
                    break;
                case 1:
                    i12 = 1;
                    break;
                case 2:
                    i12 = 2;
                    break;
                default:
                    i12 = -1;
                    break;
            }
            i3.A08(3);
            if (A01[6].charAt(24) == 'Q') {
                A01[2] = "H92hVrKPaEjUNLTJBgAcKPd4R808LQZz";
                iA01 = (i3.A04(11) + 1) * 2;
                int iA05 = i3.A04(2);
                if (iA05 == 3) {
                    iA04 = 3;
                    i2 = A06[i3.A04(2)];
                    i6 = 6;
                } else {
                    iA04 = i3.A04(2);
                    i6 = A03[iA04];
                    i2 = A05[iA05];
                }
                i4 = i6 * 256;
                int iA06 = i3.A04(3);
                boolean zA0F = i3.A0F();
                i5 = A04[iA06] + (zA0F ? 1 : 0);
                i3.A08(10);
                if (i3.A0F()) {
                    i3.A08(8);
                }
                if (iA06 == 0) {
                    i3.A08(5);
                    if (i3.A0F()) {
                        i3.A08(8);
                    }
                }
                if (i12 == 1 && i3.A0F()) {
                    i3.A08(16);
                }
                boolean zA0F2 = i3.A0F();
                if (A01[7].charAt(12) == 'f') {
                    throw new java.lang.RuntimeException();
                }
                A01[2] = "joAAaPxzzunkFeiQ3w0b8cIFMGIfW89Y";
                if (zA0F2) {
                    if (iA06 > 2) {
                        i3.A08(2);
                    }
                    if ((iA06 & 1) != 0 && iA06 > 2) {
                        i10 = 6;
                        i3.A08(6);
                    } else {
                        i10 = 6;
                    }
                    if ((iA06 & 4) != 0) {
                        i3.A08(i10);
                    }
                    if (zA0F && i3.A0F()) {
                        i3.A08(5);
                    }
                    if (i12 == 0) {
                        if (i3.A0F()) {
                            i11 = 6;
                            i3.A08(6);
                        } else {
                            i11 = 6;
                        }
                        if (iA06 == 0) {
                            boolean zA0F3 = i3.A0F();
                            if (A01[0].length() != 25) {
                                A01[0] = "MWh6cbnsoFviGnXK6MWJxOfzN";
                                if (zA0F3) {
                                    i3.A08(i11);
                                }
                            } else {
                                A01[3] = "thl324NZWZuM1iGjaQShdtXKs5Io0TjV";
                                if (zA0F3) {
                                    i3.A08(i11);
                                }
                            }
                        }
                        boolean zA0F4 = i3.A0F();
                        if (A01[3].charAt(19) != 'o') {
                            A01[3] = "35aod5kiSrgFtJTXEOO3drbNa21FqFlR";
                            if (zA0F4) {
                                i3.A08(i11);
                            }
                            int iA07 = i3.A04(2);
                            if (iA07 == 1) {
                                i3.A08(5);
                            } else if (iA07 == 2) {
                                i3.A08(12);
                            } else if (iA07 == 3) {
                                int iA08 = i3.A04(5);
                                if (A01[2].charAt(5) != 'Y') {
                                    A01[4] = "aa1RJ7BCBlwM7vwazXvLRdZdGuMfd";
                                    if (i3.A0F()) {
                                        i3.A08(5);
                                        if (i3.A0F()) {
                                            i3.A08(4);
                                        }
                                        boolean zA0F5 = i3.A0F();
                                        if (A01[7].charAt(12) != 'f') {
                                            A01[3] = "siunT5tH9lmRRUsefytL8Z8WBvkSDqJv";
                                            if (zA0F5) {
                                                i3.A08(4);
                                            }
                                        } else if (zA0F5) {
                                            i3.A08(4);
                                        }
                                        if (i3.A0F()) {
                                            i3.A08(4);
                                        }
                                        if (i3.A0F()) {
                                            i3.A08(4);
                                        }
                                        if (i3.A0F()) {
                                            i3.A08(4);
                                        }
                                        if (i3.A0F()) {
                                            i3.A08(4);
                                        }
                                        if (i3.A0F()) {
                                            i3.A08(4);
                                        }
                                        if (i3.A0F()) {
                                            if (i3.A0F()) {
                                                i3.A08(4);
                                            }
                                            boolean zA0F6 = i3.A0F();
                                            if (A01[0].length() != 25) {
                                                A01[3] = "qJzivxaQKyIBuYFA9MtvwwNWCqeYoXjr";
                                                if (zA0F6) {
                                                    i3.A08(4);
                                                }
                                            } else {
                                                A01[4] = "1LYtBwQIYeIEBcVIN3d1egxpsMHGR";
                                                if (zA0F6) {
                                                    i3.A08(4);
                                                }
                                            }
                                        }
                                    }
                                    if (i3.A0F()) {
                                        i3.A08(5);
                                        if (i3.A0F()) {
                                            i3.A08(7);
                                            if (i3.A0F()) {
                                                i3.A08(8);
                                            }
                                        }
                                    }
                                    i3.A08((iA08 + 2) * 8);
                                    i3.A05();
                                }
                            }
                            if (iA06 < 2) {
                                if (i3.A0F()) {
                                    i3.A08(14);
                                }
                                if (iA06 == 0) {
                                    boolean zA0F7 = i3.A0F();
                                    if (A01[3].charAt(19) == 'o') {
                                        throw new java.lang.RuntimeException();
                                    }
                                    A01[7] = "QhdrNZH86wiyPRhOg3115VM5H2ye2eOo";
                                    if (zA0F7) {
                                        i3.A08(14);
                                    }
                                }
                            }
                            if (i3.A0F()) {
                                if (iA04 == 0) {
                                    i3.A08(5);
                                } else {
                                    for (int i13 = 0; i13 < i6; i13++) {
                                        if (i3.A0F()) {
                                            i3.A08(5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3.A0F()) {
                    i3.A08(5);
                    if (iA06 == 2) {
                        i3.A08(4);
                    }
                    if (iA06 >= 6) {
                        i3.A08(2);
                    }
                    if (i3.A0F()) {
                        i9 = 8;
                        i3.A08(8);
                    } else {
                        i9 = 8;
                    }
                    if (iA06 == 0 && i3.A0F()) {
                        i3.A08(i9);
                    }
                    i7 = 3;
                    if (iA05 < 3) {
                        i3.A06();
                    }
                } else {
                    i7 = 3;
                }
                if (i12 == 0 && iA04 != i7) {
                    i3.A06();
                }
                if (i12 == 2) {
                    if (iA04 == i7 || i3.A0F()) {
                        i8 = 6;
                        i3.A08(6);
                    } else {
                        i8 = 6;
                    }
                } else {
                    i8 = 6;
                }
                strA0A = A0A(9, 10, 9);
                if (i3.A0F() && i3.A04(i8) == 1) {
                    int iA09 = i3.A04(8);
                    if (A01[7].charAt(12) != 'f') {
                        A01[3] = "mwUU62KT2JwJH8xWNEdUxXNFBfz6EuUo";
                        if (iA09 == 1) {
                            strA0A = A0A(19, 14, 6);
                        }
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
        strA0A = A0A(0, 9, 27);
        i3.A08(32);
        int iA010 = i3.A04(2);
        iA01 = A01(iA010, i3.A04(6));
        i3.A08(8);
        int iA011 = i3.A04(3);
        if ((iA011 & 1) != 0 && iA011 != 1) {
            i = 2;
            i3.A08(2);
        } else {
            i = 2;
        }
        if ((iA011 & 4) != 0) {
            i3.A08(i);
        }
        if (iA011 == i) {
            i3.A08(i);
        }
        i2 = A05[iA010];
        i4 = 1536;
        i5 = A04[iA011] + (i3.A0F() ? 1 : 0);
        return new com.facebook.ads.redexgen.core.AU(strA0A, i12, i5, i2, iA01, i4);
    }
}

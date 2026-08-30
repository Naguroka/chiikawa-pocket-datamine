package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1138Xi implements com.facebook.ads.redexgen.core.InterfaceC0638Db {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"oDcarx9FEV95l", "ZTtmoYFQI4gqa1qx5G8sf9d7DJClXSOg", "4BWiiQEHzTJJ", "sM9tLFh19BbK8", "f3pvpmQKnWva5xh3Eex5w2xyNPMIbB03", "EKLMFNQM5OgFXY3Ny", "aUxYV7Tn322", "5RuBVxa5hmFU3oUcV3HVFMdvL2Njpkaf"};
    public static final int A03;
    public static final com.facebook.ads.redexgen.core.InterfaceC0650Dn A04;
    public final com.facebook.ads.redexgen.core.InterfaceC0650Dn A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame A06(com.facebook.ads.redexgen.core.I4 i4, int i, int i2, boolean z, int i3, com.facebook.ads.redexgen.core.InterfaceC0650Dn interfaceC0650Dn) throws java.io.UnsupportedEncodingException {
        int iA06 = i4.A06();
        int iA02 = A02(i4.A00, iA06);
        java.lang.String str = new java.lang.String(i4.A00, iA06, iA02 - iA06, A0I(org.objectweb.asm.Opcodes.RET, 10, 107));
        i4.A0Y(iA02 + 1);
        int iA08 = i4.A08();
        int iA09 = i4.A08();
        long jA0M = i4.A0M();
        if (jA0M == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            jA0M = -1;
        }
        long jA0M2 = i4.A0M();
        if (jA0M2 == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
            jA0M2 = -1;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i5 = iA06 + i;
        while (i4.A06() < i5) {
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame id3FrameA0B = A0B(i2, i4, z, i3, interfaceC0650Dn);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[] id3FrameArr = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame(str, iA08, iA09, jA0M, jA0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame A09(com.facebook.ads.redexgen.core.I4 i4, int i) throws java.io.UnsupportedEncodingException {
        int iA0E = i4.A0E();
        java.lang.String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        i4.A0c(bArr, 0, i - 1);
        int iA02 = A02(bArr, 0);
        java.lang.String str = new java.lang.String(bArr, 0, iA02, A0I(org.objectweb.asm.Opcodes.RET, 10, 107));
        int i2 = iA02 + 1;
        int iA03 = A03(bArr, i2, iA0E);
        java.lang.String strA0K = A0K(bArr, i2, iA03, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int iA04 = A03(bArr, iA00, iA0E);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame(str, strA0K, A0K(bArr, iA00, iA04, strA0H), A0N(bArr, A00(iA0E) + iA04, bArr.length));
    }

    public static java.lang.String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{28, 90, 28, 90, 28, 90, 66, 4, 66, 4, 66, 4, 66, 4, 70, 74, 12, 24, 11, 7, 15, 57, 3, 16, 15, 87, 4, 33, 52, 33, 96, 52, 47, 47, 96, 51, 40, 47, 50, 52, 96, 52, 47, 96, 34, 37, 96, 33, 46, 96, 9, 4, 115, 96, 52, 33, 39, 37, 2, 10, 15, 6, 7, 67, 23, 12, 67, 7, 6, 0, 12, 7, 6, 67, 5, 17, 2, 14, 6, 89, 67, 10, 7, 94, 64, 103, 111, 106, 99, 98, 38, 114, 105, 38, 112, 103, 106, 111, 98, 103, 114, 99, 38, 79, 66, 53, 38, 114, 103, 97, 38, 113, 111, 114, 110, 38, 107, 103, 108, 105, 116, 80, 99, 116, 117, 111, 105, 104, 59, 91, 111, 124, 112, 120, kotlin.io.encoding.Base64.padSymbol, 110, 116, 103, 120, kotlin.io.encoding.Base64.padSymbol, 120, 101, 126, 120, 120, 121, 110, kotlin.io.encoding.Base64.padSymbol, 111, 120, 112, 124, 116, 115, 116, 115, 122, kotlin.io.encoding.Base64.padSymbol, 105, 124, 122, kotlin.io.encoding.Base64.padSymbol, 121, 124, 105, 124, 25, 20, 99, okio.Utf8.REPLACEMENT_BYTE, 37, 57, 91, 78, 78, 67, 79, 91, 71, 19, 62, 105, 30, okio.Utf8.REPLACEMENT_BYTE, 57, 53, 62, okio.Utf8.REPLACEMENT_BYTE, 40, 106, 82, 80, 73, 73, 92, 93, 25, 112, 125, 10, 25, 77, 88, 94, 25, 78, 80, 77, 81, 25, 84, 88, 83, 86, 75, 111, 92, 75, 74, 80, 86, 87, 4, 11, 25, 88, 87, 93, 25, 76, 87, 93, 92, 95, 80, 87, 92, 93, 25, 90, 86, 84, 73, 75, 92, 74, 74, 80, 86, 87, 25, 74, 90, 81, 92, 84, 92, 105, 81, 83, 74, 74, 95, 94, 26, 115, 126, 9, 26, 78, 91, 93, 26, 77, 83, 78, 82, 26, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 26, 87, 91, 80, 85, 72, 108, 95, 72, 73, 83, 85, 84, 7, 75, 115, 113, 104, 104, 113, 118, 127, 56, 109, 118, 107, 109, 104, 104, 119, 106, 108, 125, 124, 56, 123, 119, 117, 104, 106, 125, 107, 107, 125, 124, 56, 119, 106, 56, 125, 118, 123, 106, 97, 104, 108, 125, 124, 56, 126, 106, 121, 117, 125, 24, 20, 20, 20, 67, 66, 80, 59, 39, 32, 2, 3, 17, 122, 102, 97, 21, 18, 72, 73, 91, 48, 37, 4, okio.Utf8.REPLACEMENT_BYTE, 52, 41, 33, 52, 50, 37, 52, 53, 113, 55, 56, 35, 34, 37, 113, 37, 57, 35, 52, 52, 113, 51, 40, 37, 52, 34, 113, 62, 55, 113, 24, 21, 98, 113, 37, 48, 54, 113, 57, 52, 48, 53, 52, 35, 107, 113, 31, 36, 57, okio.Utf8.REPLACEMENT_BYTE, 58, 58, 37, 56, 62, 47, 46, 106, 41, 34, 43, 56, 43, 41, 62, 47, 56, 106, 47, 36, 41, 37, 46, 35, 36, 45, 117, 122, 122, 122, 41, 45, 33, 39, 37, 111, 70, 66, 78, 72, 74, 0, 69, 95, 74, 72, 121, 125, 113, 119, 117, okio.Utf8.REPLACEMENT_BYTE, 122, 96, 119};
    }

    static {
        A0L();
        A04 = new com.facebook.ads.redexgen.core.C1139Xj();
        A03 = com.facebook.ads.redexgen.core.IK.A08(A0I(org.objectweb.asm.Opcodes.IF_ACMPNE, 3, 77));
    }

    public C1138Xi() {
        this(null);
    }

    public C1138Xi(com.facebook.ads.redexgen.core.InterfaceC0650Dn interfaceC0650Dn) {
        this.A00 = interfaceC0650Dn;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(com.facebook.ads.redexgen.core.I4 i4, int i) {
        byte[] bArr = i4.A00;
        for (int iA06 = i4.A06(); iA06 + 1 < i; iA06++) {
            int i2 = bArr[iA06];
            if ((i2 & 255) == 255) {
                int i3 = iA06 + 1;
                int i5 = A02[2].length();
                if (i5 != 12) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[5] = "fMvheGAz69fX12AY3";
                strArr[6] = "xzSVXT6CIC9";
                if (bArr[i3] == 0) {
                    int i6 = iA06 + 1;
                    java.lang.System.arraycopy(bArr, iA06 + 2, bArr, i6, (i - iA06) - 2);
                    i--;
                }
            }
        }
        return i;
    }

    public static int A02(byte[] bArr, int i) {
        while (i < i) {
            int i2 = bArr[i];
            if (i2 == 0) {
                return i;
            }
            i++;
        }
        int i3 = bArr.length;
        return i3;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int iA02 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iA02;
        }
        while (iA02 < terminationPos - 1) {
            int terminationPos = iA02 % 2;
            if (terminationPos == 0) {
                int terminationPos2 = iA02 + 1;
                if (bArr[terminationPos2] == 0) {
                    return iA02;
                }
            }
            int i3 = iA02 + 1;
            java.lang.String[] strArr = A02;
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[3];
            int length = str.length();
            int terminationPos3 = str2.length();
            if (length != terminationPos3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[1] = "c1mKOA0yx6PM3ayoz9Rx2ZFyjjZjHwoF";
            strArr2[7] = "pETkHlW31R8gYQsHDxP1siPj2h04g4up";
            iA02 = A02(bArr, i3);
        }
        int terminationPos4 = bArr.length;
        return terminationPos4;
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame A04(com.facebook.ads.redexgen.core.I4 i4, int i, int i2) throws java.io.UnsupportedEncodingException {
        int iA02;
        java.lang.String strA0M;
        int descriptionStartIndex = i4.A0E();
        java.lang.String strA0H = A0H(descriptionStartIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        i4.A0c(bArr, 0, encoding2);
        java.lang.String strA0I = A0I(458, 6, 93);
        java.lang.String strA0I2 = A0I(org.objectweb.asm.Opcodes.RET, 10, 107);
        if (i2 == 2) {
            iA02 = 2;
            strA0M = strA0I + com.facebook.ads.redexgen.core.IK.A0M(new java.lang.String(bArr, 0, 3, strA0I2));
            if (A0I(474, 9, 13).equals(strA0M)) {
                strA0M = A0I(464, 10, 50);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA0M = com.facebook.ads.redexgen.core.IK.A0M(new java.lang.String(bArr, 0, iA02, strA0I2));
            if (strA0M.indexOf(47) == -1) {
                strA0M = strA0I + strA0M;
            }
        }
        int encoding3 = iA02 + 1;
        int i3 = bArr[encoding3] & 255;
        int i5 = iA02 + 2;
        int mimeTypeEndIndex = A03(bArr, i5, descriptionStartIndex);
        int encoding4 = mimeTypeEndIndex - i5;
        java.lang.String str = new java.lang.String(bArr, i5, encoding4, strA0H);
        int iA00 = A00(descriptionStartIndex) + mimeTypeEndIndex;
        int encoding5 = bArr.length;
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame(strA0M, str, i3, A0N(bArr, iA00, encoding5));
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame A05(com.facebook.ads.redexgen.core.I4 i4, int i, java.lang.String str) {
        byte[] bArr = new byte[i];
        i4.A0c(bArr, 0, i);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame(str, bArr);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame A07(com.facebook.ads.redexgen.core.I4 i4, int i, int i2, boolean z, int elementIdEndIndex, com.facebook.ads.redexgen.core.InterfaceC0650Dn interfaceC0650Dn) throws java.io.UnsupportedEncodingException {
        int iA06 = i4.A06();
        int iA02 = A02(i4.A00, iA06);
        java.lang.String strA0I = A0I(org.objectweb.asm.Opcodes.RET, 10, 107);
        java.lang.String str = new java.lang.String(i4.A00, iA06, iA02 - iA06, strA0I);
        i4.A0Y(iA02 + 1);
        int framePosition = i4.A0E();
        boolean z2 = (framePosition & 2) != 0;
        boolean z3 = (framePosition & 1) != 0;
        int iA0E = i4.A0E();
        java.lang.String[] strArr = new java.lang.String[iA0E];
        for (int i3 = 0; i3 < iA0E; i3++) {
            int startIndex = i4.A06();
            int i5 = A02(i4.A00, startIndex);
            strArr[i3] = new java.lang.String(i4.A00, startIndex, i5 - startIndex, strA0I);
            i4.A0Y(i5 + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i6 = iA06 + i;
        while (i4.A06() < i6) {
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame id3FrameA0B = A0B(i2, i4, z, elementIdEndIndex, interfaceC0650Dn);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[] id3FrameArr = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame A08(com.facebook.ads.redexgen.core.I4 i4, int i) throws java.io.UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int textStartIndex = i4.A0E();
        java.lang.String strA0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        i4.A0c(bArr, 0, 3);
        java.lang.String description = new java.lang.String(bArr, 0, 3);
        int encoding = i - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i - 4;
        i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        java.lang.String language = new java.lang.String(data, 0, encoding3, strA0H);
        int iA00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, textStartIndex);
        java.lang.String charset = A0K(data, iA00, encoding4, strA0H);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0142  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    public static com.facebook.ads.redexgen.core.C0651Do A0A(com.facebook.ads.redexgen.core.I4 i4) {
        int id;
        int id2;
        int iA04 = i4.A04();
        java.lang.String strA0I = A0I(org.objectweb.asm.Opcodes.PUTSTATIC, 10, 71);
        if (iA04 < 10) {
            android.util.Log.w(strA0I, A0I(26, 31, 93));
            return null;
        }
        int iA0G = i4.A0G();
        int i = A03;
        if (A02[4].charAt(31) != 'T') {
            java.lang.String[] strArr = A02;
            strArr[5] = "3bh22znwtKLXIEc5b";
            strArr[6] = "U0H8GjgN3sI";
            if (iA0G != i) {
                android.util.Log.w(strA0I, A0I(376, 48, 76) + iA0G);
                return null;
            }
            int flags = i4.A0E();
            boolean z = true;
            i4.A0Z(1);
            int iA0E = i4.A0E();
            int extendedHeaderSize = i4.A0D();
            if (flags == 2) {
                int i2 = iA0E & 64;
                int majorVersion = A02[4].charAt(31);
                if (majorVersion != 84) {
                    A02[2] = "pvKXBXNv1Wgv";
                    int id3 = i2 != 0 ? 1 : 0;
                    if (id3 != 0) {
                        android.util.Log.w(strA0I, A0I(189, 68, 36));
                        return null;
                    }
                }
            } else if (flags == 3) {
                int i3 = iA0E & 64;
                java.lang.String[] strArr2 = A02;
                java.lang.String str = strArr2[0];
                java.lang.String str2 = strArr2[3];
                int majorVersion2 = str.length();
                int id4 = str2.length();
                if (majorVersion2 == id4) {
                    java.lang.String[] strArr3 = A02;
                    strArr3[5] = "X6KSpSJfIAoYqs6Su";
                    strArr3[6] = "DnOPfpbBcog";
                    if (i3 != 0) {
                        id2 = 1;
                    } else {
                        id2 = 0;
                    }
                } else if (i3 != 0) {
                    id2 = 1;
                } else {
                    id2 = 0;
                }
                if (id2 != 0) {
                    int id5 = i4.A08();
                    i4.A0Z(id5);
                    extendedHeaderSize -= id5 + 4;
                }
            } else if (flags == 4) {
                int id6 = iA0E & 64;
                int id7 = id6 != 0 ? 1 : 0;
                if (id7 != 0) {
                    int majorVersion3 = i4.A0D();
                    int id8 = majorVersion3 - 4;
                    i4.A0Z(id8);
                    extendedHeaderSize -= majorVersion3;
                }
                int i5 = iA0E & 16;
                java.lang.String[] strArr4 = A02;
                java.lang.String str3 = strArr4[1];
                java.lang.String str4 = strArr4[7];
                int majorVersion4 = str3.charAt(4);
                int id9 = str4.charAt(4);
                if (majorVersion4 != id9) {
                    A02[2] = "Is58gNz9aihp";
                    if (i5 != 0) {
                        id = 1;
                    } else {
                        id = 0;
                    }
                } else if (i5 != 0) {
                    id = 1;
                } else {
                    id = 0;
                }
                if (id != 0) {
                    extendedHeaderSize -= 10;
                }
            } else {
                android.util.Log.w(strA0I, A0I(257, 46, 39) + flags);
                return null;
            }
            if (flags < 4) {
                int framesSize = iA0E & 128;
                int majorVersion5 = A02[2].length();
                if (majorVersion5 != 12) {
                    java.lang.String[] strArr5 = A02;
                    strArr5[0] = "tuvdstMwTCZGP";
                    strArr5[3] = "3DrBnozHMrlNT";
                    if (framesSize == 0) {
                        z = false;
                    }
                } else {
                    java.lang.String[] strArr6 = A02;
                    strArr6[5] = "MmiJwUUasORzBfR26";
                    strArr6[6] = "dsnghQQpSXU";
                    if (framesSize == 0) {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            return new com.facebook.ads.redexgen.core.C0651Do(flags, z, extendedHeaderSize);
        }
        throw new java.lang.RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:151:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x021b A[Catch: UnsupportedEncodingException -> 0x025d, all -> 0x026e, Merged into TryCatch #0 {all -> 0x026e, UnsupportedEncodingException -> 0x025d, blocks: (B:92:0x0143, B:158:0x0225, B:161:0x025d, B:94:0x014b, B:106:0x0184, B:108:0x018c, B:116:0x01a6, B:125:0x01bd, B:136:0x01d7, B:143:0x01e8, B:150:0x01f9, B:155:0x020e, B:156:0x021b), top: B:169:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0178  */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame A0B(int frameId3, com.facebook.ads.redexgen.core.I4 i4, boolean z, int i, com.facebook.ads.redexgen.core.InterfaceC0650Dn interfaceC0650Dn) {
        int iA0E;
        int iA0G;
        int frameSize;
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame id3FrameA05;
        int frameId2 = i4.A0E();
        int frameId1 = i4.A0E();
        int frameId0 = i4.A0E();
        if (frameId3 >= 3) {
            iA0E = i4.A0E();
        } else {
            iA0E = 0;
        }
        if (frameId3 == 4) {
            int iA0H = i4.A0H();
            if (!z) {
                int frameSize2 = iA0H >> 8;
                int i2 = (iA0H & 255) | ((frameSize2 & 255) << 7);
                int frameSize3 = iA0H >> 16;
                int i3 = i2 | ((frameSize3 & 255) << 14);
                int frameSize4 = iA0H >> 24;
                iA0G = i3 | ((frameSize4 & 255) << 21);
            } else {
                iA0G = iA0H;
            }
        } else if (frameId3 == 3) {
            iA0G = i4.A0H();
        } else {
            iA0G = i4.A0G();
        }
        if (frameId3 >= 3) {
            frameSize = i4.A0I();
        } else {
            frameSize = 0;
        }
        if (frameId2 == 0 && frameId1 == 0 && frameId0 == 0 && iA0E == 0 && iA0G == 0 && frameSize == 0) {
            i4.A0Y(i4.A07());
            return null;
        }
        int flags = i4.A06() + iA0G;
        int iA07 = i4.A07();
        java.lang.String strA0I = A0I(org.objectweb.asm.Opcodes.PUTSTATIC, 10, 71);
        if (flags > iA07) {
            android.util.Log.w(strA0I, A0I(129, 37, 0));
            i4.A0Y(i4.A07());
            return null;
        }
        if (interfaceC0650Dn != null && !interfaceC0650Dn.A5w(frameId3, frameId2, frameId1, frameId0, iA0E)) {
            i4.A0Y(flags);
            return null;
        }
        int frameSize5 = 0;
        boolean isEncrypted = false;
        int nextFramePosition = 0;
        int i5 = 0;
        boolean z2 = false;
        if (frameId3 == 3) {
            i5 = (frameSize & 128) != 0 ? 1 : 0;
            isEncrypted = (frameSize & 64) != 0;
            z2 = (frameSize & 32) != 0;
            frameSize5 = i5;
        } else if (frameId3 == 4) {
            z2 = (frameSize & 64) != 0;
            frameSize5 = (frameSize & 8) != 0 ? 1 : 0;
            isEncrypted = (frameSize & 4) != 0;
            nextFramePosition = (frameSize & 2) != 0 ? 1 : 0;
            i5 = (frameSize & 1) != 0 ? 1 : 0;
        }
        if (frameSize5 != 0 || isEncrypted) {
            android.util.Log.w(strA0I, A0I(303, 50, 5));
            i4.A0Y(flags);
            return null;
        }
        if (z2) {
            iA0G--;
            java.lang.String[] strArr = A02;
            if (strArr[5].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[4] = "zESHbWOfVddGi2EEtSYEjeiqsEt2KVkh";
            i4.A0Z(1);
        }
        if (i5 != 0) {
            iA0G -= 4;
            i4.A0Z(4);
        }
        if (nextFramePosition != 0) {
            iA0G = A01(i4, iA0G);
        }
        try {
            if (frameId2 == 84 && frameId1 == 88 && frameId0 == 88 && (frameId3 == 2 || iA0E == 88)) {
                id3FrameA05 = A0D(i4, iA0G);
            } else if (frameId2 == 84) {
                java.lang.String id = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                id3FrameA05 = A0E(i4, iA0G, id);
            } else {
                java.lang.String[] strArr2 = A02;
                if (strArr2[1].charAt(4) != strArr2[7].charAt(4)) {
                    java.lang.String[] strArr3 = A02;
                    strArr3[5] = "bQX4L1ovrnUAFd0js";
                    strArr3[6] = "gSSXKYJef4t";
                    if (frameId2 == 87) {
                        if (frameId1 != 88 && frameId0 == 88 && (frameId3 == 2 || iA0E == 88)) {
                            id3FrameA05 = A0F(i4, iA0G);
                        }
                    }
                } else if (frameId2 == 87) {
                    if (frameId1 != 88) {
                    }
                }
                if (frameId2 == 87) {
                    java.lang.String id2 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                    id3FrameA05 = A0G(i4, iA0G, id2);
                } else if (frameId2 == 80 && frameId1 == 82 && frameId0 == 73 && iA0E == 86) {
                    id3FrameA05 = A0C(i4, iA0G);
                } else if (frameId2 == 71 && frameId1 == 69 && frameId0 == 79 && (iA0E == 66 || frameId3 == 2)) {
                    id3FrameA05 = A09(i4, iA0G);
                } else if (frameId3 == 2) {
                    if (frameId2 == 80 && frameId1 == 73 && frameId0 == 67) {
                        id3FrameA05 = A04(i4, iA0G, frameId3);
                    } else if (frameId2 == 67 || frameId1 != 79 || frameId0 != 77 || (iA0E != 77 && frameId3 != 2)) {
                        if (frameId2 != 67 && frameId1 == 72 && frameId0 == 65 && iA0E == 80) {
                            id3FrameA05 = A06(i4, iA0G, frameId3, z, i, interfaceC0650Dn);
                        } else if (frameId2 != 67 && frameId1 == 84 && frameId0 == 79 && iA0E == 67) {
                            id3FrameA05 = A07(i4, iA0G, frameId3, z, i, interfaceC0650Dn);
                        } else {
                            java.lang.String id3 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                            id3FrameA05 = A05(i4, iA0G, id3);
                        }
                    } else {
                        id3FrameA05 = A08(i4, iA0G);
                    }
                } else if (frameId2 == 65 && frameId1 == 80 && frameId0 == 73 && iA0E == 67) {
                    id3FrameA05 = A04(i4, iA0G, frameId3);
                } else if (frameId2 == 67) {
                    if (frameId2 != 67) {
                        if (frameId2 != 67) {
                            java.lang.String id4 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                            id3FrameA05 = A05(i4, iA0G, id4);
                        } else {
                            java.lang.String id5 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                            id3FrameA05 = A05(i4, iA0G, id5);
                        }
                    } else if (frameId2 != 67) {
                        java.lang.String id6 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                        id3FrameA05 = A05(i4, iA0G, id6);
                    } else {
                        java.lang.String id7 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                        id3FrameA05 = A05(i4, iA0G, id7);
                    }
                } else if (frameId2 != 67) {
                    if (frameId2 != 67) {
                        java.lang.String id8 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                        id3FrameA05 = A05(i4, iA0G, id8);
                    } else {
                        java.lang.String id9 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                        id3FrameA05 = A05(i4, iA0G, id9);
                    }
                } else if (frameId2 != 67) {
                    java.lang.String id10 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                    id3FrameA05 = A05(i4, iA0G, id10);
                } else {
                    java.lang.String id11 = A0J(frameId3, frameId2, frameId1, frameId0, iA0E);
                    id3FrameA05 = A05(i4, iA0G, id11);
                }
            }
            if (id3FrameA05 == null) {
                android.util.Log.w(strA0I, A0I(57, 27, 126) + A0J(frameId3, frameId2, frameId1, frameId0, iA0E) + A0I(14, 12, 119) + iA0G);
            }
            i4.A0Y(flags);
            return id3FrameA05;
        } catch (java.io.UnsupportedEncodingException unused) {
            android.util.Log.w(strA0I, A0I(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, 30, 87));
            return null;
        } finally {
            i4.A0Y(flags);
        }
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame A0C(com.facebook.ads.redexgen.core.I4 i4, int i) throws java.io.UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        i4.A0c(bArr, 0, i);
        int iA02 = A02(bArr, 0);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame(new java.lang.String(bArr, 0, iA02, A0I(org.objectweb.asm.Opcodes.RET, 10, 107)), A0N(bArr, iA02 + 1, bArr.length));
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame A0D(com.facebook.ads.redexgen.core.I4 i4, int i) throws java.io.UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int valueStartIndex = i4.A0E();
        java.lang.String strA0H = A0H(valueStartIndex);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        java.lang.String description = new java.lang.String(data, 0, encoding3, strA0H);
        int iA00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, valueStartIndex);
        java.lang.String strA0K = A0K(data, iA00, encoding4, strA0H);
        java.lang.String charset = A0I(353, 4, 81);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame(charset, description, strA0K);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame A0E(com.facebook.ads.redexgen.core.I4 i4, int i, java.lang.String str) throws java.io.UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iA0E = i4.A0E();
        java.lang.String strA0H = A0H(iA0E);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, iA0E);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame(str, null, new java.lang.String(data, 0, encoding3, strA0H));
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame A0F(com.facebook.ads.redexgen.core.I4 i4, int i) throws java.io.UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int descriptionEndIndex = i4.A0E();
        java.lang.String strA0H = A0H(descriptionEndIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        i4.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        java.lang.String str = new java.lang.String(bArr, 0, encoding3, strA0H);
        int iA00 = A00(descriptionEndIndex) + encoding3;
        java.lang.String strA0K = A0K(bArr, iA00, A02(bArr, iA00), A0I(org.objectweb.asm.Opcodes.RET, 10, 107));
        java.lang.String charset = A0I(454, 4, 63);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame(charset, str, strA0K);
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame A0G(com.facebook.ads.redexgen.core.I4 i4, int i, java.lang.String str) throws java.io.UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        i4.A0c(bArr, 0, i);
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame(str, null, new java.lang.String(bArr, 0, A02(bArr, 0), A0I(org.objectweb.asm.Opcodes.RET, 10, 107)));
    }

    public static java.lang.String A0H(int i) {
        java.lang.String strA0I = A0I(org.objectweb.asm.Opcodes.RET, 10, 107);
        switch (i) {
            case 0:
                return strA0I;
            case 1:
                return A0I(357, 6, 11);
            case 2:
                return A0I(363, 8, 74);
            case 3:
                return A0I(371, 5, 0);
            default:
                return strA0I;
        }
    }

    public static java.lang.String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? java.lang.String.format(java.util.Locale.US, A0I(0, 6, 36), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)) : java.lang.String.format(java.util.Locale.US, A0I(6, 8, 122), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5));
    }

    public static java.lang.String A0K(byte[] bArr, int i, int i2, java.lang.String str) throws java.io.UnsupportedEncodingException {
        if (i2 > i) {
            int length = bArr.length;
            java.lang.String[] strArr = A02;
            if (strArr[5].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[5] = "2w8qNsEXNbi1RtaKY";
            strArr2[6] = "xIsAvF4aqsL";
            if (i2 <= length) {
                return new java.lang.String(bArr, i, i2 - i, str);
            }
        }
        return A0I(0, 0, 89);
    }

    public static boolean A0M(com.facebook.ads.redexgen.core.I4 i4, int i, int i2, boolean z) throws java.lang.Throwable {
        int iA08;
        long jA0M;
        int iA0I;
        int iA06 = i4.A06();
        while (true) {
            try {
                if (i4.A04() < i2) {
                    i4.A0Y(iA06);
                    return true;
                }
                if (i >= 3) {
                    try {
                        iA08 = i4.A08();
                        jA0M = i4.A0M();
                        iA0I = i4.A0I();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        i4.A0Y(iA06);
                        throw th;
                    }
                } else {
                    iA08 = i4.A0G();
                    jA0M = i4.A0G();
                    iA0I = 0;
                }
                if (iA08 == 0 && jA0M == 0 && iA0I == 0) {
                    i4.A0Y(iA06);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jA0M) != 0) {
                        i4.A0Y(iA06);
                        return false;
                    }
                    jA0M = (((jA0M >> 24) & 255) << 21) | (jA0M & 255) | (((jA0M >> 8) & 255) << 7) | (((jA0M >> 16) & 255) << 14);
                }
                boolean z2 = false;
                boolean z3 = false;
                if (i == 4) {
                    z2 = (iA0I & 64) != 0;
                    z3 = (iA0I & 1) != 0;
                } else if (i == 3) {
                    int minimumFrameSize = iA0I & 32;
                    z2 = minimumFrameSize != 0;
                    int minimumFrameSize2 = iA0I & 128;
                    z3 = minimumFrameSize2 != 0;
                }
                int minimumFrameSize3 = 0;
                if (z2) {
                    minimumFrameSize3 = 0 + 1;
                }
                if (z3) {
                    minimumFrameSize3 += 4;
                }
                if (jA0M < minimumFrameSize3) {
                    i4.A0Y(iA06);
                    return false;
                }
                int minimumFrameSize4 = i4.A04();
                if (minimumFrameSize4 >= jA0M) {
                    int minimumFrameSize5 = (int) jA0M;
                    i4.A0Z(minimumFrameSize5);
                } else {
                    i4.A0Y(iA06);
                    return false;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        return java.util.Arrays.copyOfRange(bArr, i, i2);
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A0O(byte[] bArr, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(bArr, i);
        com.facebook.ads.redexgen.core.C0651Do c0651DoA0A = A0A(i4);
        if (c0651DoA0A == null) {
            return null;
        }
        int iA06 = i4.A06();
        int frameHeaderSize = c0651DoA0A.A01 == 2 ? 6 : 10;
        int iA01 = c0651DoA0A.A00;
        if (c0651DoA0A.A02) {
            iA01 = A01(i4, c0651DoA0A.A00);
        }
        i4.A0X(iA06 + iA01);
        boolean z = false;
        if (!A0M(i4, c0651DoA0A.A01, frameHeaderSize, false)) {
            int i2 = c0651DoA0A.A01;
            java.lang.String[] strArr = A02;
            if (strArr[0].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[5] = "2HRW23rQNZUN4UoGi";
            strArr2[6] = "wx9wVCYymkj";
            if (i2 != 4 || !A0M(i4, 4, frameHeaderSize, true)) {
                android.util.Log.w(A0I(org.objectweb.asm.Opcodes.PUTSTATIC, 10, 71), A0I(84, 45, 27) + c0651DoA0A.A01);
                return null;
            }
            z = true;
        }
        while (i4.A04() >= frameHeaderSize) {
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame id3FrameA0B = A0B(c0651DoA0A.A01, i4, z, frameHeaderSize, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0638Db
    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A5N(com.facebook.ads.redexgen.core.EX ex) {
        java.nio.ByteBuffer buffer = ex.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}

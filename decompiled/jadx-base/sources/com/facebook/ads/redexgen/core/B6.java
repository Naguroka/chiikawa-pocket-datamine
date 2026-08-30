package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class B6 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"Q5YmFWlnR5UwYdfdhbWnWDAFZJXmhRpv", "pbZNQfZIEs1SNcZO0zs6qP5OkaISQtwt", "4zG9yYWQyQveu", "FYvUEoMpOg3hka6RJqEpZvWO8PPoRHV2", "9FscUhrcId3cAgtAb5GJ6Xt6AS7cgtAq", "aj4E6w0PUq5nqaq6dNrKw553aukh9OQl", "389BeR8VkLVuOX9G1z", "f1lnET0"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A03(byte[] bArr, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        com.facebook.ads.redexgen.core.I3 i3A04 = A04(bArr);
        i3A04.A08(60);
        int i = A02[i3A04.A04(6)];
        int i2 = A03[i3A04.A04(4)];
        int iA04 = i3A04.A04(5);
        int i3 = iA04 >= A04.length ? -1 : (A04[iA04] * 1000) / 2;
        i3A04.A08(10);
        int iA05 = i3A04.A04(2);
        if (A01[3].charAt(5) == 'P') {
            throw new java.lang.RuntimeException();
        }
        A01[4] = "MuH0kIyyozsoWddCoQuVDTZonM6AA1pg";
        return com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(str, A05(0, 13, 75), null, i3, -1, i + (iA05 > 0 ? 1 : 0), i2, null, drmInitData, 0, str2);
    }

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{29, 49, 32, 37, 43, -21, 50, 42, 32, -22, 32, 48, 47};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, com.json.mediationsdk.utils.IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(java.nio.ByteBuffer byteBuffer) {
        int nblks;
        int iPosition = byteBuffer.position();
        int position = byteBuffer.get(iPosition);
        switch (position) {
            case -2:
                int position2 = iPosition + 5;
                int i = (byteBuffer.get(position2) & 1) << 6;
                int position3 = iPosition + 4;
                nblks = i | ((byteBuffer.get(position3) & 252) >> 2);
                break;
            case -1:
                int position4 = iPosition + 4;
                int i2 = (byteBuffer.get(position4) & 7) << 4;
                int position5 = iPosition + 7;
                nblks = i2 | ((byteBuffer.get(position5) & 60) >> 2);
                break;
            case 31:
                int position6 = iPosition + 5;
                int i3 = (byteBuffer.get(position6) & 7) << 4;
                int position7 = iPosition + 6;
                nblks = i3 | ((byteBuffer.get(position7) & 60) >> 2);
                break;
            default:
                int position8 = iPosition + 4;
                int i4 = (byteBuffer.get(position8) & 1) << 6;
                int position9 = iPosition + 5;
                nblks = i4 | ((byteBuffer.get(position9) & 252) >> 2);
                break;
        }
        int position10 = nblks + 1;
        return position10 * 32;
    }

    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003c  */
    public static int A01(byte[] bArr) {
        int i;
        boolean z = false;
        switch (bArr[0]) {
            case -2:
                int i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
                byte b = bArr[6];
                if (A01[3].charAt(5) != 'P') {
                    A01[2] = "NpAlLABwFQFe5";
                    i = (i2 | ((b & 240) >> 4)) + 1;
                    if (z) {
                        return (i * 16) / 14;
                    }
                    return i;
                }
                throw new java.lang.RuntimeException();
            case -1:
                i = (((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[9] & 60) >> 2)) + 1;
                z = true;
                if (z) {
                    return (i * 16) / 14;
                }
                return i;
            case 31:
                i = (((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                z = true;
                if (z) {
                    return (i * 16) / 14;
                }
                return i;
            default:
                int i3 = (bArr[5] & 3) << 12;
                int i4 = (bArr[6] & 255) << 4;
                if (A01[4].charAt(12) != 'K') {
                    java.lang.String[] strArr = A01;
                    strArr[6] = "PlfY379TAwnazPRd5q";
                    strArr[7] = "VbrLe8k";
                    i = (i3 | i4 | ((bArr[7] & 240) >> 4)) + 1;
                    if (z) {
                        return (i * 16) / 14;
                    }
                    return i;
                }
                throw new java.lang.RuntimeException();
        }
    }

    public static int A02(byte[] bArr) {
        int i;
        switch (bArr[0]) {
            case -2:
                int nblks = bArr[5];
                i = ((nblks & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case 31:
                i = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                i = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
                break;
        }
        int nblks2 = i + 1;
        return nblks2 * 32;
    }

    public static com.facebook.ads.redexgen.core.I3 A04(byte[] bArr) {
        if (bArr[0] == 127) {
            return new com.facebook.ads.redexgen.core.I3(bArr);
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        if (A08(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b = bArrCopyOf[i];
                bArrCopyOf[i] = bArrCopyOf[i + 1];
                bArrCopyOf[i + 1] = b;
            }
        }
        com.facebook.ads.redexgen.core.I3 i3 = new com.facebook.ads.redexgen.core.I3(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            com.facebook.ads.redexgen.core.I3 i4 = new com.facebook.ads.redexgen.core.I3(bArrCopyOf);
            while (i4.A01() >= 16) {
                i4.A08(2);
                i3.A0A(i4.A04(14), 14);
            }
        }
        i3.A0B(bArrCopyOf);
        if (A01[3].charAt(5) == 'P') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[5] = "MmKi7b0sfZEENPZj4CT4hoOnJABUQCnv";
        strArr[1] = "HlEGlOBrKKriZ52mssjH9VMTQOaRBxBc";
        return i3;
    }

    public static boolean A07(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}

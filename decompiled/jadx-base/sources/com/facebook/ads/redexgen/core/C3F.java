package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3F extends com.facebook.ads.redexgen.core.AbstractC04826m {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static java.lang.String[] A0e = {"fuys41f8j9BIjf0ojt2fedQJMaOEhMwL", "PJI4NwGTXGhhOseE8AdytzgV4W1vFRln", "ZI4O58SZr", "GtHuMq8nY", "xDwAiZeXcZ6", "vfnsljbbJviNAIXV47dAQ3sPmg0uZR96", "Ds4ataWgSEjd51xojrpdxC", "aNF7Ng"};
    public static final int[] A0f;
    public com.facebook.ads.redexgen.core.IV A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public android.view.Surface A0N;
    public android.view.Surface A0O;
    public com.facebook.ads.redexgen.core.IU A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final android.content.Context A0V;
    public final com.facebook.ads.redexgen.core.IY A0W;
    public final com.facebook.ads.redexgen.core.C0758Ih A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static android.graphics.Point A02(com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.DU {
        boolean z = format.A08 > format.A0F;
        int i = z ? format.A08 : format.A0F;
        int i2 = z ? format.A0F : format.A08;
        float f = i2 / i;
        for (int i3 : A0f) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (com.facebook.ads.redexgen.core.IK.A02 >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                android.graphics.Point pointA0E = dl.A0E(i5, i3);
                if (dl.A0H(pointA0E.x, pointA0E.y, format.A01)) {
                    return pointA0E;
                }
            } else {
                int iA04 = com.facebook.ads.redexgen.core.IK.A04(i3, 16) * 16;
                int iA05 = com.facebook.ads.redexgen.core.IK.A04(i4, 16) * 16;
                if (iA04 * iA05 <= com.facebook.ads.redexgen.core.DW.A00()) {
                    int i6 = z ? iA05 : iA04;
                    if (!z) {
                        iA04 = iA05;
                    }
                    return new android.graphics.Point(i6, iA04);
                }
            }
        }
        return null;
    }

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0d = new byte[]{71, 64, 70, 71, 10, 12, 10, 8, 60, 58, 60, 57, okio.Utf8.REPLACEMENT_BYTE, 79, 78, 83, 73, 78, 56, 49, 65, 70, 64, 65, 66, 49, 51, 50, 53, 98, 55, 51, 29, 107, 108, 108, 108, 113, kotlin.io.encoding.Base64.padSymbol, 110, 24, 31, 31, 31, 95, 67, 90, 92, 71, 49, 54, 55, 54, 103, 50, 62, 41, 95, 88, 90, 88, 9, 92, 80, 25, 30, 12, 25, 49, 54, 36, 62, 47, 40, 58, kotlin.io.encoding.Base64.padSymbol, 64, 108, 96, 123, 110, 111, 77, 125, 121, 109, 92, 99, 123, 105, 126, 65, 100, 80, 87, 68, 122, 107, 74, 81, 64, 122, 23, 9, 7, 10, 8, 0, 102, 122, 19, 12, 28, 15, 24, 7, 15, 110, 122, 5, 110, 124, 126, 127, 123, 14, 30, 13, 26, 5, 13, 19, 13, 24, 26, 126, 58, 72, 7, 20, 124, 114, 115, 114, 27, 13, 116, 118, 50, 33, 57, 64, 71, 65, 72, 86, 69, 76, 45, 38, 74, 92, 37, 37, 1, 45, 38, 39, 33, 98, 47, 35, 58, 98, 48, 39, 49, 45, 46, 55, 54, 43, 45, 44, 98, 35, 38, 40, 55, 49, 54, 39, 38, 98, 54, 45, 120, 98, 109, 65, 67, 71, 65, 125, 31, 54, 70, 69, 71, 64, 45, 36, kotlin.io.encoding.Base64.padSymbol, 47, 41, 55, 41, 91, 55, 56, 26, 7, 69, 76, 85, 71, 65, 95, 78, 111, 116, 101, 51, 58, 35, 49, 55, 41, 38, 4, 31, 27, 98, 107, 114, 96, 102, 120, 117, 70, 94, 120, 127, 107, 88, 75, 92, 125, 90, 79, 92, 113, 125, 30, 107, 105, 105, 105, 126, 11, 9, 9, 11, 88, 45, 47, 47, 40, 18, 103, 102, 101, 101, 19, 102, 103, 100, 102, 69, 48, 49, 50, 54, 22, 99, 99, 97, 97, 123, 92, 81, 78, 88, 126, 85, 88, 94, 86, 29, 102, 81, 88, 90, 92, 94, 68, 123, 79, 92, 80, 88, 110, 84, 71, 88, 17, 29, 80, 94, 88, 89, 82, 82, 72, 80, 85, 91, 32, 36, 33, 39, 93, 83, 85, 84, 95, 95, 69, 73, 77, 77, 43, 44, 42, 35, 33, 47, 41, 40, 35, 35, 57, 53, 49, 49, 87, 80, 84, 81, 80, 94, 88, 89, 82, 82, 72, 68, 64, 64, 38, 33, 36, 38, 107, 101, 99, 98, 105, 105, 115, 123, 110, 96, 25, 27, 28, 20, 43, 37, 35, 34, 41, 41, 51, 59, 46, 32, 91, 95, 90, 89, 24, 22, 16, 17, 26, 26, 0, 8, 29, 19, 104, 106, 110, 102, 118, 88, 126, 127, 116, 116, 110, 114, 115, 125, 6, 4, 0, 2, 104, 70, 96, 97, 106, 106, 112, 104, 109, 99, 24, 28, 30, 22, 1, 30, 11, 5, 7, 100, 1, 71, 88, 76, 78, 66, 34, 71, 69, 90, 91, 67, 94, 32, 69, 105, 78, 70, 73, 78, 73, 88, 13, 120, 21, 23, 18, 49, 60, 33, 59, 69, 64, 17, 68, 64, 49, 60, 41, 53, 45, 51, 97, 126, 0, 24, 29, 28, 26, 85, 45, 123, 14, 6, 10, 25, 22, 28, 14, 118, 42, okio.Utf8.REPLACEMENT_BYTE, 81, 11, 35, 34, 47, 39, 5, 41, 34, 35, 37, 16, 47, 34, 35, 41, 20, 35, 40, 34, 35, 52, 35, 52, 112, 104, 119, 122, 119, 127, 6, 16, 125, 124, 121, 2, 82, 68, 41, 43, 47, 86, 103, 101, 112, 6, 79, 71, 71, 79, 68, 77, 121, 88, 83, 102, 90, 67, 69, 3, 98, 51, 85, 91, 82, 0, 104, 101, 24, 10, 122, 101, 126, 127, 120, 5, 16, 7, 14, 117, 114, 120, 0, 23, 30, 102, 97, 96, 125, 106, 99, 27, 28, 28, 108, 112, 121, 26, 24, 5, 125, 25, 45, 21, 28, 19, 9, 18, 16, 75, 29, 36, 53, 36, 121, 96, 122, 18, 126, 10, 123, 66, 83, 66, 30, 6, 26, 27, 116, 31, 108, 117, 23, 17, 20, 126, 27, 29, 25, 31, 55, 82, 84, 81, 48, 85, 82, 80, 81, 117, 17, 80, 76, 48, 55, 89, 68, 94, 84, 6, 15, 102, 98, 85, 67, 95, 92, 69, 68, 89, 95, 94, 67, 16, 69, 94, 91, 94, 95, 71, 94, 30, 16, 115, 95, 84, 85, 83, 16, 93, 81, 72, 16, 66, 85, 67, 95, 92, 69, 68, 89, 95, 94, 10, 16, 69, 64, 70, 59, 82, 66, 64, 39, 35, 108, 83, 94, 75, 90, 96, 111, 77, 80, 69, 83, 34, 60, 38, 34, 33, 87, 39, 49, 64, 94, 68, 64, 67, 43, 91, 77, 60, 34, 55, 58, okio.Utf8.REPLACEMENT_BYTE, 73, 98, 116, 5, 27, 14, 3, 6, 123, 49, 10, 10, 69, 8, 4, 11, 28, 69, 22, 17, 23, 0, 4, 8, 69, 6, 13, 4, 11, 2, 0, 22, 73, 69, 22, 10, 69, 1, 23, 10, 21, 21, 12, 11, 2, 69, 10, 3, 3, 22, 0, 17, 95, 69, 104, 15, 120, 28, 29, 105, 108, 96, 3, 127, 20, 120, 111, 108, 112, 109, 26, 112, 50, 62, 91, 92, 92, 89, 56, 83, 80, kotlin.io.encoding.Base64.padSymbol, 50, 48, 45, 56, 90, 82, 9, 99, 30, 101, 74, 94, 79, 66, 68, 6, 88, 78, 88, 88, 66, 68, 69, 6, 66, 79, 113, 101, 100, 127, kotlin.io.encoding.Base64.padSymbol, 118, 98, 115, 46, okio.Utf8.REPLACEMENT_BYTE, 34, kotlin.io.encoding.Base64.padSymbol, 96, 47, 34, 57, 57, 34, 32, 118, 103, 122, 101, 56, 121, 112, 115, 97, 69, 84, 73, 86, 11, 84, 79, 65, 78, 82, 59, 42, 55, 40, 117, 44, 55, 40, 96, 117, 50, 35, 54, 115, 68, 69, 66, 105, 127, 98, 125, 91, 100, 105, 104, 98, 79, 120, 107, 107, 104, 127, 123, 113, 114, 34, 43, 55, 48, 33, 54, 23, 3, 16, 28, 20, 92, 3, 16, 5, 20, 121, 108, 119, 120, 120, 119, 112, 31, 18, 30, 16, 31, 3, 69, 89, 78, 114, 72, 24, 27, 64, 65, 114, 73, 89, 88, 65, 111, 112, 70, 75, 66, 42, 79, 22, 29, 
        30, 19, 19, 71, 72, 76, 74, 32, 70, 71, 79, 73, 77, 86, 77, 87, 18, 20, 117, 104, 121, 112, 67, 79, 40, 45, 36, 124, 54, 34, 58, 43, 39, 32, kotlin.io.encoding.Base64.padSymbol, 109, 100, 94, 121, 55, 67, 79, 64, 64, 71, 64, 73, 82, 94, 77, 86, 81, 80, 96, 89, 86, 90, 67, 22, 83, 94, 82, 92, 83, 79, 54, 58, 35, 118, 50, 53, 43, 46, 47, 118, 40, 50, 33, 62, 46, 34, 59, 110, 52, 42, 39, 55, 43, 43, 46, 3, 7, 10, 1, 84, 80, 84, 92, 33, 46, 34, 46, 59, 39, 68, 67, 73, 65, 70, 75, 95, 89, 117, 76, 62, 124, 127, 124, 124, 109, 98, 105, 96, 96, 83, 104, 101, 116, 123, 112, 121, 121, 74, 113, 121, 26, 11, 4, 15, 6, 6, 53, 14, 25, 30, 15, 0, 11, 2, 2, 49, 10, 26, 119, 117, 110, 104, 117, 110, 115, 126, 7, 16, 25, 16, 20, 6, 16, 58, 0, 1, 5, 0, 1, 55, 0, 19, 19, 16, 7, 88, 69, 94, 75, 94, 67, 69, 68, 7, 78, 79, 77, 88, 79, 79, 89, 67, 9, 0, 5, 72, 0, 1, 8, 54, 36, 43, 49, 42, 43, 44, 29, 5, 7, 30, 56, 7, 10, 11, 1, 44, 27, 8, 8, 11, 28, 91, 78, 70, 75, 64, 112, 93, 64, 88, 20, 3, 12, okio.Utf8.REPLACEMENT_BYTE, 5, 21, 41, 40, 51, 51, 56, 49, 56, 57, 112, 45, 49, 60, 36, okio.Utf8.REPLACEMENT_BYTE, 60, 62, 54, 98, 113, 102, 122, 113, 113, 75, 89, 33, 39, 56, 53, 52, 62, 126, 98, 54, 33, 33, 85, 74, 71, 70, 76, 12, 66, 85, 64, 41, 54, 59, 58, 48, 112, 55, 58, 41, 60, 127, 96, 109, 108, 102, 38, 100, 121, kotlin.io.encoding.Base64.padSymbol, 127, 36, 108, 122, 90, 69, 72, 73, 67, 3, 84, 1, 90, 66, 72, 2, 67, 66, 30, 2, 90, 92, 20, 103, 120, 117, 116, 126, 62, 105, 60, 103, 127, 117, okio.Utf8.REPLACEMENT_BYTE, 126, 127, 35, okio.Utf8.REPLACEMENT_BYTE, 103, 97, 40, 10, 28, 9, 14, 18, 19, 37, 58, 43, 32, 55, 54, 22, 8, 5, 21, 9, 71, 95, 95, 84, 67, 111, 86, 121, 97, 97, 106, 125, 81, 104, 96, 92};
    }

    static {
        A0D();
        A0f = new int[]{1920, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3F(android.content.Context context, com.facebook.ads.redexgen.core.DR dr, long j, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, boolean z, android.os.Handler handler, com.facebook.ads.redexgen.core.Ii ii, int i) {
        super(2, dr, interfaceC0593Bh, z);
        this.A0U = j;
        this.A0T = i;
        this.A0V = context.getApplicationContext();
        this.A0W = new com.facebook.ads.redexgen.core.IY(this.A0V);
        this.A0X = new com.facebook.ads.redexgen.core.C0758Ih(handler, ii);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = androidx.media3.common.C.TIME_UNSET;
        this.A0K = androidx.media3.common.C.TIME_UNSET;
        this.A0J = androidx.media3.common.C.TIME_UNSET;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        if (format.A09 != -1) {
            int i = 0;
            int i2 = format.A0P.size();
            for (int initializationDataCount = 0; initializationDataCount < i2; initializationDataCount++) {
                int totalInitializationDataSize = format.A0P.get(initializationDataCount).length;
                i += totalInitializationDataSize;
            }
            int i3 = format.A09;
            int initializationDataCount2 = A0e[2].length();
            if (initializationDataCount2 == 7) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0e;
            strArr[5] = "S79s7r8SM52UI34VQboE4fV4gdsMwFqf";
            strArr[0] = "NRJssXnBH8bGWFbqvXTszxRoESb4kgsb";
            return i3 + i;
        }
        return A01(dl, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0011 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:8:0x000d  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r5.A05 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(com.facebook.ads.redexgen.core.DL dl, java.lang.String str, int i, int i2) {
        byte b;
        int iA04;
        int maxPixels;
        java.lang.String[] strArr;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(A05(1267, 10, 86))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (!A05(111, 14, 73).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                            if (A05(76, 6, 6).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!A05(495, 6, 125).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    if (A05(72, 4, 105).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    }
                                }
                            }
                            iA04 = com.facebook.ads.redexgen.core.IK.A04(i, 16) * com.facebook.ads.redexgen.core.IK.A04(i2, 16) * 16 * 16;
                            maxPixels = 2;
                            break;
                        }
                        return -1;
                    case 3:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA04 = i * i2;
                        strArr = A0e;
                        if (strArr[7].length() != strArr[4].length()) {
                            A0e[1] = "1RLm";
                            maxPixels = 4;
                        } else {
                            java.lang.String[] strArr2 = A0e;
                            strArr2[5] = "H3msJlExFpOBdKNSTKeEsMnF6hk9coPV";
                            strArr2[0] = "27VsHRld9A6RakFrq452rPI1Yf083t4U";
                            maxPixels = 2;
                        }
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio = iA04 * 3;
                return minCompressionRatio / (maxPixels * 2);
            case -1662541442:
                if (str.equals(A05(1286, 10, 88))) {
                    b = 4;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (!A05(111, 14, 73).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                            if (A05(76, 6, 6).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!A05(495, 6, 125).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    if (A05(72, 4, 105).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    }
                                }
                            }
                            iA04 = com.facebook.ads.redexgen.core.IK.A04(i, 16) * com.facebook.ads.redexgen.core.IK.A04(i2, 16) * 16 * 16;
                            maxPixels = 2;
                            break;
                        }
                        return -1;
                    case 3:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA04 = i * i2;
                        strArr = A0e;
                        if (strArr[7].length() != strArr[4].length()) {
                            A0e[1] = "1RLm";
                            maxPixels = 4;
                        } else {
                            java.lang.String[] strArr3 = A0e;
                            strArr3[5] = "H3msJlExFpOBdKNSTKeEsMnF6hk9coPV";
                            strArr3[0] = "27VsHRld9A6RakFrq452rPI1Yf083t4U";
                            maxPixels = 2;
                        }
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio2 = iA04 * 3;
                return minCompressionRatio2 / (maxPixels * 2);
            case 1187890754:
                if (A0e[1].length() != 31) {
                    java.lang.String[] strArr4 = A0e;
                    strArr4[5] = "uV3sVt3QbqOzajwVjlIZafpQqtm4YN1y";
                    strArr4[0] = "E8JsDy1X5CWKdFXohui0hPD39o2Jluxi";
                    if (str.equals(A05(1296, 13, 14))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            iA04 = i * i2;
                            maxPixels = 2;
                            break;
                        case 2:
                            if (!A05(111, 14, 73).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                if (A05(76, 6, 6).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                    if (!A05(495, 6, 125).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                        if (A05(72, 4, 105).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                        }
                                    }
                                }
                                iA04 = com.facebook.ads.redexgen.core.IK.A04(i, 16) * com.facebook.ads.redexgen.core.IK.A04(i2, 16) * 16 * 16;
                                maxPixels = 2;
                                break;
                            }
                            return -1;
                        case 3:
                            iA04 = i * i2;
                            maxPixels = 2;
                            break;
                        case 4:
                        case 5:
                            iA04 = i * i2;
                            strArr = A0e;
                            if (strArr[7].length() != strArr[4].length()) {
                                A0e[1] = "1RLm";
                                maxPixels = 4;
                            } else {
                                java.lang.String[] strArr5 = A0e;
                                strArr5[5] = "H3msJlExFpOBdKNSTKeEsMnF6hk9coPV";
                                strArr5[0] = "27VsHRld9A6RakFrq452rPI1Yf083t4U";
                                maxPixels = 2;
                            }
                            break;
                        default:
                            return -1;
                    }
                    int minCompressionRatio3 = iA04 * 3;
                    return minCompressionRatio3 / (maxPixels * 2);
                }
                throw new java.lang.RuntimeException();
            case 1331836730:
                if (str.equals(A05(1277, 9, 36))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (!A05(111, 14, 73).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                            if (A05(76, 6, 6).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!A05(495, 6, 125).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    if (A05(72, 4, 105).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    }
                                }
                            }
                            iA04 = com.facebook.ads.redexgen.core.IK.A04(i, 16) * com.facebook.ads.redexgen.core.IK.A04(i2, 16) * 16 * 16;
                            maxPixels = 2;
                            break;
                        }
                        return -1;
                    case 3:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA04 = i * i2;
                        strArr = A0e;
                        if (strArr[7].length() != strArr[4].length()) {
                            A0e[1] = "1RLm";
                            maxPixels = 4;
                        } else {
                            java.lang.String[] strArr6 = A0e;
                            strArr6[5] = "H3msJlExFpOBdKNSTKeEsMnF6hk9coPV";
                            strArr6[0] = "27VsHRld9A6RakFrq452rPI1Yf083t4U";
                            maxPixels = 2;
                        }
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio4 = iA04 * 3;
                return minCompressionRatio4 / (maxPixels * 2);
            case 1599127256:
                if (str.equals(A05(1309, 19, 43))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (!A05(111, 14, 73).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                            if (A05(76, 6, 6).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!A05(495, 6, 125).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    if (A05(72, 4, 105).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    }
                                }
                            }
                            iA04 = com.facebook.ads.redexgen.core.IK.A04(i, 16) * com.facebook.ads.redexgen.core.IK.A04(i2, 16) * 16 * 16;
                            maxPixels = 2;
                            break;
                        }
                        return -1;
                    case 3:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA04 = i * i2;
                        strArr = A0e;
                        if (strArr[7].length() != strArr[4].length()) {
                            A0e[1] = "1RLm";
                            maxPixels = 4;
                        } else {
                            java.lang.String[] strArr7 = A0e;
                            strArr7[5] = "H3msJlExFpOBdKNSTKeEsMnF6hk9coPV";
                            strArr7[0] = "27VsHRld9A6RakFrq452rPI1Yf083t4U";
                            maxPixels = 2;
                        }
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio5 = iA04 * 3;
                return minCompressionRatio5 / (maxPixels * 2);
            case 1599127257:
                if (str.equals(A05(1328, 19, 22))) {
                    b = 5;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (!A05(111, 14, 73).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                            if (A05(76, 6, 6).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!A05(495, 6, 125).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    if (A05(72, 4, 105).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    }
                                }
                            }
                            iA04 = com.facebook.ads.redexgen.core.IK.A04(i, 16) * com.facebook.ads.redexgen.core.IK.A04(i2, 16) * 16 * 16;
                            maxPixels = 2;
                            break;
                        }
                        return -1;
                    case 3:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA04 = i * i2;
                        strArr = A0e;
                        if (strArr[7].length() != strArr[4].length()) {
                            A0e[1] = "1RLm";
                            maxPixels = 4;
                        } else {
                            java.lang.String[] strArr8 = A0e;
                            strArr8[5] = "H3msJlExFpOBdKNSTKeEsMnF6hk9coPV";
                            strArr8[0] = "27VsHRld9A6RakFrq452rPI1Yf083t4U";
                            maxPixels = 2;
                        }
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio6 = iA04 * 3;
                return minCompressionRatio6 / (maxPixels * 2);
            default:
                b = -1;
                switch (b) {
                    case 0:
                    case 1:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 2:
                        if (!A05(111, 14, 73).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                            if (A05(76, 6, 6).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!A05(495, 6, 125).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    if (A05(72, 4, 105).equals(com.facebook.ads.redexgen.core.IK.A06)) {
                                    }
                                }
                            }
                            iA04 = com.facebook.ads.redexgen.core.IK.A04(i, 16) * com.facebook.ads.redexgen.core.IK.A04(i2, 16) * 16 * 16;
                            maxPixels = 2;
                            break;
                        }
                        return -1;
                    case 3:
                        iA04 = i * i2;
                        maxPixels = 2;
                        break;
                    case 4:
                    case 5:
                        iA04 = i * i2;
                        strArr = A0e;
                        if (strArr[7].length() != strArr[4].length()) {
                            A0e[1] = "1RLm";
                            maxPixels = 4;
                        } else {
                            java.lang.String[] strArr9 = A0e;
                            strArr9[5] = "H3msJlExFpOBdKNSTKeEsMnF6hk9coPV";
                            strArr9[0] = "27VsHRld9A6RakFrq452rPI1Yf083t4U";
                            maxPixels = 2;
                        }
                        break;
                    default:
                        return -1;
                }
                int minCompressionRatio7 = iA04 * 3;
                return minCompressionRatio7 / (maxPixels * 2);
        }
    }

    private final android.media.MediaFormat A03(com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.redexgen.core.IU iu, boolean z, int i) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString(A05(1094, 4, 62), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 102), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 112), format.A08);
        com.facebook.ads.redexgen.core.DX.A06(mediaFormat, format.A0P);
        com.facebook.ads.redexgen.core.DX.A03(mediaFormat, A05(954, 10, 118), format.A01);
        com.facebook.ads.redexgen.core.DX.A04(mediaFormat, A05(1180, 16, 45), format.A0B);
        com.facebook.ads.redexgen.core.DX.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 68), iu.A02);
        mediaFormat.setInteger(A05(1055, 10, 60), iu.A00);
        com.facebook.ads.redexgen.core.DX.A04(mediaFormat, A05(1065, 14, 92), iu.A01);
        if (com.facebook.ads.redexgen.core.IK.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 0), 0);
        }
        if (z) {
            mediaFormat.setInteger(A05(875, 8, 23), 0);
        }
        if (i != 0) {
            A0K(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    private final com.facebook.ads.redexgen.core.IU A04(com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr) throws com.facebook.ads.redexgen.core.DU {
        int maxWidth;
        int iMax = format.A0F;
        int iMax2 = format.A08;
        int iA00 = A00(dl, format);
        int maxHeight = formatArr.length;
        if (maxHeight == 1) {
            return new com.facebook.ads.redexgen.core.IU(iMax, iMax2, iA00);
        }
        int i = 0;
        for (com.facebook.ads.internal.exoplayer2.thirdparty.Format format2 : formatArr) {
            if (A0V(dl.A03, format, format2)) {
                int maxWidth2 = format2.A0F;
                if (maxWidth2 != -1) {
                    int maxWidth3 = format2.A08;
                    if (maxWidth3 == -1) {
                        maxWidth = 1;
                    } else {
                        maxWidth = 0;
                    }
                } else {
                    maxWidth = 1;
                }
                i |= maxWidth;
                int maxWidth4 = format2.A0F;
                iMax = java.lang.Math.max(iMax, maxWidth4);
                int maxWidth5 = format2.A08;
                iMax2 = java.lang.Math.max(iMax2, maxWidth5);
                int maxWidth6 = A00(dl, format2);
                iA00 = java.lang.Math.max(iA00, maxWidth6);
            }
        }
        if (i != 0) {
            java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A05(683, 43, 55)).append(iMax);
            java.lang.String strA05 = A05(1379, 1, 35);
            java.lang.String string = sbAppend.append(strA05).append(iMax2).toString();
            java.lang.String strA06 = A05(522, 23, 65);
            android.util.Log.w(strA06, string);
            android.graphics.Point pointA02 = A02(dl, format);
            if (pointA02 != null) {
                int maxWidth7 = pointA02.x;
                iMax = java.lang.Math.max(iMax, maxWidth7);
                int maxWidth8 = pointA02.y;
                iMax2 = java.lang.Math.max(iMax2, maxWidth8);
                int maxWidth9 = A01(dl, format.A0O, iMax, iMax2);
                iA00 = java.lang.Math.max(iA00, maxWidth9);
                android.util.Log.w(strA06, A05(org.objectweb.asm.Opcodes.IF_ICMPLE, 34, 69) + iMax + strA05 + iMax2);
            }
        }
        return new com.facebook.ads.redexgen.core.IU(iMax, iMax2, iA00);
    }

    private void A06() {
        android.media.MediaCodec mediaCodecA1D;
        this.A0R = false;
        if (com.facebook.ads.redexgen.core.IK.A02 >= 23 && this.A0S && (mediaCodecA1D = A1D()) != null) {
            this.A00 = new com.facebook.ads.redexgen.core.IV(this, mediaCodecA1D);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long now = this.A0H;
            long elapsedMs = jElapsedRealtime - now;
            this.A0X.A02(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0H = jElapsedRealtime;
        }
    }

    private void A09() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != this.A08 || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            this.A0X.A01(this.A08, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        if (this.A0E != -1 || this.A0C != -1) {
            this.A0X.A01(this.A0E, this.A0C, this.A0D, this.A03);
        }
    }

    private void A0C() {
        long jElapsedRealtime;
        if (this.A0U > 0) {
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + this.A0U;
        } else {
            jElapsedRealtime = androidx.media3.common.C.TIME_UNSET;
        }
        this.A0J = jElapsedRealtime;
    }

    private final void A0E(int i) {
        super.A0U.A02 += i;
        this.A09 += i;
        this.A05 += i;
        super.A0U.A05 = java.lang.Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(android.media.MediaCodec mediaCodec, int i, long j) {
        com.facebook.ads.redexgen.core.IH.A02(A05(930, 15, 10));
        mediaCodec.releaseOutputBuffer(i, false);
        com.facebook.ads.redexgen.core.IH.A00();
        A0E(1);
    }

    private final void A0G(android.media.MediaCodec mediaCodec, int i, long j) {
        A09();
        com.facebook.ads.redexgen.core.IH.A02(A05(1161, 19, 114));
        mediaCodec.releaseOutputBuffer(i, true);
        com.facebook.ads.redexgen.core.IH.A00();
        this.A0L = android.os.SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    private final void A0H(android.media.MediaCodec mediaCodec, int i, long j) {
        com.facebook.ads.redexgen.core.IH.A02(A05(1211, 15, 105));
        mediaCodec.releaseOutputBuffer(i, false);
        com.facebook.ads.redexgen.core.IH.A00();
        super.A0U.A08++;
    }

    private final void A0I(android.media.MediaCodec mediaCodec, int i, long j, long j2) {
        A09();
        com.facebook.ads.redexgen.core.IH.A02(A05(1161, 19, 114));
        mediaCodec.releaseOutputBuffer(i, j2);
        com.facebook.ads.redexgen.core.IH.A00();
        this.A0L = android.os.SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    public static void A0J(android.media.MediaCodec mediaCodec, android.view.Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public static void A0K(android.media.MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 90), true);
        mediaFormat.setInteger(A05(859, 16, 44), i);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    private void A0L(android.view.Surface surface) throws com.facebook.ads.redexgen.core.C05449h {
        if (surface == null) {
            if (this.A0N != null) {
                surface = this.A0N;
            } else {
                com.facebook.ads.redexgen.core.DL dlA1E = A1E();
                if (dlA1E != null) {
                    boolean zA0T = A0T(dlA1E);
                    java.lang.String[] strArr = A0e;
                    if (strArr[7].length() != strArr[4].length()) {
                        A0e[2] = "GRrSCiGb3HJ0IgtaAsL7ex7K0T";
                        if (zA0T) {
                            this.A0N = com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A01(this.A0V, dlA1E.A05);
                            surface = this.A0N;
                        }
                    } else {
                        A0e[3] = "cuC7HyH7q";
                        if (zA0T) {
                            this.A0N = com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A01(this.A0V, dlA1E.A05);
                            surface = this.A0N;
                        }
                    }
                }
            }
        }
        if (this.A0O != surface) {
            this.A0O = surface;
            int iA8P = A8P();
            if (A0e[6].length() != 32) {
                A0e[6] = "";
                if (iA8P == 1 || iA8P == 2) {
                    android.media.MediaCodec mediaCodecA1D = A1D();
                    if (com.facebook.ads.redexgen.core.IK.A02 >= 23 && mediaCodecA1D != null && surface != null && !this.A0Q) {
                        A0J(mediaCodecA1D, surface);
                    } else {
                        A1H();
                        A1J();
                    }
                }
                if (surface != null && surface != this.A0N) {
                    A0B();
                    A06();
                    if (iA8P == 2) {
                        A0C();
                        return;
                    }
                    return;
                }
                A07();
                if (A0e[2].length() != 7) {
                    A0e[1] = "YrtVfn3T33";
                    A06();
                    return;
                }
            }
            throw new java.lang.RuntimeException();
        }
        if (surface == null || surface == this.A0N) {
            return;
        }
        A0B();
        A0A();
    }

    public static boolean A0M() {
        return com.facebook.ads.redexgen.core.IK.A02 <= 22 && A05(948, 6, 67).equals(com.facebook.ads.redexgen.core.IK.A03) && A05(545, 6, 57).equals(com.facebook.ads.redexgen.core.IK.A05);
    }

    public static boolean A0N(long j) {
        return j < -30000;
    }

    public static boolean A0O(long j) {
        return j < -500000;
    }

    private final boolean A0P(long j, long j2) {
        return A0O(j);
    }

    private final boolean A0Q(long j, long j2) {
        return A0N(j);
    }

    private final boolean A0R(long j, long j2) {
        return A0N(j) && j2 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean A0S(android.media.MediaCodec mediaCodec, int i, long j, long j2) throws com.facebook.ads.redexgen.core.C05449h {
        int iA10 = A10(j2);
        if (iA10 == 0) {
            return false;
        }
        com.facebook.ads.redexgen.core.BH bh = super.A0U;
        int droppedSourceBufferCount = bh.A03;
        bh.A03 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0E(droppedSourceBufferCount2 + iA10);
        A1G();
        return true;
    }

    private boolean A0T(com.facebook.ads.redexgen.core.DL dl) {
        if (com.facebook.ads.redexgen.core.IK.A02 >= 23) {
            boolean z = this.A0S;
            java.lang.String[] strArr = A0e;
            if (strArr[7].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A0e[2] = "tXI8HpJUcx6aHgbV0xWZv";
            if (!z && !A0U(dl.A02) && (!dl.A05 || com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A05(this.A0V))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:368:0x0904  */
    /* JADX WARN: Code duplicated, block: B:382:0x0939  */
    private final boolean A0U(java.lang.String str) {
        byte b = 0;
        byte b2 = 27;
        if (com.facebook.ads.redexgen.core.IK.A02 >= 27 || str.startsWith(A05(563, 10, 47))) {
            return false;
        }
        synchronized (com.facebook.ads.redexgen.core.C3F.class) {
            if (!A0c) {
                java.lang.String str2 = com.facebook.ads.redexgen.core.IK.A03;
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (!str2.equals(A05(341, 14, 29))) {
                            b2 = -1;
                        } else {
                            b2 = 39;
                        }
                        break;
                    case -2144781185:
                        if (!str2.equals(A05(355, 14, 97))) {
                            b2 = -1;
                        } else {
                            b2 = 40;
                        }
                        break;
                    case -2144781160:
                        if (!str2.equals(A05(369, 14, 16))) {
                            b2 = -1;
                        } else {
                            b2 = 41;
                        }
                        break;
                    case -2097309513:
                        if (!str2.equals(A05(489, 6, 119))) {
                            b2 = -1;
                        } else {
                            b2 = 57;
                        }
                        break;
                    case -2022874474:
                        if (!str2.equals(A05(138, 10, 67))) {
                            b2 = -1;
                        } else {
                            b2 = 16;
                        }
                        break;
                    case -1978993182:
                        if (!str2.equals(A05(551, 6, 79))) {
                            b2 = -1;
                        } else {
                            b2 = 69;
                        }
                        break;
                    case -1978990237:
                        if (!str2.equals(A05(557, 6, 27))) {
                            b2 = -1;
                        } else {
                            b2 = 70;
                        }
                        break;
                    case -1936688988:
                        if (!str2.equals(A05(597, 6, 71))) {
                            b2 = -1;
                        } else {
                            b2 = 80;
                        }
                        break;
                    case -1936688066:
                        if (!str2.equals(A05(603, 6, 87))) {
                            b2 = -1;
                        } else {
                            b2 = 81;
                        }
                        break;
                    case -1936688065:
                        if (!str2.equals(A05(609, 6, 42))) {
                            b2 = -1;
                        } else {
                            b2 = 82;
                        }
                        break;
                    case -1931988508:
                        if (!str2.equals(A05(82, 10, 11))) {
                            b2 = -1;
                        } else {
                            b2 = 10;
                        }
                        break;
                    case -1696512866:
                        if (!str2.equals(A05(839, 6, 109))) {
                            b2 = -1;
                        } else {
                            b2 = 115;
                        }
                        break;
                    case -1680025915:
                        if (!str2.equals(A05(org.objectweb.asm.Opcodes.IFNULL, 7, 41))) {
                            b2 = -1;
                        } else {
                            b2 = 15;
                        }
                        break;
                    case -1615810839:
                        if (!str2.equals(A05(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, 8, 122))) {
                            b2 = -1;
                        } else {
                            b2 = 83;
                        }
                        break;
                    case -1554255044:
                        if (!str2.equals(A05(1258, 9, 19))) {
                            b2 = -1;
                        } else {
                            b2 = 108;
                        }
                        break;
                    case -1481772737:
                        if (!str2.equals(A05(1126, 9, 18))) {
                            b2 = -1;
                        } else {
                            b2 = 76;
                        }
                        break;
                    case -1481772730:
                        if (!str2.equals(A05(1135, 9, 109))) {
                            b2 = -1;
                        } else {
                            b2 = 77;
                        }
                        break;
                    case -1481772729:
                        if (!str2.equals(A05(1144, 9, 105))) {
                            b2 = -1;
                        } else {
                            b2 = 78;
                        }
                        break;
                    case -1320080169:
                        if (!str2.equals(A05(439, 14, 40))) {
                            b2 = -1;
                        } else {
                            b2 = 37;
                        }
                        break;
                    case -1217592143:
                        if (!str2.equals(A05(125, 11, 75))) {
                            b2 = -1;
                        } else {
                            b2 = 13;
                        }
                        break;
                    case -1180384755:
                        if (!str2.equals(A05(1012, 6, 35))) {
                            b2 = -1;
                        } else {
                            b2 = 53;
                        }
                        break;
                    case -1139198265:
                        if (!str2.equals(A05(735, 9, 56))) {
                            b2 = -1;
                        } else {
                            b2 = 96;
                        }
                        break;
                    case -1052835013:
                        if (!str2.equals(A05(1098, 6, 72))) {
                            b2 = -1;
                        } else {
                            b2 = 67;
                        }
                        break;
                    case -993250464:
                        if (!str2.equals(A05(12, 7, 121))) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case -965403638:
                        if (!str2.equals(A05(1196, 8, 55))) {
                            b2 = -1;
                        } else {
                            b2 = 98;
                        }
                        break;
                    case -958336948:
                        if (!str2.equals(A05(242, 11, 32))) {
                            b2 = -1;
                        } else {
                            b2 = 26;
                        }
                        break;
                    case -879245230:
                        if (!str2.equals(A05(1235, 6, 103))) {
                            b2 = -1;
                        } else {
                            b2 = 104;
                        }
                        break;
                    case -842500323:
                        if (!str2.equals(A05(com.json.mediationsdk.utils.IronSourceConstants.RV_CHECK_PLACEMENT_CAPPED, 10, 45))) {
                            b2 = -1;
                        } else {
                            b2 = 68;
                        }
                        break;
                    case -821392978:
                        if (!str2.equals(A05(32, 7, 91))) {
                            b2 = -1;
                        } else {
                            b2 = 6;
                        }
                        break;
                    case -797483286:
                        if (!str2.equals(A05(726, 9, 17))) {
                            b2 = -1;
                        } else {
                            b2 = 97;
                        }
                        break;
                    case -794946968:
                        if (!str2.equals(A05(1347, 6, 122))) {
                            b2 = -1;
                        } else {
                            b2 = 109;
                        }
                        break;
                    case -788334647:
                        if (!str2.equals(A05(1353, 6, 85))) {
                            b2 = -1;
                        } else {
                            b2 = 110;
                        }
                        break;
                    case -782144577:
                        if (!str2.equals(A05(573, 9, 49))) {
                            b2 = -1;
                        } else {
                            b2 = 71;
                        }
                        break;
                    case -575125681:
                        if (!str2.equals(A05(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 54))) {
                            b2 = -1;
                        } else {
                            b2 = 36;
                        }
                        break;
                    case -521118391:
                        if (!str2.equals(A05(327, 14, 16))) {
                            b2 = -1;
                        } else {
                            b2 = 38;
                        }
                        break;
                    case -430914369:
                        if (!str2.equals(A05(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 10, 74))) {
                            b2 = -1;
                        } else {
                            b2 = 84;
                        }
                        break;
                    case -290434366:
                        if (!str2.equals(A05(1226, 9, 40))) {
                            b2 = -1;
                        } else {
                            b2 = 99;
                        }
                        break;
                    case -282781963:
                        if (!str2.equals(A05(103, 8, 76))) {
                            b2 = -1;
                        } else {
                            b2 = 12;
                        }
                        break;
                    case -277133239:
                        if (!str2.equals(A05(845, 7, 101))) {
                            b2 = -1;
                        } else {
                            b2 = 116;
                        }
                        break;
                    case -173639913:
                        if (!str2.equals(A05(210, 12, 111))) {
                            b2 = -1;
                        } else {
                            b2 = 23;
                        }
                        break;
                    case -56598463:
                        if (!str2.equals(A05(1371, 8, 9))) {
                            b2 = -1;
                        } else {
                            b2 = 112;
                        }
                        break;
                    case 2126:
                        if (!str2.equals(A05(136, 2, 126))) {
                            b2 = -1;
                        } else {
                            b2 = 14;
                        }
                        break;
                    case 2564:
                        if (!str2.equals(A05(670, 2, 35))) {
                            b2 = -1;
                        } else {
                            b2 = 92;
                        }
                        break;
                    case 2715:
                        if (!str2.equals(A05(821, 2, 57))) {
                            b2 = -1;
                        } else {
                            b2 = 105;
                        }
                        break;
                    case 2719:
                        if (!str2.equals(A05(828, 2, 49))) {
                            b2 = -1;
                        } else {
                            b2 = 107;
                        }
                        break;
                    case 3483:
                        if (!str2.equals(A05(1088, 2, 65))) {
                            b2 = -1;
                        } else {
                            b2 = 64;
                        }
                        break;
                    case 73405:
                        if (!str2.equals(A05(486, 3, 124))) {
                            b2 = -1;
                        } else {
                            b2 = 56;
                        }
                        break;
                    case 75739:
                        if (!str2.equals(A05(508, 3, 31))) {
                            b2 = -1;
                        } else {
                            b2 = 60;
                        }
                        break;
                    case 76779:
                        if (!str2.equals(A05(519, 3, 96))) {
                            b2 = -1;
                        } else {
                            b2 = 66;
                        }
                        break;
                    case 78669:
                        if (!str2.equals(A05(586, 3, 87))) {
                            b2 = -1;
                        } else {
                            b2 = 74;
                        }
                        break;
                    case 79305:
                        if (!str2.equals(A05(com.json.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 3, 59))) {
                            b2 = -1;
                        } else {
                            b2 = 86;
                        }
                        break;
                    case 80618:
                        if (!str2.equals(A05(680, 3, 80))) {
                            b2 = -1;
                        } else {
                            b2 = 94;
                        }
                        break;
                    case 88274:
                        if (!str2.equals(A05(852, 3, 101))) {
                            b2 = -1;
                        } else {
                            b2 = 117;
                        }
                        break;
                    case 98846:
                        if (!str2.equals(A05(921, 3, 4))) {
                            b2 = -1;
                        } else {
                            b2 = 19;
                        }
                        break;
                    case 98848:
                        if (!str2.equals(A05(924, 3, 71))) {
                            b2 = -1;
                        } else {
                            b2 = 20;
                        }
                        break;
                    case 99329:
                        if (!str2.equals(A05(927, 3, 39))) {
                            b2 = -1;
                        } else {
                            b2 = 21;
                        }
                        break;
                    case 101481:
                        if (!str2.equals(A05(945, 3, 26))) {
                            b2 = -1;
                        } else {
                            b2 = 35;
                        }
                        break;
                    case 1513190:
                        if (!str2.equals(A05(0, 4, 113))) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 1514184:
                        if (!str2.equals(A05(4, 4, 60))) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 1514185:
                        if (!str2.equals(A05(8, 4, 10))) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 2436959:
                        if (!str2.equals(A05(582, 4, 100))) {
                            b2 = -1;
                        } else {
                            b2 = 73;
                        }
                        break;
                    case 2463773:
                        if (!str2.equals(A05(652, 4, 35))) {
                            b2 = -1;
                        } else {
                            b2 = 88;
                        }
                        break;
                    case 2464648:
                        if (!str2.equals(A05(661, 4, 97))) {
                            b2 = -1;
                        } else {
                            b2 = 90;
                        }
                        break;
                    case 2689555:
                        if (!str2.equals(A05(835, 4, 47))) {
                            b2 = -1;
                        } else {
                            b2 = 114;
                        }
                        break;
                    case 3351335:
                        if (!str2.equals(A05(1090, 4, 105))) {
                            b2 = -1;
                        } else {
                            b2 = 65;
                        }
                        break;
                    case 3386211:
                        if (!str2.equals(A05(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AD_CLICKED, 4, 73))) {
                            b2 = -1;
                        } else {
                            b2 = 72;
                        }
                        break;
                    case 41325051:
                        if (!str2.equals(A05(androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, 8, 68))) {
                            b2 = -1;
                        } else {
                            b2 = okio.Utf8.REPLACEMENT_BYTE;
                        }
                        break;
                    case 55178625:
                        if (!str2.equals(A05(92, 11, 34))) {
                            b2 = -1;
                        } else {
                            b2 = 11;
                        }
                        break;
                    case 61542055:
                        if (!str2.equals(A05(19, 5, 119))) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 65355429:
                        if (!str2.equals(A05(com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS, 5, 116))) {
                            b2 = -1;
                        } else {
                            b2 = 22;
                        }
                        break;
                    case 66214468:
                        if (!str2.equals(A05(263, 5, 95))) {
                            b2 = -1;
                        } else {
                            b2 = 28;
                        }
                        break;
                    case 66214470:
                        if (!str2.equals(A05(268, 5, 63))) {
                            b2 = -1;
                        } else {
                            b2 = 29;
                        }
                        break;
                    case 66214473:
                        if (!str2.equals(A05(273, 5, 25))) {
                            b2 = -1;
                        } else {
                            b2 = 30;
                        }
                        break;
                    case 66215429:
                        if (!str2.equals(A05(278, 5, 83))) {
                            b2 = -1;
                        } else {
                            b2 = 31;
                        }
                        break;
                    case 66215431:
                        if (!str2.equals(A05(283, 5, 82))) {
                            b2 = -1;
                        } else {
                            b2 = 32;
                        }
                        break;
                    case 66215433:
                        if (!str2.equals(A05(288, 5, 4))) {
                            b2 = -1;
                        } else {
                            b2 = 33;
                        }
                        break;
                    case 66216390:
                        if (!str2.equals(A05(293, 5, 87))) {
                            b2 = -1;
                        } else {
                            b2 = 34;
                        }
                        break;
                    case 76402249:
                        if (!str2.equals(A05(618, 5, 77))) {
                            b2 = -1;
                        } else {
                            b2 = 87;
                        }
                        break;
                    case 76404105:
                        if (!str2.equals(A05(656, 5, 40))) {
                            b2 = -1;
                        } else {
                            b2 = 89;
                        }
                        break;
                    case 76404911:
                        if (!str2.equals(A05(665, 5, 102))) {
                            b2 = -1;
                        } else {
                            b2 = 91;
                        }
                        break;
                    case 80963634:
                        if (!str2.equals(A05(823, 5, 41))) {
                            b2 = -1;
                        } else {
                            b2 = 106;
                        }
                        break;
                    case 82882791:
                        if (!str2.equals(A05(830, 5, 32))) {
                            b2 = -1;
                        } else {
                            b2 = 113;
                        }
                        break;
                    case 102844228:
                        if (!str2.equals(A05(com.json.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, 5, 6))) {
                            b2 = -1;
                        } else {
                            b2 = 58;
                        }
                        break;
                    case 165221241:
                        if (!str2.equals(A05(24, 8, 4))) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case 182191441:
                        if (!str2.equals(A05(155, 9, 18))) {
                            b2 = -1;
                        } else {
                            b2 = 18;
                        }
                        break;
                    case 245388979:
                        if (!str2.equals(A05(1047, 8, 56))) {
                            b2 = -1;
                        } else {
                            b2 = 62;
                        }
                        break;
                    case 287431619:
                        if (!str2.equals(A05(964, 7, 25))) {
                            b2 = -1;
                        } else {
                            b2 = 45;
                        }
                        break;
                    case 307593612:
                        if (!str2.equals(A05(48, 8, 1))) {
                            b2 = -1;
                        } else {
                            b2 = 8;
                        }
                        break;
                    case 308517133:
                        if (!str2.equals(A05(56, 8, 111))) {
                            b2 = -1;
                        } else {
                            b2 = 9;
                        }
                        break;
                    case 316215098:
                        if (!str2.equals(A05(744, 8, 22))) {
                            b2 = -1;
                        } else {
                            b2 = 100;
                        }
                        break;
                    case 316215116:
                        if (!str2.equals(A05(752, 8, 116))) {
                            b2 = -1;
                        } else {
                            b2 = 101;
                        }
                        break;
                    case 316246811:
                        if (!str2.equals(A05(760, 8, 8))) {
                            b2 = -1;
                        } else {
                            b2 = 102;
                        }
                        break;
                    case 316246818:
                        if (!str2.equals(A05(768, 8, 49))) {
                            b2 = -1;
                        } else {
                            b2 = 103;
                        }
                        break;
                    case 407160593:
                        if (!str2.equals(A05(641, 11, 44))) {
                            b2 = -1;
                        } else {
                            b2 = 85;
                        }
                        break;
                    case 507412548:
                        if (!str2.equals(A05(672, 8, 6))) {
                            b2 = -1;
                        } else {
                            b2 = 93;
                        }
                        break;
                    case 793982701:
                        if (!str2.equals(A05(383, 14, 43))) {
                            b2 = -1;
                        } else {
                            b2 = 42;
                        }
                        break;
                    case 794038622:
                        if (!str2.equals(A05(397, 14, 107))) {
                            b2 = -1;
                        } else {
                            b2 = 43;
                        }
                        break;
                    case 794040393:
                        if (!str2.equals(A05(411, 14, 88))) {
                            b2 = -1;
                        } else {
                            b2 = 44;
                        }
                        break;
                    case 835649806:
                        if (!str2.equals(A05(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, 7, 41))) {
                            b2 = -1;
                        } else {
                            b2 = kotlin.io.encoding.Base64.padSymbol;
                        }
                        break;
                    case 917340916:
                        if (!str2.equals(A05(39, 9, 40))) {
                            b2 = -1;
                        } else {
                            b2 = 7;
                        }
                        break;
                    case 958008161:
                        if (!str2.equals(A05(1026, 9, 73))) {
                            b2 = -1;
                        } else {
                            b2 = 55;
                        }
                        break;
                    case 1060579533:
                        if (!str2.equals(A05(com.json.mediationsdk.utils.IronSourceConstants.RV_CALLBACK_AD_DISPLAYED, 8, 11))) {
                            b2 = -1;
                        } else {
                            b2 = 75;
                        }
                        break;
                    case 1150207623:
                        if (!str2.equals(A05(501, 7, 42))) {
                            b2 = -1;
                        } else {
                            b2 = 59;
                        }
                        break;
                    case 1176899427:
                        if (!str2.equals(A05(1018, 8, 27))) {
                            b2 = -1;
                        } else {
                            b2 = 54;
                        }
                        break;
                    case 1280332038:
                        if (!str2.equals(A05(991, 7, 0))) {
                            b2 = -1;
                        } else {
                            b2 = 47;
                        }
                        break;
                    case 1306947716:
                        if (!str2.equals(A05(253, 10, 41))) {
                            b2 = -1;
                        }
                        break;
                    case 1349174697:
                        if (!str2.equals(A05(977, 14, 42))) {
                            b2 = -1;
                        } else {
                            b2 = 46;
                        }
                        break;
                    case 1522194893:
                        if (!str2.equals(A05(1364, 7, 55))) {
                            b2 = -1;
                        } else {
                            b2 = 111;
                        }
                        break;
                    case 1691543273:
                        if (!str2.equals(A05(org.objectweb.asm.Opcodes.LCMP, 7, 118))) {
                            b2 = -1;
                        } else {
                            b2 = 17;
                        }
                        break;
                    case 1709443163:
                        if (!str2.equals(A05(androidx.datastore.preferences.protobuf.DescriptorProtos.Edition.EDITION_PROTO2_VALUE, 14, 120))) {
                            b2 = -1;
                        } else {
                            b2 = 51;
                        }
                        break;
                    case 1865889110:
                        if (!str2.equals(A05(com.json.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_STARTED, 7, 66))) {
                            b2 = -1;
                        } else {
                            b2 = 95;
                        }
                        break;
                    case 1906253259:
                        if (!str2.equals(A05(589, 8, 79))) {
                            b2 = -1;
                        } else {
                            b2 = 79;
                        }
                        break;
                    case 1977196784:
                        if (!str2.equals(A05(474, 12, 39))) {
                            b2 = -1;
                        } else {
                            b2 = 52;
                        }
                        break;
                    case 2029784656:
                        if (!str2.equals(A05(453, 7, 78))) {
                            b2 = -1;
                        } else {
                            b2 = 48;
                        }
                        break;
                    case 2030379515:
                        if (!str2.equals(A05(460, 7, 8))) {
                            b2 = -1;
                        } else {
                            b2 = 49;
                        }
                        break;
                    case 2047190025:
                        if (!str2.equals(A05(222, 10, 7))) {
                            b2 = -1;
                        } else {
                            b2 = 24;
                        }
                        break;
                    case 2047252157:
                        if (!str2.equals(A05(232, 10, 113))) {
                            b2 = -1;
                        } else {
                            b2 = 25;
                        }
                        break;
                    case 2048319463:
                        if (!str2.equals(A05(467, 7, 10))) {
                            b2 = -1;
                        } else {
                            b2 = 50;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                        A0b = true;
                        break;
                }
                java.lang.String str3 = com.facebook.ads.redexgen.core.IK.A06;
                switch (str3.hashCode()) {
                    case 2006354:
                        if (!str3.equals(A05(64, 4, 95))) {
                            b = -1;
                        }
                        break;
                    case 2006367:
                        if (!str3.equals(A05(68, 4, 119))) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 1:
                        A0b = true;
                        break;
                }
                A0c = true;
            }
        }
        return A0b;
    }

    public static boolean A0V(boolean z, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.internal.exoplayer2.thirdparty.Format format2) {
        return format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z || (format.A0F == format2.A0F && format.A08 == format2.A08)) && com.facebook.ads.redexgen.core.IK.A0g(format.A0J, format2.A0J);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = android.os.SystemClock.elapsedRealtime();
        this.A0L = android.os.SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A14() {
        this.A0J = androidx.media3.common.C.TIME_UNSET;
        A08();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A15() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = androidx.media3.common.C.TIME_UNSET;
        this.A0K = androidx.media3.common.C.TIME_UNSET;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A15();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A16(long j, boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        super.A16(j, z);
        A06();
        this.A0I = androidx.media3.common.C.TIME_UNSET;
        this.A05 = 0;
        this.A0K = androidx.media3.common.C.TIME_UNSET;
        if (this.A0A != 0) {
            this.A0M = this.A0Z[this.A0A - 1];
            this.A0A = 0;
        }
        if (z) {
            A0C();
        } else {
            this.A0J = androidx.media3.common.C.TIME_UNSET;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A17(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        super.A17(z);
        this.A0G = A12().A00;
        this.A0S = this.A0G != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A09();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A18(com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr, long j) throws com.facebook.ads.redexgen.core.C05449h {
        if (this.A0M == androidx.media3.common.C.TIME_UNSET) {
            this.A0M = j;
        } else {
            if (this.A0A == this.A0Z.length) {
                android.util.Log.w(A05(522, 23, 65), A05(776, 45, 98) + this.A0Z[this.A0A - 1]);
            } else {
                this.A0A++;
            }
            this.A0Z[this.A0A - 1] = j;
            this.A0a[this.A0A - 1] = this.A0K;
        }
        super.A18(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final int A1B(android.media.MediaCodec mediaCodec, com.facebook.ads.redexgen.core.DL dl, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, com.facebook.ads.internal.exoplayer2.thirdparty.Format format2) {
        if (!A0V(dl.A03, format, format2) || format2.A0F > this.A0P.A02) {
            return 0;
        }
        int i = format2.A08;
        java.lang.String[] strArr = A0e;
        if (strArr[5].charAt(3) != strArr[0].charAt(3)) {
            throw new java.lang.RuntimeException();
        }
        A0e[2] = "gOkpvRAFIiK";
        if (i <= this.A0P.A00 && A00(dl, format2) <= this.A0P.A01) {
            if (format.A0K(format2)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r5 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r3 = r10.A7A(r6, false);
        r0 = com.facebook.ads.redexgen.core.C3F.A0e[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r0.length() == 32) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        com.facebook.ads.redexgen.core.C3F.A0e[2] = "kY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C3F.A0e;
        r2[5] = "miospEErZf1PkmwycTNWtVsRxjbATiq1";
        r2[0] = "Nl2sCL7SF6rWs0f7PpMxxp0YRUBWrVNa";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r7 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        r1 = com.facebook.ads.redexgen.core.AbstractC0666Ee.A0y(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r1 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        r6 = r7.A0I(r12.A0K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r6 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (r12.A0F <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (r12.A08 <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (com.facebook.ads.redexgen.core.IK.A02 < 21) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        r6 = r7.A0H(r12.A0F, r12.A08, r12.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        r4 = r7.A03;
        r2 = com.facebook.ads.redexgen.core.C3F.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
    
        if (r2[5].charAt(3) == r2[0].charAt(3)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        if ((r12.A0F * r12.A08) > com.facebook.ads.redexgen.core.DW.A00()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        if (r6 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        r4 = new java.lang.StringBuilder();
        r0 = A05(298, 29, 58);
        r4 = r4.append(r0).append(r12.A0F);
        r0 = A05(1379, 1, 35);
        r4 = r4.append(r0).append(r12.A08);
        r0 = A05(856, 3, 57);
        r1 = r4.append(r0);
        r0 = com.facebook.ads.redexgen.core.IK.A04;
        r4 = r1.append(r0);
        r0 = A05(855, 1, 83);
        r4.append(r0).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
    
        com.facebook.ads.redexgen.core.C3F.A0e[6] = "4l1TldCvGyAMjXoB6PEL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
    
        if (r4 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        if (r7.A06 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        r3 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
    
        if (r6 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        r5 = r5 | r3;
        r2 = com.facebook.ads.redexgen.core.C3F.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
    
        if (r2[5].charAt(3) == r2[0].charAt(3)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017a, code lost:
    
        return r5 | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0180, code lost:
    
        com.facebook.ads.redexgen.core.C3F.A0e[2] = "Dws7l48Bd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        return r5 | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A1C(com.facebook.ads.redexgen.core.DR dr, com.facebook.ads.redexgen.core.InterfaceC0593Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> interfaceC0593Bh, com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.DU {
        int i;
        boolean z;
        java.lang.String str = format.A0O;
        int i2 = 0;
        if (!com.facebook.ads.redexgen.core.AbstractC0748Hx.A0B(str)) {
            return 0;
        }
        boolean z2 = false;
        com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData = format.A0H;
        if (drmInitData != null) {
            int i3 = 0;
            while (true) {
                int i4 = drmInitData.A01;
                java.lang.String mimeType = A0e[2];
                if (mimeType.length() == 7) {
                    throw new java.lang.RuntimeException();
                }
                A0e[6] = "SU4m";
                if (i3 >= i4) {
                    break;
                }
                z2 |= drmInitData.A01(i3).A03;
                java.lang.String[] strArr = A0e;
                java.lang.String str2 = strArr[7];
                java.lang.String mimeType2 = strArr[4];
                if (str2.length() != mimeType2.length()) {
                    A0e[2] = "qbTdeHO85I3cHVXrNroX";
                    i3++;
                } else {
                    A0e[3] = "SIpHlsw59";
                    i3 += 0;
                }
            }
        }
        com.facebook.ads.redexgen.core.DL dlA7A = dr.A7A(str, z2);
        java.lang.String mimeType3 = A0e[3];
        if (mimeType3.length() != 9) {
            i = 2;
            z = true;
        } else {
            java.lang.String[] strArr2 = A0e;
            strArr2[7] = "GZ795s";
            strArr2[4] = "EuB1Q2OMA0I";
            i = 2;
            z = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1G() throws com.facebook.ads.redexgen.core.C05449h {
        super.A1G();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1H() {
        try {
            super.A1H();
        } finally {
            this.A04 = 0;
            if (this.A0N != null) {
                if (this.A0O == this.A0N) {
                    this.A0O = null;
                }
                this.A0N.release();
                this.A0N = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1K(long j) {
        this.A04--;
        while (this.A0A != 0 && j >= this.A0a[0]) {
            long[] jArr = this.A0Z;
            if (A0e[3].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0e;
            strArr[5] = "1hGsVlhDffacJ6befvdxWjQmz9qEu7gY";
            strArr[0] = "P6esgzdkJXYtWL0gEpuFzBpLbYKtaT7x";
            this.A0M = jArr[0];
            this.A0A--;
            java.lang.System.arraycopy(this.A0Z, 1, this.A0Z, 0, this.A0A);
            java.lang.System.arraycopy(this.A0a, 1, this.A0a, 0, this.A0A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1L(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        java.lang.String strA05 = A05(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_STRING, 10, 33);
        boolean zContainsKey = mediaFormat.containsKey(strA05);
        java.lang.String strA06 = A05(913, 8, 95);
        java.lang.String strA07 = A05(883, 11, 74);
        java.lang.String strA08 = A05(894, 9, 18);
        boolean z = zContainsKey && mediaFormat.containsKey(strA08) && mediaFormat.containsKey(strA07) && mediaFormat.containsKey(strA06);
        if (z) {
            integer = (mediaFormat.getInteger(strA05) - mediaFormat.getInteger(strA08)) + 1;
        } else {
            integer = mediaFormat.getInteger(A05(1359, 5, 102));
        }
        this.A08 = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger(strA07) - mediaFormat.getInteger(strA06)) + 1;
        } else {
            integer2 = mediaFormat.getInteger(A05(971, 6, 112));
        }
        this.A06 = integer2;
        this.A01 = this.A02;
        if (A0e[1].length() != 31) {
            A0e[3] = "y3XZ1D7eh";
            if (com.facebook.ads.redexgen.core.IK.A02 >= 21) {
                if (this.A0B != 90) {
                    int i = this.A0B;
                    java.lang.String[] strArr = A0e;
                    if (strArr[5].charAt(3) == strArr[0].charAt(3)) {
                        java.lang.String[] strArr2 = A0e;
                        strArr2[5] = "l5BspQCjsl9bjMKJyKlr2o8J8ZjH6t6i";
                        strArr2[0] = "C4gsH2Yxbdsg3IulTXVvfJ9KNY5bFXd2";
                        if (i == 270) {
                            int i2 = this.A08;
                            int rotatedHeight = this.A06;
                            this.A08 = rotatedHeight;
                            this.A06 = i2;
                            this.A01 = 1.0f / this.A01;
                        }
                    }
                } else {
                    int i3 = this.A08;
                    int rotatedHeight2 = this.A06;
                    this.A08 = rotatedHeight2;
                    this.A06 = i3;
                    this.A01 = 1.0f / this.A01;
                }
            } else {
                this.A07 = this.A0B;
            }
            int rotatedHeight3 = this.A0F;
            mediaCodec.setVideoScalingMode(rotatedHeight3);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1M(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) throws com.facebook.ads.redexgen.core.C05449h {
        super.A1M(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1N(com.facebook.ads.redexgen.core.C1177Yw c1177Yw) {
        this.A04++;
        this.A0K = java.lang.Math.max(c1177Yw.A00, this.A0K);
        if (com.facebook.ads.redexgen.core.IK.A02 < 23 && this.A0S) {
            A1S();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1O(com.facebook.ads.redexgen.core.DL dl, android.media.MediaCodec mediaCodec, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, android.media.MediaCrypto mediaCrypto) throws com.facebook.ads.redexgen.core.DU {
        this.A0P = A04(dl, format, A1A());
        android.media.MediaFormat mediaFormatA03 = A03(format, this.A0P, this.A0Y, this.A0G);
        if (this.A0O == null) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(A0T(dl));
            if (this.A0N == null) {
                this.A0N = com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A01(this.A0V, dl.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(mediaFormatA03, this.A0O, mediaCrypto, 0);
        if (com.facebook.ads.redexgen.core.IK.A02 >= 23 && this.A0S) {
            this.A00 = new com.facebook.ads.redexgen.core.IV(this, mediaCodec);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final void A1P(java.lang.String str, long j, long j2) {
        this.A0X.A07(str, j, j2);
        this.A0Q = A0U(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (A0R(r8, r19 - r4) != false) goto L24;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A1Q(long unadjustedFrameReleaseTimeNs, long j, android.media.MediaCodec mediaCodec, java.nio.ByteBuffer byteBuffer, int i, int i2, long j2, boolean z) throws com.facebook.ads.redexgen.core.C05449h {
        if (this.A0I == androidx.media3.common.C.TIME_UNSET) {
            this.A0I = unadjustedFrameReleaseTimeNs;
        }
        long earlyUs = j2 - this.A0M;
        if (z) {
            A0H(mediaCodec, i, earlyUs);
            return true;
        }
        long j3 = j2 - unadjustedFrameReleaseTimeNs;
        if (this.A0O == this.A0N) {
            if (!A0N(j3)) {
                return false;
            }
            A0H(mediaCodec, i, earlyUs);
            return true;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() * 1000;
        boolean isStarted = A8P() == 2;
        if (this.A0R) {
            if (isStarted) {
                long presentationTimeUs = this.A0L;
            }
            if (!isStarted || unadjustedFrameReleaseTimeNs == this.A0I) {
                return false;
            }
            long jNanoTime = java.lang.System.nanoTime();
            long jA07 = this.A0W.A07(j2, jNanoTime + ((j3 - (jElapsedRealtime - j)) * 1000));
            long j4 = (jA07 - jNanoTime) / 1000;
            if (A0P(j4, j) && A0S(mediaCodec, i, earlyUs, unadjustedFrameReleaseTimeNs)) {
                return false;
            }
            if (A0Q(j4, j)) {
                A0F(mediaCodec, i, earlyUs);
                if (A0e[6].length() == 32) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0e;
                strArr[5] = "1ExsW2jwWX7BsuC9qootfh01v5FO2jxH";
                strArr[0] = "AOJs2YHJlGVkCxRtlBhbUgyr97n4SWxk";
                return true;
            }
            if (com.facebook.ads.redexgen.core.IK.A02 >= 21) {
                if (j4 < 50000) {
                    A0I(mediaCodec, i, earlyUs, jA07);
                    return true;
                }
            } else if (j4 < 30000) {
                if (j4 > 11000) {
                    try {
                        java.lang.Thread.sleep((j4 - 10000) / 1000);
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        return false;
                    }
                }
                A0G(mediaCodec, i, earlyUs);
                return true;
            }
            return false;
        }
        int i3 = com.facebook.ads.redexgen.core.IK.A02;
        if (A0e[1].length() == 31) {
            throw new java.lang.RuntimeException();
        }
        A0e[6] = "XNWkGI";
        if (i3 >= 21) {
            A0I(mediaCodec, i, earlyUs, java.lang.System.nanoTime());
            return true;
        }
        A0G(mediaCodec, i, earlyUs);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04826m
    public final boolean A1R(com.facebook.ads.redexgen.core.DL dl) {
        return this.A0O != null || A0T(dl);
    }

    public final void A1S() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee, com.facebook.ads.redexgen.core.AC
    public final void A8t(int i, java.lang.Object obj) throws com.facebook.ads.redexgen.core.C05449h {
        if (i == 1) {
            A0L((android.view.Surface) obj);
            return;
        }
        if (i == 4) {
            this.A0F = ((java.lang.Integer) obj).intValue();
            android.media.MediaCodec mediaCodecA1D = A1D();
            if (mediaCodecA1D == null) {
                return;
            }
            mediaCodecA1D.setVideoScalingMode(this.A0F);
            return;
        }
        super.A8t(i, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r1 == androidx.media3.common.C.TIME_UNSET) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r1 == androidx.media3.common.C.TIME_UNSET) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() >= r9.A0J) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r9.A0J = androidx.media3.common.C.TIME_UNSET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        return false;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC04826m, com.facebook.ads.redexgen.core.ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A9b() {
        if (super.A9b()) {
            boolean z = this.A0R;
            if (A0e[1].length() == 31) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0e;
            strArr[5] = "rzYsSFSGOqombMnLFodn7FU5vMlf2MpC";
            strArr[0] = "TgGsZLg3j3z5Z41RamAG73xohavN5cT8";
            if (z || ((this.A0N != null && this.A0O == this.A0N) || A1D() == null || this.A0S)) {
                this.A0J = androidx.media3.common.C.TIME_UNSET;
                return true;
            }
        }
        long j = this.A0J;
        java.lang.String[] strArr2 = A0e;
        if (strArr2[7].length() != strArr2[4].length()) {
            A0e[2] = "TzQWrFDnBOdAflvt";
        }
    }
}

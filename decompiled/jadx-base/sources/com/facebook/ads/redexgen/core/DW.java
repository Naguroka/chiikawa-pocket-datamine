package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DW {
    public static int A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"KyUIazmDYRjHGIYmM", "vQ7MPDC9OxlEQa1IJnKsCbnMY25pV9Py", "oIY4tBYD3sYPgYHy5PuZ8JwrQPquqjMA", "vRxUo5t7WeracVAtrgWMVLiyWCaBJb7M", "RvXFZZsiaZmjdaxyxnCHLoHhYQiV7o", "vBhnj9ZoedWgTZMIFLvOvTo0B13knnsy", "vqETaYR", "Sf"};
    public static final android.util.SparseIntArray A03;
    public static final android.util.SparseIntArray A04;
    public static final com.facebook.ads.redexgen.core.DL A05;
    public static final java.util.HashMap<com.facebook.ads.redexgen.core.DT, java.util.List<com.facebook.ads.redexgen.core.DL>> A06;
    public static final java.util.Map<java.lang.String, java.lang.Integer> A07;
    public static final java.util.regex.Pattern A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00() throws com.facebook.ads.redexgen.core.DU {
        if (A00 == -1) {
            int iMax = 0;
            com.facebook.ads.redexgen.core.DL dlA06 = A06(A07(1006, 9, 115), false);
            if (dlA06 != null) {
                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : dlA06.A0J()) {
                    iMax = java.lang.Math.max(A01(codecProfileLevel.level), iMax);
                }
                iMax = java.lang.Math.max(iMax, com.facebook.ads.redexgen.core.IK.A02 >= 21 ? 345600 : 172800);
            }
            A00 = iMax;
        }
        return A00;
    }

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
            if (A02[7].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            A02[4] = "BD020y3FFzLQ4T6FngoIJN6dqP5f0s";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b6 A[Catch: Exception -> 0x0132, TRY_ENTER, TryCatch #5 {Exception -> 0x0132, blocks: (B:6:0x0022, B:8:0x002a, B:11:0x0036, B:34:0x00a6, B:37:0x00b6, B:39:0x00bc, B:45:0x00f6, B:46:0x0131, B:40:0x00e7, B:41:0x00eb), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static java.util.ArrayList<com.facebook.ads.redexgen.core.DL> A08(com.facebook.ads.redexgen.core.DT dt, com.facebook.ads.redexgen.core.DV dv, java.lang.String str) throws com.facebook.ads.redexgen.core.DU {
        int i;
        java.lang.String strA07;
        try {
            java.util.ArrayList<com.facebook.ads.redexgen.core.DL> arrayList = new java.util.ArrayList<>();
            java.lang.String str2 = dt.A00;
            int iA6s = dv.A6s();
            boolean zAG5 = dv.AG5();
            for (int i2 = 0; i2 < iA6s; i2++) {
                android.media.MediaCodecInfo mediaCodecInfoA6t = dv.A6t(i2);
                java.lang.String name = mediaCodecInfoA6t.getName();
                try {
                    if (A0C(mediaCodecInfoA6t, name, zAG5, str)) {
                        for (java.lang.String str3 : mediaCodecInfoA6t.getSupportedTypes()) {
                            if (str3.equalsIgnoreCase(str2)) {
                                try {
                                    android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA6t.getCapabilitiesForType(str3);
                                    boolean zA9g = dv.A9g(str2, capabilitiesForType);
                                    boolean zA0D = A0D(name);
                                    if (zAG5) {
                                        try {
                                            if (dt.A01 != zA9g) {
                                                if (!zAG5) {
                                                    try {
                                                        if (!dt.A01) {
                                                            try {
                                                                arrayList.add(com.facebook.ads.redexgen.core.DL.A02(name, str2, capabilitiesForType, zA0D, false));
                                                            } catch (java.lang.Exception e) {
                                                                e = e;
                                                                i = com.facebook.ads.redexgen.core.IK.A02;
                                                                strA07 = A07(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 119);
                                                                if (i <= 23) {
                                                                }
                                                                android.util.Log.e(strA07, A07(org.objectweb.asm.Opcodes.GOTO, 22, 62) + name + A07(0, 2, 115) + str3 + A07(33, 1, 71));
                                                                throw e;
                                                            }
                                                        }
                                                    } catch (java.lang.Exception e2) {
                                                        e = e2;
                                                        i = com.facebook.ads.redexgen.core.IK.A02;
                                                        strA07 = A07(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 119);
                                                        if (i <= 23 || arrayList.isEmpty()) {
                                                            android.util.Log.e(strA07, A07(org.objectweb.asm.Opcodes.GOTO, 22, 62) + name + A07(0, 2, 115) + str3 + A07(33, 1, 71));
                                                            throw e;
                                                        }
                                                        android.util.Log.e(strA07, A07(780, 15, 71) + name + A07(2, 31, 60));
                                                    }
                                                }
                                                if (!zAG5 && zA9g) {
                                                    arrayList.add(com.facebook.ads.redexgen.core.DL.A02(name + A07(46, 7, 78), str2, capabilitiesForType, zA0D, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                arrayList.add(com.facebook.ads.redexgen.core.DL.A02(name, str2, capabilitiesForType, zA0D, false));
                                            }
                                        } catch (java.lang.Exception e3) {
                                            e = e3;
                                            if (A02[2].charAt(23) == 'K') {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[4] = "eiA4BjVRKXZxX4mRgUEQc8093SzWDY";
                                            i = com.facebook.ads.redexgen.core.IK.A02;
                                            strA07 = A07(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 119);
                                            if (i <= 23) {
                                            }
                                            android.util.Log.e(strA07, A07(org.objectweb.asm.Opcodes.GOTO, 22, 62) + name + A07(0, 2, 115) + str3 + A07(33, 1, 71));
                                            throw e;
                                        }
                                    } else {
                                        if (!zAG5) {
                                            if (!dt.A01) {
                                                arrayList.add(com.facebook.ads.redexgen.core.DL.A02(name, str2, capabilitiesForType, zA0D, false));
                                            }
                                        }
                                        if (!zAG5) {
                                            continue;
                                        }
                                    }
                                } catch (java.lang.Exception e4) {
                                    e = e4;
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception e5) {
                    e = e5;
                    throw new com.facebook.ads.redexgen.core.DU(e);
                }
            }
            return arrayList;
        } catch (java.lang.Exception e6) {
            e = e6;
        }
    }

    public static void A0A() {
        byte[] bArr = {78, 70, 1, 9, 71, 64, 72, 77, 68, 69, 1, 85, 78, 1, 80, 84, 68, 83, 88, 1, 66, 64, 81, 64, 67, 72, 77, 72, 85, 72, 68, 82, 8, 115, 126, 112, 17, 35, 35, 37, kotlin.io.encoding.Base64.padSymbol, 57, 62, 55, 106, 112, 125, 32, 54, 48, 38, 33, 54, 112, 53, 37, 33, 37, 66, 82, 46, 46, 44, 43, 10, 12, 0, 11, 10, 29, 56, 74, 78, 75, 79, 120, 10, 14, 11, 14, 30, 108, 107, 109, 105, 103, 21, 18, 20, 17, 108, 25, 25, 31, 29, 24, 109, 109, 107, 104, 50, 71, 71, 65, 71, 68, 49, 49, 54, 49, 106, 96, 121, 104, 104, 106, 109, 76, 74, 70, 77, 76, 91, 1, 11, 18, 3, 15, 16, 12, 0, 6, 39, 33, 45, 38, 39, 48, 110, 100, 125, 96, 125, 30, 105, 72, 78, 66, 73, 72, 95, 110, 100, 125, 123, 66, 95, 79, 68, 94, 105, 72, 78, 66, 73, 72, 95, 101, 66, 74, 79, 70, 71, 3, 87, 76, 3, 82, 86, 70, 81, 90, 3, 64, 76, 71, 70, 64, 3, 10, 115, 112, 114, 2, 123, 120, 121, 65, 56, 60, 57, 31, 102, 98, 100, 1, 120, 124, 127, 39, 94, 87, 95, 58, 67, 74, 65, 41, 80, 89, 87, 87, 44, 47, 16, 110, 104, 60, 66, 71, 18, 99, 106, 68, 53, okio.Utf8.REPLACEMENT_BYTE, 13, 8, 40, 6, 15, 14, 19, 8, 15, 6, 65, 12, 0, 13, 7, 14, 19, 12, 4, 5, 65, 32, 55, 34, 65, 2, 14, 5, 4, 2, 65, 18, 21, 19, 8, 15, 6, 91, 65, 74, 100, 109, 108, 113, 106, 109, 100, 35, 110, 98, 111, 101, 108, 113, 110, 102, 103, 35, 75, 70, 85, 64, 35, 96, 108, 103, 102, 96, 35, 112, 119, 113, 106, 109, 100, 57, 35, 32, 93, 94, 92, 74, 55, 52, 53, 106, 23, 19, 22, 79, 50, 54, 48, 111, 18, 22, 21, 99, 30, 23, 31, 20, 105, 96, 107, 102, 27, 18, 28, 86, 41, 42, 49, 78, 75, 21, 121, 3, 5, 100, 30, 27, 53, 64, 73, 55, 66, 72, 15, 18, 113, 6, 39, 33, 45, 38, 39, 48, 90, 114, 115, 126, 118, 84, 120, 115, 114, 116, 91, 126, 100, 99, 55, 86, 71, 94, 55, 115, 126, 115, 121, 48, 99, 55, 123, 126, 100, 99, 55, 100, 114, 116, 98, 101, 114, 55, 115, 114, 116, 120, 115, 114, 101, 55, 113, 120, 101, 45, 55, 39, 15, 14, 3, 11, 41, 5, 14, 15, 9, okio.Utf8.REPLACEMENT_BYTE, 30, 3, 6, 38, 13, 16, 29, 27, 72, 89, 88, 120, 115, 101, 120, 126, 115, 26, 111, 98, 4, 114, 112, 101, 19, 120, 69, 68, 83, 82, 78, 19, 124, 124, 126, 19, 121, 88, 94, 82, 89, 88, 79, 68, 70, 83, 37, 78, 115, 114, 101, 100, 120, 37, 74, 93, 72, 37, 79, 110, 104, 100, 111, 110, 121, 13, 15, 26, 108, 7, 58, 59, 44, 45, 49, 108, 3, 20, 1, 108, 6, 39, 33, 45, 38, 39, 48, 108, 49, 39, 33, 55, 48, 39, 7, 5, 16, 102, 5, 28, 3, 102, 9, 29, 12, 1, 7, 102, 12, 13, 11, 7, 12, 13, 26, 102, 9, 9, 11, 62, 60, 41, 95, 60, 37, 58, 95, 48, 36, 53, 56, 62, 95, 53, 52, 50, 62, 53, 52, 35, 95, 53, 34, 33, 48, 50, 66, 110, 108, 121, 15, 108, 117, 106, 15, 96, 116, 101, 104, 110, 15, 101, 100, 98, 110, 101, 100, 115, 15, 115, 96, 118, 114, 112, 101, 19, 110, 120, 126, 19, 112, 109, 14, 19, 121, 88, 94, 82, 89, 88, 79, 30, 28, 9, 127, 2, 20, 18, 127, 48, 48, 50, 127, 53, 52, 50, 54, 52, 33, 87, 42, 60, 58, 87, 15, 9, 65, 87, 29, 28, 26, 25, 27, 14, 120, 49, 57, 57, 49, 58, 51, 120, 36, 55, 33, 120, 50, 51, 53, 57, 50, 51, 36, 109, 111, 122, 12, 83, 65, 77, 79, 12, 67, 87, 70, 75, 77, 12, 70, 71, 65, 77, 70, 71, 80, 12, 67, 67, 65, 1, 3, 22, 96, okio.Utf8.REPLACEMENT_BYTE, 45, 33, 35, 96, 47, 59, 42, 39, 33, 96, 42, 43, 45, 33, 42, 43, 60, 96, 35, 62, 125, 55, 53, 32, 86, 9, 27, 23, 21, 86, 14, 17, 28, 29, 23, 86, 28, 29, 27, 23, 28, 29, 10, 86, 14, 8, 64, 73, 89, 55, 42, 46, 93, 88, 72, 38, 59, 62, 76, 119, 103, 114, 23, 21, 20, 8, 106, 119, 117, 2, 9, 49, 51, 42, 42, 51, 52, kotlin.io.encoding.Base64.padSymbol, 122, 57, 53, 62, okio.Utf8.REPLACEMENT_BYTE, 57, 122, 94, 101, 96, 101, 100, 124, 101, 43, 74, 93, 72, 43, 103, 110, 125, 110, 103, 49, 43, 81, 106, 111, 106, 107, 115, 106, 36, 69, 82, 71, 36, 116, 118, 107, 98, 109, 104, 97, 62, 36, 5, 62, 59, 62, okio.Utf8.REPLACEMENT_BYTE, 39, 62, 112, 24, 21, 6, 19, 112, 60, 53, 38, 53, 60, 112, 35, 36, 34, 57, 62, 55, 106, 112, 4, okio.Utf8.REPLACEMENT_BYTE, 58, okio.Utf8.REPLACEMENT_BYTE, 62, 38, okio.Utf8.REPLACEMENT_BYTE, 113, 25, 20, 7, 18, 113, 33, 35, 62, 55, 56, kotlin.io.encoding.Base64.padSymbol, 52, 113, 34, 37, 35, 56, okio.Utf8.REPLACEMENT_BYTE, 54, 107, 113, 76, 125, 117, 123, 121, 125, 89, 43, 56, 58, 34, 89, 78, 58, 2, 77, 79, 66, 19, 69, 66, 114, 102, 119, 122, 124, 60, 118, 114, 112, 32, 9, 29, 12, 1, 7, 71, 13, 9, 11, 91, 69, 2, 7, 11, 24, 15, 26, 72, kotlin.io.encoding.Base64.padSymbol, 42, okio.Utf8.REPLACEMENT_BYTE, 110, 43, 125, 42, 34, 54, 59, 11, 9, 9, 97, 108, 127, 56, 67, 93, 72, 26, 59, 55, kotlin.io.encoding.Base64.padSymbol, 37, 52, 85, 89, 74, 81, 86, 93, 84, 76, 93, 89, 76, 76, 92, 94, 67, 88, 67, 89, 120, 106, 102, 120, 126, 101, 108, 76, 94, 81, 75, 80, 76, 44, 58, 45, 
        45, 62, 49, 48, 108, 40, 24, 7, 10, 11, 1, 65, 15, 24, 13, 116, 107, 110, 110, 103, 20, 11, 14, 14, 7, 1, 80, 98, 125, 120, 120, 113, 100, 120, 97, 103, 62, 33, 42, 40, 48, 33, 91, 68, 83, 78, 71, 77, 85, 68, 94, 65, 86, 75, 72, 80, 65};
        if (A02[5].charAt(16) == 'm') {
            throw new java.lang.RuntimeException();
        }
        A02[3] = "v3s1R4n4E2CplWuCnbp9IXiCJ0VpMC0h";
        A01 = bArr;
    }

    static {
        A0A();
        A05 = com.facebook.ads.redexgen.core.DL.A01(A07(657, 22, 75));
        A08 = java.util.regex.Pattern.compile(A07(899, 10, 123));
        A06 = new java.util.HashMap<>();
        A00 = -1;
        A04 = new android.util.SparseIntArray();
        A04.put(66, 1);
        A04.put(77, 2);
        A04.put(88, 4);
        A04.put(100, 8);
        A03 = new android.util.SparseIntArray();
        A03.put(10, 1);
        A03.put(11, 4);
        A03.put(12, 8);
        A03.put(13, 16);
        A03.put(20, 32);
        A03.put(21, 64);
        A03.put(22, 128);
        A03.put(30, 256);
        A03.put(31, 512);
        A03.put(32, 1024);
        A03.put(40, 2048);
        A03.put(41, 4096);
        A03.put(42, 8192);
        A03.put(50, 16384);
        A03.put(51, 32768);
        A03.put(52, 65536);
        A07 = new java.util.HashMap();
        A07.put(A07(345, 3, 7), 1);
        A07.put(A07(352, 3, 40), 4);
        A07.put(A07(355, 3, 53), 16);
        A07.put(A07(358, 3, 100), 64);
        A07.put(A07(361, 3, 102), 256);
        A07.put(A07(313, 4, 113), 1024);
        A07.put(A07(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_EASING, 4, 27), 4096);
        A07.put(A07(321, 4, 59), 16384);
        A07.put(A07(325, 4, 30), 65536);
        A07.put(A07(329, 4, 62), 262144);
        A07.put(A07(333, 4, 50), 1048576);
        A07.put(A07(337, 4, 69), 4194304);
        A07.put(A07(341, 4, 55), 16777216);
        A07.put(A07(221, 3, 2), 2);
        A07.put(A07(224, 3, 69), 8);
        A07.put(A07(227, 3, 105), 32);
        A07.put(A07(230, 3, 71), 128);
        A07.put(A07(233, 3, 17), 512);
        A07.put(A07(189, 4, 95), 2048);
        A07.put(A07(org.objectweb.asm.Opcodes.INSTANCEOF, 4, 87), 8192);
        A07.put(A07(org.objectweb.asm.Opcodes.MULTIANEWARRAY, 4, 20), 32768);
        A07.put(A07(com.ironsource.g3.c.b.b, 4, 74), 131072);
        A07.put(A07(com.ironsource.g3.c.b.f, 4, 84), 524288);
        A07.put(A07(209, 4, 114), 2097152);
        A07.put(A07(213, 4, 111), 8388608);
        A07.put(A07(217, 4, 124), 33554432);
    }

    public static int A01(int i) {
        switch (i) {
            case 1:
                return 25344;
            case 2:
                return 25344;
            case 8:
                return 101376;
            case 16:
                return 101376;
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
                return 414720;
            case 256:
                return 414720;
            case 512:
                if (A02[2].charAt(23) == 'K') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[6] = "NlyGzCz";
                strArr[0] = "RF3BFBC4AW17GvE58";
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
                return 2097152;
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
                return 9437184;
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[RETURN] */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A02(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String[] strArrSplit = str.split(A07(897, 2, 24));
        byte b = 0;
        java.lang.String str2 = strArrSplit[0];
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals(A07(936, 4, 100))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return A04(str, strArrSplit);
                    case 2:
                    case 3:
                        return A03(str, strArrSplit);
                    default:
                        return null;
                }
            case 3006244:
                java.lang.String strA07 = A07(940, 4, 65);
                java.lang.String[] parts = A02;
                if (parts[4].length() != 30) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A02;
                strArr[6] = "6nM1zSh";
                strArr[0] = "83kXhSrbScQaBsiK5";
                if (str2.equals(strA07)) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return A04(str, strArrSplit);
                    case 2:
                    case 3:
                        return A03(str, strArrSplit);
                    default:
                        return null;
                }
            case 3199032:
                if (!str2.equals(A07(953, 4, 20))) {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return A04(str, strArrSplit);
                    case 2:
                    case 3:
                        return A03(str, strArrSplit);
                    default:
                        return null;
                }
            case 3214780:
                if (str2.equals(A07(957, 4, 54))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return A04(str, strArrSplit);
                    case 2:
                    case 3:
                        return A03(str, strArrSplit);
                    default:
                        return null;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                    case 1:
                        return A04(str, strArrSplit);
                    case 2:
                    case 3:
                        return A03(str, strArrSplit);
                    default:
                        return null;
                }
        }
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A03(java.lang.String str, java.lang.String[] strArr) {
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        int length = strArr.length;
        java.lang.String strA07 = A07(238, 37, 124);
        java.lang.String strA08 = A07(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 119);
        if (length < 2) {
            android.util.Log.w(strA08, strA07 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf2 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArr[1]));
                numValueOf2 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArr[2]));
            } else {
                android.util.Log.w(strA08, strA07 + str);
                return null;
            }
            int i = A04.get(numValueOf.intValue(), -1);
            if (i == -1) {
                android.util.Log.w(strA08, A07(814, 21, 25) + numValueOf);
                return null;
            }
            int i2 = A03.get(numValueOf2.intValue(), -1);
            if (i2 == -1) {
                android.util.Log.w(strA08, A07(795, 19, 22) + numValueOf2);
                return null;
            }
            return new android.util.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        } catch (java.lang.NumberFormatException unused) {
            android.util.Log.w(strA08, strA07 + str);
            return null;
        }
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A04(java.lang.String str, java.lang.String[] strArr) {
        int i;
        int length = strArr.length;
        java.lang.String strA07 = A07(275, 38, 30);
        java.lang.String strA08 = A07(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 119);
        if (length < 4) {
            android.util.Log.w(strA08, strA07 + str);
            return null;
        }
        java.util.regex.Matcher matcher = A08.matcher(strArr[1]);
        if (A02[4].length() != 30) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[6] = "yFIGXMH";
        strArr2[0] = "KAF3RCWkxumAXr2AT";
        if (!matcher.matches()) {
            android.util.Log.w(strA08, strA07 + str);
            return null;
        }
        java.lang.String strGroup = matcher.group(1);
        if (A07(53, 1, 92).equals(strGroup)) {
            i = 1;
        } else if (A07(54, 1, 26).equals(strGroup)) {
            i = 2;
        } else {
            android.util.Log.w(strA08, A07(862, 29, 76) + strGroup);
            return null;
        }
        java.lang.Integer num = A07.get(strArr[3]);
        if (num == null) {
            android.util.Log.w(strA08, A07(835, 27, 77) + matcher.group(1));
            return null;
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(i), num);
    }

    public static com.facebook.ads.redexgen.core.DL A05() {
        return A05;
    }

    public static com.facebook.ads.redexgen.core.DL A06(java.lang.String str, boolean z) throws com.facebook.ads.redexgen.core.DU {
        java.util.List<com.facebook.ads.redexgen.core.DL> listA09 = A09(str, z);
        if (listA09.isEmpty()) {
            return null;
        }
        return listA09.get(0);
    }

    public static synchronized java.util.List<com.facebook.ads.redexgen.core.DL> A09(java.lang.String str, boolean z) throws com.facebook.ads.redexgen.core.DU {
        com.facebook.ads.redexgen.core.DT dt = new com.facebook.ads.redexgen.core.DT(str, z);
        java.util.List<com.facebook.ads.redexgen.core.DL> list = A06.get(dt);
        if (list != null) {
            return list;
        }
        com.facebook.ads.redexgen.core.DV c1142Xn = com.facebook.ads.redexgen.core.IK.A02 >= 21 ? new com.facebook.ads.redexgen.core.C1142Xn(z) : new com.facebook.ads.redexgen.core.C1143Xo();
        java.util.ArrayList<com.facebook.ads.redexgen.core.DL> arrayListA08 = A08(dt, c1142Xn, str);
        if (z && arrayListA08.isEmpty() && 21 <= com.facebook.ads.redexgen.core.IK.A02 && com.facebook.ads.redexgen.core.IK.A02 <= 23) {
            c1142Xn = new com.facebook.ads.redexgen.core.C1143Xo();
            arrayListA08 = A08(dt, c1142Xn, str);
            if (!arrayListA08.isEmpty()) {
                android.util.Log.w(A07(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 14, 119), A07(374, 51, 10) + str + A07(34, 12, 77) + arrayListA08.get(0).A02);
            }
        }
        if (A07(922, 14, 117).equals(str)) {
            com.facebook.ads.redexgen.core.DT key = new com.facebook.ads.redexgen.core.DT(A07(912, 10, 14), dt.A01);
            arrayListA08.addAll(A08(key, c1142Xn, str));
        }
        A0B(arrayListA08);
        java.util.List<com.facebook.ads.redexgen.core.DL> listUnmodifiableList = java.util.Collections.unmodifiableList(arrayListA08);
        A06.put(dt, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static void A0B(java.util.List<com.facebook.ads.redexgen.core.DL> list) {
        if (com.facebook.ads.redexgen.core.IK.A02 < 26 && list.size() > 1) {
            if (A07(583, 25, 60).equals(list.get(0).A02)) {
                for (int i = 1; i < list.size(); i++) {
                    com.facebook.ads.redexgen.core.DL dl = list.get(i);
                    if (A07(657, 22, 75).equals(dl.A02)) {
                        list.remove(i);
                        list.add(0, dl);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0319  */
    /* JADX WARN: Code duplicated, block: B:117:0x032b  */
    /* JADX WARN: Code duplicated, block: B:119:0x033d  */
    /* JADX WARN: Code duplicated, block: B:121:0x034a  */
    /* JADX WARN: Code duplicated, block: B:123:0x035a  */
    /* JADX WARN: Code duplicated, block: B:126:0x036c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0381  */
    /* JADX WARN: Code duplicated, block: B:134:0x039b  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:146:0x0407  */
    /* JADX WARN: Code duplicated, block: B:148:0x0414  */
    /* JADX WARN: Code duplicated, block: B:150:0x0425  */
    /* JADX WARN: Code duplicated, block: B:153:0x0436  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144  */
    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x020a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0213  */
    /* JADX WARN: Code duplicated, block: B:82:0x0223  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Code duplicated, block: B:86:0x0252  */
    /* JADX WARN: Code duplicated, block: B:88:0x0260  */
    /* JADX WARN: Code duplicated, block: B:90:0x0271  */
    /* JADX WARN: Code duplicated, block: B:93:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0286  */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0369, code lost:
    
        if (A07(769, 5, 57).equals(com.facebook.ads.redexgen.core.IK.A03) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0433, code lost:
    
        if (com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(1004, 2, 5)) == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        if (com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(236, 2, 88)) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f8, code lost:
    
        if (A07(774, 6, 90).equals(com.facebook.ads.redexgen.core.IK.A03) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0280, code lost:
    
        if (A07(85, 5, 57).equals(com.facebook.ads.redexgen.core.IK.A03) != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0C(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z, java.lang.String str2) {
        int i;
        int i2;
        java.lang.String strA07;
        int i3;
        java.lang.String strA08;
        java.lang.String[] strArr;
        java.lang.String str3;
        java.lang.String[] strArr2;
        boolean zEquals;
        java.lang.String str4;
        boolean zEquals2;
        boolean zEquals3;
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(A07(46, 7, 78)))) {
            return false;
        }
        if (com.facebook.ads.redexgen.core.IK.A02 < 21 && (A07(110, 13, 52).equals(str) || A07(138, 13, 48).equals(str) || A07(org.objectweb.asm.Opcodes.DCMPL, 16, 48).equals(str) || A07(123, 15, 95).equals(str) || A07(60, 10, 114).equals(str) || A07(364, 10, 95).equals(str))) {
            return false;
        }
        if (com.facebook.ads.redexgen.core.IK.A02 < 18 && A07(608, 19, 32).equals(str)) {
            return false;
        }
        if (com.facebook.ads.redexgen.core.IK.A02 >= 18 || !A07(com.json.mediationsdk.logger.IronSourceError.ERROR_AD_UNIT_CAPPED, 25, 85).equals(str)) {
            if (com.facebook.ads.redexgen.core.IK.A02 == 16 && A07(705, 26, 83).equals(str)) {
                if (!A07(946, 4, 83).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                    if (!A07(978, 6, 49).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                        if (!A07(1015, 5, 31).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                            if (!A07(1027, 9, 9).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                if (!A07(1020, 7, 127).equals(com.facebook.ads.redexgen.core.IK.A03) && !com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(950, 3, 113))) {
                                    if (!A07(90, 5, 50).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                        if (!A07(95, 5, 70).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                            if (!A07(100, 5, 108).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                                zEquals3 = A07(105, 5, 26).equals(com.facebook.ads.redexgen.core.IK.A03);
                                                if (A02[1].charAt(12) != 'Q') {
                                                    throw new java.lang.RuntimeException();
                                                }
                                                A02[1] = "gZHfXUQkneE4QiMBasbqvahPQdjcG0cY";
                                                if (!zEquals3) {
                                                    if (!A07(348, 4, 96).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            i = com.facebook.ads.redexgen.core.IK.A02;
            if (A02[4].length() != 30) {
                A02[4] = "3kxUPPek2VQdMwfo0fCvyS9LcRqdRj";
                if (i == 16) {
                    if (A07(679, 26, 63).equals(str)) {
                        if (!A07(70, 5, 102).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                            zEquals2 = A07(75, 5, 38).equals(com.facebook.ads.redexgen.core.IK.A03);
                            if (A02[2].charAt(23) != 'K') {
                                java.lang.String[] strArr3 = A02;
                                strArr3[6] = "3Mp5Uuh";
                                strArr3[0] = "BKjPN78J93LmhHbAv";
                                if (!zEquals2) {
                                    if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    }
                                }
                            } else if (!zEquals2) {
                                if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                }
                            }
                        }
                        return false;
                    }
                }
            } else {
                A02[3] = "viJGromw77eF4f1lTJPTIdFVfew9lNta";
                if (i == 16) {
                    if (A07(679, 26, 63).equals(str)) {
                        if (!A07(70, 5, 102).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                            zEquals2 = A07(75, 5, 38).equals(com.facebook.ads.redexgen.core.IK.A03);
                            if (A02[2].charAt(23) != 'K') {
                                java.lang.String[] strArr4 = A02;
                                strArr4[6] = "3Mp5Uuh";
                                strArr4[0] = "BKjPN78J93LmhHbAv";
                                if (!zEquals2) {
                                    if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    }
                                }
                            } else if (!zEquals2) {
                                if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            i2 = com.facebook.ads.redexgen.core.IK.A02;
            strA07 = A07(984, 7, 22);
            if (i2 < 24 && (A07(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, 15, 76).equals(str) || A07(457, 22, 32).equals(str))) {
                zEquals = strA07.equals(com.facebook.ads.redexgen.core.IK.A05);
                if (A02[4].length() != 30) {
                    A02[3] = "vM2VV5cNViG9iheEl1QedVwh11kRb2VM";
                    if (zEquals) {
                        if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 8, 60))) {
                            if (!A07(763, 6, 22).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                if (!A07(966, 12, 37).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    str4 = com.facebook.ads.redexgen.core.IK.A03;
                                    if (A02[3].charAt(0) != 'v') {
                                        if (!A07(55, 5, 12).equals(str4)) {
                                            if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                            }
                                        }
                                    } else {
                                        A02[7] = "8B";
                                        if (!A07(55, 5, 12).equals(str4)) {
                                            if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return false;
                    }
                } else if (zEquals) {
                    if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 8, 60)) && !com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(1050, 7, 57)) && !com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(com.json.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 6, 89))) {
                        if (!A07(763, 6, 22).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                            if (!A07(966, 12, 37).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                str4 = com.facebook.ads.redexgen.core.IK.A03;
                                if (A02[3].charAt(0) != 'v') {
                                    if (!A07(55, 5, 12).equals(str4)) {
                                        if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                        }
                                    }
                                } else {
                                    A02[7] = "8B";
                                    if (!A07(55, 5, 12).equals(str4)) {
                                        if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            i3 = com.facebook.ads.redexgen.core.IK.A02;
            strA08 = A07(961, 5, 76);
            if (i3 <= 19) {
                strArr = A02;
                if (strArr[6].length() != strArr[0].length()) {
                    java.lang.String[] strArr5 = A02;
                    strArr5[6] = "H8RZpiF";
                    strArr5[0] = "Qt7Gz5GbdPMmxFN0p";
                    if (A07(642, 15, 100).equals(str)) {
                        if (strA07.equals(com.facebook.ads.redexgen.core.IK.A05)) {
                            if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(944, 2, 82)) && !com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(997, 7, 66))) {
                                str3 = com.facebook.ads.redexgen.core.IK.A03;
                                strArr2 = A02;
                                if (strArr2[6].length() != strArr2[0].length()) {
                                    A02[7] = "DL";
                                    if (!str3.startsWith(strA08)) {
                                        if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(991, 6, 34))) {
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                    }
                } else {
                    A02[2] = "9VtxEaZDUnNZ6VyPkQGTvbLzZEhrKpnq";
                    if (A07(642, 15, 25).equals(str)) {
                        if (strA07.equals(com.facebook.ads.redexgen.core.IK.A05)) {
                            if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(944, 2, 82))) {
                                str3 = com.facebook.ads.redexgen.core.IK.A03;
                                strArr2 = A02;
                                if (strArr2[6].length() != strArr2[0].length()) {
                                    A02[7] = "DL";
                                    if (!str3.startsWith(strA08)) {
                                        if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(991, 6, 34))) {
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                    }
                }
            }
            if (com.facebook.ads.redexgen.core.IK.A02 > 19 && com.facebook.ads.redexgen.core.IK.A03.startsWith(strA08) && A07(731, 26, 101).equals(str)) {
                return false;
            }
            return (A07(922, 14, 117).equals(str2) && A07(555, 28, 108).equals(str)) ? false : true;
        }
        java.lang.String str5 = com.facebook.ads.redexgen.core.IK.A03;
        if (A02[1].charAt(12) == 'Q') {
            A02[2] = "06RZTry1hj7TS1C7gTOL0e5GxEtFEip9";
            if (!A07(909, 3, 111).equals(str5)) {
                if (A07(891, 6, 9).equals(com.facebook.ads.redexgen.core.IK.A05)) {
                }
                if (com.facebook.ads.redexgen.core.IK.A02 == 16) {
                    if (!A07(946, 4, 83).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                        if (!A07(978, 6, 49).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                            if (!A07(1015, 5, 31).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                if (!A07(1027, 9, 9).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    if (!A07(1020, 7, 127).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                        if (!A07(90, 5, 50).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                            if (!A07(95, 5, 70).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                                if (!A07(100, 5, 108).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                                    zEquals3 = A07(105, 5, 26).equals(com.facebook.ads.redexgen.core.IK.A03);
                                                    if (A02[1].charAt(12) != 'Q') {
                                                        throw new java.lang.RuntimeException();
                                                    }
                                                    A02[1] = "gZHfXUQkneE4QiMBasbqvahPQdjcG0cY";
                                                    if (!zEquals3) {
                                                        if (!A07(348, 4, 96).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                i = com.facebook.ads.redexgen.core.IK.A02;
                if (A02[4].length() != 30) {
                    A02[4] = "3kxUPPek2VQdMwfo0fCvyS9LcRqdRj";
                    if (i == 16) {
                        if (A07(679, 26, 63).equals(str)) {
                            if (!A07(70, 5, 102).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                zEquals2 = A07(75, 5, 38).equals(com.facebook.ads.redexgen.core.IK.A03);
                                if (A02[2].charAt(23) != 'K') {
                                    java.lang.String[] strArr6 = A02;
                                    strArr6[6] = "3Mp5Uuh";
                                    strArr6[0] = "BKjPN78J93LmhHbAv";
                                    if (!zEquals2) {
                                        if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                        }
                                    }
                                } else if (!zEquals2) {
                                    if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    }
                                }
                            }
                            return false;
                        }
                    }
                } else {
                    A02[3] = "viJGromw77eF4f1lTJPTIdFVfew9lNta";
                    if (i == 16) {
                        if (A07(679, 26, 63).equals(str)) {
                            if (!A07(70, 5, 102).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                zEquals2 = A07(75, 5, 38).equals(com.facebook.ads.redexgen.core.IK.A03);
                                if (A02[2].charAt(23) != 'K') {
                                    java.lang.String[] strArr7 = A02;
                                    strArr7[6] = "3Mp5Uuh";
                                    strArr7[0] = "BKjPN78J93LmhHbAv";
                                    if (!zEquals2) {
                                        if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                        }
                                    }
                                } else if (!zEquals2) {
                                    if (!A07(80, 5, 64).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    }
                                }
                            }
                            return false;
                        }
                    }
                }
                i2 = com.facebook.ads.redexgen.core.IK.A02;
                strA07 = A07(984, 7, 22);
                if (i2 < 24) {
                    zEquals = strA07.equals(com.facebook.ads.redexgen.core.IK.A05);
                    if (A02[4].length() != 30) {
                        A02[3] = "vM2VV5cNViG9iheEl1QedVwh11kRb2VM";
                        if (zEquals) {
                            if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 8, 60))) {
                                if (!A07(763, 6, 22).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    if (!A07(966, 12, 37).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                        str4 = com.facebook.ads.redexgen.core.IK.A03;
                                        if (A02[3].charAt(0) != 'v') {
                                            if (!A07(55, 5, 12).equals(str4)) {
                                                if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                                }
                                            }
                                        } else {
                                            A02[7] = "8B";
                                            if (!A07(55, 5, 12).equals(str4)) {
                                                if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                    } else if (zEquals) {
                        if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 8, 60))) {
                            if (!A07(763, 6, 22).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                if (!A07(966, 12, 37).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                    str4 = com.facebook.ads.redexgen.core.IK.A03;
                                    if (A02[3].charAt(0) != 'v') {
                                        if (!A07(55, 5, 12).equals(str4)) {
                                            if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                            }
                                        }
                                    } else {
                                        A02[7] = "8B";
                                        if (!A07(55, 5, 12).equals(str4)) {
                                            if (!A07(757, 6, 7).equals(com.facebook.ads.redexgen.core.IK.A03)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return false;
                    }
                }
                i3 = com.facebook.ads.redexgen.core.IK.A02;
                strA08 = A07(961, 5, 76);
                if (i3 <= 19) {
                    strArr = A02;
                    if (strArr[6].length() != strArr[0].length()) {
                        java.lang.String[] strArr8 = A02;
                        strArr8[6] = "H8RZpiF";
                        strArr8[0] = "Qt7Gz5GbdPMmxFN0p";
                        if (A07(642, 15, 100).equals(str)) {
                            if (strA07.equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(944, 2, 82))) {
                                    str3 = com.facebook.ads.redexgen.core.IK.A03;
                                    strArr2 = A02;
                                    if (strArr2[6].length() != strArr2[0].length()) {
                                        A02[7] = "DL";
                                        if (!str3.startsWith(strA08)) {
                                            if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(991, 6, 34))) {
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                    } else {
                        A02[2] = "9VtxEaZDUnNZ6VyPkQGTvbLzZEhrKpnq";
                        if (A07(642, 15, 25).equals(str)) {
                            if (strA07.equals(com.facebook.ads.redexgen.core.IK.A05)) {
                                if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(944, 2, 82))) {
                                    str3 = com.facebook.ads.redexgen.core.IK.A03;
                                    strArr2 = A02;
                                    if (strArr2[6].length() != strArr2[0].length()) {
                                        A02[7] = "DL";
                                        if (!str3.startsWith(strA08)) {
                                            if (!com.facebook.ads.redexgen.core.IK.A03.startsWith(A07(991, 6, 34))) {
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
                if (com.facebook.ads.redexgen.core.IK.A02 > 19) {
                }
                if (A07(922, 14, 117).equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        throw new java.lang.RuntimeException();
    }

    public static boolean A0D(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.IK.A02 <= 22) {
            if ((A07(447, 10, 42).equals(com.facebook.ads.redexgen.core.IK.A06) || A07(439, 8, 117).equals(com.facebook.ads.redexgen.core.IK.A06)) && (A07(479, 22, 22).equals(str) || A07(501, 29, 95).equals(str))) {
                return true;
            }
        }
        return false;
    }
}

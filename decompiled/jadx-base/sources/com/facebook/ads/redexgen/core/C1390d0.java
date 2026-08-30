package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1390d0 implements com.facebook.ads.redexgen.core.AnonymousClass00 {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", "wl", "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final java.lang.String A0B;
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.AnonymousClass08 A02;
    public final com.facebook.ads.redexgen.core.C0L A04;
    public final com.facebook.ads.redexgen.core.C7j A05;
    public final boolean A08;
    public final java.util.Map<java.lang.String, java.io.File> A06 = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public final java.util.Map<java.lang.String, java.util.concurrent.Semaphore> A07 = new java.util.HashMap();
    public final com.facebook.ads.redexgen.core.C0A A03 = new com.facebook.ads.redexgen.core.C0A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE 
  (r10v1 ?? I:com.facebook.ads.redexgen.X.0L)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.06)
 INTERFACE call: com.facebook.ads.redexgen.X.0L.AEs(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE 
  (r10v0 ?? I:com.facebook.ads.redexgen.X.0L)
  (r11 I:java.lang.String)
  (r12 I:int)
  (r13 I:java.lang.String)
  (r14 I:java.lang.Long)
  (r15 I:java.lang.Long)
  (r16 I:com.facebook.ads.redexgen.X.06)
 INTERFACE call: com.facebook.ads.redexgen.X.0L.AEs(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void A[MD:(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void (m)], block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private java.io.File A02(com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06, java.lang.String str, java.lang.String str2, int i, com.facebook.ads.redexgen.core.AnonymousClass09 anonymousClass09) throws java.lang.Exception {
        com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass07;
        java.lang.String strAEs;
        com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass08;
        java.lang.String strAEs2;
        java.lang.String strA03 = A03(222, 22, 17);
        try {
            java.lang.String str3 = str;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.io.File file = new java.io.File(A01(this.A05), str2);
            com.facebook.ads.redexgen.core.C1386cw c1386cw = new com.facebook.ads.redexgen.core.C1386cw(file, new com.facebook.ads.redexgen.core.HM(com.facebook.ads.redexgen.core.C0762Im.A0P(this.A05)));
            if (c1386cw.A09()) {
                if (this.A08) {
                    java.lang.String str4 = A03(49, 22, 36) + c1386cw.A00.getName();
                }
                this.A06.put(str3, file);
                c1386cw.A06();
                this.A04.AEt(str3, true, anonymousClass06);
                return file;
            }
            if (this.A08) {
                java.lang.String str5 = A03(71, 26, 76) + c1386cw.A00.getName();
            }
            if (!anonymousClass09.A04()) {
                return null;
            }
            this.A04.AEt(str3, false, anonymousClass06);
            for (int i2 = 0; i2 < this.A00; i2++) {
                try {
                    com.facebook.ads.redexgen.core.C7j c7j = this.A05;
                    if (A0A[3].charAt(31) != '9') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0A;
                    strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                    strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                    str3 = str3;
                    try {
                        A05(c7j, c1386cw, str3, i, i2, jCurrentTimeMillis);
                        break;
                    } catch (com.facebook.ads.redexgen.core.C0H e) {
                        e = e;
                        if (i2 == this.A00 - 1) {
                            A06(c1386cw);
                            if (e instanceof com.facebook.ads.redexgen.core.C1387cx) {
                                throw ((com.facebook.ads.redexgen.core.C1387cx) e);
                            }
                            if (e instanceof com.facebook.ads.redexgen.core.C1384cu) {
                                throw ((com.facebook.ads.redexgen.core.C1384cu) e);
                            }
                        }
                    }
                } catch (com.facebook.ads.redexgen.core.C0H e2) {
                    e = e2;
                }
            }
            int iA03 = c1386cw.A03();
            c1386cw.A06();
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
            anonymousClass09.A00().A4q(file, this.A04);
            this.A06.put(str3, file);
            this.A04.AEs(str3, com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, null, java.lang.Long.valueOf(iA03), java.lang.Long.valueOf(jCurrentTimeMillis2), anonymousClass06);
            return file;
        } catch (com.facebook.ads.redexgen.core.C1384cu e3) {
            this.A04.AEs(strAEs2, com.json.mediationsdk.utils.IronSourceConstants.IS_CALLBACK_AD_CLOSED, e3.toString(), null, null, anonymousClass08);
            if (!this.A08) {
                return null;
            }
            android.util.Log.e(A0B, strA03, e3);
            return null;
        } catch (com.facebook.ads.redexgen.core.C1387cx e4) {
            this.A04.AEs(strAEs, 2119, e4.toString(), null, null, anonymousClass07);
            if (!this.A08) {
                return null;
            }
            android.util.Log.e(A0B, strA03, e4);
            return null;
        }
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, -128, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, 18, 18, 3, 11, 14, 18, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, -31, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, -31, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, -31, -18, -89, -12, -96, -14, -27, -31, -28, -96, -31, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, 22, 22, 19, 22, -60, 7, 16, 19, 23, 13, 18, 11, -60, 23, 19, 25, 22, 7, 9, -39, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, 39, 23, 28, 21, -50, 34, 29, -50, 32, 19, 15, 18, -50, -31, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, -31, -29, -24, -27, -50, -32, -32, -46, -31, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    static {
        A04();
        A0B = com.facebook.ads.redexgen.core.C1390d0.class.getSimpleName();
    }

    public C1390d0(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.AnonymousClass08 anonymousClass08, com.facebook.ads.redexgen.core.C0L c0l) {
        this.A05 = c7j;
        this.A08 = anonymousClass08.A02();
        this.A00 = anonymousClass08.A00();
        this.A04 = c0l;
        this.A01 = anonymousClass08.A01();
        this.A02 = anonymousClass08;
    }

    public static com.facebook.ads.redexgen.core.C1388cy A00(android.content.Context context, java.lang.String str) throws com.facebook.ads.redexgen.core.C0H {
        try {
            java.io.InputStream inputStreamOpen = context.getAssets().open(str);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr, 0, bArr.length);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return new com.facebook.ads.redexgen.core.C1388cy(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C0H(A03(org.objectweb.asm.Opcodes.LXOR, 18, 78), e);
        }
    }

    public static java.io.File A01(android.content.Context context) {
        return new java.io.File(context.getCacheDir(), A03(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET, 15, 78));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0157 A[Catch: 0H -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #14 {0H -> 0x015f, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:111:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190  */
    private void A05(android.content.Context context, com.facebook.ads.redexgen.core.C1386cw c1386cw, java.lang.String str, int i, int i2, long j) throws java.lang.Exception {
        com.facebook.ads.redexgen.core.C0K c1385cv;
        int iA06;
        int iA07;
        java.lang.String[] strArr;
        java.lang.String strA03 = A03(263, 20, 114);
        java.lang.String strA04 = A03(342, 22, 27);
        if (str.startsWith(strA04)) {
            java.lang.String localUrl = str.substring(strA04.length());
            c1385cv = A00(context, localUrl);
        } else {
            java.lang.String strA05 = A03(333, 9, 59);
            if (str.startsWith(strA05)) {
                java.lang.String localUrl2 = str.substring(strA05.length());
                c1385cv = A00(context, localUrl2);
            } else {
                c1385cv = new com.facebook.ads.redexgen.core.C1385cv(str, i);
            }
        }
        try {
            if (this.A08) {
                try {
                    try {
                        java.lang.String str2 = A03(303, 15, 124) + str + A03(38, 11, 108) + i2;
                    } catch (com.facebook.ads.redexgen.core.C0H e) {
                        e = e;
                        iA06 = 0;
                        try {
                            if (c1385cv instanceof com.facebook.ads.redexgen.core.C1385cv) {
                                try {
                                    iA06 = ((com.facebook.ads.redexgen.core.C1385cv) c1385cv).A06();
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    try {
                                        c1385cv.close();
                                    } catch (com.facebook.ads.redexgen.core.C0H | java.lang.IllegalArgumentException e2) {
                                        if (this.A08) {
                                            android.util.Log.e(A0B, strA03, e2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            try {
                                this.A05.A07().AAJ(j, java.lang.System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                                throw e;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                c1385cv.close();
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (A0A[4].charAt(27) == 'R') {
                                A0A[3] = "p8aYiN6IujE52Q2p9R2WzRwMj4wd2wO9";
                            }
                            throw new java.lang.RuntimeException();
                        }
                    }
                } catch (com.facebook.ads.redexgen.core.C0H e3) {
                    e = e3;
                    iA06 = 0;
                    if (c1385cv instanceof com.facebook.ads.redexgen.core.C1385cv) {
                        iA06 = ((com.facebook.ads.redexgen.core.C1385cv) c1385cv).A06();
                    }
                    this.A05.A07().AAJ(j, java.lang.System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                    throw e;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    c1385cv.close();
                    throw th;
                }
            }
            int iA03 = c1386cw.A03();
            int length = c1385cv.length();
            boolean z = length < 0;
            if (A0A[3].charAt(31) == '9') {
                A0A[3] = "O2qol2VIPsSIkPIIN6kN5hssl2djupr9";
                if (z) {
                    boolean zA07 = A07(c1386cw);
                    if (this.A08) {
                        java.lang.String str3 = A03(org.objectweb.asm.Opcodes.FCMPL, 21, 76) + str + A03(22, 16, 34) + zA07;
                    }
                }
                try {
                    try {
                        if (z || iA03 < length) {
                            c1385cv.AEF(iA03);
                            byte[] buffer = new byte[8192];
                            while (true) {
                                int i3 = c1385cv.read(buffer);
                                if (i3 == -1) {
                                    break;
                                } else {
                                    c1386cw.A08(buffer, i3);
                                }
                            }
                            if (!z || c1386cw.A03() == length) {
                                c1386cw.A07();
                                iA07 = 0;
                                if (c1385cv instanceof com.facebook.ads.redexgen.core.C1385cv) {
                                    iA07 = ((com.facebook.ads.redexgen.core.C1385cv) c1385cv).A06();
                                }
                                com.facebook.ads.redexgen.core.C8D c8dA07 = this.A05.A07();
                                long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j;
                                long jA03 = c1386cw.A03();
                                strArr = A0A;
                                if (strArr[2].length() != strArr[5].length()) {
                                    A0A[0] = "LJMphR6GQubhlr";
                                } else {
                                    A0A[0] = "i3csCW72L1z7Bc";
                                }
                                c8dA07.AAJ(j, jCurrentTimeMillis, jA03, 0L, iA07, null);
                                c1385cv.close();
                                return;
                            }
                            throw new com.facebook.ads.redexgen.core.C1387cx(A03(283, 20, 94));
                        }
                        c1385cv.close();
                        return;
                    } catch (com.facebook.ads.redexgen.core.C0H | java.lang.IllegalArgumentException e4) {
                        if (this.A08) {
                            java.lang.String str4 = A0B;
                            java.lang.String[] strArr2 = A0A;
                            if (strArr2[2].length() != strArr2[5].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            A0A[1] = "AOKjIt2kEVzrEy7KBqss66";
                            android.util.Log.e(str4, strA03, e4);
                            return;
                        }
                        return;
                    }
                    if (!z) {
                        c1386cw.A07();
                    } else {
                        throw new com.facebook.ads.redexgen.core.C1387cx(A03(283, 20, 94));
                    }
                    iA07 = 0;
                    if (c1385cv instanceof com.facebook.ads.redexgen.core.C1385cv) {
                        iA07 = ((com.facebook.ads.redexgen.core.C1385cv) c1385cv).A06();
                    }
                    com.facebook.ads.redexgen.core.C8D c8dA08 = this.A05.A07();
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - j;
                    long jA04 = c1386cw.A03();
                    strArr = A0A;
                    if (strArr[2].length() != strArr[5].length()) {
                        A0A[0] = "LJMphR6GQubhlr";
                    } else {
                        A0A[0] = "i3csCW72L1z7Bc";
                    }
                    c8dA08.AAJ(j, jCurrentTimeMillis2, jA04, 0L, iA07, null);
                } catch (com.facebook.ads.redexgen.core.C0H e5) {
                    e = e5;
                    iA06 = 0;
                    if (c1385cv instanceof com.facebook.ads.redexgen.core.C1385cv) {
                        iA06 = ((com.facebook.ads.redexgen.core.C1385cv) c1385cv).A06();
                    }
                    this.A05.A07().AAJ(j, java.lang.System.currentTimeMillis() - j, 0L, 0L, iA06, null);
                    throw e;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    c1385cv.close();
                    throw th;
                }
            }
            throw new java.lang.RuntimeException();
        } catch (com.facebook.ads.redexgen.core.C0H e6) {
            e = e6;
            if (A0A[0].length() == 14) {
                java.lang.String[] strArr3 = A0A;
                strArr3[2] = "7VHRmmesbfeDqucWLtEKLKcMBQJVNm";
                strArr3[5] = "oM47EpnTTF1S9ikTK6B0AzPGZuSKH0";
            }
        }
    }

    private void A06(com.facebook.ads.redexgen.core.C1386cw c1386cw) {
        try {
            java.io.File fileA04 = c1386cw.A04();
            if (fileA04.exists()) {
                c1386cw.A06();
                boolean zDelete = fileA04.delete();
                if (this.A08) {
                    android.util.Log.i(A0B, A03(org.objectweb.asm.Opcodes.TABLESWITCH, 52, 14) + zDelete);
                }
            }
        } catch (java.lang.Exception e) {
            if (A0A[0].length() != 14) {
                throw new java.lang.RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                android.util.Log.e(A0B, A03(108, 23, 18), e);
            }
        }
    }

    private boolean A07(com.facebook.ads.redexgen.core.C1386cw c1386cw) {
        try {
            c1386cw.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (com.facebook.ads.redexgen.core.C1384cu e) {
            if (this.A08) {
                android.util.Log.e(A0B, A03(244, 19, 48), e);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> com.facebook.ads.redexgen.core.AnonymousClass02<T> A08(com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06, com.facebook.ads.redexgen.core.AnonymousClass09<T> anonymousClass09) {
        java.util.concurrent.Semaphore semaphore;
        if (anonymousClass09.A03()) {
            java.io.File file = this.A06.get(anonymousClass06.A09);
            if (file != null) {
                this.A04.AEt(anonymousClass06.A09, true, anonymousClass06);
                return anonymousClass09.A00().A3i(file, this.A04);
            }
            this.A04.AEt(anonymousClass06.A09, false, anonymousClass06);
            return new com.facebook.ads.redexgen.core.AnonymousClass02<>(false, null);
        }
        java.lang.String str = anonymousClass06.A09;
        java.lang.String str2 = anonymousClass06.A04;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String baseUrl = this.A03.A03(str);
        java.lang.String extension = sb.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new java.util.concurrent.Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (java.lang.Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            java.io.File fileA02 = A02(anonymousClass06, str, extension, this.A01, anonymousClass09);
            if (fileA02 != null) {
                com.facebook.ads.redexgen.core.AnonymousClass02<T> anonymousClass02A3i = anonymousClass09.A00().A3i(fileA02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return anonymousClass02A3i;
            }
            com.facebook.ads.redexgen.core.AnonymousClass02<T> anonymousClass02 = new com.facebook.ads.redexgen.core.AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return anonymousClass02;
        } catch (java.lang.InterruptedException unused) {
            if (this.A08) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.String baseUrl2 = A03(97, 11, 52);
                java.lang.StringBuilder sbAppend = sb2.append(baseUrl2).append(str);
                java.lang.String baseUrl3 = A03(0, 22, 79);
                sbAppend.append(baseUrl3).toString();
            }
            com.facebook.ads.redexgen.core.AnonymousClass02<T> anonymousClass03 = new com.facebook.ads.redexgen.core.AnonymousClass02<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return anonymousClass03;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass00
    public final com.facebook.ads.redexgen.core.AnonymousClass02<android.graphics.Bitmap> AFl(com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06, boolean z) {
        return A08(anonymousClass06, new com.facebook.ads.redexgen.core.AnonymousClass09(new com.facebook.ads.redexgen.core.C1393d3(anonymousClass06.A01, anonymousClass06.A00, this.A02.A04(), this.A02.A03(), z)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass00
    public final java.io.File AFm(com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06) {
        com.facebook.ads.redexgen.core.AnonymousClass09 anonymousClass09 = new com.facebook.ads.redexgen.core.AnonymousClass09(new com.facebook.ads.redexgen.core.C1392d2());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (java.io.File) A08(anonymousClass06, anonymousClass09).A00();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass00
    public final java.lang.String AFn(com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06) {
        return (java.lang.String) A08(anonymousClass06, new com.facebook.ads.redexgen.core.AnonymousClass09(new com.facebook.ads.redexgen.core.C1391d1())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass00
    public final java.lang.String AFo(com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06) {
        com.facebook.ads.redexgen.core.AnonymousClass09 anonymousClass09 = new com.facebook.ads.redexgen.core.AnonymousClass09(new com.facebook.ads.redexgen.core.C1391d1());
        anonymousClass09.A01(true);
        anonymousClass09.A02(false);
        return (java.lang.String) A08(anonymousClass06, anonymousClass09).A00();
    }
}

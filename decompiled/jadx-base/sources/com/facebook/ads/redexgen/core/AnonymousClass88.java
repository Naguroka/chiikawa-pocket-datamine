package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.88, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass88 {
    public static android.util.SparseIntArray A00;
    public static java.util.concurrent.Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static java.lang.String[] A05 = {"7RJhgfAHrbCmdmvJO272XvW7u1fNB6AD", "SRAGcoTEjCaoOjv1TM3aABjegfXmDbQ2", "TJJTsgNcbEXqB1u8vE3MpXQkjlg70u98", "t1ySRzXu9XpLihhV0EPpMNwY8xH1TItL", "3rsqEGuQmw5YOXxTuvx2sfjKNK9b", "ZMUzhorUr0JjW6bP", "tg0Wl7kwCnCjIdXfhu7KKTsHjGWToUDr", "3JMITBtDsKuz"};
    public static final java.util.List<java.lang.Integer> A06;
    public static final java.util.List<com.facebook.ads.redexgen.core.AnonymousClass89> A07;
    public static final java.util.concurrent.atomic.AtomicBoolean A08;
    public static final java.util.concurrent.atomic.AtomicInteger A09;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.AnonymousClass86> A0A;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.AnonymousClass87> A0B;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> A0C;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{117, 105, -86, -83, -83, -78, -67, -78, -72, -73, -86, -75, -110, -73, -81, -72, 105, -122, 105, -53, -65, 12, 4, 18, 18, 0, 6, 4, -65, -36, -65, -43, -55, 28, 30, 11, 29, 34, 25, 14, -20, 24, 13, 14, -55, -26, -55, -46, -91, -61, -48, -119, -42, -126, -50, -47, -55, -126, -90, -57, -60, -41, -55, -126, -89, -40, -57, -48, -42, -112, -126, -91, -47, -48, -42, -57, -38, -42, -126, -53, -43, -126, -48, -41, -50, -50, -112, -74, -30, -24, -31, -25, -40, -27, -83, -109, -46, -13, -16, 3, -11, -82, -15, 0, -17, 1, -10, -82, -16, -13, -15, -17, 3, 1, -13, -82, -3, -12, -82, -13, 4, -13, -4, 2, -82, 5, -9, 2, -10, -82, 1, 3, -16, 2, 7, -2, -13, -82, -53, -82, -56, -5, -26, -24, -24, -25, -24, -25, -93, -20, -15, -80, -16, -24, -16, -14, -11, -4, -93, -17, -14, -22, -93, -17, -20, -16, -20, -9, -92, -93, -49, -28, -10, -9, -93, -24, -7, -24, -15, -9, -67, -93, -12, 39, 18, 20, 31, 35, 24, 30, 29, -49, -13, 20, 17, 36, 22, -49, -12, 37, 20, 29, 35, -49, 38, 24, 35, 23, -49, 34, 36, 17, 35, 40, 31, 20, -49, -20, -49, -123, -72, -93, -91, -80, -76, -87, -81, -82, 96, -92, -75, -78, -87, -82, -89, 96, -84, -81, -89, -89, -87, -82, -89, 96, -92, -91, -94, -75, -89, 96, -91, -74, -91, -82, -76, 110, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -9, -20, -13, -7, -16, -24, -92, -14, -13, -8, -92, -20, -27, -12, -12, -23, -14, -92, -20, -23, -10, -23, -78, -122, -126, -127, -75, -92, -87, -91, -82, -93, -91, -114, -91, -76, -73, -81, -78, -85, -20, 17, 9, 18, -61, -25, 8, 5, 24, 10, -61, -24, 25, 8, 17, 23, -61, 26, 12, 23, 11, -61, 22, 24, 5, 23, 28, 19, 8, -61, -32, -61, -99, -72, -72, 105, -74, -86, -73, -62, 105, -82, -65, -82, -73, -67, -68, 105, -72, -81, 105, -68, -66, -85, -67, -62, -71, -82, 105, -84, -72, -83, -82, -125, 105, -8, -6, -11, -6, -9, 10, -9, -11, 2, 5, -3, -3, -1, 4, -3, -90, -77, -72, -93, -88, -87, -72, -87, -89, -72, -83, -77, -78, -93, -69, -77, -93, -73, -83, -85, -78, -91, -80, -93, -88, -91, -72, -91, -93, -80, -77, -85, -85, -83, -78, -85, -6, -8, -6, -1, -4, -60, -59, -65, -52, -49, -57, -57, -55, -50, -57, -49, -43, -54, -36, -47, -31, -16, -23, -23, -32, -25, 11, 18, 5, 1, 24, 3, 14, 11, 6, 3, 22, 11, 17, 16, -80, -89, -74, -71, -79, -76, -83};
    }

    static {
        A04();
        A00 = new android.util.SparseIntArray();
        A03 = false;
        A0B = new java.util.concurrent.atomic.AtomicReference<>();
        A0A = new java.util.concurrent.atomic.AtomicReference<>();
        A01 = java.util.concurrent.Executors.newSingleThreadExecutor();
        A06 = java.util.Arrays.asList(10, 50, 100, 1000);
        A07 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        A09 = new java.util.concurrent.atomic.AtomicInteger();
        A08 = new java.util.concurrent.atomic.AtomicBoolean();
        A0C = new java.util.concurrent.atomic.AtomicReference<>(false);
        A02 = false;
    }

    public static int A00(java.lang.String str, int i, com.facebook.ads.redexgen.core.C7j c7j) {
        if ((A01(462, 7, 5).equals(str) && com.facebook.ads.redexgen.core.C8E.A20 == i) || A01(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 5, 90).equals(str) || A01(442, 6, 62).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 7).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 89).equals(str)) {
            return com.facebook.ads.redexgen.core.Io.A05(c7j);
        }
        return -1;
    }

    public static /* synthetic */ java.util.List A02() {
        java.util.List<com.facebook.ads.redexgen.core.AnonymousClass89> list = A07;
        if (A05[0].charAt(12) == 'b') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A05;
        strArr[6] = "zk7JrRKdkqRVNKieaZlWPGFPyzHfiD6w";
        strArr[3] = "fyoGHU5IjzPGh6SPmUkkru2DTQYQg6uC";
        return list;
    }

    public static void A05(com.facebook.ads.redexgen.core.C7j c7j, int i, int i2) {
        c7j.A07().AA0(A01(427, 10, 35), com.facebook.ads.redexgen.core.C8E.A2Z, new com.facebook.ads.redexgen.core.C8F(A01(338, 33, 12) + i, A01(87, 9, 54) + i2));
    }

    @java.lang.Deprecated
    public static void A06(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, com.facebook.ads.redexgen.core.C8F c8f) {
        if (c7j == null) {
            A0F(new java.lang.RuntimeException(A01(48, 39, 37)));
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC04997i.A01(c7j.A01());
        if (A02 && c8f.A01() == 0) {
            A0D(new java.lang.RuntimeException(A01(96, 44, 81) + str + A01(31, 16, 108) + i, c8f));
        }
        try {
            if (A0J(c7j, str, i, java.lang.Math.random(), c8f)) {
                A09(c7j, str, i, c8f);
            }
        } catch (java.lang.Throwable th) {
            if (A05[7].length() == 7) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[6] = "Wr4fCxMFDWkIVvnx3dc83TKhQDpVGTp5";
            strArr[3] = "OVQSbEPH5m9BJKnAfFJqQw5cDphpT4wi";
            A0F(th);
        }
    }

    @java.lang.Deprecated
    public static void A07(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, com.facebook.ads.redexgen.core.C8F c8f) {
        try {
            c8f.A05(2);
            c8f.A0A(false);
            c8f.A06(1);
            if (com.facebook.ads.redexgen.core.Io.A0Q(c7j)) {
                c8f.A08(true);
            } else {
                c8f.A08(false);
            }
            A06(c7j, str, i, c8f);
        } catch (java.lang.Throwable t) {
            A0F(t);
        }
    }

    @java.lang.Deprecated
    public static void A08(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, com.facebook.ads.redexgen.core.C8F c8f) {
        try {
            c8f.A05(2);
            c8f.A08(false);
            A06(c7j, str, i, c8f);
        } catch (java.lang.Throwable th) {
            java.lang.String[] strArr = A05;
            if (strArr[2].charAt(18) != strArr[1].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[2] = "lrlTLjNTeannl0YPXC3Gfh7JwXVpOQq4";
            strArr2[1] = "kBSf974kPIRKP3U3j132aDHcl1k5alA0";
            A0F(th);
        }
    }

    public static void A09(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, com.facebook.ads.redexgen.core.C8F c8f) {
        synchronized (com.facebook.ads.redexgen.core.AnonymousClass88.class) {
            if (!A03) {
                int iA01 = com.facebook.ads.redexgen.core.Io.A01(c7j);
                int threshold = A09.getAndIncrement();
                if (threshold < iA01 - 1) {
                    A07.add(new com.facebook.ads.redexgen.core.AnonymousClass89(str, i, c8f));
                } else if (A09.get() == iA01) {
                    A07.add(new com.facebook.ads.redexgen.core.AnonymousClass89(A01(427, 10, 35), com.facebook.ads.redexgen.core.C8E.A2W, new com.facebook.ads.redexgen.core.C8F(A01(140, 42, 70) + str + A01(47, 1, 91) + i)));
                }
            } else {
                A0A(c7j, str, i, c8f, true);
            }
        }
    }

    public static void A0A(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, com.facebook.ads.redexgen.core.C8F c8f, boolean z) {
        com.facebook.ads.redexgen.core.AnonymousClass87 anonymousClass87 = A0B.get();
        boolean z2 = anonymousClass87 != null && anonymousClass87.A9f();
        boolean z3 = A08.get();
        java.lang.String[] strArr = A05;
        if (strArr[6].charAt(6) == strArr[3].charAt(6)) {
            throw new java.lang.RuntimeException();
        }
        A05[0] = "wcUF0zMFhzDc2LBIPX26ddygqjW04ktX";
        if (z3 || z2) {
            int iA01 = c8f.A01();
            java.lang.String strA01 = A01(289, 17, 3);
            java.lang.String strA02 = A01(31, 16, 108);
            if (iA01 == 0) {
                android.util.Log.e(strA01, A01(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, 37, 114) + str + strA02 + i, c8f);
            } else {
                android.util.Log.i(strA01, A01(306, 32, 102) + str + strA02 + i + A01(19, 12, 98) + c8f.getMessage() + A01(0, 19, 12) + c8f.A03());
            }
        }
        com.facebook.ads.redexgen.core.C1190Zj c1190Zj = new com.facebook.ads.redexgen.core.C1190Zj(c7j, str, i, c8f, anonymousClass87);
        if (z) {
            A01.execute(c1190Zj);
        } else {
            c1190Zj.run();
        }
    }

    public static void A0C(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.AnonymousClass87 anonymousClass87, com.facebook.ads.redexgen.core.AnonymousClass86 anonymousClass86, boolean z) {
        A0A.set(anonymousClass86);
        A0B.set(anonymousClass87);
        A08.set(z);
        synchronized (com.facebook.ads.redexgen.core.AnonymousClass88.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new com.facebook.ads.redexgen.core.C1191Zk(c1198Zr));
            }
        }
    }

    public static void A0D(final java.lang.RuntimeException runtimeException) {
        if (A02) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.85
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @java.lang.Deprecated
    public static void A0E(java.lang.Throwable th) {
        if (A02) {
            A0D(new java.lang.RuntimeException(A01(256, 33, 71), th));
        }
    }

    public static void A0F(java.lang.Throwable th) {
        android.util.Log.e(A01(289, 17, 3), A01(219, 37, 3), th);
        if (A02) {
            A0D(new java.lang.RuntimeException(th));
        }
    }

    public static boolean A0H(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.Boolean shouldSkipFunnelEventsForSession = A0C.get();
        return (shouldSkipFunnelEventsForSession == null || !shouldSkipFunnelEventsForSession.booleanValue()) && com.facebook.ads.redexgen.core.Io.A0A(c7j) != 0;
    }

    public static boolean A0I(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.Boolean shouldSkipFunnelEventsForSession = A0C.get();
        if (shouldSkipFunnelEventsForSession != null && shouldSkipFunnelEventsForSession.booleanValue()) {
            return false;
        }
        double funnelEventLogProbability = 1.0d / ((double) com.facebook.ads.redexgen.core.Io.A0A(c7j));
        return c7j.A08().A00() <= funnelEventLogProbability;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
    
        com.facebook.ads.redexgen.core.AnonymousClass88.A0C.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
    
        if (r0 <= 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0188, code lost:
    
        r7 = 1.0d / ((double) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r11 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        r7 = r7 * r2;
        r2 = com.facebook.ads.redexgen.core.AnonymousClass88.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019e, code lost:
    
        if (r2[6].charAt(6) == r2[3].charAt(6)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AnonymousClass88.A05;
        r2[5] = "ov2u4VJ7e4Jf0Cpe";
        r2[4] = "3S8vDNMGZoIrI2ECoHj3stfewtnb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
    
        if (r9 > r7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b2, code lost:
    
        r2 = com.facebook.ads.redexgen.core.AnonymousClass88.A05;
        r2[2] = "J7AbISTAh4tNpjUdhq3A9LORixiN2LjD";
        r2[1] = "NK4gpNISnoGezA2FzC3Uh9mHyAzfRHIK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c0, code lost:
    
        if (r9 > r7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c7, code lost:
    
        if (r9 > r7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        if (r6 == 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        if (r6 == 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0163, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0164, code lost:
    
        r0 = com.facebook.ads.redexgen.core.AnonymousClass88.A0C.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016c, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
    
        if (r0.booleanValue() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0174, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0175, code lost:
    
        r0 = com.facebook.ads.redexgen.core.Io.A0A(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
    
        if (r0 != 0) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0J(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, double d, com.facebook.ads.redexgen.core.C8F c8f) {
        double d2;
        boolean z;
        int additionalDebugLoggingSamplingPercentage;
        try {
            int iA04 = com.facebook.ads.redexgen.core.Io.A04(c7j);
            if (iA04 < 1) {
                return false;
            }
            java.util.HashMap<java.lang.String, java.lang.Integer> blackListEventsHashMap = com.facebook.ads.redexgen.core.Io.A0M(c7j);
            java.util.Set<java.lang.String> setKeySet = blackListEventsHashMap.keySet();
            java.lang.String str2 = str + A01(47, 1, 91) + i;
            boolean zContains = setKeySet.contains(str2);
            java.lang.String[] strArr = A05;
            if (strArr[5].length() != strArr[4].length()) {
                java.lang.String[] strArr2 = A05;
                strArr2[5] = "Da1Avoa7PC9D4jtB";
                strArr2[4] = "iedDIpQY7PrwfrxyH9GARbotTLh4";
                if (zContains) {
                    java.lang.Integer num = blackListEventsHashMap.get(str2);
                    int additionalDebugLoggingSamplingPercentage2 = num != null ? num.intValue() : -1;
                    if (additionalDebugLoggingSamplingPercentage2 == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage2 > 0) {
                        return d <= 1.0d / ((double) additionalDebugLoggingSamplingPercentage2);
                    }
                    int additionalDebugLoggingSamplingPercentage3 = com.facebook.ads.redexgen.core.Io.A03(c7j);
                    if (additionalDebugLoggingSamplingPercentage3 < 1) {
                        return false;
                    }
                    d2 = ((double) (iA04 * additionalDebugLoggingSamplingPercentage3)) / 10000.0d;
                } else if (!c8f.A0B()) {
                    d2 = 0.0d;
                } else {
                    d2 = ((double) iA04) / 100.0d;
                }
                double ipcValidationEventLogProbability = c7j.A08().A00();
                if (A01(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 5, 90).equals(str)) {
                    if (c7j.A04().A9O()) {
                        return true;
                    }
                    int additionalDebugLoggingSamplingPercentage4 = com.facebook.ads.redexgen.core.Io.A06(c7j);
                    if (additionalDebugLoggingSamplingPercentage4 == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage4 > 0) {
                        double d3 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage4);
                        if (zContains) {
                            return ipcValidationEventLogProbability <= d3 * d2;
                        }
                        return ipcValidationEventLogProbability <= d3;
                    }
                }
                if (A01(462, 7, 5).equals(str) && com.facebook.ads.redexgen.core.C8E.A20 == i) {
                    if (!A08.get()) {
                        additionalDebugLoggingSamplingPercentage = com.facebook.ads.redexgen.core.Io.A0E(c7j);
                    } else {
                        additionalDebugLoggingSamplingPercentage = 1;
                    }
                    if (additionalDebugLoggingSamplingPercentage == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage > 0) {
                        double d4 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage);
                        if (zContains) {
                            return ipcValidationEventLogProbability <= d4 * d2;
                        }
                        return ipcValidationEventLogProbability <= d4;
                    }
                }
                if (A01(437, 5, 44).equals(str)) {
                    return true;
                }
                if (A01(442, 6, 62).equals(str)) {
                    if ((!com.facebook.ads.redexgen.core.Io.A0S(c7j) || !c8f.A0C()) && c8f.A00() != 1) {
                        int iA00 = c8f.A00();
                        if (A05[7].length() != 7) {
                            java.lang.String[] strArr3 = A05;
                            strArr3[2] = "6ijQ6X2zmPYfQQU2WY3EqOEmj8b0STeR";
                            strArr3[1] = "v2LtmjlgYOVyMOqq5T34ZrqwCCOH8Ygu";
                        } else {
                            java.lang.String[] strArr4 = A05;
                            strArr4[2] = "wTzk43rUxJxbc4jkjq3CyWQqu78IUc7I";
                            strArr4[1] = "zVF5buGMjKYPgcPHAX3soMXKkjG8wJtb";
                        }
                    }
                    if (zContains) {
                        double d5 = 1.0d - d2;
                        if (A05[7].length() != 7) {
                            A05[0] = "IU4RZwbJxJdQMYPPezGzztuufFdsMCjm";
                            if (d < d5) {
                                return false;
                            }
                        } else if (d < d5) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                if (A01(448, 14, 101).equals(str)) {
                    if (c7j.A04().A9O()) {
                        return true;
                    }
                    z = true;
                    int additionalDebugLoggingSamplingPercentage5 = com.facebook.ads.redexgen.core.Io.A0B(c7j);
                    if (additionalDebugLoggingSamplingPercentage5 == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage5 > 0) {
                        double d6 = 1.0d / ((double) additionalDebugLoggingSamplingPercentage5);
                        java.lang.String[] strArr5 = A05;
                        if (strArr5[6].charAt(6) != strArr5[3].charAt(6)) {
                            java.lang.String[] strArr6 = A05;
                            strArr6[2] = "IV4whqvlQLD0BGXZPQ3YwVprPZOrPfbL";
                            strArr6[1] = "vZNpMhzuAfXWQcU0qp3zVw8qbcOKNKfo";
                            if (zContains) {
                                return ipcValidationEventLogProbability <= d6 * d2;
                            }
                            if (A05[7].length() != 7) {
                                java.lang.String[] strArr7 = A05;
                                strArr7[2] = "6LkwaBQPiPnxYF7a6l3NxmTSXnPItWFw";
                                strArr7[1] = "XjU0i6EyUZ5pzK8FIO3t5mLCTCszmPw2";
                                if (ipcValidationEventLogProbability <= d6) {
                                    return true;
                                }
                            } else if (ipcValidationEventLogProbability <= d6) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else {
                    z = true;
                }
                if (d >= 1.0d - d2) {
                    return z;
                }
                return false;
            }
            throw new java.lang.RuntimeException();
        } catch (java.lang.Throwable t) {
            A0F(t);
            return false;
        }
    }

    public static boolean A0K(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, int i, com.facebook.ads.redexgen.core.C8F c8f) {
        if (!com.facebook.ads.redexgen.core.Io.A0P(c7j)) {
            return true;
        }
        int customLimit = A00.get(i);
        int eventsLimit = com.facebook.ads.redexgen.core.Io.A00(c7j);
        if (c8f.A02() != -1) {
            eventsLimit = c8f.A02();
        } else {
            int currentCounter = A00(str, i, c7j);
            if (eventsLimit < currentCounter) {
                eventsLimit = currentCounter;
            }
        }
        if (customLimit >= eventsLimit) {
            if (A06.contains(java.lang.Integer.valueOf(customLimit)) && c8f.A0D()) {
                A05(c7j, i, customLimit);
            }
            A00.put(i, customLimit + 1);
            return true;
        }
        A00.put(i, customLimit + 1);
        return false;
    }
}

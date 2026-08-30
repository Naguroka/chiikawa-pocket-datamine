package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04766f {
    public static com.facebook.ads.redexgen.core.AnonymousClass00 A0A;
    public static java.util.List<java.lang.String> A0B;
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", "cv"};
    public static final java.lang.String A0E;
    public static final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.AnonymousClass06> A0F;
    public static final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C04786h> A0G;
    public long A00;
    public com.facebook.ads.redexgen.core.JF A01;
    public final com.facebook.ads.redexgen.core.C04776g A03;
    public final com.facebook.ads.redexgen.core.C7j A04;
    public final boolean A08;
    public final boolean A09;
    public final java.util.Map<java.lang.String, android.graphics.Bitmap> A07 = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public final android.os.Handler A02 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.List<java.util.concurrent.Callable<java.lang.Boolean>> A05 = new java.util.ArrayList();
    public final java.util.List<java.util.concurrent.Callable<java.lang.Boolean>> A06 = new java.util.ArrayList();

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.util.concurrent.atomic.AtomicBoolean A0D(java.util.ArrayList<java.util.concurrent.Callable<java.lang.Boolean>> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator<java.util.concurrent.Callable<java.lang.Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(com.facebook.ads.redexgen.core.M8.A02().submit(it.next()));
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        try {
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                java.lang.Boolean bool = (java.lang.Boolean) ((java.util.concurrent.Future) it2.next()).get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e(A0E, A08(86, 42, 126), e);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{122, 122, 121, 125, 125, 112, 124, 122, 93, 86, 93, 92, 13, 90, 87, 15, 34, 38, 116, 39, 46, 46, 34, 35, 11, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, 64, 7, 68, 72, 74, 87, 75, 66, 83, 66, okio.Utf8.REPLACEMENT_BYTE, 29, 31, 20, 21, 18, 27, 92, 26, 29, 21, 16, 25, 24, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, 12, 66, 64, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, 127, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = com.facebook.ads.redexgen.core.C04766f.class.getSimpleName();
        A0F = java.util.Collections.synchronizedMap(new java.util.HashMap());
        A0G = java.util.Collections.synchronizedMap(new java.util.HashMap());
    }

    public C04766f(com.facebook.ads.redexgen.core.C7j c7j) {
        this.A04 = c7j;
        this.A03 = com.facebook.ads.redexgen.core.C04776g.A06(c7j.A01());
        this.A08 = com.facebook.ads.redexgen.core.C0762Im.A2d(c7j);
        this.A09 = com.facebook.ads.redexgen.core.C0762Im.A2m(c7j, com.facebook.ads.redexgen.core.RS.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized com.facebook.ads.redexgen.core.AnonymousClass00 A03(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A0A == null) {
            A0A = com.facebook.ads.redexgen.core.AnonymousClass01.A00(c1198Zr, new java.lang.Object() { // from class: com.facebook.ads.redexgen.X.07
                public int A00;
                public int A01;
                public boolean A02;
                public boolean A03;
                public boolean A04;

                public final com.facebook.ads.redexgen.core.AnonymousClass07 A00(int i) {
                    this.A00 = i;
                    return this;
                }

                public final com.facebook.ads.redexgen.core.AnonymousClass07 A01(int i) {
                    this.A01 = i;
                    return this;
                }

                public final com.facebook.ads.redexgen.core.AnonymousClass07 A02(boolean z) {
                    this.A02 = z;
                    return this;
                }

                public final com.facebook.ads.redexgen.core.AnonymousClass07 A03(boolean z) {
                    this.A03 = z;
                    return this;
                }

                public final com.facebook.ads.redexgen.core.AnonymousClass07 A04(boolean z) {
                    this.A04 = z;
                    return this;
                }

                public final com.facebook.ads.redexgen.core.AnonymousClass08 A05() {
                    return new com.facebook.ads.redexgen.core.AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                }
            }.A00(com.facebook.ads.redexgen.core.C0762Im.A06(c1198Zr)).A02(c1198Zr.A04().A9O()).A01(-1).A03(com.facebook.ads.redexgen.core.C0762Im.A0m(c1198Zr)).A04(com.facebook.ads.redexgen.core.C0762Im.A2l(c1198Zr)).A05(), A05(c1198Zr));
        }
        return A0A;
    }

    public static com.facebook.ads.redexgen.core.AnonymousClass06 A04(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (com.facebook.ads.redexgen.core.C04796i.A06(c7j) && anonymousClass06 != null) {
            com.facebook.ads.redexgen.core.AnonymousClass06 storedCacheData = new com.facebook.ads.redexgen.core.AnonymousClass06(anonymousClass06);
            return storedCacheData;
        }
        com.facebook.ads.redexgen.core.AnonymousClass06 storedCacheData2 = new com.facebook.ads.redexgen.core.AnonymousClass06(str);
        return storedCacheData2;
    }

    public static com.facebook.ads.redexgen.core.C1203Zw A05(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return new com.facebook.ads.redexgen.core.C1203Zw(c1198Zr);
    }

    public static synchronized java.util.List<java.lang.String> A09(com.facebook.ads.redexgen.core.C7j c7j) {
        if (A0B == null) {
            A0B = new java.util.ArrayList();
            A0J(A0B, c7j);
        }
        return A0B;
    }

    public static /* synthetic */ java.util.Map A0A() {
        java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C04786h> map = A0G;
        if (A0D[7].length() == 16) {
            throw new java.lang.RuntimeException();
        }
        A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
        return map;
    }

    public static void A0H(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C04796i.A06(c7j) && !android.text.TextUtils.isEmpty(str)) {
            com.facebook.ads.redexgen.core.C04786h c04786h = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new java.lang.RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c04786h != null) {
                c04786h.A00 = A08(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 4, 118);
                com.facebook.ads.redexgen.core.C1198Zr c1198ZrA01 = c7j.A01();
                com.facebook.ads.redexgen.core.RW rwA05 = com.facebook.ads.redexgen.core.RW.A05(c1198ZrA01);
                java.lang.String strA08 = com.facebook.ads.redexgen.core.RW.A08(c1198ZrA01, com.facebook.ads.redexgen.core.L5.A00(str));
                if (strA08 == null) {
                    strA08 = str;
                }
                com.facebook.ads.redexgen.core.C04796i.A04(c7j, c04786h, rwA05.A0H(strA08));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(com.facebook.ads.redexgen.core.JE je) {
        if (this.A01 == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put(A08(org.objectweb.asm.Opcodes.FRETURN, 12, 71), com.facebook.ads.redexgen.core.C0841Lu.A04(this.A00));
        this.A01.A04(je, map);
    }

    public static void A0J(java.util.List<java.lang.String> cacheDirs, com.facebook.ads.redexgen.core.C7j c7j) {
        A0K(cacheDirs, com.facebook.ads.redexgen.core.C1390d0.A01(c7j));
        A0K(cacheDirs, com.facebook.ads.redexgen.core.C04776g.A07(c7j));
    }

    public static void A0K(java.util.List<java.lang.String> list, java.io.File file) {
        java.lang.String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        java.lang.String path2 = A08(0, 0, 103);
        if (path != path2) {
            java.util.Locale locale = java.util.Locale.getDefault();
            java.lang.String path3 = A0D[4];
            if (path3.length() == 2) {
                throw new java.lang.RuntimeException();
            }
            A0D[4] = "BAOa9xP";
            java.lang.String path4 = path.toLowerCase(locale);
            list.add(path4);
        }
    }

    public final android.graphics.Bitmap A0M(java.lang.String str) {
        return this.A07.get(str);
    }

    public final android.graphics.Bitmap A0N(java.lang.String str, int i, int i2) {
        if (this.A08) {
            com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
            anonymousClass06A04.A03 = A08(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 4, 118);
            anonymousClass06A04.A01 = i2;
            anonymousClass06A04.A00 = i;
            return A03(this.A04.A01()).AFl(anonymousClass06A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i, i2, A08(org.objectweb.asm.Opcodes.TABLESWITCH, 4, 85));
    }

    public final java.io.File A0O(java.lang.String str) {
        com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
        anonymousClass06A04.A03 = A08(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 4, 118);
        return A03(this.A04.A01()).AFm(anonymousClass06A04);
    }

    public final java.io.File A0P(java.lang.String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final java.lang.String A0Q(java.lang.String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final java.lang.String A0R(java.lang.String str) {
        com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
        anonymousClass06A04.A03 = A08(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 4, 118);
        java.lang.String strAFo = A03(this.A04.A01()).AFo(anonymousClass06A04);
        return strAFo != null ? strAFo : str;
    }

    public final java.lang.String A0S(java.lang.String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A08(128, 19, 125), A08(38, 16, 123), A08(8, 8, 50));
    }

    public final void A0U() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A08(org.objectweb.asm.Opcodes.I2S, 16, 80), A08(54, 14, 32), A08(0, 8, 20));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(com.facebook.ads.redexgen.core.C6X c6x, com.facebook.ads.redexgen.core.C6Y c6y) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A08(org.objectweb.asm.Opcodes.IF_ICMPGT, 7, 81), A08(68, 18, 90), A08(16, 8, 75));
        this.A00 = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.C04796i.A02(this.A04, c6y, com.facebook.ads.redexgen.core.C04796i.A07, A08(24, 14, 20), -1L);
        com.facebook.ads.redexgen.core.M8.A03().execute(new com.facebook.ads.redexgen.core.C1204Zx(this, new java.util.ArrayList(this.A05), c6y, c6x, new java.util.ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(com.facebook.ads.redexgen.core.C04726b c04726b) {
        this.A05.add(new com.facebook.ads.redexgen.core.CallableC04736c(this, c04726b));
    }

    public final void A0Y(com.facebook.ads.redexgen.core.C04726b c04726b) {
        c04726b.A05 = true;
        this.A06.add(new com.facebook.ads.redexgen.core.CallableC04736c(this, c04726b));
    }

    public final void A0Z(com.facebook.ads.redexgen.core.C04726b c04726b) {
        c04726b.A05 = true;
        if (this.A09) {
            this.A06.add(new com.facebook.ads.redexgen.core.CallableC04716a(this, c04726b));
        } else {
            this.A06.add(new com.facebook.ads.redexgen.core.CallableC04736c(this, c04726b));
        }
    }

    public final void A0a(com.facebook.ads.redexgen.core.C04726b c04726b) {
        if (this.A09) {
            this.A05.add(new com.facebook.ads.redexgen.core.CallableC04716a(this, c04726b));
        } else {
            this.A05.add(new com.facebook.ads.redexgen.core.CallableC04736c(this, c04726b));
        }
    }

    public final void A0b(final com.facebook.ads.redexgen.core.C04746d c04746d) {
        java.util.concurrent.Callable<java.lang.Boolean> callable = new java.util.concurrent.Callable<java.lang.Boolean>(c04746d) { // from class: com.facebook.ads.redexgen.X.6e
            public static byte[] A02;
            public final com.facebook.ads.redexgen.core.C04746d A00;

            static {
                A02();
            }

            public static java.lang.String A01(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
                }
                return new java.lang.String(bArrCopyOfRange);
            }

            public static void A02() {
                A02 = new byte[]{-35, -31, -43, -37, -39};
            }

            {
                this.A00 = c04746d;
            }

            private final java.lang.Boolean A00() throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return null;
                }
                try {
                    android.net.TrafficStats.setThreadStatsTag(61453);
                    com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06 = new com.facebook.ads.redexgen.core.AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 114), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    if (com.facebook.ads.redexgen.core.C04796i.A06(this.A01.A04)) {
                        com.facebook.ads.redexgen.core.C04766f.A0F.put(this.A00.A07, anonymousClass06);
                    }
                    boolean precacheResult = false;
                    if (this.A01.A08) {
                        precacheResult = com.facebook.ads.redexgen.core.C04766f.A03(this.A01.A04.A01()).AFl(anonymousClass06, false).A01();
                    } else if (this.A01.A03.A0D(this.A00) != null) {
                        precacheResult = true;
                    }
                    com.facebook.ads.redexgen.core.C6l c6l = this.A00.A00;
                    if (c6l != null && c6l.A02()) {
                        int iA00 = c6l.A00();
                        int iA01 = c6l.A01();
                        if (iA00 <= 0 || iA01 <= 0) {
                            if (this.A01.A08) {
                                A04(this.A00.A07, anonymousClass06);
                            } else {
                                A03(this.A00.A03, this.A00.A04);
                            }
                        } else if (this.A01.A08) {
                            anonymousClass06.A00 = iA00;
                            anonymousClass06.A01 = iA01;
                            A04(this.A00.A07, anonymousClass06);
                        } else {
                            A03(iA00, iA01);
                        }
                    }
                    return java.lang.Boolean.valueOf(precacheResult);
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                    return null;
                }
            }

            private void A03(int i, int i2) {
                android.graphics.Bitmap bitmapA0E = this.A01.A03.A0E(this.A01.A04, this.A00.A07, i, i2, this.A00.A01);
                if (bitmapA0E == null) {
                    return;
                }
                this.A01.A07.put(this.A00.A07, bitmapA0E);
            }

            private void A04(java.lang.String str, com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06) {
                android.graphics.Bitmap bitmapA00 = com.facebook.ads.redexgen.core.C04766f.A03(this.A01.A04.A01()).AFl(anonymousClass06, true).A00();
                if (bitmapA00 == null) {
                    return;
                }
                this.A01.A07.put(str, bitmapA00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                    return null;
                }
            }
        };
        if (!c04746d.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(com.facebook.ads.redexgen.core.C04746d c04746d) {
        c04746d.A02 = true;
        A0b(c04746d);
    }

    public final void A0d(com.facebook.ads.redexgen.core.JF jf) {
        this.A01 = jf;
    }
}

package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KS implements com.facebook.ads.redexgen.core.InterfaceC0993Rq {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final java.lang.String A09;
    public com.facebook.ads.redexgen.core.C8D A00;
    public java.util.concurrent.Executor A01;
    public boolean A02;
    public com.facebook.ads.redexgen.core.C0998Rv A03;
    public final com.facebook.ads.redexgen.core.S0 A04 = new com.facebook.ads.redexgen.core.L3();
    public final com.facebook.ads.redexgen.core.S5 A05;
    public final com.facebook.ads.redexgen.core.S6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final com.facebook.ads.redexgen.core.InterfaceC0992Rp A01(com.facebook.ads.redexgen.core.S2 s2) throws com.facebook.ads.redexgen.core.S3 {
        com.facebook.ads.redexgen.core.S3 s3;
        java.lang.String strA07 = A07(220, 7, 86);
        java.net.HttpURLConnection httpURLConnection = null;
        com.facebook.ads.redexgen.core.KT ktA05 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                java.net.HttpURLConnection httpURLConnectionA08 = A08(s2.A05(), com.facebook.ads.redexgen.core.L7.A04() ? A09() : null);
                A0H(httpURLConnectionA08, s2);
                A0G(httpURLConnectionA08, s2);
                if (this.A06.A9X()) {
                    this.A06.AAO(httpURLConnectionA08, s2.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                java.util.Set<java.lang.String> setA01 = this.A03.A01();
                java.util.Set<java.lang.String> setA02 = this.A03.A02();
                boolean z2 = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z = true;
                }
                if ((httpURLConnectionA08 instanceof javax.net.ssl.HttpsURLConnection) && (z2 || z)) {
                    try {
                        com.facebook.ads.redexgen.core.S7.A03((javax.net.ssl.HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (java.security.cert.CertificateException e) {
                        this.A00.AAS(strA07, com.facebook.ads.redexgen.core.C8E.A1z, new com.facebook.ads.redexgen.core.C8F(e));
                    } catch (java.lang.Exception e2) {
                        this.A00.AAS(strA07, com.facebook.ads.redexgen.core.C8E.A1y, new com.facebook.ads.redexgen.core.C8F(e2));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && s2.A06() != null) {
                    A00(httpURLConnectionA08, s2.A06());
                }
                com.facebook.ads.redexgen.core.KT ktA06 = httpURLConnectionA08.getDoInput() ? A06(httpURLConnectionA08) : new com.facebook.ads.redexgen.core.KT(httpURLConnectionA08, null);
                if (this.A06.A9X()) {
                    this.A06.AAP(ktA06);
                }
                if (httpURLConnectionA08 != null) {
                    httpURLConnectionA08.disconnect();
                }
                return ktA06;
            } catch (java.lang.Throwable th) {
                if (this.A06.A9X()) {
                    this.A06.AAP(ktA05);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Exception e3) {
            try {
                try {
                    ktA05 = A05(null);
                    if (A08[7].length() == 19) {
                        throw new java.lang.RuntimeException();
                    }
                    A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                    if (ktA05 == null || ktA05.A8R() <= 0) {
                        s3 = new com.facebook.ads.redexgen.core.S3(e3, ktA05);
                        throw s3;
                    }
                    if (this.A06.A9X()) {
                        this.A06.AAP(ktA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return ktA05;
                } catch (java.lang.Throwable unused) {
                    if (ktA05 == null || ktA05.A8R() <= 0) {
                        throw new com.facebook.ads.redexgen.core.S3(e3, ktA05);
                    }
                    if (this.A06.A9X()) {
                        this.A06.AAP(ktA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return ktA05;
                }
            } catch (java.lang.Exception unused2) {
                android.util.Log.e(getClass().getSimpleName(), A07(117, 13, 98), e3);
                if (0 != 0 && ktA05.A8R() > 0) {
                    if (this.A06.A9X()) {
                        this.A06.AAP(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                s3 = new com.facebook.ads.redexgen.core.S3(e3, null);
            }
        }
    }

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, 14, 102, 100, 77, 64, 9, 77, 79, 30, 93, 75, 76, 82, 30, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, 22, 80, 75, 120, 116, 23, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, kotlin.io.encoding.Base64.padSymbol, 22, 7, 4, 28, 1, 24, 83, 22, 1, 1, 28, 1, 23, 22, 4, 111, 122, 22, 7, 7, 27, 30, 20, 22, 3, 30, 24, 25, 88, 15, 90, 0, 0, 0, 90, 17, 24, 5, 26, 90, 2, 5, 27, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, 26, 23, 81, 26, 23, 83, 120, 100, 100, 96, 62, 96, 98, 127, 104, 105, 88, 127, 99, 100, 27, 7, 7, 3, 93, 3, 1, 28, 11, 10, 35, 28, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final com.facebook.ads.redexgen.core.InterfaceC0992Rp A0J(com.facebook.ads.redexgen.core.S2 s2) throws com.facebook.ads.redexgen.core.S3 {
        com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpA00;
        long length;
        long length2;
        int iA8R;
        int i = 0;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        int iA01 = s2.A02().A01();
        long jA03 = s2.A02().A03();
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() + ((long) s2.A02().A04());
        while (true) {
            if (i >= iA01 || jCurrentTimeMillis2 <= java.lang.System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.A9X()) {
                    java.lang.String str = (i + 1) + A07(37, 4, 97) + iA01 + A07(56, 9, 27) + s2.A05();
                }
                jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpA01 = A01(s2);
                if (interfaceC0992RpA01 != null) {
                    this.A00.AAJ(jCurrentTimeMillis, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, interfaceC0992RpA01.A6W().length, s2.A04 == null ? 0L : s2.A04.length, interfaceC0992RpA01.A8R(), null);
                    return interfaceC0992RpA01;
                }
                continue;
            } catch (com.facebook.ads.redexgen.core.S3 e) {
                if (!A0I(e, jCurrentTimeMillis, s2)) {
                    if (this.A05.ABv(e)) {
                    }
                    interfaceC0992RpA00 = e.A00();
                    com.facebook.ads.redexgen.core.C8D c8d = this.A00;
                    long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
                    if (A08[1].charAt(0) != 'l') {
                        A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                        if (interfaceC0992RpA00 != null) {
                            if (interfaceC0992RpA00.A6W() == null) {
                                length = interfaceC0992RpA00.A6W().length;
                            }
                        }
                        if (s2.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = s2.A04.length;
                        }
                        if (interfaceC0992RpA00 == null) {
                            iA8R = 0;
                        } else {
                            iA8R = interfaceC0992RpA00.A8R();
                        }
                        c8d.AAJ(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA8R, e);
                        throw e;
                    }
                    A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                    if (interfaceC0992RpA00 != null) {
                        if (interfaceC0992RpA00.A6W() == null) {
                            length = interfaceC0992RpA00.A6W().length;
                        }
                    }
                    if (s2.A04 == null) {
                        length2 = 0;
                    } else {
                        length2 = s2.A04.length;
                    }
                    if (interfaceC0992RpA00 == null) {
                        iA8R = 0;
                    } else {
                        iA8R = interfaceC0992RpA00.A8R();
                    }
                    c8d.AAJ(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA8R, e);
                    throw e;
                    length = 0;
                    if (s2.A04 == null) {
                        length2 = 0;
                    } else {
                        length2 = s2.A04.length;
                    }
                    if (interfaceC0992RpA00 == null) {
                        iA8R = 0;
                    } else {
                        iA8R = interfaceC0992RpA00.A8R();
                    }
                    c8d.AAJ(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA8R, e);
                    throw e;
                }
                int i2 = iA01 - 1;
                if (A08[1].charAt(0) == 'l') {
                    throw new java.lang.RuntimeException();
                }
                A08[1] = "iDEOxz3pTPjJqVLmMx3mPs9K2XOoyKBI";
                if (i < i2) {
                    continue;
                } else {
                    if (this.A05.ABv(e) || i >= iA01 - 1) {
                        interfaceC0992RpA00 = e.A00();
                        com.facebook.ads.redexgen.core.C8D c8d2 = this.A00;
                        long jCurrentTimeMillis4 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
                        if (A08[1].charAt(0) != 'l') {
                            A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                            if (interfaceC0992RpA00 != null) {
                                if (interfaceC0992RpA00.A6W() == null) {
                                    length = interfaceC0992RpA00.A6W().length;
                                }
                            }
                            if (s2.A04 == null) {
                                length2 = 0;
                            } else {
                                length2 = s2.A04.length;
                            }
                            if (interfaceC0992RpA00 == null) {
                                iA8R = 0;
                            } else {
                                iA8R = interfaceC0992RpA00.A8R();
                            }
                            c8d2.AAJ(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA8R, e);
                            throw e;
                        }
                        A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                        if (interfaceC0992RpA00 != null) {
                            if (interfaceC0992RpA00.A6W() == null) {
                                length = interfaceC0992RpA00.A6W().length;
                            }
                        }
                        if (s2.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = s2.A04.length;
                        }
                        if (interfaceC0992RpA00 == null) {
                            iA8R = 0;
                        } else {
                            iA8R = interfaceC0992RpA00.A8R();
                        }
                        c8d2.AAJ(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA8R, e);
                        throw e;
                        length = 0;
                        if (s2.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = s2.A04.length;
                        }
                        if (interfaceC0992RpA00 == null) {
                            iA8R = 0;
                        } else {
                            iA8R = interfaceC0992RpA00.A8R();
                        }
                        c8d2.AAJ(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA8R, e);
                        throw e;
                    }
                    if (jA03 > 0) {
                        try {
                            java.lang.Thread.sleep(jA03);
                        } catch (java.lang.InterruptedException e2) {
                            this.A00.AAJ(jCurrentTimeMillis, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, 0L, s2.A04 != null ? s2.A04.length : 0L, 0, e2);
                            throw e;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
        this.A00.AAJ(jCurrentTimeMillis, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, 0L, s2.A04 == null ? 0L : s2.A04.length, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
        return null;
    }

    static {
        A0A();
        A09 = com.facebook.ads.redexgen.core.InterfaceC0993Rq.class.getSimpleName();
    }

    public KS(com.facebook.ads.redexgen.core.C0998Rv c0998Rv, com.facebook.ads.redexgen.core.C8D c8d, java.util.concurrent.Executor executor) {
        A0B();
        this.A03 = c0998Rv;
        this.A06 = new com.facebook.ads.redexgen.core.KR(c0998Rv.A04());
        final com.facebook.ads.redexgen.core.S6 s6 = this.A06;
        this.A05 = new com.facebook.ads.redexgen.core.AbstractC0810Kn(s6) { // from class: com.facebook.ads.redexgen.X.7A
        };
        this.A01 = executor;
        this.A00 = c8d;
    }

    private final int A00(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.lang.Exception {
        java.io.OutputStream outputStreamAEJ = null;
        try {
            outputStreamAEJ = this.A05.AEJ(httpURLConnection);
            if (outputStreamAEJ != null) {
                this.A05.AHj(outputStreamAEJ, bArr);
            }
            return httpURLConnection.getResponseCode();
        } finally {
            if (outputStreamAEJ != null) {
                try {
                    outputStreamAEJ.close();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    private final com.facebook.ads.redexgen.core.InterfaceC0992Rp A02(com.facebook.ads.redexgen.core.S2 s2) {
        if (this.A03.A04()) {
            A0C(s2);
        }
        com.facebook.ads.redexgen.core.InterfaceC0992Rp interfaceC0992RpA01 = null;
        try {
            interfaceC0992RpA01 = A01(s2);
            return interfaceC0992RpA01;
        } catch (com.facebook.ads.redexgen.core.S3 hre) {
            this.A05.ABv(hre);
            return interfaceC0992RpA01;
        } catch (java.lang.Exception e) {
            this.A05.ABv(new com.facebook.ads.redexgen.core.S3(e, interfaceC0992RpA01));
            return interfaceC0992RpA01;
        }
    }

    private final com.facebook.ads.redexgen.core.InterfaceC0992Rp A03(java.lang.String str, com.facebook.ads.redexgen.core.S4 s4, com.facebook.ads.redexgen.core.C1001Ry c1001Ry) {
        return A02(new com.facebook.ads.redexgen.core.Ki(str, s4, c1001Ry));
    }

    private final com.facebook.ads.redexgen.core.InterfaceC0992Rp A04(java.lang.String str, java.lang.String str2, byte[] bArr, com.facebook.ads.redexgen.core.C1001Ry c1001Ry) {
        return A02(new com.facebook.ads.redexgen.core.KU(str, null, str2, bArr, c1001Ry));
    }

    private final com.facebook.ads.redexgen.core.KT A05(java.net.HttpURLConnection httpURLConnection) throws java.lang.Exception {
        java.io.InputStream errorStream = null;
        byte[] responseBody = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                responseBody = this.A05.AEr(errorStream);
            }
            return new com.facebook.ads.redexgen.core.KT(httpURLConnection, responseBody);
        } finally {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    private final com.facebook.ads.redexgen.core.KT A06(java.net.HttpURLConnection httpURLConnection) throws java.lang.Exception {
        java.io.InputStream inputStreamAEI = null;
        byte[] responseBody = null;
        try {
            inputStreamAEI = this.A05.AEI(httpURLConnection);
            if (inputStreamAEI != null) {
                responseBody = this.A05.AEr(inputStreamAEI);
            }
            com.facebook.ads.redexgen.core.KT kt = new com.facebook.ads.redexgen.core.KT(httpURLConnection, responseBody);
            if (inputStreamAEI != null) {
                try {
                    inputStreamAEI.close();
                } catch (java.lang.Exception unused) {
                }
            }
            return kt;
        } catch (java.lang.Throwable th) {
            java.lang.String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStreamAEI != null) {
                try {
                    inputStreamAEI.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final java.net.HttpURLConnection A08(java.lang.String str, java.net.Proxy proxy) throws java.io.IOException {
        try {
            new java.net.URL(str);
            android.net.TrafficStats.setThreadStatsTag(61453);
            return this.A05.AEH(str, proxy);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.IllegalArgumentException(str + A07(18, 19, 27), e);
        }
    }

    public static java.net.Proxy A09() {
        java.net.Proxy proxy = java.net.Proxy.NO_PROXY;
        java.lang.String property = java.lang.System.getProperty(A07(192, 14, 1));
        java.lang.String proxyAddress = java.lang.System.getProperty(A07(com.ironsource.g3.c.b.INSTANCE_NOT_FOUND_IN_LOAD, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = java.lang.Integer.parseInt(proxyAddress);
            } catch (java.lang.NumberFormatException unused) {
                return proxy;
            }
        }
        if (!android.text.TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        if (java.net.CookieHandler.getDefault() == null) {
            java.net.CookieHandler.setDefault(new java.net.CookieManager());
        }
    }

    private void A0C(com.facebook.ads.redexgen.core.S2 s2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(A07(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, 10, 43));
        boolean zEquals = s2.A03().equals(com.facebook.ads.redexgen.core.S1.A06);
        java.lang.String strA07 = A07(41, 1, 120);
        if (zEquals) {
            byte[] bArrA06 = s2.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new java.lang.RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (bArrA06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new java.lang.String(s2.A06(), java.nio.charset.Charset.forName(A07(130, 5, 83))));
                sb.append(strA07);
            }
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : s2.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(strA07);
        }
        sb.append(A07(0, 2, 10));
        sb.append(s2.A05());
        sb.append(strA07);
        java.lang.String string = sb.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(com.facebook.ads.redexgen.core.S2 s2, com.facebook.ads.redexgen.core.InterfaceC0994Rr interfaceC0994Rr) {
        this.A04.A6R(this, interfaceC0994Rr, this.A01).A04(s2);
        if (this.A03.A04()) {
            A0C(s2);
        }
    }

    private void A0E(java.lang.String str, int i, int i2) {
        java.lang.String str2 = A09 + A07(12, 6, 47) + i + A07(65, 1, 96) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(java.lang.String str, java.lang.String str2, byte[] bArr, com.facebook.ads.redexgen.core.InterfaceC0994Rr interfaceC0994Rr, com.facebook.ads.redexgen.core.C1001Ry c1001Ry) {
        com.facebook.ads.redexgen.core.KU req = new com.facebook.ads.redexgen.core.KU(str, null, str2, bArr, c1001Ry);
        A0D(req, interfaceC0994Rr);
    }

    private void A0G(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.S2 s2) {
        java.util.Map<java.lang.String, java.lang.String> mapA06 = s2.A02().A06();
        com.facebook.ads.redexgen.core.InterfaceC0991Ro interfaceC0991RoA05 = s2.A02().A05();
        for (java.lang.String str : mapA06.keySet()) {
            httpURLConnection.setRequestProperty(str, mapA06.get(str));
        }
        if (interfaceC0991RoA05 != null) {
            java.util.Map<java.lang.String, java.lang.String> mapA6A = interfaceC0991RoA05.A6A(this.A03.A03());
            for (java.lang.String str2 : mapA6A.keySet()) {
                httpURLConnection.setRequestProperty(str2, mapA6A.get(str2));
            }
        }
    }

    private final void A0H(java.net.HttpURLConnection httpURLConnection, com.facebook.ads.redexgen.core.S2 s2) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C1001Ry c1001RyA02 = s2.A02();
        httpURLConnection.setConnectTimeout(c1001RyA02.A00());
        httpURLConnection.setReadTimeout(c1001RyA02.A02());
        this.A05.AEZ(httpURLConnection, s2.A03(), s2.A04());
    }

    private final boolean A0I(java.lang.Throwable th, long j, com.facebook.ads.redexgen.core.S2 s2) {
        com.facebook.ads.redexgen.core.C1001Ry c1001RyA02 = s2.A02();
        long jCurrentTimeMillis = (java.lang.System.currentTimeMillis() - j) + 10;
        if (this.A06.A9X()) {
            java.lang.String str = A07(67, 15, 118) + jCurrentTimeMillis + A07(42, 7, 69) + c1001RyA02.A00() + A07(49, 7, 10) + c1001RyA02.A02();
        }
        if (this.A02) {
            long jA02 = c1001RyA02.A02();
            if (A08[4].charAt(1) == 'Y') {
                throw new java.lang.RuntimeException();
            }
            A08[7] = "tgQXMymp9cIZW";
            return jCurrentTimeMillis >= jA02;
        }
        long elapsedTime = c1001RyA02.A00();
        return jCurrentTimeMillis >= elapsedTime;
    }

    public final com.facebook.ads.redexgen.core.C0998Rv A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0993Rq
    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.InterfaceC0992Rp AER(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> parameters) {
        return A03(str, new com.facebook.ads.redexgen.core.S4(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0993Rq
    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.InterfaceC0992Rp AES(java.lang.String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0993Rq
    public final void AET(java.lang.String str, byte[] bArr, com.facebook.ads.redexgen.core.InterfaceC0994Rr interfaceC0994Rr) {
        A0F(str, A07(135, 47, 102), bArr, interfaceC0994Rr, this.A03.A00());
    }
}

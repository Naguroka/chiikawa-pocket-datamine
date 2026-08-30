package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0616Ce implements com.facebook.ads.redexgen.core.InterfaceC1128Ww {
    public static byte[] A0G;
    public static java.lang.String[] A0H = {"upd92T", "ahAv581rsoYraUfTT0Om0Ea1CC2nqmrz", "diGduFJzMyGBHyVxIpNGFoEyfO6ARKXL", "qh1QPEw", "iy22tzMnnBHnhCeX8AirT8It6WO3Wo0G", "fa1PLU0cAeHiJkQ4i1M7VF5", "5rtQf6NWfhbVnPfNgeVFskZVP9yKabD3", "PaLVSi3SNenE6YssbVmnFMSfgeZaLOF1"};
    public static final java.util.concurrent.atomic.AtomicReference<byte[]> A0I;
    public static final java.util.regex.Pattern A0J;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public com.facebook.ads.redexgen.core.H3 A04;
    public java.io.InputStream A05;
    public java.net.HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final com.facebook.ads.redexgen.core.HA A0A;
    public final com.facebook.ads.redexgen.core.HA A0B = new com.facebook.ads.redexgen.core.HA();
    public final com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.C0616Ce> A0C;
    public final com.facebook.ads.redexgen.core.I6<java.lang.String> A0D;
    public final java.lang.String A0E;
    public final boolean A0F;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private java.net.HttpURLConnection A04(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        java.net.URL url = new java.net.URL(h3.A04.toString());
        byte[] bArr = h3.A06;
        long j = h3.A03;
        long j2 = h3.A02;
        boolean zA02 = h3.A02(1);
        if (!this.A0F) {
            return A05(url, bArr, j, j2, zA02, true);
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new java.net.NoRouteToHostException(A03(125, 20, 0) + i2);
            }
            java.net.HttpURLConnection httpURLConnectionA05 = A05(url, bArr, j, j2, zA02, false);
            int responseCode = httpURLConnectionA05.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302) {
                java.lang.String[] strArr = A0H;
                if (strArr[2].charAt(23) == strArr[4].charAt(23)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0H;
                strArr2[0] = "XjOwRS";
                strArr2[3] = "IPr9J4j";
                if (responseCode != 303 && (bArr != null || (responseCode != 307 && responseCode != 308))) {
                    return httpURLConnectionA05;
                }
            }
            bArr = null;
            java.lang.String headerField = httpURLConnectionA05.getHeaderField(A03(86, 8, 97));
            httpURLConnectionA05.disconnect();
            url = A06(url, headerField);
            i = i2;
        }
    }

    public static void A09() {
        A0G = new byte[]{-77, -78, -44, -44, -42, -31, -27, -98, -74, -33, -44, -32, -43, -38, -33, -40, 115, -97, -98, -92, -107, -98, -92, 93, 124, -107, -98, -105, -92, -104, -78, -34, -35, -29, -44, -35, -29, -100, -63, -48, -35, -42, -44, -56, -23, -22, -27, -7, -16, -8, -52, -8, -8, -12, -56, -27, -8, -27, -41, -13, -7, -10, -25, -23, -51, -14, -25, -13, -14, -9, -19, -9, -8, -23, -14, -8, -92, -20, -23, -27, -24, -23, -10, -9, -92, -33, -62, -27, -39, -41, -22, -33, -27, -28, -87, -48, -57, -57, 123, -57, -54, -66, -68, -49, -60, -54, -55, 123, -51, -64, -65, -60, -51, -64, -66, -49, -83, -84, -80, -79, -122, -107, -94, -101, -103, 105, -124, -124, 53, -126, 118, -125, -114, 53, -121, 122, 121, 126, -121, 122, 120, -119, -120, 79, 53, -65, -40, -53, -52, -42, -49, -118, -34, -39, -118, -51, -39, -40, -40, -49, -51, -34, -118, -34, -39, -118, -122, -97, -106, -87, -95, -106, -108, -91, -106, -107, 81, 116, -96, -97, -91, -106, -97, -91, 94, 125, -106, -97, -104, -91, -103, 81, -116, -46, -21, -30, -11, -19, -30, -32, -15, -30, -31, -99, -64, -20, -21, -15, -30, -21, -15, -86, -49, -34, -21, -28, -30, -99, -40, -96, -71, -80, -61, -69, -80, -82, -65, -80, -81, 107, -80, -67, -67, -70, -67, 107, -62, -77, -76, -73, -80, 107, -81, -76, -66, -82, -70, -71, -71, -80, -82, -65, -76, -71, -78, -63, -38, -33, -31, -36, -36, -37, -34, -32, -47, -48, -116, -36, -34, -37, -32, -37, -49, -37, -40, -116, -34, -47, -48, -43, -34, -47, -49, -32, -90, -116, -73, -43, -57, -44, -113, -93, -55, -57, -48, -42, -109, 120, 59, 118, -29, -25, -2, -7, -22, -8, -91, -83, -31, -23, -80, -82, -78, -83, -31, -23, -80, -82, -76, -83, -31, -23, -80, -82, -87, -25, -2, -7, -22, -8, -62, -66, -54, -56, -119, -68, -55, -65, -51, -54, -60, -65, -119, -54, -58, -61, -49, -49, -53, -119, -60, -55, -49, -64, -51, -55, -68, -57, -119, -61, -49, -49, -53, -119, -93, -49, -49, -53, -81, -51, -68, -55, -50, -53, -54, -51, -49, 127, -98, -61, -48, -55, -58, -64, -65, -92, -55, -53, -48, -49, -82, -49, -51, -64, -68, -56, -83, -71, -73, 120, -85, -72, -82, -68, -71, -77, -82, 120, -71, -75, -78, -66, -66, -70, 120, -77, -72, -66, -81, -68, -72, -85, -74, 120, -78, -66, -66, -70, 120, -110, -66, -66, -70, -98, -68, -85, -72, -67, -70, -71, -68, -66, 110, -112, -77, -62, -81, -82, -106, -81, -72, -79, -66, -78, -109, -72, -70, -65, -66, -99, -66, -68, -81, -85, -73, -45, -33, -33, -37, -21, -9, -9, -13, -10, -25, -30, -29, -20, -14, -25, -14, -9, -51, -58, -67, -48, -56, -67, -69, -52, -67, -68, -99, -58, -68, -89, -66, -95, -58, -56, -51, -52};
    }

    static {
        A09();
        A0J = java.util.regex.Pattern.compile(A03(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 25, 112));
        A0I = new java.util.concurrent.atomic.AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I6 != com.facebook.ads.internal.exoplayer2.thirdparty.util.Predicate<java.lang.String> */
    public C0616Ce(java.lang.String str, com.facebook.ads.redexgen.core.I6<java.lang.String> i6, com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.C0616Ce> hl, int i, int i2, boolean z, com.facebook.ads.redexgen.core.HA ha) {
        this.A0E = com.facebook.ads.redexgen.core.AbstractC0730Hf.A02(str);
        this.A0D = i6;
        this.A0C = hl;
        this.A08 = i;
        this.A09 = i2;
        this.A0F = z;
        this.A0A = ha;
    }

    private int A00(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A02 != -1) {
            long bytesRemaining = this.A02 - this.A00;
            if (bytesRemaining == 0) {
                return -1;
            }
            i2 = (int) java.lang.Math.min(i2, bytesRemaining);
        }
        int i3 = this.A05.read(bArr, i, i2);
        if (i3 == -1) {
            long j = this.A02;
            if (A0H[7].charAt(0) == 'L') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0H;
            strArr[2] = "yKrMqbinQkVoBKeIqIueyjKcOJ82yhpJ";
            strArr[4] = "OQdKL9kKlDt2BFXGOx5Jwx8L4alDHp3G";
            if (j == -1) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        this.A00 += (long) i3;
        if (this.A0C != null) {
            this.A0C.ABS(this, i3);
        }
        return i3;
    }

    private final long A01() {
        long j = this.A02;
        long j2 = this.A02;
        return j == -1 ? j2 : j2 - this.A00;
    }

    public static long A02(java.net.HttpURLConnection httpURLConnection) {
        long jMax = -1;
        java.lang.String headerField = httpURLConnection.getHeaderField(A03(16, 14, 27));
        boolean zIsEmpty = android.text.TextUtils.isEmpty(headerField);
        java.lang.String strA03 = A03(296, 1, 33);
        java.lang.String strA04 = A03(43, 21, 111);
        if (!zIsEmpty) {
            try {
                jMax = java.lang.Long.parseLong(headerField);
            } catch (java.lang.NumberFormatException unused) {
                android.util.Log.e(strA04, A03(org.objectweb.asm.Opcodes.IF_ACMPNE, 27, 28) + headerField + strA03);
            }
        }
        java.lang.String headerField2 = httpURLConnection.getHeaderField(A03(30, 13, 90));
        if (!android.text.TextUtils.isEmpty(headerField2)) {
            java.util.regex.Matcher matcher = A0J.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long j = (java.lang.Long.parseLong(matcher.group(2)) - java.lang.Long.parseLong(matcher.group(1))) + 1;
                    if (jMax < 0) {
                        return j;
                    }
                    if (jMax != j) {
                        android.util.Log.w(strA04, A03(64, 22, 111) + headerField + A03(297, 3, 6) + headerField2 + strA03);
                        jMax = java.lang.Math.max(jMax, j);
                        return jMax;
                    }
                    return jMax;
                } catch (java.lang.NumberFormatException unused2) {
                    android.util.Log.e(strA04, A03(org.objectweb.asm.Opcodes.INSTANCEOF, 26, 104) + headerField2 + strA03);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    private java.net.HttpURLConnection A05(java.net.URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A08);
        httpURLConnection.setReadTimeout(this.A09);
        if (this.A0A != null) {
            java.util.Map<java.lang.String, java.lang.String> mapA00 = this.A0A.A00();
            java.lang.String[] strArr = A0H;
            if (strArr[2].charAt(23) == strArr[4].charAt(23)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0H;
            strArr2[2] = "LwfGq0dWloURSsrk8yjlsGQeeRoR1vsg";
            strArr2[4] = "0f4ZIsE1f9HXorAJ6xH6ZIcfvFYGlov5";
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : mapA00.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : this.A0B.A00().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        java.lang.String[] strArr3 = A0H;
        if (strArr3[1].charAt(14) != strArr3[6].charAt(14)) {
            throw new java.lang.RuntimeException();
        }
        A0H[5] = "TlLB7MpaOAFv4zPed8Dcl2n";
        if (j != 0 || j2 != -1) {
            java.lang.String str = A03(325, 6, 112) + j + A03(0, 1, 113);
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            java.lang.String strA03 = A03(120, 5, 31);
            java.lang.String[] strArr4 = A0H;
            java.lang.String rangeRequest = strArr4[2];
            if (rangeRequest.charAt(23) != strArr4[4].charAt(23)) {
                java.lang.String[] strArr5 = A0H;
                strArr5[0] = "DyifrF";
                strArr5[3] = "Okbd1rq";
                httpURLConnection.setRequestProperty(strA03, str);
            } else {
                A0H[5] = "hqfaZyDHM2IL13Uv8WOJHmH";
                httpURLConnection.setRequestProperty(strA03, str);
            }
        }
        httpURLConnection.setRequestProperty(A03(286, 10, 77), this.A0E);
        if (!z) {
            if (A0H[7].charAt(0) != 'L') {
                A0H[5] = "vv3u8d4db849aiegx8gZbt1";
                httpURLConnection.setRequestProperty(A03(1, 15, 92), A03(474, 8, 105));
            } else {
                java.lang.String[] strArr6 = A0H;
                strArr6[1] = "dBz4UUSbtwpixBfZW5OQykAoCimqtpDB";
                strArr6[6] = "pUG2WGceWUwIzyfrVpRolcDYYRYKY0C5";
                httpURLConnection.setRequestProperty(A03(1, 1, 39), A03(411, 7, 47));
            }
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(A03(116, 4, 72));
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static java.net.URL A06(java.net.URL url, java.lang.String str) throws java.io.IOException {
        if (str != null) {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (A03(469, 5, 110).equals(protocol) || A03(465, 4, 86).equals(protocol)) {
                return url2;
            }
            java.lang.String protocol2 = A03(255, 31, 87) + protocol;
            throw new java.net.ProtocolException(protocol2);
        }
        throw new java.net.ProtocolException(A03(94, 22, 70));
    }

    private void A07() {
        if (this.A06 != null) {
            try {
                this.A06.disconnect();
            } catch (java.lang.Exception e) {
                android.util.Log.e(A03(43, 21, 111), A03(219, 36, 54), e);
            }
            this.A06 = null;
        }
    }

    private void A08() throws java.io.IOException {
        if (this.A01 == this.A03) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference<byte[]> atomicReference = A0I;
        java.lang.String[] strArr = A0H;
        if (strArr[2].charAt(23) != strArr[4].charAt(23)) {
            java.lang.String[] strArr2 = A0H;
            strArr2[2] = "iRe42hmBEzjOIgrODnGag5Ryi54Rr38N";
            strArr2[4] = "puqCk0zHCU4JVwQT2GmKoxt1QXjmoKjX";
            byte[] andSet = atomicReference.getAndSet(null);
            if (andSet == null) {
                andSet = new byte[4096];
            }
            while (true) {
                long j = this.A01;
                long j2 = this.A03;
                java.lang.String[] strArr3 = A0H;
                if (strArr3[0].length() == strArr3[3].length()) {
                    break;
                }
                A0H[5] = "QqnfWOFuQNiMO5nFPe5XpRA";
                if (j != j2) {
                    int readLength = (int) java.lang.Math.min(this.A03 - this.A01, andSet.length);
                    int i = this.A05.read(andSet, 0, readLength);
                    if (!java.lang.Thread.currentThread().isInterrupted()) {
                        if (i != -1) {
                            this.A01 += (long) i;
                            if (this.A0C != null) {
                                com.facebook.ads.redexgen.core.HL<? super com.facebook.ads.redexgen.core.C0616Ce> hl = this.A0C;
                                java.lang.String[] strArr4 = A0H;
                                java.lang.String str = strArr4[2];
                                java.lang.String str2 = strArr4[4];
                                int read = str.charAt(23);
                                if (read != str2.charAt(23)) {
                                    java.lang.String[] strArr5 = A0H;
                                    strArr5[1] = "sYV35ltcF2b7EufKXuHnk5w07oVJD2K6";
                                    strArr5[6] = "5rSHU7F7ButhhIfBaceH4NOxt0J3ee0z";
                                    hl.ABS(this, i);
                                } else {
                                    java.lang.String[] strArr6 = A0H;
                                    strArr6[1] = "uFTiYeha2VRJNUfMwSq2vPJkirm8ipId";
                                    strArr6[6] = "9KtqR8ZwhtaH5PfNhiLKwmfPHcMTWBmj";
                                    hl.ABS(this, i);
                                }
                            }
                        } else {
                            throw new java.io.EOFException();
                        }
                    } else {
                        throw new java.io.InterruptedIOException();
                    }
                } else {
                    A0I.set(andSet);
                    return;
                }
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static void A0A(java.net.HttpURLConnection httpURLConnection, long j) {
        if (com.facebook.ads.redexgen.core.IK.A02 != 19 && com.facebook.ads.redexgen.core.IK.A02 != 20) {
            return;
        }
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            java.lang.String name = inputStream.getClass().getName();
            if (A03(331, 65, 70).equals(name) || A03(396, 69, 53).equals(name)) {
                java.lang.reflect.Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod(A03(482, 20, 67), new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        if (this.A06 == null) {
            return null;
        }
        return android.net.Uri.parse(this.A06.getURL().toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws com.facebook.ads.redexgen.core.H9 {
        java.lang.String strA03 = A03(org.objectweb.asm.Opcodes.I2B, 21, 85);
        this.A04 = h3;
        long j = 0;
        this.A00 = 0L;
        this.A01 = 0L;
        try {
            this.A06 = A04(h3);
            try {
                int responseCode = this.A06.getResponseCode();
                java.lang.String[] strArr = A0H;
                java.lang.String str = strArr[1];
                java.lang.String str2 = strArr[6];
                int iCharAt = str.charAt(14);
                int responseCode2 = str2.charAt(14);
                if (iCharAt == responseCode2) {
                    java.lang.String[] strArr2 = A0H;
                    strArr2[2] = "ZnyzJegwFZk4l14oSnqTIBnQNXDfdmb9";
                    strArr2[4] = "2EydWCHqjbtSKqlE324d1W4RxLEVGFjy";
                    if (responseCode < 200 || responseCode > 299) {
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = this.A06.getHeaderFields();
                        A07();
                        com.facebook.ads.redexgen.core.C1129Wx exception = new com.facebook.ads.redexgen.core.C1129Wx(responseCode, headerFields, h3);
                        if (responseCode == 416) {
                            exception.initCause(new com.facebook.ads.redexgen.core.H0(0));
                            throw exception;
                        }
                        throw exception;
                    }
                    java.net.HttpURLConnection httpURLConnection = this.A06;
                    java.lang.String[] strArr3 = A0H;
                    java.lang.String str3 = strArr3[1];
                    java.lang.String str4 = strArr3[6];
                    int iCharAt2 = str3.charAt(14);
                    int responseCode3 = str4.charAt(14);
                    if (iCharAt2 == responseCode3) {
                        java.lang.String[] strArr4 = A0H;
                        strArr4[1] = "4bOTwEu5n5XIhBfQD9dGv4QgIdrYXWOt";
                        strArr4[6] = "PWjMAgqaYtBxPifmetVfIYxMdOHp0Pmj";
                        java.lang.String contentType = httpURLConnection.getContentType();
                        if (this.A0D == null || this.A0D.A5x(contentType)) {
                            if (responseCode == 200 && h3.A03 != 0) {
                                j = h3.A03;
                            }
                            this.A03 = j;
                            if (h3.A02(1)) {
                                this.A02 = h3.A02;
                            } else {
                                if (h3.A02 != -1) {
                                    this.A02 = h3.A02;
                                } else {
                                    long jA02 = A02(this.A06);
                                    java.lang.String[] strArr5 = A0H;
                                    java.lang.String str5 = strArr5[2];
                                    java.lang.String str6 = strArr5[4];
                                    int iCharAt3 = str5.charAt(23);
                                    int responseCode4 = str6.charAt(23);
                                    if (iCharAt3 != responseCode4) {
                                        java.lang.String[] strArr6 = A0H;
                                        strArr6[1] = "yyisu8ubzSaRkMfItbVfBFevYTyz4VxL";
                                        strArr6[6] = "uXuvftuCchbrBwfyVXm1GNTyEy3XhMpL";
                                        this.A02 = jA02 != -1 ? jA02 - this.A03 : -1L;
                                    }
                                }
                            }
                            try {
                                this.A05 = this.A06.getInputStream();
                                this.A07 = true;
                                if (this.A0C != null) {
                                    this.A0C.ADs(this, h3);
                                }
                                return this.A02;
                            } catch (java.io.IOException e) {
                                A07();
                                throw new com.facebook.ads.redexgen.core.H9(e, h3, 1);
                            }
                        }
                        A07();
                        throw new com.facebook.ads.redexgen.core.C1130Wy(contentType, h3);
                    }
                }
                throw new java.lang.RuntimeException();
            } catch (java.io.IOException e2) {
                A07();
                throw new com.facebook.ads.redexgen.core.H9(strA03 + h3.A04.toString(), e2, h3, 1);
            }
        } catch (java.io.IOException e3) {
            throw new com.facebook.ads.redexgen.core.H9(strA03 + h3.A04.toString(), e3, h3, 1);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0034 */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws com.facebook.ads.redexgen.core.H9 {
        if (this.A05 != null) {
            A0A(this.A06, A01());
            try {
                this.A05.close();
            } catch (java.io.IOException e) {
                throw new com.facebook.ads.redexgen.core.H9(e, this.A04, 3);
            }
        }
        this.A05 = null;
        A07();
        if (this.A07) {
            this.A07 = false;
            if (this.A0C != null) {
                this.A0C.ADr(this);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            A08();
            return A00(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.H9(e, this.A04, 2);
        }
    }
}

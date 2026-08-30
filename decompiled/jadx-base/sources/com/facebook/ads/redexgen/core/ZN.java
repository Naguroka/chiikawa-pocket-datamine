package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZN implements com.facebook.ads.redexgen.core.InterfaceC05268p {
    public static android.content.pm.PackageInfo A02;
    public static boolean A03;
    public static byte[] A04;
    public static java.lang.String[] A05 = {"txu4RBo63YQ5Q7SoAp", "BY8ga9ljLbuWBmJa1ktUn6UmPorDtudq", "oIcH05TUMC1H4eRB0f575BffOzLV6s", "RDV9o0Xs0wR3bMJwiMoqv", "Drf", "fWBbnfM052TaJjbz2mNIhyXx2yjBcv", "vwrAcDNdoQtjOaT8FPnJSektvmYH0bUo", "A7bgPIcOUjT1m5u12vt0AimohlYQKPcw"};
    public static final com.facebook.ads.redexgen.core.C0V[] A06;
    public final com.facebook.ads.redexgen.core.C6V A00;
    public final com.facebook.ads.redexgen.core.C7j A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 63);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A05[4].length() != 3) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A05;
        strArr[3] = "e8Iif6peCxlhmB6JTHauJ";
        strArr[0] = "U2Egyo0LhTV3FJWkcb";
        A04 = new byte[]{-98, -70, -85, -83, -83, -81, -67, -67, -77, -84, -77, -74, -77, -66, -61, -55, -81, -72, -85, -84, -74, -81, -82, -26, -13, -26, -15, -12, -20, -69, -54, -54, -39, -57, -61, -56, -39, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -38, -20, -31, -38, -20, -25, -7, -17, -22, -14, 5, 5, 3, -6, -13, 6, 5, -6, 0, -1, 16, -6, -11, -7, 0, -5, -5, -4, 9, 22, 11, 6, 2, -4, 5, 22, -4, 15, 11, 9, -8, 10, -124, -105, -112, -122, -114, -121, -25, -27, -25, -20, -23, -110, -112, -97, -97, -108, -109, -82, -104, -109, -94, -73, -75, -58, -58, -67, -71, -58, -95, -98, -79, -98, -68, -83, -81, -84, -96, -94, -80, -80, -90, -85, -92, -68, -84, -83, -79, -90, -84, -85, -80, -32, -35, -16, -35, -5, -20, -18, -21, -33, -31, -17, -17, -27, -22, -29, -5, -21, -20, -16, -27, -21, -22, -17, -5, -33, -21, -15, -22, -16, -18, -11, -120, -123, -104, -123, -93, -108, -106, -109, -121, -119, -105, -105, -115, -110, -117, -93, -109, -108, -104, -115, -109, -110, -105, -93, -105, -104, -123, -104, -119, -104, -103, -94, -89, -99, -88, -83, -69, -54, -61, -61, -70, -63, -44, -72, -60, -57, -70, -44, -70, -53, -70, -61, -55, -56, -41, -26, -33, -33, -42, -35, -16, -35, -32, -40, -40, -42, -43, -25, 2, 10, 13, 6, 5, -63, 21, 16, -63, 3, 22, 10, 13, 5, -63, 22, 20, 6, 19, -63, 21, 16, 12, 6, 15, -79, -86, -68, -56, -82, -63, -72, -71, -75, -86, -62, -82, -69, -95, -100, -98, -103, -6, -11, 16, -12, -14, -12, -7, -10, 16, 5, 4, 16, -2, 4, -57, -62, -35, -47, -51, -45, -48, -63, -61, -69, -64, -59, -58, -77, -66, -66, -73, -60, -21, -18, -30, -32, -21, -28, -103, -115, -105, -111, 1, -7, -8, -3, -11, 8, -3, 3, 2, 19, 7, -7, 6, 10, -3, -9, -7, -74, -83, -68, -65, -73, -70, -77, -57, -68, -63, -72, -83, -9, -21, -3, -12, -3, -5, 7, -3, -5, -19, -6, 7, -15, -20, -79, -82, -82, -77, -92, -93, -100, -100, -87, -115, -106, -109, -113, -104, -98, -87, -99, -114, -107, -87, -96, -113, -100, -99, -109, -103, -104, -74, -74, -61, -87, -68, -72, -74, -91, -73, 2, 2, 15, -7, 3, 15, -10, 2, -1, -3, 15, 3, -11, 2, 6, -7, -13, -11, -6, -6, 7, -5, -19, -6, -2, -15, -21, -19, 7, -5, -20, -13, 7, -2, -19, -6, -5, -15, -9, -10, -89, -87, -101, -76, -101, -105, -76, -106, -91, -91, -76, -98, -93, -88, -87, -106, -95, -95, -102, -103, -111, -109, -123, -98, -123, -127, -98, -128, -113, -113, -98, -107, -124, -111, -110, -120, -114, -115, -41, -57, -42, -55, -55, -46, -29, -52, -55, -51, -53, -52, -40, -108, -124, -109, -122, -122, -113, -96, -104, -118, -123, -107, -119, -17, -32, -25, -5, -33, -35, -20, -35, -34, -27, -24, -27, -16, -11, -10, -25, -18, 2, -16, -28, -15, -28, -22, -24, -25, 2, -26, -28, -26, -21, -24, -27, -41, -27, -27, -37, -31, -32, -15, -26, -37, -33, -41, -63, -70, -75, -64, -59, -7, -9, -23, -10, 3, -27, -21, -23, -14, -8, 18, -3, 8, 12, -3, 14, -3, 9, 15, -81, -74, -83, -83};
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010c A[Catch: IOException -> 0x0114, TryCatch #2 {IOException -> 0x0114, blocks: (B:28:0x0107, B:30:0x010c, B:32:0x0111), top: B:40:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0111 A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #2 {IOException -> 0x0114, blocks: (B:28:0x0107, B:30:0x010c, B:32:0x0111), top: B:40:0x0107 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final java.lang.String A04(com.facebook.ads.redexgen.core.InterfaceC05248n interfaceC05248n) {
        com.facebook.ads.redexgen.core.C05228l.A08(this.A01, true, null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        android.util.Base64OutputStream base64OutputStream = null;
        java.util.zip.DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                base64OutputStream = new android.util.Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new java.util.zip.DeflaterOutputStream(base64OutputStream);
                java.util.Map mapA05 = A05();
                if (android.text.TextUtils.isEmpty(com.facebook.ads.redexgen.core.C6H.A00().A03())) {
                    com.facebook.ads.redexgen.core.C6H.A07(this.A01);
                }
                mapA05.put(A01(278, 4, 25), com.facebook.ads.redexgen.core.C6H.A00().A03());
                mapA05.put(A01(554, 10, 101), com.facebook.ads.redexgen.core.AbstractC05308t.A06(new com.facebook.ads.redexgen.core.C8O(this.A01), this.A01, false));
                if (com.facebook.ads.redexgen.core.C0762Im.A1r(this.A01)) {
                    mapA05.put(A01(101, 10, 16), com.facebook.ads.redexgen.core.C03390w.A01(this.A01).A0K());
                }
                java.util.Iterator it = mapA05.entrySet().iterator();
                while (it.hasNext()) {
                    if (!interfaceC05248n.A2w((java.lang.String) ((java.util.Map.Entry) it.next()).getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new org.json.JSONObject(mapA05).toString().getBytes());
                deflaterOutputStream.close();
                java.lang.String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 85), A01(0, 0, 46));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (java.io.IOException unused) {
                }
                return strReplaceAll;
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(A01(239, 26, 98), e);
            }
        } catch (java.lang.Throwable th) {
            if (A05[4].length() != 3) {
                throw new java.lang.RuntimeException();
            }
            A05[1] = "YYekAclIzhra9Pv39zprUDIkOoogCrwo";
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                    if (base64OutputStream != null) {
                        base64OutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                } catch (java.io.IOException unused2) {
                    throw th;
                }
            } else {
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            }
            throw th;
        }
    }

    public final /* synthetic */ java.util.Map A05() {
        return com.facebook.ads.redexgen.core.AbstractC05238m.A00(this);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x050d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0525  */
    /* JADX WARN: Code duplicated, block: B:105:0x053d  */
    /* JADX WARN: Code duplicated, block: B:108:0x054d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0402 A[EDGE_INSN: B:111:0x0402->B:70:0x0402 BREAK  A[LOOP:0: B:57:0x0396->B:62:0x03b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x030b  */
    /* JADX WARN: Code duplicated, block: B:59:0x039a  */
    /* JADX WARN: Code duplicated, block: B:61:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x042e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0442  */
    /* JADX WARN: Code duplicated, block: B:78:0x0455  */
    /* JADX WARN: Code duplicated, block: B:80:0x0463  */
    /* JADX WARN: Code duplicated, block: B:82:0x047c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0495  */
    /* JADX WARN: Code duplicated, block: B:87:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:90:0x04ba  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC05268p
    public final java.util.Map<java.lang.String, java.lang.String> A7K(com.facebook.ads.redexgen.core.InterfaceC05148d interfaceC05148d) {
        java.lang.String strA01;
        java.lang.String strA02;
        java.lang.String strA03;
        java.lang.String strA04;
        java.lang.StringBuilder sb;
        com.facebook.ads.redexgen.core.C0V[] c0vArr;
        int i;
        android.content.pm.PackageInfo packageInfoA00;
        java.util.Map<java.lang.String, java.lang.String> mapA02;
        java.lang.String strA05;
        java.lang.String strA06;
        java.lang.String strA07;
        boolean zA9d;
        com.facebook.ads.redexgen.core.AnonymousClass80 anonymousClass80A06;
        java.lang.String[] strArr;
        java.lang.String strA7S;
        java.lang.String strA6c = interfaceC05148d != null ? interfaceC05148d.A6c() : null;
        java.lang.String packageName = strA6c != null ? strA6c : this.A01.getPackageName();
        com.facebook.ads.redexgen.core.C05228l.A08(this.A01, com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess() ? true : com.facebook.ads.redexgen.core.C0762Im.A0k(this.A01), strA6c);
        com.facebook.ads.redexgen.core.C8N.A0B(this.A01);
        com.facebook.ads.redexgen.core.C8N.A08(this.A01);
        java.util.HashMap map = new java.util.HashMap();
        com.facebook.ads.redexgen.core.C05198i.A03(this.A01, map, strA6c);
        map.put(A01(314, 6, 96), java.util.Locale.getDefault().toString());
        float f = com.facebook.ads.redexgen.core.LP.A02;
        int i2 = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i3 = this.A01.getResources().getDisplayMetrics().heightPixels;
        map.put(A01(com.ironsource.g3.c.b.INSTANCE_LOAD, 7, 21), java.lang.String.valueOf(f));
        map.put(A01(494, 12, 2), java.lang.String.valueOf((int) (i2 / f)));
        map.put(A01(481, 13, 69), java.lang.String.valueOf((int) (i3 / f)));
        map.put(A01(57, 14, 114), com.facebook.ads.redexgen.core.C6H.A03());
        map.put(A01(296, 9, 63), com.facebook.ads.redexgen.core.C6H.A00().A02().name());
        map.put(A01(282, 14, 114), java.lang.String.valueOf(com.facebook.ads.redexgen.core.C6H.A00().A01()));
        com.facebook.ads.redexgen.core.C8O c8o = new com.facebook.ads.redexgen.core.C8O(this.A01, strA6c);
        map.put(A01(90, 6, 3), com.facebook.ads.redexgen.core.AbstractC05308t.A03(this.A01, c8o));
        map.put(A01(111, 7, 53), c8o.A08());
        map.put(A01(320, 4, 13), c8o.A09());
        map.put(A01(367, 6, 32), java.lang.String.valueOf(com.facebook.ads.redexgen.core.C05228l.A00(this.A01).A00));
        map.put(A01(305, 9, 51), c8o.A0B());
        map.put(A01(506, 14, 93), com.facebook.ads.redexgen.core.L9.A01());
        map.put(A01(341, 12, 41), java.lang.String.valueOf(com.facebook.ads.redexgen.core.AbstractC0839Ls.A00(this.A01).A00));
        map.put(A01(537, 12, 83), com.facebook.ads.redexgen.core.C0841Lu.A02(this.A01.A08().A01()));
        com.facebook.ads.redexgen.core.C05228l.A06(this.A01, packageName, map);
        java.lang.String strA08 = com.facebook.ads.redexgen.core.LN.A03(this.A01, packageName);
        if (strA08 != null) {
            map.put(A01(48, 5, 90), strA08);
        }
        java.lang.String strA09 = A01(549, 5, 45);
        if (interfaceC05148d != null && interfaceC05148d.A9i() != null) {
            java.lang.Boolean boolA9i = interfaceC05148d.A9i();
            java.lang.String[] strArr2 = A05;
            if (strArr2[7].charAt(0) != strArr2[6].charAt(0)) {
                java.lang.String[] strArr3 = A05;
                strArr3[5] = "32RBgLNf778xvD9weLhwI46Snl5hrv";
                strArr3[2] = "IyuqHiwE4txdUinr9J2yO2mEn55tsE";
                map.put(strA09, java.lang.String.valueOf(boolA9i));
            }
            throw new java.lang.RuntimeException();
        }
        map.put(strA09, java.lang.String.valueOf(com.facebook.ads.redexgen.core.LQ.A05(this.A01)));
        java.lang.String strA7n = (interfaceC05148d == null || interfaceC05148d.A7o() == null) ? this.A01.A04().A7n() : interfaceC05148d.A7o();
        if (strA7n != null) {
            java.lang.String[] strArr4 = A05;
            if (strArr4[7].charAt(0) != strArr4[6].charAt(0)) {
                java.lang.String[] strArr5 = A05;
                strArr5[5] = "lzJ4Ecl31LKhf9GNtdySIIM2KCn5d6";
                strArr5[2] = "MfUCKgpZ3l00IXdOSEBXHLe94uIrQG";
                map.put(A01(324, 17, 117), strA7n);
            } else {
                map.put(A01(324, 17, 117), strA7n);
            }
        }
        map.put(A01(2, 21, 43), java.lang.String.valueOf(c8o.A0C()));
        if (c8o.A03() != -1) {
            map.put(A01(29, 19, 59), java.lang.String.valueOf(c8o.A03()));
        }
        map.put(A01(564, 9, 125), com.facebook.ads.redexgen.core.C05158e.A05(this.A01, packageName));
        map.put(A01(23, 6, 102), com.facebook.ads.redexgen.core.LV.A01(com.facebook.ads.redexgen.core.C8N.A02()));
        if (com.facebook.ads.redexgen.core.AbstractC0761Il.A05(this.A01) && (strA7S = this.A01.A04().A7S()) != null) {
            map.put(A01(53, 4, 103), strA7S);
        }
        java.lang.String strA7t = this.A01.A04().A7t();
        if (!android.text.TextUtils.isEmpty(strA7t)) {
            map.put(A01(353, 14, 105), strA7t);
        }
        com.facebook.ads.redexgen.core.C05107x c05107xA76 = null;
        if (interfaceC05148d == null) {
            if (c05107xA76 == null) {
                anonymousClass80A06 = this.A01.A06();
                strArr = A05;
                if (strArr[3].length() != strArr[0].length()) {
                    java.lang.String[] strArr6 = A05;
                    strArr6[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr6[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c05107xA76 = anonymousClass80A06.A76();
                }
            }
            strA01 = A01(172, 29, 5);
            strA02 = A01(141, 31, 93);
            strA03 = A01(118, 23, 30);
            if (c05107xA76 != null) {
                map.put(strA03, c05107xA76.A08());
                map.put(strA02, java.lang.String.valueOf(c05107xA76.A05()));
                map.put(strA01, java.lang.String.valueOf(c05107xA76.A06()));
            } else {
                java.lang.String strA010 = A01(573, 4, 2);
                map.put(strA03, strA010);
                map.put(strA02, strA010);
                map.put(strA01, strA010);
            }
            map.put(A01(101, 10, 16), com.facebook.ads.redexgen.core.C03390w.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null) {
                map.put(A01(71, 19, 120), strA04);
            }
            map.put(A01(265, 13, 42), java.lang.String.valueOf(this.A01.A03().A8x()));
            map.put(A01(226, 13, 82), java.lang.String.valueOf(com.facebook.ads.redexgen.core.AnonymousClass88.A0H(this.A01)));
            sb = new java.lang.StringBuilder();
            c0vArr = A06;
            i = 0;
            while (true) {
                if (i < c0vArr.length) {
                    break;
                    break;
                }
                sb.append(c0vArr[i].A03() + 4000);
                if (i != c0vArr.length - 1) {
                    sb.append(A01(1, 1, 79));
                }
                i++;
            }
            map.put(A01(208, 18, 54), sb.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(443, 20, 22), java.lang.String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(463, 18, 0), java.lang.String.valueOf(packageInfoA00.versionCode));
            }
            if (interfaceC05148d != null) {
                zA9d = interfaceC05148d.A9d();
                if (A05[1].charAt(25) != 'o') {
                    java.lang.String[] strArr7 = A05;
                    strArr7[7] = "inhOgc4FARMiG9OeOma42yd4Zw66nzWU";
                    strArr7[6] = "hLpLkv5ZkeLP8Nx8FR5P0NkpI1zrR6LC";
                    if (zA9d) {
                        map.put(A01(403, 18, 113), java.lang.Boolean.TRUE.toString());
                        if (interfaceC05148d.A6q() != null) {
                            map.put(A01(373, 21, 11), interfaceC05148d.A6q());
                        }
                    }
                } else {
                    java.lang.String[] strArr8 = A05;
                    strArr8[5] = "U30r1W401qlH7SB9R1I9aS2Ug2nIXm";
                    strArr8[2] = "M1qKCNLEAk1dKbuDQGvfG5gBfjM6hm";
                    if (zA9d) {
                        map.put(A01(403, 18, 113), java.lang.Boolean.TRUE.toString());
                        if (interfaceC05148d.A6q() != null) {
                            map.put(A01(373, 21, 11), interfaceC05148d.A6q());
                        }
                    }
                }
            }
            if (com.facebook.ads.redexgen.core.AbstractC0764Ip.A07(this.A01)) {
                strA06 = com.facebook.ads.redexgen.core.AbstractC05168f.A02(this.A01.A01());
                if (strA06 != null) {
                    map.put(A01(421, 22, 105), strA06);
                }
                strA07 = com.facebook.ads.redexgen.core.AbstractC05168f.A01(this.A01.A01());
                if (strA06 != null) {
                    map.put(A01(394, 9, 37), strA07);
                }
            }
            if (com.facebook.ads.redexgen.core.C0762Im.A0u(this.A01)) {
                map.put(A01(96, 5, 101), strA05);
            }
            if (com.facebook.ads.redexgen.core.C0762Im.A0v(this.A01)) {
                if (A05[4].length() != 3) {
                    java.lang.String[] strArr9 = A05;
                    strArr9[3] = "7mVmErbGRyzhCcpOkogzT";
                    strArr9[0] = "GxggXk4A6DJke1qe5h";
                    map.put(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, 17, 100), com.facebook.ads.redexgen.core.LV.A01(mapA02));
                } else {
                    java.lang.String[] strArr10 = A05;
                    strArr10[7] = "CWQ3pJLT9KktQZtEqCB7QodFowscHy6b";
                    strArr10[6] = "JiMTUCC0GBJ7xNqWR2QBxq9gThZrGoNd";
                    map.put(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, 17, 100), com.facebook.ads.redexgen.core.LV.A01(mapA02));
                }
            }
            return map;
        }
        com.facebook.ads.redexgen.core.C7j c7j = this.A01;
        java.lang.String[] strArr11 = A05;
        if (strArr11[7].charAt(0) != strArr11[6].charAt(0)) {
            java.lang.String[] strArr12 = A05;
            strArr12[3] = "QL1vZoGO1wQ14zpGXE2Sg";
            strArr12[0] = "5V9s84iDx7Ocfd5gsL";
            c05107xA76 = interfaceC05148d.A78(c7j);
            if (c05107xA76 == null) {
                anonymousClass80A06 = this.A01.A06();
                strArr = A05;
                if (strArr[3].length() != strArr[0].length()) {
                    java.lang.String[] strArr13 = A05;
                    strArr13[7] = "UvZ2k7gEJDaOAPFQ7LljUQwSSHt3Qj5l";
                    strArr13[6] = "lsSUyvw0Epval1a8yRy7YtOStWYNlmUT";
                    c05107xA76 = anonymousClass80A06.A76();
                }
            }
            strA01 = A01(172, 29, 5);
            strA02 = A01(141, 31, 93);
            strA03 = A01(118, 23, 30);
            if (c05107xA76 != null) {
                map.put(strA03, c05107xA76.A08());
                map.put(strA02, java.lang.String.valueOf(c05107xA76.A05()));
                map.put(strA01, java.lang.String.valueOf(c05107xA76.A06()));
            } else {
                java.lang.String strA011 = A01(573, 4, 2);
                map.put(strA03, strA011);
                map.put(strA02, strA011);
                map.put(strA01, strA011);
            }
            map.put(A01(101, 10, 16), com.facebook.ads.redexgen.core.C03390w.A01(this.A01).A0K());
            strA04 = this.A00.A03(this.A01);
            if (strA04 != null && !android.text.TextUtils.isEmpty(strA04)) {
                map.put(A01(71, 19, 120), strA04);
            }
            map.put(A01(265, 13, 42), java.lang.String.valueOf(this.A01.A03().A8x()));
            map.put(A01(226, 13, 82), java.lang.String.valueOf(com.facebook.ads.redexgen.core.AnonymousClass88.A0H(this.A01)));
            sb = new java.lang.StringBuilder();
            c0vArr = A06;
            i = 0;
            while (true) {
                if (i < c0vArr.length) {
                    break;
                }
                sb.append(c0vArr[i].A03() + 4000);
                if (i != c0vArr.length - 1) {
                    sb.append(A01(1, 1, 79));
                }
                i++;
            }
            map.put(A01(208, 18, 54), sb.toString());
            packageInfoA00 = A00(this.A01);
            map.put(A01(443, 20, 22), java.lang.String.valueOf(packageInfoA00 != null));
            if (packageInfoA00 != null) {
                map.put(A01(463, 18, 0), java.lang.String.valueOf(packageInfoA00.versionCode));
            }
            if (interfaceC05148d != null) {
                zA9d = interfaceC05148d.A9d();
                if (A05[1].charAt(25) != 'o') {
                    java.lang.String[] strArr14 = A05;
                    strArr14[7] = "inhOgc4FARMiG9OeOma42yd4Zw66nzWU";
                    strArr14[6] = "hLpLkv5ZkeLP8Nx8FR5P0NkpI1zrR6LC";
                    if (zA9d) {
                        map.put(A01(403, 18, 113), java.lang.Boolean.TRUE.toString());
                        if (interfaceC05148d.A6q() != null) {
                            map.put(A01(373, 21, 11), interfaceC05148d.A6q());
                        }
                    }
                } else {
                    java.lang.String[] strArr15 = A05;
                    strArr15[5] = "U30r1W401qlH7SB9R1I9aS2Ug2nIXm";
                    strArr15[2] = "M1qKCNLEAk1dKbuDQGvfG5gBfjM6hm";
                    if (zA9d) {
                        map.put(A01(403, 18, 113), java.lang.Boolean.TRUE.toString());
                        if (interfaceC05148d.A6q() != null) {
                            map.put(A01(373, 21, 11), interfaceC05148d.A6q());
                        }
                    }
                }
            }
            if (com.facebook.ads.redexgen.core.AbstractC0764Ip.A07(this.A01)) {
                strA06 = com.facebook.ads.redexgen.core.AbstractC05168f.A02(this.A01.A01());
                if (strA06 != null) {
                    map.put(A01(421, 22, 105), strA06);
                }
                strA07 = com.facebook.ads.redexgen.core.AbstractC05168f.A01(this.A01.A01());
                if (strA06 != null) {
                    map.put(A01(394, 9, 37), strA07);
                }
            }
            if (com.facebook.ads.redexgen.core.C0762Im.A0u(this.A01) && (strA05 = com.facebook.ads.redexgen.core.AbstractC05178g.A01(this.A01.A01())) != null) {
                map.put(A01(96, 5, 101), strA05);
            }
            if (com.facebook.ads.redexgen.core.C0762Im.A0v(this.A01) && (mapA02 = com.facebook.ads.redexgen.core.AbstractC05178g.A02(this.A01.A01())) != null) {
                if (A05[4].length() != 3) {
                    java.lang.String[] strArr16 = A05;
                    strArr16[3] = "7mVmErbGRyzhCcpOkogzT";
                    strArr16[0] = "GxggXk4A6DJke1qe5h";
                    map.put(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, 17, 100), com.facebook.ads.redexgen.core.LV.A01(mapA02));
                } else {
                    java.lang.String[] strArr17 = A05;
                    strArr17[7] = "CWQ3pJLT9KktQZtEqCB7QodFowscHy6b";
                    strArr17[6] = "JiMTUCC0GBJ7xNqWR2QBxq9gThZrGoNd";
                    map.put(A01(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, 17, 100), com.facebook.ads.redexgen.core.LV.A01(mapA02));
                }
            }
            return map;
        }
        throw new java.lang.RuntimeException();
    }

    static {
        A02();
        A03 = false;
        A06 = new com.facebook.ads.redexgen.core.C0V[]{com.facebook.ads.redexgen.core.C0V.A16, com.facebook.ads.redexgen.core.C0V.A0k, com.facebook.ads.redexgen.core.C0V.A17, com.facebook.ads.redexgen.core.C0V.A1F, com.facebook.ads.redexgen.core.C0V.A11, com.facebook.ads.redexgen.core.C0V.A13, com.facebook.ads.redexgen.core.C0V.A2B, com.facebook.ads.redexgen.core.C0V.A2C, com.facebook.ads.redexgen.core.C0V.A2D};
    }

    public ZN(com.facebook.ads.redexgen.core.C7j c7j, boolean z, com.facebook.ads.redexgen.core.C6V c6v) {
        this.A01 = c7j;
        this.A00 = c6v;
        com.facebook.ads.redexgen.core.C05228l.A08(c7j, z, null);
    }

    public static synchronized android.content.pm.PackageInfo A00(com.facebook.ads.redexgen.core.C7j c7j) {
        if (!A03) {
            A02 = com.facebook.ads.redexgen.core.AbstractC0821La.A00(c7j);
            A03 = true;
        }
        return A02;
    }

    public final java.lang.String A03() {
        return A04(com.facebook.ads.redexgen.core.C05258o.A00());
    }
}

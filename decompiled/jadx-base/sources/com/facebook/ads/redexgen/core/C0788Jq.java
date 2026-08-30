package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0788Jq {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"ZYrzMRmVY0fKuwQx318rNacSlgEREo8W", "DFlEfnYj9N0tv35MBsRVrv0NQ03vrQp9", "7c1jEy6Yvwz0PD0sTLnvRvzL7JrMoPnP", "hf", "LVfRkpSB2W01n6UoKBvMpgi93s4V", "wjSsCSJEOA2zcxlJjQpf4WZQJP", "cgSUujLLCITlA6k0bkAALzG3bpp7bkqz", "L2ObalbYjPtjYVm4HCkeGK0BV8R2iNFP"};
    public final com.facebook.ads.redexgen.core.EnumC0787Jp A00;
    public final java.lang.Long A01;
    public final java.lang.String A02;
    public final java.lang.String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C0788Jq(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl) throws com.facebook.ads.redexgen.core.C0780Jh {
        java.lang.String strA01 = A01(270, 21, 91);
        java.lang.String strA02 = A01(291, 11, 58);
        java.lang.String strA03 = A01(247, 14, 109);
        java.lang.String strA04 = A01(310, 4, 38);
        java.lang.String strA05 = A01(302, 8, 37);
        if (android.text.TextUtils.isEmpty(str)) {
            this.A00 = com.facebook.ads.redexgen.core.EnumC0787Jp.A04;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            switch (com.facebook.ads.redexgen.core.C0786Jo.A00[com.facebook.ads.redexgen.core.EnumC0787Jp.valueOf(jSONObject.getString(strA04).toUpperCase()).ordinal()]) {
                case 1:
                    this.A00 = com.facebook.ads.redexgen.core.EnumC0787Jp.A03;
                    this.A01 = java.lang.Long.valueOf(jSONObject.getString(A01(241, 6, 127)));
                    if (jSONObject.has(strA03)) {
                        this.A02 = jSONObject.getString(strA03);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(261, 9, 88));
                    if (!jSONObject.getString(strA02).equals(c7j.A04().A8g()) && !com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
                        throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(0, 54, 122), this.A01, jSONObject.getString(strA02), c7j.A04().A8g()));
                    }
                    if (!jSONObject.getString(strA01).equals(str2)) {
                        throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(54, 50, 11), this.A01, jSONObject.getString(strA01), str2));
                    }
                    java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC0783Jl.A0H.A04()), java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC0783Jl.A0K.A04()), java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC0783Jl.A0I.A04()), java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.EnumC0783Jl.A0J.A04())));
                    if (jSONObject.getInt(strA05) != enumC0783Jl.A04()) {
                        if (!hashSet.contains(java.lang.Integer.valueOf(jSONObject.getInt(strA05))) || !hashSet.contains(java.lang.Integer.valueOf(enumC0783Jl.A04()))) {
                            throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(104, 48, 28), this.A01, java.lang.Integer.valueOf(jSONObject.getInt(strA05)), enumC0783Jl));
                        }
                        return;
                    }
                    return;
                default:
                    throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, A01(210, 28, 68) + jSONObject.getString(strA04));
            }
        } catch (org.json.JSONException e) {
            c7j.A07().AA0(A01(238, 3, 5), com.facebook.ads.redexgen.core.C8E.A0P, new com.facebook.ads.redexgen.core.C8F(e));
            throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, A01(org.objectweb.asm.Opcodes.DCMPG, 18, 88), e);
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{34, 9, 4, 64, 69, 4, 64, 6, 15, 18, 64, 51, 36, 43, 64, 22, 5, 18, 19, 9, 15, 14, 64, 69, 19, 64, 2, 5, 9, 14, 7, 64, 21, 19, 5, 4, 64, 15, 14, 64, 51, 36, 43, 64, 22, 5, 18, 19, 9, 15, 14, 64, 69, 19, 83, 120, 117, 49, 52, 117, 49, 119, 126, 99, 49, 97, 125, 112, 114, 116, 124, 116, 127, 101, 49, 52, 98, 49, 115, 116, 120, 127, 118, 49, 100, 98, 116, 117, 49, 126, 127, 49, 97, 125, 112, 114, 116, 124, 116, 127, 101, 49, 52, 98, 68, 111, 98, 38, 35, 98, 38, 96, 105, 116, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, 38, 100, 99, 111, 104, 97, 38, 115, 117, 99, 98, 38, 105, 104, 38, 114, 99, 107, 118, 106, 103, 114, 99, 38, 35, 117, 11, 44, 52, 35, 46, 43, 38, 98, 0, 43, 38, 18, 35, 59, 46, 45, 35, 38, 71, 118, 126, 99, 127, 114, 103, 118, 51, 54, 96, 51, 122, 96, 51, 125, 124, 103, 51, 101, 114, 127, 122, 119, 51, 113, 114, 125, 125, 118, 97, 51, 103, 118, 126, 99, 127, 114, 103, 118, 11, 48, 45, 43, 46, 46, 49, 44, 42, 59, 58, 126, 28, 55, 58, 14, okio.Utf8.REPLACEMENT_BYTE, 39, 50, 49, okio.Utf8.REPLACEMENT_BYTE, 58, 126, 42, 39, 46, 59, 126, 126, 111, 118, 7, 12, 1, 58, 12, 1, 21, 30, 19, 40, 3, 30, 26, 18, 40, 3, 24, 28, 18, 25, 38, 39, 52, 43, 33, 39, 29, 43, 38, 51, 36, 50, 46, 45, 55, 36, 37, 30, 49, 45, 32, 34, 36, 44, 36, 47, 53, 30, 40, 37, 83, 68, 75, 127, 86, 69, 82, 83, 73, 79, 78, 75, 90, 82, 79, 83, 94, 75, 90, 72, 69, 76, 89};
    }

    static {
        A02();
    }

    public C0788Jq() {
        this.A00 = com.facebook.ads.redexgen.core.EnumC0787Jp.A04;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static com.facebook.ads.redexgen.core.EnumC0783Jl A00(java.lang.String str) throws com.facebook.ads.redexgen.core.C0780Jh {
        try {
            return com.facebook.ads.redexgen.core.EnumC0783Jl.A00(new org.json.JSONObject(str).getInt(A01(302, 8, 37)));
        } catch (org.json.JSONException e) {
            throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, A01(org.objectweb.asm.Opcodes.DCMPG, 18, 88), e);
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl) throws com.facebook.ads.redexgen.core.C0780Jh {
        if (!com.facebook.ads.redexgen.core.EnumC0783Jl.A0G.equals(enumC0783Jl) && !com.facebook.ads.redexgen.core.EnumC0783Jl.A0E.equals(enumC0783Jl) && !com.facebook.ads.redexgen.core.EnumC0783Jl.A0F.equals(enumC0783Jl)) {
            boolean zEquals = com.facebook.ads.redexgen.core.EnumC0783Jl.A0D.equals(enumC0783Jl);
            if (A05[1].charAt(20) == 'm') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[0] = "X5uVqi4FyBeSosvF2q5aVclYJStrMHB5";
            strArr[2] = "BOgVvqLcU58P5XEa1Smg5LyKHeBKxxT8";
            if (zEquals) {
            } else {
                throw new com.facebook.ads.redexgen.core.C0780Jh(com.facebook.ads.internal.protocol.AdErrorType.BID_IMPRESSION_MISMATCH, java.lang.String.format(java.util.Locale.US, A01(org.objectweb.asm.Opcodes.TABLESWITCH, 40, 9), java.lang.Integer.valueOf(enumC0783Jl.A04())));
            }
        }
    }

    public final java.lang.String A04() {
        if (this.A01 == null) {
            return null;
        }
        java.lang.Long l = this.A01;
        if (A05[4].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        A05[7] = "9BRFtSg6abebTfCvkl6x8CVGG9ZYJ4hw";
        return l.toString();
    }

    public final java.lang.String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != com.facebook.ads.redexgen.core.EnumC0787Jp.A04;
    }
}

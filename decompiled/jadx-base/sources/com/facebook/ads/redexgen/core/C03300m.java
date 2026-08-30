package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03300m {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"mJqTstYmruZhgAwaIEL2b4JvWf0CXQMB", "HnU4x", "PGMUzhdVy0Xmj4ysKeXKBv0ydkVK", "GINYaTk0", "V6CaE", "fikkh2q6ZMH0m3YxzoB0Qf3bpiihQ1Gk", "lQcCmoZBYA5tZudR22aEG8J8TvwruM4P", "bCUE2z1YAZE0LvG9WsX4zUjeUwMdrUpo"};
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String A03;
    public final java.lang.String A04;
    public final java.util.List<java.lang.String> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @javax.annotation.Nullable
    public static com.facebook.ads.redexgen.core.C03300m A00(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString(A01(50, 7, 114));
        java.lang.String strOptString2 = jSONObject.optString(A01(0, 7, 5));
        java.lang.String strOptString3 = jSONObject.optString(A01(7, 11, 99));
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(30, 10, 24));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int i = 0;
            while (true) {
                int length = jSONArrayOptJSONArray.length();
                if (A07[1].length() == 8) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A07;
                strArr[7] = "6bZ3PT4hZpte9eL2tY79J7XfrRT1VGoj";
                strArr[0] = "LsdIpdVpvhsRMPSbdpH1TYtbnc9xgebb";
                if (i < length) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                    i++;
                }
            }
        }
        return new com.facebook.ads.redexgen.core.C03300m(strOptString, strOptString2, strOptString3, arrayList, jSONObject.optString(A01(40, 10, 127)), jSONObject.optString(A01(18, 12, 5)));
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 36);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-118, -103, -103, -100, -110, -99, -114, -24, -9, -9, -6, -16, -5, -20, -26, -4, -7, -13, -113, -118, -107, -107, -117, -118, -116, -108, -120, -98, -101, -107, -89, -95, -75, -101, -92, -99, -81, -92, -95, -81, 16, 4, 21, 14, 8, 23, 2, 24, 21, 12, 6, -9, -7, 1, -9, -3, -5};
        if (A07[3].length() != 8) {
            throw new java.lang.RuntimeException();
        }
        A07[6] = "XQt1KGXtiLW9MsB6ZzaZR9RXZ3iXxMSI";
        A06 = bArr;
    }

    static {
        A02();
    }

    public C03300m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> mKeyHashes, java.lang.String str4, java.lang.String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A05 = mKeyHashes;
        this.A03 = str4;
        this.A02 = str5;
    }

    public final java.lang.String A03() {
        return this.A00;
    }

    public final java.lang.String A04() {
        return this.A01;
    }

    public final java.lang.String A05() {
        return this.A04;
    }
}

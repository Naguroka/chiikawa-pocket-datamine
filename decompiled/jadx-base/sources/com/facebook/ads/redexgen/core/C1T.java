package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1T implements java.io.Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public java.lang.String A01;
    public java.lang.String A02;
    public java.lang.String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C1T A00(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString(A04(0, 6, 78));
        java.lang.String strOptString2 = jSONObject.optString(A04(36, 8, 81));
        java.lang.String strOptString3 = jSONObject.optString(A04(24, 12, 84));
        int iOptInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean zOptBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (android.text.TextUtils.isEmpty(strOptString) || android.text.TextUtils.isEmpty(strOptString2) || android.text.TextUtils.isEmpty(strOptString3) || iOptInt == -1) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C1T(strOptString, strOptString2, strOptString3, iOptInt, zOptBoolean);
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{46, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 44, 54, 49, 8, 3, 14, 14, 4, 3, 5, 13, 1, 11, 16, 21, 22, 3, 9, 20, 3, 15, 67, 52, 54, 62, 52, 58, 56, 50, 65, 52, 64, 56, 66, 53, 54, 53, 66, 66, 53, 66, -10, -23, -12, -13, -10, -8, -19, -14, -21, -29, -15, -13, -24, -23};
    }

    public C1T(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = z;
    }

    private final java.lang.String A01() {
        return this.A01;
    }

    private final java.lang.String A02() {
        return this.A02;
    }

    private final java.lang.String A03() {
        return this.A03;
    }

    public static void A06(com.facebook.ads.redexgen.core.C1T c1t, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        if (c1t != null && c1t.A09()) {
            new com.facebook.ads.redexgen.core.WQ(c1199Zs).A04(true, c1t.A01(), c1t.A03(), c1t.A02(), java.lang.System.currentTimeMillis(), c1t.A08());
        }
    }

    public static void A07(com.facebook.ads.redexgen.core.C1T c1t, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        if (c1t != null && c1t.A0A()) {
            new com.facebook.ads.redexgen.core.WQ(c1199Zs).A04(false, c1t.A01(), c1t.A03(), c1t.A02(), java.lang.System.currentTimeMillis(), c1t.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}

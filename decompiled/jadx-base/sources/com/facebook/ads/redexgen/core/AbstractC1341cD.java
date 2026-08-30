package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1341cD extends com.facebook.ads.redexgen.core.C1E implements java.io.Serializable {
    public static org.json.JSONObject A0F = null;
    public static byte[] A0G = null;
    public static java.lang.String[] A0H = {"MTFiGS2hyLPfirnVlCyKu8FL5ydCU71a", "6CtUdYtPnHS0iwt", "3FBcQYGRSJhXKbj7ODsddhFyR1abGnGF", "UQ7LtGE24TX4QkAlsGDlXXS4Vcev", "JcPJu", "s3C", "M3uL5ar3Pz1QrNsTamNzt8iOeyqnSnZC", "bpoJK"};
    public static final java.util.LinkedHashMap<java.lang.String, java.lang.String> A0I;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public com.facebook.ads.redexgen.core.C1B A05;
    public com.facebook.ads.redexgen.core.C1T A06;
    public com.facebook.ads.redexgen.core.C1W A07;
    public com.facebook.ads.redexgen.core.C1Z A08;
    public com.facebook.ads.redexgen.core.C03481f A09;
    public java.lang.String A0A;
    public final java.util.List<com.facebook.ads.redexgen.core.C1F> A0D;
    public boolean A0B = false;
    public boolean A0C = false;
    public final java.util.Map<java.lang.String, java.lang.String> A0E = new java.util.HashMap();

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        A0G = new byte[]{81, 84, 111, 83, 88, 95, 89, 83, 85, 67, 111, 92, 89, 94, 91, 111, 69, 66, 92, 122, 117, 68, 119, 116, 124, 116, 68, 111, 98, 107, 126, 29, 9, 8, 19, 31, 16, 21, 31, 23, 35, 31, 19, 9, 18, 8, 24, 19, 11, 18, 35, 8, 21, 17, 25, 53, 33, 32, 59, 55, 56, kotlin.io.encoding.Base64.padSymbol, 55, okio.Utf8.REPLACEMENT_BYTE, 11, 55, 32, 53, 11, 32, kotlin.io.encoding.Base64.padSymbol, 57, 49, 76, 88, 89, 66, 78, 65, 68, 78, 70, 114, 75, 65, 76, 91, 66, 95, 85, 87, 85, 94, 83, 105, 87, 69, 69, 83, 66, 69, 45, 47, 60, 33, 59, kotlin.io.encoding.Base64.padSymbol, 43, 34, 59, 48, 57, 49, 54, 7, 57, 60, 43, 7, 62, 42, kotlin.io.encoding.Base64.padSymbol, 41, 45, kotlin.io.encoding.Base64.padSymbol, 54, 59, 33, 15, 3, 1, 66, 10, 13, 15, 9, 14, 3, 3, 7, 66, 13, 8, 31, 66, 5, 2, 24, 9, 30, 31, 24, 5, 24, 5, 13, 0, 66, 10, 5, 2, 5, 31, 4, 51, 13, 15, 24, 5, 26, 5, 24, 21, 6, 17, 91, 76, 83, 96, 94, 79, 79, 96, 93, 80, 74, 81, 91, 96, 74, 77, 83, 76, 36, 32, 118, 35, 29, 37, 50, 29, 45, 52, 39, 48, 46, 35, 59, 29, 49, 39, 33, 55, 48, 39, 29, 54, 45, 41, 39, 44, 101, 111, 99, 98, 84, 83, 78, 73, 92, 81, 81, 98, 79, 88, 91, 88, 79, 79, 88, 79, 120, 127, 101, 116, 99, 98, 101, 120, 101, 120, 112, 125, 67, 78, 65, 75, 92, 76, 78, 95, 74, 86, 91, 67, 85, 79, 78, 82, 77, 80, 86, 80, 67, 75, 86, 31, 8, 26, 12, 31, 9, 8, 9, 50, 27, 4, 9, 8, 2, 68, 95, 88, 66, 91, 83, 104, 91, 88, 80, 104, 86, 89, 78, 104, 94, 86, 85, 104, 84, 91, 94, 84, 92, 104, 88, 89, 84, 82, 126, 99, 126, 102, 111, 13, 10, 20};
    }

    static {
        A09();
        A0I = new java.util.LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC1341cD(java.util.List<com.facebook.ads.redexgen.core.C1F> list) {
        this.A0D = list;
    }

    public static java.lang.String A06(java.lang.String str) {
        return A0I.get(str);
    }

    private java.util.HashMap<java.lang.String, java.lang.String> A07(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(org.objectweb.asm.Opcodes.DRETURN, 18, 79));
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        if (jSONObjectOptJSONObject == null) {
            return map;
        }
        java.util.Iterator<java.lang.String> nameItr = jSONObjectOptJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                java.lang.String next = nameItr.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            } catch (org.json.JSONException unused) {
            }
        }
        return map;
    }

    public static java.util.List<com.facebook.ads.redexgen.core.C1F> A08(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1R c1r) {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A05(101, 8, 62));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            return com.facebook.ads.redexgen.core.C1N.A01(jSONArrayOptJSONArray, jSONObject, c1199Zs, c1r);
        }
        java.util.List<com.facebook.ads.internal.adapters.datamodels.AdInfo> adInfoList = new java.util.ArrayList<>();
        com.facebook.ads.redexgen.core.C1F c1fA00 = com.facebook.ads.redexgen.core.C1F.A00(jSONObject);
        c1r.A3j(c1fA00, jSONObject);
        adInfoList.add(c1fA00);
        return adInfoList;
    }

    private void A0A(int i) {
        this.A00 = i;
    }

    private final void A0B(int i) {
        this.A04 = i;
    }

    private void A0C(com.facebook.ads.redexgen.core.C1B c1b) {
        this.A05 = c1b;
    }

    private final void A0D(com.facebook.ads.redexgen.core.C1T c1t) {
        this.A06 = c1t;
    }

    private void A0E(com.facebook.ads.redexgen.core.C1W c1w) {
        this.A07 = c1w;
    }

    private final void A0F(com.facebook.ads.redexgen.core.C1Z c1z) {
        this.A08 = c1z;
    }

    private void A0G(com.facebook.ads.redexgen.core.C03481f c03481f) {
        this.A09 = c03481f;
    }

    private void A0H(java.lang.String str) {
        this.A0A = str;
    }

    public final int A1J() {
        return this.A00;
    }

    public final int A1K() {
        return this.A01;
    }

    public final int A1L() {
        return this.A02;
    }

    public final int A1M() {
        return this.A03;
    }

    public final int A1N() {
        return this.A04;
    }

    public final com.facebook.ads.redexgen.core.C1B A1O() {
        return this.A05;
    }

    public final com.facebook.ads.redexgen.core.C1F A1P() {
        return this.A0D.get(0);
    }

    public final com.facebook.ads.redexgen.core.C1T A1Q() {
        return this.A06;
    }

    public final com.facebook.ads.redexgen.core.C1W A1R() {
        return this.A07;
    }

    public final com.facebook.ads.redexgen.core.C1Z A1S() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C03481f A1T() {
        return this.A09;
    }

    public final java.lang.String A1U() {
        return this.A0A;
    }

    public final java.lang.String A1V(java.lang.String str) {
        return this.A0E.get(str);
    }

    public final java.util.List<com.facebook.ads.redexgen.core.C1F> A1W() {
        return java.util.Collections.unmodifiableList(this.A0D);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public final void A1X(com.facebook.ads.redexgen.core.MR mr) {
        byte b;
        java.lang.String strA0c = A0c();
        switch (strA0c.hashCode()) {
            case -1364000502:
                if (!strA0c.equals(A05(276, 14, 29))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 604727084:
                if (!strA0c.equals(A05(241, 12, 97))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                mr.A4P(A05(128, 45, 28));
                break;
            case 1:
                break;
            default:
                return;
        }
        mr.A4P(com.facebook.ads.redexgen.core.EnumC0972Qv.A08.A03());
    }

    public final void A1Y(org.json.JSONObject jSONObject) {
        java.lang.String strA05;
        A0D(com.facebook.ads.redexgen.core.C1T.A00(jSONObject.optJSONObject(A05(225, 16, 77))));
        A0F = jSONObject.optJSONObject(A05(89, 12, 70));
        com.facebook.ads.redexgen.core.C1Y c1yA06 = new com.facebook.ads.redexgen.core.C1Y().A06(jSONObject.optString(A05(319, 5, 122)));
        java.lang.String strA06 = A05(221, 4, 124);
        if (jSONObject.optJSONObject(strA06) != null) {
            strA05 = jSONObject.optJSONObject(strA06).optString(A05(324, 3, 8));
        } else {
            strA05 = A05(0, 0, 15);
        }
        A0F(c1yA06.A05(strA05).A04(jSONObject.optString(A05(0, 19, 64))).A07(com.facebook.ads.redexgen.core.AbstractC03431a.A03(jSONObject)).A08());
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(262, 6, 74));
        org.json.JSONObject layoutObject = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(A05(268, 8, 82)) : null;
        com.facebook.ads.redexgen.core.C1O c1oA01 = com.facebook.ads.redexgen.core.C1O.A01(layoutObject);
        java.lang.String[] strArr = A0H;
        if (strArr[1].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0H;
        strArr2[2] = "MaJS3iOjDVpkOvzQIu4XnTvkYtI43ENf";
        strArr2[6] = "dcadpZfpRdAwhtf1LK3imqQWfZ9Fu8JJ";
        A0C(new com.facebook.ads.redexgen.core.C1B(c1oA01, com.facebook.ads.redexgen.core.C1O.A01(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(A05(253, 9, 95)) : null)));
        A0G(com.facebook.ads.redexgen.core.AbstractC03431a.A01(jSONObject));
        A0E(com.facebook.ads.redexgen.core.AbstractC03431a.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 107), 0));
        A0B(jSONObject.optInt(A05(109, 19, 40), -1));
        this.A0E.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(55, 18, 36), 0);
        this.A01 = jSONObject.optInt(A05(73, 16, 93), 1);
        this.A0C = jSONObject.optBoolean(A05(290, 29, 71), false);
        this.A02 = jSONObject.optInt(A05(31, 24, 12), this.A03);
        java.lang.String strOptString = jSONObject.optString(A05(org.objectweb.asm.Opcodes.LRETURN, 2, 21));
        A0H(strOptString);
        A0I.put(strOptString, jSONObject.optString(A05(org.objectweb.asm.Opcodes.INSTANCEOF, 28, 50)));
        A0w(jSONObject);
    }

    public final void A1Z(boolean z) {
        this.A0B = z;
    }

    public final boolean A1a() {
        return this.A0B;
    }

    public final boolean A1b() {
        return this.A0C;
    }
}

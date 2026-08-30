package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1339cB extends com.facebook.ads.redexgen.core.C1E implements java.io.Serializable {
    public static byte[] A0B = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final java.util.List<com.facebook.ads.redexgen.core.AbstractC1341cD> A0A;
    public final java.util.ArrayList<java.lang.Integer> A09 = new java.util.ArrayList<>();
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public java.lang.String A04 = A04(org.objectweb.asm.Opcodes.ARRAYLENGTH, 2, 71);
    public final java.lang.String A08 = java.util.UUID.randomUUID().toString();

    static {
        A05();
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 37);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{93, 88, 79, 117, 126, 119, 127, 120, 73, 102, 119, 100, 119, 123, 101, 17, 26, 19, 27, 28, 23, 22, 45, 19, 22, 1, 45, 17, 29, 7, 28, 6, 54, kotlin.io.encoding.Base64.padSymbol, 52, 60, 59, 48, 49, 10, 52, 49, 38, 10, 56, 52, 45, 10, 49, 32, 39, 52, 33, 60, 58, 59, 73, 66, 75, 67, 68, 79, 78, 117, 75, 78, 89, 117, 92, 75, 88, 67, 79, 68, 94, 74, 65, 72, 64, 71, 64, 71, 78, 118, 79, 70, 91, 74, 76, 118, 95, 64, 76, 94, 118, 93, 64, 68, 76, 90, 110, 101, 111, 84, 104, 106, 121, 111, 84, 106, 126, 127, 100, 84, 104, 103, 100, 120, 110, 84, 127, 98, 102, 110, 109, 122, 111, 112, 109, 107, 64, 121, 118, 109, 108, 107, 64, 122, 124, 111, 114, 64, 112, 113, 115, 102, 65, 86, 67, 92, 65, 71, 108, 85, 90, 65, 64, 71, 108, 90, 94, 67, 65, 86, 64, 64, 90, 92, 93, 108, 92, 93, 95, 74, 13, 14, 18, 23, 10, 33, 24, 17, 12, 29, 27, 33, 8, 23, 27, 9, 25, 31};
    }

    public C1339cB(java.util.List<com.facebook.ads.redexgen.core.AbstractC1341cD> list) {
        this.A0A = list;
    }

    public static com.facebook.ads.redexgen.core.C1339cB A02(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) throws org.json.JSONException {
        return A03(jSONObject, c1199Zs, false);
    }

    public static com.facebook.ads.redexgen.core.C1339cB A03(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, boolean z) throws org.json.JSONException {
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(A04(0, 3, 25));
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (z) {
                arrayList.add(com.facebook.ads.redexgen.core.C0689Fm.A02(jSONArray.getJSONObject(i), c1199Zs));
            } else {
                arrayList.add(com.facebook.ads.redexgen.core.C0687Fk.A02(jSONArray.getJSONObject(i), c1199Zs));
            }
        }
        com.facebook.ads.redexgen.core.C1339cB c1339cB = new com.facebook.ads.redexgen.core.C1339cB(arrayList);
        org.json.JSONObject chainingParams = jSONObject.getJSONObject(A04(3, 12, 51));
        c1339cB.A04 = chainingParams.toString();
        c1339cB.A01 = chainingParams.optInt(A04(15, 17, 87), arrayList.size());
        c1339cB.A03 = chainingParams.optInt(A04(32, 24, 112), 0);
        c1339cB.A02 = chainingParams.optInt(A04(100, 24, 46), 0);
        c1339cB.A00 = chainingParams.optInt(A04(56, 19, 15), 2);
        c1339cB.A0w(chainingParams);
        c1339cB.A07 = chainingParams.optBoolean(A04(org.objectweb.asm.Opcodes.FRETURN, 16, 91), false);
        c1339cB.A06 = chainingParams.optBoolean(A04(org.objectweb.asm.Opcodes.I2C, 28, 22), false);
        c1339cB.A05 = chainingParams.optBoolean(A04(124, 22, 58), false);
        org.json.JSONArray jSONArrayOptJSONArray = chainingParams.optJSONArray(A04(75, 25, 12));
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                c1339cB.A09.add(java.lang.Integer.valueOf(jSONArrayOptJSONArray.optInt(i2, 0)));
            }
        }
        return c1339cB;
    }

    @Override // com.facebook.ads.redexgen.core.C1E
    public final int A0R() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.C1E
    public final int A0S() {
        return this.A03 + this.A02;
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

    public final com.facebook.ads.redexgen.core.AbstractC1341cD A1M() {
        if (!this.A0A.isEmpty()) {
            return this.A0A.get(0);
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.AbstractC1341cD A1N(int i) {
        return this.A0A.get(i);
    }

    public final java.lang.String A1O() {
        return this.A08;
    }

    public final java.lang.String A1P() {
        return this.A04;
    }

    public final java.lang.String A1Q() {
        com.facebook.ads.redexgen.core.AbstractC1341cD firstAdDataBundle = A1M();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A1U();
        }
        return null;
    }

    public final java.util.ArrayList<java.lang.Integer> A1R() {
        return this.A09;
    }

    public final void A1S(int i) {
        this.A0A.remove(i);
        this.A01--;
    }

    public final boolean A1T() {
        return this.A00 == 0;
    }

    public final boolean A1U() {
        return this.A05;
    }

    public final boolean A1V() {
        return this.A06;
    }

    public final boolean A1W() {
        return this.A07;
    }
}

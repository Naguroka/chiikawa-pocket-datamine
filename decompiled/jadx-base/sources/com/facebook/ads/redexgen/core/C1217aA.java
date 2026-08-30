package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1217aA extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"QJHZKkwEEt2XAA8qb811yZkloXTxKqNm", "0Eo8hyAH95ZWxpQDtz3kXr2Dg2BAnbpt", "yx1IzqDtrK1i7eGrpZodHZ", "KUuZPkausU2VOaHnsIAk0Hn07pOf06lA", "ddvRVBlQrtqHFM3JEeiDXs23nPXnVLtA", "0N8fJtCAvq63STI6q3YZ9dLrj33X3xUc", "d0kigy9sFkFC2aZLzfYLsKXCuWX9Z7p3", "u6xVOdZhMjB663K3VBvQukbaw71N5v3b"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass65 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 122;
            if (A02[2].length() != 22) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[3] = "wsWgA7V3OPhtM2agFx6R9FkGRpDQ8hFC";
            strArr[5] = "5QDbKue07C6BH4ozhF9MSdyiVJUT25MO";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{43, 57, 57, 47, 62, 57};
    }

    static {
        A02();
    }

    public C1217aA(com.facebook.ads.redexgen.core.AnonymousClass65 anonymousClass65) {
        this.A00 = anonymousClass65;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        try {
            org.json.JSONArray jSONArray = this.A00.A05.getJSONArray(A00(0, 6, 48));
            for (int i = 0; i < jSONArray.length(); i++) {
                com.facebook.ads.redexgen.core.AnonymousClass63 assetData = com.facebook.ads.redexgen.core.AnonymousClass63.A00(jSONArray.getJSONObject(i));
                this.A00.A09(assetData.A04, assetData);
            }
            this.A00.A02.A0W(new com.facebook.ads.redexgen.core.C1219aC(this), new com.facebook.ads.redexgen.core.C6Y(this.A00.A04, this.A00.A03));
        } catch (org.json.JSONException unused) {
            this.A00.A00.post(new com.facebook.ads.redexgen.core.C1218aB(this));
        }
    }
}

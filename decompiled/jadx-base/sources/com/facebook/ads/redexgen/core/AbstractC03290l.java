package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03290l {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"jSoy8XspXCFqO9NWG0uega5zyBcMMpnv", "8I941vkvBihlhZSR3", "E0n4xhy7f55RdYtJKKgnHTy6BEjDvFXE", "Oow628hlFtykEPzM3xMW0Wh", "gjSfO6YGNNbsKn6TLZq3stDSfq2Vbbu6", "XJoMwGgC8l1BSQaiX90ZQnicuTGj509z", "JK4GcCSwzapE3gOVlVNykyUw2lU6lT6d", "8BqJ2MeWpSgEuyxwl"};

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {86, 115, 55, 126, 100, 55, 126, 121, 97, 118, 123, 126, 115, 118, 99, 114, 115, 55, 96, 126, 99, 127, 120, 98, 99, 55, 99, 120, 124, 114, 121, 57, 27, 10, 19, 117, 116, 101, 116, 114, 101, 120, 126, 127, 78, 98, 101, 99, 120, 127, 118, 98, 39, 32, 56, 47, 34, 39, 42, 47, 58, 39, 33, 32, 17, 44, 43, 38, 47, 56, 39, 33, 60, 45, 60, 47, 46, 52, 51, 58};
        if (A01[6].length() == 14) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[7] = "4DtSv1ItoT1AnjNkW";
        strArr[1] = "xsdhzuZMhKe1kPAxh";
        A00 = bArr;
    }

    static {
        A05();
    }

    public static com.facebook.ads.redexgen.core.EnumC03270j A00(org.json.JSONObject jSONObject) {
        return com.facebook.ads.redexgen.core.EnumC03270j.A00(jSONObject.optString(A02(52, 21, 9)));
    }

    public static com.facebook.ads.redexgen.core.C1377cn A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject jSONObject, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1377cn(jSONObject, c1199Zs, str);
    }

    public static java.util.Collection<java.lang.String> A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = null;
        try {
            java.lang.String detectionStringJSON = jSONObject.optString(A02(35, 17, 86));
            if (!android.text.TextUtils.isEmpty(detectionStringJSON)) {
                org.json.JSONArray detectionStringsArray = new org.json.JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (org.json.JSONException e) {
            c1199Zs.A07().AA0(A02(73, 7, 26), com.facebook.ads.redexgen.core.C8E.A2C, new com.facebook.ads.redexgen.core.C8F(e));
        }
        return A04(jSONArray);
    }

    public static java.util.Collection<java.lang.String> A04(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A06(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.InterfaceC03280k interfaceC03280k, com.facebook.ads.redexgen.core.J7 j7) {
        com.facebook.ads.redexgen.core.EnumC03270j enumC03270jA7c = interfaceC03280k.A7c();
        if (enumC03270jA7c != null) {
            com.facebook.ads.redexgen.core.EnumC03270j invalidationBehavior = com.facebook.ads.redexgen.core.EnumC03270j.A03;
            if (enumC03270jA7c != invalidationBehavior) {
                boolean packageInstalled = false;
                java.util.Collection<java.lang.String> collectionA7B = interfaceC03280k.A7B();
                if (collectionA7B == null || collectionA7B.isEmpty()) {
                    return false;
                }
                java.util.Iterator<java.lang.String> it = collectionA7B.iterator();
                while (it.hasNext()) {
                    if (com.facebook.ads.redexgen.core.AbstractC0821La.A04(c1199Zs, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                com.facebook.ads.redexgen.core.EnumC03270j invalidationBehavior2 = com.facebook.ads.redexgen.core.EnumC03270j.A02;
                if (packageInstalled != (enumC03270jA7c == invalidationBehavior2)) {
                    return false;
                }
                java.lang.String clientToken = interfaceC03280k.A6r();
                if (!android.text.TextUtils.isEmpty(clientToken)) {
                    j7.AA7(clientToken, null);
                    return true;
                }
                c1199Zs.A07().AA0(A02(32, 3, 61), com.facebook.ads.redexgen.core.C8E.A0Z, new com.facebook.ads.redexgen.core.C8F(A02(0, 32, 80)));
                return true;
            }
        }
        return false;
    }
}

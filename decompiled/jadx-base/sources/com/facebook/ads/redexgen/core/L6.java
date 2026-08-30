package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class L6 {
    public static byte[] A00;

    static {
        A04();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-92, -90, -103, -102, -77, -94, -87, -95, -77, -107, -104, -89, -77, -94, -93, -77, -105, -100, -107, -99, -94, -115, -117, -99, -115, -117, -114, -113, -114, -119, -117, -114, -68, -49, -53, -55, -72, -74, -69, -72, -53, -72, -15, -14, -9, -3, -4, -60, -59, -60, -71, -66, -73, -65, -60, -69, -70, -75, -73, -70, -55, -8, -6};
    }

    public static int A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i) {
        return com.facebook.ads.redexgen.core.KJ.A00(c1199Zs).getInt(A01(0, 21, 52), i);
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        int iA00 = A00(c1199Zs, -1);
        if (iA00 == -1) {
            return null;
        }
        try {
            return new com.facebook.ads.ExtraHints.Builder().extraData(A03(str, A01(47, 14, 54), java.lang.Integer.valueOf(iA00))).build().getHints();
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static java.lang.String A03(java.lang.String str, java.lang.String str2, java.lang.Object obj) throws org.json.JSONException {
        java.lang.String strA01 = A01(61, 2, 93);
        if (str != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String extraData = A01(42, 5, 105);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(extraData);
            java.lang.String extraData2 = A01(32, 10, 55);
            strA01 = jSONObject2.optString(extraData2, strA01);
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject(strA01);
        jSONObject3.put(str2, obj);
        java.lang.String extraData3 = jSONObject3.toString();
        return extraData3;
    }

    public static boolean A05(java.lang.String str) throws org.json.JSONException {
        return str != null && new org.json.JSONObject(new org.json.JSONObject(str).getJSONObject(A01(42, 5, 105)).optString(A01(32, 10, 55), A01(61, 2, 93))).optBoolean(A01(21, 11, 10), false);
    }

    public final com.facebook.ads.InterstitialAd A06(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, java.lang.String str2) {
        if (c1199Zs == null) {
            return null;
        }
        try {
            com.facebook.ads.InterstitialAd interstitialAd = new com.facebook.ads.InterstitialAd(c1199Zs, str);
            interstitialAd.setExtraHints(new com.facebook.ads.ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return interstitialAd;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public final com.facebook.ads.RewardedVideoAd A07(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, java.lang.String str2) {
        if (c1199Zs == null) {
            return null;
        }
        try {
            com.facebook.ads.RewardedVideoAd rewardedVideoAd = new com.facebook.ads.RewardedVideoAd(c1199Zs, str);
            rewardedVideoAd.setExtraHints(new com.facebook.ads.ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 10), true)).build());
            return rewardedVideoAd;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public final void A08(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, boolean z) {
        int i = 0;
        java.lang.String strA01 = A01(0, 21, 52);
        if (!z) {
            int lastNonChainedAds = com.facebook.ads.redexgen.core.KJ.A00(c1199Zs).getInt(strA01, 0);
            i = lastNonChainedAds + 1;
        }
        com.facebook.ads.redexgen.core.KJ.A00(c1199Zs).edit().putInt(strA01, i).apply();
    }

    public final boolean A09(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, int i) {
        if (i <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                int lastNonChainedAds = A00(c1199Zs, i - 1);
                return lastNonChainedAds >= i + (-1);
            }
        } catch (org.json.JSONException unused) {
        }
        return false;
    }
}

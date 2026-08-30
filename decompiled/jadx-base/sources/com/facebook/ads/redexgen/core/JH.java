package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class JH {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"U6KVOTsvyFGORVsRScrnzIfC22jYBwjX", "ILJfzAM", "mSXQ0Ybvz22qP9FTERotykvccOsLfkLX", "hexg7lZyOyIoqc3cfx0LJrY0JzPheGn9", "QO0W7SjBIJExYoWj8d5V4ATeE22xBdxq", "XgtJCrs", "K8cPCeEyVHoG5OOYDkeX6MTEK7uusLdi", "HRkIYlhxQwIghQfQLwcjnPshoo50TCUq"};
    public static final java.util.Map<java.lang.String, java.lang.String> A02;
    public static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].charAt(20) != 'n') {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "VCgIGVaZR6LUurcUp8PRnu67FREgo2FS";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            int i5 = (bArrCopyOfRange[i4] - i3) - 84;
            java.lang.String[] strArr = A01;
            if (strArr[6].charAt(18) != strArr[4].charAt(18)) {
                java.lang.String[] strArr2 = A01;
                strArr2[6] = "QUKDQrMYYXqh8JHMTaWZV6Ed8Qh6Q2ZU";
                strArr2[4] = "Ahd0Yp7BAsSR93JTUpDMLzcJNLS2OMnc";
                bArrCopyOfRange[i4] = (byte) i5;
                i4++;
            } else {
                bArrCopyOfRange[i4] = (byte) i5;
                i4++;
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{33, 50, -25, -28, -9, -28, 20, 35, 28, 28, 19, 26, 7, 10, -4, -1, -6, 15, 4, 8, 0, -6, 8, 14, 9, -4, 8, 12, -4, 10, 11, -10, 11, 0, 4, -4, -10, 4, 10, 21, 24, -1, 6, 21, 14, 14, 5, 12, -1, 12, 15, 7, 7, 9, 14, 7};
    }

    static {
        A03();
        A03 = new java.util.HashMap();
        A02 = new java.util.HashMap();
    }

    public static java.lang.String A01(java.lang.String str) {
        return A02.get(str);
    }

    public static java.util.List<java.lang.String> A02(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (org.json.JSONException e) {
                c1199Zs.A07().AA0(A00(39, 17, 76), com.facebook.ads.redexgen.core.C8E.A1C, new com.facebook.ads.redexgen.core.C8F(e));
            }
        }
        return arrayList;
    }

    public static void A04(android.view.View view, com.facebook.ads.redexgen.core.JF jf, com.facebook.ads.redexgen.core.JE je) {
        view.addOnAttachStateChangeListener(new com.facebook.ads.redexgen.core.JG(jf, je));
    }

    public static void A05(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, long j) {
        com.facebook.ads.redexgen.core.J7 adEventManager = c1199Zs.A09();
        com.facebook.ads.redexgen.core.JF jf = new com.facebook.ads.redexgen.core.JF(str, adEventManager);
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(24, 15, 67), com.facebook.ads.redexgen.core.C0841Lu.A06(j));
        map.put(A00(12, 12, 71), com.facebook.ads.redexgen.core.C0841Lu.A04(j));
        jf.A04(com.facebook.ads.redexgen.core.JE.A0D, map);
    }

    public static void A06(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject jSONObject, long j, java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A00(2, 4, 47));
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(6, 6, 90));
        if (android.text.TextUtils.isEmpty(str) && jSONArrayOptJSONArray != null) {
            A07(c1199Zs, jSONObjectOptJSONObject, A02(c1199Zs, jSONArrayOptJSONArray), j, null);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = A03;
        if (A01[7].charAt(20) != 'n') {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "eRhlxr4ZIl29VB3yVqBFuzgoGteA2pMR";
        if (!map.containsKey(str)) {
            return;
        }
        A07(c1199Zs, jSONObjectOptJSONObject, A03.get(str), j, str);
    }

    public static void A07(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, org.json.JSONObject jSONObject, java.util.List<java.lang.String> list, long j, java.lang.String str) {
        java.lang.String strA00 = A00(0, 2, 106);
        if (jSONObject.has(strA00)) {
            java.lang.String clientToken = jSONObject.optString(strA00);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c1199Zs, clientToken, j);
        }
    }

    public static void A08(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        A02.put(str, str2);
    }

    public static void A09(java.lang.String str, java.util.List<java.lang.String> list) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        if (A01[7].charAt(20) != 'n') {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "Iv9PzV9ggO2VP5nzFrt9V6UHZMtP3qc2";
        if (zIsEmpty) {
            return;
        }
        A03.put(str, list);
    }

    public static boolean A0A(java.lang.String str, com.facebook.ads.redexgen.core.JE je) {
        return A0B(str, je.A03());
    }

    public static boolean A0B(java.lang.String str, java.lang.String str2) {
        return A03.containsKey(str) && A03.get(str).contains(str2);
    }
}

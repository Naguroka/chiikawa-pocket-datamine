package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0705Gf extends com.facebook.ads.redexgen.core.AbstractC1376cm {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final java.lang.String A06;
    public com.facebook.ads.redexgen.core.LL A00;
    public final android.net.Uri A01;
    public final com.facebook.ads.redexgen.core.C1T A02;
    public final java.util.Map<java.lang.String, java.lang.String> A03;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final java.util.List<android.content.Intent> A06() {
        java.util.List<com.facebook.ads.redexgen.core.C03300m> listA05 = A05();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (listA05 != null) {
            java.util.Iterator<com.facebook.ads.redexgen.core.C03300m> it = listA05.iterator();
            while (it.hasNext()) {
                android.content.Intent intentA00 = A00(it.next());
                if (intentA00 != null) {
                    arrayList.add(intentA00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, kotlin.io.encoding.Base64.padSymbol, 109, 124, 111, 110, 116, 115, 122, kotlin.io.encoding.Base64.padSymbol, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, 20, 28, 25, 16, 17, 85, 1, 26, 85, 26, 5, 16, 27, 85, 24, 20, 7, 30, 16, 1, 85, 0, 7, 25, 79, 85, 51, 53, 8, 7, 13, 27, 6, 0, 13, okio.Utf8.REPLACEMENT_BYTE, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, okio.Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, 42, 55, 49, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, 13, 0, 74, 13, 10, 16, 1, 10, 16, 74, 5, 7, 16, 13, 11, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, 28, 39, 34, 55, 34, 79, 64, 69, 79, 71, 115, 95, 67, 89, 94, 79, 73, 25, 21, 6, 31, 17, 0, 78, 91, 91, 16, 17, 0, 21, 29, 24, 7, 75, 29, 16, 73, 81, 7, 125, 98, 119, 124, 119, 118, 77, 118, 119, 119, 98, 126, 123, 124, 121, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 114, 117, 120, 120, 118, 117, 119, 127, 75, 97, 102, 120, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 82, 67, 80, 81, 75, 76, 69, 56, okio.Utf8.REPLACEMENT_BYTE, 36, 57, 46, 20, 34, 47, 81, 86, 77, 80, 71, 125, 87, 80, 78, 60, 59, 32, kotlin.io.encoding.Base64.padSymbol, 42, 16, 58, kotlin.io.encoding.Base64.padSymbol, 35, 16, 56, 42, 45, 16, 41, 46, 35, 35, 45, 46, 44, 36, 23, 6, 15, 89, 24, 9, 0, 28, 30, 3, 1, 28, 24, 86, 1, 7, 17, 6, 23, 24, 29, 23, 31};
    }

    static {
        A07();
        A06 = com.facebook.ads.redexgen.core.C0705Gf.class.getSimpleName();
    }

    public C0705Gf(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.C03310o c03310o, boolean z, com.facebook.ads.redexgen.core.C1T c1t) {
        super(c1199Zs, j7, str, c03310o, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c1t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.core.C03300m c03300m) {
        if (android.text.TextUtils.isEmpty(c03300m.A05())) {
            return null;
        }
        java.lang.String strA03 = c03300m.A03();
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00;
        java.lang.String appLinkUri = c03300m.A05();
        if (!com.facebook.ads.redexgen.core.AbstractC0821La.A04(c1199Zs, appLinkUri)) {
            com.facebook.ads.redexgen.core.C1199Zs c1199Zs2 = ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00;
            if (A05[6].charAt(8) != 'P') {
                throw new java.lang.RuntimeException();
            }
            A05[5] = "ldjYBpnAKJ5YKanQesg35Gt0OkPWSzAG";
            if (!A09(c1199Zs2, strA03)) {
                return null;
            }
        }
        if (!android.text.TextUtils.isEmpty(strA03)) {
            java.lang.String appLinkUri2 = A04(262, 4, 74);
            if (!strA03.startsWith(appLinkUri2)) {
                java.lang.String appLinkUri3 = A04(266, 10, 69);
            }
            return new android.content.Intent(A04(62, 26, 119), com.facebook.ads.redexgen.core.L5.A00(strA03));
        }
        android.content.pm.PackageManager packageManager = ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        java.lang.String appLinkUri4 = c03300m.A04();
        if (android.text.TextUtils.isEmpty(appLinkUri4)) {
            boolean zIsEmpty = android.text.TextUtils.isEmpty(strA03);
            java.lang.String[] strArr = A05;
            java.lang.String str = strArr[7];
            java.lang.String appLinkUri5 = strArr[1];
            if (str.length() == appLinkUri5.length()) {
                throw new java.lang.RuntimeException();
            }
            A05[2] = "P0UyeT8Oj9P4H3GWuZ6UwWdLOtPXQiGU";
            if (zIsEmpty) {
                java.lang.String appLinkUri6 = c03300m.A05();
                return packageManager.getLaunchIntentForPackage(appLinkUri6);
            }
        }
        android.content.Intent intentA01 = A01(c03300m);
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intentA01, 65536);
        if (intentA01.getComponent() == null) {
            for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentActivities) {
                java.lang.String str2 = resolveInfo.activityInfo.packageName;
                java.lang.String strA05 = c03300m.A05();
                if (A05[0].charAt(20) != '5') {
                    throw new java.lang.RuntimeException();
                }
                A05[5] = "zQ3PtZjh8GquAUsdZUz15LBCi8uwCZq5";
                if (str2.equals(strA05)) {
                    intentA01.setComponent(new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                    break;
                }
            }
        }
        if (listQueryIntentActivities.isEmpty() || intentA01.getComponent() == null) {
            if (!A09(((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00, strA03)) {
                return null;
            }
            java.lang.String appLinkUri7 = c03300m.A05();
            intentA01.setPackage(appLinkUri7);
        }
        return intentA01;
    }

    private android.content.Intent A01(com.facebook.ads.redexgen.core.C03300m c03300m) {
        android.content.Intent intent = new android.content.Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!android.text.TextUtils.isEmpty(c03300m.A05()) && !android.text.TextUtils.isEmpty(c03300m.A04())) {
            intent.setComponent(new android.content.ComponentName(c03300m.A05(), c03300m.A04()));
        }
        if (!android.text.TextUtils.isEmpty(c03300m.A03())) {
            intent.setData(com.facebook.ads.redexgen.core.L5.A00(c03300m.A03()));
        }
        return intent;
    }

    private final android.net.Uri A02() {
        java.lang.String queryParameter = this.A01.getQueryParameter(A04(231, 9, 11));
        if (!android.text.TextUtils.isEmpty(queryParameter)) {
            return com.facebook.ads.redexgen.core.L5.A00(queryParameter);
        }
        android.net.Uri uri = this.A01;
        java.lang.String storeUrl = A04(223, 8, 98);
        java.lang.String storeId = uri.getQueryParameter(storeUrl);
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = {storeId};
        java.lang.String storeUrl2 = A04(138, 22, 93);
        return com.facebook.ads.redexgen.core.L5.A00(java.lang.String.format(locale, storeUrl2, objArr));
    }

    private com.facebook.ads.redexgen.core.EnumC03240g A03() throws com.facebook.ads.redexgen.core.C0811Ko {
        com.facebook.ads.redexgen.core.L2 l2 = new com.facebook.ads.redexgen.core.L2();
        try {
            return com.facebook.ads.redexgen.core.L2.A05(l2, ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00, A02(), ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A02, this.A03);
        } catch (com.facebook.ads.redexgen.core.C0811Ko unused) {
            java.lang.String str = A04(26, 27, 92) + this.A01.toString();
            java.lang.String queryParameter = this.A01.getQueryParameter(A04(androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 22, 102));
            if (queryParameter != null && queryParameter.length() > 0) {
                com.facebook.ads.redexgen.core.L2.A0D(l2, ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00, com.facebook.ads.redexgen.core.L5.A00(queryParameter), ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A02);
            }
            return com.facebook.ads.redexgen.core.EnumC03240g.A09;
        }
    }

    private java.util.List<com.facebook.ads.redexgen.core.C03300m> A05() {
        java.lang.String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        java.lang.String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(queryParameter);
            java.lang.String appsiteDataString2 = A04(55, 7, 64);
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    com.facebook.ads.redexgen.core.C03300m c03300mA00 = com.facebook.ads.redexgen.core.C03300m.A00(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c03300mA00 != null) {
                        arrayList.add(c03300mA00);
                    }
                }
            }
        } catch (org.json.JSONException e) {
            com.facebook.ads.redexgen.core.C8D c8dA07 = ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00.A07();
            int i2 = com.facebook.ads.redexgen.core.C8E.A24;
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(e);
            java.lang.String appsiteDataString3 = A04(216, 7, 11);
            c8dA07.AA0(appsiteDataString3, i2, c8f);
            java.lang.String str = A06;
            java.lang.String appsiteDataString4 = A04(0, 26, 52);
            android.util.Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        java.util.List<android.content.Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        java.util.Iterator<android.content.Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            try {
                if (com.facebook.ads.redexgen.core.C0813Kq.A0C(((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00, it.next())) {
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static boolean A09(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 30 && str != null && com.facebook.ads.redexgen.core.C0762Im.A1z(c1199Zs);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1376cm
    public final com.facebook.ads.redexgen.core.EnumC03240g A0D() {
        com.facebook.ads.redexgen.core.EnumC03240g enumC03240gA0G = com.facebook.ads.redexgen.core.EnumC03240g.A09;
        if (((com.facebook.ads.redexgen.core.AbstractC1376cm) this).A02) {
            enumC03240gA0G = A0G();
        } else {
            this.A03.put(A04(200, 16, 61), java.lang.String.valueOf(true));
        }
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00;
        if (A05[2].charAt(5) != 'T') {
            throw new java.lang.RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        if (!com.facebook.ads.redexgen.core.M3.A0g(c1199Zs, enumC03240gA0G, this.A03)) {
            A0E(this.A03, enumC03240gA0G);
            com.facebook.ads.redexgen.core.C1T.A06(this.A02, ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A00);
        } else {
            com.facebook.ads.redexgen.core.EnumC03240g actionOutcome = com.facebook.ads.redexgen.core.EnumC03240g.A08;
            if (enumC03240gA0G != actionOutcome && this.A00 != null) {
                java.lang.String str = this.A03.get(A04(126, 12, 5));
                if (A04(276, 9, 93) == str) {
                    this.A00.A0C(str, this.A02, ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A02);
                } else {
                    this.A00.A0D(str, this.A02, ((com.facebook.ads.redexgen.core.AbstractC03250h) this).A02);
                }
            }
        }
        return enumC03240gA0G;
    }

    public final com.facebook.ads.redexgen.core.EnumC03240g A0G() {
        com.facebook.ads.redexgen.core.EnumC03240g enumC03240gA03 = com.facebook.ads.redexgen.core.EnumC03240g.A09;
        java.lang.String strA04 = A04(org.objectweb.asm.Opcodes.IF_ICMPNE, 15, 59);
        boolean zA0F = A0F(this.A01);
        if (!zA0F) {
            zA0F = A08();
        }
        if (!zA0F) {
            try {
                enumC03240gA03 = A03();
                if (enumC03240gA03 != com.facebook.ads.redexgen.core.EnumC03240g.A09) {
                    strA04 = A04(200, 16, 61);
                } else {
                    strA04 = A04(org.objectweb.asm.Opcodes.DRETURN, 25, 61);
                }
            } catch (java.lang.Exception unused) {
                enumC03240gA03 = com.facebook.ads.redexgen.core.EnumC03240g.A04;
            }
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.A03;
        java.lang.String redirectionAction = java.lang.String.valueOf(true);
        map.put(strA04, redirectionAction);
        return enumC03240gA03;
    }

    public final void A0H(com.facebook.ads.redexgen.core.LL ll) {
        this.A00 = ll;
    }
}

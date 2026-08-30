package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZH implements com.facebook.ads.redexgen.core.J5 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"nSyQhtMfpq2jNqGGNPt5NI90oeOfe1", "vvfyUHTPPgzLU9ZJhsHsRroWK12HyjVH", "qslzdaLavUZ6hWrKlj1Zt3UP1k3mmB4y", "NIvb6IKYOgsNqkR8AWNkoYQGWWwuN", "c4tQ8NQ91n2uUc9nTvHWxfXCnHLpYFgI", "tMmd9elNu7YQkbRY7XCik1QBLE", "7gl4a25pOcE06E3aPI2wtSqogJ", "FAOoLRBR29CEN05oKXcOTgWFdOs"};
    public static final java.lang.String A04;
    public com.facebook.ads.redexgen.core.C1198Zr A00;
    public com.facebook.ads.redexgen.core.ZI A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{60, 122, 115, 110, 60, 121, 106, 121, 114, 104, 85, 120, 60, 87, 4, 2, 20, 20, 18, 4, 4, 17, 2, 27, 27, 14, 89, 18, 47, 14, 7, 14, 31, 14, 15, 75, 14, 29, 14, 5, 31, 24, 75, 14, 19, 8, 14, 14, 15, 14, 15, 75, 25, 14, 31, 25, 18, 75, 7, 2, 6, 2, 31, 69, 75, 40, 4, 30, 5, 31, 81, 75, 44, 11, 3, 6, 15, 14, 74, 30, 5, 74, 26, 11, 24, 25, 15, 74, 11, 4, 74, 15, 28, 15, 4, 30, 74, 3, 4, 74, 15, 28, 15, 4, 30, 25, 74, 11, 24, 24, 11, 19, 74, 12, 5, 24, 74, 14, 3, 25, 26, 11, 30, 9, 2, 74, 12, 11, 3, 6, 31, 24, 15, 68, 88, 127, 119, 114, 123, 122, 62, 106, 113, 62, 110, 127, 108, 109, 123, 62, 127, 112, 62, 123, 104, 123, 112, 106, 62, 119, 112, 62, 123, 104, 123, 112, 106, 109, 62, 114, 119, 109, 106, 62, 105, 118, 123, 112, 62, 110, 108, 123, 110, 127, 108, 119, 112, 121, 62, 122, 119, 109, 110, 127, 106, 125, 118, 62, 110, 127, 103, 114, 113, 127, 122, 48, 26, 44, 59, okio.Utf8.REPLACEMENT_BYTE, 44, 59, 105, 57, 59, 38, 42, 44, 58, 58, 44, 45, 105, 44, okio.Utf8.REPLACEMENT_BYTE, 44, 39, kotlin.io.encoding.Base64.padSymbol, 0, 45, 105, 20, 34, 53, 49, 34, 53, 103, 53, 34, 51, 50, 53, 41, 34, 35, 103, 41, 40, 41, 106, 53, 34, 51, 53, 62, 38, 37, 43, 34, 103, 34, 53, 53, 40, 53, 103, 36, 40, 35, 34, 103, 109, 91, 76, 72, 91, 76, 30, 76, 91, 74, 75, 76, 80, 91, 90, 30, 76, 91, 74, 76, 71, 95, 92, 82, 91, 30, 91, 76, 76, 81, 76, 30, 93, 81, 90, 91, 30, 25, 34, 45, 46, 32, 41, 108, 56, 35, 108, 60, 45, 62, okio.Utf8.REPLACEMENT_BYTE, 41, 108, okio.Utf8.REPLACEMENT_BYTE, 41, 62, 58, 41, 62, 108, 62, 41, okio.Utf8.REPLACEMENT_BYTE, 60, 35, 34, okio.Utf8.REPLACEMENT_BYTE, 41, 108, 45, 56, 108, 60, 35, okio.Utf8.REPLACEMENT_BYTE, 37, 56, 37, 35, 34, 108, 29, 17, 26, 27, 94, 77, 94, 85, 79, 72, 7, 4, 0, 21, 20, 19, 4, 76, 2, 14, 15, 7, 8, 6, 76, 4, 23, 4, 15, 21, 76, 12, 0, 6, 8, 2, 39, 36, 32, 53, 52, 51, 36, 30, 34, 46, 47, 39, 40, 38, 23, 26, 116, 99, 101, 105, 116, 98, 89, 98, 103, 114, 103, 100, 103, 117, 99, 73, 82, 86, 88, 83, 22, 13, 9, 7, 12, kotlin.io.encoding.Base64.padSymbol, 11, 6, 74, 81, 85, 91, 80, 77};
    }

    static {
        A01();
        A04 = com.facebook.ads.redexgen.core.ZH.class.getSimpleName();
    }

    public ZH(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.ZI zi) {
        this.A00 = c1198Zr;
        this.A01 = zi;
    }

    private void A02(java.util.Set<java.lang.String> eventsToRetry, java.util.Set<java.lang.String> eventsToDelete) {
        int iA0B = this.A01.A0B(com.facebook.ads.redexgen.core.Io.A0G(this.A00), eventsToRetry, eventsToDelete);
        if (iA0B > 0) {
            this.A00.A07().AA0(A00(405, 15, 38), com.facebook.ads.redexgen.core.C8E.A10, new com.facebook.ads.redexgen.core.C8F(A00(28, 44, 75) + iA0B));
        }
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final org.json.JSONObject A4w() {
        int iA08;
        org.json.JSONArray jSONArrayA04;
        int iA0F = com.facebook.ads.redexgen.core.Io.A0F(this.A00);
        java.util.List<org.json.JSONObject> listA0C = this.A01.A0C(iA0F);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (org.json.JSONObject jSONObject2 : listA0C) {
            try {
                java.lang.String strOptString = jSONObject2.optString(A00(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, 5, 29));
                java.lang.String string = java.util.UUID.randomUUID().toString();
                jSONObject.put(string, strOptString);
                jSONObject2.put(A00(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 8, 66), string);
            } catch (org.json.JSONException e) {
                if (this.A00.A04().A9O()) {
                    android.util.Log.e(A04, A00(134, 72, 62), e);
                }
            }
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) listA0C);
        if (com.facebook.ads.redexgen.core.Io.A0P(this.A00) && (jSONArrayA04 = com.facebook.ads.redexgen.core.C8G.A04(this.A00, (iA08 = com.facebook.ads.redexgen.core.Io.A08(this.A00)))) != null) {
            int eventLimit = jSONArrayA04.length();
            if (eventLimit > 0) {
                jSONArray = com.facebook.ads.redexgen.core.WU.A02(this.A00, jSONArrayA04, jSONArray, iA0F + iA08);
            }
        }
        org.json.JSONObject jSONObject3 = null;
        try {
            int eventLimit2 = jSONArray.length();
            if (eventLimit2 > 0) {
                jSONObject3 = new org.json.JSONObject();
                int eventLimit3 = jSONObject.length();
                if (eventLimit3 > 0) {
                    jSONObject3.put(A00(433, 6, 30), jSONObject);
                }
                jSONObject3.put(A00(357, 6, 27), jSONArray);
            }
            return jSONObject3;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final boolean A9Z() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final void AB8() {
        com.facebook.ads.redexgen.core.C8G.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final void ABj(org.json.JSONArray jSONArray) {
        int length = jSONArray.length();
        java.util.HashSet hashSet = new java.util.HashSet(length);
        for (int i = 0; i < length; i++) {
            try {
                org.json.JSONObject eventJson = jSONArray.getJSONObject(i);
                java.lang.String string = eventJson.getString(A00(403, 2, 94));
                if (com.facebook.ads.redexgen.core.C8G.A0I(string)) {
                    com.facebook.ads.redexgen.core.C8G.A0B(this.A00, string);
                } else {
                    hashSet.add(string);
                }
            } catch (org.json.JSONException e) {
                if (this.A00.A04().A9O()) {
                    java.lang.String eventId = A04;
                    java.lang.String strA00 = A00(72, 62, 74);
                    if (A03[2].charAt(27) != 'm') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A03;
                    strArr[6] = "wUavWABsdMwqX86gv8aQq4NsYa";
                    strArr[5] = "TgLwFV200Sew2OuM724xEw99Fl";
                    android.util.Log.e(eventId, strA00, e);
                } else {
                    continue;
                }
            }
        }
        A02(hashSet, new java.util.HashSet());
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final boolean ABk(org.json.JSONArray jSONArray) {
        java.lang.String strA00 = A00(27, 1, 28);
        boolean z = true;
        boolean zA0P = com.facebook.ads.redexgen.core.Io.A0P(this.A00);
        java.util.Set<java.lang.String> eventsToDelete = new java.util.HashSet<>();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                java.lang.String string = jSONObject.getString(A00(403, 2, 94));
                if (A00(363, 26, 65).equals(string)) {
                    com.facebook.ads.redexgen.core.C0762Im.A0T(this.A00).A2t(jSONObject.getString(A00(389, 14, 97)));
                    this.A00.A03().AAl();
                } else {
                    int i2 = jSONObject.getInt(A00(353, 4, 94));
                    if (i2 == 1) {
                        if (this.A00.A04().A9O()) {
                            java.lang.String str = A00(com.ironsource.g3.c.b.INSTANCE_NOT_FOUND_IN_LOAD, 25, 105) + string + A00(13, 14, 87);
                        }
                        if (zA0P) {
                            com.facebook.ads.redexgen.core.C8G.A0D(string);
                        }
                        eventsToDelete.add(string);
                    } else {
                        java.lang.String strA01 = A00(0, 13, 60);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (this.A00.A04().A9O()) {
                                android.util.Log.e(A04, A00(272, 37, 30) + i2 + strA01 + string + strA00);
                            }
                            if (com.facebook.ads.redexgen.core.C8G.A0I(string)) {
                                com.facebook.ads.redexgen.core.C8G.A0B(this.A00, string);
                            } else {
                                hashSet.add(string);
                            }
                            z = false;
                        } else if (i2 >= 2000 && i2 < 3000) {
                            if (this.A00.A04().A9O()) {
                                android.util.Log.e(A04, A00(231, 41, 103) + i2 + strA01 + string + strA00);
                            }
                            eventsToDelete.add(string);
                            if (zA0P) {
                                com.facebook.ads.redexgen.core.C8G.A0D(string);
                            }
                        }
                    }
                }
            } catch (org.json.JSONException e) {
                if (this.A00.A04().A9O()) {
                    java.lang.String eventId = A04;
                    android.util.Log.e(eventId, A00(309, 44, 108) + i + strA00, e);
                }
                z = false;
            }
        }
        A02(hashSet, eventsToDelete);
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final void ADH() {
        this.A01.A4f();
        com.facebook.ads.redexgen.core.C8G.A07(this.A00);
    }
}

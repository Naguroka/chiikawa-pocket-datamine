package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WU implements com.facebook.ads.redexgen.core.J5 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"PqRb8CfCWHA5EhrxcZ9mRPllTh3oOSUW", "Zl9oGp2Iez0jLvuEYbnxsntptMxGBM4l", "l9LBk", "jZa6p3ci91eTCo5R2EOP7xEtghieA3uB", "FSDG0GiI6cZANIzlwvsJdjGaYqMqroq5", "1sDItVUeKrx9RbYz", "1qorAXgeX39shBtffGMCszMJDt6RFPN7", "u6hSYDgbJvcFisLakSyhfwTjAFON3iEs"};
    public static final java.lang.String A04;
    public com.facebook.ads.redexgen.core.C1198Zr A00;
    public com.facebook.ads.redexgen.core.ZM A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 3);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{85, -101, -92, -89, 85, -102, -85, -102, -93, -87, 126, -103, 85, -127, -44, -42, -60, -60, -58, -44, -44, -57, -42, -51, -51, -38, -113, 97, -123, -90, -83, -90, -75, -90, -91, 97, -90, -73, -90, -81, -75, -76, 97, -90, -71, -92, -90, -90, -91, -90, -91, 97, -77, -90, -75, -77, -70, 97, -83, -86, -82, -86, -75, 111, 97, -124, -80, -74, -81, -75, 123, 97, -80, -31, -48, -39, -33, -117, -33, -28, -37, -48, -117, -37, -35, -38, -50, -48, -34, -34, -48, -49, -117, -51, -28, -117, -33, -45, -48, -117, -34, -48, -35, -31, -48, -35, -91, -117, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, -39, -54, -37, -36, -50, -119, -54, -41, -119, -50, -33, -50, -41, -35, -119, -46, -41, -119, -50, -33, -50, -41, -35, -36, -119, -54, -37, -37, -54, -30, -119, -49, -40, -37, -119, -51, -46, -36, -39, -54, -35, -52, -47, -119, -49, -54, -46, -43, -34, -37, -50, -105, -102, -84, -71, -67, -84, -71, 103, -73, -71, -74, -86, -84, -70, -70, -84, -85, 103, -84, -67, -84, -75, -69, -112, -85, 103, -67, -49, -36, -32, -49, -36, -118, -36, -49, -34, -33, -36, -40, -49, -50, -118, -40, -39, -40, -105, -36, -49, -34, -36, -29, -53, -52, -42, -49, -118, -49, -36, -36, -39, -36, -118, -51, -39, -50, -49, -118, -101, -83, -70, -66, -83, -70, 104, -70, -83, -68, -67, -70, -74, -83, -84, 104, -70, -83, -68, -70, -63, -87, -86, -76, -83, 104, -83, -70, -70, -73, -70, 104, -85, -73, -84, -83, 104, -61, -36, -49, -48, -38, -45, -114, -30, -35, -114, -34, -49, -32, -31, -45, -114, -46, -45, -48, -29, -43, -70, -35, -43, -77, -28, -45, -36, -30, -114, -49, -30, -114, -82, -57, -70, -69, -59, -66, 121, -51, -56, 121, -55, -70, -53, -52, -66, 121, -66, -49, -66, -57, -51, 121, -70, -51, 121, 102, 127, 114, 115, 125, 118, 49, -123, -128, 49, -127, 114, -125, -124, 118, 49, -124, 118, -125, -121, 118, -125, 49, -125, 118, -124, -127, -128, 127, -124, 118, 49, 114, -123, 49, -127, -128, -124, 122, -123, 122, -128, 127, 49, -34, -22, -33, -32, -116, -119, -100, -119, -118, -119, -101, -115, -105, -88, -105, -96, -90, -91, -112, -113, -117, -98, -97, -100, -113, 87, -115, -103, -104, -112, -109, -111, 87, -113, -96, -113, -104, -98, 87, -105, -117, -111, -109, -115, 121, 120, 116, -121, -120, -123, 120, 114, 118, -126, -127, 121, 124, 122, 123, 118, -82, -93, -89, -97, 121, 116, 112, 106, 115, 120};
    }

    static {
        A05();
        A04 = com.facebook.ads.redexgen.core.WU.class.getSimpleName();
    }

    public WU(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.ZM zm) {
        this.A00 = c1198Zr;
        this.A01 = zm;
    }

    public static org.json.JSONArray A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        int i = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i += limit2;
        }
        return A02(c1198Zr, jSONArray, jSONArray2, i);
    }

    public static org.json.JSONArray A02(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, int i) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int eventsIdx = jSONArray2.length();
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        int limit = 0;
        int i2 = 0;
        org.json.JSONObject jSONObject = null;
        org.json.JSONObject jSONObject2 = null;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        while (true) {
            if ((limit >= length && i2 >= eventsIdx) || i <= 0) {
                break;
            }
            java.lang.String strA00 = A00(435, 4, 55);
            if (limit < length && jSONObject == null) {
                try {
                    jSONObject = jSONArray.getJSONObject(limit);
                    d = jSONObject.getDouble(strA00);
                } catch (org.json.JSONException e) {
                    if (c1198Zr.A04().A9O()) {
                        android.util.Log.e(A04, A00(273, 33, 107) + limit, e);
                    }
                    jSONObject = null;
                    d = Double.MAX_VALUE;
                }
                limit++;
            }
            if (i2 < eventsIdx && jSONObject2 == null) {
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i2);
                    d2 = jSONObject2.getDouble(strA00);
                } catch (org.json.JSONException e2) {
                    if (c1198Zr.A04().A9O()) {
                        android.util.Log.e(A04, A00(306, 25, 86) + i2, e2);
                    }
                    jSONObject2 = null;
                    java.lang.String[] strArr = A03;
                    if (strArr[6].charAt(2) == strArr[1].charAt(2)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A03;
                    strArr2[4] = "Ao7e4H6oauVu5gaKSpxLNRSSjr9efZyc";
                    strArr2[7] = "dweSflIkmec9RBGwLpK3xpB3h9wbJjrg";
                    d2 = Double.MAX_VALUE;
                }
                i2++;
            }
            if (jSONObject != null || jSONObject2 != null) {
                if (jSONObject == null || d2 < d) {
                    jSONArray3.put(jSONObject2);
                    jSONObject2 = null;
                    d2 = Double.MAX_VALUE;
                } else {
                    jSONArray3.put(jSONObject);
                    jSONObject = null;
                    d = Double.MAX_VALUE;
                }
                i--;
            }
        }
        if (i > 0) {
            if (jSONObject != null) {
                jSONArray3.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray3.put(jSONObject2);
            }
        }
        return jSONArray3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[Catch: JSONException -> 0x008b, TryCatch #0 {JSONException -> 0x008b, blocks: (B:19:0x006c, B:21:0x0073, B:22:0x007e), top: B:26:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private org.json.JSONObject A03() {
        org.json.JSONArray jSONArrayA03;
        org.json.JSONObject jSONObjectA6N = this.A01.A6N();
        org.json.JSONArray jSONArrayA6M = this.A01.A6M();
        if (com.facebook.ads.redexgen.core.Io.A0P(this.A00) && (jSONArrayA03 = com.facebook.ads.redexgen.core.C8G.A03(this.A00)) != null && jSONArrayA03.length() > 0) {
            com.facebook.ads.redexgen.core.C1198Zr c1198Zr = this.A00;
            if (A03[2].length() != 5) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[4] = "qUVNbNwZZvYyuSz0SsvSYTyRsw3xu0Du";
            strArr[7] = "WlKgM87vtUujDuDqlOM5717cU9PyRF7c";
            jSONArrayA6M = A01(c1198Zr, jSONArrayA03, jSONArrayA6M);
        }
        org.json.JSONObject jSONObject = null;
        java.lang.String[] strArr2 = A03;
        if (strArr2[4].charAt(22) != strArr2[7].charAt(22)) {
            java.lang.String[] strArr3 = A03;
            strArr3[4] = "QvYFeqMEyu4I6p0dgxwwBO2xjkm9NvyV";
            strArr3[7] = "HjcWCrOu2PXb4iuKPAXMC032aGUytbXM";
            if (jSONArrayA6M != null) {
                try {
                    jSONObject = new org.json.JSONObject();
                    if (jSONObjectA6N != null) {
                        jSONObject.put(A00(439, 6, 2), jSONObjectA6N);
                    }
                    jSONObject.put(A00(387, 6, 47), jSONArrayA6M);
                } catch (org.json.JSONException unused) {
                    return null;
                }
            }
        } else if (jSONArrayA6M != null) {
            jSONObject = new org.json.JSONObject();
            if (jSONObjectA6N != null) {
                jSONObject.put(A00(439, 6, 2), jSONObjectA6N);
            }
            jSONObject.put(A00(387, 6, 47), jSONArrayA6M);
        }
        return jSONObject;
    }

    private org.json.JSONObject A04(int i) {
        int iA08;
        org.json.JSONArray jSONArrayA04;
        android.util.Pair<org.json.JSONObject, org.json.JSONArray> tokensAndEvents = this.A01.A8X(i);
        org.json.JSONObject jSONObject = (org.json.JSONObject) tokensAndEvents.first;
        org.json.JSONArray jSONArrayA02 = (org.json.JSONArray) tokensAndEvents.second;
        if (com.facebook.ads.redexgen.core.Io.A0P(this.A00) && (jSONArrayA04 = com.facebook.ads.redexgen.core.C8G.A04(this.A00, (iA08 = com.facebook.ads.redexgen.core.Io.A08(this.A00)))) != null && jSONArrayA04.length() > 0) {
            jSONArrayA02 = A02(this.A00, jSONArrayA04, jSONArrayA02, i + iA08);
        }
        org.json.JSONObject jSONObject2 = null;
        java.lang.String[] strArr = A03;
        if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[0] = "feKb1r4kRW7gDKlD5BEzQjo0jh9TPYxK";
        strArr2[3] = "s9YNb4XbEbjpB7B5leG71QtixhMBVNOA";
        if (jSONArrayA02 != null) {
            try {
                jSONObject2 = new org.json.JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put(A00(439, 6, 2), jSONObject);
                }
                jSONObject2.put(A00(387, 6, 47), jSONArrayA02);
            } catch (org.json.JSONException unused) {
                return null;
            }
        }
        return jSONObject2;
    }

    private void A06(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C8G.A0I(str)) {
            com.facebook.ads.redexgen.core.C1198Zr c1198Zr = this.A00;
            java.lang.String[] strArr = A03;
            if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            A03[2] = "U9Gor";
            com.facebook.ads.redexgen.core.C8G.A0B(c1198Zr, str);
            return;
        }
        this.A01.A9B(str);
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final org.json.JSONObject A4w() {
        int eventLimit = com.facebook.ads.redexgen.core.Io.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final boolean A9Z() {
        int eventCount = com.facebook.ads.redexgen.core.Io.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int iA7N = this.A01.A7N();
        int eventLimit = com.facebook.ads.redexgen.core.C8G.A00(this.A00);
        return iA7N + eventLimit > eventCount;
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final void AB8() {
        int iA4e = this.A01.A4e(com.facebook.ads.redexgen.core.Io.A0G(this.A00));
        if (iA4e > 0) {
            this.A00.A07().AA0(A00(379, 8, 37), com.facebook.ads.redexgen.core.C8E.A10, new com.facebook.ads.redexgen.core.C8F(A00(28, 44, 62) + iA4e));
        }
        com.facebook.ads.redexgen.core.C8G.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final void ABj(org.json.JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                A06(jSONArray.getJSONObject(i).getString(A00(433, 2, 15)));
            } catch (org.json.JSONException e) {
                if (this.A00.A04().A9O()) {
                    java.lang.String eventId = A04;
                    android.util.Log.e(eventId, A00(108, 62, 102), e);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x015a A[Catch: JSONException -> 0x01a0, TRY_ENTER, TryCatch #0 {JSONException -> 0x01a0, blocks: (B:5:0x0017, B:7:0x0038, B:8:0x005a, B:10:0x006a, B:12:0x0076, B:14:0x00a6, B:15:0x00c0, B:18:0x00ca, B:24:0x00ff, B:26:0x010b, B:27:0x0137, B:35:0x015a, B:37:0x0166, B:38:0x0192, B:41:0x019c), top: B:51:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0166 A[Catch: JSONException -> 0x01a0, TryCatch #0 {JSONException -> 0x01a0, blocks: (B:5:0x0017, B:7:0x0038, B:8:0x005a, B:10:0x006a, B:12:0x0076, B:14:0x00a6, B:15:0x00c0, B:18:0x00ca, B:24:0x00ff, B:26:0x010b, B:27:0x0137, B:35:0x015a, B:37:0x0166, B:38:0x0192, B:41:0x019c), top: B:51:0x0017 }] */
    @Override // com.facebook.ads.redexgen.core.J5
    public final boolean ABk(org.json.JSONArray jSONArray) {
        java.lang.String strA00 = A00(27, 1, 48);
        boolean z = true;
        boolean zA0P = com.facebook.ads.redexgen.core.Io.A0P(this.A00);
        for (int errorCode = 0; errorCode < jSONArray.length(); errorCode++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(errorCode);
                java.lang.String eventId = jSONObject.getString(A00(433, 2, 15));
                if (A00(393, 26, 39).equals(eventId)) {
                    com.facebook.ads.redexgen.core.C0762Im.A0T(this.A00).A2t(jSONObject.getString(A00(419, 14, 16)));
                    this.A00.A03().AAl();
                } else {
                    int i = jSONObject.getInt(A00(375, 4, 120));
                    if (i == 1) {
                        if (this.A00.A04().A9O()) {
                            java.lang.String str = A00(org.objectweb.asm.Opcodes.TABLESWITCH, 25, 68) + eventId + A00(13, 14, 94);
                            java.lang.String strA7Q = this.A01.A7Q(eventId);
                            if (strA7Q != null) {
                                java.lang.String str2 = A00(72, 36, 104) + strA7Q;
                            }
                        }
                        if (!this.A01.A5P(eventId) && zA0P) {
                            com.facebook.ads.redexgen.core.C8G.A0D(eventId);
                        }
                    } else {
                        java.lang.String[] strArr = A03;
                        if (strArr[6].charAt(2) == strArr[1].charAt(2)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A03;
                        strArr2[6] = "1LE9O0SwhMhMXUh2JQEpQ81OBnaONLaF";
                        strArr2[1] = "qI9w2PtHmRHMr9aKEOtTY0DScCfNQmEA";
                        java.lang.String strA01 = A00(0, 13, 50);
                        if (i >= 1000 && i < 2000) {
                            if (this.A00.A04().A9O()) {
                                android.util.Log.e(A04, A00(236, 37, 69) + i + strA01 + eventId + strA00);
                            }
                            A06(eventId);
                            z = false;
                        } else if (i >= 2000) {
                            if (A03[5].length() == 16) {
                                A03[5] = "Te73kS0enGf3eAU6";
                                if (i < 3000) {
                                    if (this.A00.A04().A9O()) {
                                        android.util.Log.e(A04, A00(org.objectweb.asm.Opcodes.MONITOREXIT, 41, 103) + i + strA01 + eventId + strA00);
                                    }
                                    if (this.A01.A5P(eventId)) {
                                    }
                                }
                            } else if (i < 3000) {
                                if (this.A00.A04().A9O()) {
                                    android.util.Log.e(A04, A00(org.objectweb.asm.Opcodes.MONITOREXIT, 41, 103) + i + strA01 + eventId + strA00);
                                }
                                if (this.A01.A5P(eventId) && zA0P) {
                                    com.facebook.ads.redexgen.core.C8G.A0D(eventId);
                                }
                            }
                        }
                    }
                }
            } catch (org.json.JSONException e) {
                if (this.A00.A04().A9O()) {
                    android.util.Log.e(A04, A00(331, 44, 14) + errorCode + strA00, e);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.J5
    public final void ADH() {
        this.A01.A4f();
        com.facebook.ads.redexgen.core.C8G.A07(this.A00);
    }
}

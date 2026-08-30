package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0667Ef implements com.facebook.ads.redexgen.core.ZM {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"u3ex4KQMIW041lf", "3AptpGjhH", "gmUldlaQs1iDW8SjyulR1SveXx4W0WHx", "1qDQcvNZxrP96rda7KCur1LyuVNWU8kp", "CAWPS90lsy", "t8qLCZBFlDEhGKoHyGYF6SljofbMSV", "olmaGtOYwcY5nta5it0d5AQEWYClhN", "QuuHkAQHaV7iF"};
    public boolean A00 = true;
    public final com.facebook.ads.redexgen.core.C1198Zr A01;
    public final com.facebook.ads.redexgen.core.C05067s A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 64);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-37, -7, 6, -65, 12, -72, -4, -3, 4, -3, 12, -3, -72, -7, 12, 12, -3, 5, 8, 12, 11, -72, -3, 16, -5, -3, -3, -4, -3, -4, -72, -3, 14, -3, 6, 12, 11, -58, -87, -84, -66, -79, -84, -1, 18, 18, 3, 11, 14, 18, 8, 5, 24, 5, -75, -80, -33, -47, -33, -33, -43, -37, -38, -53, -43, -48, -51, -65, -51, -51, -61, -55, -56, -71, -50, -61, -57, -65, 18, 7, 11, 3, 3, -2, -6, -12, -3, -18, -8, -13, -18, -13, -22, -33};
    }

    static {
        A04();
    }

    public C0667Ef(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A01 = c1198Zr;
        this.A02 = new com.facebook.ads.redexgen.core.C05067s(c1198Zr);
    }

    private org.json.JSONArray A01(android.database.Cursor cursor) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(54, 2, 12), cursor.getString(com.facebook.ads.redexgen.core.C1197Zq.A04.A00));
            jSONObject.put(A00(82, 8, 79), cursor.getString(com.facebook.ads.redexgen.core.C1197Zq.A09.A00));
            jSONObject.put(A00(90, 4, 58), cursor.getString(com.facebook.ads.redexgen.core.C1197Zq.A0A.A00));
            jSONObject.put(A00(78, 4, 94), com.facebook.ads.redexgen.core.C0841Lu.A02(cursor.getDouble(com.facebook.ads.redexgen.core.C1197Zq.A08.A00)));
            jSONObject.put(A00(66, 12, 26), com.facebook.ads.redexgen.core.C0841Lu.A02(cursor.getDouble(com.facebook.ads.redexgen.core.C1197Zq.A07.A00)));
            jSONObject.put(A00(56, 10, 44), cursor.getString(com.facebook.ads.redexgen.core.C1197Zq.A06.A00));
            java.lang.String string = cursor.getString(com.facebook.ads.redexgen.core.C1197Zq.A03.A00);
            jSONObject.put(A00(50, 4, 100), string != null ? new org.json.JSONObject(string) : new org.json.JSONObject());
            jSONObject.put(A00(43, 7, 94), cursor.getString(com.facebook.ads.redexgen.core.C1197Zq.A02.A00));
            jSONObject.put(A00(38, 5, 8), this.A01.A03().A7f());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private org.json.JSONArray A02(android.database.Cursor cursor) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(54, 2, 12), cursor.getString(2));
            jSONObject.put(A00(82, 8, 79), cursor.getString(0));
            jSONObject.put(A00(90, 4, 58), cursor.getString(4));
            jSONObject.put(A00(78, 4, 94), com.facebook.ads.redexgen.core.C0841Lu.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 26), com.facebook.ads.redexgen.core.C0841Lu.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 44), cursor.getString(7));
            java.lang.String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 100), string != null ? new org.json.JSONObject(string) : new org.json.JSONObject());
            jSONObject.put(A00(43, 7, 94), cursor.getString(9));
            jSONObject.put(A00(38, 5, 8), this.A01.A03().A7f());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static org.json.JSONObject A03(android.database.Cursor cursor) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        while (cursor.moveToNext()) {
            jSONObject.put(cursor.getString(com.facebook.ads.redexgen.core.C1196Zp.A03.A00), cursor.getString(com.facebook.ads.redexgen.core.C1196Zp.A02.A00));
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final int A4e(int i) {
        int iA08 = 0;
        if (i > -1) {
            try {
                iA08 = this.A02.A08(i);
            } catch (java.lang.Exception e) {
                if (this.A01.A04().A9O()) {
                    android.util.Log.e(com.facebook.ads.redexgen.core.ZM.A00, A00(0, 38, 88), e);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return iA08;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass91
    public final void A4f() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final boolean A5P(java.lang.String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final org.json.JSONArray A6M() {
        android.database.Cursor cursorA0A = null;
        try {
            cursorA0A = this.A02.A0A();
            org.json.JSONArray jSONArrayA01 = null;
            if (cursorA0A.getCount() > 0) {
                jSONArrayA01 = A01(cursorA0A);
            }
            return jSONArrayA01;
        } catch (org.json.JSONException unused) {
        } finally {
            if (cursorA0A != null) {
                cursorA0A.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final org.json.JSONObject A6N() {
        android.database.Cursor cursorA0B = null;
        try {
            cursorA0B = this.A02.A0B();
            org.json.JSONObject jSONObjectA03 = null;
            if (cursorA0B.getCount() > 0) {
                jSONObjectA03 = A03(cursorA0B);
            }
            return jSONObjectA03;
        } catch (org.json.JSONException unused) {
        } finally {
            if (cursorA0B != null) {
                cursorA0B.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final int A7N() {
        android.database.Cursor cursorA09 = null;
        try {
            cursorA09 = this.A02.A09();
            return cursorA09.moveToFirst() ? cursorA09.getInt(0) : 0;
        } finally {
            if (cursorA09 != null) {
                cursorA09.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final java.lang.String A7Q(java.lang.String str) {
        java.lang.String string = null;
        android.database.Cursor cursorA0D = this.A02.A0D(str);
        if (cursorA0D != null) {
            boolean zMoveToNext = cursorA0D.moveToNext();
            java.lang.String[] strArr = A04;
            java.lang.String str2 = strArr[4];
            java.lang.String eventType = strArr[0];
            if (str2.length() == eventType.length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[4] = "rCLG4kGmKo";
            strArr2[0] = "2rihfjjJxsL3teC";
            if (zMoveToNext && cursorA0D.getCount() > 0) {
                java.lang.String eventType2 = com.facebook.ads.redexgen.core.C1197Zq.A0A.A01;
                string = cursorA0D.getString(cursorA0D.getColumnIndex(eventType2));
            }
            cursorA0D.close();
        }
        return string;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final android.util.Pair<org.json.JSONObject, org.json.JSONArray> A8X(int i) {
        android.database.Cursor cursorA0C = null;
        try {
            cursorA0C = this.A02.A0C(i);
            org.json.JSONArray events = null;
            org.json.JSONObject tokens = null;
            if (cursorA0C.getCount() > 0) {
                tokens = A03(cursorA0C);
                events = A02(cursorA0C);
            }
            return new android.util.Pair<>(tokens, events);
        } catch (org.json.JSONException unused) {
            return new android.util.Pair<>(null, null);
        } finally {
            if (cursorA0C != null) {
                cursorA0C.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass90
    public final boolean A9B(java.lang.String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass91
    public final void AHh(com.facebook.ads.redexgen.core.J4 j4, com.facebook.ads.redexgen.core.AbstractC05358y<java.lang.String> abstractC05358y) {
        this.A02.A0G(j4.A08(), j4.A05().A00, j4.A06().toString(), j4.A04(), j4.A03(), j4.A07(), j4.A09(), abstractC05358y);
    }
}

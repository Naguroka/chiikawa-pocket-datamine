package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0937Pm {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0926Pb> A00;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.U9> A01 = new java.lang.ref.WeakReference<>(null);
    public boolean A02 = false;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.PO A04;
    public final java.lang.String A05;
    public final java.lang.String A06;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.J7> A07;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 12);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, 127, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new java.lang.RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C0937Pm(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C0926Pb c0926Pb, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.PO po, java.lang.String str, java.lang.String str2) {
        this.A03 = c1199Zs;
        this.A00 = new java.lang.ref.WeakReference<>(c0926Pb);
        this.A07 = new java.lang.ref.WeakReference<>(j7);
        this.A04 = po;
        this.A05 = str;
        this.A06 = str2;
    }

    public static java.util.Map<java.lang.String, java.lang.String> A03(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        java.util.HashMap map = new java.util.HashMap();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        com.facebook.ads.redexgen.core.U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        com.facebook.ads.redexgen.core.U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8v();
    }

    private void A06() {
        com.facebook.ads.redexgen.core.U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9j();
    }

    private void A07() {
        this.A03.A0E().A5b();
        this.A02 = true;
        com.facebook.ads.redexgen.core.U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AGz();
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A03)) {
            this.A03.A0A().ABh();
        }
    }

    private void A08() {
        com.facebook.ads.redexgen.core.U9 uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AC2();
    }

    private void A0A(com.facebook.ads.redexgen.core.C0926Pb c0926Pb, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        android.content.SharedPreferences sharedPreferencesA00 = com.facebook.ads.redexgen.core.KJ.A00(this.A03);
        java.lang.String strA01 = A01(57, 5, 77);
        java.lang.String strA02 = A01(0, 0, 53);
        java.lang.String storageValue = jSONObject.optString(strA01, strA02);
        java.lang.String key = jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34));
        java.lang.String string = sharedPreferencesA00.getString(A01(14, 4, 0) + key, strA02);
        if (string != null) {
            strA02 = string;
        }
        c0926Pb.A0g(storageValue, strA02);
    }

    private void A0B(com.facebook.ads.redexgen.core.C0926Pb c0926Pb, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strA01 = A01(98, 5, 42);
        java.lang.String strA02 = A01(0, 0, 53);
        java.lang.String strOptString = jSONObject.optString(strA01, strA02);
        java.lang.String strOptString2 = jSONObject.optString(A01(57, 5, 77), strA02);
        com.facebook.ads.redexgen.core.KJ.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), strOptString).apply();
        c0926Pb.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:6:0x0015 A[RETURN] */
    public void A0C(com.facebook.ads.redexgen.core.EnumC0935Pk enumC0935Pk, java.lang.String str) throws org.json.JSONException {
        com.facebook.ads.redexgen.core.C0926Pb c0926Pb;
        switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
            case 1:
                A0I(new org.json.JSONObject(str));
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 2:
                A06();
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 3:
                A04();
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 4:
                A07();
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 5:
                A0K(new org.json.JSONObject(str));
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 6:
                A0L(new org.json.JSONObject(str));
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 7:
                boolean zIsDebug = com.facebook.ads.internal.api.BuildConfigApi.isDebug();
                java.lang.String[] strArr = A09;
                if (strArr[2].length() != strArr[6].length()) {
                    java.lang.String[] strArr2 = A09;
                    strArr2[7] = "ti0FJd6QzsmsCUgFEJNk2tGDtWFDX3UL";
                    strArr2[0] = "2bsL1IjRD3bcdVR1Mvy0yjSySADV0GcP";
                    if (zIsDebug) {
                    }
                    c0926Pb = this.A00.get();
                    if (c0926Pb == null) {
                        return;
                    }
                    switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                        case 19:
                            c0926Pb.A0S();
                            return;
                        case 20:
                            c0926Pb.A0R();
                            return;
                        case 21:
                            A0B(c0926Pb, str);
                            return;
                        case 22:
                            A0A(c0926Pb, str);
                            return;
                        case 23:
                            c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                            return;
                        default:
                            return;
                    }
                }
                throw new java.lang.RuntimeException();
            case 8:
                A05();
                this.A03.A0E().A5n(str);
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 9:
                this.A03.A0E().A5n(str);
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC0935Pk, str);
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 15:
                A0J(new org.json.JSONObject(str));
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 16:
                A08();
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            case 17:
                A0M(new org.json.JSONObject(str));
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
            default:
                c0926Pb = this.A00.get();
                if (c0926Pb == null) {
                    return;
                }
                switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
                    case 19:
                        c0926Pb.A0S();
                        return;
                    case 20:
                        c0926Pb.A0R();
                        return;
                    case 21:
                        A0B(c0926Pb, str);
                        return;
                    case 22:
                        A0A(c0926Pb, str);
                        return;
                    case 23:
                        c0926Pb.A0i(A03(new org.json.JSONObject(str)));
                        return;
                    default:
                        return;
                }
        }
    }

    private void A0D(com.facebook.ads.redexgen.core.EnumC0935Pk enumC0935Pk, java.lang.String str) throws org.json.JSONException {
        com.facebook.ads.redexgen.core.U9 u9 = this.A01.get();
        if (u9 == null) {
        }
        switch (com.facebook.ads.redexgen.core.C0934Pj.A00[enumC0935Pk.ordinal()]) {
            case 10:
                u9.AC6();
                break;
            case 11:
                u9.ADb();
                break;
            case 12:
                A0G(u9, str);
                break;
            case 13:
                A0F(u9, str);
                break;
            case 14:
                A0E(u9, str);
                break;
        }
    }

    private void A0E(com.facebook.ads.redexgen.core.U9 u9, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String STATE_KEY = A01(87, 5, 115);
        u9.ACm(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(com.facebook.ads.redexgen.core.U9 u9, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        u9.AE5(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(com.facebook.ads.redexgen.core.U9 u9, java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String STARTED_BY_USER_KEY = A01(74, 13, 98);
        u9.AE7(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.U9 u9 = this.A01.get();
        if (u9 == null) {
            return;
        }
        java.lang.String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (android.text.TextUtils.isEmpty(productUrl)) {
            u9.A8q();
        } else {
            u9.A8r(productUrl);
        }
    }

    private void A0J(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.J7 j7 = this.A07.get();
        if (j7 == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        java.lang.String key = jSONObject.optString(A01(43, 11, 127));
        if (android.text.TextUtils.isEmpty(key)) {
            return;
        }
        com.facebook.ads.redexgen.core.JF handler = new com.facebook.ads.redexgen.core.JF(this.A06, j7);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(org.json.JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (iOptInt == -1) {
            return;
        }
        java.lang.String message = jSONObject.optString(A01(29, 14, 56));
        if (android.text.TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9y(iOptInt, message);
        java.lang.String[] strArr = A09;
        java.lang.String message2 = strArr[2];
        java.lang.String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.U9 u9 = this.A01.get();
        if (u9 == null) {
            return;
        }
        java.lang.String strA01 = A01(92, 6, 88);
        java.lang.String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        java.lang.String strOptString = jSONObject.optString(strA01);
        if (strOptString == null) {
            return;
        }
        u9.AEK(strOptString);
    }

    public final void A0N(com.facebook.ads.redexgen.core.U9 u9) {
        this.A01 = new java.lang.ref.WeakReference<>(u9);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @android.webkit.JavascriptInterface
    public void postMessage(java.lang.String str) {
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(new com.facebook.ads.redexgen.core.RunnableC0933Pi(this, str));
    }
}

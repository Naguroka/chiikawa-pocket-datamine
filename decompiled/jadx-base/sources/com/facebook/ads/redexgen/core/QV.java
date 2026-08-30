package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QV extends android.widget.FrameLayout {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final android.widget.RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public java.util.Map<java.lang.String, java.lang.String> A02;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A03;
    public final com.facebook.ads.redexgen.core.C03441b A04;
    public final com.facebook.ads.redexgen.core.C1199Zs A05;
    public final com.facebook.ads.redexgen.core.J7 A06;
    public final com.facebook.ads.redexgen.core.O1 A07;
    public final com.facebook.ads.redexgen.core.C1070Up A08;
    public final com.facebook.ads.redexgen.core.QT A09;
    public final java.util.concurrent.atomic.AtomicBoolean A0A;
    public final java.util.concurrent.atomic.AtomicBoolean A0B;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 9);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A09() {
        java.lang.String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, 18, 32, 28, 17, 9, 17, 18, 28, 21, 49, 20, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, 127, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, 127, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, 13, 49, 60, 36, 60, okio.Utf8.REPLACEMENT_BYTE, 49, 56, 28, 57, 46, 11, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, 127, 113, 116, 121, 126, 119, 48, 98, 117, 125, 127, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, 13, 0, 24, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, kotlin.io.encoding.Base64.padSymbol, 37, 38, 40, 33, 27, 54, 33, 41, 43, 48, 33, 95, 72, 64, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A09();
        A0E = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A0F = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    public QV(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C03441b c03441b, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.QT qt, java.util.Map<java.lang.String, java.lang.String> playableMetricsData) {
        super(c1199Zs);
        this.A0A = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0B = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new com.facebook.ads.redexgen.core.AbstractC1073Us() { // from class: com.facebook.ads.redexgen.X.9Y
            @Override // com.facebook.ads.redexgen.core.O1
            public final void ABD() {
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1073Us, com.facebook.ads.redexgen.core.O1
            public final void ABx(int i, java.lang.String str) {
                this.A00.A0B.set(true);
                this.A00.A09.ACV();
            }

            @Override // com.facebook.ads.redexgen.core.O1
            public final void ACA() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true)) {
                    return;
                }
                this.A00.A09.ACA();
            }

            @Override // com.facebook.ads.redexgen.core.O1
            public final void AEC() {
                this.A00.A09.AEC();
            }
        };
        this.A05 = c1199Zs;
        this.A03 = abstractC1341cD;
        this.A04 = c03441b;
        this.A06 = j7;
        this.A09 = qt;
        this.A02 = playableMetricsData;
        this.A08 = A04();
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A05)) {
            this.A05.A0A().AHO(this.A08, this.A03.A1U(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(com.facebook.ads.redexgen.core.QV qv) {
        int i = qv.A00;
        qv.A00 = i + 1;
        return i;
    }

    private com.facebook.ads.redexgen.core.C1070Up A04() {
        com.facebook.ads.redexgen.core.C1070Up c1070Up = new com.facebook.ads.redexgen.core.C1070Up(this.A05, (java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1>) new java.lang.ref.WeakReference(this.A07), 10, com.facebook.ads.redexgen.core.C0762Im.A1y(this.A05));
        c1070Up.setCornerRadius(A0E);
        c1070Up.setLogMultipleImpressions(false);
        c1070Up.setCheckAssetsByJavascriptBridge(false);
        c1070Up.setWebViewTimeoutInMillis(this.A04.A09());
        c1070Up.setRequestId(this.A03.A0l());
        c1070Up.setOnTouchListener(new com.facebook.ads.redexgen.core.QU(this));
        android.webkit.WebSettings settings = c1070Up.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (android.os.Build.VERSION.SDK_INT > 16) {
            c1070Up.addJavascriptInterface(new com.facebook.ads.redexgen.core.QW(this.A05, this, this.A06, this.A02, this.A03.A1U()), A06(0, 12, 121));
        }
        return c1070Up;
    }

    public final void A0A() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.A01;
        com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A06(25, 67, 29));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A06(136, 6, 72), this.A00);
            jSONObject.put(A06(org.objectweb.asm.Opcodes.D2I, 5, 104), jCurrentTimeMillis);
            jSONObject.put(A06(org.objectweb.asm.Opcodes.NEW, 5, 51), this.A03.A1U());
        } catch (org.json.JSONException e) {
            android.util.Log.e(A06(92, 15, 84), A06(12, 13, 74), e);
        }
        c8f.A07(jSONObject);
        c8f.A05(1);
        com.facebook.ads.redexgen.core.C8D c8dA07 = this.A05.A07();
        int i = com.facebook.ads.redexgen.core.C8E.A2D;
        java.lang.String strA06 = A06(org.objectweb.asm.Opcodes.I2S, 8, 11);
        c8dA07.AA1(strA06, i, c8f);
        this.A00 = 0;
        if (!com.facebook.ads.redexgen.core.C0762Im.A1k(this.A05)) {
            this.A09.ABe();
            return;
        }
        if (jCurrentTimeMillis <= com.facebook.ads.redexgen.core.C0762Im.A0J(this.A05)) {
            com.facebook.ads.redexgen.core.QT qt = this.A09;
            java.lang.String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            qt.ABe();
            return;
        }
        c8f.A05(0);
        this.A05.A07().AA0(strA06, com.facebook.ads.redexgen.core.C8E.A2E, c8f);
    }

    public final void A0B() {
        java.lang.String strA0F;
        if (this.A04.A0N()) {
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A06(107, 29, 25));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(A06(org.objectweb.asm.Opcodes.TABLESWITCH, 17, 36), this.A04.A0I());
                jSONObject.put(A06(org.objectweb.asm.Opcodes.NEW, 5, 51), this.A03.A1U());
            } catch (org.json.JSONException e) {
                java.lang.String strA06 = A06(92, 15, 84);
                java.lang.String strA07 = A06(12, 13, 74);
                java.lang.String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                android.util.Log.e(strA06, strA07, e);
            }
            c8f.A07(jSONObject);
            c8f.A05(1);
            com.facebook.ads.redexgen.core.C8D c8dA07 = this.A05.A07();
            int i = com.facebook.ads.redexgen.core.C8E.A2G;
            java.lang.String strA08 = A06(155, 15, 77);
            c8dA07.AA1(strA08, i, c8f);
            if (com.facebook.ads.redexgen.core.C0762Im.A0o(this.A05) && com.facebook.ads.redexgen.core.AbstractC0839Ls.A00(this.A05) == com.facebook.ads.redexgen.core.EnumC0838Lr.A07) {
                this.A05.A07().AA1(strA08, com.facebook.ads.redexgen.core.C8E.A2F, c8f);
                this.A07.ABx(0, null);
                java.lang.String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    java.lang.String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    java.lang.String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            com.facebook.ads.redexgen.core.C1070Up c1070Up = this.A08;
            if (!android.text.TextUtils.isEmpty(this.A04.A0C())) {
                strA0F = this.A04.A0C();
            } else {
                strA0F = this.A04.A0F();
            }
            c1070Up.loadUrl(strA0F);
        } catch (java.lang.Exception e2) {
            this.A05.A07().AA0(A06(192, 8, 9), com.facebook.ads.redexgen.core.C8E.A2f, new com.facebook.ads.redexgen.core.C8F(e2));
        }
    }

    public final void A0C() {
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A05)) {
            this.A05.A0A().AHC(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 121));
        this.A08.destroy();
    }

    public com.facebook.ads.redexgen.core.C0842Lv getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public com.facebook.ads.redexgen.core.C0987Rk getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}

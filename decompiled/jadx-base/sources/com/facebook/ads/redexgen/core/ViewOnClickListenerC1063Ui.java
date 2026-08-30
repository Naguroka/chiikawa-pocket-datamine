package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC1063Ui extends com.facebook.ads.redexgen.core.OL implements android.view.View.OnClickListener {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public android.graphics.Bitmap A02;
    public android.graphics.Paint A03;
    public android.graphics.Rect A04;
    public com.facebook.ads.redexgen.core.C1199Zs A05;
    public com.facebook.ads.redexgen.core.LH A06;
    public com.facebook.ads.redexgen.core.C1065Uk A07;
    public java.lang.String A08;
    public java.lang.String A09;
    public boolean A0A;
    public final com.facebook.ads.redexgen.core.OH A0B;
    public final java.util.Map<java.lang.String, java.lang.String> A0C;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, 24, 37, 22, 31, 28, 22, 30};
    }

    static {
        A07();
        A0F = (int) (com.facebook.ads.redexgen.core.LP.A02 * 24.0f);
    }

    public ViewOnClickListenerC1063Ui(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C1O c1o, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.LZ lz) {
        this(c1199Zs, abstractC1341cD.A0Y(), c1o, abstractC1341cD.A1P().A0G().A06(), j7, mr, c0987Rk, c0842Lv, abstractC1341cD.A1Q(), lz);
        this.A0B.A04(abstractC1341cD);
    }

    public ViewOnClickListenerC1063Ui(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.C1O c1o, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.C1T c1t) {
        this(c1199Zs, str, c1o, false, j7, mr, c0987Rk, c0842Lv, c1t);
    }

    public ViewOnClickListenerC1063Ui(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.C1O c1o, boolean z, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.C1T c1t) {
        super(c1199Zs, c1o);
        this.A0C = new java.util.HashMap();
        this.A05 = c1199Zs;
        this.A0A = z;
        this.A0B = new com.facebook.ads.redexgen.core.OH(c1199Zs, str, c0987Rk, c0842Lv, j7, c1t, mr);
        setOnClickListener(this);
        com.facebook.ads.redexgen.core.M3.A0G(1001, this);
    }

    public ViewOnClickListenerC1063Ui(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.C1O c1o, boolean z, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C0842Lv c0842Lv, com.facebook.ads.redexgen.core.C1T c1t, com.facebook.ads.redexgen.core.LZ lz) {
        super(c1199Zs, c1o);
        this.A0C = new java.util.HashMap();
        this.A05 = c1199Zs;
        this.A0A = z;
        this.A0B = new com.facebook.ads.redexgen.core.OH(c1199Zs, str, c0987Rk, c0842Lv, j7, c1t, mr, lz);
        setOnClickListener(this);
        com.facebook.ads.redexgen.core.M3.A0G(1001, this);
    }

    public static android.graphics.Bitmap A03(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A05() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A03(com.facebook.ads.redexgen.core.MC.A03(this.A05, this.A09.contains(A04(12, 12, 10)) ? com.facebook.ads.redexgen.core.MB.MESSENGER : com.facebook.ads.redexgen.core.MB.WHATSAPP));
            this.A03 = new android.graphics.Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A06() {
        if (this.A06 != null) {
            com.facebook.ads.redexgen.core.LH lh = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            lh.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A08(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        return ((long) abstractC1341cD.A1M()) > 0 && abstractC1341cD.A1K() >= 0;
    }

    public final void A09(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.A08) || android.text.TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 6), str);
        this.A0B.A08(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.MQ mq) {
        if (this.A06 != null || !A08(abstractC1341cD) || abstractC1341cD.A1T().A01() == null || abstractC1341cD.A1T().A00() == null) {
            return false;
        }
        this.A07 = new com.facebook.ads.redexgen.core.C1065Uk(abstractC1341cD.A1K(), abstractC1341cD.A1M(), abstractC1341cD.A1L(), abstractC1341cD.A1T().A01(), abstractC1341cD.A1T().A00(), mq, this);
        this.A06 = new com.facebook.ads.redexgen.core.LH(abstractC1341cD.A1M(), this.A07);
        this.A06.A07();
        return true;
    }

    public com.facebook.ads.redexgen.core.OH getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 58));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new android.graphics.Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((java.lang.String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            android.graphics.Rect destRect = new android.graphics.Rect(i, top, left + i, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A06();
        }
    }

    public void setCreativeAsCtaLoggingHelper(com.facebook.ads.redexgen.core.LL ll) {
        this.A0B.A05(ll);
    }

    public void setCta(com.facebook.ads.redexgen.core.C1P c1p, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraData) {
        setCta(c1p, str, extraData, null);
    }

    public void setCta(com.facebook.ads.redexgen.core.C1P c1p, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.LZ lz, com.facebook.ads.redexgen.core.OG og) {
        setCta(c1p, str, extraData, og);
        this.A0B.A06(lz);
    }

    public void setCta(com.facebook.ads.redexgen.core.C1P c1p, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.OG og) {
        this.A08 = str;
        this.A09 = c1p.A05();
        this.A0C.putAll(extraData);
        this.A0B.A07(og);
        java.lang.String strA04 = c1p.A04();
        if (!android.text.TextUtils.isEmpty(strA04)) {
            java.lang.String buttonText = this.A09;
            if (!android.text.TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A09(z);
    }
}

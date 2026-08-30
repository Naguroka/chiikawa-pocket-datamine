package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0896Nx extends android.widget.ImageView implements com.facebook.ads.redexgen.core.InterfaceC0970Qt {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"aghB38UhEEJpk0kXnwVgQHJdsNEW", "Z42NiOwJIVHIw0Yvb2zaIIHOyWtQtdjq", "3gFse8uXyFGORzgMyq8kaPi65dxCnZzv", "Jw8apcEAXkOZ3AQdkmgk3jwFJH7gSyWz", "3SkqDykKznuf11rk6OObVQ9S0DbCfrGf", "LUP6WVZdZh28wzzt0Y5b2oxyslCE6YSF", "OrWA41O07SU0jmvClar47c0fhMdTsOQM", "iv"};
    public static final int A08;
    public static final int A09;
    public com.facebook.ads.redexgen.core.T7 A00;
    public final android.graphics.Paint A01;
    public final android.graphics.RectF A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.JF A04;
    public final com.facebook.ads.redexgen.core.AbstractC0956Qf A05;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[2].charAt(1) == 'n') {
                throw new java.lang.RuntimeException();
            }
            A07[4] = "46k42TMmXNLOzm12QaWH4fref2fTAqwO";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A06() {
        A06 = new byte[]{44, 20, 21, 4, 65, 32, 5};
    }

    static {
        A06();
        A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);
    }

    public C0896Nx(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.JF jf) {
        this(c1199Zs, jf, false);
    }

    public C0896Nx(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.JF jf, boolean z) {
        super(c1199Zs);
        this.A05 = new com.facebook.ads.redexgen.core.AbstractC0956Qf() { // from class: com.facebook.ads.redexgen.X.7W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0973Qw c0973Qw) {
                this.A00.A09();
            }
        };
        this.A04 = jf;
        this.A03 = c1199Zs;
        if (z) {
            this.A02 = new android.graphics.RectF();
        } else {
            this.A02 = null;
        }
        this.A01 = new android.graphics.Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(A09, A09, A09, A09);
        setContentDescription(A03(0, 7, 40));
        A05();
        setOnClickListener(new com.facebook.ads.redexgen.core.R7(this));
    }

    private void A04() {
        setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        return this.A00 != null && this.A00.getVolume() == 0.0f;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void A9r(com.facebook.ads.redexgen.core.T7 t7) {
        this.A00 = t7;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A05);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void AHD(com.facebook.ads.redexgen.core.T7 t7) {
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A05);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int width = getWidth() / 2;
        int x = getHeight();
        int y = x / 2;
        if (this.A02 != null) {
            android.graphics.RectF rectF = this.A02;
            int x2 = getWidth();
            float f = x2;
            int x3 = getHeight();
            rectF.set(0.0f, 0.0f, f, x3);
            android.graphics.RectF rectF2 = this.A02;
            int x4 = A08;
            float f2 = x4;
            if (A07[3].charAt(1) == 84) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[5] = "zT7YbptMnSmKw0M5I4XTvaxbvvVXxWiN";
            strArr[1] = "NI8lQWe2kpQIwBdYvxwMMOMmXOv2vWWW";
            int x5 = A08;
            canvas.drawRoundRect(rectF2, f2, x5, this.A01);
        } else {
            int x6 = java.lang.Math.min(width, y);
            canvas.drawCircle(width, y, x6, this.A01);
        }
        super.onDraw(canvas);
    }

    public void setBackgroundPaintColor(int i) {
        this.A01.setColor(i);
    }
}

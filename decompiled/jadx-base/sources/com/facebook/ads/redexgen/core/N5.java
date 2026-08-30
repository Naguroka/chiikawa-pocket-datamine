package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N5 extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC0970Qt {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"QrML4Ecz92sfYCeCtaSnFCosFmipGlTz", "VhmrcYjsqpOA7Iy", "ZK9HRS350jRidth", "ZjYoflRzQYTDfI0m0JAvuVl9vp7GlkSu", "MmC", "ZvQ3uBw3DQ7M1xesozkO3pU9", "XD5i8EmzP8U96tjWoOsk6YaJBmNCgDM7", "cjtQcAKtxYCLU"};
    public static final int A0A;
    public int A00;
    public android.animation.ObjectAnimator A01;
    public android.widget.ProgressBar A02;
    public com.facebook.ads.redexgen.core.AbstractC05348x A03;
    public com.facebook.ads.redexgen.core.AbstractC05348x A04;
    public com.facebook.ads.redexgen.core.AbstractC05348x A05;
    public com.facebook.ads.redexgen.core.AbstractC05348x A06;
    public com.facebook.ads.redexgen.core.T7 A07;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        java.lang.String[] strArr = A09;
        if (strArr[0].charAt(7) != strArr[6].charAt(7)) {
            throw new java.lang.RuntimeException();
        }
        A09[4] = "F3xM2b87YXaGRbor1WnSFNsn05JfW";
        A08 = new byte[]{-5, -3, -6, -14, -3, -16, -2, -2};
    }

    static {
        A03();
        A0A = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);
    }

    public N5(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(c1199Zs, A0A, -12549889, 0);
    }

    public N5(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, int i, int i2, int i3) {
        super(c1199Zs);
        this.A00 = -1;
        this.A06 = new com.facebook.ads.redexgen.core.R8() { // from class: com.facebook.ads.redexgen.X.7F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9O c9o) {
                if (this.A00.A07 != null) {
                    this.A00.A07(true);
                }
            }
        };
        this.A04 = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.7E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
                this.A00.A02();
            }
        };
        this.A05 = new com.facebook.ads.redexgen.core.AbstractC0990Rn() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
                if (this.A00.A07 != null) {
                    this.A00.A07(true);
                }
            }
        };
        this.A03 = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.7C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
                if (this.A00.A07 != null) {
                    this.A00.A05();
                }
            }
        };
        this.A02 = new android.widget.ProgressBar(c1199Zs, null, android.R.attr.progressBarStyleHorizontal);
        A06(i2, i3);
        this.A02.setMax(10000);
        addView(this.A02, new android.widget.RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 != null) {
            this.A01.cancel();
            this.A01.setTarget(null);
            this.A01 = null;
            this.A02.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A01 = android.animation.ObjectAnimator.ofInt(this.A02, A01(0, 8, 56), 0, 0);
        this.A01.setDuration(0L);
        this.A01.setInterpolator(new android.view.animation.LinearInterpolator());
        this.A01.start();
        this.A00 = -1;
    }

    public final void A06(int i, int i2) {
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(i2);
        android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable(i2);
        android.graphics.drawable.Drawable secProgressDr = new android.graphics.drawable.ScaleDrawable(new android.graphics.drawable.ColorDrawable(i), androidx.core.view.GravityCompat.START, 1.0f, -1.0f);
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{colorDrawable, colorDrawable2, secProgressDr});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        this.A02.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z) {
        if (this.A07 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A07.getCurrentPositionInMillis();
        int duration = this.A07.getDuration();
        int i = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int position = this.A00;
        if (position >= i || duration <= currentPositionInMillis) {
            return;
        }
        if (z) {
            android.widget.ProgressBar progressBar = this.A02;
            int position2 = this.A00;
            this.A01 = android.animation.ObjectAnimator.ofInt(progressBar, A01(0, 8, 56), position2, i);
            android.animation.ObjectAnimator objectAnimator = this.A01;
            int position3 = java.lang.Math.min(250, duration - currentPositionInMillis);
            objectAnimator.setDuration(position3);
            this.A01.setInterpolator(new android.view.animation.LinearInterpolator());
            this.A01.start();
        } else {
            this.A02.setProgress(i);
        }
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void A9r(com.facebook.ads.redexgen.core.T7 t7) {
        this.A07 = t7;
        t7.getEventBus().A03(this.A04, this.A05, this.A06, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void AHD(com.facebook.ads.redexgen.core.T7 t7) {
        t7.getEventBus().A04(this.A06, this.A05, this.A04, this.A03);
        this.A07 = null;
    }
}

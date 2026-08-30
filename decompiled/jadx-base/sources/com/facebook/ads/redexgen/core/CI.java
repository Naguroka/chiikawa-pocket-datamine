package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CI extends com.facebook.ads.redexgen.core.VY implements android.view.View.OnClickListener, android.view.View.OnTouchListener {
    public static int A09;
    public static int A0A;
    public static int A0B;
    public static int A0C;
    public static int A0D;
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"KCgVVt0Ap7UjFwdZVPwtujaSBd4wOGh", "pwlBzpehZvT0dx09nfsqJf3x9Ohs0th5", "vfZ4vr2K2y2ARDvqPAWs6IAB7KSzcYkK", "bFCbuQIkoS9nYpv83ewRiG67IWanvmGf", "GLbAB0S4L", "VAKU94yPMVJGstkAs9GlkzAfXtUrDcQU", "ELeO8zIeBErz", "BBoYkiBeDILGrcaYIrD29JxsdoJmJVn4"};
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.JF A02;
    public boolean A03;
    public final int A04;
    public final android.os.Handler A05;
    public final android.view.inputmethod.InputMethodManager A06;
    public final java.lang.Runnable A07;
    public final java.lang.String A08;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0F[6].length() != 12) {
                throw new java.lang.RuntimeException();
            }
            A0F[6] = "rGUQ6sPwqM0P";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A09() {
        A0E = new byte[]{94, 81, 84, 94, 86, 98, 78, 82, 72, 79, 94, 88, 36, 40, 42, 105, 33, 38, 36, 34, 37, 40, 40, 44, 105, 38, 35, 52, 105, 37, 38, 41, 41, 34, 53, 105, 36, 43, 46, 36, 44, 34, 35, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 116, 113, 102, 59, 124, 123, 97, 112, 103, 102, 97, 124, 97, 124, 116, 121, 59, 118, 121, 124, 118, 126, 112, 113, 2, 14, 12, 79, 7, 0, 2, 4, 3, 14, 14, 10, 79, 0, 5, 18, 79, 15, 0, 21, 8, 23, 4, 79, 0, 5, 62, 2, 13, 8, 2, 10, 53, 50, 44, 41, 40, 3, 49, 57, 40, 52, 51, 56, 30, 24, 14, 25, 52, 9, 30, 13, 13, 14, 25, 14, 15, 52, 8, 7, 2, 8, 0, 52, 2, 10, 9, 52, 8, 7, 2, 8, 0, 24, 81, 87, 65, 86, 123, 70, 81, 66, 66, 65, 86, 65, 64, 123, 71, 72, 77, 71, 79, 123, 77, 69, 70, 123, 80, 93, 84, 77, 74, 67};
    }

    static {
        A09();
        A0B = 450;
        A09 = 500;
        A0A = 50;
        A0D = 450;
        A0C = 150;
    }

    public CI(com.facebook.ads.redexgen.core.C5Q c5q, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, java.lang.String str, int i) {
        super(c5q, c1199Zs, j7, mr);
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A07 = new com.facebook.ads.redexgen.core.MU(this);
        this.A08 = str;
        this.A05 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A06 = (android.view.inputmethod.InputMethodManager) c1199Zs.getSystemService(A05(112, 12, 70));
        this.A04 = i;
    }

    public static /* synthetic */ int A02(com.facebook.ads.redexgen.core.CI ci) {
        int i = ci.A00;
        ci.A00 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        com.facebook.ads.redexgen.core.M3.A0M(this, androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN);
    }

    private void A07() {
        if (this.A08 == null) {
            return;
        }
        if (com.facebook.ads.internal.protocol.AdPlacementType.BANNER.name().equals(this.A08)) {
            super.A07.A0E(A05(12, 31, 93), null);
            return;
        }
        if (com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.name().equals(this.A08)) {
            super.A07.A0E(A05(80, 32, 123), null);
        } else if (com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.name().equals(this.A08)) {
            super.A07.A0E(A05(43, 37, 15), null);
        } else {
            if (!com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.name().equals(this.A08)) {
                return;
            }
            super.A07.A0E(com.facebook.ads.redexgen.core.EnumC0972Qv.A04.A03(), null);
        }
    }

    private void A08() {
        com.facebook.ads.redexgen.core.M3.A0M(this, 0);
    }

    public static /* synthetic */ boolean A0B(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.VY
    public final com.facebook.ads.redexgen.core.InterfaceC0891Ns A0E() {
        return new com.facebook.ads.redexgen.core.C1083Vc(this);
    }

    @Override // com.facebook.ads.redexgen.core.VY
    public final void A0F() {
        com.facebook.ads.redexgen.core.M3.A0M(this, androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        setPadding(getResources().getConfiguration().orientation);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{A0A, A0A, A0A, A0A, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(-1);
        this.A0B.setBackground(gradientDrawable);
        this.A0B.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.MT
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.facebook.ads.redexgen.core.CI.A0B(view, motionEvent);
            }
        });
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(this.A0B, layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0B.getId());
        layoutParams2.addRule(12);
        this.A0E.setBackgroundColor(-1);
        addView(this.A0E, layoutParams2);
        this.A0E.setOnTouchListener(this);
        setOnClickListener(this);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, (int) (com.facebook.ads.redexgen.core.LP.A02 * 2.0f));
        layoutParams3.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        addView(this.A0C, layoutParams3);
        A06();
        this.A0A.A3q(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.VY
    public final void A0G() {
        A08();
        super.A07.A05().overridePendingTransition(0, 0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels);
        translateAnimation.setDuration(A09);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.MW(this));
        startAnimation(translateAnimation);
    }

    @Override // com.facebook.ads.redexgen.core.VY
    public final void A0H(java.lang.String str) {
        if (this.A04 > 0 && !this.A03) {
            this.A03 = true;
            this.A05.removeCallbacksAndMessages(null);
            java.util.Map<java.lang.String, java.lang.String> mapA05 = new com.facebook.ads.redexgen.core.O8().A03(null).A02(null).A05();
            mapA05.put(A05(0, 12, 39), str);
            if (this.A02 != null) {
                this.A02.A04(com.facebook.ads.redexgen.core.JE.A0J, mapA05);
            }
            A07();
            this.A09.AA9(super.A04, mapA05);
            if (com.facebook.ads.redexgen.core.C0762Im.A2J(super.A08)) {
                java.util.HashMap map = new java.util.HashMap();
                map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A03, java.lang.Boolean.TRUE.toString());
                map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A04, java.lang.Boolean.TRUE.toString());
                map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A05, java.lang.Boolean.TRUE.toString());
                this.A09.AAI(super.A04, map);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.VY, com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        super.A9q(intent, bundle, c5q);
        this.A02 = new com.facebook.ads.redexgen.core.JF(super.A04, this.A09);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A08();
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels, 0.0f);
        translateAnimation.setDuration(A0B);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.MV(this));
        startAnimation(translateAnimation);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            A0G();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPadding(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.core.VY, com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        super.onDestroy();
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A06 == null) {
                    return false;
                }
                android.view.inputmethod.InputMethodManager inputMethodManager = this.A06;
                if (A0F[1].charAt(4) != 'z') {
                    throw new java.lang.RuntimeException();
                }
                A0F[6] = "wSSlTu5XSXtb";
                if (!inputMethodManager.isAcceptingText()) {
                    return false;
                }
                A0H(A05(154, 30, 62));
                return false;
            case 1:
                this.A01++;
                if (this.A01 < 5) {
                    return false;
                }
                A0H(A05(124, 30, 113));
                return false;
            default:
                return false;
        }
    }

    private void setPadding(int i) {
        if (i == 2) {
            setPadding(0, A0C, 0, 0);
        } else {
            setPadding(0, A0D, 0, 0);
        }
    }
}

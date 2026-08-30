package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class v9 extends com.applovin.impl.n9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.applovin.impl.n9
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public v9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        super(bVar, activity, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    /* JADX WARN: Code duplicated, block: B:20:0x010c  */
    /* JADX WARN: Code duplicated, block: B:23:0x012c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0142  */
    /* JADX WARN: Code duplicated, block: B:27:0x014a  */
    /* JADX WARN: Code duplicated, block: B:28:0x014e  */
    /* JADX WARN: Code duplicated, block: B:31:0x015d  */
    /* JADX WARN: Code duplicated, block: B:33:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x0214  */
    /* JADX WARN: Code duplicated, block: B:42:0x021e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0261  */
    /* JADX WARN: Code duplicated, block: B:48:0x026c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0272  */
    public void a(android.widget.ImageView imageView, com.applovin.impl.adview.g gVar, final com.applovin.impl.adview.l lVar, com.applovin.impl.o oVar, android.widget.ProgressBar progressBar, com.applovin.impl.h3 h3Var, android.view.View view, com.applovin.adview.AppLovinAdView appLovinAdView, com.applovin.impl.adview.k kVar, android.widget.ImageView imageView2, android.view.ViewGroup viewGroup) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        com.applovin.impl.aq aqVar;
        int i;
        int i2;
        com.applovin.impl.qq qqVarK0;
        if (this.c.r0() == com.applovin.impl.sdk.ad.b.e.TOP) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2, 48);
        } else if (this.c.r0() == com.applovin.impl.sdk.ad.b.e.BOTTOM) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2, 80);
        } else {
            if (this.c.r0() == com.applovin.impl.sdk.ad.b.e.LEFT) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -1, 3);
            } else if (this.c.r0() == com.applovin.impl.sdk.ad.b.e.RIGHT) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -1, 5);
            } else {
                layoutParams = this.e;
            }
            appLovinAdView.setLayoutParams(this.e);
            this.d.addView(appLovinAdView);
            android.view.View view2 = new android.view.View(this.b);
            view2.setLayoutParams(this.e);
            view2.setBackgroundColor(android.graphics.Color.argb(254, 0, 0, 0));
            view2.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view3, android.view.MotionEvent motionEvent) {
                    return com.applovin.impl.v9.a(view3, motionEvent);
                }
            });
            this.d.addView(view2);
            view.setLayoutParams(layoutParams);
            this.d.addView(view);
            if (lVar != null) {
                qqVarK0 = this.c.k0();
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.b);
                linearLayout.setOrientation(1);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setGravity(qqVarK0.e());
                android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.b);
                linearLayout2.setOrientation(0);
                linearLayout2.setWeightSum(100.0f);
                linearLayout2.setGravity(qqVarK0.e());
                android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, 0, qqVarK0.f());
                android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(0, -1, qqVarK0.i());
                int iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, qqVarK0.g());
                layoutParams4.setMargins(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
                linearLayout2.addView(lVar, layoutParams4);
                linearLayout.addView(linearLayout2, layoutParams3);
                this.d.addView(linearLayout, layoutParams2);
                if (qqVarK0.a() > 0.0f) {
                    lVar.setVisibility(4);
                    long jC = com.applovin.impl.yp.c(qqVarK0.a());
                    final long jB = qqVarK0.b();
                    com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.applovin.impl.zq.a(lVar, jB, (java.lang.Runnable) null);
                        }
                    }, jC);
                }
                if (qqVarK0.c() > 0.0f) {
                    long jC2 = com.applovin.impl.yp.c(qqVarK0.c());
                    final long jD = qqVarK0.d();
                    com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.applovin.impl.zq.b(lVar, jD, null);
                        }
                    }, jC2);
                }
            }
            if (gVar != null) {
                if (this.c.I0()) {
                    i = 48;
                    i2 = 3;
                } else {
                    i = 48;
                    i2 = 5;
                }
                a(this.c.l(), i | i2, gVar);
            }
            if (imageView != null) {
                int iDpToPx2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.q2)).intValue());
                android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.s2)).intValue());
                int iDpToPx3 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.r2)).intValue());
                layoutParams5.setMargins(iDpToPx3, iDpToPx3, iDpToPx3, iDpToPx3);
                this.d.addView(imageView, layoutParams5);
            }
            if (oVar != null) {
                this.d.addView(oVar, this.e);
            }
            if (h3Var != null) {
                int iDpToPx4 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.Y1)).intValue());
                android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(iDpToPx4, iDpToPx4, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.X1)).intValue());
                int iDpToPx5 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.W1)).intValue());
                layoutParams6.setMargins(iDpToPx5, iDpToPx5, iDpToPx5, iDpToPx5);
                this.d.addView(h3Var, layoutParams6);
            }
            if (progressBar != null) {
                android.widget.FrameLayout.LayoutParams layoutParams7 = new android.widget.FrameLayout.LayoutParams(-1, 20, 80);
                layoutParams7.setMargins(0, 0, 0, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.v2)).intValue());
                this.d.addView(progressBar, layoutParams7);
            }
            if (imageView2 != null) {
                aqVar = (com.applovin.impl.aq) this.c;
                if (aqVar.x1()) {
                    int iDpToPx6 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, aqVar.r1().g());
                    int iDpToPx7 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, aqVar.r1().d());
                    int iDpToPx8 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.N4)).intValue());
                    android.widget.FrameLayout.LayoutParams layoutParams8 = new android.widget.FrameLayout.LayoutParams(iDpToPx6, iDpToPx7, 83);
                    layoutParams8.setMargins(iDpToPx8, iDpToPx8, iDpToPx8, iDpToPx8);
                    this.d.addView(imageView2, layoutParams8);
                }
            }
            if (kVar != null) {
                this.d.addView(kVar, this.e);
            }
            if (viewGroup != null) {
                viewGroup.addView(this.d);
            } else {
                this.b.setContentView(this.d);
            }
        }
        appLovinAdView.setLayoutParams(this.e);
        this.d.addView(appLovinAdView);
        android.view.View view3 = new android.view.View(this.b);
        view3.setLayoutParams(this.e);
        view3.setBackgroundColor(android.graphics.Color.argb(254, 0, 0, 0));
        view3.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view4, android.view.MotionEvent motionEvent) {
                return com.applovin.impl.v9.a(view4, motionEvent);
            }
        });
        this.d.addView(view3);
        view.setLayoutParams(layoutParams);
        this.d.addView(view);
        if (lVar != null) {
            qqVarK0 = this.c.k0();
            android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(this.b);
            linearLayout3.setOrientation(1);
            linearLayout3.setWeightSum(100.0f);
            linearLayout3.setGravity(qqVarK0.e());
            android.view.ViewGroup.LayoutParams layoutParams9 = new android.widget.FrameLayout.LayoutParams(-1, -1);
            android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(this.b);
            linearLayout4.setOrientation(0);
            linearLayout4.setWeightSum(100.0f);
            linearLayout4.setGravity(qqVarK0.e());
            android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.LinearLayout.LayoutParams(-2, 0, qqVarK0.f());
            android.widget.LinearLayout.LayoutParams layoutParams11 = new android.widget.LinearLayout.LayoutParams(0, -1, qqVarK0.i());
            int iDpToPx9 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, qqVarK0.g());
            layoutParams11.setMargins(iDpToPx9, iDpToPx9, iDpToPx9, iDpToPx9);
            linearLayout4.addView(lVar, layoutParams11);
            linearLayout3.addView(linearLayout4, layoutParams10);
            this.d.addView(linearLayout3, layoutParams9);
            if (qqVarK0.a() > 0.0f) {
                lVar.setVisibility(4);
                long jC3 = com.applovin.impl.yp.c(qqVarK0.a());
                final long jB2 = qqVarK0.b();
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.applovin.impl.zq.a(lVar, jB2, (java.lang.Runnable) null);
                    }
                }, jC3);
            }
            if (qqVarK0.c() > 0.0f) {
                long jC4 = com.applovin.impl.yp.c(qqVarK0.c());
                final long jD2 = qqVarK0.d();
                com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(new java.lang.Runnable() { // from class: com.applovin.impl.v9$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.applovin.impl.zq.b(lVar, jD2, null);
                    }
                }, jC4);
            }
        }
        if (gVar != null) {
            if (this.c.I0()) {
                i = 48;
                i2 = 3;
            } else {
                i = 48;
                i2 = 5;
            }
            a(this.c.l(), i | i2, gVar);
        }
        if (imageView != null) {
            int iDpToPx10 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.q2)).intValue());
            android.widget.FrameLayout.LayoutParams layoutParams12 = new android.widget.FrameLayout.LayoutParams(iDpToPx10, iDpToPx10, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.s2)).intValue());
            int iDpToPx11 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.r2)).intValue());
            layoutParams12.setMargins(iDpToPx11, iDpToPx11, iDpToPx11, iDpToPx11);
            this.d.addView(imageView, layoutParams12);
        }
        if (oVar != null) {
            this.d.addView(oVar, this.e);
        }
        if (h3Var != null) {
            int iDpToPx12 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.Y1)).intValue());
            android.widget.FrameLayout.LayoutParams layoutParams13 = new android.widget.FrameLayout.LayoutParams(iDpToPx12, iDpToPx12, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.X1)).intValue());
            int iDpToPx13 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.W1)).intValue());
            layoutParams13.setMargins(iDpToPx13, iDpToPx13, iDpToPx13, iDpToPx13);
            this.d.addView(h3Var, layoutParams13);
        }
        if (progressBar != null) {
            android.widget.FrameLayout.LayoutParams layoutParams14 = new android.widget.FrameLayout.LayoutParams(-1, 20, 80);
            layoutParams14.setMargins(0, 0, 0, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.v2)).intValue());
            this.d.addView(progressBar, layoutParams14);
        }
        if (imageView2 != null) {
            aqVar = (com.applovin.impl.aq) this.c;
            if (aqVar.x1()) {
                int iDpToPx14 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, aqVar.r1().g());
                int iDpToPx15 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, aqVar.r1().d());
                int iDpToPx16 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.b, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.N4)).intValue());
                android.widget.FrameLayout.LayoutParams layoutParams15 = new android.widget.FrameLayout.LayoutParams(iDpToPx14, iDpToPx15, 83);
                layoutParams15.setMargins(iDpToPx16, iDpToPx16, iDpToPx16, iDpToPx16);
                this.d.addView(imageView2, layoutParams15);
            }
        }
        if (kVar != null) {
            this.d.addView(kVar, this.e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        } else {
            this.b.setContentView(this.d);
        }
    }

    @Override // com.applovin.impl.n9
    public /* bridge */ /* synthetic */ void a(android.view.View view) {
        super.a(view);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, android.view.View view, android.widget.ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        com.applovin.impl.e0.a(this.d, view);
        if (gVar != null) {
            a(this.c.l(), (this.c.A0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, 20, ((java.lang.Boolean) this.f1087a.a(com.applovin.impl.sj.D2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((java.lang.Integer) this.f1087a.a(com.applovin.impl.sj.E2)).intValue());
            this.d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.d.addView(kVar, this.e);
        }
    }
}

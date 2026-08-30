package com.bytedance.sdk.openadsdk.core.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg extends com.bytedance.sdk.openadsdk.core.Kg.bg {
    public static com.bytedance.sdk.openadsdk.core.Kg.VzQ[] bg = {new com.bytedance.sdk.openadsdk.core.Kg.VzQ(1, 6.4f, 320, 50), new com.bytedance.sdk.openadsdk.core.Kg.VzQ(4, 1.2f, com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250)};
    private java.lang.String Lq;
    private com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg Ta;
    private com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener vb;
    private com.bytedance.sdk.openadsdk.core.Kg.Fy yDt;

    public void setClosedListenerKey(java.lang.String str) {
        this.Lq = str;
    }

    public bg(android.content.Context context) {
        super(context);
        this.IL = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bg
    protected void bg(android.view.View view, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.yDt;
        if (fy != null) {
            fy.bg(view, i, ydt);
        }
    }

    void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.Kg.Fy fy, com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar) {
        setBackgroundColor(-1);
        this.bX = tuv;
        this.yDt = fy;
        this.ldr = "banner_ad";
        this.yDt.addView(this, new android.view.ViewGroup.LayoutParams(-2, -2));
        IL();
    }

    private void IL() {
        com.bytedance.sdk.openadsdk.core.Kg.VzQ vzQBg = bg(this.yDt.getExpectExpressWidth(), this.yDt.getExpectExpressHeight());
        if (this.yDt.getExpectExpressWidth() > 0 && this.yDt.getExpectExpressHeight() > 0) {
            this.iR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.yDt.getExpectExpressWidth());
            this.Kg = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.yDt.getExpectExpressHeight());
        } else {
            this.iR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL);
            this.Kg = java.lang.Float.valueOf(this.iR / vzQBg.IL).intValue();
        }
        if (this.iR > 0 && this.iR > com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL)) {
            float fBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL) / this.iR;
            this.iR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL);
            this.Kg = java.lang.Float.valueOf(this.Kg * fBX).intValue();
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(this.iR, this.Kg);
        }
        layoutParams.width = this.iR;
        layoutParams.height = this.Kg;
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (this.bX != null) {
            int iBOf = this.bX.bOf();
            if (iBOf == 1010 || iBOf == 1011 || iBOf == 1012) {
                eqN();
            } else {
                bg(vzQBg);
            }
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.Kg.VzQ vzQ) {
        if (vzQ.bg == 1) {
            bX();
        } else {
            zx();
        }
    }

    private void bX() {
        float fBX = (this.Kg * 1.0f) / com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 50.0f);
        if ((this.Kg * 1.0f) / this.iR > 0.21875f) {
            fBX = (this.iR * 1.0f) / com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 320.0f);
        }
        com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg c0151bgIR = iR();
        this.Ta = c0151bgIR;
        android.widget.ImageView imageView = c0151bgIR.bX;
        android.widget.TextView textView = this.Ta.IL;
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = this.Ta.eqN;
        android.widget.TextView textView2 = this.Ta.iR;
        textView.setTextSize(2, com.bytedance.sdk.openadsdk.utils.ZQc.IL(this.IL, textView.getTextSize()) * fBX);
        textView2.setTextSize(2, com.bytedance.sdk.openadsdk.utils.ZQc.IL(this.IL, textView2.getTextSize()) * fBX);
        android.view.View view = this.Ta.ldr;
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.bg.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.bX.bg.this.IL, com.bytedance.sdk.openadsdk.core.bX.bg.this.bX, com.bytedance.sdk.openadsdk.core.bX.bg.this.ldr);
                }
            });
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 38.0f) * fBX);
            layoutParams.height = (int) (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 38.0f) * fBX);
        }
        if (this.bX.sVc() != null && !android.text.TextUtils.isEmpty(this.bX.sVc().bg())) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bX.sVc().bg(), this.bX.sVc().IL(), this.bX.sVc().bX(), imageView, this.bX);
        }
        textView.setText(this.bX.wS());
        if (!android.text.TextUtils.isEmpty(this.bX.zCS())) {
            textView2.setText(this.bX.zCS());
        } else {
            textView2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.widget.TextView) null, xxpVar, this.bX);
        bg((android.view.View) imageView, true);
        imageView.setTag(520093762, java.lang.Boolean.TRUE);
        bg((android.view.View) this, true);
        bg((android.view.View) textView2, true);
    }

    private void eqN() {
        com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg c0151bgLdr = ldr();
        this.Ta = c0151bgLdr;
        android.view.View view = c0151bgLdr.ldr;
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.bg.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.bX.bg.this.IL, com.bytedance.sdk.openadsdk.core.bX.bg.this.bX, com.bytedance.sdk.openadsdk.core.bX.bg.this.ldr);
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.Ta ta = this.Ta.bg;
        if (ta != null) {
            java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = this.bX.lM();
            if (listLM != null && !listLM.isEmpty()) {
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(listLM.get(0), ta, this.bX);
            }
            bg((android.view.View) ta, true);
            ta.setTag(520093762, java.lang.Boolean.TRUE);
        }
    }

    private void zx() {
        if (this.bX != null) {
            int iBOf = this.bX.bOf();
            float fBX = (this.Kg * 1.0f) / com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 250.0f);
            if (this.bX.Dxa() == null) {
                com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg c0151bgKg = Kg();
                this.Ta = c0151bgKg;
                com.bytedance.sdk.openadsdk.core.widget.Ta ta = c0151bgKg.bg;
                android.widget.ImageView imageView = this.Ta.bX;
                android.widget.TextView textView = this.Ta.IL;
                android.widget.TextView textView2 = this.Ta.iR;
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 45.0f) * fBX);
                    layoutParams.height = (int) (com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 45.0f) * fBX);
                }
                textView.setTextSize(2, com.bytedance.sdk.openadsdk.utils.ZQc.IL(this.IL, textView.getTextSize()) * fBX);
                textView2.setTextSize(2, com.bytedance.sdk.openadsdk.utils.ZQc.IL(this.IL, textView2.getTextSize()) * fBX);
                android.view.View view = this.Ta.ldr;
                if (view != null) {
                    view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.bg.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(android.view.View view2) {
                            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.bX.bg.this.IL, com.bytedance.sdk.openadsdk.core.bX.bg.this.bX, com.bytedance.sdk.openadsdk.core.bX.bg.this.ldr);
                        }
                    });
                }
                if (iBOf == 33) {
                    ta.setRatio(1.0f);
                } else {
                    ta.setRatio(1.91f);
                }
                java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = this.bX.lM();
                if (listLM != null && !listLM.isEmpty()) {
                    com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(listLM.get(0), ta, this.bX);
                    com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(listLM.get(0).bg(), this.Ta.zx);
                }
                if (this.bX.sVc() != null && !android.text.TextUtils.isEmpty(this.bX.sVc().bg())) {
                    com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bX.sVc().bg(), this.bX.sVc().IL(), this.bX.sVc().bX(), imageView, this.bX);
                }
                textView.setText(this.bX.wS());
                if (!android.text.TextUtils.isEmpty(this.bX.zCS())) {
                    textView2.setText(this.bX.zCS());
                } else {
                    textView2.setVisibility(8);
                }
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.widget.TextView) null, this.Ta.eqN, this.bX);
                bg((android.view.View) ta, true);
                ta.setTag(520093762, java.lang.Boolean.TRUE);
                bg((android.view.View) this, true);
                bg((android.view.View) textView2, true);
                return;
            }
            com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg c0151bgWR = WR();
            this.Ta = c0151bgWR;
            android.widget.TextView textView3 = c0151bgWR.IL;
            android.widget.TextView textView4 = this.Ta.iR;
            com.bytedance.sdk.openadsdk.core.widget.PX px = this.Ta.Kg;
            textView3.setTextSize(2, com.bytedance.sdk.openadsdk.utils.ZQc.IL(this.IL, textView3.getTextSize()) * fBX);
            textView4.setTextSize(2, com.bytedance.sdk.openadsdk.utils.ZQc.IL(this.IL, textView4.getTextSize()) * fBX);
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bX.Dxa().eo(), this.Ta.zx);
            android.view.View view2 = this.Ta.ldr;
            if (view2 != null) {
                view2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.bg.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view3) {
                        com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.bX.bg.this.IL, com.bytedance.sdk.openadsdk.core.bX.bg.this.bX, com.bytedance.sdk.openadsdk.core.bX.bg.this.ldr);
                    }
                });
            }
            if (iBOf == 15) {
                px.setRatio(0.5625f);
            } else if (iBOf == 5) {
                px.setRatio(1.7777778f);
            } else {
                px.setRatio(1.0f);
            }
            px.removeAllViews();
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.Ta.IL.ldr videoView = getVideoView();
            if (videoView != null) {
                com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.yDt;
                if (fy instanceof com.bytedance.sdk.openadsdk.core.Kg.tuV) {
                    videoView.setVideoAdInteractionListener((com.bytedance.sdk.openadsdk.core.Kg.tuV) fy);
                }
                px.addView(videoView, layoutParams2);
                videoView.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.core.bX.bg.5
                    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg
                    public void bg(android.view.View view3, int i) {
                        if (com.bytedance.sdk.openadsdk.core.bX.bg.this.vb != null) {
                            com.bytedance.sdk.openadsdk.core.bX.bg.this.vb.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.Kg.Kg clickCreativeListener = this.yDt.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.bg(videoView.getNativeVideoController());
                }
            }
            if (this.bX.sVc() != null && !android.text.TextUtils.isEmpty(this.bX.sVc().bg())) {
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bX.sVc().bg(), this.bX.sVc().IL(), this.bX.sVc().bX(), this.Ta.bX, this.bX);
            }
            textView3.setText(this.bX.wS());
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.widget.TextView) null, this.Ta.eqN, this.bX);
            if (!android.text.TextUtils.isEmpty(this.bX.zCS())) {
                textView4.setText(this.bX.zCS());
            } else {
                textView4.setVisibility(8);
            }
            bg((android.view.View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, java.lang.Boolean.TRUE);
            }
            bg((android.view.View) this, true);
            bg((android.view.View) textView4, true);
            bg(px);
        }
    }

    public static com.bytedance.sdk.openadsdk.core.Kg.VzQ bg(int i, int i2) {
        try {
            return ((double) i2) >= java.lang.Math.floor((((double) i) * 450.0d) / 600.0d) ? bg[1] : bg[0];
        } catch (java.lang.Throwable unused) {
            return bg[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bg
    public void bg() {
        if (this.zx != null) {
            this.zx.show();
        } else if (this.eqN != null) {
            this.eqN.bg();
        } else {
            com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bg(this.bX, this.Lq);
        }
    }

    private com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg ldr() {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 8.0f);
        com.bytedance.sdk.openadsdk.core.widget.Ta ta = new com.bytedance.sdk.openadsdk.core.widget.Ta(this.IL);
        ta.setId(520093736);
        ta.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(ta, layoutParams);
        android.view.View pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.IL);
        pAGLogoView.setId(520093739);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iBX, iBX, 0, 0);
        layoutParams2.gravity = 8388659;
        pAGLogoView.setLayoutParams(layoutParams2);
        addView(pAGLogoView);
        return new com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg(pAGLogoView, ta);
    }

    private com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg iR() {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 38.0f);
        int iBX2 = (int) (((double) com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 25.0f)) / 5.0d);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 10.0f);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 2.0f);
        int iBX5 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 6.0f);
        int iBX6 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 8.0f);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.IL);
        addView(relativeLayout, -1, -1);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(this.IL);
        vzQ.setId(520093738);
        android.widget.TextView textView = new android.widget.TextView(this.IL);
        textView.setId(520093730);
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(this.IL);
        xxpVar.setId(520093735);
        android.view.View pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.IL);
        pAGLogoView.setId(520093739);
        android.widget.TextView textView2 = new android.widget.TextView(this.IL);
        textView2.setId(520093703);
        com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg c0151bg = new com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg(vzQ, textView, xxpVar, pAGLogoView, textView2);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iBX, iBX);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iBX5);
        layoutParams.setMargins(iBX5, 0, 0, 0);
        vzQ.setLayoutParams(layoutParams);
        vzQ.setBackgroundColor(-1);
        vzQ.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(vzQ);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.IL);
        linearLayout.setOrientation(1);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, vzQ.getId());
        layoutParams2.setMarginStart(iBX6);
        layoutParams2.setMarginEnd(iBX6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, vzQ.getId());
        layoutParams2.setMargins(iBX6, 0, iBX6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(android.graphics.Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iBX4;
        xxpVar.setLayoutParams(layoutParams4);
        linearLayout.addView(xxpVar);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        pAGLogoView.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoView);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iBX5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iBX5;
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.IL, 12));
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iBX3, iBX2, iBX3, iBX2);
        textView2.setText(com.bytedance.sdk.component.utils.Fy.bg(this.IL, "tt_video_download_apk"));
        textView2.setTextColor(android.graphics.Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return c0151bg;
    }

    private com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg Kg() {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 8.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 21.0f);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.IL);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iBX, iBX, iBX, iBX2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.IL);
        linearLayout.setId(520093737);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(this.IL);
        vzQ.setId(520093738);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 52.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 52.0f));
        vzQ.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        vzQ.setLayoutParams(layoutParams3);
        linearLayout.addView(vzQ);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.IL);
        linearLayout2.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iBX;
        layoutParams4.rightMargin = iBX;
        layoutParams4.setMarginStart(iBX);
        layoutParams4.setMarginEnd(iBX);
        linearLayout.addView(linearLayout2, layoutParams4);
        android.widget.TextView textView = new android.widget.TextView(this.IL);
        textView.setId(520093730);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(android.graphics.Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(this.IL);
        xxpVar.setId(520093735);
        linearLayout2.addView(xxpVar, new android.widget.LinearLayout.LayoutParams(-2, -2));
        android.widget.TextView textView2 = new android.widget.TextView(this.IL);
        textView2.setId(520093703);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 76.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 36.0f));
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.IL, 18));
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.Fy.bg(this.IL, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.IL);
        frameLayout.setLayoutDirection(3);
        android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iBX2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        com.bytedance.sdk.openadsdk.core.widget.Ta ta = new com.bytedance.sdk.openadsdk.core.widget.Ta(this.IL);
        ta.setId(520093736);
        ta.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.FrameLayout.LayoutParams layoutParams8 = new android.widget.FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(ta, layoutParams8);
        android.view.View pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.IL);
        pAGLogoView.setId(520093739);
        android.widget.RelativeLayout.LayoutParams layoutParams9 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iBX, iBX, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams9);
        relativeLayout.addView(pAGLogoView);
        return new com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg(vzQ, pAGLogoView, textView2, textView, ta, xxpVar, frameLayout);
    }

    private com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg WR() {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 8.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 21.0f);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.IL);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iBX, iBX, iBX, iBX2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.IL);
        linearLayout.setId(520093737);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(this.IL);
        vzQ.setId(520093738);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 52.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 52.0f));
        vzQ.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        vzQ.setLayoutParams(layoutParams3);
        linearLayout.addView(vzQ);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.IL);
        linearLayout2.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iBX;
        layoutParams4.rightMargin = iBX;
        layoutParams4.setMarginStart(iBX);
        layoutParams4.setMarginEnd(iBX);
        linearLayout.addView(linearLayout2, layoutParams4);
        android.widget.TextView textView = new android.widget.TextView(this.IL);
        textView.setId(520093730);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(android.graphics.Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(this.IL);
        xxpVar.setId(520093735);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 4.0f);
        linearLayout2.addView(xxpVar, layoutParams6);
        android.widget.TextView textView2 = new android.widget.TextView(this.IL);
        textView2.setId(520093703);
        android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 76.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 36.0f));
        textView2.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this.IL, 18));
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.Fy.bg(this.IL, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.IL);
        android.widget.RelativeLayout.LayoutParams layoutParams8 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iBX2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        com.bytedance.sdk.openadsdk.core.widget.PX px = new com.bytedance.sdk.openadsdk.core.widget.PX(this.IL);
        px.setId(520093736);
        android.widget.FrameLayout.LayoutParams layoutParams9 = new android.widget.FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        px.setLayoutParams(layoutParams9);
        frameLayout.addView(px);
        android.view.View pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.IL);
        pAGLogoView.setId(520093739);
        android.widget.RelativeLayout.LayoutParams layoutParams10 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iBX, iBX, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams10);
        relativeLayout.addView(pAGLogoView);
        return new com.bytedance.sdk.openadsdk.core.bX.bg.C0151bg(vzQ, pAGLogoView, textView2, textView, px, xxpVar, frameLayout);
    }

    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.vb = pAGBannerAdWrapperListener;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bX.bg$bg, reason: collision with other inner class name */
    private static class C0151bg {
        public android.widget.TextView IL;
        private com.bytedance.sdk.openadsdk.core.widget.PX Kg;
        android.widget.ImageView bX;
        public com.bytedance.sdk.openadsdk.core.widget.Ta bg;
        com.bytedance.sdk.openadsdk.core.widget.xxp eqN;
        android.widget.TextView iR;
        android.view.View ldr;
        android.widget.FrameLayout zx;

        C0151bg(android.widget.ImageView imageView, android.widget.TextView textView, com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar, android.view.View view, android.widget.TextView textView2) {
            this.bX = imageView;
            this.IL = textView;
            this.eqN = xxpVar;
            this.ldr = view;
            this.iR = textView2;
        }

        public C0151bg(android.widget.ImageView imageView, android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, com.bytedance.sdk.openadsdk.core.widget.Ta ta, com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar, android.widget.FrameLayout frameLayout) {
            this.bX = imageView;
            this.ldr = view;
            this.iR = textView;
            this.IL = textView2;
            this.bg = ta;
            this.eqN = xxpVar;
            this.zx = frameLayout;
        }

        public C0151bg(android.widget.ImageView imageView, android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, com.bytedance.sdk.openadsdk.core.widget.PX px, com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar, android.widget.FrameLayout frameLayout) {
            this.bX = imageView;
            this.ldr = view;
            this.iR = textView;
            this.IL = textView2;
            this.Kg = px;
            this.eqN = xxpVar;
            this.zx = frameLayout;
        }

        public C0151bg(android.view.View view, com.bytedance.sdk.openadsdk.core.widget.Ta ta) {
            this.ldr = view;
            this.bg = ta;
        }
    }
}

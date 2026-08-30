package com.bytedance.sdk.openadsdk.core.bX;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.openadsdk.core.Kg.bg implements com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX, com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN {
    private com.bytedance.sdk.openadsdk.core.Ta.IL.ldr Lq;
    private com.bytedance.sdk.openadsdk.core.Kg.Fy Ta;
    private long VzQ;
    public boolean bg;
    private com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener tuV;
    private android.widget.ImageView vb;
    private java.lang.String xxp;
    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr yDt;

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void d_() {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void g_() {
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void h_() {
    }

    public iR(android.content.Context context) {
        super(context);
        this.bg = true;
        this.IL = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bg
    protected void bg(android.view.View view, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.Ta;
        if (fy != null) {
            fy.bg(view, i, ydt);
            com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.Lq;
            if (ldrVar == null || !(ldrVar.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.bX)) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) this.Lq.getNativeVideoController()).daV();
        }
    }

    public void setClosedListenerKey(java.lang.String str) {
        this.xxp = str;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.Kg.Fy fy, com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar) {
        setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.bX = tuv;
        this.Ta = fy;
        this.yDt = ldrVar;
        this.ldr = "banner_ad";
        this.Ta.addView(this, new android.view.ViewGroup.LayoutParams(-2, -2));
        zx();
    }

    private void zx() {
        com.bytedance.sdk.openadsdk.core.Kg.VzQ vzQBg = com.bytedance.sdk.openadsdk.core.bX.bg.bg(this.Ta.getExpectExpressWidth(), this.Ta.getExpectExpressHeight());
        if (this.Ta.getExpectExpressWidth() > 0 && this.Ta.getExpectExpressHeight() > 0) {
            this.iR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.Ta.getExpectExpressWidth());
            this.Kg = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.Ta.getExpectExpressHeight());
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
        bg(vzQBg);
    }

    private void bg(com.bytedance.sdk.openadsdk.core.Kg.VzQ vzQ) {
        if (this.bX != null) {
            int iBOf = this.bX.bOf();
            com.bytedance.sdk.openadsdk.core.bX.iR.bg bgVarIL = IL(vzQ);
            if (bgVarIL == null || bgVarIL.bg == null) {
                return;
            }
            addView(bgVarIL.bg);
            com.bytedance.sdk.openadsdk.core.zx.eqN eqn = bgVarIL.eqN;
            com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoView = bgVarIL.zx;
            com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = bgVarIL.ldr;
            if (eqn2 != null && this.bX.Kg()) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) eqn2, 0);
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg((int) com.bytedance.sdk.openadsdk.utils.ZQc.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 11.0f, true), eqn2, this.bX);
            }
            this.vb = bgVarIL.bX;
            com.bytedance.sdk.openadsdk.core.Ta.IL.ldr videoView = getVideoView();
            if (videoView instanceof com.bytedance.sdk.openadsdk.core.Ta.IL.ldr) {
                this.Lq = videoView;
                videoView.setVideoAdLoadListener(this);
                this.Lq.setVideoAdInteractionListener(this);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new android.util.Pair(eqn, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.CLOSE_AD));
                arrayList.add(new android.util.Pair(pAGLogoView, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.OTHER));
                arrayList.add(new android.util.Pair(eqn2, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.OTHER));
                arrayList.add(new android.util.Pair(this.vb, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.VIDEO_CONTROLS));
                this.Lq.bg(arrayList);
                this.Lq.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.core.bX.iR.1
                    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg
                    public void bg(android.view.View view, int i) {
                        if (com.bytedance.sdk.openadsdk.core.bX.iR.this.tuV != null) {
                            com.bytedance.sdk.openadsdk.core.bX.iR.this.tuV.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.iR.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.bX.iR.this.IL, com.bytedance.sdk.openadsdk.core.bX.iR.this.bX, com.bytedance.sdk.openadsdk.core.bX.iR.this.ldr);
                    }
                });
            }
            if (eqn != null) {
                eqn.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.iR.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        com.bytedance.sdk.openadsdk.core.bX.iR.this.bg();
                    }
                });
                com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.Ta;
                if (fy != null) {
                    if (fy.getClickListener() != null) {
                        this.Ta.getClickListener().IL(eqn);
                    }
                    if (this.Ta.getClickCreativeListener() != null) {
                        this.Ta.getClickCreativeListener().IL(eqn);
                    }
                }
            }
            android.widget.ImageView imageView = this.vb;
            if (imageView != null) {
                imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.iR.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        if (com.bytedance.sdk.openadsdk.core.bX.iR.this.Lq != null) {
                            boolean z = !com.bytedance.sdk.openadsdk.core.bX.iR.this.Lq.WR();
                            com.bytedance.sdk.openadsdk.core.bX.iR iRVar = com.bytedance.sdk.openadsdk.core.bX.iR.this;
                            android.graphics.drawable.Drawable drawableBX = z ? com.bytedance.sdk.component.utils.Fy.bX(iRVar.getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.Fy.bX(iRVar.getContext(), "tt_reward_full_unmute");
                            com.bytedance.sdk.openadsdk.core.bX.iR.this.Lq.setIsQuiet(z);
                            com.bytedance.sdk.openadsdk.core.bX.iR.this.vb.setImageDrawable(drawableBX);
                            if (com.bytedance.sdk.openadsdk.core.bX.iR.this.bX == null || com.bytedance.sdk.openadsdk.core.bX.iR.this.bX.hi() == null || com.bytedance.sdk.openadsdk.core.bX.iR.this.bX.hi().bg() == null) {
                                return;
                            }
                            if (z) {
                                com.bytedance.sdk.openadsdk.core.bX.iR.this.bX.hi().bg().Kg(com.bytedance.sdk.openadsdk.core.bX.iR.this.VzQ);
                            } else {
                                com.bytedance.sdk.openadsdk.core.bX.iR.this.bX.hi().bg().WR(com.bytedance.sdk.openadsdk.core.bX.iR.this.VzQ);
                            }
                        }
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.widget.PX px = bgVarIL.IL;
            if (this.bX != null && this.bX.hi() != null && px != null) {
                int iPX = this.bX.hi().PX();
                float fTa = this.bX.hi().Ta();
                if (iPX > 0 && fTa > 0.0f) {
                    px.setRatio(iPX / fTa);
                } else if (iBOf == 15) {
                    px.setRatio(0.5625f);
                } else if (iBOf == 5) {
                    px.setRatio(1.7777778f);
                } else {
                    px.setRatio(1.0f);
                }
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && px != null) {
                px.addView(videoView, layoutParams);
                videoView.setTag(520093762, java.lang.Boolean.TRUE);
            }
            bg((android.view.View) videoView, true);
            bg((android.view.View) this, true);
            bg(px);
        }
    }

    private com.bytedance.sdk.openadsdk.core.bX.iR.bg IL(com.bytedance.sdk.openadsdk.core.Kg.VzQ vzQ) {
        com.bytedance.sdk.openadsdk.core.bX.iR.bg bgVar = new com.bytedance.sdk.openadsdk.core.bX.iR.bg();
        bgVar.bg = new android.widget.FrameLayout(this.IL);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        bgVar.bg.setLayoutParams(layoutParams);
        bgVar.IL = new com.bytedance.sdk.openadsdk.core.widget.PX(this.IL);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        bgVar.IL.setLayoutParams(layoutParams2);
        bgVar.bg.addView(bgVar.IL);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 28.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 12.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 2.25f);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 5.0f);
        if (vzQ != null && vzQ.bg == 1) {
            iBX = iBX2;
        }
        if (vzQ == null || vzQ.bg != 1) {
            iBX3 = iBX4;
        }
        bgVar.bX = new com.bytedance.sdk.openadsdk.core.zx.eqN(getContext());
        bgVar.bX.setPadding(iBX3, iBX3, iBX3, iBX3);
        bgVar.bX.setBackground(com.bytedance.sdk.openadsdk.core.widget.eqN.bg());
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(iBX, iBX);
        layoutParams3.setMargins(iBX4, iBX4, iBX4, iBX4);
        bgVar.bX.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        bgVar.bX.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_reward_full_mute"));
        bgVar.bX.setLayoutParams(layoutParams3);
        bgVar.bg.addView(bgVar.bX);
        if (vzQ != null && vzQ.bg == 1) {
            bgVar.eqN = com.bytedance.sdk.openadsdk.core.widget.iR.bg(getContext());
        } else {
            bgVar.eqN = com.bytedance.sdk.openadsdk.core.widget.iR.IL(getContext());
        }
        bgVar.eqN.setId(520093697);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = androidx.core.view.GravityCompat.END;
        layoutParams4.setMargins(iBX4, iBX4, iBX4, iBX4);
        bgVar.eqN.setLayoutParams(layoutParams4);
        bgVar.bg.addView(bgVar.eqN);
        bgVar.zx = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.IL);
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388691;
        layoutParams5.setMargins(iBX4, iBX4, iBX4, iBX4);
        bgVar.zx.setLayoutParams(layoutParams5);
        bgVar.bg.addView(bgVar.zx);
        bgVar.ldr = new com.bytedance.sdk.openadsdk.core.zx.eqN(this.IL);
        int iBX5 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 11.0f);
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(iBX5, iBX5);
        layoutParams6.gravity = 8388693;
        layoutParams6.rightMargin = iBX4;
        layoutParams6.bottomMargin = iBX4;
        bgVar.ldr.setVisibility(8);
        bgVar.ldr.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        bgVar.ldr.setLayoutParams(layoutParams6);
        bgVar.bg.addView(bgVar.ldr);
        return bgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bg
    public void bg() {
        if (this.zx != null) {
            this.zx.show();
        } else if (this.eqN != null) {
            this.eqN.bg();
        } else {
            com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bg(this.bX, this.xxp);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN
    public void bg(int i, int i2) {
        android.widget.ImageView imageView = this.vb;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void bg(long j, long j2) {
        this.VzQ = j;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void i_() {
        android.widget.ImageView imageView = this.vb;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public long getVideoProgress() {
        return this.VzQ;
    }

    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.tuV = pAGBannerAdWrapperListener;
    }

    private static class bg {
        public com.bytedance.sdk.openadsdk.core.widget.PX IL;
        public com.bytedance.sdk.openadsdk.core.zx.eqN bX;
        public android.widget.FrameLayout bg;
        public com.bytedance.sdk.openadsdk.core.zx.eqN eqN;
        public com.bytedance.sdk.openadsdk.core.zx.eqN ldr;
        public com.bytedance.sdk.openadsdk.core.widget.PAGLogoView zx;

        private bg() {
        }
    }
}

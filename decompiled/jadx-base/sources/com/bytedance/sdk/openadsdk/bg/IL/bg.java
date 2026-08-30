package com.bytedance.sdk.openadsdk.bg.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private final android.content.Context IL;
    private com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView Kg;
    private com.bytedance.sdk.openadsdk.core.IL.IL PX;
    private boolean Ta = false;
    private com.bytedance.sdk.openadsdk.core.IL.bg VB;
    private com.bytedance.sdk.openadsdk.core.Kg.Fy WR;
    private final java.lang.String bX;
    protected final com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView eo;
    private boolean eqN;
    private com.bytedance.sdk.openadsdk.bg.IL.bg.bX iR;
    private com.bytedance.sdk.openadsdk.bg.IL.IL ldr;
    private java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.PX.ldr> yDt;
    private java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.Ta.IL.ldr> zx;

    public bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        this.IL = context;
        this.bg = tuv;
        this.bX = str;
    }

    public void bg(com.bytedance.sdk.openadsdk.bg.IL.IL il) {
        this.ldr = il;
    }

    public void bg(com.bytedance.sdk.openadsdk.bg.IL.bg.bX bXVar) {
        this.iR = bXVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar) {
        this.zx = new java.lang.ref.WeakReference<>(ldrVar);
    }

    public void bg(boolean z) {
        this.eqN = z;
    }

    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView bg() {
        return this.Kg;
    }

    public com.bytedance.sdk.openadsdk.core.Kg.Fy IL() {
        return this.WR;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.bg bgVar) {
        this.VB = bgVar;
    }

    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem bX() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null || tuv.sVc() == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem(this.bg.sVc().bX(), this.bg.sVc().IL(), this.bg.sVc().bg(), (float) this.bg.sVc().eqN());
    }

    public java.lang.String eqN() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv != null) {
            return bg(tuv);
        }
        return null;
    }

    private java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv.RiO() != null && !android.text.TextUtils.isEmpty(tuv.RiO().IL())) {
            return tuv.RiO().IL();
        }
        if (android.text.TextUtils.isEmpty(tuv.bN())) {
            return !android.text.TextUtils.isEmpty(tuv.wS()) ? tuv.wS() : "";
        }
        return tuv.bN();
    }

    private java.lang.String IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (android.text.TextUtils.isEmpty(tuv.wS())) {
            return !android.text.TextUtils.isEmpty(tuv.cZH()) ? tuv.cZH() : "";
        }
        return tuv.wS();
    }

    public java.lang.String zx() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv != null) {
            return IL(tuv);
        }
        return null;
    }

    public java.lang.String ldr() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv != null) {
            return tuv.zCS();
        }
        return null;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.IL il) {
        this.PX = il;
    }

    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView iR() {
        com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaViewWR;
        com.bytedance.sdk.openadsdk.utils.IL.bg(this.bg);
        if (this.bg.tC() == 2) {
            pAGMediaViewWR = yDt();
            bg(pAGMediaViewWR);
        } else {
            pAGMediaViewWR = WR();
        }
        if (pAGMediaViewWR != null) {
            pAGMediaViewWR.setMrcTrackerKey(com.bytedance.sdk.openadsdk.rri.bg.zx.IL(this.bg));
        } else {
            pAGMediaViewWR = new com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView(this.IL) { // from class: com.bytedance.sdk.openadsdk.bg.IL.bg.1
                @Override // android.view.ViewGroup, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.bX.bg(this, com.bytedance.sdk.openadsdk.bg.IL.bg.this.bg);
                }
            };
        }
        if (pAGMediaViewWR instanceof com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView) {
            ((com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView) pAGMediaViewWR).setMaterialMeta(this.bg);
        }
        this.eo = pAGMediaViewWR;
        return pAGMediaViewWR;
    }

    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView Kg() {
        return this.eo;
    }

    private void bg(com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        } catch (java.lang.Exception unused) {
        }
    }

    private com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView yDt() {
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bg)) {
            com.bytedance.sdk.openadsdk.bg.IL.bg.bX bXVar = this.iR;
            if (bXVar == null || !(bXVar instanceof com.bytedance.sdk.openadsdk.bg.IL.bg.IL)) {
                return null;
            }
            com.bytedance.sdk.openadsdk.core.Kg.tuV tuv = (com.bytedance.sdk.openadsdk.core.Kg.tuV) bXVar.eqN();
            tuv.setTag(520093762, java.lang.Boolean.TRUE);
            if (!this.Ta) {
                this.iR.zx();
            }
            this.Ta = true;
            return bg(tuv);
        }
        com.bytedance.sdk.openadsdk.bg.IL.bg.bX bXVar2 = this.iR;
        if (bXVar2 == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.Kg.Fy fyEqN = bXVar2.eqN();
        fyEqN.setTag(520093762, java.lang.Boolean.TRUE);
        if (!this.Ta) {
            this.iR.zx();
        }
        this.Ta = true;
        return bg(fyEqN);
    }

    public com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView WR() {
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bg)) {
            com.bytedance.sdk.openadsdk.bg.IL.IL il = this.ldr;
            if (il != null) {
                android.view.View viewZx = il.zx();
                if (viewZx != null) {
                    if (viewZx.getParent() instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) viewZx.getParent()).removeView(viewZx);
                    }
                    com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaView = this.Kg;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.Kg.setOnTouchListener(null);
                    }
                    com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView pAGVideoMediaView = new com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView(this.IL, viewZx, this);
                    pAGVideoMediaView.setTag(520093762, java.lang.Boolean.TRUE);
                    if (this.VB != null && com.bytedance.sdk.openadsdk.core.settings.xxp.zU().eqN(java.lang.String.valueOf(this.bg.IGR()))) {
                        pAGVideoMediaView.setOnClickListener(this.VB);
                        pAGVideoMediaView.setOnTouchListener(this.VB);
                    } else {
                        com.bytedance.sdk.openadsdk.core.IL.bX bXVar = new com.bytedance.sdk.openadsdk.core.IL.bX() { // from class: com.bytedance.sdk.openadsdk.bg.IL.bg.2
                            @Override // com.bytedance.sdk.openadsdk.core.IL.bX
                            protected void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                                try {
                                    ((com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (java.lang.Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(bXVar);
                        pAGVideoMediaView.setOnTouchListener(bXVar);
                    }
                    this.Kg = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new java.lang.RuntimeException());
                return null;
            }
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new java.lang.RuntimeException());
            return null;
        }
        java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = this.bg.lM();
        if (listLM != null && !listLM.isEmpty()) {
            android.widget.ImageView imageView = new android.widget.ImageView(this.IL);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.core.model.Lq lq = listLM.get(0);
            if (lq != null) {
                com.bytedance.sdk.openadsdk.WR.eqN.bg(lq).bX(2).bg(com.bytedance.sdk.openadsdk.WR.bX.bg(this.bg, lq.bg(), imageView));
            }
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaViewBg = bg(imageView);
            if (this.VB != null && com.bytedance.sdk.openadsdk.core.settings.xxp.zU().eqN(java.lang.String.valueOf(this.bg.IGR()))) {
                pAGMediaViewBg.setOnClickListener(this.VB);
                pAGMediaViewBg.setOnTouchListener(this.VB);
            } else {
                pAGMediaViewBg.setOnClickListener(null);
                pAGMediaViewBg.setOnTouchListener(null);
            }
            pAGMediaViewBg.setTag(520093762, java.lang.Boolean.TRUE);
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaView2 = this.Kg;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.Kg.setOnTouchListener(null);
            }
            this.Kg = pAGMediaViewBg;
            return pAGMediaViewBg;
        }
        com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("images empty", "getMediaView return null", new java.lang.RuntimeException());
        return null;
    }

    private com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView bg(final android.view.View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
        }
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.WR;
        if (fy != null) {
            fy.setClickListener(null);
            this.WR.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.IL.IL il = this.PX;
        if (il != null && (il instanceof com.bytedance.sdk.openadsdk.core.Kg.WR) && (view instanceof com.bytedance.sdk.openadsdk.core.Kg.Fy)) {
            ((com.bytedance.sdk.openadsdk.core.Kg.Fy) view).setClickListener((com.bytedance.sdk.openadsdk.core.Kg.WR) il);
        }
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar = this.VB;
        if (bgVar != null && (bgVar instanceof com.bytedance.sdk.openadsdk.core.Kg.Kg) && (view instanceof com.bytedance.sdk.openadsdk.core.Kg.Fy)) {
            ((com.bytedance.sdk.openadsdk.core.Kg.Fy) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.Kg.Kg) bgVar);
        }
        com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView pAGMediaView = new com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView(this.IL) { // from class: com.bytedance.sdk.openadsdk.bg.IL.bg.3
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof com.bytedance.sdk.openadsdk.core.Kg.Fy) {
                    return;
                }
                bg(z);
            }

            private void bg(boolean z) {
                if (this.bg != null) {
                    com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.bg), z ? 4 : 8);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                com.bytedance.sdk.openadsdk.bg.IL.bg.this.bg(pAGVideoAdListener);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.bX.bg(this, com.bytedance.sdk.openadsdk.bg.IL.bg.this.bg);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof com.bytedance.sdk.openadsdk.core.Kg.Fy) {
            this.WR = (com.bytedance.sdk.openadsdk.core.Kg.Fy) view;
        }
        return pAGMediaView;
    }

    public android.view.View eo() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null) {
            com.bytedance.sdk.component.utils.PX.bg("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        imageView.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bg.IL.bg.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.bg.IL.bg.this.PX();
            }
        });
        return imageView;
    }

    public android.view.View VB() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() == null || (tuv = this.bg) == null) {
            com.bytedance.sdk.component.utils.PX.bg("TTNativeAdImpl", "getAdChoicesView mContext == null");
            return null;
        }
        if (!tuv.HXG() || !this.bg.Kg()) {
            return null;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        com.bytedance.sdk.openadsdk.xxp.bX.bg().bg((int) com.bytedance.sdk.openadsdk.utils.ZQc.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 14.0f, true), imageView, this.bg);
        return imageView;
    }

    public void PX() {
        android.content.Context context = this.IL;
        if (context != null) {
            com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(context, this.bg, this.bX);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.bg.IL.bg.bX bXVar;
        if (this.bg.tC() == 2 && com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.bg) && (bXVar = this.iR) != null && (bXVar instanceof com.bytedance.sdk.openadsdk.bg.IL.bg.IL)) {
            com.bytedance.sdk.openadsdk.core.Kg.tuV tuv = (com.bytedance.sdk.openadsdk.core.Kg.tuV) bXVar.eqN();
            if (tuv != null) {
                tuv.setVideoAdListener(IL(pAGVideoAdListener));
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.bg.IL.IL il = this.ldr;
        if (il != null) {
            il.bg(IL(pAGVideoAdListener));
        }
    }

    private com.bytedance.sdk.openadsdk.bg.IL.bX IL(final com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener) {
        return new com.bytedance.sdk.openadsdk.bg.IL.bX() { // from class: com.bytedance.sdk.openadsdk.bg.IL.bg.5
            @Override // com.bytedance.sdk.openadsdk.bg.IL.bX
            public void bg(int i, int i2) {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bg.IL.bX
            public void bg(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bg.IL.bX
            public void IL(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.bg.IL.bX
            public void bX(com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAd) {
                com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public void Ta() {
        com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar;
        java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.PX.ldr> weakReference = this.yDt;
        if (weakReference == null || (ldrVar = weakReference.get()) == null) {
            return;
        }
        ldrVar.bg(13);
    }

    public void bg(com.bytedance.sdk.openadsdk.core.PX.ldr ldrVar) {
        this.yDt = new java.lang.ref.WeakReference<>(ldrVar);
    }
}

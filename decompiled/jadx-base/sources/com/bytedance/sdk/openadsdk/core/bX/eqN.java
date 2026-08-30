package com.bytedance.sdk.openadsdk.core.bX;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd {
    protected final android.content.Context IL;
    private com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener Kg;
    private boolean PX;
    private boolean VB;
    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr WR;
    protected com.bytedance.sdk.openadsdk.core.model.tuV bX;
    protected com.bytedance.sdk.openadsdk.core.bX.bX bg;
    protected com.bytedance.sdk.openadsdk.AdSlot eqN;
    private final boolean iR;
    private boolean vb;
    private com.bytedance.sdk.openadsdk.core.Kg.Fy yDt;
    com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract zx;
    private final java.util.Queue<java.lang.Long> eo = new java.util.LinkedList();
    private java.lang.String Ta = "banner_ad";
    private final java.util.concurrent.atomic.AtomicBoolean Lq = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected final android.view.View.OnAttachStateChangeListener ldr = new android.view.View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            if (com.bytedance.sdk.openadsdk.core.bX.eqN.this.vb) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.bX.eqN eqn = com.bytedance.sdk.openadsdk.core.bX.eqN.this;
            eqn.bg(eqn.bg.getCurView(), com.bytedance.sdk.openadsdk.core.bX.eqN.this.bX);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            com.bytedance.sdk.openadsdk.core.bX.eqN.this.bg.bX();
        }
    };

    public interface bg {
        void bg();
    }

    public eqN(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        this.IL = context;
        this.bX = tuv;
        this.eqN = adSlot;
        bg(context, tuv, adSlot);
        this.iR = false;
        this.vb = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(java.lang.Double d) {
        if (this.VB) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.bX, d);
        this.VB = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(java.lang.Double d, java.lang.String str, java.lang.String str2) {
        if (this.PX) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.bX, d, str, str2);
        this.PX = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (tuv != null) {
            return tuv.jA();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.lang.Object getExtraInfo(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bX;
        if (tuv == null || tuv.jA() == null) {
            return null;
        }
        try {
            return this.bX.jA().get(str);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        com.bytedance.sdk.openadsdk.core.bX.zx zxVar = new com.bytedance.sdk.openadsdk.core.bX.zx(pAGBannerAdInteractionCallback);
        this.Kg = zxVar;
        this.bg.setExpressInteractionListener(zxVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        com.bytedance.sdk.openadsdk.core.bX.zx zxVar = new com.bytedance.sdk.openadsdk.core.bX.zx(pAGBannerAdInteractionListener);
        this.Kg = zxVar;
        this.bg.setExpressInteractionListener(zxVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public android.view.View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.IL.bg(this.bX);
        com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(this.IL, this.bX);
        return this.bg;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        com.bytedance.sdk.openadsdk.core.bX.bX bXVar = this.bg;
        if (bXVar != null) {
            try {
                bXVar.bX();
                this.bg.removeOnAttachStateChangeListener(this.ldr);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.bX.bX bXVar = new com.bytedance.sdk.openadsdk.core.bX.bX(context, tuv, adSlot);
        this.bg = bXVar;
        bXVar.addOnAttachStateChangeListener(this.ldr);
    }

    protected void bg(final com.bytedance.sdk.openadsdk.core.Kg.Fy fy, final com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        final com.bytedance.sdk.openadsdk.core.iR iRVar;
        if (fy == null || tuv == null) {
            return;
        }
        this.bX = tuv;
        this.WR = bg(tuv);
        this.yDt = fy;
        final java.lang.String strBg = com.bytedance.sdk.openadsdk.utils.rri.bg();
        final com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVarBg = bg();
        fy.setClosedListenerKey(strBg);
        fy.setBannerClickClosedListener(bgVarBg);
        fy.setBackupListener(new com.bytedance.sdk.component.adexpress.IL.bX() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.2
            @Override // com.bytedance.sdk.component.adexpress.IL.bX
            public boolean bg(android.view.ViewGroup viewGroup, int i) {
                try {
                    fy.PX();
                    if (com.bytedance.sdk.openadsdk.core.bX.eqN.this.bX.HXG()) {
                        com.bytedance.sdk.openadsdk.core.bX.iR iRVar2 = new com.bytedance.sdk.openadsdk.core.bX.iR(fy.getContext());
                        iRVar2.setClosedListenerKey(strBg);
                        iRVar2.bg(com.bytedance.sdk.openadsdk.core.bX.eqN.this.bX, fy, com.bytedance.sdk.openadsdk.core.bX.eqN.this.WR);
                        iRVar2.setDislikeOuter(com.bytedance.sdk.openadsdk.core.bX.eqN.this.zx);
                        iRVar2.setAdInteractionListener(com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg);
                        fy.setVastVideoHelper(iRVar2);
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.core.bX.bg bgVar = new com.bytedance.sdk.openadsdk.core.bX.bg(fy.getContext());
                    bgVar.setClosedListenerKey(strBg);
                    bgVar.bg(com.bytedance.sdk.openadsdk.core.bX.eqN.this.bX, fy, com.bytedance.sdk.openadsdk.core.bX.eqN.this.WR);
                    bgVar.setDislikeOuter(com.bytedance.sdk.openadsdk.core.bX.eqN.this.zx);
                    bgVar.setAdInteractionListener(com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg);
                    return true;
                } catch (java.lang.Exception unused) {
                    return false;
                }
            }
        });
        if (!this.iR) {
            com.bytedance.sdk.openadsdk.core.iR iRVarBg = bg(fy);
            if (iRVarBg == null) {
                iRVarBg = new com.bytedance.sdk.openadsdk.core.iR(this.IL, fy);
                fy.addView(iRVarBg);
            }
            iRVar = iRVarBg;
            iRVar.setCallback(new com.bytedance.sdk.openadsdk.core.iR.bg() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.3
                @Override // com.bytedance.sdk.openadsdk.core.iR.bg
                public void bg(boolean z) {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.bg(z, tuv);
                }

                @Override // com.bytedance.sdk.openadsdk.core.iR.bg
                public void bg() {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.bX();
                }

                @Override // com.bytedance.sdk.openadsdk.core.iR.bg
                public void IL() {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.bg(iRVar, false, tuv);
                }

                @Override // com.bytedance.sdk.openadsdk.core.iR.bg
                public void bg(android.view.View view) {
                    if (com.bytedance.sdk.openadsdk.core.bX.eqN.this.Lq.compareAndSet(false, true)) {
                        com.bytedance.sdk.openadsdk.core.bX.eqN.this.bg(view, fy, tuv, strBg, bgVarBg);
                    }
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.utils.LKE.bg(fy, true, 1, new com.bytedance.sdk.openadsdk.utils.LKE.IL() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.4
                @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
                public void bg(boolean z) {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.bg(z, tuv);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
                public void bg() {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.bX();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
                public void IL() {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.bg((com.bytedance.sdk.openadsdk.core.iR) null, true, tuv);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.LKE.IL
                public void bg(android.view.View view, boolean z) {
                    if (z && com.bytedance.sdk.openadsdk.core.bX.eqN.this.Lq.compareAndSet(false, true)) {
                        com.bytedance.sdk.openadsdk.core.bX.eqN.this.bg(view, fy, tuv, strBg, bgVarBg);
                    }
                }
            }, null);
            iRVar = null;
        }
        android.content.Context contextBg = fy != null ? com.bytedance.sdk.component.utils.IL.bg(fy) : null;
        if (contextBg == null) {
            contextBg = this.IL;
        }
        com.bytedance.sdk.openadsdk.core.Kg.WR wr = new com.bytedance.sdk.openadsdk.core.Kg.WR(contextBg, tuv, this.Ta, 2);
        wr.bg(fy);
        wr.bg(this);
        wr.bg(this.WR);
        wr.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.5
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i) {
                if (com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg != null) {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg.onAdClicked();
                }
            }
        });
        fy.setClickListener(wr);
        com.bytedance.sdk.openadsdk.core.Kg.Kg kg = new com.bytedance.sdk.openadsdk.core.Kg.Kg(this.IL, tuv, this.Ta, 2);
        kg.bg((android.view.View) fy);
        kg.bg(this);
        kg.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.6
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i) {
                if (com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg != null) {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg.onAdClicked();
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy2 = this.yDt;
        if (fy2 instanceof com.bytedance.sdk.openadsdk.core.Kg.tuV) {
            kg.bg(((com.bytedance.sdk.openadsdk.core.Kg.tuV) fy2).getVideoController());
        }
        kg.bg(this.WR);
        fy.setClickCreativeListener(kg);
        if (this.iR) {
            return;
        }
        iRVar.setNeedCheckingShow(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (z) {
            if (this.bX.vTg() && !this.bX.NU()) {
                this.bX.iR(true);
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.bX;
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv2, this.Ta, tuv2.dRo());
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[2];
        }
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.openadsdk.core.bX.eqN.IL(z, tuv, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX() {
        IL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.core.iR iRVar, boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        IL(tuv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(android.view.View view, com.bytedance.sdk.openadsdk.core.Kg.Fy fy, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVar) {
        com.bytedance.sdk.openadsdk.core.WR.IL().bg(str, bgVar);
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.util.Queue<java.lang.Long> queue = this.eo;
        if (queue != null) {
            queue.offer(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (fy != null) {
                jSONObject.put("dynamic_show_type", fy.getDynamicShowType());
                fy.bg(jSONObject, tuv);
            }
            if (view != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (java.lang.Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv, this.Ta, jSONObject);
        } catch (org.json.JSONException unused2) {
            com.bytedance.sdk.component.utils.PX.bg("PAGBannerAdImpl", "onShowFun json error");
        }
        com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.Kg;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, tuv.jz());
        }
        if (tuv.RFq()) {
            com.bytedance.sdk.openadsdk.utils.ayS.bg(tuv, view);
        }
        com.bytedance.sdk.openadsdk.core.bX.bX bXVar = this.bg;
        if (bXVar == null || bXVar.getCurView() == null) {
            return;
        }
        this.bg.getCurView().eo();
        this.bg.getCurView().Kg();
    }

    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv.jz() == 4) {
            return com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.IL, tuv, this.Ta);
        }
        return null;
    }

    private static class IL extends com.bytedance.sdk.component.Kg.Kg {
        com.bytedance.sdk.openadsdk.core.model.tuV IL;
        java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.bX.eqN> bX;
        boolean bg;

        IL(boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.bX.eqN eqn) {
            super("ReportWindowFocusChangedAdShow");
            this.bg = z;
            this.IL = tuv;
            this.bX = new java.lang.ref.WeakReference<>(eqn);
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.bX.eqN> weakReference = this.bX;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.bX.get().IL(this.bg, this.IL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        java.lang.Long lPoll;
        try {
            if (z) {
                this.eo.offer(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                if (this.eo.size() <= 0 || this.yDt == null || (lPoll = this.eo.poll()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.String.valueOf(java.lang.System.currentTimeMillis() - lPoll.longValue()), tuv, this.Ta, this.yDt.getAdShowTime());
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("PAGBannerAdImpl", e.getMessage());
        }
    }

    private com.bytedance.sdk.openadsdk.core.iR bg(android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.iR) {
                    return (com.bytedance.sdk.openadsdk.core.iR) childAt;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    private void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        java.util.Queue<java.lang.Long> queue = this.eo;
        if (queue == null || queue.size() <= 0 || tuv == null) {
            return;
        }
        try {
            long jLongValue = this.eo.poll().longValue();
            if (jLongValue <= 0 || this.yDt == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.String.valueOf(java.lang.System.currentTimeMillis() - jLongValue), tuv, this.Ta, this.yDt.getAdShowTime());
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("PAGBannerAdImpl", e.getMessage());
        }
    }

    public com.bytedance.sdk.openadsdk.core.bX.eqN.bg bg() {
        return new com.bytedance.sdk.openadsdk.core.bX.eqN.bg() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.7
            @Override // com.bytedance.sdk.openadsdk.core.bX.eqN.bg
            public void bg() {
                int width = com.bytedance.sdk.openadsdk.core.bX.eqN.this.yDt.getWidth();
                int height = com.bytedance.sdk.openadsdk.core.bX.eqN.this.yDt.getHeight();
                android.view.View viewBg = bg(((double) height) >= java.lang.Math.floor((((double) width) * 450.0d) / 600.0d));
                com.bytedance.sdk.openadsdk.core.bX.eqN.this.yDt.yDt();
                com.bytedance.sdk.openadsdk.core.bX.eqN.this.yDt.removeAllViews();
                com.bytedance.sdk.openadsdk.core.bX.eqN.this.yDt.addView(viewBg, new android.view.ViewGroup.LayoutParams(width, height));
                com.bytedance.sdk.openadsdk.core.bX.eqN.this.yDt.setClickCreativeListener(null);
                com.bytedance.sdk.openadsdk.core.bX.eqN.this.yDt.setClickListener(null);
                if (com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg != null) {
                    com.bytedance.sdk.openadsdk.core.bX.eqN.this.Kg.onAdDismissed();
                }
                com.bytedance.sdk.openadsdk.core.bX.eqN.this.vb = true;
            }

            private android.view.View bg(boolean z) {
                com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL);
                android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
                bXVar.setBackgroundColor(-1);
                bXVar.setLayoutParams(layoutParams);
                android.view.View view = new android.view.View(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL);
                android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(android.graphics.Color.parseColor("#F3F7F8"));
                bXVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.zx.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.zx.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL);
                android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    bXVar2.setBackground(com.bytedance.sdk.component.utils.Fy.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, "tt_ad_closed_background_300_250"));
                } else {
                    bXVar2.setBackground(com.bytedance.sdk.component.utils.Fy.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, "tt_ad_closed_background_320_50"));
                }
                bXVar.addView(bXVar2, layoutParams3);
                com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL);
                eqn.setId(520093739);
                android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, 16.0f);
                    layoutParams4.width = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, 77.0f);
                    layoutParams4.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, 14.0f);
                    layoutParams4.leftMargin = iBX;
                    layoutParams4.topMargin = iBX;
                } else {
                    int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, 8.0f);
                    layoutParams4.width = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, 45.0f);
                    layoutParams4.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, 8.18f);
                    layoutParams4.leftMargin = iBX2;
                    layoutParams4.topMargin = iBX2;
                }
                eqn.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, "tt_ad_closed_logo_red"));
                bXVar2.addView(eqn, layoutParams4);
                com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL);
                android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                kg.setAlpha(0.5f);
                kg.setLines(1);
                kg.setText(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, "tt_ad_is_closed"));
                if (z) {
                    kg.setTextSize(18.0f);
                } else {
                    kg.setTextSize(12.0f);
                }
                bXVar2.addView(kg, layoutParams5);
                android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bX.eqN.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view2) {
                        com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.bX.eqN.this.IL, com.bytedance.sdk.openadsdk.core.bX.eqN.this.bX, com.bytedance.sdk.openadsdk.core.bX.eqN.this.Ta);
                    }
                };
                eqn.setOnClickListener(onClickListener);
                kg.setOnClickListener(onClickListener);
                return bXVar;
            }
        };
    }

    public void IL() {
        this.bX.bg(android.os.SystemClock.elapsedRealtime());
        this.bg.IL();
    }
}

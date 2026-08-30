package com.bytedance.sdk.openadsdk.bg.IL;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.bg.IL.Kg implements com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX, com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN, com.bytedance.sdk.openadsdk.multipro.IL.bg.InterfaceC0162bg {
    private com.bytedance.sdk.openadsdk.bg.IL.bX Kg;
    private com.bytedance.sdk.openadsdk.AdSlot PX;
    private long Ta;
    private boolean VB;
    private final com.bytedance.sdk.openadsdk.multipro.IL.bg WR;
    private boolean eo;

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void h_() {
    }

    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        super(context, tuv, i, true);
        this.eo = false;
        this.VB = true;
        this.zx = i;
        this.PX = adSlot;
        this.WR = new com.bytedance.sdk.openadsdk.multipro.IL.bg();
        bg(this.ldr);
        bg("embeded_ad");
        this.eqN.bg(this);
    }

    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.bg.IL.bg bgVar, com.bytedance.sdk.openadsdk.core.xxp xxpVar) {
        super(context, tuv, i, false);
        this.eo = false;
        this.VB = true;
        this.eqN = bgVar;
        this.bg = xxpVar;
        this.zx = i;
        this.PX = adSlot;
        this.WR = new com.bytedance.sdk.openadsdk.multipro.IL.bg();
        bg(this.ldr);
        bg("embeded_ad");
        bgVar.bg(this);
    }

    public android.view.View zx() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar;
        if (this.IL != null && this.bX != null) {
            if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL)) {
                try {
                    ldrVar = new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr(this.bX, this.IL, this.bg.bg());
                    if (this.IL != null && this.IL.HXG()) {
                        com.bytedance.sdk.openadsdk.core.PX.ldr ldrVarBg = ldrVar.bg((java.util.List<android.util.Pair<android.view.View, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose>>) null);
                        if (this.eqN != null) {
                            this.eqN.bg(ldrVarBg);
                        }
                    }
                    this.bg.bg(ldrVar.getNativeVideoController());
                    if (this.eqN != null) {
                        this.eqN.bg(ldrVar);
                    }
                    ldrVar.setVideoAdClickListenerTTNativeAd(this);
                    ldrVar.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.bg.IL.IL.1
                        @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.bg
                        public void bg(android.view.View view, int i) {
                            if (com.bytedance.sdk.openadsdk.bg.IL.IL.this.bg != null) {
                                com.bytedance.sdk.openadsdk.bg.IL.IL.this.bg.bg(view, i);
                            }
                        }
                    });
                    ldrVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL() { // from class: com.bytedance.sdk.openadsdk.bg.IL.IL.2
                        @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr.IL
                        public void bg(boolean z, long j, long j2, long j3, boolean z2) {
                            com.bytedance.sdk.openadsdk.bg.IL.IL.this.WR.bg = z;
                            com.bytedance.sdk.openadsdk.bg.IL.IL.this.WR.zx = j;
                            com.bytedance.sdk.openadsdk.bg.IL.IL.this.WR.ldr = j2;
                            com.bytedance.sdk.openadsdk.bg.IL.IL.this.WR.iR = j3;
                            com.bytedance.sdk.openadsdk.bg.IL.IL.this.WR.eqN = z2;
                        }
                    });
                    ldrVar.setVideoAdLoadListener(this);
                    ldrVar.setVideoAdInteractionListener(this);
                    if (5 == this.zx) {
                        ldrVar.setIsAutoPlay(this.eo ? this.PX.isAutoPlay() : this.VB);
                    } else {
                        ldrVar.setIsAutoPlay(this.VB);
                    }
                    ldrVar.setIsQuiet(com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX(java.lang.String.valueOf(this.ldr)));
                } catch (java.lang.Exception e) {
                    com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("", "getAdView null", e);
                    ldrVar = null;
                }
            } else {
                ldrVar = null;
            }
            if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.IL) && ldrVar != null && ldrVar.bg(0L, true, false)) {
                return ldrVar;
            }
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError(this.IL.bOf() + "," + ldrVar, "getAdView null", new java.lang.RuntimeException());
        }
        return null;
    }

    private void bg(int i) {
        int iIL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(i);
        int iBX = com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (3 == iIL) {
            this.eo = false;
            this.VB = false;
        } else {
            if (1 == iIL && com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX)) {
                this.eo = false;
            } else if (2 == iIL) {
                if (com.bytedance.sdk.openadsdk.utils.ayS.zx(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX)) {
                    this.eo = false;
                }
            } else if (4 == iIL) {
                this.eo = true;
            } else if (5 == iIL && (com.bytedance.sdk.openadsdk.utils.ayS.eqN(iBX) || com.bytedance.sdk.openadsdk.utils.ayS.ldr(iBX))) {
            }
            this.VB = true;
        }
        if (this.eqN != null) {
            this.eqN.bg(this.eo);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.bg.IL.bX bXVar) {
        this.Kg = bXVar;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.eqN
    public void bg(int i, int i2) {
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.bg(i, i2);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void d_() {
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.bg(this);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void g_() {
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.IL(this);
        }
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void bg(long j, long j2) {
        this.Ta = j;
    }

    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.InterfaceC0071bX
    public void i_() {
        com.bytedance.sdk.openadsdk.bg.IL.bX bXVar = this.Kg;
        if (bXVar != null) {
            bXVar.bX(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.IL.bg.InterfaceC0162bg
    public com.bytedance.sdk.openadsdk.multipro.IL.bg ldr() {
        return this.WR;
    }

    @Override // com.bytedance.sdk.openadsdk.bg.IL.Kg
    protected void bg(java.lang.String str) {
        super.bg(str);
    }

    @Override // com.bytedance.sdk.openadsdk.bg.IL.Kg, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        if (this.eqN != null) {
            this.eqN.PX();
        }
    }
}

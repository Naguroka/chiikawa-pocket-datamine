package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
class ldr extends com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd {
    private final com.bytedance.sdk.openadsdk.core.model.bg IL;
    private boolean Kg;
    private boolean WR;
    private com.bytedance.sdk.openadsdk.bg.bX.IL bX;
    private final android.content.Context bg;
    private final java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private boolean ldr = false;
    private boolean eqN = false;
    private final java.lang.String iR = com.bytedance.sdk.openadsdk.utils.rri.bg();

    ldr(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        this.bg = context;
        this.IL = bgVar;
    }

    public void bg(boolean z) {
        this.ldr = z;
    }

    public void bg() {
        if (this.zx.get()) {
            return;
        }
        this.eqN = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.bX = new com.bytedance.sdk.openadsdk.component.bX.bg(pAGInterstitialAdInteractionListener);
        bg(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.bX = new com.bytedance.sdk.openadsdk.component.bX.bg(pAGInterstitialAdInteractionCallback);
        bg(1);
    }

    private static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return false;
        }
        int iVb = tuv.vb();
        return (tuv.tC() != 2 || iVb == 5 || iVb == 33 || iVb == 6 || iVb == 19 || iVb == 12) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(android.app.Activity activity) {
        android.content.Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.PX.bg("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.bg bgVar = this.IL;
        if (bgVar == null || !bgVar.eqN()) {
            return;
        }
        boolean zLdr = this.IL.ldr();
        final com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = this.IL.zx();
        if (!com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL()) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuvZx, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.PX.bg("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new java.lang.IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = this.IL.bX();
        if (listBX != null) {
            java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = listBX.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(this.bg, it.next());
            }
        }
        if (this.zx.get()) {
            return;
        }
        this.zx.set(true);
        if (tuvZx == null || (tuvZx.Dxa() == null && tuvZx.lM() == null)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(tuvZx, "fullscreen_interstitial_ad", "materialMeta error ");
            return;
        }
        android.content.Context contextBg = activity == null ? this.bg : activity;
        if (contextBg == null) {
            contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IEI() && com.bytedance.sdk.openadsdk.component.reward.Kg.bg(this.IL)) {
            intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTAdActivity.class);
        } else if (zLdr) {
            intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.class);
        } else if (bg(tuvZx)) {
            if (com.bytedance.sdk.openadsdk.component.reward.IL.Kg.bg(tuvZx)) {
                intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity.class);
            } else {
                intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.class);
            }
        } else if (com.bytedance.sdk.openadsdk.component.reward.IL.Kg.bg(tuvZx)) {
            intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity.class);
        } else {
            intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.class);
        }
        android.content.Intent intent2 = intent;
        intent2.putExtra("start_show_time", android.os.SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(intent2, activity, this.eqN, this.IL, this.iR);
        intent2.putExtra("is_verity_playable", this.ldr);
        if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.core.JAA.bg().bg(this.bX);
            this.bX = null;
        }
        final boolean z = com.bytedance.sdk.openadsdk.Fy.bg.bg("start_activity_async", 0) == 1;
        if (z) {
            com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.ldr.1
                @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                    com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                    bgVar2.IL("start_activity");
                    bgVar2.eqN("fullscreen_interstitial_ad");
                    return bgVar2;
                }
            });
        }
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.IL.bg(contextBg, intent2, new com.bytedance.sdk.component.utils.IL.InterfaceC0117IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.ldr.2
            @Override // com.bytedance.sdk.component.utils.IL.InterfaceC0117IL
            public void bg() {
                if (com.bytedance.sdk.openadsdk.component.reward.ldr.this.ldr) {
                    try {
                        com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(tuvZx.Dxa().PX());
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (z) {
                    com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.ldr.2.1
                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                            bgVar2.IL("start_activity");
                            bgVar2.eqN("fullscreen_interstitial_ad");
                            return bgVar2;
                        }
                    });
                    final long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.yDt.bX.bg("start_activity_action", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.ldr.2.2
                        @Override // com.bytedance.sdk.openadsdk.yDt.IL
                        public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("duration", jElapsedRealtime2);
                            return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("start_activity_action").IL(jSONObject.toString());
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.utils.IL.InterfaceC0117IL
            public void bg(java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                if (com.bytedance.sdk.openadsdk.component.reward.ldr.this.ldr) {
                    try {
                        com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(tuvZx.Dxa().PX(), -1, th != null ? th.getMessage() : "playable tool error open");
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuvZx, "fullscreen_interstitial_ad", "activity start  fail ");
                if (z) {
                    com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.ldr.2.3
                        @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                        public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                            com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                            bgVar2.IL("start_activity");
                            bgVar2.eqN("fullscreen_interstitial_ad");
                            return bgVar2;
                        }
                    });
                }
            }
        }, true);
        if (zLdr) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.bg.bg(this.IL.zx(), this.eqN, false);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.util.Map<java.lang.String, java.lang.Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.bg bgVar = this.IL;
        if (bgVar == null || bgVar.zx() == null) {
            return null;
        }
        return this.IL.zx().jA();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public java.lang.Object getExtraInfo(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.bg bgVar = this.IL;
        if (bgVar == null || bgVar.zx() == null || this.IL.zx().jA() == null) {
            return null;
        }
        try {
            return this.IL.zx().jA().get(str);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTFullScreenVideoAdImpl", th.getMessage());
            return null;
        }
    }

    private void bg(final int i) {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.ldr.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg bgVarBg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg();
                    if (i != 1 || com.bytedance.sdk.openadsdk.component.reward.ldr.this.bX == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX bXVar = new com.bytedance.sdk.openadsdk.multipro.aidl.IL.bX(com.bytedance.sdk.openadsdk.component.reward.ldr.this.bX);
                    com.bytedance.sdk.openadsdk.IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx.asInterface(bgVarBg.bg(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(com.bytedance.sdk.openadsdk.component.reward.ldr.this.iR, bXVar);
                        } catch (android.os.RemoteException e) {
                            com.bytedance.sdk.component.utils.PX.bg("TTFullScreenVideoAdImpl", e.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(java.lang.Double d) {
        if (this.Kg) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.IL.zx(), d);
        this.Kg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(java.lang.Double d, java.lang.String str, java.lang.String str2) {
        if (this.WR) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.DDQ.bg(this.IL.zx(), d, str, str2);
        this.WR = true;
    }
}

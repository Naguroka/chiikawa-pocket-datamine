package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
class Kg extends com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd {
    private final com.bytedance.sdk.openadsdk.core.model.bg IL;
    private boolean Kg;
    private boolean WR;
    private final com.bytedance.sdk.openadsdk.AdSlot bX;
    private final android.content.Context bg;
    private com.bytedance.sdk.openadsdk.bg.zx.bg eqN;
    private boolean zx;
    private final java.util.concurrent.atomic.AtomicBoolean ldr = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.lang.String iR = com.bytedance.sdk.openadsdk.utils.rri.bg();

    Kg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        this.bg = context;
        this.IL = bgVar;
        this.bX = adSlot;
    }

    public void bg() {
        if (this.ldr.get()) {
            return;
        }
        this.zx = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.eqN = new com.bytedance.sdk.openadsdk.component.reward.WR(pAGRewardedAdInteractionListener);
        bg(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.eqN = new com.bytedance.sdk.openadsdk.component.reward.WR(pAGRewardedAdInteractionCallback);
        bg(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(android.app.Activity activity) {
        android.content.Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.PX.bg("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
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
            com.bytedance.sdk.component.utils.PX.bg("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new java.lang.IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = this.IL.bX();
        if (listBX != null) {
            java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = listBX.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(this.bg, it.next());
            }
        }
        if (this.ldr.compareAndSet(false, true)) {
            if (tuvZx == null || tuvZx.Dxa() == null) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuvZx, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            android.content.Context contextBg = activity == null ? this.bg : activity;
            if (contextBg == null) {
                contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
            }
            if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IEI() && bg(this.IL)) {
                intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTAdActivity.class);
            } else if (zLdr || bg(tuvZx)) {
                intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.class);
            } else {
                intent = new android.content.Intent(contextBg, (java.lang.Class<?>) com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.class);
            }
            android.content.Intent intent2 = intent;
            com.bytedance.sdk.openadsdk.component.reward.bg.IL.bg(intent2, activity, this.zx, this.IL, this.iR);
            intent2.putExtra("media_extra", this.bX.getMediaExtra());
            intent2.putExtra("user_id", this.bX.getUserID());
            intent2.putExtra("start_show_time", android.os.SystemClock.elapsedRealtime());
            if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                com.bytedance.sdk.openadsdk.core.JAA.bg().bg(this.eqN);
                this.eqN = null;
            }
            final boolean z = com.bytedance.sdk.openadsdk.Fy.bg.bg("start_activity_async", 0) == 1;
            if (z) {
                com.bytedance.sdk.openadsdk.p002vb.eqN.bg(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kg.1
                    @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                    public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                        com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                        bgVar2.IL("start_activity");
                        bgVar2.eqN("rewarded_video");
                        return bgVar2;
                    }
                });
            }
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.bytedance.sdk.component.utils.IL.bg(contextBg, intent2, new com.bytedance.sdk.component.utils.IL.InterfaceC0117IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kg.2
                @Override // com.bytedance.sdk.component.utils.IL.InterfaceC0117IL
                public void bg() {
                    if (z) {
                        com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kg.2.1
                            @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                            public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                bgVar2.IL("start_activity");
                                bgVar2.eqN("rewarded_video");
                                return bgVar2;
                            }
                        });
                        final long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                        com.bytedance.sdk.openadsdk.yDt.bX.bg("start_activity_action", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kg.2.2
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
                    com.bytedance.sdk.component.utils.PX.bg("TTRewardVideoAdImpl", "show reward video error: ", th);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(tuvZx, "fullscreen_interstitial_ad", "activity start  fail ");
                    if (z) {
                        com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kg.2.3
                            @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                            public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                                com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                                bgVar2.IL("start_activity");
                                bgVar2.eqN("rewarded_video");
                                return bgVar2;
                            }
                        });
                    }
                }
            }, true);
            if (zLdr) {
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.bg.bg(this.IL.zx(), this.zx, true);
        }
    }

    private static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return false;
        }
        int iVb = tuv.vb();
        return (tuv.tC() != 2 || iVb == 5 || iVb == 33 || iVb == 6 || iVb == 19 || iVb == 12) ? false : true;
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
            com.bytedance.sdk.component.utils.PX.bg("TTRewardVideoAdImpl", th.getMessage());
            return null;
        }
    }

    private void bg(final int i) {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.Kg.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.bg bgVarBg = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg();
                    if (i != 0 || com.bytedance.sdk.openadsdk.component.reward.Kg.this.eqN == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN eqn = new com.bytedance.sdk.openadsdk.multipro.aidl.IL.eqN(com.bytedance.sdk.openadsdk.component.reward.Kg.this.eqN);
                    com.bytedance.sdk.openadsdk.IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR.asInterface(bgVarBg.bg(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(com.bytedance.sdk.openadsdk.component.reward.Kg.this.iR, eqn);
                        } catch (android.os.RemoteException e) {
                            com.bytedance.sdk.component.utils.PX.bg("TTRewardVideoAdImpl", e.getMessage());
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

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuvZx;
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa;
        java.lang.String strPX;
        if (bgVar == null || (tuvZx = bgVar.zx()) == null) {
            return false;
        }
        java.lang.String strBg = com.bytedance.sdk.openadsdk.Fy.bg.bg("rviv_new_arch_not_support_style", (java.lang.String) null);
        if (android.text.TextUtils.isEmpty(strBg)) {
            return true;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(strBg);
            for (int i = 0; i < jSONArray.length(); i++) {
                int i2 = jSONArray.getInt(i);
                if (i2 != 0) {
                    if (tuvZx.vb() == i2) {
                        return false;
                    }
                    if (i2 == 8 && (ilDxa = tuvZx.Dxa()) != null && (strPX = ilDxa.PX()) != null && android.net.Uri.parse(strPX).getQueryParameterNames().contains("show_landingpage")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }
}

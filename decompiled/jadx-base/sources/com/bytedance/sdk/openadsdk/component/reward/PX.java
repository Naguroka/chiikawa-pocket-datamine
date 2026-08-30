package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
public class PX {
    private static volatile com.bytedance.sdk.openadsdk.component.reward.PX bg;
    private final android.content.Context IL;
    private final java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.List<com.bytedance.sdk.openadsdk.component.reward.PX.IL> eqN = java.util.Collections.synchronizedList(new java.util.ArrayList());
    private final com.bytedance.sdk.component.utils.rri.bg ldr = new com.bytedance.sdk.component.utils.rri.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.7
        @Override // com.bytedance.sdk.component.utils.rri.bg
        public void bg(android.content.Context context, android.content.Intent intent, boolean z, int i) {
            if (z) {
                if (com.bytedance.sdk.openadsdk.component.reward.PX.this.zx == null) {
                    com.bytedance.sdk.openadsdk.component.reward.PX.this.zx = new com.bytedance.sdk.openadsdk.component.reward.IL("net connect task", com.bytedance.sdk.openadsdk.component.reward.PX.this.eqN);
                }
                com.bytedance.sdk.component.utils.iR.bg().post(com.bytedance.sdk.openadsdk.component.reward.PX.this.zx);
            }
        }
    };
    private com.bytedance.sdk.component.Kg.Kg zx;

    public static com.bytedance.sdk.openadsdk.component.reward.PX bg(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.component.reward.PX.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.component.reward.PX(context);
                }
            }
        }
        return bg;
    }

    private PX(android.content.Context context) {
        this.IL = context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context.getApplicationContext();
        IL();
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (adSlot == null || android.text.TextUtils.isEmpty(adSlot.getCodeId()) || !android.text.TextUtils.isEmpty(adSlot.getBidAdm()) || com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg(adSlot.getCodeId(), false) != null) {
            return;
        }
        bg(adSlot, true, null);
    }

    public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg(str, tuv);
    }

    public void bg() {
        try {
            com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        IL(adSlot, pAGRewardedAdLoadListener);
    }

    private void IL(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (android.text.TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.model.bg bgVarBg = com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg(adSlot.getCodeId(), true);
            if (bgVarBg != null && bgVarBg.eqN()) {
                com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = bgVarBg.zx();
                for (com.bytedance.sdk.openadsdk.core.model.tuV tuv : bgVarBg.bX()) {
                    if (tuv.VW() == null) {
                        tuv.bg(adSlot);
                    }
                }
                com.bytedance.sdk.openadsdk.component.reward.yDt ydt = new com.bytedance.sdk.openadsdk.component.reward.yDt(this.IL, bgVarBg, adSlot);
                if (!bgVarBg.ldr() && !com.bytedance.sdk.openadsdk.core.model.rri.bX(tuvZx)) {
                    ydt.IL();
                }
                if (pAGRewardedAdLoadListener != null) {
                    if (!bgVarBg.ldr() && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 0) {
                        bg(adSlot, bgVarBg, pAGRewardedAdLoadListener, (com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd) ydt.bg(), true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.PX.bX bXVar = new com.bytedance.sdk.openadsdk.component.reward.PX.bX(new com.bytedance.sdk.openadsdk.component.reward.PX.bg(this.IL, adSlot, bgVarBg, pAGRewardedAdLoadListener, true), bgVarBg);
                    for (int i = 0; i < bgVarBg.bX().size(); i++) {
                        bg(bgVarBg.bX().get(i), adSlot, bXVar, ydt, bgVarBg.ldr());
                        if (bgVarBg.VB()) {
                            break;
                        }
                    }
                }
                for (int i2 = 0; i2 < bgVarBg.bX().size(); i2++) {
                    com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(bgVarBg.bX().get(i2), new com.bytedance.sdk.openadsdk.core.Ta.bX.bg.InterfaceC0139bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.1
                    });
                }
                return;
            }
        }
        bg(adSlot, false, pAGRewardedAdLoadListener);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.component.reward.PX.bX bXVar, final com.bytedance.sdk.openadsdk.component.reward.yDt ydt, final boolean z) {
        boolean z2;
        boolean z3 = false;
        if (bXVar != null) {
            z2 = true;
            if (!z && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv)) {
            z3 = z2;
        } else {
            com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(tuv.uV()).bg(), tuv);
            ilBg.bg("material_meta", tuv);
            ilBg.bg("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.2
                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i) {
                    android.util.Log.d("RewardVideoLoadManager", "onVideoPreloadSuccess: ");
                    if (bXVar != null) {
                        if (z || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                            bXVar.onAdLoaded(ydt.bg());
                        }
                    }
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i, java.lang.String str) {
                    if (bXVar != null) {
                        if (z || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                            bXVar.onError(i, str);
                        }
                    }
                }
            });
        }
        if (z3) {
            bXVar.onAdLoaded(ydt.bg());
        }
    }

    private void bg(final com.bytedance.sdk.openadsdk.AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.PX.eqN()) {
            com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.LZ lz = new com.bytedance.sdk.openadsdk.core.model.LZ();
        lz.IL = z ? 2 : 1;
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().PX(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            lz.Kg = 2;
        }
        com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(adSlot, lz, 7, new com.bytedance.sdk.openadsdk.core.Fy.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.3
            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (z || (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) == null) {
                    return;
                }
                pAGRewardedAdLoadListener2.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
                com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
                if (bgVar.bX() != null && !bgVar.bX().isEmpty()) {
                    com.bytedance.sdk.openadsdk.component.reward.yDt ydt = new com.bytedance.sdk.openadsdk.component.reward.yDt(com.bytedance.sdk.openadsdk.component.reward.PX.this.IL, bgVar, adSlot);
                    if (!z) {
                        if (!android.text.TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.tuV.bg.eqN.bg().bg(bgVar.bX().isEmpty() ? null : bgVar.bX().get(0));
                            com.bytedance.sdk.openadsdk.yDt.bX.bg(bgVar.zx(), java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        if (!bgVar.ldr() && pAGRewardedAdLoadListener != null && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 0) {
                            com.bytedance.sdk.openadsdk.component.reward.PX.this.bg(adSlot, bgVar, pAGRewardedAdLoadListener, (com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd) ydt.bg(), false);
                        }
                    }
                    com.bytedance.sdk.openadsdk.component.reward.PX.bX bXVar = new com.bytedance.sdk.openadsdk.component.reward.PX.bX(new com.bytedance.sdk.openadsdk.component.reward.PX.bg(com.bytedance.sdk.openadsdk.component.reward.PX.this.IL, adSlot, bgVar, pAGRewardedAdLoadListener, false), bgVar);
                    for (int i = 0; i < bgVar.bX().size(); i++) {
                        com.bytedance.sdk.openadsdk.component.reward.PX.this.bg(bgVar, bgVar.bX().get(i), ydt, adSlot, z, bXVar, bgVar.ldr());
                        if (bgVar.VB()) {
                            return;
                        }
                    }
                    return;
                }
                if (z || (pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener) == null) {
                    return;
                }
                pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.Kg.bg(-3));
                il.bg(-3);
                com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.component.reward.yDt ydt, final com.bytedance.sdk.openadsdk.AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.component.reward.PX.bX bXVar, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(tuv, new com.bytedance.sdk.openadsdk.core.Ta.bX.bg.InterfaceC0139bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.4
        });
        boolean z3 = true;
        if (z && !com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) && com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(adSlot.getCodeId()).eqN == 1 && !com.bytedance.sdk.component.utils.Lq.eqN(this.IL)) {
            bg(new com.bytedance.sdk.openadsdk.component.reward.PX.IL(tuv, adSlot, bgVar));
            return;
        }
        boolean z4 = false;
        if (bXVar == null || (!z2 && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() != 1)) {
            z3 = false;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv)) {
            if (tuv.Dxa() != null) {
                com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(tuv.uV()).bg(), tuv);
                ilBg.bg("material_meta", tuv);
                ilBg.bg("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.5
                    @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i) {
                        ydt.IL();
                        if (z) {
                            com.bytedance.sdk.openadsdk.component.reward.VB.bg(com.bytedance.sdk.openadsdk.component.reward.PX.this.IL).bg(adSlot, bgVar);
                        } else if (bXVar != null) {
                            if (z2 || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                                bXVar.onAdLoaded(ydt.bg());
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar2, int i, java.lang.String str) {
                        if (bXVar != null) {
                            if (z2 || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                                bXVar.onError(i, str);
                            }
                        }
                    }
                });
            } else {
                z4 = z3;
            }
            z3 = z4;
        } else if (z) {
            com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg(adSlot, bgVar);
        }
        if (z3) {
            bXVar.onAdLoaded(ydt.bg());
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.PX$6, reason: invalid class name */
    class AnonymousClass6 implements com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg<java.lang.Object> {
        final /* synthetic */ com.bytedance.sdk.openadsdk.component.reward.yDt IL;
        final /* synthetic */ com.bytedance.sdk.openadsdk.AdSlot bX;
        final /* synthetic */ boolean bg;
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.bg eqN;
        final /* synthetic */ boolean ldr;
        final /* synthetic */ com.bytedance.sdk.openadsdk.component.reward.PX.bX zx;

        AnonymousClass6(boolean z, com.bytedance.sdk.openadsdk.component.reward.yDt ydt, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.component.reward.PX.bX bXVar, boolean z2) {
            this.bg = z;
            this.IL = ydt;
            this.bX = adSlot;
            this.eqN = bgVar;
            this.zx = bXVar;
            this.ldr = z2;
        }

        @Override // com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg
        public void bg(boolean z, java.lang.Object obj) {
            if (z) {
                this.IL.IL();
            }
            if (this.bg) {
                if (z) {
                    com.bytedance.sdk.openadsdk.component.reward.VB.bg(com.bytedance.sdk.openadsdk.component.reward.PX.this.IL).bg(this.bX, this.eqN);
                }
            } else {
                if (z) {
                    if (this.zx != null) {
                        if (this.ldr || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                            this.zx.onAdLoaded(this.IL.bg());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.zx != null) {
                    if (this.ldr || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                        this.zx.onError(-1, "");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pAGRewardedAd, boolean z) {
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
        int iIL = com.bytedance.sdk.openadsdk.component.reward.zx.IL();
        if (!z) {
            if (iIL == 2) {
                com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg(adSlot, bgVar);
                IL(adSlot);
                return;
            }
            return;
        }
        if (iIL == 2) {
            IL(adSlot);
        } else if (iIL == 1) {
            com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg(adSlot.getCodeId(), (com.bytedance.sdk.openadsdk.core.model.tuV) null);
        }
    }

    private void IL(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (com.bytedance.sdk.openadsdk.component.reward.zx.IL() != 2) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.VB.bg(this.IL).bg(adSlot.getCodeId());
    }

    private void bg(com.bytedance.sdk.openadsdk.component.reward.PX.IL il) {
        if (il == null) {
            return;
        }
        if (this.eqN.size() > 0) {
            this.eqN.remove(0);
        }
        this.eqN.add(il);
    }

    private void IL() {
        if (this.bX.get()) {
            return;
        }
        this.bX.set(true);
        com.bytedance.sdk.component.utils.rri.bg(this.ldr, this.IL);
    }

    private void bX() {
        if (this.bX.get()) {
            this.bX.set(false);
            try {
                com.bytedance.sdk.component.utils.rri.bg(this.ldr);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        if (this.zx != null) {
            try {
                com.bytedance.sdk.component.utils.iR.bg().removeCallbacks(this.zx);
            } catch (java.lang.Exception unused) {
            }
            this.zx = null;
        }
        bX();
    }

    public static class IL extends com.bytedance.sdk.component.Kg.Kg {
        final com.bytedance.sdk.openadsdk.AdSlot IL;
        final com.bytedance.sdk.openadsdk.core.model.bg bX;
        final com.bytedance.sdk.openadsdk.core.model.tuV bg;

        IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
            super("Reward Task");
            this.bg = tuv;
            this.IL = adSlot;
            this.bX = bgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.bg == null || this.bg.Dxa() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(this.bg.uV()).bg(), this.bg);
            ilBg.bg("material_meta", this.bg);
            ilBg.bg("ad_slot", this.IL);
            com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.IL.1
                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i, java.lang.String str) {
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i) {
                    com.bytedance.sdk.openadsdk.component.reward.VB.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(com.bytedance.sdk.openadsdk.component.reward.PX.IL.this.IL, com.bytedance.sdk.openadsdk.component.reward.PX.IL.this.bX);
                }
            });
        }

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.PX$IL$2, reason: invalid class name */
        class AnonymousClass2 implements com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg<java.lang.Object> {
            AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg
            public void bg(boolean z, java.lang.Object obj) {
                if (z) {
                    com.bytedance.sdk.openadsdk.component.reward.VB.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(com.bytedance.sdk.openadsdk.component.reward.PX.IL.this.IL, com.bytedance.sdk.openadsdk.component.reward.PX.IL.this.bX);
                }
            }
        }
    }

    private static class bg implements com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.AdSlot IL;
        private final com.bytedance.sdk.openadsdk.core.model.bg bX;
        private final android.content.Context bg;
        private final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener eqN;
        private final boolean zx;

        public bg(android.content.Context context, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z) {
            this.bg = context;
            this.IL = adSlot;
            this.bX = bgVar;
            this.eqN = pAGRewardedAdLoadListener;
            this.zx = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
        public void onError(int i, java.lang.String str) {
            com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.eqN;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pAGRewardedAd) {
            com.bytedance.sdk.openadsdk.component.reward.PX.bg(this.bg).bg(this.IL, this.bX, this.eqN, pAGRewardedAd, this.zx);
        }
    }

    private static class bX implements com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener {
        private final java.util.concurrent.atomic.AtomicBoolean IL;
        private final java.util.concurrent.atomic.AtomicInteger bX;
        private final com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener bg;
        private final com.bytedance.sdk.openadsdk.core.model.bg eqN;

        private bX(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
            this.IL = new java.util.concurrent.atomic.AtomicBoolean(false);
            this.bg = pAGRewardedAdLoadListener;
            this.eqN = bgVar;
            this.bX = new java.util.concurrent.atomic.AtomicInteger(bg());
        }

        private int bg() {
            if (!this.eqN.eqN()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.eqN.bX().size(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.eqN.bX().get(i2);
                if (tuv != null && !com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) && tuv.Dxa() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
        public void onError(int i, java.lang.String str) {
            if (this.bX.decrementAndGet() > 0 || this.bg == null || !this.IL.compareAndSet(false, true)) {
                return;
            }
            this.bg.onError(i, str);
            com.bytedance.sdk.openadsdk.yDt.bX.bg("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.PX.bX.1
                @Override // com.bytedance.sdk.openadsdk.yDt.IL
                public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("req_id", com.bytedance.sdk.openadsdk.component.reward.PX.bX.this.eqN.bg());
                    return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("choose_ad_load_error").IL(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd pAGRewardedAd) {
            this.bX.decrementAndGet();
            if (this.bg == null || !this.IL.compareAndSet(false, true)) {
                return;
            }
            this.bg.onAdLoaded(pAGRewardedAd);
        }
    }
}

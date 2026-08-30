package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    private static volatile com.bytedance.sdk.openadsdk.component.reward.zx bg;
    private final android.content.Context IL;
    private final java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.List<com.bytedance.sdk.openadsdk.component.reward.zx.bX> eqN = java.util.Collections.synchronizedList(new java.util.ArrayList());
    private final com.bytedance.sdk.component.utils.rri.bg ldr = new com.bytedance.sdk.component.utils.rri.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.7
        @Override // com.bytedance.sdk.component.utils.rri.bg
        public void bg(android.content.Context context, android.content.Intent intent, boolean z, int i) {
            if (z) {
                if (com.bytedance.sdk.openadsdk.component.reward.zx.this.zx == null) {
                    com.bytedance.sdk.openadsdk.component.reward.zx.this.zx = new com.bytedance.sdk.openadsdk.component.reward.IL("fsv net connect task", com.bytedance.sdk.openadsdk.component.reward.zx.this.eqN);
                }
                com.bytedance.sdk.component.utils.iR.bg().post(com.bytedance.sdk.openadsdk.component.reward.zx.this.zx);
            }
        }
    };
    private com.bytedance.sdk.component.Kg.Kg zx;

    public static com.bytedance.sdk.openadsdk.component.reward.zx bg(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.component.reward.zx.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.component.reward.zx(context);
                }
            }
        }
        return bg;
    }

    private zx(android.content.Context context) {
        this.IL = context == null ? com.bytedance.sdk.openadsdk.core.VzQ.bg() : context.getApplicationContext();
        bX();
    }

    public void bg() {
        try {
            com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg();
        } catch (java.lang.Throwable unused) {
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (adSlot == null || android.text.TextUtils.isEmpty(adSlot.getCodeId()) || !android.text.TextUtils.isEmpty(adSlot.getBidAdm()) || com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(adSlot.getCodeId(), false) != null) {
            return;
        }
        bg(adSlot, true, com.bytedance.sdk.openadsdk.utils.daV.bg(), null);
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        IL(adSlot, pAGInterstitialAdLoadListener);
    }

    private void IL(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        com.bytedance.sdk.openadsdk.utils.daV davBg = com.bytedance.sdk.openadsdk.utils.daV.bg();
        if (android.text.TextUtils.isEmpty(adSlot.getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.model.bg bgVarBg = com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(adSlot.getCodeId(), true);
            if (bgVarBg != null && bgVarBg.eqN()) {
                com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = bgVarBg.zx();
                for (com.bytedance.sdk.openadsdk.core.model.tuV tuv : bgVarBg.bX()) {
                    if (tuv.VW() == null) {
                        tuv.bg(adSlot);
                    }
                }
                com.bytedance.sdk.openadsdk.component.reward.Ta ta = new com.bytedance.sdk.openadsdk.component.reward.Ta(this.IL, bgVarBg);
                if (!bgVarBg.ldr() && !com.bytedance.sdk.openadsdk.core.model.rri.bX(tuvZx)) {
                    ta.IL();
                }
                if (pAGInterstitialAdLoadListener != null) {
                    if (!bgVarBg.ldr() && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 0) {
                        bg(adSlot, bgVarBg, pAGInterstitialAdLoadListener, ta.bg(), true);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zx.IL il = new com.bytedance.sdk.openadsdk.component.reward.zx.IL(new com.bytedance.sdk.openadsdk.component.reward.zx.bg(this.IL, adSlot, bgVarBg, pAGInterstitialAdLoadListener, true), bgVarBg);
                    for (int i = 0; i < bgVarBg.bX().size(); i++) {
                        bg(bgVarBg.bX().get(i), adSlot, il, davBg, ta, bgVarBg.ldr());
                        if (bgVarBg.VB()) {
                            break;
                        }
                    }
                }
                for (int i2 = 0; i2 < bgVarBg.bX().size(); i2++) {
                    com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(bgVarBg.bX().get(i2), new com.bytedance.sdk.openadsdk.core.Ta.bX.bg.InterfaceC0139bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.1
                    });
                }
                return;
            }
        }
        bg(adSlot, false, davBg, pAGInterstitialAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd pAGInterstitialAd, boolean z) {
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
        int iIL = IL();
        if (!z) {
            if (iIL == 2) {
                com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(adSlot, bgVar);
                IL(adSlot);
                return;
            }
            return;
        }
        if (iIL == 2) {
            IL(adSlot);
        } else if (iIL == 1) {
            com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(adSlot.getCodeId(), (com.bytedance.sdk.openadsdk.core.model.tuV) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.component.reward.zx.IL il, com.bytedance.sdk.openadsdk.utils.daV dav, final com.bytedance.sdk.openadsdk.component.reward.Ta ta, final boolean z) {
        boolean z2;
        boolean z3 = false;
        if (il != null) {
            z2 = true;
            if (!z && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) || !com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
            z3 = z2;
        } else {
            tuv.Dxa();
            com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(tuv.uV()).bg(), tuv);
            ilBg.bg("material_meta", tuv);
            ilBg.bg("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.2
                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i) {
                    if (il != null) {
                        if (z || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                            il.onAdLoaded(ta.bg());
                        }
                    }
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i, java.lang.String str) {
                    if (il != null) {
                        if (z || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                            il.onError(i, str);
                        }
                    }
                }
            });
        }
        if (z3) {
            il.onAdLoaded(ta.bg());
        }
    }

    private void bg(final com.bytedance.sdk.openadsdk.AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.utils.daV dav, final com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.LZ lz = new com.bytedance.sdk.openadsdk.core.model.LZ();
        lz.bX = z ? 2 : 1;
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().PX(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            lz.Kg = 2;
        }
        com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(adSlot, lz, 8, new com.bytedance.sdk.openadsdk.core.Fy.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.3
            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (z || (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) == null) {
                    return;
                }
                pAGInterstitialAdLoadListener2.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
                com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
                if (bgVar.bX() != null && !bgVar.bX().isEmpty()) {
                    com.bytedance.sdk.openadsdk.component.reward.Ta ta = new com.bytedance.sdk.openadsdk.component.reward.Ta(com.bytedance.sdk.openadsdk.component.reward.zx.this.IL, bgVar);
                    if (!z) {
                        if (!android.text.TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.tuV.bg.eqN.bg().bg(bgVar.bX().isEmpty() ? null : bgVar.bX().get(0));
                            com.bytedance.sdk.openadsdk.yDt.bX.bg(bgVar.zx(), java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        if (!bgVar.ldr() && pAGInterstitialAdLoadListener != null && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 0) {
                            com.bytedance.sdk.openadsdk.component.reward.zx.this.bg(adSlot, bgVar, pAGInterstitialAdLoadListener, ta.bg(), false);
                        }
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zx.IL il2 = new com.bytedance.sdk.openadsdk.component.reward.zx.IL(new com.bytedance.sdk.openadsdk.component.reward.zx.bg(com.bytedance.sdk.openadsdk.component.reward.zx.this.IL, adSlot, bgVar, pAGInterstitialAdLoadListener, false), bgVar);
                    for (int i = 0; i < bgVar.bX().size(); i++) {
                        com.bytedance.sdk.openadsdk.component.reward.zx.this.bg(bgVar, bgVar.bX().get(i), ta, adSlot, z, dav, il2, bgVar.ldr());
                        if (bgVar.VB()) {
                            return;
                        }
                    }
                    return;
                }
                if (z || (pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener) == null) {
                    return;
                }
                pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.Kg.bg(-3));
                il.bg(-3);
                com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, final com.bytedance.sdk.openadsdk.component.reward.Ta ta, final com.bytedance.sdk.openadsdk.AdSlot adSlot, final boolean z, com.bytedance.sdk.openadsdk.utils.daV dav, final com.bytedance.sdk.openadsdk.component.reward.zx.IL il, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(tuv, new com.bytedance.sdk.openadsdk.core.Ta.bX.bg.InterfaceC0139bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.4
        });
        boolean z3 = true;
        if (z && !com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv) && com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) && com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(adSlot.getCodeId()).eqN == 1 && !com.bytedance.sdk.component.utils.Lq.eqN(this.IL)) {
            bg(new com.bytedance.sdk.openadsdk.component.reward.zx.bX(tuv, adSlot, bgVar));
            return;
        }
        boolean z4 = false;
        if (il == null || (!z2 && com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() != 1)) {
            z3 = false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.bX(tuv)) {
            if (z) {
                com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(adSlot, bgVar);
            }
        } else if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
            if (tuv.Dxa() != null) {
                com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(tuv.uV()).bg(), tuv);
                ilBg.bg("material_meta", tuv);
                ilBg.bg("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.5
                    @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i) {
                        ta.IL();
                        if (z) {
                            com.bytedance.sdk.openadsdk.component.reward.eqN.bg(com.bytedance.sdk.openadsdk.component.reward.zx.this.IL).bg(adSlot, bgVar);
                        } else if (il != null) {
                            if (z2 || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                                il.onAdLoaded(ta.bg());
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                    public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i, java.lang.String str) {
                        if (il != null) {
                            if (z2 || com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV() == 1) {
                                il.onError(i, str);
                            }
                        }
                    }
                });
            } else {
                z4 = z3;
            }
            z3 = z4;
        } else if (z) {
            com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(adSlot, bgVar);
        }
        if (z3) {
            il.onAdLoaded(ta.bg());
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.zx$6, reason: invalid class name */
    class AnonymousClass6 implements com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg<java.lang.Object> {
        final /* synthetic */ com.bytedance.sdk.openadsdk.component.reward.Ta IL;
        final /* synthetic */ com.bytedance.sdk.openadsdk.AdSlot bX;
        final /* synthetic */ boolean bg;
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.model.bg eqN;
        final /* synthetic */ boolean ldr;
        final /* synthetic */ com.bytedance.sdk.openadsdk.component.reward.zx.IL zx;

        AnonymousClass6(boolean z, com.bytedance.sdk.openadsdk.component.reward.Ta ta, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.component.reward.zx.IL il, boolean z2) {
            this.bg = z;
            this.IL = ta;
            this.bX = adSlot;
            this.eqN = bgVar;
            this.zx = il;
            this.ldr = z2;
        }

        @Override // com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg
        public void bg(boolean z, java.lang.Object obj) {
            if (z) {
                this.IL.IL();
            }
            if (this.bg) {
                if (z) {
                    com.bytedance.sdk.openadsdk.component.reward.eqN.bg(com.bytedance.sdk.openadsdk.component.reward.zx.this.IL).bg(this.bX, this.eqN);
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

    private void IL(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        if (IL() != 2) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(adSlot.getCodeId());
    }

    private void bg(com.bytedance.sdk.openadsdk.component.reward.zx.bX bXVar) {
        if (bXVar == null) {
            return;
        }
        if (this.eqN.size() > 0) {
            this.eqN.remove(0);
        }
        this.eqN.add(bXVar);
    }

    private void bX() {
        if (this.bX.get()) {
            return;
        }
        this.bX.set(true);
        com.bytedance.sdk.component.utils.rri.bg(this.ldr, this.IL);
    }

    private void eqN() {
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
        eqN();
    }

    private static class bX extends com.bytedance.sdk.component.Kg.Kg {
        final com.bytedance.sdk.openadsdk.AdSlot IL;
        final com.bytedance.sdk.openadsdk.core.model.bg bX;
        final com.bytedance.sdk.openadsdk.core.model.tuV bg;

        bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
            super("Fullscreen Task");
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
            com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, new com.bykv.vk.openvk.bg.bg.bg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.bX.1
                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i, java.lang.String str) {
                }

                @Override // com.bykv.vk.openvk.bg.bg.bg.zx.bg.InterfaceC0072bg
                public void bg(com.bykv.vk.openvk.bg.bg.bg.bX.bX bXVar, int i) {
                    com.bytedance.sdk.openadsdk.component.reward.eqN.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(com.bytedance.sdk.openadsdk.component.reward.zx.bX.this.IL, com.bytedance.sdk.openadsdk.component.reward.zx.bX.this.bX);
                }
            });
        }

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.zx$bX$2, reason: invalid class name */
        class AnonymousClass2 implements com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg<java.lang.Object> {
            AnonymousClass2() {
            }

            @Override // com.bytedance.sdk.openadsdk.common.bg.InterfaceC0128bg
            public void bg(boolean z, java.lang.Object obj) {
                if (z) {
                    com.bytedance.sdk.openadsdk.component.reward.eqN.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(com.bytedance.sdk.openadsdk.component.reward.zx.bX.this.IL, com.bytedance.sdk.openadsdk.component.reward.zx.bX.this.bX);
                }
            }
        }
    }

    private static class bg implements com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.AdSlot IL;
        private final com.bytedance.sdk.openadsdk.core.model.bg bX;
        private final android.content.Context bg;
        private final com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener eqN;
        private final boolean zx;

        public bg(android.content.Context context, com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z) {
            this.bg = context;
            this.IL = adSlot;
            this.bX = bgVar;
            this.eqN = pAGInterstitialAdLoadListener;
            this.zx = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ldr
        public void onError(int i, java.lang.String str) {
            com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.eqN;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd pAGInterstitialAd) {
            com.bytedance.sdk.openadsdk.component.reward.zx.bg(this.bg).bg(this.IL, this.bX, this.eqN, pAGInterstitialAd, this.zx);
        }
    }

    private static class IL implements com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener {
        private final java.util.concurrent.atomic.AtomicBoolean IL;
        private final java.util.concurrent.atomic.AtomicInteger bX;
        private final com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener bg;
        private final com.bytedance.sdk.openadsdk.core.model.bg eqN;

        private IL(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
            this.IL = new java.util.concurrent.atomic.AtomicBoolean(false);
            this.bg = pAGInterstitialAdLoadListener;
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
            if (this.bX.decrementAndGet() > 0 || !this.IL.compareAndSet(false, true)) {
                return;
            }
            this.bg.onError(i, str);
            com.bytedance.sdk.openadsdk.yDt.bX.bg("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.zx.IL.1
                @Override // com.bytedance.sdk.openadsdk.yDt.IL
                public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("req_id", com.bytedance.sdk.openadsdk.component.reward.zx.IL.this.eqN.bg());
                    return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("choose_ad_load_error").IL(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd pAGInterstitialAd) {
            this.bX.decrementAndGet();
            if (this.bg == null || !this.IL.compareAndSet(false, true)) {
                return;
            }
            this.bg.onAdLoaded(pAGInterstitialAd);
        }
    }

    public void bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.component.reward.eqN.bg(this.IL).bg(str, tuv);
    }

    public static int IL() {
        return com.bytedance.sdk.openadsdk.Fy.bg.bg("ivrv_load_ad_cache_strategy", 0);
    }
}

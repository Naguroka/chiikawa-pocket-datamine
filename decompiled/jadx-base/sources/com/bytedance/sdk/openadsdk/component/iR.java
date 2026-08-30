package com.bytedance.sdk.openadsdk.component;

/* JADX INFO: loaded from: classes4.dex */
public class iR implements com.bytedance.sdk.component.utils.JAA.bg {
    private final com.bytedance.sdk.openadsdk.core.Fy<com.bytedance.sdk.openadsdk.eqN.bg> IL;
    private int Kg;
    private boolean VB;
    private final com.bytedance.sdk.openadsdk.component.ldr bX;
    private final android.content.Context bg;
    private com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener iR;
    private com.bytedance.sdk.openadsdk.AdSlot ldr;
    private final java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
    private int zx = 0;
    private volatile int WR = 0;
    private final com.bytedance.sdk.openadsdk.core.model.JAA eo = new com.bytedance.sdk.openadsdk.core.model.JAA();

    public iR(android.content.Context context) {
        if (context != null) {
            this.bg = context.getApplicationContext();
        } else {
            this.bg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        this.IL = com.bytedance.sdk.openadsdk.core.VzQ.bX();
        this.bX = com.bytedance.sdk.openadsdk.component.ldr.bg(this.bg);
    }

    public static com.bytedance.sdk.openadsdk.component.iR bg(android.content.Context context) {
        return new com.bytedance.sdk.openadsdk.component.iR(context);
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.common.ldr ldrVar, int i) {
        if (ldrVar == null) {
            return;
        }
        if (i <= 0) {
            i = com.json.mediationsdk.utils.IronSourceConstants.BN_AUCTION_REQUEST;
        }
        this.ldr = adSlot;
        this.eo.bg = !android.text.TextUtils.isEmpty(adSlot.getBidAdm());
        if (ldrVar instanceof com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener) {
            this.iR = (com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener) ldrVar;
        }
        this.zx = bg(this.ldr);
        this.Kg = i;
        this.eo.bg(com.bytedance.sdk.openadsdk.utils.daV.bg());
        if (this.eo.bg || com.bytedance.sdk.openadsdk.core.settings.xxp.zU().JAA(this.ldr.getCodeId()) == 0) {
            IL(this.ldr);
        }
        if (this.eo.bg) {
            return;
        }
        new com.bytedance.sdk.component.utils.JAA(com.bytedance.sdk.openadsdk.core.yDt.IL().getLooper(), this).sendEmptyMessageDelayed(1, i);
        bg();
    }

    private void IL(final com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        final com.bytedance.sdk.openadsdk.utils.daV davBg = com.bytedance.sdk.openadsdk.utils.daV.bg();
        this.WR = 1;
        com.bytedance.sdk.openadsdk.core.model.LZ lz = new com.bytedance.sdk.openadsdk.core.model.LZ();
        lz.eo = this.eo;
        lz.eqN = 1;
        lz.Kg = 2;
        this.IL.bg(adSlot, lz, 3, new com.bytedance.sdk.openadsdk.core.Fy.bg() { // from class: com.bytedance.sdk.openadsdk.component.iR.1
            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.component.iR.this.WR = 3;
                com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(final com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
                com.bytedance.sdk.openadsdk.component.iR.this.WR = 2;
                if (bgVar == null || bgVar.bX() == null || bgVar.bX().size() == 0) {
                    com.bytedance.sdk.openadsdk.component.iR.this.WR = 3;
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(2, 100, 20001, com.bytedance.sdk.openadsdk.core.Kg.bg(20001)));
                    il.bg(-3);
                    com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                    return;
                }
                final com.bytedance.sdk.openadsdk.core.model.tuV tuv = bgVar.bX().get(0);
                long jYDt = tuv.yDt();
                com.bytedance.sdk.openadsdk.component.iR.this.eo.IL = jYDt;
                boolean zLdr = com.bytedance.sdk.openadsdk.core.model.tuV.ldr(tuv);
                if (tuv.NC()) {
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar));
                    return;
                }
                if (zLdr) {
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar));
                    if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
                        com.bytedance.sdk.openadsdk.component.iR.this.bg(tuv, adSlot, false, bgVar);
                        return;
                    } else {
                        com.bytedance.sdk.openadsdk.component.iR.this.bg(tuv, false, bgVar);
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv)) {
                    int iPX = com.bytedance.sdk.openadsdk.core.VzQ.eqN().PX();
                    if (iPX == 1 || iPX == 3) {
                        com.bytedance.sdk.openadsdk.component.iR.this.eo.IL = -1L;
                        com.bytedance.sdk.openadsdk.component.iR.this.eo.bg(3);
                        com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar));
                        com.bytedance.sdk.openadsdk.component.iR.this.bg(tuv, adSlot, false, bgVar);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.iR iRVar = com.bytedance.sdk.openadsdk.component.iR.this;
                    iRVar.bg(tuv, adSlot, !iRVar.eo.bg, bgVar);
                } else {
                    if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().VB() == 1) {
                        com.bytedance.sdk.openadsdk.component.iR.this.eo.IL = -1L;
                        com.bytedance.sdk.openadsdk.component.iR.this.eo.bg(3);
                        com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar));
                        com.bytedance.sdk.openadsdk.component.iR.this.bg(tuv, false, bgVar);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.iR iRVar2 = com.bytedance.sdk.openadsdk.component.iR.this;
                    iRVar2.bg(tuv, !iRVar2.eo.bg, bgVar);
                }
                if (com.bytedance.sdk.openadsdk.component.iR.this.eo.bg) {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg(tuv, davBg.bX());
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    java.lang.Long.valueOf(jYDt);
                    if (jYDt == 0) {
                        com.bytedance.sdk.openadsdk.component.iR.this.eo.bg(2);
                        com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar));
                    } else {
                        com.bytedance.sdk.openadsdk.core.yDt.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.iR.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.bytedance.sdk.openadsdk.component.iR.this.eo.bg(2);
                                com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar));
                            }
                        }, jYDt);
                    }
                }
            }
        });
    }

    private void bg() {
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.iR.2
            @Override // java.lang.Runnable
            public void run() {
                int iPX;
                com.bytedance.sdk.openadsdk.core.model.tuV tuvZx = com.bytedance.sdk.openadsdk.component.iR.this.bX.zx(com.bytedance.sdk.openadsdk.component.iR.this.zx);
                if (tuvZx == null) {
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(false);
                    return;
                }
                if (tuvZx.VW() == null) {
                    tuvZx.bg(com.bytedance.sdk.openadsdk.component.iR.this.ldr);
                }
                boolean zZx = com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuvZx);
                if (tuvZx.NC()) {
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 101, tuvZx, (com.bytedance.sdk.openadsdk.core.model.bg) null));
                    return;
                }
                if (!zZx && com.bytedance.sdk.openadsdk.core.VzQ.eqN().VB() == 1) {
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 101, tuvZx, (com.bytedance.sdk.openadsdk.core.model.bg) null));
                    return;
                }
                if (!zZx || ((iPX = com.bytedance.sdk.openadsdk.core.VzQ.eqN().PX()) != 2 && iPX != 3)) {
                    if (com.bytedance.sdk.openadsdk.component.iR.this.bX.IL(com.bytedance.sdk.openadsdk.component.iR.this.zx) || com.bytedance.sdk.openadsdk.component.iR.this.bX.eqN(com.bytedance.sdk.openadsdk.component.iR.this.zx)) {
                        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().JAA(com.bytedance.sdk.openadsdk.component.iR.this.ldr.getCodeId()) == 0) {
                            com.bytedance.sdk.openadsdk.component.iR.this.bX.iR(com.bytedance.sdk.openadsdk.component.iR.this.zx);
                        }
                        if (!zZx) {
                            if (com.bytedance.sdk.openadsdk.component.iR.this.bX.IL(tuvZx)) {
                                com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 101, tuvZx, (com.bytedance.sdk.openadsdk.core.model.bg) null));
                                return;
                            } else {
                                com.bytedance.sdk.openadsdk.component.iR.this.bg(false);
                                com.bytedance.sdk.openadsdk.component.eqN.bg.IL(tuvZx);
                                return;
                            }
                        }
                        if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.component.iR.this.bX.bg(tuvZx))) {
                            com.bytedance.sdk.openadsdk.component.iR.this.bg(false);
                            com.bytedance.sdk.openadsdk.component.eqN.bg.IL(tuvZx);
                            return;
                        } else {
                            com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 101, tuvZx, (com.bytedance.sdk.openadsdk.core.model.bg) null));
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(true);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(1, 101, tuvZx, (com.bytedance.sdk.openadsdk.core.model.bg) null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(boolean z) {
        if (z) {
            this.bX.iR(this.zx);
        }
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().JAA(this.ldr.getCodeId()) == 1) {
            IL(this.ldr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        this.bX.bg(tuv, adSlot, this.eo, new com.bytedance.sdk.openadsdk.component.ldr.bX() { // from class: com.bytedance.sdk.openadsdk.component.iR.3
            @Override // com.bytedance.sdk.openadsdk.component.ldr.bX
            public void bg() {
                android.util.Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z) {
                    com.bytedance.sdk.openadsdk.component.iR.this.WR = 4;
                    com.bytedance.sdk.openadsdk.component.zx.IL il = new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar);
                    il.bg(true);
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(il);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ldr.bX
            public void bg(int i, java.lang.String str) {
                if (z) {
                    com.bytedance.sdk.openadsdk.component.iR.this.WR = 5;
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(2, 100, com.google.android.gms.games.GamesActivityResultCodes.RESULT_LICENSE_FAILED, com.bytedance.sdk.openadsdk.core.Kg.bg(com.google.android.gms.games.GamesActivityResultCodes.RESULT_LICENSE_FAILED)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final boolean z, final com.bytedance.sdk.openadsdk.core.model.bg bgVar) {
        this.bX.bg(tuv, this.eo, new com.bytedance.sdk.openadsdk.component.ldr.IL() { // from class: com.bytedance.sdk.openadsdk.component.iR.4
            @Override // com.bytedance.sdk.openadsdk.component.ldr.IL
            public void bg(com.bytedance.sdk.openadsdk.xxp.bg.IL il) {
                android.util.Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z) {
                    com.bytedance.sdk.openadsdk.component.iR.this.WR = 4;
                    com.bytedance.sdk.openadsdk.component.zx.IL il2 = new com.bytedance.sdk.openadsdk.component.zx.IL(1, 100, tuv, bgVar);
                    il2.bg(true);
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(il2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ldr.IL
            public void bg() {
                android.util.Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z) {
                    com.bytedance.sdk.openadsdk.component.iR.this.WR = 5;
                    com.bytedance.sdk.openadsdk.component.iR.this.bg(new com.bytedance.sdk.openadsdk.component.zx.IL(2, 100, com.google.android.gms.games.GamesActivityResultCodes.RESULT_LICENSE_FAILED, com.bytedance.sdk.openadsdk.core.Kg.bg(com.google.android.gms.games.GamesActivityResultCodes.RESULT_LICENSE_FAILED)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.component.zx.IL il) {
        int iBX = il.bX();
        int iEqN = il.eqN();
        if (this.eqN.get()) {
            if (iBX == 1 && iEqN == 100 && il.IL()) {
                com.bytedance.sdk.openadsdk.component.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(new com.bytedance.sdk.openadsdk.component.zx.bg(this.zx, il.zx(), il.bg()));
                if (this.VB) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.eqN.bg.bg(il.zx(), 1, this.eo);
                return;
            }
            return;
        }
        if (iBX != 1) {
            if (iBX == 2 || iBX == 3) {
                com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.iR;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(il.ldr(), il.iR());
                }
                this.eqN.set(true);
                if (iBX == 3) {
                    com.bytedance.sdk.openadsdk.component.eqN.bg.bg(this.WR, this.Kg);
                    return;
                }
                return;
            }
            return;
        }
        if (this.iR != null) {
            this.iR.onAdLoaded(new com.bytedance.sdk.openadsdk.component.eqN(this.bg, il.zx(), iEqN == 101, this.ldr));
        }
        this.eqN.set(true);
        if (iEqN == 101) {
            com.bytedance.sdk.openadsdk.component.eqN.bg.bg(il.zx(), this.eo.bg().bX());
            return;
        }
        if (iEqN == 100) {
            com.bytedance.sdk.openadsdk.component.eqN.bg.bg(il.zx(), 0, this.eo);
            this.VB = true;
            if (this.eo.bg || com.bytedance.sdk.openadsdk.core.model.tuV.ldr(il.zx())) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().JAA(this.ldr.getCodeId()) == 0) {
                this.bX.bg(this.ldr);
            } else {
                this.bX.bg(new com.bytedance.sdk.openadsdk.component.zx.bg(this.zx, il.zx(), il.bg()));
            }
        }
    }

    public int bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        try {
            return java.lang.Integer.parseInt(adSlot.getCodeId());
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        if (message.what != 1 || this.eqN.get()) {
            return;
        }
        bg(new com.bytedance.sdk.openadsdk.component.zx.IL(3, 102, com.google.android.gms.games.GamesActivityResultCodes.RESULT_SIGN_IN_FAILED, com.bytedance.sdk.openadsdk.core.Kg.bg(com.google.android.gms.games.GamesActivityResultCodes.RESULT_SIGN_IN_FAILED)));
    }
}

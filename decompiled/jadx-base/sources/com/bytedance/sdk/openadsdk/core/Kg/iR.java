package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class iR {
    private static final java.util.Set<com.bytedance.sdk.openadsdk.core.Kg.iR> eo = java.util.Collections.synchronizedSet(new java.util.HashSet());
    private com.bytedance.sdk.openadsdk.core.Kg.iR.bg Kg;
    private final android.content.Context bX;
    private com.bytedance.sdk.openadsdk.AdSlot bg;
    private com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener eqN;
    private java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> iR;
    private java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> ldr;
    private final java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private int WR = 5;
    private final java.util.concurrent.ScheduledFuture<?> VB = null;
    private java.util.concurrent.ScheduledFuture<?> PX = null;
    private java.util.concurrent.ScheduledFuture<?> Ta = null;
    private final com.bytedance.sdk.openadsdk.utils.daV yDt = com.bytedance.sdk.openadsdk.utils.daV.IL();
    private final com.bytedance.sdk.openadsdk.core.Fy IL = com.bytedance.sdk.openadsdk.core.VzQ.bX();

    public interface bg {
    }

    private iR(android.content.Context context) {
        if (context != null) {
            this.bX = context.getApplicationContext();
        } else {
            this.bX = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        eo.add(this);
    }

    public static com.bytedance.sdk.openadsdk.core.Kg.iR bg(android.content.Context context) {
        return new com.bytedance.sdk.openadsdk.core.Kg.iR(context);
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.ldr ldrVar, int i2) {
        bg(adSlot, i, ldrVar, null, i2);
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.ldr ldrVar, com.bytedance.sdk.openadsdk.core.Kg.iR.bg bgVar, int i2) {
        this.yDt.eqN();
        if (this.zx.get()) {
            com.bytedance.sdk.component.utils.PX.bg("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.WR = i;
        this.zx.set(true);
        this.bg = adSlot;
        if (ldrVar instanceof com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener) {
            this.eqN = (com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener) ldrVar;
        }
        this.Kg = bgVar;
        bg(adSlot, ldrVar);
    }

    private void bg(final com.bytedance.sdk.openadsdk.AdSlot adSlot, com.bytedance.sdk.openadsdk.common.ldr ldrVar) {
        if (adSlot == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.LZ lz = new com.bytedance.sdk.openadsdk.core.model.LZ();
        lz.Kg = 2;
        this.IL.bg(adSlot, lz, this.WR, new com.bytedance.sdk.openadsdk.core.Fy.bg() { // from class: com.bytedance.sdk.openadsdk.core.Kg.iR.1
            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(int i, java.lang.String str) {
                com.bytedance.sdk.openadsdk.core.Kg.iR.this.bg(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
                if (bgVar.bX() == null || bgVar.bX().isEmpty()) {
                    com.bytedance.sdk.openadsdk.core.Kg.iR.this.bg(-3, com.bytedance.sdk.openadsdk.core.Kg.bg(-3));
                    il.bg(-3);
                    com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.Kg.iR.this.ldr = bgVar.bX();
                com.bytedance.sdk.openadsdk.core.Kg.iR.this.iR = bgVar.bX();
                com.bytedance.sdk.openadsdk.core.Kg.iR.this.bg(adSlot);
                com.bytedance.sdk.openadsdk.core.Kg.iR iRVar = com.bytedance.sdk.openadsdk.core.Kg.iR.this;
                iRVar.bg(iRVar.yDt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list = this.ldr;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.model.tuV tuv : list) {
            if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) && tuv.Dxa() != null && tuv.Dxa().VB() != null) {
                if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().zx(java.lang.String.valueOf(tuv.IGR())) && com.bytedance.sdk.openadsdk.core.VzQ.eqN().GvG()) {
                    com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(tuv.uV()).bX(), tuv);
                    ilBg.bg("material_meta", tuv);
                    ilBg.bg("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final com.bytedance.sdk.openadsdk.utils.daV dav) {
        if (this.zx.getAndSet(false)) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.iR.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.core.Kg.iR.this.iR == null || com.bytedance.sdk.openadsdk.core.Kg.iR.this.iR.size() <= 0) {
                        if (com.bytedance.sdk.openadsdk.core.Kg.iR.this.Kg != null) {
                            com.bytedance.sdk.openadsdk.core.Kg.iR.bg unused = com.bytedance.sdk.openadsdk.core.Kg.iR.this.Kg;
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.core.Kg.iR.this.IL(dav);
                        if (com.bytedance.sdk.openadsdk.core.Kg.iR.this.Kg != null) {
                            com.bytedance.sdk.openadsdk.core.Kg.iR.bg unused2 = com.bytedance.sdk.openadsdk.core.Kg.iR.this.Kg;
                            java.util.List unused3 = com.bytedance.sdk.openadsdk.core.Kg.iR.this.iR;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.Kg.iR.this.bg();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(com.bytedance.sdk.openadsdk.utils.daV dav) {
        if (this.eqN != null) {
            java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = this.iR.iterator();
            com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd pAGBannerAdBg = null;
            while (it.hasNext() && (pAGBannerAdBg = bg(it.next())) == null) {
            }
            if (pAGBannerAdBg != null) {
                if (!android.text.TextUtils.isEmpty(this.bg.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.yDt.bX.bg(this.iR.get(0), this.yDt.bX());
                }
                this.eqN.onAdLoaded(pAGBannerAdBg);
            } else {
                this.eqN.onError(103, com.bytedance.sdk.openadsdk.core.Kg.bg(103));
                bg(103);
            }
        }
    }

    private void bg(int i) {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list = this.ldr;
        com.bytedance.sdk.openadsdk.yDt.bX.bg().bg(com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg(this.WR).bX(this.bg.getCodeId()).zx((list == null || list.size() <= 0) ? "" : this.ldr.get(0).waE()).IL(i).ldr(com.bytedance.sdk.openadsdk.core.Kg.bg(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(int i, java.lang.String str) {
        if (this.zx.getAndSet(false)) {
            com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener pAGBannerAdLoadListener = this.eqN;
            if (pAGBannerAdLoadListener != null) {
                pAGBannerAdLoadListener.onError(i, str);
            }
            bg();
        }
    }

    private com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (this.WR != 1) {
            return null;
        }
        if (tuv.Dxa() != null) {
            return new com.bytedance.sdk.openadsdk.core.bX.ldr(this.bX, tuv, this.bg);
        }
        return new com.bytedance.sdk.openadsdk.core.bX.eqN(this.bX, tuv, this.bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list = this.ldr;
        if (list != null) {
            list.clear();
        }
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list2 = this.iR;
        if (list2 != null) {
            list2.clear();
        }
        bg(true);
        IL(true);
        bX(true);
        IL();
    }

    private void bg(boolean z) {
        try {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.PX;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.PX.bg("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=".concat(java.lang.String.valueOf(this.PX.cancel(z))));
        } catch (java.lang.Throwable unused) {
        }
    }

    private void IL(boolean z) {
        try {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.Ta;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Ta.cancel(z);
        } catch (java.lang.Throwable unused) {
        }
    }

    private void bX(boolean z) {
        try {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.VB;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.PX.bg("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=".concat(java.lang.String.valueOf(this.VB.cancel(z))));
        } catch (java.lang.Throwable unused) {
        }
    }

    private void IL() {
        eo.remove(this);
    }
}

package com.bytedance.sdk.openadsdk.component.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static volatile com.bytedance.sdk.openadsdk.component.IL.bg bg;
    private final com.bytedance.sdk.openadsdk.core.Fy IL = com.bytedance.sdk.openadsdk.core.VzQ.bX();

    public static com.bytedance.sdk.openadsdk.component.IL.bg bg() {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.component.IL.bg.class) {
                if (bg == null) {
                    bg = new com.bytedance.sdk.openadsdk.component.IL.bg();
                }
            }
        }
        return bg;
    }

    private bg() {
    }

    public void bg(final android.content.Context context, final com.bytedance.sdk.openadsdk.AdSlot adSlot, final com.bytedance.sdk.openadsdk.common.ldr ldrVar) {
        final com.bytedance.sdk.openadsdk.utils.daV davBg = com.bytedance.sdk.openadsdk.utils.daV.bg();
        this.IL.bg(adSlot, new com.bytedance.sdk.openadsdk.core.model.LZ(), 5, new com.bytedance.sdk.openadsdk.core.Fy.bg() { // from class: com.bytedance.sdk.openadsdk.component.IL.bg.1
            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(int i, java.lang.String str) {
                ldrVar.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
            public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
                if (bgVar.bX() != null && !bgVar.bX().isEmpty()) {
                    java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = bgVar.bX();
                    java.util.ArrayList arrayList = new java.util.ArrayList(listBX.size());
                    java.util.Iterator<com.bytedance.sdk.openadsdk.core.model.tuV> it = listBX.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bytedance.sdk.openadsdk.core.model.tuV next = it.next();
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(next) || (next != null && next.huT())) {
                            com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd pAGNativeAdBg = bg(context, next, adSlot);
                            if (ldrVar instanceof com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener) {
                                arrayList.add(pAGNativeAdBg);
                            }
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(next) && next.Dxa() != null && next.Dxa().VB() != null) {
                            if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().zx(java.lang.String.valueOf(next.IGR())) && com.bytedance.sdk.openadsdk.core.VzQ.eqN().GvG()) {
                                if (next.Dxa() != null) {
                                    next.Dxa().ldr(1);
                                }
                                if (next.GR() != null) {
                                    next.GR().ldr(1);
                                }
                                com.bytedance.sdk.openadsdk.core.Ta.bg.IL ilBg = com.bytedance.sdk.openadsdk.core.model.tuV.bg(com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(next.uV()).bX(), next);
                                ilBg.bg("material_meta", next);
                                ilBg.bg("ad_slot", adSlot);
                                com.bytedance.sdk.openadsdk.core.Ta.zx.bg.bg(ilBg, null);
                            }
                            com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver.bg(context, next);
                        }
                    }
                    if ((ldrVar instanceof com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener) && !arrayList.isEmpty()) {
                        com.bytedance.sdk.openadsdk.AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !android.text.TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.yDt.bX.bg(listBX.get(0), davBg.bX());
                        }
                        com.bytedance.sdk.openadsdk.common.ldr ldrVar2 = ldrVar;
                        if (ldrVar2 instanceof com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener) {
                            ((com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener) ldrVar2).onAdLoaded(arrayList.get(0));
                        }
                        if (il.zx() == null || il.zx().isEmpty()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                        return;
                    }
                    ldrVar.onError(-4, com.bytedance.sdk.openadsdk.core.Kg.bg(-4));
                    il.bg(-4);
                    com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                    return;
                }
                ldrVar.onError(-3, com.bytedance.sdk.openadsdk.core.Kg.bg(-3));
                il.bg(-3);
                com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
            }

            private com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd bg(android.content.Context context2, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot2) {
                if (tuv.tC() == 2) {
                    if (tuv.Dxa() != null) {
                        return new com.bytedance.sdk.openadsdk.bg.IL.bg.IL(context2, tuv, adSlot2);
                    }
                    return new com.bytedance.sdk.openadsdk.bg.IL.bg.bX(context2, tuv, adSlot2);
                }
                return new com.bytedance.sdk.openadsdk.bg.IL.IL(context2, tuv, 5, adSlot2);
            }
        });
    }
}

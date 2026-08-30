package com.bytedance.sdk.openadsdk.component.reward;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar, int i, boolean z) {
        if (bgVar == null || bgVar.bX() == null || bgVar.bX().size() <= 0) {
            return;
        }
        if (i >= bgVar.bX().size()) {
            i = 0;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = bgVar.bX().get(i);
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        bg(tuv, !android.text.TextUtils.isEmpty(z ? com.bytedance.sdk.openadsdk.component.reward.VB.bg(contextBg).bg(tuv) : com.bytedance.sdk.openadsdk.component.reward.eqN.bg(contextBg).bg(tuv)), z);
    }

    public static void bg(final com.bytedance.sdk.openadsdk.core.model.tuV tuv, final boolean z, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.yDt.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.1
            @Override // java.lang.Runnable
            public void run() {
                if (tuv == null) {
                    return;
                }
                try {
                    android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
                    com.bytedance.sdk.openadsdk.AdSlot adSlotVW = tuv.VW();
                    if (adSlotVW != null) {
                        int iIL = com.bytedance.sdk.openadsdk.component.reward.zx.IL();
                        if (iIL == 0 || iIL == 2) {
                            if (z2) {
                                com.bytedance.sdk.openadsdk.component.reward.PX.bg(contextBg).bg(adSlotVW.getCodeId(), tuv);
                            } else {
                                com.bytedance.sdk.openadsdk.component.reward.zx.bg(contextBg).bg(adSlotVW.getCodeId(), tuv);
                            }
                        }
                        if (z) {
                            if (z2) {
                                com.bytedance.sdk.openadsdk.component.reward.PX.bg(contextBg).bg(adSlotVW);
                            } else {
                                com.bytedance.sdk.openadsdk.component.reward.zx.bg(contextBg).bg(adSlotVW);
                            }
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }
}

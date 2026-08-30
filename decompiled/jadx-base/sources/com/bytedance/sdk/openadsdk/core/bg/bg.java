package com.bytedance.sdk.openadsdk.core.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.sdk.openadsdk.core.Fy.bg {
    private final com.bytedance.sdk.openadsdk.AdSlot IL;
    private final com.bytedance.sdk.openadsdk.core.Fy.bg bg;

    public bg(com.bytedance.sdk.openadsdk.core.Fy.bg bgVar, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        this.bg = bgVar;
        this.IL = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
    public void bg(final int i, final java.lang.String str) {
        com.bytedance.sdk.openadsdk.AdSlot adSlot;
        if (this.bg != null) {
            if (com.bytedance.sdk.openadsdk.utils.VJ.zx() || ((adSlot = this.IL) != null && adSlot.getDurationSlotType() != 5 && com.bytedance.sdk.openadsdk.Fy.bg.bg("getads_callback_async", 0) == 1)) {
                this.bg.bg(i, str);
            } else {
                com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bg.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.bg.bg.this.bg.bg(i, str);
                    }
                });
            }
            com.bytedance.sdk.openadsdk.AdSlot adSlot2 = this.IL;
            if (adSlot2 == null || adSlot2.isPreload()) {
                return;
            }
            com.bytedance.sdk.openadsdk.p002vb.eqN.bX(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.bg.bg.2
                @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                    com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                    bgVar.IL("load_ad");
                    bgVar.bX(com.bytedance.sdk.openadsdk.core.bg.bg.this.IL.getCodeId());
                    bgVar.eqN(com.bytedance.sdk.openadsdk.utils.ayS.bX(com.bytedance.sdk.openadsdk.core.bg.bg.this.IL.getDurationSlotType()));
                    bgVar.bg(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                    bgVar.iR(com.bytedance.sdk.openadsdk.utils.ayS.bg(com.bytedance.sdk.openadsdk.core.bg.bg.this.IL).toString());
                    return bgVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
    public void bg(final com.bytedance.sdk.openadsdk.core.model.bg bgVar, final com.bytedance.sdk.openadsdk.core.model.IL il) {
        com.bytedance.sdk.openadsdk.AdSlot adSlot;
        if (this.bg != null) {
            if (com.bytedance.sdk.openadsdk.utils.VJ.zx() || ((adSlot = this.IL) != null && adSlot.getDurationSlotType() != 5 && com.bytedance.sdk.openadsdk.Fy.bg.bg("getads_callback_async", 0) == 1)) {
                this.bg.bg(bgVar, il);
            } else {
                com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bg.bg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.bg.bg.this.bg.bg(bgVar, il);
                    }
                });
            }
            com.bytedance.sdk.openadsdk.AdSlot adSlot2 = this.IL;
            if (adSlot2 == null || adSlot2.isPreload()) {
                return;
            }
            com.bytedance.sdk.openadsdk.p002vb.eqN.IL(new com.bytedance.sdk.openadsdk.p002vb.zx() { // from class: com.bytedance.sdk.openadsdk.core.bg.bg.4
                @Override // com.bytedance.sdk.openadsdk.p002vb.zx
                public com.bytedance.sdk.openadsdk.p002vb.IL.bg generatorModel() {
                    com.bytedance.sdk.openadsdk.p002vb.IL.bg bgVar2 = new com.bytedance.sdk.openadsdk.p002vb.IL.bg();
                    bgVar2.IL("load_ad");
                    bgVar2.bX(com.bytedance.sdk.openadsdk.core.bg.bg.this.IL.getCodeId());
                    bgVar2.eqN(com.bytedance.sdk.openadsdk.utils.ayS.bX(com.bytedance.sdk.openadsdk.core.bg.bg.this.IL.getDurationSlotType()));
                    bgVar2.bg(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
                    bgVar2.iR(com.bytedance.sdk.openadsdk.utils.ayS.bg(com.bytedance.sdk.openadsdk.core.bg.bg.this.IL).toString());
                    return bgVar2;
                }
            });
        }
    }
}

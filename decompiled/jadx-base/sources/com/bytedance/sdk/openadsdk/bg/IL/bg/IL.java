package com.bytedance.sdk.openadsdk.bg.IL.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.bg.IL.bg.bX {
    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        super(context, tuv, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.bg.IL.bg.bX
    protected void bg() {
        this.eo = new com.bytedance.sdk.openadsdk.core.Kg.tuV(this.Kg, this.IL, this.WR, this.VB);
        this.bg.bg(((com.bytedance.sdk.openadsdk.core.Kg.tuV) this.eo).getVideoController());
        bX();
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg IL() {
        if (this.eo != null) {
            return ((com.bytedance.sdk.openadsdk.core.Kg.tuV) this.eo).getVideoModel();
        }
        return null;
    }
}

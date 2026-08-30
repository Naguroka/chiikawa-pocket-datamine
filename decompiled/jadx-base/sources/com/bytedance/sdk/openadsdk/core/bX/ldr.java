package com.bytedance.sdk.openadsdk.core.bX;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends com.bytedance.sdk.openadsdk.core.bX.eqN {
    public ldr(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        super(context, tuv, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bX.eqN
    public void bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        this.bg = new com.bytedance.sdk.openadsdk.core.bX.IL(context, tuv, adSlot);
        this.bg.addOnAttachStateChangeListener(this.ldr);
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg bX() {
        if (this.bg != null) {
            return ((com.bytedance.sdk.openadsdk.core.bX.IL) this.bg).getVideoModel();
        }
        return null;
    }
}

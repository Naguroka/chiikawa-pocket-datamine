package com.bytedance.sdk.openadsdk.core.bX;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.core.bX.bX {
    public IL(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        super(context, tuv, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bX.bX
    protected void bg() {
        this.IL = new com.bytedance.sdk.openadsdk.core.Kg.tuV(this.bg, this.bX, this.eqN, this.ldr);
        addView(this.IL, new android.view.ViewGroup.LayoutParams(-1, -1));
        if (this.zx != null) {
            setExpressInteractionListener(this.zx);
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.IL.bg getVideoModel() {
        if (this.IL != null) {
            return ((com.bytedance.sdk.openadsdk.core.Kg.tuV) this.IL).getVideoModel();
        }
        return null;
    }
}

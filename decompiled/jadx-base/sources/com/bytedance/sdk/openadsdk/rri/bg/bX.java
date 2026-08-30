package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.rri.bg.IL {
    private int eqN;

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    protected void IL(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    public int ldr() {
        return 100;
    }

    public bX(java.lang.Integer num, android.view.View view, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar) {
        super(num, view, tuv, 1000, bgVar);
        this.eqN = -1;
        IL(view);
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    protected boolean bX() {
        if (this.bg == null || this.bg.get() == null) {
            return false;
        }
        android.view.View view = this.bg.get();
        if (this.eqN == -1) {
            IL(view);
        }
        return com.bytedance.sdk.openadsdk.rri.bg.ldr.bg(view, this.eqN == 1, this.IL.JMw());
    }

    private void IL(android.view.View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.eqN = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    protected void eqN() {
        super.eqN();
    }
}

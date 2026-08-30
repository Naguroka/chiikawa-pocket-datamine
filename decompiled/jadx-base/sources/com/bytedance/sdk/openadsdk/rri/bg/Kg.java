package com.bytedance.sdk.openadsdk.rri.bg;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends com.bytedance.sdk.openadsdk.rri.bg.IL {
    private int eqN;

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    public int ldr() {
        return 200;
    }

    public Kg(java.lang.Integer num, android.view.View view, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.rri.bg.zx.bg bgVar) {
        super(num, view, tuv, 2000, bgVar);
        this.eqN = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    protected boolean bX() {
        return com.bytedance.sdk.openadsdk.rri.bg.ldr.bg(this.bg.get(), this.IL.JMw()) && this.eqN == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    protected void eqN() {
        super.eqN();
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    public void bg() {
        if (this.eqN != 1) {
            return;
        }
        super.bg();
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    protected void IL(int i) {
        if (WR()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.eqN = 0;
            Kg();
        }
        if (i == 3 || i == 2) {
            this.eqN = 2;
            Kg();
        }
        if (this.eqN == 1 || i != 0) {
            return;
        }
        this.eqN = 1;
        bg();
    }

    @Override // com.bytedance.sdk.openadsdk.rri.bg.IL
    public boolean PX() {
        int i = this.eqN;
        boolean z = i == 2 || i == 0;
        if (z) {
            this.bX.set(false);
        }
        return !z || super.PX();
    }
}

package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class ldr {
    private com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout IL;
    private boolean bX;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;
    private com.bytedance.sdk.openadsdk.component.reward.bg.Fy eqN;
    private boolean zx;

    public ldr(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bg = bgVar;
    }

    public void bg() {
        if (this.bX) {
            return;
        }
        this.bX = true;
        com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout rFEndCardBackUpLayout = (com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout) this.bg.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.jf);
        this.IL = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.bg);
        }
        if (this.bg.IL.HXG()) {
            this.eqN = new com.bytedance.sdk.openadsdk.component.reward.bg.Fy(this.bg);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.IL.zx zxVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout rFEndCardBackUpLayout = this.IL;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(rFEndCardBackUpLayout, new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ldr.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy = this.eqN;
        if (fy != null) {
            fy.bg(zxVar);
        }
    }

    public void IL() {
        this.zx = true;
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.IL, 0);
    }

    public boolean bg(com.bytedance.sdk.openadsdk.component.reward.bg.VzQ vzQ) {
        this.zx = true;
        com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy = this.eqN;
        if (fy == null || !fy.bg(vzQ)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.IL, 0);
        return true;
    }

    public void bX() {
        com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy = this.eqN;
        if (fy != null) {
            fy.bg();
        }
    }

    public void eqN() {
        com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy = this.eqN;
        if (fy != null) {
            fy.IL();
        }
    }

    public boolean zx() {
        com.bytedance.sdk.openadsdk.component.reward.bg.Fy fy = this.eqN;
        if (fy != null) {
            return fy.bX();
        }
        return false;
    }

    public void bg(int i) {
        com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout rFEndCardBackUpLayout = this.IL;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }

    public boolean ldr() {
        return this.zx;
    }
}

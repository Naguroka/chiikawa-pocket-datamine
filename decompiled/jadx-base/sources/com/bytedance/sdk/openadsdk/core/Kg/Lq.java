package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class Lq extends com.bytedance.sdk.openadsdk.core.Ta.IL.ldr implements android.view.View.OnClickListener {
    private boolean vb;

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr
    protected void bg(boolean z) {
    }

    public Lq(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.eqN.iR iRVar) {
        super(context, tuv, false, str, false, false, iRVar);
        this.vb = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr
    protected void IL() {
        if (!this.zx || !com.bytedance.sdk.openadsdk.core.Kg.kMt.IL(this.PX)) {
            this.eqN = false;
        }
        super.IL();
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr
    protected void bX() {
        if (this.vb) {
            super.bX();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.vb = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.IL != null) {
            this.IL.zx(z);
        }
    }

    public void eqN() {
        if (this.eo != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.eo, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (this.WR != null && this.WR.getVisibility() == 0) {
            VzQ();
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Ta.IL.ldr, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (this.WR != null && this.WR.getVisibility() == 0) {
            VzQ();
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    private void xxp() {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Kg, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.eo, 8);
    }

    private void VzQ() {
        iR();
        if (this.iR != null) {
            if (this.iR.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.bg.Dxa().eo(), this.bg.Dxa().bX(), this.bg.Dxa().IL(), this.Kg, this.bg);
            }
        }
        xxp();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (this.WR != null && this.WR.getVisibility() == 0) {
            com.bytedance.sdk.openadsdk.utils.ZQc.zx(this.iR);
        }
        bX();
    }

    public void setShowAdInteractionView(boolean z) {
        com.bykv.vk.openvk.bg.bg.bg.eqN.IL ilTa;
        if (this.IL == null || (ilTa = this.IL.Ta()) == null) {
            return;
        }
        ilTa.bg(z);
    }

    protected void zx() {
        iR();
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.iR, 0);
    }
}

package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class yDt {
    com.bytedance.sdk.component.adexpress.dynamic.eqN IL;
    private final android.app.Activity bX;
    com.bytedance.sdk.openadsdk.component.reward.top.bX bg;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg eqN;
    private boolean ldr;
    private boolean zx = false;

    public yDt(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.bX = bgVar.uu;
        this.eqN = bgVar;
    }

    public void bg() {
        if (this.zx) {
            return;
        }
        this.zx = true;
        if (this.eqN.bOf != null) {
            this.bg = this.eqN.bOf;
            this.ldr = true;
        } else {
            this.bg = (com.bytedance.sdk.openadsdk.component.reward.top.bX) this.eqN.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Rh);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.bg(this.eqN.IL);
            if (this.eqN.IL.HXG()) {
                bg(false);
            } else {
                bg(this.eqN.IL.ZyO());
            }
        }
    }

    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.setShowDislike(z);
    }

    public void IL(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN eqn = this.IL;
        if (eqn != null) {
            eqn.setSoundMute(z);
        }
    }

    public void bX(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.setShowSound(z);
    }

    public void eqN(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.setShowSkip(z);
    }

    public void bg(java.lang.String str, java.lang.CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.setTime(java.lang.String.valueOf(str), charSequence);
    }

    public void bg(java.lang.CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.setSkipText(charSequence);
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.showCountDownText();
    }

    public void zx(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.setSkipEnable(z);
    }

    public void bX() {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.showSkipButton();
    }

    public void eqN() {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.clickSkip();
        }
    }

    public void zx() {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.clickSound();
        }
    }

    public void ldr() {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar;
        if (this.ldr || (bXVar = this.bg) == null) {
            return;
        }
        bXVar.setSkipInvisiable();
    }

    public void bg(com.bytedance.sdk.openadsdk.component.reward.top.IL il) {
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar = this.bg;
        if (bXVar != null) {
            bXVar.setListener(il);
        }
    }

    public void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN eqn) {
        this.IL = eqn;
    }

    public void bg(int i) {
        android.view.View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.bX bXVar = this.bg;
        if (bXVar == null || bXVar.getITopLayout() == null || i == 0 || (viewFindViewById = this.bg.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + viewFindViewById.getWidth());
        if (width < com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bX, 16.0f)) {
            ((android.view.ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin += com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bX, 16.0f) - width;
            viewFindViewById.requestLayout();
        }
    }
}

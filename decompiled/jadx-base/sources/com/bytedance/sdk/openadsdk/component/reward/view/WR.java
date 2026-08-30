package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends com.bytedance.sdk.openadsdk.component.reward.view.eo {
    @Override // com.bytedance.sdk.openadsdk.component.reward.view.eo
    protected boolean bg() {
        return false;
    }

    public WR(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.eo
    public void bg(int i, int i2) {
        super.bg(i, i2);
        if (com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.eqN) && this.eqN.DDQ() == 3 && this.eqN.Uq() == 0) {
            try {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.bX.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.eo);
                frameLayout.setBackgroundColor(android.graphics.Color.parseColor("#000000"));
                if (this.eqN.xFs() == 1) {
                    int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 90.0f);
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iBX;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}

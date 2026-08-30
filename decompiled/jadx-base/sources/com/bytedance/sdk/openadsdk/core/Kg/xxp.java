package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class xxp extends com.bytedance.sdk.openadsdk.core.Kg.bg {
    private com.bytedance.sdk.openadsdk.core.Kg.Fy Ta;
    private android.widget.FrameLayout bg;
    private android.widget.FrameLayout yDt;

    public xxp(android.content.Context context) {
        super(context);
        this.IL = context;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.Kg.Fy fy, android.view.ViewGroup viewGroup) {
        if (tuv == null) {
            return;
        }
        setBackgroundColor(-1);
        this.bX = tuv;
        this.Ta = fy;
        if (tuv.Fx() == 7) {
            this.ldr = "rewarded_video";
        } else {
            this.ldr = "fullscreen_interstitial_ad";
        }
        IL();
        this.Ta.addView(this, new android.view.ViewGroup.LayoutParams(-2, -2));
        android.view.View viewFindViewById = viewGroup.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ULi);
        if (viewFindViewById != null) {
            java.lang.Object tag = viewFindViewById.getTag(com.bytedance.sdk.openadsdk.utils.Ta.ULi);
            if (tag instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) tag;
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(str, viewFindViewById);
            }
        }
    }

    private void IL() {
        this.iR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.Ta.getExpectExpressWidth());
        this.Kg = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, this.Ta.getExpectExpressWidth());
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(this.iR, this.Kg);
        }
        layoutParams.width = this.iR;
        layoutParams.height = this.Kg;
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.bX.Uq();
        bX();
    }

    private void bX() {
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(this.IL);
        this.bg = bXVar;
        addView(bXVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.zx.bX(this.IL);
        this.yDt = bXVar2;
        this.bg.addView(bXVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.yDt.removeAllViews();
    }

    public android.widget.FrameLayout getVideoContainer() {
        return this.yDt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Kg.bg
    protected void bg(android.view.View view, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
        com.bytedance.sdk.openadsdk.core.Kg.Fy fy = this.Ta;
        if (fy != null) {
            fy.bg(view, i, ydt);
        }
    }

    public android.view.View getBackupContainerBackgroundView() {
        return this.bg;
    }
}

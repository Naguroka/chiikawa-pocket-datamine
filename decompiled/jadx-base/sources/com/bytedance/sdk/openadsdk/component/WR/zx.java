package com.bytedance.sdk.openadsdk.component.WR;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.component.WR.bX {
    com.bytedance.sdk.openadsdk.component.WR.zx.bg Ta;

    public interface bg {
        void bg(android.view.View view, int i);
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.zx.eqN getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.zx.Kg getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.widget.xxp getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public android.view.View getUserInfo() {
        return null;
    }

    public zx(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        super(context);
        bg(context, tuv);
    }

    private void bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.Kg.zx zxVar = new com.bytedance.sdk.openadsdk.core.Kg.zx(context);
        com.bytedance.sdk.openadsdk.core.Kg.eqN.bg().bX(zxVar);
        zxVar.bg(tuv, new com.bytedance.sdk.openadsdk.core.Kg.zx.IL() { // from class: com.bytedance.sdk.openadsdk.component.WR.zx.1
            @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
            public void bg(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
            public void e_() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
            public android.view.View bg() {
                if (com.bytedance.sdk.openadsdk.component.WR.zx.this.Kg != null) {
                    return com.bytedance.sdk.openadsdk.component.WR.zx.this.Kg.getTopDislike();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
            public android.view.View IL() {
                return com.bytedance.sdk.openadsdk.component.WR.zx.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
            public void bg(android.view.View view, int i) {
                if (com.bytedance.sdk.openadsdk.component.WR.zx.this.Ta != null) {
                    com.bytedance.sdk.openadsdk.component.WR.zx.this.Ta.bg(view, i);
                }
            }
        }, "open_ad");
        addView(zxVar, new android.view.ViewGroup.LayoutParams(-1, -1));
        zxVar.vb();
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 9.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        this.eqN = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        layoutParams.leftMargin = iBX2;
        layoutParams.bottomMargin = iBX2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.eqN, layoutParams);
        this.PX = new com.bytedance.sdk.openadsdk.core.widget.bX(context);
        this.PX.setPadding(iBX, 0, iBX, 0);
        this.PX.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 32.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iBX2, iBX2);
        addView(this.PX, layoutParams2);
        if (this.Kg != null) {
            addView(this.Kg);
        }
    }

    public void setRenderListener(com.bytedance.sdk.openadsdk.component.WR.zx.bg bgVar) {
        this.Ta = bgVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Ta = null;
    }
}

package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class Ta {
    private android.widget.RelativeLayout IL;
    private com.bytedance.sdk.openadsdk.common.xxp Kg;
    private final android.content.Context bX;
    private final com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private com.bytedance.sdk.component.WR.eqN eqN;
    private com.bytedance.sdk.openadsdk.common.tuV iR;
    private final java.lang.String ldr;
    private android.widget.ImageView zx;

    public Ta(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        this.bX = context;
        this.bg = tuv;
        this.ldr = str;
        ldr();
    }

    private static android.widget.RelativeLayout bg(android.content.Context context) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new com.bytedance.sdk.openadsdk.common.WR(context));
        com.bytedance.sdk.component.WR.eqN eqn = new com.bytedance.sdk.component.WR.eqN(context);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.Pae);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.Ta.Ys);
        relativeLayout.addView(eqn, layoutParams);
        com.bytedance.sdk.openadsdk.common.Kg kg = new com.bytedance.sdk.openadsdk.common.Kg(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(kg.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(kg, layoutParams2);
        return relativeLayout;
    }

    private void ldr() {
        android.widget.RelativeLayout relativeLayoutBg = bg(this.bX);
        this.IL = relativeLayoutBg;
        this.eqN = (com.bytedance.sdk.component.WR.eqN) relativeLayoutBg.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Pae);
        com.bytedance.sdk.openadsdk.common.tuV tuv = new com.bytedance.sdk.openadsdk.common.tuV(this.bX, (android.widget.RelativeLayout) this.IL.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Ys), this.bg);
        this.iR = tuv;
        this.zx = tuv.bX();
        this.Kg = new com.bytedance.sdk.openadsdk.common.xxp(this.bX, (android.widget.LinearLayout) this.IL.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.bOf), this.eqN, this.bg, this.ldr);
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.common.tuV tuv = this.iR;
        if (tuv != null) {
            tuv.bg();
        }
        com.bytedance.sdk.openadsdk.common.xxp xxpVar = this.Kg;
        if (xxpVar != null) {
            xxpVar.bg();
        }
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.common.tuV tuv = this.iR;
        if (tuv != null) {
            tuv.IL();
        }
        com.bytedance.sdk.openadsdk.common.xxp xxpVar = this.Kg;
        if (xxpVar != null) {
            xxpVar.IL();
        }
    }

    public android.widget.ImageView bX() {
        return this.zx;
    }

    public com.bytedance.sdk.component.WR.eqN eqN() {
        return this.eqN;
    }

    public android.view.View zx() {
        return this.IL;
    }

    public void bg(android.webkit.WebView webView, int i, com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg bgVar) {
        com.bytedance.sdk.openadsdk.common.tuV tuv = this.iR;
        if (tuv != null) {
            tuv.bg(i);
        }
        com.bytedance.sdk.openadsdk.common.xxp xxpVar = this.Kg;
        if (xxpVar != null) {
            xxpVar.bg(webView, bgVar);
        }
    }
}

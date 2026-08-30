package com.bytedance.sdk.component.adexpress.dynamic.bX;

/* JADX INFO: loaded from: classes3.dex */
public class VB implements com.bytedance.sdk.component.adexpress.dynamic.bX.iR<android.view.ViewGroup> {
    private final android.widget.FrameLayout IL;
    private final com.bytedance.sdk.component.adexpress.ldr.eo bg;

    public VB(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx zxVar, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar, java.lang.String str, java.lang.String str2) {
        int iRJ;
        com.bytedance.sdk.component.adexpress.ldr.eo eoVar = new com.bytedance.sdk.component.adexpress.ldr.eo(context);
        this.bg = eoVar;
        eoVar.setImageLottieTosPath(str);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.IL = frameLayout;
        frameLayout.addView(eoVar, new android.widget.FrameLayout.LayoutParams(-2, -2));
        double dZCS = iRVar.zCS();
        dZCS = dZCS == 0.0d ? 1.0d : dZCS;
        double dYs = iRVar.Ys();
        double d = dYs != 0.0d ? dYs : 1.0d;
        if ("22".equals(str2)) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if ("20".equals(str2)) {
            bg(context, frameLayout, iRVar);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 81;
            if (iRVar.RJ() > 0) {
                iRJ = iRVar.RJ();
            } else {
                iRJ = com.bytedance.sdk.component.adexpress.eqN.IL() ? 0 : 120;
            }
            layoutParams2.bottomMargin = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(context, iRJ);
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) (((double) zxVar.getDynamicWidth()) * 0.32d * dZCS), (int) (((double) zxVar.getDynamicWidth()) * 0.32d * d));
        layoutParams3.gravity = 17;
        frameLayout.setLayoutParams(layoutParams3);
    }

    private void bg(android.content.Context context, android.widget.FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.eqN.iR iRVar) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -com.bytedance.sdk.component.utils.Ja.bg(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(com.bytedance.sdk.component.utils.Fy.IL(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setId(2097610738);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, com.bytedance.sdk.component.utils.Ja.bg(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(com.bytedance.sdk.component.utils.Fy.IL(context, "tt_splash_brush_mask_hint")));
        if (iRVar != null && !android.text.TextUtils.isEmpty(iRVar.GvG())) {
            textView2.setText(iRVar.GvG());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void bg() {
        this.bg.Kg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public void IL() {
        this.bg.ldr();
        android.view.ViewParent parent = this.IL.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.IL);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX.iR
    public android.view.ViewGroup bX() {
        return this.IL;
    }
}

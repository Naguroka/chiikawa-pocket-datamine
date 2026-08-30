package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends android.widget.LinearLayout {
    public Kg(android.content.Context context) {
        super(context);
        bg();
    }

    private static android.widget.ImageView bg(android.content.Context context, float f, float f2, float f3, float f4) {
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setClickable(true);
        eqn.setFocusable(true);
        eqn.setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, f3), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, f4), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, f3), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, f4));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 40.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f));
        if (f > 0.0f) {
            layoutParams.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, f);
        }
        if (f2 > 0.0f) {
            layoutParams.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, f2);
        }
        eqn.setLayoutParams(layoutParams);
        return eqn;
    }

    private void bg() {
        android.content.Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.Ta.bOf);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(android.graphics.Color.parseColor("#1F161823"));
        addView(view, new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setOrientation(0);
        addView(zxVar, new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f)));
        android.widget.ImageView imageViewBg = bg(context, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewBg.setId(com.bytedance.sdk.openadsdk.utils.Ta.kU);
        imageViewBg.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_arrow_backward"));
        zxVar.addView(imageViewBg);
        android.view.View view2 = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        zxVar.addView(view2, layoutParams);
        android.widget.ImageView imageViewBg2 = bg(context, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewBg2.setId(com.bytedance.sdk.openadsdk.utils.Ta.qp);
        imageViewBg2.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_arrow_forward"));
        zxVar.addView(imageViewBg2);
        android.view.View view3 = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        zxVar.addView(view3, layoutParams2);
        android.widget.ImageView imageViewBg3 = bg(context, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewBg3.setId(com.bytedance.sdk.openadsdk.utils.Ta.eDa);
        imageViewBg3.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_refresh"));
        zxVar.addView(imageViewBg3);
        android.view.View view4 = new android.view.View(context);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        zxVar.addView(view4, layoutParams3);
        android.widget.ImageView imageViewBg4 = bg(context, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewBg4.setId(com.bytedance.sdk.openadsdk.utils.Ta.RFq);
        imageViewBg4.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_link"));
        zxVar.addView(imageViewBg4);
    }
}

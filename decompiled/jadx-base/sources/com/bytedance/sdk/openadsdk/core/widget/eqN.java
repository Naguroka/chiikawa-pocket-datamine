package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class eqN {
    public static android.graphics.drawable.Drawable bg() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 1.0f), android.graphics.Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(android.graphics.Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    public static android.graphics.drawable.Drawable IL() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 44.0f));
        gradientDrawable.setStroke(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg(), 1.0f), android.graphics.Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(android.graphics.Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}

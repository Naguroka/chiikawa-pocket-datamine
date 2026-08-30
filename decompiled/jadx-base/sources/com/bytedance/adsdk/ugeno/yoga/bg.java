package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends android.view.ViewGroup {
    public com.bytedance.adsdk.ugeno.yoga.PX getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.bg) {
            throw null;
        }
        com.bytedance.adsdk.ugeno.yoga.PX pxBg = com.bytedance.adsdk.ugeno.yoga.Ta.bg();
        com.bytedance.adsdk.ugeno.yoga.Kg.bg(new com.bytedance.adsdk.ugeno.yoga.Kg.bg(layoutParams), pxBg, view);
        pxBg.bg(view);
        pxBg.bg((com.bytedance.adsdk.ugeno.yoga.WR) new com.bytedance.adsdk.ugeno.yoga.Kg.IL());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new java.lang.RuntimeException("Attempting to layout a VirtualYogaLayout");
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.bytedance.adsdk.ugeno.yoga.Kg.bg(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.bytedance.adsdk.ugeno.yoga.Kg.bg(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.bytedance.adsdk.ugeno.yoga.Kg.bg;
    }
}

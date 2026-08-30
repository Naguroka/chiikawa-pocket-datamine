package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class yDt extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    public yDt(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Lq = new android.widget.ImageView(context);
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            this.Kg = java.lang.Math.max(dynamicRootView.getLogoUnionHeight(), this.Kg);
        }
        addView(this.Lq, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        }
        ((android.widget.ImageView) this.Lq).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_ad_logo"));
        ((android.widget.ImageView) this.Lq).setColorFilter(this.PX.iR(), android.graphics.PorterDuff.Mode.SRC_IN);
        return true;
    }
}

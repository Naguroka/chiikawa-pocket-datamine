package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class Ta extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    public Ta(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Lq = new android.widget.TextView(context);
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        addView(this.Lq, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        this.Lq.setTextAlignment(this.PX.Kg());
        ((android.widget.TextView) this.Lq).setTextColor(this.PX.iR());
        ((android.widget.TextView) this.Lq).setTextSize(this.PX.zx());
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            ((android.widget.TextView) this.Lq).setIncludeFontPadding(false);
            ((android.widget.TextView) this.Lq).setTextSize(java.lang.Math.min(((com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), this.Kg) - this.PX.IL()) - this.PX.bg()) - 0.5f, this.PX.zx()));
            ((android.widget.TextView) this.Lq).setText(com.bytedance.sdk.component.utils.Fy.bg(getContext(), "tt_logo_en"));
            return true;
        }
        if (bg()) {
            if (com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL()) {
                ((android.widget.TextView) this.Lq).setText(com.bytedance.sdk.component.adexpress.dynamic.zx.VB.bg());
                return true;
            }
            ((android.widget.TextView) this.Lq).setText(com.bytedance.sdk.component.adexpress.dynamic.zx.VB.bg(this.PX.IL));
            return true;
        }
        ((android.widget.TextView) this.Lq).setText(com.bytedance.sdk.component.utils.Fy.IL(getContext(), "tt_logo_cn"));
        return true;
    }

    private boolean bg() {
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            return false;
        }
        return (!android.text.TextUtils.isEmpty(this.PX.IL) && this.PX.IL.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL();
    }
}

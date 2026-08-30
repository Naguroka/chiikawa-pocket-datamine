package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class eo extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    public eo(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            this.Lq = new android.widget.ImageView(context);
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            this.iR = this.Kg;
        } else {
            this.Lq = new android.widget.TextView(context);
        }
        this.Lq.setTag(3);
        addView(this.Lq, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.Lq);
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().Kg() && dynamicRootView.getRenderRequest().JAA()) {
                return;
            }
            this.Lq.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            android.graphics.drawable.Drawable drawableBg = com.bytedance.sdk.component.adexpress.eqN.bX.bg(getContext(), this.PX);
            if (drawableBg != null) {
                ((android.widget.ImageView) this.Lq).setBackground(drawableBg);
            }
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            int iEqN = com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_reward_full_feedback");
            if (iEqN > 0) {
                ((android.widget.ImageView) this.Lq).setImageResource(iEqN);
            }
            return true;
        }
        ((android.widget.TextView) this.Lq).setText(getText());
        this.Lq.setTextAlignment(this.PX.Kg());
        ((android.widget.TextView) this.Lq).setTextColor(this.PX.iR());
        ((android.widget.TextView) this.Lq).setTextSize(this.PX.zx());
        this.Lq.setBackground(getBackgroundDrawable());
        if (!this.PX.tC()) {
            ((android.widget.TextView) this.Lq).setMaxLines(1);
            ((android.widget.TextView) this.Lq).setGravity(17);
            ((android.widget.TextView) this.Lq).setEllipsize(android.text.TextUtils.TruncateAt.END);
        } else {
            int iRri = this.PX.rri();
            if (iRri > 0) {
                ((android.widget.TextView) this.Lq).setLines(iRri);
                ((android.widget.TextView) this.Lq).setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
        }
        this.Lq.setPadding((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bX()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.IL()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.eqN()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bg()));
        ((android.widget.TextView) this.Lq).setGravity(17);
        return true;
    }

    public java.lang.String getText() {
        return com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_feedback");
    }
}

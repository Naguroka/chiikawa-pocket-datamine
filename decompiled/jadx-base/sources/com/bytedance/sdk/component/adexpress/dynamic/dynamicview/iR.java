package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    public iR(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.Lq = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.bg(context);
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        addView(this.Lq, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr
    protected android.widget.FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.eqN.IL() && "fillButton".equals(this.Ta.eo().IL())) {
            ((android.widget.TextView) this.Lq).setEllipsize(android.text.TextUtils.TruncateAt.END);
            ((android.widget.TextView) this.Lq).setMaxLines(1);
            android.widget.FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.PX.VzQ() * 2;
            widgetLayoutParams.height -= this.PX.VzQ() * 2;
            widgetLayoutParams.topMargin += this.PX.VzQ();
            widgetLayoutParams.leftMargin += this.PX.VzQ();
            widgetLayoutParams.setMarginStart(widgetLayoutParams.leftMargin);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        if (android.text.TextUtils.equals("download-progress-button", this.Ta.eo().IL()) && android.text.TextUtils.isEmpty(this.PX.eo())) {
            this.Lq.setVisibility(4);
            return true;
        }
        this.Lq.setTextAlignment(this.PX.Kg());
        ((android.widget.TextView) this.Lq).setText(this.PX.eo());
        ((android.widget.TextView) this.Lq).setTextColor(this.PX.iR());
        ((android.widget.TextView) this.Lq).setTextSize(this.PX.zx());
        ((android.widget.TextView) this.Lq).setGravity(17);
        ((android.widget.TextView) this.Lq).setIncludeFontPadding(false);
        if ("fillButton".equals(this.Ta.eo().IL())) {
            this.Lq.setPadding(0, 0, 0, 0);
        } else {
            this.Lq.setPadding(this.PX.bX(), this.PX.IL(), this.PX.eqN(), this.PX.bg());
        }
        return true;
    }
}

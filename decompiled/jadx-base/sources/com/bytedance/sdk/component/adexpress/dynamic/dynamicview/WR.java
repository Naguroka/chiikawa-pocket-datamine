package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    public WR(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            this.Lq = new android.widget.ImageView(context);
        } else {
            this.Lq = new com.bytedance.sdk.component.adexpress.ldr.WR(context);
        }
        this.Lq.setTag(3);
        addView(this.Lq, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.Lq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            android.graphics.drawable.Drawable drawableBg = com.bytedance.sdk.component.adexpress.eqN.bX.bg(getContext(), this.PX);
            if (drawableBg != null) {
                this.Lq.setBackground(drawableBg);
            }
            int iEqN = com.bytedance.sdk.component.utils.Fy.eqN(getContext(), "tt_close_btn");
            if (iEqN > 0) {
                ((android.widget.ImageView) this.Lq).setImageResource(iEqN);
            }
            ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iBg = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.xxp());
        if (this.Lq instanceof com.bytedance.sdk.component.adexpress.ldr.WR) {
            ((com.bytedance.sdk.component.adexpress.ldr.WR) this.Lq).setRadius((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.Lq()));
            ((com.bytedance.sdk.component.adexpress.ldr.WR) this.Lq).setStrokeWidth(iBg);
            ((com.bytedance.sdk.component.adexpress.ldr.WR) this.Lq).setStrokeColor(this.PX.vb());
            ((com.bytedance.sdk.component.adexpress.ldr.WR) this.Lq).setBgColor(this.PX.DDQ());
            ((com.bytedance.sdk.component.adexpress.ldr.WR) this.Lq).setDislikeColor(this.PX.iR());
            ((com.bytedance.sdk.component.adexpress.ldr.WR) this.Lq).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, 1.0f));
        }
        return true;
    }
}

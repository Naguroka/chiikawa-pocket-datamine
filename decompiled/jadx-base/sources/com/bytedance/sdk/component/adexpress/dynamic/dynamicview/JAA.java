package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class JAA extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr {
    private int bg;

    public JAA(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.bg = 0;
        this.Lq = new com.bytedance.sdk.component.adexpress.ldr.JAA(context, null);
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        addView(this.Lq, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr
    protected android.widget.FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iBg = (int) ((com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.zx()) * 5.0f) + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bX() + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.eqN())));
        if (this.iR > iBg && 4 == this.PX.Kg()) {
            this.bg = (this.iR - iBg) / 2;
        }
        this.iR = iBg;
        return new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public void ldr() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
        layoutParams.topMargin = this.eo;
        layoutParams.leftMargin = this.WR + this.bg;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        double dTa = this.PX.Ta();
        if (com.bytedance.sdk.component.adexpress.eqN.IL() && (dTa < 0.0d || dTa > 5.0d || (this.yDt != null && this.yDt.getRenderRequest() != null && this.yDt.getRenderRequest().eo() != 4))) {
            this.Lq.setVisibility(8);
            return true;
        }
        double d = (dTa < 0.0d || dTa > 5.0d) ? 5.0d : dTa;
        this.Lq.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.ldr.JAA) this.Lq).bg(d, this.PX.iR(), (int) this.PX.zx(), ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.IL())) + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.bg())) + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.zx())));
        return true;
    }
}

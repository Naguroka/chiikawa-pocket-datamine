package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class rri extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr implements com.bytedance.sdk.component.adexpress.dynamic.bX {
    private int Fy;
    private int IL;
    private int bg;

    public rri(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        setTag(java.lang.Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        bg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr
    protected android.widget.FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bX()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.IL()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.eqN()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bg()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public void ldr() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.WR;
        layoutParams.topMargin = this.eo;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.Fy == 0) {
            setMeasuredDimension(this.IL, this.Kg);
        } else {
            setMeasuredDimension(this.bg, this.Kg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX
    public void bg(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        this.Fy = i;
    }

    private void bg() {
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> listVB = this.Ta.VB();
        if (listVB == null || listVB.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg : listVB) {
            if (kg.eo().bg() == 21) {
                this.bg = (int) (this.iR - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, kg.Kg()));
            }
            if (kg.eo().bg() == 20) {
                this.IL = (int) (this.iR - com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, kg.Kg()));
            }
        }
    }
}

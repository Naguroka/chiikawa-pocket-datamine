package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class DDQ extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr implements com.bytedance.sdk.component.adexpress.dynamic.bX {
    private int Fy;
    boolean IL;
    private int LZ;
    int bg;
    private boolean tC;

    public DDQ(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        this.LZ = 0;
        setTag(java.lang.Integer.valueOf(getClickArea()));
        bg();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().JAA()) {
            return;
        }
        if (this.Lq != null) {
            this.Lq.setVisibility(8);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr
    protected android.widget.FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public void ldr() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        if (this.IL) {
            layoutParams.leftMargin = this.WR;
        } else {
            layoutParams.leftMargin = this.WR + this.LZ;
        }
        if (this.tC && this.PX != null) {
            layoutParams.leftMargin = ((this.WR + this.LZ) - ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bX()))) - ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.eqN()));
        }
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            layoutParams.topMargin = this.eo - ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.IL()));
        } else {
            layoutParams.topMargin = this.eo;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        if (com.bytedance.sdk.component.adexpress.eqN.iR.IL(this.yDt.getRenderRequest().eqN())) {
            return true;
        }
        super.WR();
        setPadding((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bX()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.IL()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.eqN()), (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bg()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.tC && this.PX != null) {
            setMeasuredDimension(this.Fy + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bX())) + ((int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.eqN())), this.Kg);
        } else if (this.IL) {
            setMeasuredDimension(this.iR, this.Kg);
        } else {
            setMeasuredDimension(this.bg, this.Kg);
        }
    }

    private void bg() {
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> listVB = this.Ta.VB();
        if (listVB == null || listVB.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg : listVB) {
            if (android.text.TextUtils.equals("skip-with-time-skip-btn", kg.eo().IL())) {
                this.Fy = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, kg.Kg() + (com.bytedance.sdk.component.adexpress.eqN.IL() ? kg.Ta() : 0));
                this.bg = this.iR - this.Fy;
                break;
            }
        }
        this.LZ = this.iR - this.bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX
    public void bg(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.tC != z2) {
            this.tC = z2;
            ldr();
            return;
        }
        if (z && this.IL != z) {
            this.IL = z;
            ldr();
        }
        this.IL = z;
    }
}

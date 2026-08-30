package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class tC extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iR implements com.bytedance.sdk.component.adexpress.dynamic.bX {
    private int Fy;
    private int IL;
    private int[] bg;

    public tC(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iR, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        ((android.widget.TextView) this.Lq).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public void ldr() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.text.TextUtils.isEmpty(((android.widget.TextView) this.Lq).getText())) {
            setMeasuredDimension(0, this.Kg);
        } else {
            setMeasuredDimension(this.iR, this.Kg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX
    public void bg(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        java.lang.String strBg = com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.Lq.setVisibility(0);
            ((android.widget.TextView) this.Lq).setText("| ".concat(java.lang.String.valueOf(strBg)));
            this.Lq.measure(-2, -2);
            this.bg = new int[]{this.Lq.getMeasuredWidth() + 1, this.Lq.getMeasuredHeight()};
            android.view.View view = this.Lq;
            int[] iArr = this.bg;
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((android.widget.TextView) this.Lq).setGravity(17);
            ((android.widget.TextView) this.Lq).setIncludeFontPadding(false);
            bg();
            this.Lq.setPadding(this.PX.bX(), this.IL, this.PX.eqN(), this.Fy);
        }
        requestLayout();
    }

    private void bg() {
        int iBg = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.VB, this.PX.zx());
        this.IL = ((this.Kg - iBg) / 2) - this.PX.bg();
        this.Fy = 0;
    }
}

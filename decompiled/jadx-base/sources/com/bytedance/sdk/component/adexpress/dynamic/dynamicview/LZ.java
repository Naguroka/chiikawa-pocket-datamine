package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class LZ extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iR implements com.bytedance.sdk.component.adexpress.dynamic.bX {
    public LZ(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iR, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr
    protected android.widget.FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.text.TextUtils.isEmpty(((android.widget.TextView) this.Lq).getText())) {
            setMeasuredDimension(0, this.Kg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public void ldr() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
        layoutParams.leftMargin = this.WR;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX
    public void bg(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        if (i == 0) {
            if (getParent() != null) {
                ((android.view.ViewGroup) getParent()).removeView(this);
            }
        } else {
            ((android.widget.TextView) this.Lq).setText(" | " + java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_full_skip_count_down"), java.lang.Integer.valueOf(i)));
        }
        requestLayout();
    }
}

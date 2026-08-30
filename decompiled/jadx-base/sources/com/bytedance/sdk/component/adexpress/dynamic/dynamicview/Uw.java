package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class Uw extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iR implements com.bytedance.sdk.component.adexpress.dynamic.bX {
    private boolean Fy;
    private boolean IL;
    private boolean bg;

    public Uw(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(kg.eo().IL())) {
            dynamicRootView.setTimedown(this.Kg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.iR, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        super.WR();
        if (com.bytedance.sdk.component.adexpress.eqN.iR.IL(this.yDt.getRenderRequest().eqN())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.Ta.eo().IL())) {
            ((android.widget.TextView) this.Lq).setText(java.lang.String.valueOf((int) java.lang.Double.parseDouble(this.PX.eo())));
            return true;
        }
        ((android.widget.TextView) this.Lq).setText(((int) java.lang.Double.parseDouble(this.PX.eo())) + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zx
    public void ldr() {
        if (android.text.TextUtils.equals("skip-with-countdowns-video-countdown", this.Ta.eo().IL()) || android.text.TextUtils.equals("skip-with-time-countdown", this.Ta.eo().IL())) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.iR, this.Kg);
            layoutParams.gravity = 8388627;
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                layoutParams.leftMargin = this.WR;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            setLayoutParams(layoutParams);
            return;
        }
        super.ldr();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.text.TextUtils.isEmpty(((android.widget.TextView) this.Lq).getText())) {
            setMeasuredDimension(0, this.Kg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX
    public void bg(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 || this.Fy) {
            ((android.widget.TextView) this.Lq).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (java.lang.Integer.parseInt((java.lang.String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (java.lang.Exception unused) {
        }
        setVisibility(0);
        if (!z && this.yDt.getRenderRequest().bg() && com.bytedance.sdk.component.adexpress.eqN.iR.IL(this.yDt.getRenderRequest().eqN())) {
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                ((android.widget.TextView) this.Lq).setText(i + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
            } else {
                ((android.widget.TextView) this.Lq).setText(java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_full_skip"), java.lang.Integer.valueOf(i)));
            }
            this.bg = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.eqN.IL() && !"open_ad".equals(this.yDt.getRenderRequest().eqN()) && this.yDt.getRenderRequest().bg()) {
            this.Fy = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.Ta.eo().IL())) {
            ((android.widget.TextView) this.Lq).setText(charSequence);
            return;
        }
        ((android.widget.TextView) this.Lq).setText(((java.lang.Object) charSequence) + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
        this.IL = true;
        if (this.bg) {
            java.lang.CharSequence text = ((android.widget.TextView) this.Lq).getText();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.zx.VB.IL(text != null ? text.toString() : "", this.PX.zx(), true)[0] + com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), this.PX.bX() + this.PX.eqN())), this.Kg);
            layoutParams.gravity = 8388629;
            this.Lq.setLayoutParams(layoutParams);
            this.bg = false;
            requestLayout();
        }
    }
}

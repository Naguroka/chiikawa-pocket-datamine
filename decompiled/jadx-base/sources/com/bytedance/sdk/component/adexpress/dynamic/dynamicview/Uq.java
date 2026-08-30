package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

/* JADX INFO: loaded from: classes3.dex */
public class Uq extends com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr implements com.bytedance.sdk.component.adexpress.dynamic.bX {
    private boolean bg;

    public Uq(android.content.Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        super(context, dynamicRootView, kg);
        if (dynamicRootView.getRenderRequest() != null) {
            this.bg = dynamicRootView.getRenderRequest().Ta();
        }
        this.iR = this.Kg;
        this.Lq = new android.widget.ImageView(context);
        this.Lq.setTag(java.lang.Integer.valueOf(getClickArea()));
        addView(this.Lq, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().JAA()) {
            return;
        }
        this.Lq.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    public boolean WR() {
        android.graphics.drawable.Drawable drawableBX;
        super.WR();
        ((android.widget.ImageView) this.Lq).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.graphics.drawable.Drawable drawableBg = com.bytedance.sdk.component.adexpress.eqN.bX.bg(getContext(), this.PX);
        if (drawableBg != null) {
            ((android.widget.ImageView) this.Lq).setBackground(drawableBg);
        }
        if (this.bg) {
            drawableBX = com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_close_btn");
        } else {
            drawableBX = com.bytedance.sdk.component.utils.Fy.bX(getContext(), "tt_skip_btn");
            if (drawableBX != null) {
                drawableBX.setAutoMirrored(true);
            }
        }
        if (drawableBX != null) {
            ((android.widget.ImageView) this.Lq).setImageDrawable(drawableBX);
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bX
    public void bg(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }
}

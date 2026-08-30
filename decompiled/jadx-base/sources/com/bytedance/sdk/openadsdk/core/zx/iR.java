package com.bytedance.sdk.openadsdk.core.zx;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends android.widget.RelativeLayout {
    public iR(android.content.Context context) {
        super(context);
    }

    public iR(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.RelativeLayout
    public void setGravity(int i) {
        super.setGravity(com.bytedance.sdk.openadsdk.core.zx.WR.bg(i));
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.zx.WR.bg(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}

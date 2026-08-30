package com.bytedance.sdk.openadsdk.core.zx;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends android.widget.ImageView {
    public eqN(android.content.Context context) {
        super(context);
    }

    public eqN(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public eqN(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.zx.WR.bg(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}

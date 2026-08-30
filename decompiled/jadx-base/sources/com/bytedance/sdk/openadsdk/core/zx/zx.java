package com.bytedance.sdk.openadsdk.core.zx;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends android.widget.LinearLayout {
    public zx(android.content.Context context) {
        super(context);
        init();
    }

    public zx(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public zx(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setLayoutDirection(3);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.zx.WR.bg(this, layoutParams));
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        super.setGravity(com.bytedance.sdk.openadsdk.core.zx.WR.bg(i));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}

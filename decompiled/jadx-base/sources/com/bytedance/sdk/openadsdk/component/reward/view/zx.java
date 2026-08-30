package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.core.zx.eqN {
    private float bg;

    public zx(android.content.Context context) {
        this(context, null);
    }

    public zx(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zx.eqN, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i3 = getLayoutParams().width;
        int i4 = getLayoutParams().height;
        float f = this.bg;
        if (f > 0.0f) {
            if (i3 == -2) {
                size = (int) (size2 * f);
                mode = 1073741824;
            } else if (i4 == -2) {
                size2 = (int) (size / f);
                mode2 = 1073741824;
            }
        }
        setMeasuredDimension(android.view.View.MeasureSpec.makeMeasureSpec(size, mode), android.view.View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f) {
        this.bg = f;
    }
}

package com.bytedance.sdk.openadsdk.core.zx;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends android.widget.TextView {
    public Kg(android.content.Context context) {
        super(context);
        bg();
    }

    public Kg(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bg();
    }

    private void bg() {
        setTextDirection(5);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(com.bytedance.sdk.openadsdk.core.zx.WR.bg(i));
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.zx.WR.bg(this, layoutParams));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.utils.LZ.IL("PAGTextView", th.toString());
        }
    }
}

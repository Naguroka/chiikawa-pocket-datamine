package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class ScrimInsetsFrameLayout extends android.widget.FrameLayout {
    private boolean drawBottomInsetForeground;
    private boolean drawTopInsetForeground;
    android.graphics.drawable.Drawable insetForeground;
    android.graphics.Rect insets;
    private android.graphics.Rect tempRect;

    protected void onInsetsChanged(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
    }

    public ScrimInsetsFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tempRect = new android.graphics.Rect();
        this.drawTopInsetForeground = true;
        this.drawBottomInsetForeground = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.ScrimInsetsFrameLayout, i, com.google.android.material.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.insetForeground = typedArrayObtainStyledAttributes.getDrawable(com.google.android.material.R.styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(this, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                if (com.google.android.material.internal.ScrimInsetsFrameLayout.this.insets == null) {
                    com.google.android.material.internal.ScrimInsetsFrameLayout.this.insets = new android.graphics.Rect();
                }
                com.google.android.material.internal.ScrimInsetsFrameLayout.this.insets.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                com.google.android.material.internal.ScrimInsetsFrameLayout.this.onInsetsChanged(windowInsetsCompat);
                com.google.android.material.internal.ScrimInsetsFrameLayout.this.setWillNotDraw(!windowInsetsCompat.hasSystemWindowInsets() || com.google.android.material.internal.ScrimInsetsFrameLayout.this.insetForeground == null);
                androidx.core.view.ViewCompat.postInvalidateOnAnimation(com.google.android.material.internal.ScrimInsetsFrameLayout.this);
                return windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }

    public void setScrimInsetForeground(android.graphics.drawable.Drawable drawable) {
        this.insetForeground = drawable;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.drawTopInsetForeground = z;
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.drawBottomInsetForeground = z;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.insets == null || this.insetForeground == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.drawTopInsetForeground) {
            this.tempRect.set(0, 0, width, this.insets.top);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        if (this.drawBottomInsetForeground) {
            this.tempRect.set(0, height - this.insets.bottom, width, height);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
        }
        this.tempRect.set(0, this.insets.top, this.insets.left, height - this.insets.bottom);
        this.insetForeground.setBounds(this.tempRect);
        this.insetForeground.draw(canvas);
        this.tempRect.set(width - this.insets.right, this.insets.top, width, height - this.insets.bottom);
        this.insetForeground.setBounds(this.tempRect);
        this.insetForeground.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.drawable.Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.drawable.Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}

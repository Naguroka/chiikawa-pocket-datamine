package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {
    private androidx.appcompat.widget.ContentFrameLayout.OnAttachListener mAttachListener;
    private final android.graphics.Rect mDecorPadding;
    private android.util.TypedValue mFixedHeightMajor;
    private android.util.TypedValue mFixedHeightMinor;
    private android.util.TypedValue mFixedWidthMajor;
    private android.util.TypedValue mFixedWidthMinor;
    private android.util.TypedValue mMinWidthMajor;
    private android.util.TypedValue mMinWidthMinor;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDecorPadding = new android.graphics.Rect();
    }

    public void dispatchFitSystemWindows(android.graphics.Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(androidx.appcompat.widget.ContentFrameLayout.OnAttachListener onAttachListener) {
        this.mAttachListener = onAttachListener;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.mDecorPadding.set(i, i2, i3, i4);
        if (androidx.core.view.ViewCompat.isLaidOut(this)) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        float fraction;
        int i4;
        float fraction2;
        int i5;
        float fraction3;
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            android.util.TypedValue typedValue = z3 ? this.mFixedWidthMinor : this.mFixedWidthMajor;
            if (typedValue == null || typedValue.type == 0) {
                z = false;
            } else {
                if (typedValue.type == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (typedValue.type == 6) {
                        fraction3 = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                    } else {
                        i5 = 0;
                    }
                    if (i5 > 0) {
                        i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i5 - (this.mDecorPadding.left + this.mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i5 = (int) fraction3;
                if (i5 > 0) {
                    i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i5 - (this.mDecorPadding.left + this.mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            android.util.TypedValue typedValue2 = z3 ? this.mFixedHeightMajor : this.mFixedHeightMinor;
            if (typedValue2 != null && typedValue2.type != 0) {
                if (typedValue2.type == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (typedValue2.type == 6) {
                        fraction2 = typedValue2.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i4 - (this.mDecorPadding.top + this.mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i4 = (int) fraction2;
                if (i4 > 0) {
                    i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i4 - (this.mDecorPadding.top + this.mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            android.util.TypedValue typedValue3 = z3 ? this.mMinWidthMinor : this.mMinWidthMajor;
            if (typedValue3 == null || typedValue3.type == 0) {
                z2 = false;
            } else {
                if (typedValue3.type == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (typedValue3.type == 6) {
                        fraction = typedValue3.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                    } else {
                        i3 = 0;
                    }
                    if (i3 > 0) {
                        i3 -= this.mDecorPadding.left + this.mDecorPadding.right;
                    }
                    if (measuredWidth < i3) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i3 = (int) fraction;
                if (i3 > 0) {
                    i3 -= this.mDecorPadding.left + this.mDecorPadding.right;
                }
                if (measuredWidth < i3) {
                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public android.util.TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new android.util.TypedValue();
        }
        return this.mMinWidthMajor;
    }

    public android.util.TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new android.util.TypedValue();
        }
        return this.mMinWidthMinor;
    }

    public android.util.TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new android.util.TypedValue();
        }
        return this.mFixedWidthMajor;
    }

    public android.util.TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new android.util.TypedValue();
        }
        return this.mFixedWidthMinor;
    }

    public android.util.TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new android.util.TypedValue();
        }
        return this.mFixedHeightMajor;
    }

    public android.util.TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new android.util.TypedValue();
        }
        return this.mFixedHeightMinor;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.ContentFrameLayout.OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onAttachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.ContentFrameLayout.OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }
}

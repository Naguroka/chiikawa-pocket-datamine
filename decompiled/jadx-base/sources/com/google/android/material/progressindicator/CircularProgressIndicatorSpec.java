package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public final class CircularProgressIndicatorSpec extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec {
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    void validateSpec() {
    }

    public CircularProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_progress_circular_inset_medium);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.CircularProgressIndicator, i, i2, new int[0]);
        this.indicatorSize = java.lang.Math.max(com.google.android.material.resources.MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.trackThickness * 2);
        this.indicatorInset = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
    }
}

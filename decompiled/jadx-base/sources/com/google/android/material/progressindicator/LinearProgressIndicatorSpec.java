package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public final class LinearProgressIndicatorSpec extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec {
    boolean drawHorizontallyInverse;
    public int indeterminateAnimationType;
    public int indicatorDirection;

    public LinearProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.LinearProgressIndicator, com.google.android.material.R.attr.linearProgressIndicatorStyle, com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    void validateSpec() {
        if (this.indeterminateAnimationType == 0) {
            if (this.trackCornerRadius > 0) {
                throw new java.lang.IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.indicatorColors.length < 3) {
                throw new java.lang.IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}

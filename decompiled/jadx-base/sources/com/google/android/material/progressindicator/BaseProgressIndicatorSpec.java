package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors = new int[0];
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    abstract void validateSpec();

    protected BaseProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_progress_track_thickness);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.trackThickness = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.trackCornerRadius = java.lang.Math.min(com.google.android.material.resources.MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.trackThickness / 2);
        this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        loadTrackColor(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void loadIndicatorColors(android.content.Context context, android.content.res.TypedArray typedArray) {
        if (!typedArray.hasValue(com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor)) {
            this.indicatorColors = new int[]{com.google.android.material.color.MaterialColors.getColor(context, com.google.android.material.R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(com.google.android.material.R.styleable.BaseProgressIndicator_indicatorColor, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new java.lang.IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void loadTrackColor(android.content.Context context, android.content.res.TypedArray typedArray) {
        if (typedArray.hasValue(com.google.android.material.R.styleable.BaseProgressIndicator_trackColor)) {
            this.trackColor = typedArray.getColor(com.google.android.material.R.styleable.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.trackColor = this.indicatorColors[0];
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.trackColor = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }
}

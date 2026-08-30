package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public final class LinearProgressIndicator extends com.google.android.material.progressindicator.BaseProgressIndicator<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(android.content.Context context) {
        this(context, null);
    }

    public LinearProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public com.google.android.material.progressindicator.LinearProgressIndicatorSpec createSpec(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.progressindicator.LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec;
        boolean z2 = true;
        if (((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indicatorDirection != 1 && ((androidx.core.view.ViewCompat.getLayoutDirection(this) != 1 || ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (androidx.core.view.ViewCompat.getLayoutDirection(this) != 0 || ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indicatorDirection != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        com.google.android.material.progressindicator.IndeterminateDrawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        com.google.android.material.progressindicator.DeterminateDrawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    private void initializeDrawables() {
        setIndeterminateDrawable(com.google.android.material.progressindicator.IndeterminateDrawable.createLinearDrawable(getContext(), (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec));
        setProgressDrawable(com.google.android.material.progressindicator.DeterminateDrawable.createLinearDrawable(getContext(), (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).validateSpec();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).validateSpec();
        invalidate();
    }

    public int getIndeterminateAnimationType() {
        return ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType;
    }

    public void setIndeterminateAnimationType(int i) {
        if (((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType == i) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            throw new java.lang.IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType = i;
        ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).validateSpec();
        if (i == 0) {
            getIndeterminateDrawable().setAnimatorDelegate(new com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec));
        } else {
            getIndeterminateDrawable().setAnimatorDelegate(new com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate(getContext(), (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec));
        }
        invalidate();
    }

    public int getIndicatorDirection() {
        return ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    public void setIndicatorDirection(int i) {
        ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indicatorDirection = i;
        com.google.android.material.progressindicator.LinearProgressIndicatorSpec linearProgressIndicatorSpec = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec;
        boolean z = true;
        if (i != 1 && ((androidx.core.view.ViewCompat.getLayoutDirection(this) != 1 || ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (androidx.core.view.ViewCompat.getLayoutDirection(this) != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        if (this.spec != 0 && ((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }
}

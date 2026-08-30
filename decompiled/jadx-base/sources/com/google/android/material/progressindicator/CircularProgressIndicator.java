package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes5.dex */
public final class CircularProgressIndicator extends com.google.android.material.progressindicator.BaseProgressIndicator<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(android.content.Context context) {
        this(context, null);
    }

    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        initializeDrawables();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public com.google.android.material.progressindicator.CircularProgressIndicatorSpec createSpec(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.material.progressindicator.CircularProgressIndicatorSpec(context, attributeSet);
    }

    private void initializeDrawables() {
        setIndeterminateDrawable(com.google.android.material.progressindicator.IndeterminateDrawable.createCircularDrawable(getContext(), (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec));
        setProgressDrawable(com.google.android.material.progressindicator.DeterminateDrawable.createCircularDrawable(getContext(), (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec));
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).validateSpec();
    }

    public int getIndicatorInset() {
        return ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorInset;
    }

    public void setIndicatorInset(int i) {
        if (((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorInset != i) {
            ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorInset = i;
            invalidate();
        }
    }

    public int getIndicatorSize() {
        return ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorSize;
    }

    public void setIndicatorSize(int i) {
        int iMax = java.lang.Math.max(i, getTrackThickness() * 2);
        if (((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorSize != iMax) {
            ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorSize = iMax;
            ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).validateSpec();
            invalidate();
        }
    }

    public int getIndicatorDirection() {
        return ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    public void setIndicatorDirection(int i) {
        ((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) this.spec).indicatorDirection = i;
        invalidate();
    }
}

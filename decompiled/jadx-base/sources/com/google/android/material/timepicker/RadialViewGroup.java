package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes5.dex */
class RadialViewGroup extends androidx.constraintlayout.widget.ConstraintLayout {
    private static final java.lang.String SKIP_TAG = "skip";
    private com.google.android.material.shape.MaterialShapeDrawable background;
    private int radius;
    private final java.lang.Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(android.content.Context context) {
        this(context, null);
    }

    public RadialViewGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.view.LayoutInflater.from(context).inflate(com.google.android.material.R.layout.material_radial_view_group, this);
        androidx.core.view.ViewCompat.setBackground(this, createBackground());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.RadialViewGroup, i, 0);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new java.lang.Runnable() { // from class: com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.updateLayoutParams();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private android.graphics.drawable.Drawable createBackground() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new com.google.android.material.shape.RelativeCornerSize(0.5f));
        this.background.setFillColor(android.content.res.ColorStateList.valueOf(-1));
        return this.background;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.background.setFillColor(android.content.res.ColorStateList.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(androidx.core.view.ViewCompat.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    private void updateLayoutParamsAsync() {
        android.os.Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    protected void updateLayoutParams() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (shouldSkipView(getChildAt(i2))) {
                i++;
            }
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.clone(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getId() != com.google.android.material.R.id.circle_center && !shouldSkipView(childAt)) {
                constraintSet.constrainCircle(childAt.getId(), com.google.android.material.R.id.circle_center, this.radius, f);
                f += 360.0f / (childCount - i);
            }
        }
        constraintSet.applyTo(this);
    }

    public void setRadius(int i) {
        this.radius = i;
        updateLayoutParams();
    }

    public int getRadius() {
        return this.radius;
    }

    private static boolean shouldSkipView(android.view.View view) {
        return SKIP_TAG.equals(view.getTag());
    }
}

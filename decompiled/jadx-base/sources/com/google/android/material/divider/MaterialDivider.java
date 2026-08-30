package com.google.android.material.divider;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDivider extends android.view.View {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_MaterialDivider;
    private int color;
    private final com.google.android.material.shape.MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(android.content.Context context) {
        this(context, null);
    }

    public MaterialDivider(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        android.content.Context context2 = getContext();
        this.dividerDrawable = new com.google.android.material.shape.MaterialShapeDrawable();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialDivider, i, i2, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(com.google.android.material.resources.MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.thickness;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
        int i2 = z ? this.insetEnd : this.insetStart;
        if (z) {
            width = getWidth();
            i = this.insetStart;
        } else {
            width = getWidth();
            i = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    public void setDividerThickness(int i) {
        if (this.thickness != i) {
            this.thickness = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public void setDividerColor(int i) {
        if (this.color != i) {
            this.color = i;
            this.dividerDrawable.setFillColor(android.content.res.ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(androidx.core.content.ContextCompat.getColor(getContext(), i));
    }

    public int getDividerColor() {
        return this.color;
    }
}

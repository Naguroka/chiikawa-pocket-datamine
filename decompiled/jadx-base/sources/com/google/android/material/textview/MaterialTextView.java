package com.google.android.material.textview;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialTextView extends androidx.appcompat.widget.AppCompatTextView {
    public MaterialTextView(android.content.Context context) {
        this(context, null);
    }

    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        initialize(attributeSet, i, 0);
    }

    @java.lang.Deprecated
    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        initialize(attributeSet, i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i);
        }
    }

    private void initialize(android.util.AttributeSet attributeSet, int i, int i2) {
        int iFindViewAppearanceResourceId;
        android.content.Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            android.content.res.Resources.Theme theme = context.getTheme();
            if (viewAttrsHasLineHeight(context, theme, attributeSet, i, i2) || (iFindViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, iFindViewAppearanceResourceId);
        }
    }

    private void applyLineHeightFromViewAppearance(android.content.res.Resources.Theme theme, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, com.google.android.material.R.styleable.MaterialTextAppearance);
        int firstAvailableDimension = readFirstAvailableDimension(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight, com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (firstAvailableDimension >= 0) {
            setLineHeight(firstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(android.content.Context context) {
        return com.google.android.material.resources.MaterialAttributes.resolveBoolean(context, com.google.android.material.R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int readFirstAvailableDimension(android.content.Context context, android.content.res.TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            dimensionPixelSize = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i], -1);
        }
        return dimensionPixelSize;
    }

    private static boolean viewAttrsHasLineHeight(android.content.Context context, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.MaterialTextView, i, i2);
        int firstAvailableDimension = readFirstAvailableDimension(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextView_android_lineHeight, com.google.android.material.R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return firstAvailableDimension != -1;
    }

    private static int findViewAppearanceResourceId(android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.MaterialTextView, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}

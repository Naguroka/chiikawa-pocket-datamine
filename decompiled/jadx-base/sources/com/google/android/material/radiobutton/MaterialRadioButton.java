package com.google.android.material.radiobutton;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialRadioButton extends androidx.appcompat.widget.AppCompatRadioButton {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private android.content.res.ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    public MaterialRadioButton(android.content.Context context) {
        this(context, null);
    }

    public MaterialRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialRadioButton_buttonTint)) {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, com.google.android.material.resources.MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialRadioButton_buttonTint));
        }
        this.useMaterialThemeColors = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && androidx.core.widget.CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int color = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorControlActivated);
            int color2 = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorOnSurface);
            int color3 = com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorSurface);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = com.google.android.material.color.MaterialColors.layer(color3, color, 1.0f);
            iArr2[1] = com.google.android.material.color.MaterialColors.layer(color3, color2, 0.54f);
            iArr2[2] = com.google.android.material.color.MaterialColors.layer(color3, color2, 0.38f);
            iArr2[3] = com.google.android.material.color.MaterialColors.layer(color3, color2, 0.38f);
            this.materialThemeColorsTintList = new android.content.res.ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }
}

package com.google.android.material.materialswitch;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialSwitch extends androidx.appcompat.widget.SwitchCompat {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] STATE_SET_WITH_ICON = {com.google.android.material.R.attr.state_with_icon};
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;
    private android.graphics.drawable.Drawable thumbDrawable;
    private android.graphics.drawable.Drawable thumbIconDrawable;
    private android.content.res.ColorStateList thumbIconTintList;
    private android.graphics.PorterDuff.Mode thumbIconTintMode;
    private android.content.res.ColorStateList thumbTintList;
    private android.graphics.drawable.Drawable trackDecorationDrawable;
    private android.content.res.ColorStateList trackDecorationTintList;
    private android.graphics.PorterDuff.Mode trackDecorationTintMode;
    private android.graphics.drawable.Drawable trackDrawable;
    private android.content.res.ColorStateList trackTintList;

    public MaterialSwitch(android.content.Context context) {
        this(context, null);
    }

    public MaterialSwitch(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        android.content.Context context2 = getContext();
        this.thumbDrawable = super.getThumbDrawable();
        this.thumbTintList = super.getThumbTintList();
        super.setThumbTintList(null);
        this.trackDrawable = super.getTrackDrawable();
        this.trackTintList = super.getTrackTintList();
        super.setTrackTintList(null);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialSwitch, i, i2, new int[0]);
        this.thumbIconDrawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.MaterialSwitch_thumbIcon);
        this.thumbIconTintList = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.MaterialSwitch_thumbIconTint);
        this.thumbIconTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialSwitch_thumbIconTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.trackDecorationDrawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.MaterialSwitch_trackDecoration);
        this.trackDecorationTintList = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTint);
        this.trackDecorationTintMode = com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTintMode, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        setEnforceSwitchWidth(false);
        refreshThumbDrawable();
        refreshTrackDrawable();
    }

    @Override // android.view.View
    public void invalidate() {
        updateDrawableTints();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.thumbIconDrawable != null) {
            mergeDrawableStates(iArrOnCreateDrawableState, STATE_SET_WITH_ICON);
        }
        this.currentStateUnchecked = com.google.android.material.drawable.DrawableUtils.getUncheckedState(iArrOnCreateDrawableState);
        this.currentStateChecked = com.google.android.material.drawable.DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(android.graphics.drawable.Drawable drawable) {
        this.thumbDrawable = drawable;
        refreshThumbDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public android.graphics.drawable.Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(android.content.res.ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        refreshThumbDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public android.content.res.ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(android.graphics.PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        refreshThumbDrawable();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setThumbIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.thumbIconDrawable = drawable;
        refreshThumbDrawable();
    }

    public android.graphics.drawable.Drawable getThumbIconDrawable() {
        return this.thumbIconDrawable;
    }

    public void setThumbIconTintList(android.content.res.ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        refreshThumbDrawable();
    }

    public android.content.res.ColorStateList getThumbIconTintList() {
        return this.thumbIconTintList;
    }

    public void setThumbIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        refreshThumbDrawable();
    }

    public android.graphics.PorterDuff.Mode getThumbIconTintMode() {
        return this.thumbIconTintMode;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(android.graphics.drawable.Drawable drawable) {
        this.trackDrawable = drawable;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public android.graphics.drawable.Drawable getTrackDrawable() {
        return this.trackDrawable;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(android.content.res.ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public android.content.res.ColorStateList getTrackTintList() {
        return this.trackTintList;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(android.graphics.PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        refreshTrackDrawable();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setTrackDecorationDrawable(android.graphics.drawable.Drawable drawable) {
        this.trackDecorationDrawable = drawable;
        refreshTrackDrawable();
    }

    public android.graphics.drawable.Drawable getTrackDecorationDrawable() {
        return this.trackDecorationDrawable;
    }

    public void setTrackDecorationTintList(android.content.res.ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        refreshTrackDrawable();
    }

    public android.content.res.ColorStateList getTrackDecorationTintList() {
        return this.trackDecorationTintList;
    }

    public void setTrackDecorationTintMode(android.graphics.PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        refreshTrackDrawable();
    }

    public android.graphics.PorterDuff.Mode getTrackDecorationTintMode() {
        return this.trackDecorationTintMode;
    }

    private void refreshThumbDrawable() {
        this.thumbDrawable = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(this.thumbDrawable, this.thumbTintList, getThumbTintMode());
        this.thumbIconDrawable = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(this.thumbIconDrawable, this.thumbIconTintList, this.thumbIconTintMode);
        updateDrawableTints();
        super.setThumbDrawable(com.google.android.material.drawable.DrawableUtils.compositeTwoLayeredDrawable(this.thumbDrawable, this.thumbIconDrawable));
        refreshDrawableState();
    }

    private void refreshTrackDrawable() {
        this.trackDrawable = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(this.trackDrawable, this.trackTintList, getTrackTintMode());
        this.trackDecorationDrawable = com.google.android.material.drawable.DrawableUtils.createTintableDrawableIfNeeded(this.trackDecorationDrawable, this.trackDecorationTintList, this.trackDecorationTintMode);
        updateDrawableTints();
        android.graphics.drawable.Drawable layerDrawable = this.trackDrawable;
        if (layerDrawable != null && this.trackDecorationDrawable != null) {
            layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{this.trackDrawable, this.trackDecorationDrawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.trackDecorationDrawable;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private void updateDrawableTints() {
        if (this.thumbTintList == null && this.thumbIconTintList == null && this.trackTintList == null && this.trackDecorationTintList == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        android.content.res.ColorStateList colorStateList = this.thumbTintList;
        if (colorStateList != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbDrawable, colorStateList, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        android.content.res.ColorStateList colorStateList2 = this.thumbIconTintList;
        if (colorStateList2 != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbIconDrawable, colorStateList2, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        android.content.res.ColorStateList colorStateList3 = this.trackTintList;
        if (colorStateList3 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDrawable, colorStateList3, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        android.content.res.ColorStateList colorStateList4 = this.trackDecorationTintList;
        if (colorStateList4 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDecorationDrawable, colorStateList4, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
    }

    private static void setInterpolatedDrawableTintIfPossible(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        androidx.core.graphics.drawable.DrawableCompat.setTint(drawable, androidx.core.graphics.ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }
}

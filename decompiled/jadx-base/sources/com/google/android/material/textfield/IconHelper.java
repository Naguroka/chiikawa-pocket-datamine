package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class IconHelper {
    static void setCompatRippleBackgroundIfNeeded(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
    }

    private IconHelper() {
    }

    static void setIconOnClickListener(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    static void setIconOnLongClickListener(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconClickable(com.google.android.material.internal.CheckableImageButton checkableImageButton, android.view.View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = androidx.core.view.ViewCompat.hasOnClickListeners(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        androidx.core.view.ViewCompat.setImportantForAccessibility(checkableImageButton, z2 ? 1 : 2);
    }

    static void applyIconTint(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, android.content.res.ColorStateList.valueOf(colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList);
            }
            if (mode != null) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static void refreshIconDrawableState(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
        androidx.core.graphics.drawable.DrawableCompat.setTintList(drawableMutate, android.content.res.ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private static int[] mergeIconState(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        java.lang.System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }
}

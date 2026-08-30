package com.google.android.material.dialog;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDialogs {
    private MaterialDialogs() {
    }

    public static android.graphics.drawable.InsetDrawable insetDrawable(android.graphics.drawable.Drawable drawable, android.graphics.Rect rect) {
        return new android.graphics.drawable.InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static android.graphics.Rect getDialogBackgroundInsets(android.content.Context context, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, null, com.google.android.material.R.styleable.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new android.graphics.Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}

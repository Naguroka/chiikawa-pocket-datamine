package com.google.android.material.ripple;

/* JADX INFO: loaded from: classes5.dex */
public class RippleUtils {
    static final java.lang.String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
    public static final boolean USE_FRAMEWORK_RIPPLE = true;
    private static final int[] PRESSED_STATE_SET = {android.R.attr.state_pressed};
    private static final int[] HOVERED_FOCUSED_STATE_SET = {android.R.attr.state_hovered, android.R.attr.state_focused};
    private static final int[] FOCUSED_STATE_SET = {android.R.attr.state_focused};
    private static final int[] HOVERED_STATE_SET = {android.R.attr.state_hovered};
    private static final int[] SELECTED_PRESSED_STATE_SET = {android.R.attr.state_selected, android.R.attr.state_pressed};
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET = {android.R.attr.state_selected, android.R.attr.state_hovered, android.R.attr.state_focused};
    private static final int[] SELECTED_FOCUSED_STATE_SET = {android.R.attr.state_selected, android.R.attr.state_focused};
    private static final int[] SELECTED_HOVERED_STATE_SET = {android.R.attr.state_selected, android.R.attr.state_hovered};
    private static final int[] SELECTED_STATE_SET = {android.R.attr.state_selected};
    private static final int[] ENABLED_PRESSED_STATE_SET = {android.R.attr.state_enabled, android.R.attr.state_pressed};
    static final java.lang.String LOG_TAG = "RippleUtils";

    private RippleUtils() {
    }

    public static android.content.res.ColorStateList convertToRippleDrawableColor(android.content.res.ColorStateList colorStateList) {
        if (USE_FRAMEWORK_RIPPLE) {
            int[] iArr = FOCUSED_STATE_SET;
            return new android.content.res.ColorStateList(new int[][]{SELECTED_STATE_SET, iArr, android.util.StateSet.NOTHING}, new int[]{getColorForState(colorStateList, SELECTED_PRESSED_STATE_SET), getColorForState(colorStateList, iArr), getColorForState(colorStateList, PRESSED_STATE_SET)});
        }
        int[] iArr2 = SELECTED_PRESSED_STATE_SET;
        int[] iArr3 = SELECTED_HOVERED_FOCUSED_STATE_SET;
        int[] iArr4 = SELECTED_FOCUSED_STATE_SET;
        int[] iArr5 = SELECTED_HOVERED_STATE_SET;
        int[] iArr6 = PRESSED_STATE_SET;
        int[] iArr7 = HOVERED_FOCUSED_STATE_SET;
        int[] iArr8 = FOCUSED_STATE_SET;
        int[] iArr9 = HOVERED_STATE_SET;
        return new android.content.res.ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, SELECTED_STATE_SET, iArr6, iArr7, iArr8, iArr9, android.util.StateSet.NOTHING}, new int[]{getColorForState(colorStateList, iArr2), getColorForState(colorStateList, iArr3), getColorForState(colorStateList, iArr4), getColorForState(colorStateList, iArr5), 0, getColorForState(colorStateList, iArr6), getColorForState(colorStateList, iArr7), getColorForState(colorStateList, iArr8), getColorForState(colorStateList, iArr9), 0});
    }

    public static android.content.res.ColorStateList sanitizeRippleDrawableColor(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (android.os.Build.VERSION.SDK_INT <= 27 && android.graphics.Color.alpha(colorStateList.getDefaultColor()) == 0 && android.graphics.Color.alpha(colorStateList.getColorForState(ENABLED_PRESSED_STATE_SET, 0)) != 0) {
                android.util.Log.w(LOG_TAG, TRANSPARENT_DEFAULT_COLOR_WARNING);
            }
            return colorStateList;
        }
        return android.content.res.ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static android.graphics.drawable.Drawable createOvalRippleLollipop(android.content.Context context, int i) {
        return com.google.android.material.ripple.RippleUtils.RippleUtilsLollipop.createOvalRipple(context, i);
    }

    private static int getColorForState(android.content.res.ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return USE_FRAMEWORK_RIPPLE ? doubleAlpha(colorForState) : colorForState;
    }

    private static int doubleAlpha(int i) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, java.lang.Math.min(android.graphics.Color.alpha(i) * 2, 255));
    }

    private static class RippleUtilsLollipop {
        private RippleUtilsLollipop() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static android.graphics.drawable.Drawable createOvalRipple(android.content.Context context, int i) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new android.graphics.drawable.RippleDrawable(com.google.android.material.color.MaterialColors.getColorStateList(context, com.google.android.material.R.attr.colorControlHighlight, android.content.res.ColorStateList.valueOf(0)), null, new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) gradientDrawable, i, i, i, i));
        }
    }
}

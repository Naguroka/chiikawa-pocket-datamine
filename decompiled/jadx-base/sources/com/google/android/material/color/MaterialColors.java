package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;

    private MaterialColors() {
    }

    public static int getColor(android.view.View view, int i) {
        return resolveColor(view.getContext(), com.google.android.material.resources.MaterialAttributes.resolveTypedValueOrThrow(view, i));
    }

    public static int getColor(android.content.Context context, int i, java.lang.String str) {
        return resolveColor(context, com.google.android.material.resources.MaterialAttributes.resolveTypedValueOrThrow(context, i, str));
    }

    public static int getColor(android.view.View view, int i, int i2) {
        return getColor(view.getContext(), i, i2);
    }

    public static int getColor(android.content.Context context, int i, int i2) {
        android.util.TypedValue typedValueResolve = com.google.android.material.resources.MaterialAttributes.resolve(context, i);
        return typedValueResolve != null ? resolveColor(context, typedValueResolve) : i2;
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i, android.content.res.ColorStateList colorStateList) {
        android.util.TypedValue typedValueResolve = com.google.android.material.resources.MaterialAttributes.resolve(context, i);
        android.content.res.ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    private static int resolveColor(android.content.Context context, android.util.TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return androidx.core.content.ContextCompat.getColor(context, typedValue.resourceId);
        }
        return typedValue.data;
    }

    private static android.content.res.ColorStateList resolveColorStateList(android.content.Context context, android.util.TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return androidx.core.content.ContextCompat.getColorStateList(context, typedValue.resourceId);
        }
        return android.content.res.ColorStateList.valueOf(typedValue.data);
    }

    public static int layer(android.view.View view, int i, int i2) {
        return layer(view, i, i2, 1.0f);
    }

    public static int layer(android.view.View view, int i, int i2, float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    public static int layer(int i, int i2, float f) {
        return layer(i, androidx.core.graphics.ColorUtils.setAlphaComponent(i2, java.lang.Math.round(android.graphics.Color.alpha(i2) * f)));
    }

    public static int layer(int i, int i2) {
        return androidx.core.graphics.ColorUtils.compositeColors(i2, i);
    }

    public static int compositeARGBWithAlpha(int i, int i2) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, (android.graphics.Color.alpha(i) * i2) / 255);
    }

    public static boolean isColorLight(int i) {
        return i != 0 && androidx.core.graphics.ColorUtils.calculateLuminance(i) > 0.5d;
    }

    public static int harmonizeWithPrimary(android.content.Context context, int i) {
        return harmonize(i, getColor(context, com.google.android.material.R.attr.colorPrimary, com.google.android.material.color.MaterialColors.class.getCanonicalName()));
    }

    public static int harmonize(int i, int i2) {
        return com.google.android.material.color.Blend.harmonize(i, i2);
    }

    public static com.google.android.material.color.ColorRoles getColorRoles(android.content.Context context, int i) {
        return getColorRoles(i, com.google.android.material.resources.MaterialAttributes.resolveBoolean(context, com.google.android.material.R.attr.isLightTheme, true));
    }

    public static com.google.android.material.color.ColorRoles getColorRoles(int i, boolean z) {
        if (z) {
            return new com.google.android.material.color.ColorRoles(getColorRole(i, 40), getColorRole(i, 100), getColorRole(i, 90), getColorRole(i, 10));
        }
        return new com.google.android.material.color.ColorRoles(getColorRole(i, 80), getColorRole(i, 20), getColorRole(i, 30), getColorRole(i, 90));
    }

    private static int getColorRole(int i, int i2) {
        com.google.android.material.color.Hct hctFromInt = com.google.android.material.color.Hct.fromInt(i);
        hctFromInt.setTone(i2);
        return hctFromInt.toInt();
    }
}

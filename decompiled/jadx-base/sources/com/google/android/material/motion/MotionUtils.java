package com.google.android.material.motion;

/* JADX INFO: loaded from: classes5.dex */
public class MotionUtils {
    private static final java.lang.String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final java.lang.String EASING_TYPE_FORMAT_END = ")";
    private static final java.lang.String EASING_TYPE_FORMAT_START = "(";
    private static final java.lang.String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    public static int resolveThemeDuration(android.content.Context context, int i, int i2) {
        return com.google.android.material.resources.MaterialAttributes.resolveInteger(context, i, i2);
    }

    public static android.animation.TimeInterpolator resolveThemeInterpolator(android.content.Context context, int i, android.animation.TimeInterpolator timeInterpolator) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new java.lang.IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        java.lang.String strValueOf = java.lang.String.valueOf(typedValue.string);
        if (isLegacyEasingAttribute(strValueOf)) {
            return getLegacyThemeInterpolator(strValueOf);
        }
        return android.view.animation.AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    private static android.animation.TimeInterpolator getLegacyThemeInterpolator(java.lang.String str) {
        if (isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            java.lang.String[] strArrSplit = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
            if (strArrSplit.length != 4) {
                throw new java.lang.IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
            }
            return androidx.core.view.animation.PathInterpolatorCompat.create(getLegacyControlPoint(strArrSplit, 0), getLegacyControlPoint(strArrSplit, 1), getLegacyControlPoint(strArrSplit, 2), getLegacyControlPoint(strArrSplit, 3));
        }
        if (isLegacyEasingType(str, "path")) {
            return androidx.core.view.animation.PathInterpolatorCompat.create(androidx.core.graphics.PathParser.createPathFromPathData(getLegacyEasingContent(str, "path")));
        }
        throw new java.lang.IllegalArgumentException("Invalid motion easing type: " + str);
    }

    private static boolean isLegacyEasingAttribute(java.lang.String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, "path");
    }

    private static boolean isLegacyEasingType(java.lang.String str, java.lang.String str2) {
        return str.startsWith(new java.lang.StringBuilder().append(str2).append(EASING_TYPE_FORMAT_START).toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    private static java.lang.String getLegacyEasingContent(java.lang.String str, java.lang.String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static float getLegacyControlPoint(java.lang.String[] strArr, int i) {
        float f = java.lang.Float.parseFloat(strArr[i]);
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
        }
        return f;
    }
}

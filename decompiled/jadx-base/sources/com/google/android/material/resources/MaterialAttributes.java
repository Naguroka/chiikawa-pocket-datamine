package com.google.android.material.resources;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialAttributes {
    public static android.util.TypedValue resolve(android.content.Context context, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static android.util.TypedValue resolveTypedValueOrThrow(android.view.View view, int i) {
        return resolveTypedValueOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static android.util.TypedValue resolveTypedValueOrThrow(android.content.Context context, int i, java.lang.String str) {
        android.util.TypedValue typedValueResolve = resolve(context, i);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int resolveOrThrow(android.content.Context context, int i, java.lang.String str) {
        return resolveTypedValueOrThrow(context, i, str).data;
    }

    public static int resolveOrThrow(android.view.View view, int i) {
        return resolveTypedValueOrThrow(view, i).data;
    }

    public static boolean resolveBooleanOrThrow(android.content.Context context, int i, java.lang.String str) {
        return resolveOrThrow(context, i, str) != 0;
    }

    public static boolean resolveBoolean(android.content.Context context, int i, boolean z) {
        android.util.TypedValue typedValueResolve = resolve(context, i);
        if (typedValueResolve == null || typedValueResolve.type != 18) {
            return z;
        }
        return typedValueResolve.data != 0;
    }

    public static int resolveInteger(android.content.Context context, int i, int i2) {
        android.util.TypedValue typedValueResolve = resolve(context, i);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i2 : typedValueResolve.data;
    }

    public static int resolveMinimumAccessibleTouchTarget(android.content.Context context) {
        return resolveDimension(context, com.google.android.material.R.attr.minTouchTargetSize, com.google.android.material.R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveDimension(android.content.Context context, int i, int i2) {
        float dimension;
        android.util.TypedValue typedValueResolve = resolve(context, i);
        if (typedValueResolve == null || typedValueResolve.type != 5) {
            dimension = context.getResources().getDimension(i2);
        } else {
            dimension = typedValueResolve.getDimension(context.getResources().getDisplayMetrics());
        }
        return (int) dimension;
    }
}

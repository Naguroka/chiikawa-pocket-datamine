package com.google.android.material.resources;

/* JADX INFO: loaded from: classes5.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(android.content.Context context, android.graphics.Typeface typeface) {
        return maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(android.content.res.Configuration configuration, android.graphics.Typeface typeface) {
        if (android.os.Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return android.graphics.Typeface.create(typeface, androidx.core.math.MathUtils.clamp(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}

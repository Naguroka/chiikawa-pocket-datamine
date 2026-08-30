package com.google.android.material.resources;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        android.content.res.ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, androidx.appcompat.widget.TintTypedArray tintTypedArray, int i) {
        int resourceId;
        android.content.res.ColorStateList colorStateList;
        return (!tintTypedArray.hasValue(i) || (resourceId = tintTypedArray.getResourceId(i, 0)) == 0 || (colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i) : colorStateList;
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        android.graphics.drawable.Drawable drawable;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawable;
    }

    public static com.google.android.material.resources.TextAppearance getTextAppearance(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new com.google.android.material.resources.TextAppearance(context, resourceId);
    }

    public static int getDimensionPixelSize(android.content.Context context, android.content.res.TypedArray typedArray, int i, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static boolean isFontScaleAtLeast1_3(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(android.content.Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static int getUnscaledTextSize(android.content.Context context, int i, int i2) {
        if (i == 0) {
            return i2;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, com.google.android.material.R.styleable.TextAppearance);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(com.google.android.material.R.styleable.TextAppearance_android_textSize, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        if (!value) {
            return i2;
        }
        if (getComplexUnit(typedValue) == 2) {
            return java.lang.Math.round(android.util.TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
        }
        return android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    private static int getComplexUnit(android.util.TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    static int getIndexWithValue(android.content.res.TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}

package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
public class HarmonizedColors {
    private static final java.lang.String TAG = "HarmonizedColors";

    private static boolean isColorResource(int i) {
        return 28 <= i && i <= 31;
    }

    private HarmonizedColors() {
    }

    public static void applyToContextIfAvailable(android.content.Context context, com.google.android.material.color.HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            java.util.Map<java.lang.Integer, java.lang.Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            int themeOverlayResourceId = harmonizedColorsOptions.getThemeOverlayResourceId(0);
            if (!addResourcesLoaderToContext(context, mapCreateHarmonizedColorReplacementMap) || themeOverlayResourceId == 0) {
                return;
            }
            com.google.android.material.color.ThemeUtils.applyThemeOverlay(context, themeOverlayResourceId);
        }
    }

    public static android.content.Context wrapContextIfAvailable(android.content.Context context, com.google.android.material.color.HarmonizedColorsOptions harmonizedColorsOptions) {
        if (!isHarmonizedColorAvailable()) {
            return context;
        }
        java.util.Map<java.lang.Integer, java.lang.Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, harmonizedColorsOptions.getThemeOverlayResourceId(com.google.android.material.R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper.applyOverrideConfiguration(new android.content.res.Configuration());
        return addResourcesLoaderToContext(contextThemeWrapper, mapCreateHarmonizedColorReplacementMap) ? contextThemeWrapper : context;
    }

    public static boolean isHarmonizedColorAvailable() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    private static java.util.Map<java.lang.Integer, java.lang.Integer> createHarmonizedColorReplacementMap(android.content.Context context, com.google.android.material.color.HarmonizedColorsOptions harmonizedColorsOptions) {
        java.util.HashMap map = new java.util.HashMap();
        int color = com.google.android.material.color.MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), TAG);
        for (int i : harmonizedColorsOptions.getColorResourceIds()) {
            map.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(com.google.android.material.color.MaterialColors.harmonize(androidx.core.content.ContextCompat.getColor(context, i), color)));
        }
        com.google.android.material.color.HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributes);
                android.content.res.TypedArray typedArrayObtainStyledAttributes2 = themeOverlay != 0 ? new android.view.ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                addHarmonizedColorAttributesToReplacementMap(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, color);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    private static boolean addResourcesLoaderToContext(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map) throws java.lang.Throwable {
        android.content.res.loader.ResourcesLoader resourcesLoaderCreate = com.google.android.material.color.ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderCreate);
        return true;
    }

    private static void addHarmonizedColorAttributesToReplacementMap(java.util.Map<java.lang.Integer, java.lang.Integer> map, android.content.res.TypedArray typedArray, android.content.res.TypedArray typedArray2, int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && isColorResource(typedArray.getType(i2))) {
                map.put(java.lang.Integer.valueOf(resourceId), java.lang.Integer.valueOf(com.google.android.material.color.MaterialColors.harmonize(typedArray.getColor(i2, 0), i)));
            }
        }
    }
}

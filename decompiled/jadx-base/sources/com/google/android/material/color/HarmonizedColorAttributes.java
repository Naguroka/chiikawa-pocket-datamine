package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {com.google.android.material.R.attr.colorError, com.google.android.material.R.attr.colorOnError, com.google.android.material.R.attr.colorErrorContainer, com.google.android.material.R.attr.colorOnErrorContainer};
    private final int[] attributes;
    private final int themeOverlay;

    public static com.google.android.material.color.HarmonizedColorAttributes create(int[] iArr) {
        return new com.google.android.material.color.HarmonizedColorAttributes(iArr, 0);
    }

    public static com.google.android.material.color.HarmonizedColorAttributes create(int[] iArr, int i) {
        return new com.google.android.material.color.HarmonizedColorAttributes(iArr, i);
    }

    public static com.google.android.material.color.HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, com.google.android.material.R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    private HarmonizedColorAttributes(int[] iArr, int i) {
        if (i != 0 && iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i;
    }

    public int[] getAttributes() {
        return this.attributes;
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }
}

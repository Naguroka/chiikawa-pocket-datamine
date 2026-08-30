package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
public class HarmonizedColorsOptions {
    private final int colorAttributeToHarmonizeWith;
    private final com.google.android.material.color.HarmonizedColorAttributes colorAttributes;
    private final int[] colorResourceIds;

    public static com.google.android.material.color.HarmonizedColorsOptions createMaterialDefaults() {
        return new com.google.android.material.color.HarmonizedColorsOptions.Builder().setColorAttributes(com.google.android.material.color.HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    private HarmonizedColorsOptions(com.google.android.material.color.HarmonizedColorsOptions.Builder builder) {
        this.colorResourceIds = builder.colorResourceIds;
        this.colorAttributes = builder.colorAttributes;
        this.colorAttributeToHarmonizeWith = builder.colorAttributeToHarmonizeWith;
    }

    public int[] getColorResourceIds() {
        return this.colorResourceIds;
    }

    public com.google.android.material.color.HarmonizedColorAttributes getColorAttributes() {
        return this.colorAttributes;
    }

    public int getColorAttributeToHarmonizeWith() {
        return this.colorAttributeToHarmonizeWith;
    }

    public static class Builder {
        private com.google.android.material.color.HarmonizedColorAttributes colorAttributes;
        private int[] colorResourceIds = new int[0];
        private int colorAttributeToHarmonizeWith = com.google.android.material.R.attr.colorPrimary;

        public com.google.android.material.color.HarmonizedColorsOptions.Builder setColorResourceIds(int[] iArr) {
            this.colorResourceIds = iArr;
            return this;
        }

        public com.google.android.material.color.HarmonizedColorsOptions.Builder setColorAttributes(com.google.android.material.color.HarmonizedColorAttributes harmonizedColorAttributes) {
            this.colorAttributes = harmonizedColorAttributes;
            return this;
        }

        public com.google.android.material.color.HarmonizedColorsOptions.Builder setColorAttributeToHarmonizeWith(int i) {
            this.colorAttributeToHarmonizeWith = i;
            return this;
        }

        public com.google.android.material.color.HarmonizedColorsOptions build() {
            return new com.google.android.material.color.HarmonizedColorsOptions(this);
        }
    }

    int getThemeOverlayResourceId(int i) {
        com.google.android.material.color.HarmonizedColorAttributes harmonizedColorAttributes = this.colorAttributes;
        return (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? i : this.colorAttributes.getThemeOverlay();
    }
}

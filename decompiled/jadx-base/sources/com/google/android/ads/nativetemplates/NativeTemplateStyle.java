package com.google.android.ads.nativetemplates;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeTemplateStyle {
    private android.graphics.drawable.ColorDrawable callToActionBackgroundColor;
    private float callToActionTextSize;
    private android.graphics.Typeface callToActionTextTypeface;
    private java.lang.Integer callToActionTypefaceColor;
    private android.graphics.drawable.ColorDrawable mainBackgroundColor;
    private android.graphics.drawable.ColorDrawable primaryTextBackgroundColor;
    private float primaryTextSize;
    private android.graphics.Typeface primaryTextTypeface;
    private java.lang.Integer primaryTextTypefaceColor;
    private android.graphics.drawable.ColorDrawable secondaryTextBackgroundColor;
    private float secondaryTextSize;
    private android.graphics.Typeface secondaryTextTypeface;
    private java.lang.Integer secondaryTextTypefaceColor;
    private android.graphics.drawable.ColorDrawable tertiaryTextBackgroundColor;
    private float tertiaryTextSize;
    private android.graphics.Typeface tertiaryTextTypeface;
    private java.lang.Integer tertiaryTextTypefaceColor;

    public android.graphics.Typeface getCallToActionTextTypeface() {
        return this.callToActionTextTypeface;
    }

    public float getCallToActionTextSize() {
        return this.callToActionTextSize;
    }

    public java.lang.Integer getCallToActionTypefaceColor() {
        return this.callToActionTypefaceColor;
    }

    public android.graphics.drawable.ColorDrawable getCallToActionBackgroundColor() {
        return this.callToActionBackgroundColor;
    }

    public android.graphics.Typeface getPrimaryTextTypeface() {
        return this.primaryTextTypeface;
    }

    public float getPrimaryTextSize() {
        return this.primaryTextSize;
    }

    public java.lang.Integer getPrimaryTextTypefaceColor() {
        return this.primaryTextTypefaceColor;
    }

    public android.graphics.drawable.ColorDrawable getPrimaryTextBackgroundColor() {
        return this.primaryTextBackgroundColor;
    }

    public android.graphics.Typeface getSecondaryTextTypeface() {
        return this.secondaryTextTypeface;
    }

    public float getSecondaryTextSize() {
        return this.secondaryTextSize;
    }

    public java.lang.Integer getSecondaryTextTypefaceColor() {
        return this.secondaryTextTypefaceColor;
    }

    public android.graphics.drawable.ColorDrawable getSecondaryTextBackgroundColor() {
        return this.secondaryTextBackgroundColor;
    }

    public android.graphics.Typeface getTertiaryTextTypeface() {
        return this.tertiaryTextTypeface;
    }

    public float getTertiaryTextSize() {
        return this.tertiaryTextSize;
    }

    public java.lang.Integer getTertiaryTextTypefaceColor() {
        return this.tertiaryTextTypefaceColor;
    }

    public android.graphics.drawable.ColorDrawable getTertiaryTextBackgroundColor() {
        return this.tertiaryTextBackgroundColor;
    }

    public android.graphics.drawable.ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public static final class Builder {
        private com.google.android.ads.nativetemplates.NativeTemplateStyle styles = new com.google.android.ads.nativetemplates.NativeTemplateStyle();

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withCallToActionTextTypeface(android.graphics.Typeface callToActionTextTypeface) {
            this.styles.callToActionTextTypeface = callToActionTextTypeface;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withCallToActionTextSize(float callToActionTextSize) {
            this.styles.callToActionTextSize = callToActionTextSize;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withCallToActionTypefaceColor(int callToActionTypefaceColor) {
            this.styles.callToActionTypefaceColor = java.lang.Integer.valueOf(callToActionTypefaceColor);
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withCallToActionBackgroundColor(android.graphics.drawable.ColorDrawable callToActionBackgroundColor) {
            this.styles.callToActionBackgroundColor = callToActionBackgroundColor;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withPrimaryTextTypeface(android.graphics.Typeface primaryTextTypeface) {
            this.styles.primaryTextTypeface = primaryTextTypeface;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withPrimaryTextSize(float primaryTextSize) {
            this.styles.primaryTextSize = primaryTextSize;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withPrimaryTextTypefaceColor(int primaryTextTypefaceColor) {
            this.styles.primaryTextTypefaceColor = java.lang.Integer.valueOf(primaryTextTypefaceColor);
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withPrimaryTextBackgroundColor(android.graphics.drawable.ColorDrawable primaryTextBackgroundColor) {
            this.styles.primaryTextBackgroundColor = primaryTextBackgroundColor;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withSecondaryTextTypeface(android.graphics.Typeface secondaryTextTypeface) {
            this.styles.secondaryTextTypeface = secondaryTextTypeface;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withSecondaryTextSize(float secondaryTextSize) {
            this.styles.secondaryTextSize = secondaryTextSize;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withSecondaryTextTypefaceColor(int secondaryTextTypefaceColor) {
            this.styles.secondaryTextTypefaceColor = java.lang.Integer.valueOf(secondaryTextTypefaceColor);
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withSecondaryTextBackgroundColor(android.graphics.drawable.ColorDrawable secondaryTextBackgroundColor) {
            this.styles.secondaryTextBackgroundColor = secondaryTextBackgroundColor;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withTertiaryTextTypeface(android.graphics.Typeface tertiaryTextTypeface) {
            this.styles.tertiaryTextTypeface = tertiaryTextTypeface;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withTertiaryTextSize(float tertiaryTextSize) {
            this.styles.tertiaryTextSize = tertiaryTextSize;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withTertiaryTextTypefaceColor(int tertiaryTextTypefaceColor) {
            this.styles.tertiaryTextTypefaceColor = java.lang.Integer.valueOf(tertiaryTextTypefaceColor);
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withTertiaryTextBackgroundColor(android.graphics.drawable.ColorDrawable tertiaryTextBackgroundColor) {
            this.styles.tertiaryTextBackgroundColor = tertiaryTextBackgroundColor;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder withMainBackgroundColor(android.graphics.drawable.ColorDrawable mainBackgroundColor) {
            this.styles.mainBackgroundColor = mainBackgroundColor;
            return this;
        }

        public com.google.android.ads.nativetemplates.NativeTemplateStyle build() {
            return this.styles;
        }
    }
}

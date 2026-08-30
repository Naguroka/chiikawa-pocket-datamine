package com.google.unity.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
public final class UnityNativeTemplateStyle {
    final com.google.unity.ads.nativead.UnityNativeTemplateTextStyle callToActionStyle;
    final android.graphics.drawable.ColorDrawable mainBackgroundColor;
    final com.google.unity.ads.nativead.UnityNativeTemplateTextStyle primaryTextStyle;
    final com.google.unity.ads.nativead.UnityNativeTemplateTextStyle secondaryTextStyle;
    final com.google.unity.ads.nativead.UnityNativeTemplateType templateType;
    final com.google.unity.ads.nativead.UnityNativeTemplateTextStyle tertiaryTextStyle;

    public UnityNativeTemplateStyle(com.google.unity.ads.nativead.UnityNativeTemplateType templateType, android.graphics.drawable.ColorDrawable mainBackgroundColor, com.google.unity.ads.nativead.UnityNativeTemplateTextStyle callToActionStyle, com.google.unity.ads.nativead.UnityNativeTemplateTextStyle primaryTextStyle, com.google.unity.ads.nativead.UnityNativeTemplateTextStyle secondaryTextStyle, com.google.unity.ads.nativead.UnityNativeTemplateTextStyle tertiaryTextStyle) {
        this.templateType = templateType;
        this.mainBackgroundColor = mainBackgroundColor;
        this.callToActionStyle = callToActionStyle;
        this.primaryTextStyle = primaryTextStyle;
        this.secondaryTextStyle = secondaryTextStyle;
        this.tertiaryTextStyle = tertiaryTextStyle;
    }

    public com.google.android.ads.nativetemplates.TemplateView asTemplateView(android.content.Context context) {
        com.google.android.ads.nativetemplates.TemplateView templateView = (com.google.android.ads.nativetemplates.TemplateView) ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType.resourceId(), (android.view.ViewGroup) null);
        if (templateView == null) {
            return null;
        }
        templateView.setStyles(asNativeTemplateStyle());
        return templateView;
    }

    public com.google.unity.ads.nativead.UnityNativeTemplateType getTemplateType() {
        return this.templateType;
    }

    public android.graphics.drawable.ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public com.google.unity.ads.nativead.UnityNativeTemplateTextStyle getCallToActionStyle() {
        return this.callToActionStyle;
    }

    public com.google.unity.ads.nativead.UnityNativeTemplateTextStyle getPrimaryTextStyle() {
        return this.primaryTextStyle;
    }

    public com.google.unity.ads.nativead.UnityNativeTemplateTextStyle getSecondaryTextStyle() {
        return this.secondaryTextStyle;
    }

    public com.google.unity.ads.nativead.UnityNativeTemplateTextStyle getTertiaryTextStyle() {
        return this.tertiaryTextStyle;
    }

    public boolean equals(java.lang.Object o) {
        android.graphics.drawable.ColorDrawable colorDrawable;
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof com.google.unity.ads.nativead.UnityNativeTemplateStyle)) {
            return false;
        }
        com.google.unity.ads.nativead.UnityNativeTemplateStyle unityNativeTemplateStyle = (com.google.unity.ads.nativead.UnityNativeTemplateStyle) o;
        return this.templateType == unityNativeTemplateStyle.templateType && (((colorDrawable = this.mainBackgroundColor) == null && unityNativeTemplateStyle.mainBackgroundColor == null) || colorDrawable.getColor() == unityNativeTemplateStyle.mainBackgroundColor.getColor()) && java.util.Objects.equals(this.callToActionStyle, unityNativeTemplateStyle.callToActionStyle) && java.util.Objects.equals(this.primaryTextStyle, unityNativeTemplateStyle.primaryTextStyle) && java.util.Objects.equals(this.secondaryTextStyle, unityNativeTemplateStyle.secondaryTextStyle) && java.util.Objects.equals(this.tertiaryTextStyle, unityNativeTemplateStyle.tertiaryTextStyle);
    }

    public int hashCode() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        android.graphics.drawable.ColorDrawable colorDrawable = this.mainBackgroundColor;
        objArr[0] = colorDrawable == null ? null : java.lang.Integer.valueOf(colorDrawable.getColor());
        objArr[1] = this.callToActionStyle;
        objArr[2] = this.primaryTextStyle;
        objArr[3] = this.secondaryTextStyle;
        objArr[4] = this.tertiaryTextStyle;
        return java.util.Objects.hash(objArr);
    }

    private com.google.android.ads.nativetemplates.NativeTemplateStyle asNativeTemplateStyle() {
        com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder builder = new com.google.android.ads.nativetemplates.NativeTemplateStyle.Builder();
        android.graphics.drawable.ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable != null) {
            builder.withMainBackgroundColor(colorDrawable);
        }
        com.google.unity.ads.nativead.UnityNativeTemplateTextStyle unityNativeTemplateTextStyle = this.callToActionStyle;
        if (unityNativeTemplateTextStyle != null) {
            if (unityNativeTemplateTextStyle.getBackgroundColor() != null) {
                builder.withCallToActionBackgroundColor(this.callToActionStyle.getBackgroundColor());
            }
            if (this.callToActionStyle.getTextColor() != null) {
                builder.withCallToActionTypefaceColor(this.callToActionStyle.getTextColor().getColor());
            }
            if (this.callToActionStyle.getFontStyle() != null) {
                builder.withCallToActionTextTypeface(this.callToActionStyle.getFontStyle().getTypeface());
            }
            if (this.callToActionStyle.getSize() != null) {
                builder.withCallToActionTextSize(this.callToActionStyle.getSize().floatValue());
            }
        }
        com.google.unity.ads.nativead.UnityNativeTemplateTextStyle unityNativeTemplateTextStyle2 = this.primaryTextStyle;
        if (unityNativeTemplateTextStyle2 != null) {
            if (unityNativeTemplateTextStyle2.getBackgroundColor() != null) {
                builder.withPrimaryTextBackgroundColor(this.primaryTextStyle.getBackgroundColor());
            }
            if (this.primaryTextStyle.getTextColor() != null) {
                builder.withPrimaryTextTypefaceColor(this.primaryTextStyle.getTextColor().getColor());
            }
            if (this.primaryTextStyle.getFontStyle() != null) {
                builder.withPrimaryTextTypeface(this.primaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.primaryTextStyle.getSize() != null) {
                builder.withPrimaryTextSize(this.primaryTextStyle.getSize().floatValue());
            }
        }
        com.google.unity.ads.nativead.UnityNativeTemplateTextStyle unityNativeTemplateTextStyle3 = this.secondaryTextStyle;
        if (unityNativeTemplateTextStyle3 != null) {
            if (unityNativeTemplateTextStyle3.getBackgroundColor() != null) {
                builder.withSecondaryTextBackgroundColor(this.secondaryTextStyle.getBackgroundColor());
            }
            if (this.secondaryTextStyle.getTextColor() != null) {
                builder.withSecondaryTextTypefaceColor(this.secondaryTextStyle.getTextColor().getColor());
            }
            if (this.secondaryTextStyle.getFontStyle() != null) {
                builder.withSecondaryTextTypeface(this.secondaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.secondaryTextStyle.getSize() != null) {
                builder.withSecondaryTextSize(this.secondaryTextStyle.getSize().floatValue());
            }
        }
        com.google.unity.ads.nativead.UnityNativeTemplateTextStyle unityNativeTemplateTextStyle4 = this.tertiaryTextStyle;
        if (unityNativeTemplateTextStyle4 != null) {
            if (unityNativeTemplateTextStyle4.getBackgroundColor() != null) {
                builder.withTertiaryTextBackgroundColor(this.tertiaryTextStyle.getBackgroundColor());
            }
            if (this.tertiaryTextStyle.getTextColor() != null) {
                builder.withTertiaryTextTypefaceColor(this.tertiaryTextStyle.getTextColor().getColor());
            }
            if (this.tertiaryTextStyle.getFontStyle() != null) {
                builder.withTertiaryTextTypeface(this.tertiaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.tertiaryTextStyle.getSize() != null) {
                builder.withTertiaryTextSize(this.tertiaryTextStyle.getSize().floatValue());
            }
        }
        return builder.build();
    }
}

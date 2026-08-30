package com.google.unity.ads.nativead;

/* JADX INFO: loaded from: classes5.dex */
public final class UnityNativeTemplateTextStyle {
    private final android.graphics.drawable.ColorDrawable backgroundColor;
    private final com.google.unity.ads.nativead.UnityNativeTemplateFontStyle fontStyle;
    private final java.lang.Double size;
    private final android.graphics.drawable.ColorDrawable textColor;

    public UnityNativeTemplateTextStyle(android.graphics.drawable.ColorDrawable textColor, android.graphics.drawable.ColorDrawable backgroundColor, com.google.unity.ads.nativead.UnityNativeTemplateFontStyle fontStyle, java.lang.Double size) {
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.fontStyle = fontStyle;
        this.size = size;
    }

    public android.graphics.drawable.ColorDrawable getTextColor() {
        return this.textColor;
    }

    public android.graphics.drawable.ColorDrawable getBackgroundColor() {
        return this.backgroundColor;
    }

    public com.google.unity.ads.nativead.UnityNativeTemplateFontStyle getFontStyle() {
        return this.fontStyle;
    }

    public java.lang.Float getSize() {
        java.lang.Double d = this.size;
        if (d == null) {
            return null;
        }
        return java.lang.Float.valueOf(d.floatValue());
    }

    public boolean equals(java.lang.Object o) {
        android.graphics.drawable.ColorDrawable colorDrawable;
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof com.google.unity.ads.nativead.UnityNativeTemplateTextStyle)) {
            return false;
        }
        com.google.unity.ads.nativead.UnityNativeTemplateTextStyle unityNativeTemplateTextStyle = (com.google.unity.ads.nativead.UnityNativeTemplateTextStyle) o;
        android.graphics.drawable.ColorDrawable colorDrawable2 = this.textColor;
        return ((colorDrawable2 == null && unityNativeTemplateTextStyle.textColor == null) || colorDrawable2.getColor() == unityNativeTemplateTextStyle.textColor.getColor()) && (((colorDrawable = this.backgroundColor) == null && unityNativeTemplateTextStyle.backgroundColor == null) || colorDrawable.getColor() == unityNativeTemplateTextStyle.backgroundColor.getColor()) && java.util.Objects.equals(this.size, unityNativeTemplateTextStyle.size) && java.util.Objects.equals(this.fontStyle, unityNativeTemplateTextStyle.fontStyle);
    }

    public int hashCode() {
        android.graphics.drawable.ColorDrawable colorDrawable = this.textColor;
        java.lang.Integer numValueOf = colorDrawable == null ? null : java.lang.Integer.valueOf(colorDrawable.getColor());
        android.graphics.drawable.ColorDrawable colorDrawable2 = this.backgroundColor;
        return java.util.Objects.hash(numValueOf, colorDrawable2 != null ? java.lang.Integer.valueOf(colorDrawable2.getColor()) : null, this.size, this.fontStyle);
    }
}

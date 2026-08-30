package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int RUBY_TYPE_BASE = 2;
    public static final int RUBY_TYPE_CONTAINER = 1;
    public static final int RUBY_TYPE_DELIMITER = 4;
    public static final int RUBY_TYPE_TEXT = 3;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public static final float UNSPECIFIED_SHEAR = Float.MAX_VALUE;
    private int backgroundColor;
    private int fontColor;
    private java.lang.String fontFamily;
    private float fontSize;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;
    private java.lang.String id;
    private android.text.Layout.Alignment multiRowAlign;
    private android.text.Layout.Alignment textAlign;
    private androidx.media3.extractor.text.ttml.TextEmphasis textEmphasis;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;
    private int rubyType = -1;
    private int rubyPosition = -1;
    private int textCombine = -1;
    private float shearPercentage = Float.MAX_VALUE;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public int getStyle() {
        int i = this.bold;
        if (i == -1 && this.italic == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.italic == 1 ? 2 : 0);
    }

    public boolean isLinethrough() {
        return this.linethrough == 1;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setLinethrough(boolean z) {
        this.linethrough = z ? 1 : 0;
        return this;
    }

    public boolean isUnderline() {
        return this.underline == 1;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setUnderline(boolean z) {
        this.underline = z ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setBold(boolean z) {
        this.bold = z ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setItalic(boolean z) {
        this.italic = z ? 1 : 0;
        return this;
    }

    public java.lang.String getFontFamily() {
        return this.fontFamily;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setFontFamily(java.lang.String str) {
        this.fontFamily = str;
        return this;
    }

    public int getFontColor() {
        if (!this.hasFontColor) {
            throw new java.lang.IllegalStateException("Font color has not been defined.");
        }
        return this.fontColor;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setFontColor(int i) {
        this.fontColor = i;
        this.hasFontColor = true;
        return this;
    }

    public boolean hasFontColor() {
        return this.hasFontColor;
    }

    public int getBackgroundColor() {
        if (!this.hasBackgroundColor) {
            throw new java.lang.IllegalStateException("Background color has not been defined.");
        }
        return this.backgroundColor;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setBackgroundColor(int i) {
        this.backgroundColor = i;
        this.hasBackgroundColor = true;
        return this;
    }

    public boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setShearPercentage(float f) {
        this.shearPercentage = f;
        return this;
    }

    public float getShearPercentage() {
        return this.shearPercentage;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle chain(androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, true);
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle inherit(androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle) {
        return inherit(ttmlStyle, false);
    }

    private androidx.media3.extractor.text.ttml.TtmlStyle inherit(androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle, boolean z) {
        int i;
        android.text.Layout.Alignment alignment;
        android.text.Layout.Alignment alignment2;
        java.lang.String str;
        if (ttmlStyle != null) {
            if (!this.hasFontColor && ttmlStyle.hasFontColor) {
                setFontColor(ttmlStyle.fontColor);
            }
            if (this.bold == -1) {
                this.bold = ttmlStyle.bold;
            }
            if (this.italic == -1) {
                this.italic = ttmlStyle.italic;
            }
            if (this.fontFamily == null && (str = ttmlStyle.fontFamily) != null) {
                this.fontFamily = str;
            }
            if (this.linethrough == -1) {
                this.linethrough = ttmlStyle.linethrough;
            }
            if (this.underline == -1) {
                this.underline = ttmlStyle.underline;
            }
            if (this.rubyPosition == -1) {
                this.rubyPosition = ttmlStyle.rubyPosition;
            }
            if (this.textAlign == null && (alignment2 = ttmlStyle.textAlign) != null) {
                this.textAlign = alignment2;
            }
            if (this.multiRowAlign == null && (alignment = ttmlStyle.multiRowAlign) != null) {
                this.multiRowAlign = alignment;
            }
            if (this.textCombine == -1) {
                this.textCombine = ttmlStyle.textCombine;
            }
            if (this.fontSizeUnit == -1) {
                this.fontSizeUnit = ttmlStyle.fontSizeUnit;
                this.fontSize = ttmlStyle.fontSize;
            }
            if (this.textEmphasis == null) {
                this.textEmphasis = ttmlStyle.textEmphasis;
            }
            if (this.shearPercentage == Float.MAX_VALUE) {
                this.shearPercentage = ttmlStyle.shearPercentage;
            }
            if (z && !this.hasBackgroundColor && ttmlStyle.hasBackgroundColor) {
                setBackgroundColor(ttmlStyle.backgroundColor);
            }
            if (z && this.rubyType == -1 && (i = ttmlStyle.rubyType) != -1) {
                this.rubyType = i;
            }
        }
        return this;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setId(java.lang.String str) {
        this.id = str;
        return this;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setRubyType(int i) {
        this.rubyType = i;
        return this;
    }

    public int getRubyType() {
        return this.rubyType;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setRubyPosition(int i) {
        this.rubyPosition = i;
        return this;
    }

    public int getRubyPosition() {
        return this.rubyPosition;
    }

    public android.text.Layout.Alignment getTextAlign() {
        return this.textAlign;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setTextAlign(android.text.Layout.Alignment alignment) {
        this.textAlign = alignment;
        return this;
    }

    public android.text.Layout.Alignment getMultiRowAlign() {
        return this.multiRowAlign;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setMultiRowAlign(android.text.Layout.Alignment alignment) {
        this.multiRowAlign = alignment;
        return this;
    }

    public boolean getTextCombine() {
        return this.textCombine == 1;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setTextCombine(boolean z) {
        this.textCombine = z ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.ttml.TextEmphasis getTextEmphasis() {
        return this.textEmphasis;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setTextEmphasis(androidx.media3.extractor.text.ttml.TextEmphasis textEmphasis) {
        this.textEmphasis = textEmphasis;
        return this;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setFontSize(float f) {
        this.fontSize = f;
        return this;
    }

    public androidx.media3.extractor.text.ttml.TtmlStyle setFontSizeUnit(int i) {
        this.fontSizeUnit = i;
        return this;
    }

    public int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public float getFontSize() {
        return this.fontSize;
    }
}

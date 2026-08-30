package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int fontColor;
    private float fontSize;
    private java.lang.String targetId = "";
    private java.lang.String targetTag = "";
    private java.util.Set<java.lang.String> targetClasses = java.util.Collections.emptySet();
    private java.lang.String targetVoice = "";
    private java.lang.String fontFamily = null;
    private boolean hasFontColor = false;
    private boolean hasBackgroundColor = false;
    private int linethrough = -1;
    private int underline = -1;
    private int bold = -1;
    private int italic = -1;
    private int fontSizeUnit = -1;
    private int rubyPosition = -1;
    private boolean combineUpright = false;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public void setTargetId(java.lang.String str) {
        this.targetId = str;
    }

    public void setTargetTagName(java.lang.String str) {
        this.targetTag = str;
    }

    public void setTargetClasses(java.lang.String[] strArr) {
        this.targetClasses = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    public void setTargetVoice(java.lang.String str) {
        this.targetVoice = str;
    }

    public int getSpecificityScore(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set, java.lang.String str3) {
        if (this.targetId.isEmpty() && this.targetTag.isEmpty() && this.targetClasses.isEmpty() && this.targetVoice.isEmpty()) {
            return android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iUpdateScoreForMatch = updateScoreForMatch(updateScoreForMatch(updateScoreForMatch(0, this.targetId, str, 1073741824), this.targetTag, str2, 2), this.targetVoice, str3, 4);
        if (iUpdateScoreForMatch == -1 || !set.containsAll(this.targetClasses)) {
            return 0;
        }
        return iUpdateScoreForMatch + (this.targetClasses.size() * 4);
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

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setLinethrough(boolean z) {
        this.linethrough = z ? 1 : 0;
        return this;
    }

    public boolean isUnderline() {
        return this.underline == 1;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setUnderline(boolean z) {
        this.underline = z ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setBold(boolean z) {
        this.bold = z ? 1 : 0;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setItalic(boolean z) {
        this.italic = z ? 1 : 0;
        return this;
    }

    public java.lang.String getFontFamily() {
        return this.fontFamily;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontFamily(java.lang.String str) {
        this.fontFamily = str == null ? null : com.google.common.base.Ascii.toLowerCase(str);
        return this;
    }

    public int getFontColor() {
        if (!this.hasFontColor) {
            throw new java.lang.IllegalStateException("Font color not defined");
        }
        return this.fontColor;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontColor(int i) {
        this.fontColor = i;
        this.hasFontColor = true;
        return this;
    }

    public boolean hasFontColor() {
        return this.hasFontColor;
    }

    public int getBackgroundColor() {
        if (!this.hasBackgroundColor) {
            throw new java.lang.IllegalStateException("Background color not defined.");
        }
        return this.backgroundColor;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setBackgroundColor(int i) {
        this.backgroundColor = i;
        this.hasBackgroundColor = true;
        return this;
    }

    public boolean hasBackgroundColor() {
        return this.hasBackgroundColor;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontSize(float f) {
        this.fontSize = f;
        return this;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setFontSizeUnit(int i) {
        this.fontSizeUnit = i;
        return this;
    }

    public int getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setRubyPosition(int i) {
        this.rubyPosition = i;
        return this;
    }

    public int getRubyPosition() {
        return this.rubyPosition;
    }

    public androidx.media3.extractor.text.webvtt.WebvttCssStyle setCombineUpright(boolean z) {
        this.combineUpright = z;
        return this;
    }

    public boolean getCombineUpright() {
        return this.combineUpright;
    }

    private static int updateScoreForMatch(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}

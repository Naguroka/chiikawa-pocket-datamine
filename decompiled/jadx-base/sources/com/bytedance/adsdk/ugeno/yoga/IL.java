package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum IL {
    AUTO(0, "auto"),
    FLEX_START(1, "flex_start"),
    CENTER(2, androidx.media3.extractor.text.ttml.TtmlNode.CENTER),
    FLEX_END(3, "flex_end"),
    STRETCH(4, "stretch"),
    BASELINE(5, "baseline"),
    SPACE_BETWEEN(6, "space_between"),
    SPACE_AROUND(7, "space_around");

    private final int WR;
    private final java.lang.String eo;

    IL(int i, java.lang.String str) {
        this.WR = i;
        this.eo = str;
    }

    public int bg() {
        return this.WR;
    }

    public static com.bytedance.adsdk.ugeno.yoga.IL bg(int i) {
        switch (i) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(i)));
        }
    }

    public static com.bytedance.adsdk.ugeno.yoga.IL bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "stretch":
                return STRETCH;
            case "baseline":
                return BASELINE;
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "auto":
                return AUTO;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(str)));
        }
    }
}

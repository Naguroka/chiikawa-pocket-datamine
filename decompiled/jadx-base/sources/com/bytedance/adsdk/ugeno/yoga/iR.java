package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum iR {
    FLEX_START(0, "flex_start"),
    CENTER(1, androidx.media3.extractor.text.ttml.TtmlNode.CENTER),
    FLEX_END(2, "flex_end"),
    SPACE_BETWEEN(3, "space_between"),
    SPACE_AROUND(4, "space_around"),
    SPACE_EVENLY(5, "space_evenly");

    private final java.lang.String Kg;
    private final int iR;

    iR(int i, java.lang.String str) {
        this.iR = i;
        this.Kg = str;
    }

    public int bg() {
        return this.iR;
    }

    public static com.bytedance.adsdk.ugeno.yoga.iR bg(int i) {
        if (i == 0) {
            return FLEX_START;
        }
        if (i == 1) {
            return CENTER;
        }
        if (i == 2) {
            return FLEX_END;
        }
        if (i == 3) {
            return SPACE_BETWEEN;
        }
        if (i == 4) {
            return SPACE_AROUND;
        }
        if (i == 5) {
            return SPACE_EVENLY;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(i)));
    }

    public static com.bytedance.adsdk.ugeno.yoga.iR bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "space_evenly":
                return SPACE_EVENLY;
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

package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum Lq {
    STATIC(0, "static"),
    RELATIVE(1, "relative"),
    ABSOLUTE(2, "absolute");

    private final int eqN;
    private final java.lang.String zx;

    Lq(int i, java.lang.String str) {
        this.eqN = i;
        this.zx = str;
    }

    public int bg() {
        return this.eqN;
    }

    public static com.bytedance.adsdk.ugeno.yoga.Lq bg(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(i)));
    }

    public static com.bytedance.adsdk.ugeno.yoga.Lq bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(str)));
        }
    }
}

package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum xxp {
    NO_WRAP(0, "nowrap"),
    WRAP(1, "wrap"),
    WRAP_REVERSE(2, "wrap_reverse");

    private final int eqN;
    private final java.lang.String zx;

    xxp(int i, java.lang.String str) {
        this.eqN = i;
        this.zx = str;
    }

    public int bg() {
        return this.eqN;
    }

    public static com.bytedance.adsdk.ugeno.yoga.xxp bg(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(i)));
    }

    public static com.bytedance.adsdk.ugeno.yoga.xxp bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(str)));
        }
    }
}

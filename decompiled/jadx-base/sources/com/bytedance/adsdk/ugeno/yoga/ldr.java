package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum ldr {
    COLUMN(0, "column"),
    COLUMN_REVERSE(1, "column_reverse"),
    ROW(2, "row"),
    ROW_REVERSE(3, "row_reverse");

    private final java.lang.String ldr;
    private final int zx;

    ldr(int i, java.lang.String str) {
        this.zx = i;
        this.ldr = str;
    }

    public int bg() {
        return this.zx;
    }

    public static com.bytedance.adsdk.ugeno.yoga.ldr bg(int i) {
        if (i == 0) {
            return COLUMN;
        }
        if (i == 1) {
            return COLUMN_REVERSE;
        }
        if (i == 2) {
            return ROW;
        }
        if (i == 3) {
            return ROW_REVERSE;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(i)));
    }

    public static com.bytedance.adsdk.ugeno.yoga.ldr bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(str)));
        }
    }
}

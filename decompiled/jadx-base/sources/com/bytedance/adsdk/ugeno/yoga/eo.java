package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public enum eo {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int eqN;

    eo(int i) {
        this.eqN = i;
    }

    public static com.bytedance.adsdk.ugeno.yoga.eo bg(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new java.lang.IllegalArgumentException("Unknown enum value: ".concat(java.lang.String.valueOf(i)));
    }
}

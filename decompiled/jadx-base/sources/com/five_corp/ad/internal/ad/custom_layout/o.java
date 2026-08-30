package com.five_corp.ad.internal.ad.custom_layout;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw null;
                    }
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ java.lang.String b(int i) {
        if (i == 1) {
            return "ALL_TIME";
        }
        if (i == 2) {
            return "AFTER_VIEW_THROUGH";
        }
        if (i == 3) {
            return "BEFORE_VIEW_THROUGH";
        }
        if (i != 4) {
            return i != 5 ? "null" : "START_MS_TO_BEFORE_VIEW_THROUGH";
        }
        return "START_END";
    }
}

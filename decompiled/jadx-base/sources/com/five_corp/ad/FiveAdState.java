package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public enum FiveAdState {
    NOT_LOADED,
    LOADING,
    LOADED,
    CLOSED,
    ERROR;

    public int toInt() {
        int i = com.five_corp.ad.p.f2125a[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        return i != 5 ? 0 : 6;
                    }
                    return 5;
                }
            }
        }
        return i2;
    }
}

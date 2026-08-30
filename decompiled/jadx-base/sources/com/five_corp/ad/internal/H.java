package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class H {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }
}

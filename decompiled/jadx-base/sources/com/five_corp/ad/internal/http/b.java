package com.five_corp.ad.internal.http;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw null;
            }
        }
        return i2;
    }

    public static /* synthetic */ java.lang.String b(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "LOADED";
        }
        if (i == 3) {
            return "PLAYING";
        }
        throw null;
    }
}

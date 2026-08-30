package com.five_corp.ad.internal.soundstate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static int a(int... iArr) {
        for (int i : iArr) {
            if (i == 4) {
                return 4;
            }
        }
        for (int i2 : iArr) {
            if (i2 != 1) {
                return i2;
            }
        }
        return 1;
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1457a;
    public final int b;
    public final java.lang.String c;

    public static com.applovin.impl.w6 a(com.applovin.impl.ah ahVar) {
        java.lang.String str;
        ahVar.g(2);
        int iW = ahVar.w();
        int i = iW >> 1;
        int iW2 = ((ahVar.w() >> 3) & 31) | ((iW & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        return new com.applovin.impl.w6(i, iW2, str + ".0" + i + (iW2 >= 10 ? "." : ".0") + iW2);
    }

    private w6(int i, int i2, java.lang.String str) {
        this.f1457a = i;
        this.b = i2;
        this.c = str;
    }
}

package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1546a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private yk(int i, int i2, int i3, int i4, int i5) {
        this.f1546a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static com.applovin.impl.yk a(java.lang.String str) {
        com.applovin.impl.b1.a(str.startsWith("Format:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(strArrSplit[i5].trim());
            lowerCase.hashCode();
            lowerCase.hashCode();
            switch (lowerCase) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new com.applovin.impl.yk(i, i2, i3, i4, strArrSplit.length);
    }
}

package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("(\\.\\w+)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Random f2064a;

    public r(java.util.Random random) {
        this.f2064a = random;
    }

    public static java.lang.String a(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            str = str.substring(0, iLastIndexOf);
        }
        java.lang.String[] strArrSplit = str.split(com.ironsource.y8.i.b);
        if (strArrSplit.length != 3) {
            return null;
        }
        return strArrSplit[1];
    }
}

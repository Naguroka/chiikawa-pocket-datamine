package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2125a;

    static {
        int[] iArr = new int[com.five_corp.ad.FiveAdState.values().length];
        f2125a = iArr;
        try {
            iArr[com.five_corp.ad.FiveAdState.NOT_LOADED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f2125a[com.five_corp.ad.FiveAdState.LOADING.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f2125a[com.five_corp.ad.FiveAdState.LOADED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f2125a[com.five_corp.ad.FiveAdState.CLOSED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f2125a[com.five_corp.ad.FiveAdState.ERROR.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}

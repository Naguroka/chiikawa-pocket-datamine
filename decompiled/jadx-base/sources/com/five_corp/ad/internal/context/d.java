package com.five_corp.ad.internal.context;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1884a;

    static {
        int[] iArr = new int[com.five_corp.ad.CreativeType.values().length];
        f1884a = iArr;
        try {
            iArr[com.five_corp.ad.CreativeType.IMAGE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f1884a[com.five_corp.ad.CreativeType.MOVIE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f1884a[com.five_corp.ad.CreativeType.NOT_LOADED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}

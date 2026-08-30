package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1506z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2032a;

    static {
        int[] iArr = new int[com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.values().length];
        f2032a = iArr;
        try {
            iArr[com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.BeforeBox.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f2032a[com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterSize.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f2032a[com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterType.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f2032a[com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterExtendedSze.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f2032a[com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.InBox.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
    }
}

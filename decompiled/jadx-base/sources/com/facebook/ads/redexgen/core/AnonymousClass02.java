package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.02, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass02<T> {
    public final T A00;
    public final java.lang.Throwable A01;
    public final boolean A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public AnonymousClass02(boolean z, T result) {
        this.A02 = z;
        this.A00 = result;
        this.A01 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public AnonymousClass02(boolean z, T result, java.lang.Throwable th) {
        this.A02 = z;
        this.A00 = result;
        this.A01 = th;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public final T A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.02 != com.facebook.ads.cache.api.CacheResponse<T> */
    public final boolean A01() {
        return this.A02;
    }
}

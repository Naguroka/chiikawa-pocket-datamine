package com.five_corp.ad.internal.movie.partialcache.mediacodec;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2008a;
    public final java.nio.ByteBuffer b;

    public a(int i, java.nio.ByteBuffer byteBuffer) {
        this.f2008a = i;
        this.b = byteBuffer;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof com.five_corp.ad.internal.movie.partialcache.mediacodec.a) && this.f2008a == ((com.five_corp.ad.internal.movie.partialcache.mediacodec.a) obj).f2008a;
    }

    public final int hashCode() {
        return this.f2008a;
    }
}

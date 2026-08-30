package com.five_corp.ad.internal.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1809a;
    public final com.five_corp.ad.internal.ad.f b;
    public final java.lang.Long c;

    public e(int i, com.five_corp.ad.internal.ad.f fVar, java.lang.Long l) {
        this.f1809a = i;
        this.b = fVar;
        this.c = l;
    }

    public final java.lang.String toString() {
        return "CachedAdOperation{operationType=" + com.five_corp.ad.internal.ad.d.a(this.f1809a) + ", nextPlayableTimestampMs=" + this.c + ", ccId=" + this.b + '}';
    }
}

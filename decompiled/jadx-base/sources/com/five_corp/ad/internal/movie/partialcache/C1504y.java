package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1504y extends java.util.HashSet {
    public C1504y() {
        addAll(com.five_corp.ad.internal.movie.partialcache.j1.b);
        for (java.util.Map.Entry entry : com.five_corp.ad.internal.movie.partialcache.j1.c.entrySet()) {
            add((java.lang.Class) entry.getKey());
            addAll((java.util.Collection) entry.getValue());
        }
    }
}

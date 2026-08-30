package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l1 {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.logger.a f2007a;
    public com.five_corp.ad.internal.movie.partialcache.C1490q0 b;
    public com.five_corp.ad.internal.movie.partialcache.C1486o0 c;
    public int f;
    public com.five_corp.ad.internal.movie.partialcache.y1 g;
    public com.five_corp.ad.internal.movie.partialcache.C1457a h;
    public com.five_corp.ad.internal.movie.partialcache.k1 i;
    public com.five_corp.ad.internal.movie.partialcache.k1 j;
    public int d = 0;
    public int e = 0;
    public boolean k = false;

    public l1(com.five_corp.ad.internal.logger.a aVar) {
        this.f2007a = aVar;
    }

    public static com.five_corp.ad.internal.movie.partialcache.D b(com.five_corp.ad.internal.movie.partialcache.D d, java.lang.Class cls) {
        for (com.five_corp.ad.internal.movie.partialcache.D d2 : d.c) {
            if (cls.isInstance(d2)) {
                return d2;
            }
        }
        return null;
    }
}

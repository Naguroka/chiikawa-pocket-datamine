package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1466e0 extends com.five_corp.ad.internal.movie.partialcache.D {
    public byte f;
    public final byte[] g = new byte[3];

    @Override // com.five_corp.ad.internal.movie.partialcache.D
    public void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        this.f = cVar.a();
        cVar.a(this.g);
    }
}

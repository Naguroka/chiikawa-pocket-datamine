package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1468f0 extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    public final byte[] h = new byte[4];

    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        if (this.f != 0) {
            throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("Invalid version " + ((int) this.f) + " for hdlr");
        }
        cVar.b();
        cVar.a(this.h);
        cVar.b();
        cVar.b();
        cVar.b();
        byte[] bArr = new byte[(int) a(cVar)];
        cVar.a(bArr);
        try {
            new java.lang.String(bArr, com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("UnsupportedEncodingException for handler name", e);
        }
    }
}

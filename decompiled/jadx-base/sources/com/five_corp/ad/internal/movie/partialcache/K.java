package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0 {
    @Override // com.five_corp.ad.internal.movie.partialcache.AbstractC1466e0, com.five_corp.ad.internal.movie.partialcache.D
    public final void a(com.five_corp.ad.internal.util.c cVar, com.five_corp.ad.internal.logger.a aVar) throws com.five_corp.ad.internal.movie.partialcache.C1505y0 {
        super.a(cVar, aVar);
        cVar.d();
        byte[] bArr = new byte[(int) a(cVar)];
        cVar.a(bArr);
        try {
            new java.lang.String(bArr, com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new com.five_corp.ad.internal.movie.partialcache.C1505y0("UnsupportedEncodingException for copyright notice", e);
        }
    }
}

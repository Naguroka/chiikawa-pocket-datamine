package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements com.five_corp.ad.internal.cache.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdNative.LoadImageCallback f2121a;

    public l(com.five_corp.ad.FiveAdNative.LoadImageCallback loadImageCallback) {
        this.f2121a = loadImageCallback;
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(com.five_corp.ad.internal.s sVar) {
        this.f2121a.onImageLoad(null);
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(android.graphics.Bitmap bitmap) {
        this.f2121a.onImageLoad(bitmap);
    }
}

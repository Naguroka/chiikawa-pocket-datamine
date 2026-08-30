package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements com.five_corp.ad.internal.cache.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdNative.LoadImageCallback f2122a;

    public m(com.five_corp.ad.FiveAdNative.LoadImageCallback loadImageCallback) {
        this.f2122a = loadImageCallback;
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(com.five_corp.ad.internal.s sVar) {
        this.f2122a.onImageLoad(null);
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(android.graphics.Bitmap bitmap) {
        this.f2122a.onImageLoad(bitmap);
    }
}

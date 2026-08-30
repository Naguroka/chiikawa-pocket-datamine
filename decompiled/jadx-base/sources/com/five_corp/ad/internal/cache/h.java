package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.cache.e f1868a;
    public final /* synthetic */ android.graphics.Bitmap b;

    public h(com.five_corp.ad.internal.cache.e eVar, android.graphics.Bitmap bitmap) {
        this.f1868a = eVar;
        this.b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1868a.a(this.b);
    }
}

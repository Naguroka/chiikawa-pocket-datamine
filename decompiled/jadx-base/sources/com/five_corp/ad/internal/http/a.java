package com.five_corp.ad.internal.http;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f1906a;
    public final java.lang.ref.WeakReference b;
    public final int c;

    public a(com.five_corp.ad.internal.ad.a aVar, com.five_corp.ad.internal.context.l lVar, int i) {
        this.f1906a = new java.lang.ref.WeakReference(aVar);
        this.b = new java.lang.ref.WeakReference(lVar);
        this.c = i;
    }

    public static com.five_corp.ad.internal.http.a a(com.five_corp.ad.internal.context.l lVar) {
        return new com.five_corp.ad.internal.http.a(null, lVar, 3);
    }

    public final boolean a() {
        return (this.f1906a.get() == null && this.b.get() == null) ? false : true;
    }
}

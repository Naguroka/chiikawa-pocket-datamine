package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements com.five_corp.ad.internal.http.movcache.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.http.a f1932a;

    public j(com.five_corp.ad.internal.http.a aVar) {
        this.f1932a = aVar;
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final int a() {
        return this.f1932a.c;
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void a(int i, boolean z, com.five_corp.ad.internal.http.movcache.m mVar, boolean z2) {
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void a(byte[] bArr, int i, int i2, int i3) {
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void b() {
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final void c() {
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final boolean d() {
        com.five_corp.ad.internal.http.a aVar = this.f1932a;
        com.five_corp.ad.internal.context.l lVar = (com.five_corp.ad.internal.context.l) aVar.b.get();
        com.five_corp.ad.internal.ad.a aVar2 = lVar != null ? lVar.b : (com.five_corp.ad.internal.ad.a) aVar.f1906a.get();
        if (aVar2 == null || !this.f1932a.a()) {
            return false;
        }
        return !aVar2.b();
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final boolean e() {
        return this.f1932a.a();
    }

    @Override // com.five_corp.ad.internal.http.movcache.i
    public final boolean a(int i) {
        com.five_corp.ad.internal.http.a aVar = this.f1932a;
        com.five_corp.ad.internal.context.l lVar = (com.five_corp.ad.internal.context.l) aVar.b.get();
        com.five_corp.ad.internal.ad.a aVar2 = lVar != null ? lVar.b : (com.five_corp.ad.internal.ad.a) aVar.f1906a.get();
        if (aVar2 == null || !this.f1932a.a()) {
            return false;
        }
        return !aVar2.b() || ((long) i) < aVar2.h.b;
    }
}

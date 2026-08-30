package com.five_corp.ad.internal.context;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.five_corp.ad.internal.cache.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.time.c f1883a;
    public final /* synthetic */ com.five_corp.ad.internal.context.e b;
    public final /* synthetic */ com.five_corp.ad.internal.context.l c;
    public final /* synthetic */ com.five_corp.ad.internal.context.f d;

    public c(com.five_corp.ad.internal.time.c cVar, com.five_corp.ad.internal.context.e eVar, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.context.f fVar) {
        this.f1883a = cVar;
        this.b = eVar;
        this.c = lVar;
        this.d = fVar;
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(com.five_corp.ad.internal.s sVar) {
        if (this.f1883a.b()) {
            this.d.a(sVar);
        }
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(java.lang.String str) {
        if (this.f1883a.b()) {
            this.b.a(this.c);
        }
    }
}

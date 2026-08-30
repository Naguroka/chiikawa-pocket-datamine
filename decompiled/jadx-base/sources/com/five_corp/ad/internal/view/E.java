package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements com.five_corp.ad.internal.cache.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.view.F f2090a;

    public E(com.five_corp.ad.internal.view.F f) {
        this.f2090a = f;
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(com.five_corp.ad.internal.s sVar) {
        ((com.five_corp.ad.f) this.f2090a.d).a(0, sVar);
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(android.graphics.Bitmap bitmap) {
        this.f2090a.k = new android.widget.ImageView(this.f2090a.f2092a);
        this.f2090a.k.setImageBitmap(bitmap);
        com.five_corp.ad.internal.view.F f = this.f2090a;
        com.five_corp.ad.internal.view.C1515h c1515h = f.c;
        c1515h.addView(f.k, c1515h.f2097a);
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.f2090a.d;
        fVar.r = true;
        fVar.k = Long.MAX_VALUE;
        com.five_corp.ad.internal.B b = fVar.o;
        if (b.l) {
            return;
        }
        b.l = true;
        if (b.g.d.b.h) {
            b.a(16, 0L, 0.0d, null, null);
        }
    }
}

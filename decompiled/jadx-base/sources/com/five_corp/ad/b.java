package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1775a = 0;
    public final /* synthetic */ com.five_corp.ad.f b;

    public b(com.five_corp.ad.f fVar) {
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1775a;
        this.f1775a = i + 1;
        if (i > 25) {
            return;
        }
        if (com.five_corp.ad.f.a(this.b.f1777a)) {
            this.b.d.postDelayed(this, 200L);
            return;
        }
        try {
            this.b.j();
        } catch (java.lang.Exception e) {
            com.five_corp.ad.f fVar = this.b;
            fVar.a(fVar.h.getCurrentPositionMs(), new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.e4, null, e, null));
        }
    }
}

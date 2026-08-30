package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends com.five_corp.ad.internal.view.J {
    public final com.five_corp.ad.internal.cache.f i;
    public com.five_corp.ad.internal.view.E j;
    public android.widget.ImageView k;
    public final com.five_corp.ad.internal.ad.t l;
    public final com.five_corp.ad.internal.ad.t m;

    public F(android.content.Context context, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.o oVar, com.five_corp.ad.internal.view.I i, com.five_corp.ad.internal.logger.a aVar) {
        super(context, lVar, oVar, i, aVar);
        this.i = lVar.h;
        com.five_corp.ad.internal.ad.g gVar = lVar.b.H;
        if (gVar == null || gVar.a() != 2) {
            return;
        }
        com.five_corp.ad.internal.ad.t tVar = new com.five_corp.ad.internal.ad.t(getContext());
        this.l = tVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        tVar.setLayoutParams(layoutParams);
        tVar.setGravity(17);
        tVar.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        androidx.core.widget.TextViewCompat.setAutoSizeTextTypeWithDefaults(tVar, 1);
        addView(tVar);
        com.five_corp.ad.internal.ad.t tVar2 = new com.five_corp.ad.internal.ad.t(getContext());
        this.m = tVar2;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        tVar2.setLayoutParams(layoutParams2);
        tVar2.setGravity(17);
        tVar.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        androidx.core.widget.TextViewCompat.setAutoSizeTextTypeWithDefaults(tVar2, 1);
        addView(tVar2);
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void a(boolean z) {
    }

    @Override // com.five_corp.ad.internal.view.J
    public final boolean c() {
        return false;
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void d() {
        if (this.j == null) {
            com.five_corp.ad.internal.view.E e = new com.five_corp.ad.internal.view.E(this);
            this.j = e;
            this.i.a(this.b.b.n, e);
        }
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void e() {
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void f() {
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void g() {
    }

    @Override // com.five_corp.ad.internal.view.J
    public final int getCurrentPositionMs() {
        return 0;
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void a(com.five_corp.ad.internal.viewability.b bVar) {
        com.five_corp.ad.internal.ad.t tVar = this.l;
        if (tVar != null) {
            tVar.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
        }
        com.five_corp.ad.internal.ad.t tVar2 = this.m;
        if (tVar2 != null) {
            tVar2.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
        }
    }
}

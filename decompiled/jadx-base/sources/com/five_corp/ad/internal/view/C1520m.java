package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1520m extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.layouter.h f2102a;

    static {
        com.five_corp.ad.internal.view.C1520m.class.toString();
    }

    public C1520m(com.five_corp.ad.AdActivity adActivity, com.five_corp.ad.internal.K k, com.five_corp.ad.internal.logger.a aVar, android.view.View view, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.layouter.g gVar, com.five_corp.ad.internal.layouter.f fVar, com.five_corp.ad.internal.viewability.a aVar2, com.five_corp.ad.internal.layouter.k kVar) {
        super(adActivity);
        this.f2102a = new com.five_corp.ad.internal.layouter.h(this, adActivity, k, aVar, view, lVar, gVar, fVar, aVar2, kVar);
    }

    public final void a() {
        com.five_corp.ad.internal.layouter.h hVar = this.f2102a;
        hVar.g.b.a();
        com.five_corp.ad.internal.ad.w wVar = hVar.f1943a.getWidth() > hVar.f1943a.getHeight() ? hVar.c.h : hVar.c.g;
        if (wVar != null) {
            com.five_corp.ad.internal.cache.b bVarA = hVar.e.a(hVar.b, wVar);
            hVar.h = bVarA;
            hVar.f1943a.addView(bVarA, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            hVar.h.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        hVar.f1943a.addView(hVar.g, new android.widget.FrameLayout.LayoutParams(0, 0, 17));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            com.five_corp.ad.internal.layouter.h hVar = this.f2102a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            hVar.getClass();
            try {
                com.five_corp.ad.internal.ad.custom_layout.d customLayoutConfig = hVar.g.getCustomLayoutConfig();
                com.five_corp.ad.internal.ad.custom_layout.d dVar = i5 > i6 ? hVar.c.f : hVar.c.e;
                if (customLayoutConfig != dVar) {
                    hVar.g.b.a(dVar);
                }
                hVar.g.setLayoutParams(hVar.a(i5, i6));
                hVar.b(i5, i6);
            } catch (java.lang.Throwable th) {
                hVar.n.a(th);
            }
        }
    }
}

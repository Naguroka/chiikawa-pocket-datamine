package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1519l extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.viewability.a f2101a;
    public final com.five_corp.ad.internal.layouter.e b;

    public C1519l(android.content.Context context, com.five_corp.ad.internal.logger.a aVar, android.view.View view, com.five_corp.ad.internal.layouter.d dVar, com.five_corp.ad.internal.context.l lVar, java.lang.String str, com.five_corp.ad.internal.viewability.a aVar2, com.five_corp.ad.internal.ad.custom_layout.d dVar2, com.five_corp.ad.internal.layouter.k kVar) {
        super(context);
        this.f2101a = aVar2;
        this.b = new com.five_corp.ad.internal.layouter.e(this, context, aVar, view, dVar, lVar, str, aVar2, dVar2, kVar);
    }

    public final void a() {
        this.b.a();
    }

    public com.five_corp.ad.internal.ad.custom_layout.d getCustomLayoutConfig() {
        return this.b.g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        com.five_corp.ad.internal.layouter.e eVar = this.b;
        eVar.getClass();
        try {
            if (eVar.i != i || eVar.j != i2) {
                eVar.i = i;
                eVar.j = i2;
                eVar.a(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
            }
        } catch (java.lang.Exception e) {
            eVar.d.a(e);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.five_corp.ad.internal.viewability.a aVar = this.f2101a;
        synchronized (aVar.g) {
            aVar.h = z;
        }
    }
}

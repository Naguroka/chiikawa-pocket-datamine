package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f2092a;
    public final com.five_corp.ad.internal.context.l b;
    public final com.five_corp.ad.internal.view.C1515h c;
    public final com.five_corp.ad.internal.view.I d;
    public final com.five_corp.ad.internal.logger.a e;
    public final com.five_corp.ad.internal.o f;
    public int g;
    public int h;

    static {
        com.five_corp.ad.internal.view.J.class.toString();
    }

    public J(android.content.Context context, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.o oVar, com.five_corp.ad.internal.view.I i, com.five_corp.ad.internal.logger.a aVar) {
        super(context);
        this.f2092a = context;
        this.b = lVar;
        this.d = i;
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.f = oVar;
        this.e = aVar;
        com.five_corp.ad.internal.view.C1515h c1515h = new com.five_corp.ad.internal.view.C1515h(context, new android.widget.FrameLayout.LayoutParams(0, 0));
        this.c = c1515h;
        addView(c1515h, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public static com.five_corp.ad.internal.view.J a(android.content.Context context, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.o oVar, com.five_corp.ad.internal.view.I i, com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.r rVar, com.five_corp.ad.internal.http.movcache.h hVar) {
        com.five_corp.ad.CreativeType creativeType = lVar.b.b;
        int i2 = com.five_corp.ad.internal.view.H.f2091a[creativeType.ordinal()];
        if (i2 == 1) {
            return new com.five_corp.ad.internal.view.G(context, lVar, oVar, i, aVar, rVar, hVar);
        }
        if (i2 == 2) {
            return new com.five_corp.ad.internal.view.F(context, lVar, oVar, i, aVar);
        }
        throw new java.lang.RuntimeException("Unknown CreativeType: " + creativeType.value);
    }

    public abstract void a(com.five_corp.ad.internal.viewability.b bVar);

    public abstract void a(boolean z);

    public abstract boolean c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract int getCurrentPositionMs();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.five_corp.ad.internal.o oVar = this.f;
        if (oVar.b) {
            return;
        }
        oVar.b = true;
        if (oVar.c) {
            ((com.five_corp.ad.f) oVar.f2042a).m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.five_corp.ad.internal.o oVar = this.f;
        boolean z = oVar.b;
        boolean z2 = z && oVar.c;
        if (z) {
            oVar.b = false;
            if (z2) {
                ((com.five_corp.ad.f) oVar.f2042a).n();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            if (this.g != i || this.h != i2) {
                this.g = i;
                this.h = i2;
                int size = android.view.View.MeasureSpec.getSize(i);
                int size2 = android.view.View.MeasureSpec.getSize(i2);
                com.five_corp.ad.internal.view.C1515h c1515h = this.c;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(size, size2);
                c1515h.f2097a = layoutParams;
                for (int i3 = 0; i3 < c1515h.getChildCount(); i3++) {
                    c1515h.getChildAt(i3).setLayoutParams(layoutParams);
                }
            }
        } catch (java.lang.Throwable th) {
            this.e.a(th);
        }
        super.onMeasure(i, i2);
    }
}

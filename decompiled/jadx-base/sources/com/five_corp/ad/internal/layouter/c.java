package com.five_corp.ad.internal.layouter;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView[] f1940a;
    public int b = 0;
    public final /* synthetic */ com.five_corp.ad.internal.ad.custom_layout.f c;
    public final /* synthetic */ android.widget.FrameLayout d;
    public final /* synthetic */ com.five_corp.ad.internal.layouter.e e;

    public c(com.five_corp.ad.internal.layouter.e eVar, com.five_corp.ad.internal.ad.custom_layout.f fVar, android.widget.FrameLayout frameLayout) {
        this.e = eVar;
        this.c = fVar;
        this.d = frameLayout;
        this.f1940a = new android.widget.ImageView[fVar.b.size()];
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            android.widget.ImageView imageView = this.f1940a[this.b];
            if (imageView == null) {
                int size = this.c.b.size();
                int i = this.b;
                if (size > i) {
                    com.five_corp.ad.internal.ad.w wVar = (com.five_corp.ad.internal.ad.w) this.c.b.get(i);
                    android.widget.ImageView[] imageViewArr = this.f1940a;
                    int i2 = this.b;
                    com.five_corp.ad.internal.layouter.e eVar = this.e;
                    imageViewArr[i2] = eVar.k.h.a(eVar.b, wVar);
                }
            }
            for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                com.five_corp.ad.internal.view.M.a(this.d.getChildAt(i3));
            }
            this.d.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
            int i4 = this.b + 1;
            this.b = i4;
            if (i4 >= this.c.b.size() && this.c.f1802a) {
                this.b = 0;
            }
            if (this.b < this.c.b.size()) {
                this.e.c.postDelayed(this, this.c.c);
            }
        } catch (java.lang.Exception e) {
            this.e.h.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.P6, null, e, null));
        }
    }
}

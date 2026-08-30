package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.j f1087a;
    final android.app.Activity b;
    final com.applovin.impl.sdk.ad.b c;
    final android.view.ViewGroup d;
    final android.widget.FrameLayout.LayoutParams e;

    n9(com.applovin.impl.sdk.ad.b bVar, android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        this.e = layoutParams;
        this.c = bVar;
        this.f1087a = jVar;
        this.b = activity;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.c.l(), (this.c.A0() ? 3 : 5) | 48, gVar);
    }

    void a(com.applovin.impl.sdk.ad.b.d dVar, int i, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f1280a, dVar.e, dVar.d, i);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i2 = dVar.c;
        layoutParams.setMargins(i2, dVar.b, i2, 0);
        layoutParams.gravity = i;
        this.d.addView(gVar, layoutParams);
    }

    public void a(android.view.View view) {
        this.d.removeView(view);
    }
}

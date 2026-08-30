package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class g extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.adview.e f613a;
    private int b;

    public g(com.applovin.impl.adview.e.a aVar, android.app.Activity activity) {
        super(activity);
        setBackgroundColor(0);
        com.applovin.impl.adview.e eVarA = com.applovin.impl.adview.e.a(aVar, activity);
        this.f613a = eVarA;
        addView(eVarA);
    }

    public void a(com.applovin.impl.adview.e.a aVar) {
        if (aVar == null || aVar == this.f613a.getStyle()) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f613a.getLayoutParams();
        removeView(this.f613a);
        com.applovin.impl.adview.e eVarA = com.applovin.impl.adview.e.a(aVar, getContext());
        this.f613a = eVarA;
        addView(eVarA);
        this.f613a.setLayoutParams(layoutParams);
        this.f613a.a(this.b);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.b = i;
        int i5 = i2 + i + i3;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new android.widget.FrameLayout.LayoutParams(i5, i5));
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f613a.setLayoutParams(layoutParams2);
        this.f613a.a(i);
    }
}

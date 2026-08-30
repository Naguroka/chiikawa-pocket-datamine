package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends android.widget.FrameLayout {
    public K(android.app.Activity activity, com.five_corp.ad.internal.view.C1510c c1510c) {
        super(activity);
        a(c1510c);
    }

    public final void a(com.five_corp.ad.internal.view.C1510c c1510c) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        addView(c1510c);
    }
}

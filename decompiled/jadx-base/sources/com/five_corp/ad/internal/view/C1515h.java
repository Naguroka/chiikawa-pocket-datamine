package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1515h extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f2097a;

    public C1515h(android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams) {
        super(context);
        this.f2097a = layoutParams;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        addView(view, this.f2097a);
    }
}

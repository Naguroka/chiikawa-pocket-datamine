package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class Z implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1704c0 f3904a;

    Z(com.unity3d.player.C1704c0 c1704c0) {
        this.f3904a = c1704c0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f3904a.reportSoftInputArea();
        this.f3904a.h.b();
    }
}

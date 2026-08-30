package com.google.androidgamesdk;

/* JADX INFO: loaded from: classes5.dex */
final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2346a;
    final /* synthetic */ com.google.androidgamesdk.SwappyDisplayManager b;

    c(com.google.androidgamesdk.SwappyDisplayManager swappyDisplayManager, int i) {
        this.b = swappyDisplayManager;
        this.f2346a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.b.mActivity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredDisplayModeId = this.f2346a;
        window.setAttributes(attributes);
    }
}

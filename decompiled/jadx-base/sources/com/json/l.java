package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class l implements com.json.ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.app.Activity> f2867a;

    public l(android.app.Activity activity) {
        this.f2867a = new java.lang.ref.WeakReference<>(activity);
    }

    @Override // com.json.ov
    public void a() {
        android.app.Activity activity = this.f2867a.get();
        if (activity == null) {
            return;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        android.view.Window window = activity.getWindow();
        if (i < 30) {
            window.setFlags(1024, 1024);
            return;
        }
        android.view.WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(android.view.WindowInsets.Type.statusBars());
        }
    }
}

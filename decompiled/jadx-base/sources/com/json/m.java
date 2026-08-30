package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class m implements com.json.ov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.app.Activity> f2905a;

    public m(android.app.Activity activity) {
        this.f2905a = new java.lang.ref.WeakReference<>(activity);
    }

    @Override // com.json.ov
    public void a() {
        android.app.Activity activity = this.f2905a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}

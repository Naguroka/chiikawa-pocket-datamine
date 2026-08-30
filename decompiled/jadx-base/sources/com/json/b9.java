package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.content.MutableContextWrapper f2530a;

    public android.app.Activity a() {
        return (android.app.Activity) this.f2530a.getBaseContext();
    }

    public synchronized void a(android.app.Activity activity) {
        if (this.f2530a == null) {
            this.f2530a = new android.content.MutableContextWrapper(activity);
        }
        this.f2530a.setBaseContext(activity);
    }

    public synchronized void b() {
        this.f2530a = null;
    }
}

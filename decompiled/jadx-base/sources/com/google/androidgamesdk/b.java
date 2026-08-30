package com.google.androidgamesdk;

/* JADX INFO: loaded from: classes5.dex */
final class b extends java.lang.Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.os.Handler f2345a;

    private b() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.util.Log.i("ChoreographerCallback", "Starting looper thread");
        android.os.Looper.prepare();
        this.f2345a = new android.os.Handler();
        android.os.Looper.loop();
        android.util.Log.i("ChoreographerCallback", "Terminating looper thread");
    }
}

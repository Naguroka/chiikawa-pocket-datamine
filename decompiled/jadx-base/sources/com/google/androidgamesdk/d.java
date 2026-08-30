package com.google.androidgamesdk;

/* JADX INFO: loaded from: classes5.dex */
final class d extends java.lang.Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.os.Handler f2347a;
    private java.util.concurrent.locks.ReentrantLock b;
    private java.util.concurrent.locks.Condition c;

    private d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.util.Log.i("SwappyDisplayManager", "Starting looper thread");
        this.b.lock();
        android.os.Looper.prepare();
        this.f2347a = new android.os.Handler();
        this.c.signal();
        this.b.unlock();
        android.os.Looper.loop();
        android.util.Log.i("SwappyDisplayManager", "Terminating looper thread");
    }

    @Override // java.lang.Thread
    public final void start() {
        this.b.lock();
        super.start();
        try {
            this.c.await();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        this.b.unlock();
    }
}

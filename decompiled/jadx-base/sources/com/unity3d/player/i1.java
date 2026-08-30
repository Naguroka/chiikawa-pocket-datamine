package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.UnityPlayer f3928a;
    private com.unity3d.player.h1 c;
    private android.content.Context b = null;
    private final java.util.concurrent.Semaphore d = new java.util.concurrent.Semaphore(0);
    private final java.util.concurrent.locks.ReentrantLock e = new java.util.concurrent.locks.ReentrantLock();
    private com.unity3d.player.a1 f = null;
    private int g = 2;
    private boolean h = false;
    private boolean i = false;

    i1(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3928a = null;
        this.f3928a = unityPlayer;
    }

    public final void a() {
        this.e.lock();
        com.unity3d.player.a1 a1Var = this.f;
        if (a1Var != null) {
            a1Var.updateVideoLayout();
        }
        this.e.unlock();
    }

    public final boolean a(android.content.Context context, java.lang.String str, int i, int i2, int i3, boolean z, long j, long j2, com.unity3d.player.h1 h1Var) {
        this.e.lock();
        this.c = h1Var;
        this.b = context;
        this.d.drainPermits();
        this.g = 2;
        runOnUiThread(new com.unity3d.player.d1(this, str, i, i2, i3, z, j, j2));
        boolean z2 = false;
        try {
            this.e.unlock();
            this.d.acquire();
            this.e.lock();
            if (this.g != 2) {
                z2 = true;
            }
        } catch (java.lang.InterruptedException unused) {
        }
        runOnUiThread(new com.unity3d.player.e1(this));
        runOnUiThread((!z2 || this.g == 3) ? new com.unity3d.player.g1(this) : new com.unity3d.player.f1(this));
        this.e.unlock();
        return z2;
    }

    public final void b() {
        this.e.lock();
        com.unity3d.player.a1 a1Var = this.f;
        if (a1Var != null) {
            if (this.g == 0) {
                a1Var.cancelOnPrepare();
            } else if (this.i) {
                boolean zA = a1Var.a();
                this.h = zA;
                if (!zA) {
                    this.f.pause();
                }
            }
        }
        this.e.unlock();
    }

    public final void c() {
        this.e.lock();
        com.unity3d.player.a1 a1Var = this.f;
        if (a1Var != null && this.i && !this.h) {
            a1Var.start();
        }
        this.e.unlock();
    }

    protected void runOnUiThread(java.lang.Runnable runnable) {
        android.content.Context context = this.b;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).runOnUiThread(runnable);
        } else {
            com.unity3d.player.AbstractC1749z.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}

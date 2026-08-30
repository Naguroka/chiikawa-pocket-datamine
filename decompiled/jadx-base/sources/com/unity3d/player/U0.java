package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class U0 extends java.lang.Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.os.Handler f3897a;
    boolean b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    int h;
    final /* synthetic */ com.unity3d.player.UnityPlayer i;

    private U0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.i = unityPlayer;
        this.b = false;
        this.c = false;
        this.d = 2;
        this.e = 0;
        this.h = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.unity3d.player.S0 s0) {
        android.os.Handler handler = this.f3897a;
        if (handler != null) {
            android.os.Message.obtain(handler, 2269, s0).sendToTarget();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("UnityMain");
        android.os.Looper.prepare();
        this.f3897a = new android.os.Handler(android.os.Looper.myLooper(), new com.unity3d.player.T0(this));
        android.os.Looper.loop();
    }
}

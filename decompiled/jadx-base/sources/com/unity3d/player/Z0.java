package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public final class Z0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.a1 f3905a;
    private boolean b = false;

    public Z0(com.unity3d.player.a1 a1Var) {
        this.f3905a = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.lang.Thread.sleep(5000L);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
        if (this.b) {
            return;
        }
        int i = com.unity3d.player.a1.A;
        this.f3905a.cancelOnPrepare();
    }
}

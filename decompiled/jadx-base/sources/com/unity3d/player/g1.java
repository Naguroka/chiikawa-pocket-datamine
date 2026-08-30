package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class g1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.i1 f3923a;

    g1(com.unity3d.player.i1 i1Var) {
        this.f3923a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.i1 i1Var = this.f3923a;
        com.unity3d.player.a1 a1Var = i1Var.f;
        if (a1Var != null) {
            i1Var.f3928a.removeViewFromPlayer(a1Var);
            i1Var.i = false;
            i1Var.f.destroyPlayer();
            i1Var.f = null;
            com.unity3d.player.h1 h1Var = i1Var.c;
            if (h1Var != null) {
                ((com.unity3d.player.A0) h1Var).a();
            }
        }
        this.f3923a.f3928a.onResume();
    }
}

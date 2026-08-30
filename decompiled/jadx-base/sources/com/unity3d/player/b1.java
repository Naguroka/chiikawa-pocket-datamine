package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class b1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.c1 f3911a;

    b1(com.unity3d.player.c1 c1Var) {
        this.f3911a = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.i1 i1Var = this.f3911a.f3913a.h;
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
        this.f3911a.f3913a.h.f3928a.onResume();
    }
}

package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class f1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.i1 f3920a;

    f1(com.unity3d.player.i1 i1Var) {
        this.f3920a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.i1 i1Var = this.f3920a;
        com.unity3d.player.a1 a1Var = i1Var.f;
        if (a1Var != null) {
            i1Var.f3928a.addViewToPlayer(a1Var, true);
            com.unity3d.player.i1 i1Var2 = this.f3920a;
            i1Var2.i = true;
            i1Var2.f.requestFocus();
        }
    }
}

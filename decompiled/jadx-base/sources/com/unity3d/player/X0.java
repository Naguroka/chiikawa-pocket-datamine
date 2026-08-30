package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class X0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.a1 f3902a;

    X0(com.unity3d.player.a1 a1Var) {
        this.f3902a = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3902a.destroyPlayer();
        this.f3902a.a(3);
    }
}

package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class e1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.i1 f3917a;

    e1(com.unity3d.player.i1 i1Var) {
        this.f3917a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3917a.f3928a.onPause();
    }
}

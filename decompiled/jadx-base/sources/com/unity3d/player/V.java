package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class V implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.X f3898a;

    V(com.unity3d.player.X x) {
        this.f3898a = x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3898a.c.requestFocus();
        this.f3898a.f();
    }
}

package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class T implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.U f3894a;

    T(com.unity3d.player.U u) {
        this.f3894a = u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.S s = this.f3894a.d;
        s.a(s.b(), true);
    }
}

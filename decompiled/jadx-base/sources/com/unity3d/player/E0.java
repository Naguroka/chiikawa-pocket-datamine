package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class E0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f3864a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    E0(com.unity3d.player.UnityPlayer unityPlayer, float f) {
        this.b = unityPlayer;
        this.f3864a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.mGlView.a(this.f3864a);
    }
}

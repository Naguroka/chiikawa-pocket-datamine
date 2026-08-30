package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1720k0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3932a;

    RunnableC1720k0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3932a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3932a.nativeResume();
    }
}

package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1718j0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3930a;

    RunnableC1718j0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3930a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3930a.nativeLowMemory();
    }
}

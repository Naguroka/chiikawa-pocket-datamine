package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class K0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3875a;

    K0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3875a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3875a.nativeSendSurfaceChangedEvent();
    }
}

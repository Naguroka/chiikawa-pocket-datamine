package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class C0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3861a;

    C0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3861a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3861a.setupUnityToBePaused();
        this.f3861a.windowFocusChanged(false);
        this.f3861a.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
    }
}

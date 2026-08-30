package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class D0 extends android.view.OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3863a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D0(com.unity3d.player.UnityPlayer unityPlayer, android.content.Context context, int i) {
        super(context, i);
        this.f3863a = unityPlayer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        com.unity3d.player.UnityPlayer unityPlayer = this.f3863a;
        com.unity3d.player.U0 u0 = unityPlayer.m_MainThread;
        u0.f = unityPlayer.mNaturalOrientation;
        u0.g = i;
        u0.a(com.unity3d.player.S0.j);
    }
}

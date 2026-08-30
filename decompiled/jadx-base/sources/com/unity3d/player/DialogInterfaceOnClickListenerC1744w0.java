package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC1744w0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3954a;

    DialogInterfaceOnClickListenerC1744w0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3954a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.f3954a.finish();
    }
}

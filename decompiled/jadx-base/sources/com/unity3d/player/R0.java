package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class R0 extends android.telephony.PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3890a;

    private R0(com.unity3d.player.UnityPlayer unityPlayer) {
        this.f3890a = unityPlayer;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, java.lang.String str) {
        this.f3890a.nativeMuteMasterAudio(i == 1);
    }
}

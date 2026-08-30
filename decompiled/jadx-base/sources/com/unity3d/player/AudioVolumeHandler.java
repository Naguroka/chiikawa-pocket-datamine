package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class AudioVolumeHandler implements com.unity3d.player.InterfaceC1729p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.C1731q f3857a;

    AudioVolumeHandler(android.content.Context context) {
        com.unity3d.player.C1731q c1731q = new com.unity3d.player.C1731q(context);
        this.f3857a = c1731q;
        c1731q.a(this);
    }

    public final void a() {
        this.f3857a.a();
        this.f3857a = null;
    }

    @Override // com.unity3d.player.InterfaceC1729p
    public final native void onAudioVolumeChanged(int i);
}

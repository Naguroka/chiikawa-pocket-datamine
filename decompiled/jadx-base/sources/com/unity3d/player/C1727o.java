package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1727o extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.unity3d.player.InterfaceC1729p f3939a;
    private final android.media.AudioManager b;
    private final int c;
    private int d;

    public C1727o(android.os.Handler handler, android.media.AudioManager audioManager, com.unity3d.player.InterfaceC1729p interfaceC1729p) {
        super(handler);
        this.b = audioManager;
        this.c = 3;
        this.f3939a = interfaceC1729p;
        this.d = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        int streamVolume;
        android.media.AudioManager audioManager = this.b;
        if (audioManager == null || this.f3939a == null || (streamVolume = audioManager.getStreamVolume(this.c)) == this.d) {
            return;
        }
        this.d = streamVolume;
        this.f3939a.onAudioVolumeChanged(streamVolume);
    }
}

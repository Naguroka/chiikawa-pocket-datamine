package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1731q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f3942a;
    private final android.media.AudioManager b;
    private com.unity3d.player.C1727o c;

    public C1731q(android.content.Context context) {
        this.f3942a = context;
        this.b = (android.media.AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.c != null) {
            this.f3942a.getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    public final void a(com.unity3d.player.InterfaceC1729p interfaceC1729p) {
        this.c = new com.unity3d.player.C1727o(new android.os.Handler(android.os.Looper.getMainLooper()), this.b, interfaceC1729p);
        this.f3942a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this.c);
    }
}

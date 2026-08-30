package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1710f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3919a;
    private com.unity3d.player.C1708e0 b;

    public C1710f0(android.content.Context context) {
        this.f3919a = context;
    }

    public final void a() {
        if (this.b != null) {
            this.f3919a.getContentResolver().unregisterContentObserver(this.b);
            this.b = null;
        }
    }

    public final void a(com.unity3d.player.InterfaceC1706d0 interfaceC1706d0) {
        this.b = new com.unity3d.player.C1708e0(new android.os.Handler(android.os.Looper.getMainLooper()), interfaceC1706d0);
        this.f3919a.getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), true, this.b);
    }
}

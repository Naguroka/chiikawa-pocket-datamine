package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1708e0 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.InterfaceC1706d0 f3916a;

    public C1708e0(android.os.Handler handler, com.unity3d.player.InterfaceC1706d0 interfaceC1706d0) {
        super(handler);
        this.f3916a = interfaceC1706d0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        com.unity3d.player.InterfaceC1706d0 interfaceC1706d0 = this.f3916a;
        if (interfaceC1706d0 != null) {
            ((com.unity3d.player.OrientationLockListener) interfaceC1706d0).b();
        }
    }
}

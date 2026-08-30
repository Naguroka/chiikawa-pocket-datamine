package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class OrientationLockListener implements com.unity3d.player.InterfaceC1706d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.C1710f0 f3885a;
    private android.content.Context b;

    OrientationLockListener(android.content.Context context) {
        this.b = context;
        this.f3885a = new com.unity3d.player.C1710f0(context);
        nativeUpdateOrientationLockState(android.provider.Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        this.f3885a.a(this);
    }

    public final void a() {
        this.f3885a.a();
        this.f3885a = null;
    }

    public final void b() {
        nativeUpdateOrientationLockState(android.provider.Settings.System.getInt(this.b.getContentResolver(), "accelerometer_rotation", 0));
    }

    public final native void nativeUpdateOrientationLockState(int i);
}

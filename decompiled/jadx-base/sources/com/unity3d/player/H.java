package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class H implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String[] f3867a;
    final /* synthetic */ com.unity3d.player.PermissionFragment b;

    H(com.unity3d.player.PermissionFragment permissionFragment, java.lang.String[] strArr) {
        this.b = permissionFragment;
        this.f3867a = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.reportAllDenied(this.f3867a);
    }
}

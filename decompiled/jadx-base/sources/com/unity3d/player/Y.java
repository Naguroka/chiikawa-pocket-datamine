package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class Y implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1704c0 f3903a;

    Y(com.unity3d.player.C1704c0 c1704c0) {
        this.f3903a = c1704c0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f3903a.invokeOnClose();
    }
}

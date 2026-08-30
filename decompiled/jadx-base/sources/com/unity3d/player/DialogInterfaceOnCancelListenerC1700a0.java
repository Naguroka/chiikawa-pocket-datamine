package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class DialogInterfaceOnCancelListenerC1700a0 implements android.content.DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.C1704c0 f3908a;

    DialogInterfaceOnCancelListenerC1700a0(com.unity3d.player.C1704c0 c1704c0) {
        this.f3908a = c1704c0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.unity3d.player.F f = this.f3908a.f;
        if (f != null) {
            ((com.unity3d.player.C1722l0) f).a();
        }
    }
}

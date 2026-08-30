package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1705d implements android.window.OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.a.c f3914a;

    C1705d(com.unity3d.player.a.c cVar) {
        this.f3914a = cVar;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        java.lang.Runnable runnable = ((com.unity3d.player.B) this.f3914a).f3858a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

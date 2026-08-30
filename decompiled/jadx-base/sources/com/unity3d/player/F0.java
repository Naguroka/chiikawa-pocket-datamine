package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class F0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f3865a;
    final /* synthetic */ com.unity3d.player.UnityPlayer b;

    F0(com.unity3d.player.UnityPlayer unityPlayer, float f) {
        this.b = unityPlayer;
        this.f3865a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.WindowManager.LayoutParams attributes = this.b.m_Window.getAttributes();
        attributes.screenBrightness = this.f3865a;
        this.b.m_Window.setAttributes(attributes);
    }
}

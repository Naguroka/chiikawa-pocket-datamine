package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
class C {
    protected java.lang.Runnable b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.unity3d.player.a.c f3860a = null;
    protected boolean c = true;

    protected C(java.lang.Runnable runnable) {
        this.b = runnable;
    }

    protected void registerOnBackPressedCallback() {
        if (this.f3860a != null) {
            return;
        }
        this.f3860a = new com.unity3d.player.B(this.b);
    }

    protected void unregisterOnBackPressedCallback() {
        this.f3860a = null;
    }
}

package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class D extends com.unity3d.player.C {
    private android.window.OnBackInvokedCallback d;
    private android.window.OnBackInvokedDispatcher e;
    private int f;

    private D(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i, java.lang.Runnable runnable) {
        super(runnable);
        this.d = null;
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static com.unity3d.player.C a(java.lang.Object obj, int i, java.lang.Runnable runnable) {
        com.unity3d.player.C d = com.unity3d.player.PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof android.app.Activity) || (obj instanceof android.app.Dialog)) ? new com.unity3d.player.D(com.unity3d.player.AbstractC1707e.a(obj), i, runnable) : new com.unity3d.player.C(runnable);
        d.registerOnBackPressedCallback();
        return d;
    }

    @Override // com.unity3d.player.C
    protected void registerOnBackPressedCallback() {
        if (this.f3860a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (com.unity3d.player.PlatformSupport.TIRAMISU_SUPPORT) {
            com.unity3d.player.C1705d c1705d = new com.unity3d.player.C1705d(this.f3860a);
            this.d = c1705d;
            com.unity3d.player.AbstractC1707e.a(this.e, this.f, c1705d);
        }
    }

    @Override // com.unity3d.player.C
    protected void unregisterOnBackPressedCallback() {
        if (this.f3860a != null) {
            if (com.unity3d.player.PlatformSupport.TIRAMISU_SUPPORT) {
                com.unity3d.player.AbstractC1707e.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}

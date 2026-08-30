package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class I implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.IPermissionRequestCallbacks f3871a;
    private java.lang.String b;
    private int c;
    private boolean d;

    I(com.unity3d.player.IPermissionRequestCallbacks iPermissionRequestCallbacks, java.lang.String str, int i, boolean z) {
        this.f3871a = iPermissionRequestCallbacks;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i != -1) {
            if (i == 0) {
                this.f3871a.onPermissionGranted(this.b);
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 30 || this.d) {
            this.f3871a.onPermissionDenied(this.b);
        } else {
            this.f3871a.onPermissionDeniedAndDontAskAgain(this.b);
        }
    }
}

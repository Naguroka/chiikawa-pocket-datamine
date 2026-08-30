package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class c1 implements com.unity3d.player.Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.d1 f3913a;

    c1(com.unity3d.player.d1 d1Var) {
        this.f3913a = d1Var;
    }

    public final void a(int i) {
        this.f3913a.h.e.lock();
        com.unity3d.player.i1 i1Var = this.f3913a.h;
        i1Var.g = i;
        if (i == 3 && i1Var.i) {
            i1Var.runOnUiThread(new com.unity3d.player.b1(this));
        }
        if (i != 0) {
            this.f3913a.h.d.release();
        }
        this.f3913a.h.e.unlock();
    }
}

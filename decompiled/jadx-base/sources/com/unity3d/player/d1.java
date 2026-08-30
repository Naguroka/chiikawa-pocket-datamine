package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class d1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f3915a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ com.unity3d.player.i1 h;

    d1(com.unity3d.player.i1 i1Var, java.lang.String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.h = i1Var;
        this.f3915a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.i1 i1Var = this.h;
        if (i1Var.f != null) {
            com.unity3d.player.AbstractC1749z.Log(5, "Video already playing");
            com.unity3d.player.i1 i1Var2 = this.h;
            i1Var2.g = 2;
            i1Var2.d.release();
            return;
        }
        com.unity3d.player.i1 i1Var3 = this.h;
        i1Var.f = new com.unity3d.player.a1(i1Var3.b, i1Var3.f3928a, this.f3915a, this.b, this.c, this.d, this.e, this.f, this.g, new com.unity3d.player.c1(this));
        com.unity3d.player.i1 i1Var4 = this.h;
        if (i1Var4.f != null) {
            i1Var4.f3928a.bringToFront();
            com.unity3d.player.i1 i1Var5 = this.h;
            i1Var5.f3928a.addView(i1Var5.f);
        }
    }
}

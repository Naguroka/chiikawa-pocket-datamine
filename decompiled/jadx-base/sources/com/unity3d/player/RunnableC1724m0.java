package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1724m0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.UnityPlayer f3936a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ java.lang.String h;
    final /* synthetic */ int i;
    final /* synthetic */ boolean j;
    final /* synthetic */ boolean k;
    final /* synthetic */ java.util.concurrent.Semaphore l;
    final /* synthetic */ com.unity3d.player.UnityPlayer m;

    RunnableC1724m0(com.unity3d.player.UnityPlayer unityPlayer, com.unity3d.player.UnityPlayer unityPlayer2, java.lang.String str, int i, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str2, int i2, boolean z5, boolean z6, java.util.concurrent.Semaphore semaphore) {
        this.m = unityPlayer;
        this.f3936a = unityPlayer2;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
        this.i = i2;
        this.j = z5;
        this.k = z6;
        this.l = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                com.unity3d.player.UnityPlayer unityPlayer = this.m;
                if (unityPlayer.mSoftInput != null) {
                    unityPlayer.dismissSoftInput();
                }
                com.unity3d.player.UnityPlayer unityPlayer2 = this.m;
                int iA = com.unity3d.player.SoftInputProvider.a();
                android.content.Context context = this.m.mContext;
                com.unity3d.player.UnityPlayer unityPlayer3 = this.f3936a;
                unityPlayer2.mSoftInput = com.unity3d.player.a.a.a(iA) != 2 ? new com.unity3d.player.C1704c0(context, unityPlayer3) : new com.unity3d.player.X(context, unityPlayer3);
                this.m.mSoftInput.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                com.unity3d.player.S s = this.m.mSoftInput;
                s.f = new com.unity3d.player.C1722l0(this);
                s.e();
                this.m.nativeReportKeyboardConfigChanged();
            } catch (java.lang.Exception e) {
                com.unity3d.player.AbstractC1749z.Log(6, "Exception when opening Softinput " + e);
            }
        } finally {
            this.l.release();
        }
    }
}

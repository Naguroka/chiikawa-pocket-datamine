package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1730p0 implements com.unity3d.player.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.RunnableC1732q0 f3941a;

    C1730p0(com.unity3d.player.RunnableC1732q0 runnableC1732q0) {
        this.f3941a = runnableC1732q0;
    }

    public final void a() {
        com.unity3d.player.RunnableC1732q0 runnableC1732q0 = this.f3941a;
        runnableC1732q0.f3943a = true;
        if (runnableC1732q0.b) {
            runnableC1732q0.c.release();
        }
    }
}

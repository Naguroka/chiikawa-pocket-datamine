package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class O implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f3883a;
    final long b;

    public O(long j, long j2) {
        this.f3883a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.unity3d.player.ReflectionHelper.beginProxyCall(this.f3883a)) {
            try {
                com.unity3d.player.ReflectionHelper.nativeProxyFinalize(this.b);
            } finally {
                com.unity3d.player.ReflectionHelper.endProxyCall();
            }
        }
    }
}

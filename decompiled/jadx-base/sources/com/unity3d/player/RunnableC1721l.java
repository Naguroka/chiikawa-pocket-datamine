package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1721l implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.IAssetPackManagerStatusQueryCallback f3933a;
    private long b;
    private java.lang.String[] c;
    private int[] d;
    private int[] e;

    RunnableC1721l(com.unity3d.player.IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j, java.lang.String[] strArr, int[] iArr, int[] iArr2) {
        this.f3933a = iAssetPackManagerStatusQueryCallback;
        this.b = j;
        this.c = strArr;
        this.d = iArr;
        this.e = iArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3933a.onStatusResult(this.b, this.c, this.d, this.e);
    }
}

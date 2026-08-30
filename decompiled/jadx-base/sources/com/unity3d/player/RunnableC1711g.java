package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class RunnableC1711g implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Set f3921a;
    private java.lang.String b;
    private int c;
    private long d;
    private long e;
    private int f;
    private int g;

    RunnableC1711g(java.util.Set set, java.lang.String str, int i, long j, long j2, int i2, int i3) {
        this.f3921a = set;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f3921a.iterator();
        while (it.hasNext()) {
            ((com.unity3d.player.IAssetPackManagerDownloadStatusCallback) it.next()).onStatusUpdate(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}

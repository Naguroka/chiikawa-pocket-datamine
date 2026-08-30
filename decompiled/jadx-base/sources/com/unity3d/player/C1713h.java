package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1713h implements com.google.android.play.core.assetpacks.AssetPackStateUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.HashSet f3924a;
    private android.os.Looper b;
    final /* synthetic */ com.unity3d.player.C1725n c;

    public C1713h(com.unity3d.player.C1725n c1725n, com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, android.os.Looper looper) {
        this.c = c1725n;
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f3924a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
        this.b = looper;
    }

    public final synchronized void a(com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.f3924a.add(iAssetPackManagerDownloadStatusCallback);
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(com.google.android.play.core.assetpacks.AssetPackState assetPackState) {
        com.google.android.play.core.assetpacks.AssetPackState assetPackState2 = assetPackState;
        synchronized (this) {
            if (assetPackState2.status() == 4 || assetPackState2.status() == 5 || assetPackState2.status() == 0) {
                synchronized (com.unity3d.player.C1725n.d) {
                    this.c.b.remove(assetPackState2.name());
                    if (this.c.b.isEmpty()) {
                        com.unity3d.player.C1725n c1725n = this.c;
                        c1725n.a(c1725n.c);
                        this.c.c = null;
                    }
                }
            }
            if (this.f3924a.size() != 0) {
                new android.os.Handler(this.b).post(new com.unity3d.player.RunnableC1711g((java.util.Set) this.f3924a.clone(), assetPackState2.name(), assetPackState2.status(), assetPackState2.totalBytesToDownload(), assetPackState2.bytesDownloaded(), assetPackState2.transferProgressPercentage(), assetPackState2.errorCode()));
            }
        }
    }
}

package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1719k implements com.google.android.gms.tasks.OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.IAssetPackManagerDownloadStatusCallback f3931a;
    private android.os.Looper b = android.os.Looper.myLooper();
    private java.lang.String c;

    public C1719k(java.lang.String str, com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.f3931a = iAssetPackManagerDownloadStatusCallback;
        this.c = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        int errorCode;
        try {
            com.google.android.play.core.assetpacks.AssetPackStates assetPackStates = (com.google.android.play.core.assetpacks.AssetPackStates) task.getResult();
            java.util.Map<java.lang.String, com.google.android.play.core.assetpacks.AssetPackState> mapPackStates = assetPackStates.packStates();
            if (mapPackStates.size() == 0) {
                return;
            }
            for (com.google.android.play.core.assetpacks.AssetPackState assetPackState : mapPackStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    java.lang.String strName = assetPackState.name();
                    int iStatus = assetPackState.status();
                    int iErrorCode = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    new android.os.Handler(this.b).post(new com.unity3d.player.RunnableC1711g(java.util.Collections.singleton(this.f3931a), strName, iStatus, j, iStatus == 4 ? j : 0L, 0, iErrorCode));
                } else {
                    com.unity3d.player.C1725n c1725n = com.unity3d.player.C1725n.d;
                    java.lang.String strName2 = assetPackState.name();
                    com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.f3931a;
                    android.os.Looper looper = this.b;
                    c1725n.getClass();
                    synchronized (com.unity3d.player.C1725n.d) {
                        java.lang.Object obj = c1725n.c;
                        if (obj == null) {
                            com.unity3d.player.C1713h c1713h = new com.unity3d.player.C1713h(c1725n, iAssetPackManagerDownloadStatusCallback, looper);
                            c1725n.f3937a.registerListener(c1713h);
                            c1725n.c = c1713h;
                        } else {
                            ((com.unity3d.player.C1713h) obj).a(iAssetPackManagerDownloadStatusCallback);
                        }
                        c1725n.b.add(strName2);
                        c1725n.f3937a.fetch(java.util.Collections.singletonList(strName2));
                    }
                }
            }
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            e = e;
            java.lang.String str = this.c;
            while (true) {
                if (e instanceof com.google.android.play.core.assetpacks.AssetPackException) {
                    errorCode = ((com.google.android.play.core.assetpacks.AssetPackException) e).getErrorCode();
                    break;
                }
                e = e.getCause();
                if (e == null) {
                    errorCode = -100;
                    break;
                }
            }
            new android.os.Handler(this.b).post(new com.unity3d.player.RunnableC1711g(java.util.Collections.singleton(this.f3931a), str, 0, 0L, 0L, 0, errorCode));
        }
    }
}

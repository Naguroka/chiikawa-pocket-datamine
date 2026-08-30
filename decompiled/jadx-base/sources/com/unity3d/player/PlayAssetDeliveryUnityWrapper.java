package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
class PlayAssetDeliveryUnityWrapper {
    private static com.unity3d.player.PlayAssetDeliveryUnityWrapper b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.player.C1725n f3888a;

    private PlayAssetDeliveryUnityWrapper(android.content.Context context) {
        this.f3888a = null;
        if (b != null) {
            throw new java.lang.RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            if (getClass().getClassLoader().loadClass("com.google.android.play.core.assetpacks.AssetPackManager").getMethod("getPackStates", java.util.List.class).getReturnType().getName().equals("com.google.android.gms.tasks.Task")) {
                this.f3888a = a(context);
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.SecurityException unused) {
        }
    }

    private static com.unity3d.player.C1725n a(android.content.Context context) {
        return com.unity3d.player.C1725n.a(context);
    }

    private void a() {
        if (playCoreApiMissing()) {
            throw new java.lang.RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
        }
    }

    public static synchronized com.unity3d.player.PlayAssetDeliveryUnityWrapper getInstance() {
        com.unity3d.player.PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        while (true) {
            playAssetDeliveryUnityWrapper = b;
            if (playAssetDeliveryUnityWrapper != null) {
                break;
            }
            try {
                com.unity3d.player.PlayAssetDeliveryUnityWrapper.class.wait(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            } catch (java.lang.InterruptedException e) {
                com.unity3d.player.AbstractC1749z.Log(6, e.getMessage());
            }
            throw th;
        }
        if (playAssetDeliveryUnityWrapper == null) {
            throw new java.lang.RuntimeException("PlayAssetDeliveryUnityWrapper is not yet initialised.");
        }
        return playAssetDeliveryUnityWrapper;
    }

    public static synchronized com.unity3d.player.PlayAssetDeliveryUnityWrapper init(android.content.Context context) {
        if (b != null) {
            throw new java.lang.RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
        }
        b = new com.unity3d.player.PlayAssetDeliveryUnityWrapper(context);
        com.unity3d.player.PlayAssetDeliveryUnityWrapper.class.notifyAll();
        return b;
    }

    public void cancelAssetPackDownload(java.lang.String str) {
        cancelAssetPackDownloads(new java.lang.String[]{str});
    }

    public void cancelAssetPackDownloads(java.lang.String[] strArr) {
        a();
        this.f3888a.a(strArr);
    }

    public void downloadAssetPack(java.lang.String str, com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new java.lang.String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(java.lang.String[] strArr, com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        this.f3888a.a(strArr, iAssetPackManagerDownloadStatusCallback);
    }

    public java.lang.String getAssetPackPath(java.lang.String str) {
        a();
        return this.f3888a.a(str);
    }

    public void getAssetPackState(java.lang.String str, com.unity3d.player.IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new java.lang.String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(java.lang.String[] strArr, com.unity3d.player.IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        a();
        this.f3888a.a(strArr, iAssetPackManagerStatusQueryCallback);
    }

    public boolean playCoreApiMissing() {
        return this.f3888a == null;
    }

    public java.lang.Object registerDownloadStatusListener(com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        return this.f3888a.a(iAssetPackManagerDownloadStatusCallback);
    }

    public void removeAssetPack(java.lang.String str) {
        a();
        this.f3888a.b(str);
    }

    public void requestToUseMobileData(android.app.Activity activity, com.unity3d.player.IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        a();
        this.f3888a.a(activity, iAssetPackManagerMobileDataConfirmationCallback);
    }

    public void unregisterDownloadStatusListener(java.lang.Object obj) {
        a();
        this.f3888a.a(obj);
    }
}

package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
final class C1725n {
    private static com.unity3d.player.C1725n d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.play.core.assetpacks.AssetPackManager f3937a;
    private java.util.HashSet b;
    private java.lang.Object c;

    private C1725n(android.content.Context context) {
        if (d != null) {
            throw new java.lang.RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.f3937a = com.google.android.play.core.assetpacks.AssetPackManagerFactory.getInstance(context);
        this.b = new java.util.HashSet();
    }

    public static com.unity3d.player.C1725n a(android.content.Context context) {
        if (d == null) {
            d = new com.unity3d.player.C1725n(context);
        }
        return d;
    }

    public final java.lang.Object a(com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        com.unity3d.player.C1713h c1713h = new com.unity3d.player.C1713h(this, iAssetPackManagerDownloadStatusCallback, android.os.Looper.myLooper());
        this.f3937a.registerListener(c1713h);
        return c1713h;
    }

    public final java.lang.String a(java.lang.String str) {
        com.google.android.play.core.assetpacks.AssetPackLocation packLocation = this.f3937a.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    public final void a(android.app.Activity activity, com.unity3d.player.IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f3937a.showCellularDataConfirmation(activity).addOnSuccessListener(new com.unity3d.player.C1717j(iAssetPackManagerMobileDataConfirmationCallback));
    }

    public final void a(java.lang.Object obj) {
        if (obj instanceof com.unity3d.player.C1713h) {
            this.f3937a.unregisterListener((com.unity3d.player.C1713h) obj);
        }
    }

    public final void a(java.lang.String[] strArr) {
        this.f3937a.cancel(java.util.Arrays.asList(strArr));
    }

    public final void a(java.lang.String[] strArr, com.unity3d.player.IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        for (java.lang.String str : strArr) {
            this.f3937a.getPackStates(java.util.Collections.singletonList(str)).addOnCompleteListener(new com.unity3d.player.C1719k(str, iAssetPackManagerDownloadStatusCallback));
        }
    }

    public final void a(java.lang.String[] strArr, com.unity3d.player.IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.f3937a.getPackStates(java.util.Arrays.asList(strArr)).addOnCompleteListener(new com.unity3d.player.C1723m(strArr, iAssetPackManagerStatusQueryCallback));
    }

    public final void b(java.lang.String str) {
        this.f3937a.removePack(str);
    }
}

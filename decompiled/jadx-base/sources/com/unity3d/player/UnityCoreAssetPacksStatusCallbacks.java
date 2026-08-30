package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
class UnityCoreAssetPacksStatusCallbacks implements com.unity3d.player.IAssetPackManagerDownloadStatusCallback, com.unity3d.player.IAssetPackManagerStatusQueryCallback {
    private final native void nativeStatusQueryResult(java.lang.String str, int i, int i2);

    @Override // com.unity3d.player.IAssetPackManagerStatusQueryCallback
    public void onStatusResult(long j, java.lang.String[] strArr, int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr.length; i++) {
            nativeStatusQueryResult(strArr[i], iArr[i], iArr2[i]);
        }
    }

    @Override // com.unity3d.player.IAssetPackManagerDownloadStatusCallback
    public void onStatusUpdate(java.lang.String str, int i, long j, long j2, int i2, int i3) {
        nativeStatusQueryResult(str, i, i3);
    }
}

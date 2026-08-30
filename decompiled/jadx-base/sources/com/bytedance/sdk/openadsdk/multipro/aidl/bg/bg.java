package com.bytedance.sdk.openadsdk.multipro.aidl.bg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bg extends com.bytedance.sdk.openadsdk.IListenerManager.Stub {
    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastDialogListener(java.lang.String str, int i) throws android.os.RemoteException {
    }

    public void broadcastPermissionListener(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
    }

    public void executeAppOpenAdCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.String str4) throws android.os.RemoteException {
    }

    public void registerAppOpenAdListener(java.lang.String str, com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDialogListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonDialogListener iCommonDialogListener) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDisLikeClosedListener(java.lang.String str, com.bytedance.sdk.openadsdk.IDislikeClosedListener iDislikeClosedListener) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerFullVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws android.os.RemoteException {
    }

    public void registerPermissionListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonPermissionListener iCommonPermissionListener) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerRewardVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IRewardAdInteractionListener iRewardAdInteractionListener) throws android.os.RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(java.lang.String str) throws android.os.RemoteException {
    }
}

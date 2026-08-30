package com.bytedance.sdk.openadsdk.multipro.aidl.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg {
    private static volatile com.bytedance.sdk.openadsdk.multipro.aidl.bg.bX IL;
    private static final java.util.HashMap<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.ICommonPermissionListener>> bg = new java.util.HashMap<>();

    public static com.bytedance.sdk.openadsdk.multipro.aidl.bg.bX bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.multipro.aidl.bg.bX.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.multipro.aidl.bg.bX();
                }
            }
        }
        return IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(java.lang.String str, com.bytedance.sdk.openadsdk.ICommonPermissionListener iCommonPermissionListener) throws android.os.RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.ICommonPermissionListener> remoteCallbackList = new android.os.RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        bg.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.ICommonPermissionListener> remoteCallbackListRemove = bg.remove(str);
        if (remoteCallbackListRemove == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            com.bytedance.sdk.openadsdk.ICommonPermissionListener iCommonPermissionListener = (com.bytedance.sdk.openadsdk.ICommonPermissionListener) remoteCallbackListRemove.getBroadcastItem(i);
            if (iCommonPermissionListener != null) {
                if (str2 == null) {
                    iCommonPermissionListener.onGranted();
                } else {
                    iCommonPermissionListener.onDenied(str2);
                }
            }
        }
        remoteCallbackListRemove.finishBroadcast();
        remoteCallbackListRemove.kill();
    }
}

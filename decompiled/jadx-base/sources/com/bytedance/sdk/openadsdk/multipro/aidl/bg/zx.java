package com.bytedance.sdk.openadsdk.multipro.aidl.bg;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg {
    private static volatile com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx IL;
    private static final java.util.Map<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener>> bg = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public static com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.multipro.aidl.bg.zx();
                }
            }
        }
        return IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws android.os.RemoteException {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener> remoteCallbackList = new android.os.RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        bg.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        bg(str, str2);
    }

    private synchronized void bg(java.lang.String str, java.lang.String str2) {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener> remoteCallbackListRemove;
        try {
            java.util.Map<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener>> map = bg;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i);
                            if (iFullScreenVideoAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th2);
        }
    }
}

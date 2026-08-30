package com.bytedance.sdk.openadsdk.multipro.aidl.bg;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg {
    private static volatile com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR IL;
    private static final java.util.Map<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IRewardAdInteractionListener>> bg = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public static com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.multipro.aidl.bg.iR();
                }
            }
        }
        return IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(java.lang.String str, com.bytedance.sdk.openadsdk.IRewardAdInteractionListener iRewardAdInteractionListener) throws android.os.RemoteException {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IRewardAdInteractionListener> remoteCallbackList = new android.os.RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        bg.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.String str4) throws android.os.RemoteException {
        bg(str, str2, z, i, str3, i2, str4);
    }

    private synchronized void bg(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.String str3, int i2, java.lang.String str4) {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IRewardAdInteractionListener> remoteCallbackListRemove;
        try {
            java.util.Map<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IRewardAdInteractionListener>> map = bg;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IRewardAdInteractionListener> remoteCallbackList = remoteCallbackListRemove;
                if (remoteCallbackList != null) {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                        try {
                            com.bytedance.sdk.openadsdk.IRewardAdInteractionListener iRewardAdInteractionListener = (com.bytedance.sdk.openadsdk.IRewardAdInteractionListener) remoteCallbackList.getBroadcastItem(i3);
                            if (iRewardAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iRewardAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iRewardAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iRewardAdInteractionListener.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    iRewardAdInteractionListener.onRewardVerify(z, i, str3, i2, str4);
                                } else if ("recycleRes".equals(str2)) {
                                    iRewardAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "reward1 '" + str2 + "'  throws Exception :", th);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th2);
        }
    }
}

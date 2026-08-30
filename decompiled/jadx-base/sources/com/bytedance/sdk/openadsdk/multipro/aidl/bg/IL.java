package com.bytedance.sdk.openadsdk.multipro.aidl.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg {
    private static volatile com.bytedance.sdk.openadsdk.multipro.aidl.bg.IL IL;
    private static final java.util.Map<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener>> bg = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public static com.bytedance.sdk.openadsdk.multipro.aidl.bg.IL bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.multipro.aidl.bg.IL.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.multipro.aidl.bg.IL();
                }
            }
        }
        return IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(java.lang.String str, com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws android.os.RemoteException {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener> remoteCallbackList = new android.os.RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        bg.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        bg(str, str2);
    }

    private synchronized void bg(java.lang.String str, java.lang.String str2) {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener> remoteCallbackListRemove;
        try {
            java.util.Map<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener>> map = bg;
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
                            com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i);
                            if (iAppOpenAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdShow();
                                } else if (com.json.ju.f.equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdClicked();
                                } else if ("onAdSkip".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdSkip();
                                } else if ("onAdTimeOver".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdTimeOver();
                                } else if ("recycleRes".equals(str2)) {
                                    iAppOpenAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "appOpenAd2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th2);
        }
    }
}

package com.bytedance.sdk.openadsdk.multipro.aidl.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg {
    private static volatile com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN IL;
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IDislikeClosedListener>> bg = new java.util.concurrent.ConcurrentHashMap<>();

    public static com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN bg() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.multipro.aidl.bg.eqN();
                }
            }
        }
        return IL;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(java.lang.String str, com.bytedance.sdk.openadsdk.IDislikeClosedListener iDislikeClosedListener) throws android.os.RemoteException {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IDislikeClosedListener> remoteCallbackList = new android.os.RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        bg.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(java.lang.String str) throws android.os.RemoteException {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        bg.remove(str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        bg(str, str2);
    }

    private synchronized void bg(java.lang.String str, java.lang.String str2) {
        android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IDislikeClosedListener> remoteCallbackList;
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.os.RemoteCallbackList<com.bytedance.sdk.openadsdk.IDislikeClosedListener>> concurrentHashMap = bg;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        com.bytedance.sdk.openadsdk.IDislikeClosedListener iDislikeClosedListener = (com.bytedance.sdk.openadsdk.IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.component.utils.PX.bg("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}

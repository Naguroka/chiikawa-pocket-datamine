package com.unity3d.services.core.cache;

/* JADX INFO: loaded from: classes6.dex */
public class CacheThread extends java.lang.Thread {
    public static final int MSG_DOWNLOAD = 1;
    private static int _connectTimeout = 30000;
    private static com.unity3d.services.core.cache.CacheThreadHandler _handler = null;
    private static int _progressInterval = 0;
    private static int _readTimeout = 30000;
    private static boolean _ready = false;
    private static final java.lang.Object _readyLock = new java.lang.Object();

    private static void init() {
        com.unity3d.services.core.cache.CacheThread cacheThread = new com.unity3d.services.core.cache.CacheThread();
        cacheThread.setName("UnityAdsCacheThread");
        cacheThread.start();
        while (!_ready) {
            try {
                java.lang.Object obj = _readyLock;
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } catch (java.lang.InterruptedException unused) {
                com.unity3d.services.core.log.DeviceLog.debug("Couldn't synchronize thread");
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.os.Looper.prepare();
        _handler = new com.unity3d.services.core.cache.CacheThreadHandler();
        _ready = true;
        java.lang.Object obj = _readyLock;
        synchronized (obj) {
            obj.notifyAll();
        }
        android.os.Looper.loop();
    }

    public static synchronized void download(java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map, boolean z, com.unity3d.services.core.webview.bridge.IEventSender iEventSender) {
        if (!_ready) {
            init();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("source", str);
        bundle.putString(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, str2);
        bundle.putInt("connectTimeout", _connectTimeout);
        bundle.putInt("readTimeout", _readTimeout);
        bundle.putInt("progressInterval", _progressInterval);
        bundle.putBoolean(org.jacoco.core.runtime.AgentOptions.APPEND, z);
        bundle.putSerializable("cacheEventSender", new com.unity3d.services.core.cache.CacheEventSender(iEventSender));
        if (map != null) {
            for (java.lang.String str3 : map.keySet()) {
                bundle.putStringArray(str3, (java.lang.String[]) map.get(str3).toArray(new java.lang.String[map.get(str3).size()]));
            }
        }
        android.os.Message message = new android.os.Message();
        message.what = 1;
        message.setData(bundle);
        _handler.setCancelStatus(false);
        _handler.sendMessage(message);
    }

    public static boolean isActive() {
        if (_ready) {
            return _handler.isActive();
        }
        return false;
    }

    public static void cancel() {
        if (_ready) {
            _handler.removeMessages(1);
            _handler.setCancelStatus(true);
        }
    }

    public static void setProgressInterval(int i) {
        _progressInterval = i;
    }

    public static int getProgressInterval() {
        return _progressInterval;
    }

    public static void setConnectTimeout(int i) {
        _connectTimeout = i;
    }

    public static void setReadTimeout(int i) {
        _readTimeout = i;
    }

    public static int getConnectTimeout() {
        return _connectTimeout;
    }

    public static int getReadTimeout() {
        return _readTimeout;
    }
}

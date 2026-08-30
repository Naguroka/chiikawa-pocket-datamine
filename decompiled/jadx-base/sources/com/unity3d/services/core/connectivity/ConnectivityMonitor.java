package com.unity3d.services.core.connectivity;

/* JADX INFO: loaded from: classes6.dex */
public class ConnectivityMonitor {
    private static int _connected = -1;
    private static java.util.Set<com.unity3d.services.core.connectivity.IConnectivityListener> _listeners = null;
    private static boolean _listening = false;
    private static int _networkType = -1;
    private static boolean _webappMonitoring = false;
    private static boolean _wifi = false;

    public static void setConnectionMonitoring(boolean z) {
        _webappMonitoring = z;
        updateListeningStatus();
    }

    public static void addListener(com.unity3d.services.core.connectivity.IConnectivityListener iConnectivityListener) {
        if (_listeners == null) {
            _listeners = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        }
        _listeners.add(iConnectivityListener);
        updateListeningStatus();
    }

    public static void removeListener(com.unity3d.services.core.connectivity.IConnectivityListener iConnectivityListener) {
        java.util.Set<com.unity3d.services.core.connectivity.IConnectivityListener> set = _listeners;
        if (set == null) {
            return;
        }
        set.remove(iConnectivityListener);
        updateListeningStatus();
    }

    public static void stopAll() {
        _listeners = null;
        _webappMonitoring = false;
        updateListeningStatus();
    }

    private static void updateListeningStatus() {
        java.util.Set<com.unity3d.services.core.connectivity.IConnectivityListener> set;
        if (_webappMonitoring || ((set = _listeners) != null && !set.isEmpty())) {
            startListening();
        } else {
            stopListening();
        }
    }

    private static void startListening() {
        if (_listening) {
            return;
        }
        _listening = true;
        initConnectionStatus();
        com.unity3d.services.core.connectivity.ConnectivityNetworkCallback.register();
    }

    private static void stopListening() {
        if (_listening) {
            _listening = false;
            com.unity3d.services.core.connectivity.ConnectivityNetworkCallback.unregister();
        }
    }

    private static void initConnectionStatus() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            _connected = 1;
            boolean z = activeNetworkInfo.getType() == 1;
            _wifi = z;
            if (z) {
                return;
            }
            try {
                _networkType = ((android.telephony.TelephonyManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
                return;
            } catch (java.lang.SecurityException unused) {
                com.unity3d.services.core.log.DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                return;
            }
        }
        _connected = 0;
    }

    public static void connected() {
        if (_connected == 1) {
            return;
        }
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads connectivity change: connected");
        initConnectionStatus();
        java.util.Set<com.unity3d.services.core.connectivity.IConnectivityListener> set = _listeners;
        if (set != null) {
            java.util.Iterator<com.unity3d.services.core.connectivity.IConnectivityListener> it = set.iterator();
            while (it.hasNext()) {
                it.next().onConnected();
            }
        }
        sendToWebview(com.unity3d.services.core.connectivity.ConnectivityEvent.CONNECTED, _wifi, _networkType);
    }

    public static void disconnected() {
        if (_connected == 0) {
            return;
        }
        _connected = 0;
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads connectivity change: disconnected");
        java.util.Set<com.unity3d.services.core.connectivity.IConnectivityListener> set = _listeners;
        if (set != null) {
            java.util.Iterator<com.unity3d.services.core.connectivity.IConnectivityListener> it = set.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected();
            }
        }
        sendToWebview(com.unity3d.services.core.connectivity.ConnectivityEvent.DISCONNECTED, false, 0);
    }

    public static void connectionStatusChanged() {
        android.net.NetworkInfo activeNetworkInfo;
        int networkType;
        if (_connected == 1 && (activeNetworkInfo = ((android.net.ConnectivityManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            boolean z = activeNetworkInfo.getType() == 1;
            try {
                networkType = ((android.telephony.TelephonyManager) com.unity3d.services.core.properties.ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
            } catch (java.lang.SecurityException unused) {
                com.unity3d.services.core.log.DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                networkType = -1;
            }
            boolean z2 = _wifi;
            if (z == z2 && (networkType == _networkType || z2)) {
                return;
            }
            _wifi = z;
            _networkType = networkType;
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads connectivity change: network change");
            sendToWebview(com.unity3d.services.core.connectivity.ConnectivityEvent.NETWORK_CHANGE, z, networkType);
        }
    }

    private static void sendToWebview(com.unity3d.services.core.connectivity.ConnectivityEvent connectivityEvent, boolean z, int i) {
        com.unity3d.services.core.webview.WebViewApp currentApp;
        if (_webappMonitoring && (currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()) != null && currentApp.isWebAppLoaded()) {
            int i2 = com.unity3d.services.core.connectivity.ConnectivityMonitor.AnonymousClass1.$SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[connectivityEvent.ordinal()];
            if (i2 == 1) {
                if (z) {
                    currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.CONNECTIVITY, com.unity3d.services.core.connectivity.ConnectivityEvent.CONNECTED, java.lang.Boolean.valueOf(z), 0);
                    return;
                } else {
                    currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.CONNECTIVITY, com.unity3d.services.core.connectivity.ConnectivityEvent.CONNECTED, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
                    return;
                }
            }
            if (i2 == 2) {
                currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.CONNECTIVITY, com.unity3d.services.core.connectivity.ConnectivityEvent.DISCONNECTED, new java.lang.Object[0]);
            } else {
                if (i2 != 3) {
                    return;
                }
                if (z) {
                    currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.CONNECTIVITY, com.unity3d.services.core.connectivity.ConnectivityEvent.NETWORK_CHANGE, java.lang.Boolean.valueOf(z), 0);
                } else {
                    currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.CONNECTIVITY, com.unity3d.services.core.connectivity.ConnectivityEvent.NETWORK_CHANGE, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.connectivity.ConnectivityMonitor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent;

        static {
            int[] iArr = new int[com.unity3d.services.core.connectivity.ConnectivityEvent.values().length];
            $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent = iArr;
            try {
                iArr[com.unity3d.services.core.connectivity.ConnectivityEvent.CONNECTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[com.unity3d.services.core.connectivity.ConnectivityEvent.DISCONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[com.unity3d.services.core.connectivity.ConnectivityEvent.NETWORK_CHANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}

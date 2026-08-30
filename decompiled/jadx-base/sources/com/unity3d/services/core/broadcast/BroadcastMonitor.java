package com.unity3d.services.core.broadcast;

/* JADX INFO: loaded from: classes6.dex */
public class BroadcastMonitor {
    private static com.unity3d.services.core.broadcast.BroadcastMonitor _instance;
    private final android.content.Context _context;
    private java.util.Map<java.lang.String, com.unity3d.services.core.broadcast.BroadcastEventReceiver> _eventReceivers;

    public static synchronized com.unity3d.services.core.broadcast.BroadcastMonitor getInstance() {
        if (_instance == null) {
            _instance = new com.unity3d.services.core.broadcast.BroadcastMonitor(com.unity3d.services.core.properties.ClientProperties.getApplicationContext());
        }
        return _instance;
    }

    private BroadcastMonitor(android.content.Context context) {
        this._context = context;
    }

    public void addBroadcastListener(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        removeBroadcastListener(str);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        for (java.lang.String str3 : strArr) {
            intentFilter.addAction(str3);
        }
        if (str2 != null) {
            intentFilter.addDataScheme(str2);
        }
        if (this._eventReceivers == null) {
            this._eventReceivers = new java.util.HashMap();
        }
        com.unity3d.services.core.broadcast.BroadcastEventReceiver broadcastEventReceiver = new com.unity3d.services.core.broadcast.BroadcastEventReceiver(str);
        this._eventReceivers.put(str, broadcastEventReceiver);
        this._context.registerReceiver(broadcastEventReceiver, intentFilter);
    }

    public void removeBroadcastListener(java.lang.String str) {
        java.util.Map<java.lang.String, com.unity3d.services.core.broadcast.BroadcastEventReceiver> map = this._eventReceivers;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this._context.unregisterReceiver(this._eventReceivers.get(str));
        this._eventReceivers.remove(str);
    }

    public void removeAllBroadcastListeners() {
        java.util.Map<java.lang.String, com.unity3d.services.core.broadcast.BroadcastEventReceiver> map = this._eventReceivers;
        if (map != null) {
            java.util.Iterator<java.lang.String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this._context.unregisterReceiver(this._eventReceivers.get(it.next()));
            }
            this._eventReceivers = null;
        }
    }
}

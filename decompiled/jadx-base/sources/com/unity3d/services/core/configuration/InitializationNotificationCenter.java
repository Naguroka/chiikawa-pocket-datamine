package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class InitializationNotificationCenter implements com.unity3d.services.core.configuration.IInitializationNotificationCenter {
    private static com.unity3d.services.core.configuration.InitializationNotificationCenter instance;
    private java.util.HashMap<java.lang.Integer, com.unity3d.services.core.configuration.IInitializationListener> _sdkListeners = new java.util.HashMap<>();

    public static com.unity3d.services.core.configuration.InitializationNotificationCenter getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.core.configuration.InitializationNotificationCenter();
        }
        return instance;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(com.unity3d.services.core.configuration.IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                this._sdkListeners.put(new java.lang.Integer(iInitializationListener.hashCode()), iInitializationListener);
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(com.unity3d.services.core.configuration.IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                removeListener(new java.lang.Integer(iInitializationListener.hashCode()));
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized (this._sdkListeners) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (final java.util.Map.Entry<java.lang.Integer, com.unity3d.services.core.configuration.IInitializationListener> entry : this._sdkListeners.entrySet()) {
                if (entry.getValue() != null) {
                    com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ((com.unity3d.services.core.configuration.IInitializationListener) entry.getValue()).onSdkInitialized();
                        }
                    });
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this._sdkListeners.remove((java.lang.Integer) it.next());
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(java.lang.String str, final com.unity3d.services.core.configuration.ErrorState errorState, final int i) {
        synchronized (this._sdkListeners) {
            final java.lang.String str2 = "SDK Failed to Initialize due to " + str;
            com.unity3d.services.core.log.DeviceLog.error(str2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (final java.util.Map.Entry<java.lang.Integer, com.unity3d.services.core.configuration.IInitializationListener> entry : this._sdkListeners.entrySet()) {
                if (entry.getValue() != null) {
                    com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ((com.unity3d.services.core.configuration.IInitializationListener) entry.getValue()).onSdkInitializationFailed(str2, errorState, i);
                        }
                    });
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this._sdkListeners.remove((java.lang.Integer) it.next());
            }
        }
    }

    private void removeListener(java.lang.Integer num) {
        this._sdkListeners.remove(num);
    }
}

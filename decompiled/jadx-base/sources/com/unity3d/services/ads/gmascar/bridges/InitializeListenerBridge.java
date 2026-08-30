package com.unity3d.services.ads.gmascar.bridges;

/* JADX INFO: loaded from: classes6.dex */
public class InitializeListenerBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String initializationCompleteMethodName = "onInitializationComplete";
    private com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener _initializationStatusListener;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public java.lang.String getClassName() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    public InitializeListenerBridge() {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.1
            {
                try {
                    put(com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.initializationCompleteMethodName, new java.lang.Class[]{java.lang.Class.forName("com.google.android.gms.ads.initialization.InitializationStatus")});
                } catch (java.lang.ClassNotFoundException e) {
                    com.unity3d.services.core.log.DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", e.getLocalizedMessage());
                }
            }
        });
    }

    public void setStatusListener(com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener iInitializationStatusListener) {
        this._initializationStatusListener = iInitializationStatusListener;
    }

    public java.lang.Object createInitializeListenerProxy() {
        try {
            return java.lang.reflect.Proxy.newProxyInstance(classForName().getClassLoader(), new java.lang.Class[]{classForName()}, new java.lang.reflect.InvocationHandler() { // from class: com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.2
                @Override // java.lang.reflect.InvocationHandler
                public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                    if (!method.getName().equals(com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.initializationCompleteMethodName) || com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.this._initializationStatusListener == null) {
                        return null;
                    }
                    com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge.this._initializationStatusListener.onInitializationComplete(objArr[0]);
                    return null;
                }
            });
        } catch (java.lang.Exception unused) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }
}

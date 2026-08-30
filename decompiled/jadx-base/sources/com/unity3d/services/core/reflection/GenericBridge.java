package com.unity3d.services.core.reflection;

/* JADX INFO: loaded from: classes6.dex */
public abstract class GenericBridge {
    private final java.util.Map<java.lang.String, java.lang.Class<?>[]> _functionAndParameters;
    private boolean _methodMapBuilt = false;
    private final java.lang.String _className = getClassName();
    private final java.util.Map<java.lang.String, java.lang.reflect.Method> _methodMap = new java.util.HashMap();

    protected abstract java.lang.String getClassName();

    public GenericBridge(java.util.Map<java.lang.String, java.lang.Class<?>[]> map) {
        this._functionAndParameters = map;
        buildMethodMap();
    }

    public java.util.Map<java.lang.String, java.lang.Class<?>[]> getFunctionMap() {
        return this._functionAndParameters;
    }

    public java.lang.Class<?> classForName() {
        try {
            return java.lang.Class.forName(this._className);
        } catch (java.lang.ClassNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not find Class %s %s", this._className, e.getLocalizedMessage());
            return null;
        }
    }

    public boolean exists() {
        if (classForName() == null) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not find class %s", this._className);
            return false;
        }
        if (!this._methodMapBuilt) {
            buildMethodMap();
        }
        return this._methodMap.size() == getFunctionMap().size();
    }

    private void buildMethodMap() {
        boolean z = true;
        for (java.util.Map.Entry<java.lang.String, java.lang.Class<?>[]> entry : getFunctionMap().entrySet()) {
            java.lang.Class<?>[] value = entry.getValue();
            try {
                java.lang.reflect.Method reflectiveMethod = getReflectiveMethod(classForName(), entry.getKey(), value);
                if (reflectiveMethod != null) {
                    this._methodMap.put(entry.getKey(), reflectiveMethod);
                }
            } catch (java.lang.Exception unused) {
                com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not find %s class with method %s and parameters : %s", this._className, entry.getKey(), value);
                z = false;
            }
        }
        this._methodMapBuilt = z;
    }

    private java.lang.reflect.Method getMethod(java.lang.String str) {
        return this._methodMap.get(str);
    }

    private java.lang.reflect.Method getReflectiveMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not find method %s in %s", str, cls.getName() + " " + e.getLocalizedMessage());
            com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.GMA, com.unity3d.scar.adapter.common.GMAEvent.METHOD_ERROR, new java.lang.Object[0]);
            return null;
        }
    }

    public void callVoidMethod(java.lang.String str, java.lang.Object obj, java.lang.Object... objArr) {
        java.lang.reflect.Method method = getMethod(str);
        if (method == null) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not find method %s", str);
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
        }
    }

    public <T> T callNonVoidMethod(java.lang.String str, java.lang.Object obj, java.lang.Object... objArr) {
        java.lang.reflect.Method method = getMethod(str);
        if (method == null) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not find method %s", str);
            return null;
        }
        try {
            return (T) method.invoke(obj, objArr);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
            return null;
        }
    }
}

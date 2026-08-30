package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewBridge implements com.unity3d.services.core.webview.bridge.IWebViewBridge {
    private static com.unity3d.services.core.webview.bridge.IWebViewBridge _instance;
    private java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.reflect.Method>>> _classTable;
    private final com.unity3d.services.core.webview.bridge.INativeCallbackSubject nativeCallbackSubject;

    public static void setClassTable(java.lang.Class[] clsArr) {
        _instance = new com.unity3d.services.core.webview.bridge.WebViewBridge(clsArr, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppNativeCallbackSubject());
    }

    public static com.unity3d.services.core.webview.bridge.IWebViewBridge getInstance() {
        return _instance;
    }

    private WebViewBridge(java.lang.Class[] clsArr, com.unity3d.services.core.webview.bridge.INativeCallbackSubject iNativeCallbackSubject) {
        java.util.HashMap<java.lang.Integer, java.lang.reflect.Method> map;
        this.nativeCallbackSubject = iNativeCallbackSubject;
        if (clsArr == null) {
            return;
        }
        this._classTable = new java.util.HashMap<>();
        for (java.lang.Class cls : clsArr) {
            if (cls != null && (cls.getPackage().getName().startsWith("com.unity3d.services") || cls.getPackage().getName().startsWith("com.unity3d.ads.test"))) {
                java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.reflect.Method>> map2 = new java.util.HashMap<>();
                for (java.lang.reflect.Method method : cls.getMethods()) {
                    if (method.getAnnotation(com.unity3d.services.core.webview.bridge.WebViewExposed.class) != null) {
                        java.lang.String name = method.getName();
                        if (map2.containsKey(name)) {
                            map = map2.get(name);
                        } else {
                            map = new java.util.HashMap<>();
                        }
                        map.put(java.lang.Integer.valueOf(java.util.Arrays.deepHashCode(method.getParameterTypes())), method);
                        map2.put(name, map);
                    }
                }
                this._classTable.put(cls.getName(), map2);
            }
        }
    }

    private java.lang.reflect.Method findMethod(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) throws org.json.JSONException, java.lang.NoSuchMethodException {
        if (!this._classTable.containsKey(str)) {
            throw new java.lang.NoSuchMethodException();
        }
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Integer, java.lang.reflect.Method>> map = this._classTable.get(str);
        if (!map.containsKey(str2)) {
            throw new java.lang.NoSuchMethodException();
        }
        return map.get(str2).get(java.lang.Integer.valueOf(java.util.Arrays.deepHashCode(getTypes(objArr))));
    }

    private java.lang.Class<?>[] getTypes(java.lang.Object[] objArr) throws org.json.JSONException {
        java.lang.Class<?>[] clsArr = objArr == null ? new java.lang.Class[1] : new java.lang.Class[objArr.length + 1];
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
        }
        clsArr[clsArr.length - 1] = com.unity3d.services.core.webview.bridge.WebViewCallback.class;
        return clsArr;
    }

    private java.lang.Object[] getValues(java.lang.Object[] objArr, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) throws org.json.JSONException {
        java.lang.Object[] objArr2;
        if (objArr != null) {
            objArr2 = new java.lang.Object[objArr.length + (webViewCallback != null ? 1 : 0)];
        } else {
            if (webViewCallback == null) {
                return null;
            }
            objArr2 = new java.lang.Object[1];
        }
        if (objArr != null) {
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        if (webViewCallback != null) {
            objArr2[objArr2.length - 1] = webViewCallback;
        }
        return objArr2;
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
    public void handleInvocation(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) throws java.lang.Exception {
        try {
            try {
                findMethod(str, str2, objArr).invoke(null, getValues(objArr, webViewCallback));
            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException | org.json.JSONException e) {
                if (webViewCallback != null) {
                    webViewCallback.error(com.unity3d.services.core.webview.bridge.WebViewBridgeError.INVOCATION_FAILED, str, str2, objArr, e.getMessage());
                }
                throw e;
            }
        } catch (java.lang.NoSuchMethodException | org.json.JSONException e2) {
            webViewCallback.error(com.unity3d.services.core.webview.bridge.WebViewBridgeError.METHOD_NOT_FOUND, str, str2, objArr);
            throw e2;
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
    public void handleCallback(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) throws java.lang.Exception {
        try {
            this.nativeCallbackSubject.getCallback(str).invoke(str2, getValues(objArr, null));
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException | org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.error("Error while invoking method");
            throw e;
        }
    }
}

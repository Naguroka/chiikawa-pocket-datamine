package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Storage {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void set(java.lang.String str, java.lang.String str2, java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        set(str, str2, (java.lang.Object) num, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void set(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        set(str, str2, (java.lang.Object) bool, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void set(java.lang.String str, java.lang.String str2, java.lang.Long l, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        set(str, str2, (java.lang.Object) l, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void set(java.lang.String str, java.lang.String str2, java.lang.Double d, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        set(str, str2, (java.lang.Object) d, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void set(java.lang.String str, java.lang.String str2, java.lang.String str3, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        set(str, str2, (java.lang.Object) str3, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void set(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        set(str, str2, (java.lang.Object) jSONObject, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void set(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        set(str, str2, (java.lang.Object) jSONArray, webViewCallback);
    }

    public static void set(java.lang.String str, java.lang.String str2, java.lang.Object obj, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.set(str2, obj)) {
                webViewCallback.invoke(str2);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_SET_VALUE, str2);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_STORAGE, str, str2);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void get(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            java.lang.Object obj = storage.get(str2);
            if (obj == null) {
                webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_VALUE, str2);
                return;
            } else {
                webViewCallback.invoke(obj);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_STORAGE, str, str2);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getKeys(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            java.util.List<java.lang.String> keys = storage.getKeys(str2, bool.booleanValue());
            if (keys != null) {
                webViewCallback.invoke(new org.json.JSONArray((java.util.Collection) keys));
                return;
            } else {
                webViewCallback.invoke(new org.json.JSONArray());
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_STORAGE, str, str2);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void read(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            storage.readStorage();
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_STORAGE, str);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void write(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.writeStorage()) {
                webViewCallback.invoke(str);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_WRITE_STORAGE_TO_CACHE, str);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_STORAGE, str);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void clear(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.clearStorage()) {
                webViewCallback.invoke(str);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_CLEAR_STORAGE, str);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_STORAGE, str);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void delete(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.delete(str2)) {
                webViewCallback.invoke(str);
                return;
            } else {
                webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_DELETE_VALUE, str);
                return;
            }
        }
        webViewCallback.error(com.unity3d.services.core.device.StorageError.COULDNT_GET_STORAGE, str);
    }

    private static com.unity3d.services.core.device.Storage getStorage(java.lang.String str) {
        return com.unity3d.services.core.device.StorageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.valueOf(str));
    }
}

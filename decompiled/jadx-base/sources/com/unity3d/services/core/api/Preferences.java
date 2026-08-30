package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Preferences {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void hasKey(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.preferences.AndroidPreferences.hasKey(str, str2)));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getString(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.String string = com.unity3d.services.core.preferences.AndroidPreferences.getString(str, str2);
        if (string != null) {
            webViewCallback.invoke(string);
        } else {
            webViewCallback.error(com.unity3d.services.core.preferences.PreferencesError.COULDNT_GET_VALUE, str, str2);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getInt(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.Integer integer = com.unity3d.services.core.preferences.AndroidPreferences.getInteger(str, str2);
        if (integer != null) {
            webViewCallback.invoke(integer);
        } else {
            webViewCallback.error(com.unity3d.services.core.preferences.PreferencesError.COULDNT_GET_VALUE, str, str2);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getLong(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.Long l = com.unity3d.services.core.preferences.AndroidPreferences.getLong(str, str2);
        if (l != null) {
            webViewCallback.invoke(l);
        } else {
            webViewCallback.error(com.unity3d.services.core.preferences.PreferencesError.COULDNT_GET_VALUE, str, str2);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getBoolean(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.Boolean bool = com.unity3d.services.core.preferences.AndroidPreferences.getBoolean(str, str2);
        if (bool != null) {
            webViewCallback.invoke(bool);
        } else {
            webViewCallback.error(com.unity3d.services.core.preferences.PreferencesError.COULDNT_GET_VALUE, str, str2);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFloat(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        java.lang.Float f = com.unity3d.services.core.preferences.AndroidPreferences.getFloat(str, str2);
        if (f != null) {
            webViewCallback.invoke(f);
        } else {
            webViewCallback.error(com.unity3d.services.core.preferences.PreferencesError.COULDNT_GET_VALUE, str, str2);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setString(java.lang.String str, java.lang.String str2, java.lang.String str3, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.preferences.AndroidPreferences.setString(str, str2, str3);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setInt(java.lang.String str, java.lang.String str2, java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.preferences.AndroidPreferences.setInteger(str, str2, num);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setLong(java.lang.String str, java.lang.String str2, java.lang.Long l, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.preferences.AndroidPreferences.setLong(str, str2, l);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setBoolean(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.preferences.AndroidPreferences.setBoolean(str, str2, bool);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setFloat(java.lang.String str, java.lang.String str2, java.lang.Double d, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.preferences.AndroidPreferences.setFloat(str, str2, d);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void removeKey(java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.preferences.AndroidPreferences.removeKey(str, str2);
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}

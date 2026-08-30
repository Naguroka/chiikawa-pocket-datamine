package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Permissions {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getPermissions(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_CONTEXT_NULL, new java.lang.Object[0]);
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            android.content.Context applicationContext = com.unity3d.services.core.properties.ClientProperties.getApplicationContext();
            android.content.pm.PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (java.lang.String str : packageInfo.requestedPermissions) {
                    jSONArray.put(str);
                }
                webViewCallback.invoke(jSONArray);
                return;
            }
            webViewCallback.error(com.unity3d.services.core.api.PermissionsError.NO_REQUESTED_PERMISSIONS, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            webViewCallback.error(com.unity3d.services.core.api.PermissionsError.COULDNT_GET_PERMISSIONS, e.getMessage());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void checkPermission(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.properties.ClientProperties.getApplicationContext() == null) {
            webViewCallback.error(com.unity3d.services.core.device.DeviceError.APPLICATION_CONTEXT_NULL, new java.lang.Object[0]);
            return;
        }
        try {
            android.content.Context applicationContext = com.unity3d.services.core.properties.ClientProperties.getApplicationContext();
            webViewCallback.invoke(java.lang.Integer.valueOf(applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName())));
        } catch (java.lang.Exception e) {
            webViewCallback.error(com.unity3d.services.core.api.PermissionsError.ERROR_CHECKING_PERMISSION, e.getMessage());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void requestPermissions(org.json.JSONArray jSONArray, java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() == null) {
            webViewCallback.error(com.unity3d.services.ads.adunit.AdUnitError.ADUNIT_NULL, new java.lang.Object[0]);
            return;
        }
        if (jSONArray == null || jSONArray.length() < 1) {
            webViewCallback.error(com.unity3d.services.core.api.PermissionsError.NO_REQUESTED_PERMISSIONS, new java.lang.Object[0]);
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().requestPermissions((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), num.intValue());
            webViewCallback.invoke(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            webViewCallback.error(com.unity3d.services.core.api.PermissionsError.ERROR_REQUESTING_PERMISSIONS, e.getMessage());
        }
    }
}

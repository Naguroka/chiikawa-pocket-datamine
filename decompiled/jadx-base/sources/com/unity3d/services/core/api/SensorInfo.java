package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class SensorInfo {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void startAccelerometerUpdates(java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.sensorinfo.SensorInfoListener.startAccelerometerListener(num.intValue())));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void stopAccelerometerUpdates(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.sensorinfo.SensorInfoListener.stopAccelerometerListener();
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void isAccelerometerActive(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(java.lang.Boolean.valueOf(com.unity3d.services.core.sensorinfo.SensorInfoListener.isAccelerometerListenerActive()));
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getAccelerometerData(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        org.json.JSONObject accelerometerData = com.unity3d.services.core.sensorinfo.SensorInfoListener.getAccelerometerData();
        if (accelerometerData != null) {
            webViewCallback.invoke(accelerometerData);
        } else {
            webViewCallback.error(com.unity3d.services.core.sensorinfo.SensorInfoError.ACCELEROMETER_DATA_NOT_AVAILABLE, new java.lang.Object[0]);
        }
    }
}

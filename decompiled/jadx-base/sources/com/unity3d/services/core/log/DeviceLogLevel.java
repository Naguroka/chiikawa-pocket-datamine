package com.unity3d.services.core.log;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceLogLevel {
    private static final java.lang.String LOG_TAG = "UnityAds";
    private java.lang.String _receivingMethodName;

    public java.lang.String getLogTag() {
        return LOG_TAG;
    }

    public DeviceLogLevel(java.lang.String str) {
        this._receivingMethodName = str;
    }

    public java.lang.String getReceivingMethodName() {
        return this._receivingMethodName;
    }
}

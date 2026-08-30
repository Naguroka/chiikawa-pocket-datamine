package com.unity3d.scar.adapter.common.signals;

/* JADX INFO: loaded from: classes6.dex */
public class SignalsResult {
    private java.util.Map<java.lang.String, java.lang.String> _signalsMap = new java.util.HashMap();
    private java.lang.String _errorMessage = null;

    public void addToSignalsMap(java.lang.String str, java.lang.String str2) {
        this._signalsMap.put(str, str2);
    }

    public java.util.Map<java.lang.String, java.lang.String> getSignalsMap() {
        return this._signalsMap;
    }

    public void setErrorMessage(java.lang.String str) {
        this._errorMessage = str;
    }

    public java.lang.String getErrorMessage() {
        return this._errorMessage;
    }
}

package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public enum InitRequestType {
    PRIVACY("privacy"),
    TOKEN("token_srr");

    private java.lang.String _callType;

    InitRequestType(java.lang.String str) {
        this._callType = str;
    }

    public java.lang.String getCallType() {
        return this._callType;
    }
}

package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewCallback implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.unity3d.services.core.webview.bridge.WebViewCallback> CREATOR = new android.os.Parcelable.Creator<com.unity3d.services.core.webview.bridge.WebViewCallback>() { // from class: com.unity3d.services.core.webview.bridge.WebViewCallback.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.unity3d.services.core.webview.bridge.WebViewCallback createFromParcel(android.os.Parcel parcel) {
            return new com.unity3d.services.core.webview.bridge.WebViewCallback(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.unity3d.services.core.webview.bridge.WebViewCallback[] newArray(int i) {
            return new com.unity3d.services.core.webview.bridge.WebViewCallback[i];
        }
    };
    private java.lang.String _callbackId;
    private int _invocationId;
    private boolean _invoked;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 45678;
    }

    public WebViewCallback(java.lang.String str, int i) {
        this._callbackId = str;
        this._invocationId = i;
    }

    public WebViewCallback(android.os.Parcel parcel) {
        this._callbackId = parcel.readString();
        this._invoked = parcel.readByte() != 0;
        this._invocationId = parcel.readInt();
    }

    public void invoke(java.lang.Object... objArr) {
        invoke(com.unity3d.services.core.webview.bridge.CallbackStatus.OK, null, objArr);
    }

    private void invoke(com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus, java.lang.Enum r4, java.lang.Object... objArr) {
        java.lang.String str;
        if (this._invoked || (str = this._callbackId) == null || str.length() == 0) {
            return;
        }
        this._invoked = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList(objArr));
        arrayList.add(0, this._callbackId);
        com.unity3d.services.core.webview.bridge.Invocation invocationById = com.unity3d.services.core.webview.bridge.Invocation.getInvocationById(this._invocationId);
        if (invocationById == null) {
            com.unity3d.services.core.log.DeviceLog.error("Couldn't get batch with id: " + getInvocationId());
        } else {
            invocationById.setInvocationResponse(callbackStatus, r4, arrayList.toArray());
        }
    }

    public void error(java.lang.Enum r2, java.lang.Object... objArr) {
        invoke(com.unity3d.services.core.webview.bridge.CallbackStatus.ERROR, r2, objArr);
    }

    public int getInvocationId() {
        return this._invocationId;
    }

    public java.lang.String getCallbackId() {
        return this._callbackId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this._callbackId);
        parcel.writeByte(this._invoked ? (byte) 1 : (byte) 0);
        parcel.writeInt(this._invocationId);
    }
}

package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewAdsError implements com.unity3d.scar.adapter.common.IUnityAdsError {
    protected java.lang.String _description;
    protected java.lang.Object[] _errorArguments;
    private java.lang.Enum _errorCategory;

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public int getCode() {
        return -1;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public java.lang.String getDomain() {
        return null;
    }

    public WebViewAdsError(java.lang.Enum<?> r1, java.lang.String str, java.lang.Object... objArr) {
        this._errorCategory = r1;
        this._description = str;
        this._errorArguments = objArr;
    }

    @Override // com.unity3d.scar.adapter.common.IUnityAdsError
    public java.lang.String getDescription() {
        return this._description;
    }

    public java.lang.Enum<?> getErrorCategory() {
        return this._errorCategory;
    }

    public java.lang.Object[] getErrorArguments() {
        return this._errorArguments;
    }
}

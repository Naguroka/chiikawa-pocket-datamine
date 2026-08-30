package com.unity3d.scar.adapter.common.scarads;

/* JADX INFO: loaded from: classes6.dex */
public class ScarAdMetadata {
    private java.lang.String _adString;
    private java.lang.String _adUnitId;
    private java.lang.String _placementId;
    private java.lang.String _queryId;
    private java.lang.Integer _videoLengthMs;

    public ScarAdMetadata(java.lang.String str, java.lang.String str2) {
        this(str, str2, null, null, null);
    }

    public ScarAdMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num) {
        this._placementId = str;
        this._queryId = str2;
        this._adUnitId = str3;
        this._adString = str4;
        this._videoLengthMs = num;
    }

    public java.lang.String getPlacementId() {
        return this._placementId;
    }

    public java.lang.String getQueryId() {
        return this._queryId;
    }

    public java.lang.String getAdUnitId() {
        return this._adUnitId;
    }

    public java.lang.String getAdString() {
        return this._adString;
    }

    public java.lang.Integer getVideoLengthMs() {
        return this._videoLengthMs;
    }
}

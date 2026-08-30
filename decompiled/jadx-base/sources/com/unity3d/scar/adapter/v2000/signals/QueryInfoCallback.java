package com.unity3d.scar.adapter.v2000.signals;

/* JADX INFO: loaded from: classes6.dex */
public class QueryInfoCallback extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    private java.lang.String _placementId;
    private com.unity3d.scar.adapter.common.signals.ISignalCallbackListener _signalCallbackListener;

    public QueryInfoCallback(java.lang.String str, com.unity3d.scar.adapter.common.signals.ISignalCallbackListener iSignalCallbackListener) {
        this._placementId = str;
        this._signalCallbackListener = iSignalCallbackListener;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(com.google.android.gms.ads.query.QueryInfo queryInfo) {
        this._signalCallbackListener.onSuccess(this._placementId, queryInfo.getQuery(), queryInfo);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(java.lang.String str) {
        this._signalCallbackListener.onFailure(str);
    }
}

package com.unity3d.services.ads.gmascar.handlers;

/* JADX INFO: loaded from: classes6.dex */
public class BiddingSignalsHandler implements com.unity3d.scar.adapter.common.signals.ISignalCollectionListener {
    private final boolean isBannerEnabled;
    private final com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener listener;

    public BiddingSignalsHandler(boolean z, com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener iBiddingSignalsListener) {
        this.listener = iBiddingSignalsListener;
        this.isBannerEnabled = z;
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollected(java.lang.String str) {
        this.listener.onSignalsReady(getSignals(str));
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollectionFailed(java.lang.String str) {
        this.listener.onSignalsFailure(str);
    }

    private com.unity3d.services.ads.gmascar.models.BiddingSignals getSignals(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (this.isBannerEnabled) {
                return new com.unity3d.services.ads.gmascar.models.BiddingSignals(getSignalFromJson(jSONObject, com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.SCAR_RV_SIGNAL), getSignalFromJson(jSONObject, com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.SCAR_INT_SIGNAL), getSignalFromJson(jSONObject, com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.SCAR_BAN_SIGNAL));
            }
            return new com.unity3d.services.ads.gmascar.models.BiddingSignals(getSignalFromJson(jSONObject, com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.SCAR_RV_SIGNAL), getSignalFromJson(jSONObject, com.unity3d.scar.adapter.common.signals.SignalsCollectorBase.SCAR_INT_SIGNAL));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private java.lang.String getSignalFromJson(org.json.JSONObject jSONObject, java.lang.String str) {
        return jSONObject.optString(str);
    }
}

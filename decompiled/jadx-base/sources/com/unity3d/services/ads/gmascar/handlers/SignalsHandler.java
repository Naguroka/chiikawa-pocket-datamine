package com.unity3d.services.ads.gmascar.handlers;

/* JADX INFO: loaded from: classes6.dex */
public class SignalsHandler implements com.unity3d.scar.adapter.common.signals.ISignalCollectionListener {
    private com.unity3d.services.ads.gmascar.utils.GMAEventSender _gmaEventSender;

    public SignalsHandler(com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollected(java.lang.String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.SIGNALS, str);
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollectionFailed(java.lang.String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.SIGNALS_ERROR, str);
    }
}

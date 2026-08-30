package com.unity3d.services.ads.gmascar.handlers;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ScarAdHandlerBase implements com.unity3d.scar.adapter.common.IScarAdListenerWrapper {
    protected final com.unity3d.services.core.misc.EventSubject<com.unity3d.scar.adapter.common.GMAEvent> _eventSubject;
    protected final com.unity3d.services.ads.gmascar.utils.GMAEventSender _gmaEventSender;
    protected final com.unity3d.scar.adapter.common.scarads.ScarAdMetadata _scarAdMetadata;

    public ScarAdHandlerBase(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.services.core.misc.EventSubject<com.unity3d.scar.adapter.common.GMAEvent> eventSubject, com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        this._scarAdMetadata = scarAdMetadata;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdLoaded() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED, this._scarAdMetadata.getPlacementId(), this._scarAdMetadata.getQueryId());
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdFailedToLoad(int i, java.lang.String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.LOAD_ERROR, this._scarAdMetadata.getPlacementId(), this._scarAdMetadata.getQueryId(), str, java.lang.Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdOpened() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.AD_STARTED, new java.lang.Object[0]);
        this._eventSubject.subscribe(new com.unity3d.services.core.misc.IEventListener<com.unity3d.scar.adapter.common.GMAEvent>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(com.unity3d.scar.adapter.common.GMAEvent gMAEvent) {
                com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.this._gmaEventSender.send(gMAEvent, new java.lang.Object[0]);
            }
        });
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClicked() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.AD_CLICKED, new java.lang.Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.AD_CLOSED, new java.lang.Object[0]);
        this._eventSubject.unsubscribe();
    }
}

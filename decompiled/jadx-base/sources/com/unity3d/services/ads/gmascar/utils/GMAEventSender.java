package com.unity3d.services.ads.gmascar.utils;

/* JADX INFO: loaded from: classes6.dex */
public class GMAEventSender {
    private final com.unity3d.services.core.webview.bridge.IEventSender _eventSender;

    public GMAEventSender() {
        this(com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public GMAEventSender(com.unity3d.services.core.webview.bridge.IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    public void send(com.unity3d.scar.adapter.common.GMAEvent gMAEvent, java.lang.Object... objArr) {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.GMA, gMAEvent, objArr);
    }

    public void sendVersion(java.lang.String str) {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.INIT_GMA, com.unity3d.scar.adapter.common.GMAEvent.VERSION, str);
    }
}

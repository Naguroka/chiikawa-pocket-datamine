package com.unity3d.services.ads.operation;

/* JADX INFO: loaded from: classes6.dex */
public class OperationState implements com.unity3d.services.core.webview.bridge.IWebViewSharedObject {
    private static java.lang.String _emptyPlacementId = "";
    public com.unity3d.services.core.configuration.Configuration configuration;
    public java.lang.String id;
    public java.lang.String placementId;
    public long startTime;
    public com.unity3d.services.core.timer.BaseTimer timeoutTimer;

    public OperationState(java.lang.String str, com.unity3d.services.core.configuration.Configuration configuration) {
        this.placementId = str == null ? _emptyPlacementId : str;
        this.configuration = configuration;
        this.id = java.util.UUID.randomUUID().toString();
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public java.lang.String getId() {
        return this.id;
    }

    public void start() {
        this.startTime = java.lang.System.nanoTime();
    }

    public long duration() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this.startTime);
    }
}

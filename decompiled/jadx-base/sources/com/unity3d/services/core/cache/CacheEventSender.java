package com.unity3d.services.core.cache;

/* JADX INFO: compiled from: CacheEventSender.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/cache/CacheEventSender;", "Ljava/io/Serializable;", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "sendEvent", "", "eventId", "Lcom/unity3d/services/core/cache/CacheEvent;", "params", "", "", "(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheEventSender implements java.io.Serializable {
    private final com.unity3d.services.core.webview.bridge.IEventSender eventSender;

    public CacheEventSender(com.unity3d.services.core.webview.bridge.IEventSender eventSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final boolean sendEvent(com.unity3d.services.core.cache.CacheEvent eventId, java.lang.Object... params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventId, "eventId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        return this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.CACHE, eventId, java.util.Arrays.copyOf(params, params.length));
    }
}

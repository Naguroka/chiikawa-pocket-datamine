package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: IEventSender.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J9\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/core/webview/bridge/IEventSender;", "", "canSend", "", "sendEvent", "eventCategory", "", "eventId", "params", "", "(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(java.lang.Enum<?> eventCategory, java.lang.Enum<?> eventId, java.lang.Object... params);
}

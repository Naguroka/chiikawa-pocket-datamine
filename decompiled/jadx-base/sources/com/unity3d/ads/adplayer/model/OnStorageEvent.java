package com.unity3d.ads.adplayer.model;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/adplayer/model/OnStorageEvent;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "eventType", "Lcom/unity3d/services/core/device/StorageEvent;", "storageType", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "value", "", "(Lcom/unity3d/services/core/device/StorageEvent;Lcom/unity3d/services/core/device/StorageManager$StorageType;Ljava/lang/Object;)V", "category", "", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnStorageEvent implements com.unity3d.ads.adplayer.model.WebViewEvent {
    private final java.lang.String category;
    private final java.lang.String name;
    private final java.lang.Object[] parameters;

    public OnStorageEvent(com.unity3d.services.core.device.StorageEvent eventType, com.unity3d.services.core.device.StorageManager.StorageType storageType, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.category = "STORAGE";
        this.name = eventType.name();
        this.parameters = new java.lang.Object[]{storageType.name(), obj};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public java.lang.String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public java.lang.Object[] getParameters() {
        return this.parameters;
    }
}

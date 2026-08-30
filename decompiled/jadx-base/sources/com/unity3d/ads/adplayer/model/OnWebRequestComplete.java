package com.unity3d.ads.adplayer.model;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/adplayer/model/OnWebRequestComplete;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "value", "", "", "(Ljava/util/List;)V", "category", "", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnWebRequestComplete implements com.unity3d.ads.adplayer.model.WebViewEvent {
    private final java.lang.String category;
    private final java.lang.String name;
    private final java.lang.Object[] parameters;

    public OnWebRequestComplete(java.util.List<? extends java.lang.Object> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.category = "REQUEST";
        this.name = "COMPLETE";
        this.parameters = value.toArray(new java.lang.Object[0]);
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

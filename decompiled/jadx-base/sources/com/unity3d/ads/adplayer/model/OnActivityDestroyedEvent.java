package com.unity3d.ads.adplayer.model;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/adplayer/model/OnActivityDestroyedEvent;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "()V", "category", "", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnActivityDestroyedEvent implements com.unity3d.ads.adplayer.model.WebViewEvent {
    private final java.lang.String category = "ADVIEWER";
    private final java.lang.String name = "ON_ACTIVITY_DESTROY";
    private final java.lang.Object[] parameters = new java.lang.Object[0];

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

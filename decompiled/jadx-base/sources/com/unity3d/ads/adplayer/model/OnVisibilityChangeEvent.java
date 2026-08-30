package com.unity3d.ads.adplayer.model;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/adplayer/model/OnVisibilityChangeEvent;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", com.json.pg.k, "", "(Z)V", "category", "", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnVisibilityChangeEvent implements com.unity3d.ads.adplayer.model.WebViewEvent {
    private final java.lang.String category = "ADVIEWER";
    private final java.lang.String name = "ON_VISIBILITY_CHANGE";
    private final java.lang.Object[] parameters;

    public OnVisibilityChangeEvent(boolean z) {
        this.parameters = new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
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

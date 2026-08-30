package com.unity3d.ads.adplayer.model;

/* JADX INFO: compiled from: WebViewEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/adplayer/model/OnPrivacyFsmChangeEvent;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "value", "", "(Ljava/lang/String;)V", "category", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnPrivacyFsmChangeEvent implements com.unity3d.ads.adplayer.model.WebViewEvent {
    private final java.lang.String category;
    private final java.lang.String name;
    private final java.lang.Object[] parameters;

    public OnPrivacyFsmChangeEvent(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.category = "ADVIEWER";
        this.name = "ON_PRIVACY_FSM_CHANGE";
        this.parameters = new java.lang.Object[]{value};
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

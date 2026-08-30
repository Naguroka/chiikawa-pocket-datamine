package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: AdPlayerError.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/LoadWebViewError;", "Lcom/unity3d/ads/adplayer/AdPlayerError;", "errors", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoadWebViewError extends com.unity3d.ads.adplayer.AdPlayerError {
    private final java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> errors) {
        super("AdPlayer was not able to load the webview.", null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "errors");
        this.errors = errors;
    }

    public final java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> getErrors() {
        return this.errors;
    }
}

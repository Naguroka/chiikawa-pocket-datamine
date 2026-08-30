package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: AndroidWebViewClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0001-B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0017J \u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u0004\u0018\u00010(2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "getWebViewAssetLoader", "Lcom/unity3d/ads/adplayer/GetWebViewCacheAssetLoader;", "getAdAssetLoader", "Lcom/unity3d/ads/adplayer/GetAdAssetLoader;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "(Lcom/unity3d/ads/adplayer/GetWebViewCacheAssetLoader;Lcom/unity3d/ads/adplayer/GetAdAssetLoader;Lcom/unity3d/ads/core/domain/GetCachedAsset;)V", "_isRenderProcessGone", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_onLoadFinished", "Lkotlinx/coroutines/CompletableDeferred;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "adAssetLoader", "Landroidx/webkit/WebViewAssetLoader;", "isRenderProcessGone", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loadErrors", "onLoadFinished", "Lkotlinx/coroutines/Deferred;", "getOnLoadFinished", "()Lkotlinx/coroutines/Deferred;", "webViewAssetLoader", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroidx/webkit/WebResourceErrorCompat;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "shouldInterceptRequest", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidWebViewClient extends androidx.webkit.WebViewClientCompat {
    public static final java.lang.String BLANK_PAGE = "about:blank";
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isRenderProcessGone;
    private final kotlinx.coroutines.CompletableDeferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> _onLoadFinished;
    private final androidx.webkit.WebViewAssetLoader adAssetLoader;
    private final com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isRenderProcessGone;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> loadErrors;
    private final kotlinx.coroutines.Deferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> onLoadFinished;
    private final androidx.webkit.WebViewAssetLoader webViewAssetLoader;

    public AndroidWebViewClient(com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader getWebViewAssetLoader, com.unity3d.ads.adplayer.GetAdAssetLoader getAdAssetLoader, com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWebViewAssetLoader, "getWebViewAssetLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdAssetLoader, "getAdAssetLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        this.getCachedAsset = getCachedAsset;
        this.webViewAssetLoader = getWebViewAssetLoader.invoke();
        this.adAssetLoader = getAdAssetLoader.invoke();
        this.loadErrors = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        kotlinx.coroutines.CompletableDeferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> completableDeferredCompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this._onLoadFinished = completableDeferredCompletableDeferred$default;
        this.onLoadFinished = completableDeferredCompletableDeferred$default;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this._isRenderProcessGone = MutableStateFlow;
        this.isRenderProcessGone = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.Deferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (kotlin.jvm.internal.Intrinsics.areEqual(url, BLANK_PAGE)) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> mutableStateFlow = this.loadErrors;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.unity3d.ads.adplayer.model.WebViewClientError>) value, new com.unity3d.ads.adplayer.model.WebViewClientError(url, com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_BLANK, null, 4, null))));
        }
        super.onPageFinished(view, url);
        this._onLoadFinished.complete(this.loadErrors.getValue());
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, androidx.webkit.WebResourceErrorCompat error) {
        com.unity3d.ads.adplayer.model.ErrorReason errorReasonWebResourceToErrorReason;
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(view, request, error);
        if (androidx.webkit.WebViewFeature.isFeatureSupported("WEB_RESOURCE_ERROR_GET_CODE")) {
            errorReasonWebResourceToErrorReason = com.unity3d.ads.core.extensions.IntExtensionKt.webResourceToErrorReason(error.getErrorCode());
        } else {
            errorReasonWebResourceToErrorReason = com.unity3d.ads.adplayer.model.ErrorReason.REASON_UNKNOWN;
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.unity3d.ads.adplayer.model.WebViewClientError>) value, new com.unity3d.ads.adplayer.model.WebViewClientError(request.getUrl().toString(), errorReasonWebResourceToErrorReason, null, 4, null))));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        com.unity3d.ads.adplayer.model.WebViewClientError webViewClientError = new com.unity3d.ads.adplayer.model.WebViewClientError(request.getUrl().toString(), com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_RECEIVED_HTTP, java.lang.Integer.valueOf(errorResponse.getStatusCode()));
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> mutableStateFlow = this.loadErrors;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.unity3d.ads.adplayer.model.WebViewClientError>) value, webViewClientError)));
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        android.net.Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(url.getLastPathSegment(), "favicon.ico")) {
            return new android.webkit.WebResourceResponse(androidx.media3.common.MimeTypes.IMAGE_PNG, null, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(url.getScheme(), com.unity3d.services.UnityAdsConstants.Cache.CACHE_SCHEME)) {
            com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset = this.getCachedAsset;
            android.net.Uri url2 = request.getUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url2, "request.url");
            return getCachedAsset.invoke(url2);
        }
        java.lang.String host = url.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -598289184) {
                if (iHashCode == 380656434 && host.equals(com.unity3d.services.UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN)) {
                    return this.webViewAssetLoader.shouldInterceptRequest(url);
                }
            } else if (host.equals("cdn-creatives-cf-prd.acquire.unity3dusercontent.com")) {
                return this.adAssetLoader.shouldInterceptRequest(url);
            }
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail detail) {
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        com.unity3d.ads.core.extensions.ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (!this._onLoadFinished.isCompleted()) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> mutableStateFlow = this.loadErrors;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.unity3d.ads.adplayer.model.WebViewClientError>) value, new com.unity3d.ads.adplayer.model.WebViewClientError(java.lang.String.valueOf(view.getUrl()), com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            this._onLoadFinished.complete(this.loadErrors.getValue());
        } else {
            this._isRenderProcessGone.setValue(true);
        }
        return true;
    }
}

package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: GetWebViewAssetLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"guessMimeType", "", com.ironsource.rc.c.c, "provideGetWebViewCacheAssetLoader", "Lcom/unity3d/ads/adplayer/GetWebViewCacheAssetLoader;", "context", "Landroid/content/Context;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GetWebViewAssetLoaderKt {
    public static final com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader provideGetWebViewCacheAssetLoader(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader() { // from class: com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final androidx.webkit.WebViewAssetLoader invoke() {
                return com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt.provideGetWebViewCacheAssetLoader$lambda$1(context);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.webkit.WebViewAssetLoader provideGetWebViewCacheAssetLoader$lambda$1(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        androidx.webkit.WebViewAssetLoader webViewAssetLoaderBuild = new androidx.webkit.WebViewAssetLoader.Builder().addPathHandler(com.unity3d.services.UnityAdsConstants.DefaultUrls.WEBVIEW_ASSET_PATH, new androidx.webkit.WebViewAssetLoader.PathHandler() { // from class: com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt$$ExternalSyntheticLambda1
            @Override // androidx.webkit.WebViewAssetLoader.PathHandler
            public final android.webkit.WebResourceResponse handle(java.lang.String str) {
                return com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt.provideGetWebViewCacheAssetLoader$lambda$1$lambda$0(context, str);
            }
        }).setDomain(com.unity3d.services.UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, "Builder()\n        .addPa…_DOMAIN)\n        .build()");
        return webViewAssetLoaderBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.webkit.WebResourceResponse provideGetWebViewCacheAssetLoader$lambda$1$lambda$0(android.content.Context context, java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        try {
            java.io.InputStream inputStreamOpen = context.getAssets().open(path);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(path)");
            return new android.webkit.WebResourceResponse(guessMimeType(path), null, inputStreamOpen);
        } catch (java.lang.Exception unused) {
            com.unity3d.services.core.log.DeviceLog.debug("Webview Asset not found: %s", path);
            return null;
        }
    }

    public static final java.lang.String guessMimeType(java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "filePath");
        java.lang.String strGuessContentTypeFromName = java.net.URLConnection.guessContentTypeFromName(filePath);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strGuessContentTypeFromName, "guessContentTypeFromName(filePath)");
        return strGuessContentTypeFromName;
    }
}

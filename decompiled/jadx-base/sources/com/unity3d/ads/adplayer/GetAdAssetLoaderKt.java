package com.unity3d.ads.adplayer;

/* JADX INFO: compiled from: GetAdAssetLoader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"provideGetAdCacheAssetLoader", "Lcom/unity3d/ads/adplayer/GetAdAssetLoader;", "context", "Landroid/content/Context;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GetAdAssetLoaderKt {
    public static final com.unity3d.ads.adplayer.GetAdAssetLoader provideGetAdCacheAssetLoader(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new com.unity3d.ads.adplayer.GetAdAssetLoader() { // from class: com.unity3d.ads.adplayer.GetAdAssetLoaderKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final androidx.webkit.WebViewAssetLoader invoke() {
                return com.unity3d.ads.adplayer.GetAdAssetLoaderKt.provideGetAdCacheAssetLoader$lambda$1(context);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.webkit.WebViewAssetLoader provideGetAdCacheAssetLoader$lambda$1(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        androidx.webkit.WebViewAssetLoader webViewAssetLoaderBuild = new androidx.webkit.WebViewAssetLoader.Builder().addPathHandler("/", new androidx.webkit.WebViewAssetLoader.PathHandler() { // from class: com.unity3d.ads.adplayer.GetAdAssetLoaderKt$$ExternalSyntheticLambda0
            @Override // androidx.webkit.WebViewAssetLoader.PathHandler
            public final android.webkit.WebResourceResponse handle(java.lang.String str) {
                return com.unity3d.ads.adplayer.GetAdAssetLoaderKt.provideGetAdCacheAssetLoader$lambda$1$lambda$0(context, str);
            }
        }).setDomain("cdn-creatives-cf-prd.acquire.unity3dusercontent.com").build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, "Builder()\n        .addPa…_DOMAIN)\n        .build()");
        return webViewAssetLoaderBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.webkit.WebResourceResponse provideGetAdCacheAssetLoader$lambda$1$lambda$0(android.content.Context context, java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new android.webkit.WebResourceResponse(com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt.guessMimeType(path), null, new java.io.FileInputStream(new java.io.File(context.getFilesDir(), "unityads/" + path)));
        } catch (java.lang.Exception unused) {
            com.unity3d.services.core.log.DeviceLog.debug("Ad Asset not found: %s", path);
            return null;
        }
    }
}

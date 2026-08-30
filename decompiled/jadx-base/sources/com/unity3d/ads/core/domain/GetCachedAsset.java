package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: GetCachedAsset.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0013\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "context", "Landroid/content/Context;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Landroid/content/Context;)V", "getBundledAsset", "Landroid/webkit/WebResourceResponse;", "uri", "Landroid/net/Uri;", "getCachedAsset", "invoke", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetCachedAsset {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final android.content.Context context;

    public GetCachedAsset(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.cacheRepository = cacheRepository;
        this.context = context;
    }

    public final android.webkit.WebResourceResponse invoke(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        java.lang.String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(com.unity3d.services.UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(com.unity3d.services.UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return null;
    }

    private final android.webkit.WebResourceResponse getBundledAsset(android.net.Uri uri) {
        java.lang.String strSubstringAfter$default = kotlin.text.StringsKt.substringAfter$default(java.lang.String.valueOf(uri.getPath()), "/", (java.lang.String) null, 2, (java.lang.Object) null);
        try {
            java.io.InputStream inputStreamOpen = this.context.getAssets().open(strSubstringAfter$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(fileName)");
            return new android.webkit.WebResourceResponse(com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt.guessMimeType(strSubstringAfter$default), null, inputStreamOpen);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private final android.webkit.WebResourceResponse getCachedAsset(android.net.Uri uri) {
        java.lang.String string = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        com.unity3d.ads.core.data.model.CacheResult cacheResultRetrieveFile = this.cacheRepository.retrieveFile(kotlin.text.StringsKt.substringBeforeLast$default(kotlin.text.StringsKt.substringAfterLast$default(string, "/", (java.lang.String) null, 2, (java.lang.Object) null), ".", (java.lang.String) null, 2, (java.lang.Object) null));
        if (!(cacheResultRetrieveFile instanceof com.unity3d.ads.core.data.model.CacheResult.Success)) {
            return null;
        }
        com.unity3d.ads.core.data.model.CacheResult.Success success = (com.unity3d.ads.core.data.model.CacheResult.Success) cacheResultRetrieveFile;
        java.io.File file = success.getCachedFile().getFile();
        if (file == null) {
            return null;
        }
        return new android.webkit.WebResourceResponse(com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt.guessMimeType(file.getAbsolutePath() + '.' + success.getCachedFile().getExtension()), null, new java.io.FileInputStream(file));
    }
}

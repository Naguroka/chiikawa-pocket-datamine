package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcgg extends com.google.android.gms.internal.ads.zzcgf {
    public zzcgg(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, boolean z, com.google.android.gms.internal.ads.zzebv zzebvVar) {
        super(zzcexVar, zzbbjVar, z, zzebvVar);
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzW(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}

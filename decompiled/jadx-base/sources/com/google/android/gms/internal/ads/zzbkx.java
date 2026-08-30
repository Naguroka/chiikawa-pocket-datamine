package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkx extends com.google.android.gms.internal.ads.zzbkk {
    public static final /* synthetic */ int zza = 0;
    private android.webkit.WebViewClient zzb;
    private final com.google.android.gms.ads.h5.H5AdsRequestHandler zzc;
    private final android.webkit.WebView zzd;

    public zzbkx(android.content.Context context, final android.webkit.WebView webView) {
        context.getClass();
        webView.getClass();
        com.google.android.gms.internal.ads.zzfun.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new com.google.android.gms.ads.h5.H5AdsRequestHandler(context, new com.google.android.gms.ads.h5.OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbkw
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(java.lang.String str) {
                int i = com.google.android.gms.internal.ads.zzbkx.zza;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(android.webkit.WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    public final android.webkit.WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        if (zzc(webView) && !this.zzc.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(android.webkit.WebViewClient webViewClient) {
        com.google.android.gms.internal.ads.zzfun.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (!zzc(webView)) {
            return false;
        }
        if (this.zzc.handleH5AdsRequest(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}

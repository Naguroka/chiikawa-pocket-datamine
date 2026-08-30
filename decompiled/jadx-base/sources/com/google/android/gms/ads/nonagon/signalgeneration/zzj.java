package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzj extends com.google.android.gms.internal.ads.zzbkk {
    private final android.webkit.WebView zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzb;
    private final java.util.concurrent.Executor zzc;
    private android.webkit.WebViewClient zzd;

    public zzj(android.webkit.WebView webView, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = webView;
        this.zzb = zzfVar;
        this.zzc = zzgcsVar;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(java.lang.String.format(java.util.Locale.getDefault(), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjF), this.zzb.zza()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    protected final android.webkit.WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        zzc();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkk, android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        zzc();
        super.onPageStarted(webView, str, bitmap);
    }

    final /* synthetic */ void zza() {
        android.webkit.WebViewClient webViewClient;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            android.webkit.WebView webView = this.zza;
            if (android.os.Build.VERSION.SDK_INT < 26) {
                if (androidx.webkit.WebViewFeature.isFeatureSupported("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClient = androidx.webkit.WebViewCompat.getWebViewClient(webView);
                    } catch (java.lang.RuntimeException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getWebViewClient");
                    }
                }
                throw new java.lang.IllegalStateException("getWebViewClient not supported");
            }
            webViewClient = webView.getWebViewClient();
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.zzd = webViewClient;
            }
            this.zza.setWebViewClient(this);
            zzc();
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public final void zzb() {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza();
            }
        });
    }
}

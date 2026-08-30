package com.google.android.gms.ads.h5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class H5AdsWebViewClient extends com.google.android.gms.internal.ads.zzbkk {
    private final com.google.android.gms.internal.ads.zzbkx zza;

    public H5AdsWebViewClient(android.content.Context context, android.webkit.WebView webView) {
        this.zza = new com.google.android.gms.internal.ads.zzbkx(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    protected android.webkit.WebViewClient getDelegate() {
        return this.zza;
    }

    public android.webkit.WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(android.webkit.WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}

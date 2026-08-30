package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfmc extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfme zza;

    zzfmc(com.google.android.gms.internal.ads.zzfme zzfmeVar) {
        this.zza = zzfmeVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        android.util.Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + java.lang.String.valueOf(webView));
        if (this.zza.zza() == webView) {
            android.util.Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.zza.zzn(null);
        }
        webView.destroy();
        return true;
    }
}

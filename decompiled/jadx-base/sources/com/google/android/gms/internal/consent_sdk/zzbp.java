package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbp extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzbr zza;

    /* synthetic */ zzbp(com.google.android.gms.internal.consent_sdk.zzbr zzbrVar, com.google.android.gms.internal.consent_sdk.zzbq zzbqVar) {
        this.zza = zzbrVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        if (com.google.android.gms.internal.consent_sdk.zzbr.zzf(this.zza, str)) {
            this.zza.zzb.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        if (this.zza.zzc) {
            return;
        }
        android.util.Log.d("UserMessagingPlatform", "Wall html loaded.");
        this.zza.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        this.zza.zzb.zzf(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String string = webResourceRequest.getUrl().toString();
        if (!com.google.android.gms.internal.consent_sdk.zzbr.zzf(this.zza, string)) {
            return false;
        }
        this.zza.zzb.zze(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (!com.google.android.gms.internal.consent_sdk.zzbr.zzf(this.zza, str)) {
            return false;
        }
        this.zza.zzb.zze(str);
        return true;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzazh implements java.lang.Runnable {
    final android.webkit.ValueCallback zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzayz zzb;
    final /* synthetic */ android.webkit.WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzazj zze;

    zzazh(com.google.android.gms.internal.ads.zzazj zzazjVar, final com.google.android.gms.internal.ads.zzayz zzayzVar, final android.webkit.WebView webView, final boolean z) {
        this.zzb = zzayzVar;
        this.zzc = webView;
        this.zzd = z;
        this.zze = zzazjVar;
        this.zza = new android.webkit.ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazg
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                this.zza.zze.zzc(zzayzVar, webView, (java.lang.String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (java.lang.Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}

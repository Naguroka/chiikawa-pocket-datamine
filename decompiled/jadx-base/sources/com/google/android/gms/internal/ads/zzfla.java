package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfla {
    private final com.google.android.gms.internal.ads.zzflc zza;
    private final android.webkit.WebView zzb;
    private com.google.android.gms.internal.ads.zzfnb zzc;
    private final java.util.HashMap zzd;
    private final com.google.android.gms.internal.ads.zzflo zze;

    private zzfla(com.google.android.gms.internal.ads.zzflc zzflcVar, android.webkit.WebView webView, boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        this.zzd = map;
        this.zze = new com.google.android.gms.internal.ads.zzflo();
        com.google.android.gms.internal.ads.zzfmk.zza();
        this.zza = zzflcVar;
        this.zzb = webView;
        if (zza() != webView) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzfkp) it.next()).zzd(webView);
            }
            this.zzc = new com.google.android.gms.internal.ads.zzfnb(webView);
        }
        if (!androidx.webkit.WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new java.lang.UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zzh();
        androidx.webkit.WebViewCompat.addWebMessageListener(this.zzb, "omidJsSessionService", new java.util.HashSet(java.util.Arrays.asList(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES)), new com.google.android.gms.internal.ads.zzfkz(this));
    }

    public static com.google.android.gms.internal.ads.zzfla zzb(com.google.android.gms.internal.ads.zzflc zzflcVar, android.webkit.WebView webView, boolean z) {
        return new com.google.android.gms.internal.ads.zzfla(zzflcVar, webView, true);
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzfla zzflaVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzfkp zzfkpVar = (com.google.android.gms.internal.ads.zzfkp) zzflaVar.zzd.get(str);
        if (zzfkpVar != null) {
            zzfkpVar.zzc();
            zzflaVar.zzd.remove(str);
        }
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzfla zzflaVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzfkt zzfktVar = new com.google.android.gms.internal.ads.zzfkt(com.google.android.gms.internal.ads.zzfkq.zza(com.google.android.gms.internal.ads.zzfku.DEFINED_BY_JAVASCRIPT, com.google.android.gms.internal.ads.zzfkx.DEFINED_BY_JAVASCRIPT, com.google.android.gms.internal.ads.zzflb.JAVASCRIPT, com.google.android.gms.internal.ads.zzflb.JAVASCRIPT, false), com.google.android.gms.internal.ads.zzfkr.zzb(zzflaVar.zza, zzflaVar.zzb, null, null), str);
        zzflaVar.zzd.put(str, zzfktVar);
        zzfktVar.zzd(zzflaVar.zza());
        for (com.google.android.gms.internal.ads.zzfln zzflnVar : zzflaVar.zze.zza()) {
            zzfktVar.zzb((android.view.View) zzflnVar.zzb().get(), zzflnVar.zza(), zzflnVar.zzc());
        }
        zzfktVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        androidx.webkit.WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    final android.view.View zza() {
        com.google.android.gms.internal.ads.zzfnb zzfnbVar = this.zzc;
        if (zzfnbVar == null) {
            return null;
        }
        return (android.view.View) zzfnbVar.get();
    }

    public final void zzf(android.view.View view, com.google.android.gms.internal.ads.zzfkw zzfkwVar, java.lang.String str) {
        java.util.Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfkp) it.next()).zzb(view, zzfkwVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfkwVar, "Ad overlay");
    }

    public final void zzg(com.google.android.gms.internal.ads.zzcfo zzcfoVar) {
        java.util.Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfkp) it.next()).zzc();
        }
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new com.google.android.gms.internal.ads.zzfky(this, zzcfoVar, timer), 1000L);
    }
}

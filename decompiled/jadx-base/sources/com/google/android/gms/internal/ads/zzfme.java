package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfme extends com.google.android.gms.internal.ads.zzfma {
    private android.webkit.WebView zza;
    private java.lang.Long zzb;
    private final java.util.Map zzc;

    public zzfme(java.lang.String str, java.util.Map map, java.lang.String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzc() {
        super.zzc();
        new android.os.Handler().postDelayed(new com.google.android.gms.internal.ads.zzfmd(this), java.lang.Math.max(4000 - (this.zzb == null ? 4000L : java.util.concurrent.TimeUnit.MILLISECONDS.convert(java.lang.System.nanoTime() - this.zzb.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzi(com.google.android.gms.internal.ads.zzfkt zzfktVar, com.google.android.gms.internal.ads.zzfkr zzfkrVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map mapZzi = zzfkrVar.zzi();
        java.util.Iterator it = mapZzi.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzj(zzfktVar, zzfkrVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzo() {
        android.webkit.WebView webView = new android.webkit.WebView(com.google.android.gms.internal.ads.zzflp.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new com.google.android.gms.internal.ads.zzfmc(this));
        zzn(this.zza);
        com.google.android.gms.internal.ads.zzflr.zzk(this.zza, null);
        java.util.Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = java.lang.Long.valueOf(java.lang.System.nanoTime());
        } else {
            throw null;
        }
    }
}

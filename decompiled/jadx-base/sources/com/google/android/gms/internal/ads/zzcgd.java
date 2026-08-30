package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcgd {
    private final com.google.android.gms.internal.ads.zzcge zza;
    private final com.google.android.gms.internal.ads.zzcgc zzb;

    public zzcgd(com.google.android.gms.internal.ads.zzcge zzcgeVar, com.google.android.gms.internal.ads.zzcgc zzcgcVar) {
        this.zzb = zzcgcVar;
        this.zza = zzcgeVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignals(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        com.google.android.gms.internal.ads.zzava zzavaVarZzI = ((com.google.android.gms.internal.ads.zzcgk) this.zza).zzI();
        if (zzavaVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        com.google.android.gms.internal.ads.zzauv zzauvVarZzc = zzavaVarZzI.zzc();
        if (zzauvVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        com.google.android.gms.internal.ads.zzcge zzcgeVar = this.zza;
        return zzauvVarZzc.zze(zzcgeVar.getContext(), str, ((com.google.android.gms.internal.ads.zzcgm) zzcgeVar).zzF(), this.zza.zzi());
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignals() {
        com.google.android.gms.internal.ads.zzava zzavaVarZzI = ((com.google.android.gms.internal.ads.zzcgk) this.zza).zzI();
        if (zzavaVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        com.google.android.gms.internal.ads.zzauv zzauvVarZzc = zzavaVarZzI.zzc();
        if (zzauvVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        com.google.android.gms.internal.ads.zzcge zzcgeVar = this.zza;
        return zzauvVarZzc.zzh(zzcgeVar.getContext(), ((com.google.android.gms.internal.ads.zzcgm) zzcgeVar).zzF(), this.zza.zzi());
    }

    @android.webkit.JavascriptInterface
    public void notify(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcgb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    final /* synthetic */ void zza(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        com.google.android.gms.internal.ads.zzcff zzcffVarZzaO = ((com.google.android.gms.internal.ads.zzcfw) this.zzb.zza).zzaO();
        if (zzcffVarZzaO == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzcffVarZzaO.zzk(uri);
        }
    }
}

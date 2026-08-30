package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeel implements com.google.android.gms.internal.ads.zzecw {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdfu zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfbn zzd;
    private final com.google.android.gms.internal.ads.zzdrw zze;

    public zzeel(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdfu zzdfuVar, com.google.android.gms.internal.ads.zzfbn zzfbnVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdfuVar;
        this.zzc = executor;
        this.zzd = zzfbnVar;
        this.zze = zzdrwVar;
    }

    private static java.lang.String zze(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        try {
            return zzfboVar.zzv.getString("tab_url");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmT)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zze.zza();
            zzdrvVarZza.zzb("action", "cstm_tbs_rndr");
            zzdrvVarZza.zzg();
        }
        java.lang.String strZze = zze(zzfboVar);
        final android.net.Uri uri = strZze != null ? android.net.Uri.parse(strZze) : null;
        final com.google.android.gms.internal.ads.zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        return com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzh(null), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc(uri, zzfcaVar, zzfboVar, zzfbrVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        android.content.Context context = this.zza;
        return (context instanceof android.app.Activity) && com.google.android.gms.internal.ads.zzbdm.zzg(context) && !android.text.TextUtils.isEmpty(zze(zzfboVar));
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.net.Uri uri, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, java.lang.Object obj) throws java.lang.Exception {
        try {
            androidx.browser.customtabs.CustomTabsIntent customTabsIntentBuild = new androidx.browser.customtabs.CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            final com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
            com.google.android.gms.internal.ads.zzder zzderVarZze = this.zzb.zze(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, null), new com.google.android.gms.internal.ads.zzdeu(new com.google.android.gms.internal.ads.zzdgc() { // from class: com.google.android.gms.internal.ads.zzeek
                @Override // com.google.android.gms.internal.ads.zzdgc
                public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
                    this.zza.zzd(zzcabVar, z, context, zzcwgVar);
                }
            }, null));
            zzcabVar.zzc(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzcVar, null, zzderVarZze.zza(), null, new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(0, 0, false), null, null, zzfbrVar.zzb));
            this.zzd.zza();
            return com.google.android.gms.internal.ads.zzgch.zzh(zzderVarZze.zzg());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzcab zzcabVar, boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
        try {
            com.google.android.gms.ads.internal.zzv.zzj();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) zzcabVar.get(), true, this.zze);
        } catch (java.lang.Exception unused) {
        }
    }
}

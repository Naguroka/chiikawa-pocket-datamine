package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zzbin implements com.google.android.gms.internal.ads.zzbjp {
    public final /* synthetic */ com.google.android.gms.internal.ads.zzdds zza;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcmk zzb;

    public /* synthetic */ zzbin(com.google.android.gms.internal.ads.zzdds zzddsVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        this.zza = zzddsVar;
        this.zzb = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        com.google.android.gms.internal.ads.zzbjo.zzc(map, this.zza);
        final java.lang.String str = (java.lang.String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from click GMSG.");
        } else {
            final com.google.android.gms.internal.ads.zzcmk zzcmkVar = this.zzb;
            com.google.android.gms.internal.ads.zzgch.zzr((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(com.google.android.gms.internal.ads.zzbjo.zza(zzcexVar, str)), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzbiq
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                    com.google.android.gms.internal.ads.zzcmk zzcmkVar2;
                    java.lang.String str2 = (java.lang.String) obj2;
                    com.google.android.gms.internal.ads.zzbjp zzbjpVar = com.google.android.gms.internal.ads.zzbjo.zza;
                    return (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjT)).booleanValue() && (zzcmkVar2 = zzcmkVar) != null && com.google.android.gms.internal.ads.zzcmk.zzj(str)) ? zzcmkVar2.zzb(str2, com.google.android.gms.ads.internal.client.zzbc.zze()) : com.google.android.gms.internal.ads.zzgch.zzh(str2);
                }
            }, com.google.android.gms.internal.ads.zzbzw.zza), new com.google.android.gms.internal.ads.zzbjd(zzcexVar), com.google.android.gms.internal.ads.zzbzw.zza);
        }
    }
}

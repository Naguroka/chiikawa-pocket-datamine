package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyr implements com.google.android.gms.internal.ads.zzezf {
    private final com.google.android.gms.internal.ads.zzfdw zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzgcd zzc = new com.google.android.gms.internal.ads.zzeyp(this);

    public zzeyr(com.google.android.gms.internal.ads.zzfdw zzfdwVar, java.util.concurrent.Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = executor;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcuz zzcuzVar, com.google.android.gms.internal.ads.zzeyz zzeyzVar) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzfdw zzfdwVar = this.zza;
        com.google.android.gms.internal.ads.zzfeg zzfegVar = zzeyzVar.zzb;
        com.google.android.gms.internal.ads.zzbvk zzbvkVar = zzeyzVar.zza;
        com.google.android.gms.internal.ads.zzfef zzfefVarZzb = zzfdwVar.zzb(zzfegVar);
        if (zzfefVarZzb != null && zzbvkVar != null) {
            com.google.android.gms.internal.ads.zzgch.zzr(zzcuzVar.zzb().zzg(zzbvkVar), this.zzc, this.zzb);
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzeyq(zzfegVar, zzbvkVar, zzfefVarZzb));
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, final com.google.android.gms.internal.ads.zzcuz zzcuzVar) {
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(new com.google.android.gms.internal.ads.zzezb(this.zza, zzcuzVar, this.zzb).zzc()), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyn
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zza(zzcuzVar, (com.google.android.gms.internal.ads.zzeyz) obj);
            }
        }, this.zzb), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzeyo(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, java.lang.Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ java.lang.Object zzd() {
        return null;
    }
}

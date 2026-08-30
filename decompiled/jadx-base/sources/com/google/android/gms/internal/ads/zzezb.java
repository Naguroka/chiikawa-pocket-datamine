package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzezb {
    private final com.google.android.gms.internal.ads.zzfdw zza;
    private final com.google.android.gms.internal.ads.zzcuz zzb;
    private final java.util.concurrent.Executor zzc;
    private com.google.android.gms.internal.ads.zzeyz zzd;

    public zzezb(com.google.android.gms.internal.ads.zzfdw zzfdwVar, com.google.android.gms.internal.ads.zzcuz zzcuzVar, java.util.concurrent.Executor executor) {
        this.zza = zzfdwVar;
        this.zzb = zzcuzVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzfeg zze() {
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZzg = this.zzb.zzg();
        return this.zza.zzc(zzfcjVarZzg.zzd, zzfcjVarZzg.zzf, zzfcjVarZzg.zzj);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc() {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzh;
        com.google.android.gms.internal.ads.zzeyz zzeyzVar = this.zzd;
        if (zzeyzVar != null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(zzeyzVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbes.zza.zze()).booleanValue()) {
            listenableFutureZzh = (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgby.zzu(this.zzb.zzb().zze(this.zza.zza())), new com.google.android.gms.internal.ads.zzeyy(this), this.zzc), com.google.android.gms.internal.ads.zzdyh.class, new com.google.android.gms.internal.ads.zzeyx(this), this.zzc);
        } else {
            com.google.android.gms.internal.ads.zzeyz zzeyzVar2 = new com.google.android.gms.internal.ads.zzeyz(null, zze(), null);
            this.zzd = zzeyzVar2;
            listenableFutureZzh = com.google.android.gms.internal.ads.zzgch.zzh(zzeyzVar2);
        }
        return com.google.android.gms.internal.ads.zzgch.zzm(listenableFutureZzh, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzeyw
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                return (com.google.android.gms.internal.ads.zzeyz) obj;
            }
        }, this.zzc);
    }
}

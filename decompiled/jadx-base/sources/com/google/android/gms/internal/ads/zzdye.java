package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdye implements com.google.android.gms.internal.ads.zzdyg {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final com.google.android.gms.internal.ads.zzcyo zzc;

    public zzdye(java.util.Map map, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzcyo zzcyoVar) {
        this.zza = map;
        this.zzb = zzgcsVar;
        this.zzc = zzcyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyg
    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        this.zzc.zzdl(zzbvkVar);
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzg = com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdvy(3));
        for (java.lang.String str : ((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzic)).split(",")) {
            final com.google.android.gms.internal.ads.zzhfj zzhfjVar = (com.google.android.gms.internal.ads.zzhfj) this.zza.get(str.trim());
            if (zzhfjVar != null) {
                listenableFutureZzg = com.google.android.gms.internal.ads.zzgch.zzf(listenableFutureZzg, com.google.android.gms.internal.ads.zzdvy.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyc
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return ((com.google.android.gms.internal.ads.zzdyg) zzhfjVar.zzb()).zzb(zzbvkVar);
                    }
                }, this.zzb);
            }
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzg, new com.google.android.gms.internal.ads.zzdyd(this), com.google.android.gms.internal.ads.zzbzw.zzg);
        return listenableFutureZzg;
    }
}

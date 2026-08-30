package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyg implements com.google.android.gms.internal.ads.zzezf {
    private com.google.android.gms.internal.ads.zzcuz zza;
    private final java.util.concurrent.Executor zzb = com.google.android.gms.internal.ads.zzgcz.zzc();

    public final com.google.android.gms.internal.ads.zzcuz zza() {
        return this.zza;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, com.google.android.gms.internal.ads.zzcuz zzcuzVar) {
        com.google.android.gms.internal.ads.zzcuy zzcuyVarZza = zzezeVar.zza(zzezgVar.zzb);
        zzcuyVarZza.zzb(new com.google.android.gms.internal.ads.zzezj(true));
        com.google.android.gms.internal.ads.zzcuz zzcuzVar2 = (com.google.android.gms.internal.ads.zzcuz) zzcuyVarZza.zzh();
        this.zza = zzcuzVar2;
        final com.google.android.gms.internal.ads.zzcsd zzcsdVarZzb = zzcuzVar2.zzb();
        final com.google.android.gms.internal.ads.zzfef zzfefVar = new com.google.android.gms.internal.ads.zzfef();
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzm((com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgby.zzu(zzcsdVarZzb.zzi()), new com.google.android.gms.internal.ads.zzgbo(this) { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfca zzfcaVar = (com.google.android.gms.internal.ads.zzfca) obj;
                zzfefVar.zzb = zzfcaVar;
                java.util.Iterator it = zzfcaVar.zzb.zza.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    java.util.Iterator it2 = ((com.google.android.gms.internal.ads.zzfbo) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((java.lang.String) it2.next()).contains("FirstPartyRenderer")) {
                            return com.google.android.gms.internal.ads.zzgch.zzh(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzcsdVarZzb.zzh(com.google.android.gms.internal.ads.zzgch.zzh(zzfcaVar));
                }
                return com.google.android.gms.internal.ads.zzgch.zzh(null);
            }
        }, this.zzb), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzeyf
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfef zzfefVar2 = zzfefVar;
                zzfefVar2.zzc = (com.google.android.gms.internal.ads.zzcqz) obj;
                return zzfefVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzezg zzezgVar, com.google.android.gms.internal.ads.zzeze zzezeVar, java.lang.Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* synthetic */ java.lang.Object zzd() {
        return this.zza;
    }
}

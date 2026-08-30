package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdwo implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;

    public zzdwo(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4, com.google.android.gms.internal.ads.zzhfj zzhfjVar5) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0058  */
    /* JADX WARN: Code duplicated, block: B:8:0x0076  */
    /* JADX WARN: Code duplicated, block: B:9:0x0080  */
    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzb;
        final com.google.android.gms.internal.ads.zzava zzavaVar = (com.google.android.gms.internal.ads.zzava) this.zza.zzb();
        final android.content.Context contextZza = ((com.google.android.gms.internal.ads.zzche) this.zzb).zza();
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZza = ((com.google.android.gms.internal.ads.zzcvk) this.zzc).zza();
        long jLongValue = ((java.lang.Long) this.zzd.zzb()).longValue();
        com.google.android.gms.internal.ads.zzgcs zzgcsVarZzc = com.google.android.gms.internal.ads.zzffh.zzc();
        int iIntValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcO)).intValue();
        if (iIntValue != -1) {
            if (java.lang.Integer.toString(iIntValue).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcjVarZza.zzd)))) {
                if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jLongValue < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcQ)).intValue()) {
                    listenableFutureZzb = zzgcsVarZzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwi
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return zzavaVar.zzc().zzg(contextZza);
                        }
                    });
                } else {
                    listenableFutureZzb = zzgcsVarZzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwj
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return zzavaVar.zzc().zzf(contextZza);
                        }
                    });
                }
            } else {
                listenableFutureZzb = zzgcsVarZzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwj
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return zzavaVar.zzc().zzf(contextZza);
                    }
                });
            }
        } else {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jLongValue < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcQ)).intValue()) {
                listenableFutureZzb = zzgcsVarZzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwi
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return zzavaVar.zzc().zzg(contextZza);
                    }
                });
            } else {
                listenableFutureZzb = zzgcsVarZzc.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdwj
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return zzavaVar.zzc().zzf(contextZza);
                    }
                });
            }
        }
        com.google.android.gms.internal.ads.zzhez.zzb(listenableFutureZzb);
        return listenableFutureZzb;
    }
}

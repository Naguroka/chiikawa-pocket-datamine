package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbyc extends com.google.android.gms.internal.ads.zzbyj {
    private final com.google.android.gms.common.util.Clock zzb;
    private final com.google.android.gms.internal.ads.zzhfa zzc;
    private final com.google.android.gms.internal.ads.zzhfa zzd;
    private final com.google.android.gms.internal.ads.zzhfa zze;
    private final com.google.android.gms.internal.ads.zzhfa zzf;
    private final com.google.android.gms.internal.ads.zzhfa zzg;
    private final com.google.android.gms.internal.ads.zzhfa zzh;
    private final com.google.android.gms.internal.ads.zzhfa zzi;
    private final com.google.android.gms.internal.ads.zzhfa zzj;

    /* synthetic */ zzbyc(android.content.Context context, com.google.android.gms.common.util.Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzbyi zzbyiVar, com.google.android.gms.internal.ads.zzbyd zzbydVar) {
        this.zzb = clock;
        com.google.android.gms.internal.ads.zzher zzherVarZza = com.google.android.gms.internal.ads.zzhes.zza(context);
        this.zzc = zzherVarZza;
        com.google.android.gms.internal.ads.zzher zzherVarZza2 = com.google.android.gms.internal.ads.zzhes.zza(zzgVar);
        this.zzd = zzherVarZza2;
        this.zze = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzbxw(zzherVarZza, zzherVarZza2));
        com.google.android.gms.internal.ads.zzher zzherVarZza3 = com.google.android.gms.internal.ads.zzhes.zza(clock);
        this.zzf = zzherVarZza3;
        com.google.android.gms.internal.ads.zzher zzherVarZza4 = com.google.android.gms.internal.ads.zzhes.zza(zzbyiVar);
        this.zzg = zzherVarZza4;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzbxy(zzherVarZza3, zzherVarZza2, zzherVarZza4));
        this.zzh = zzhfaVarZzc;
        com.google.android.gms.internal.ads.zzbya zzbyaVar = new com.google.android.gms.internal.ads.zzbya(zzherVarZza3, zzhfaVarZzc);
        this.zzi = zzbyaVar;
        this.zzj = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzbyo(zzherVarZza, zzbyaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    final com.google.android.gms.internal.ads.zzbxv zza() {
        return (com.google.android.gms.internal.ads.zzbxv) this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    final com.google.android.gms.internal.ads.zzbxz zzb() {
        return new com.google.android.gms.internal.ads.zzbxz(this.zzb, (com.google.android.gms.internal.ads.zzbxx) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    final com.google.android.gms.internal.ads.zzbyn zzc() {
        return (com.google.android.gms.internal.ads.zzbyn) this.zzj.zzb();
    }
}

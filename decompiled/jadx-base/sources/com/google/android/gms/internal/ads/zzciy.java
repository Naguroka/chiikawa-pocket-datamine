package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzciy implements com.google.android.gms.internal.ads.zzdth {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzbko zzb;
    private final com.google.android.gms.internal.ads.zzcih zzc;
    private final com.google.android.gms.internal.ads.zzciy zzd = this;
    private final com.google.android.gms.internal.ads.zzhfa zze;
    private final com.google.android.gms.internal.ads.zzhfa zzf;
    private final com.google.android.gms.internal.ads.zzhfa zzg;
    private final com.google.android.gms.internal.ads.zzhfa zzh;

    /* synthetic */ zzciy(com.google.android.gms.internal.ads.zzcih zzcihVar, android.content.Context context, com.google.android.gms.internal.ads.zzbko zzbkoVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zzc = zzcihVar;
        this.zza = context;
        this.zzb = zzbkoVar;
        com.google.android.gms.internal.ads.zzher zzherVarZza = com.google.android.gms.internal.ads.zzhes.zza(this);
        this.zze = zzherVarZza;
        com.google.android.gms.internal.ads.zzher zzherVarZza2 = com.google.android.gms.internal.ads.zzhes.zza(zzbkoVar);
        this.zzf = zzherVarZza2;
        com.google.android.gms.internal.ads.zzdtd zzdtdVar = new com.google.android.gms.internal.ads.zzdtd(zzherVarZza2);
        this.zzg = zzdtdVar;
        this.zzh = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzdtf(zzherVarZza, zzdtdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    public final com.google.android.gms.internal.ads.zzdsy zzb() {
        return new com.google.android.gms.internal.ads.zzciv(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    public final com.google.android.gms.internal.ads.zzdte zzd() {
        return (com.google.android.gms.internal.ads.zzdte) this.zzh.zzb();
    }
}

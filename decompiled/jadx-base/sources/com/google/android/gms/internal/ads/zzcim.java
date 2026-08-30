package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcim implements com.google.android.gms.internal.ads.zzewp {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private final com.google.android.gms.internal.ads.zzhfa zzb;
    private final com.google.android.gms.internal.ads.zzhfa zzc;
    private final com.google.android.gms.internal.ads.zzhfa zzd;
    private final com.google.android.gms.internal.ads.zzhfa zze;
    private final com.google.android.gms.internal.ads.zzhfa zzf;
    private final com.google.android.gms.internal.ads.zzhfa zzg;

    /* synthetic */ zzcim(com.google.android.gms.internal.ads.zzcih zzcihVar, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
        com.google.android.gms.internal.ads.zzher zzherVarZza = com.google.android.gms.internal.ads.zzhes.zza(context);
        this.zzb = zzherVarZza;
        com.google.android.gms.internal.ads.zzher zzherVarZza2 = com.google.android.gms.internal.ads.zzhes.zza(str);
        this.zzc = zzherVarZza2;
        com.google.android.gms.internal.ads.zzezh zzezhVar = new com.google.android.gms.internal.ads.zzezh(zzherVarZza, zzcihVar.zzbh, zzcihVar.zzbi);
        this.zzd = zzezhVar;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzexn(zzcihVar.zzbh));
        this.zze = zzhfaVarZzc;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc2 = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzexp(zzherVarZza, zzcihVar.zzc, zzcihVar.zzS, zzezhVar, zzhfaVarZzc, com.google.android.gms.internal.ads.zzfcl.zza(), zzcihVar.zzl));
        this.zzf = zzhfaVarZzc2;
        this.zzg = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzexv(zzcihVar.zzS, zzherVarZza, zzherVarZza2, zzhfaVarZzc2, zzhfaVarZzc, zzcihVar.zzl, zzcihVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzewp
    public final com.google.android.gms.internal.ads.zzexu zza() {
        return (com.google.android.gms.internal.ads.zzexu) this.zzg.zzb();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcjf implements com.google.android.gms.internal.ads.zzfbi {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private final com.google.android.gms.internal.ads.zzhfa zzb;
    private final com.google.android.gms.internal.ads.zzhfa zzc;
    private final com.google.android.gms.internal.ads.zzhfa zzd;
    private final com.google.android.gms.internal.ads.zzhfa zze;
    private final com.google.android.gms.internal.ads.zzhfa zzf;
    private final com.google.android.gms.internal.ads.zzhfa zzg;
    private final com.google.android.gms.internal.ads.zzhfa zzh;
    private final com.google.android.gms.internal.ads.zzhfa zzi;

    /* synthetic */ zzcjf(com.google.android.gms.internal.ads.zzcih zzcihVar, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
        com.google.android.gms.internal.ads.zzher zzherVarZza = com.google.android.gms.internal.ads.zzhes.zza(context);
        this.zzb = zzherVarZza;
        com.google.android.gms.internal.ads.zzezi zzeziVar = new com.google.android.gms.internal.ads.zzezi(zzherVarZza, zzcihVar.zzbh, zzcihVar.zzbi);
        this.zzc = zzeziVar;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzfas(zzcihVar.zzbh));
        this.zzd = zzhfaVarZzc;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc2 = com.google.android.gms.internal.ads.zzheq.zzc(com.google.android.gms.internal.ads.zzfcg.zza());
        this.zze = zzhfaVarZzc2;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc3 = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzfbc(zzherVarZza, zzcihVar.zzc, zzcihVar.zzS, zzeziVar, zzhfaVarZzc, com.google.android.gms.internal.ads.zzfcl.zza(), zzhfaVarZzc2));
        this.zzf = zzhfaVarZzc3;
        this.zzg = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzfbm(zzhfaVarZzc3, zzhfaVarZzc, zzhfaVarZzc2));
        com.google.android.gms.internal.ads.zzher zzherVarZzc = com.google.android.gms.internal.ads.zzhes.zzc(str);
        this.zzh = zzherVarZzc;
        this.zzi = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzfbg(zzherVarZzc, zzhfaVarZzc3, zzherVarZza, zzhfaVarZzc, zzhfaVarZzc2, zzcihVar.zzl, zzcihVar.zzU, zzcihVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final com.google.android.gms.internal.ads.zzfbf zza() {
        return (com.google.android.gms.internal.ads.zzfbf) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final com.google.android.gms.internal.ads.zzfbl zzb() {
        return (com.google.android.gms.internal.ads.zzfbl) this.zzg.zzb();
    }
}

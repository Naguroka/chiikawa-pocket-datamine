package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcjd implements com.google.android.gms.internal.ads.zzezu {
    private final com.google.android.gms.internal.ads.zzcih zza;
    private final com.google.android.gms.internal.ads.zzhfa zzb;
    private final com.google.android.gms.internal.ads.zzhfa zzc;
    private final com.google.android.gms.internal.ads.zzhfa zzd;
    private final com.google.android.gms.internal.ads.zzhfa zze;
    private final com.google.android.gms.internal.ads.zzhfa zzf;
    private final com.google.android.gms.internal.ads.zzhfa zzg;
    private final com.google.android.gms.internal.ads.zzhfa zzh;

    /* synthetic */ zzcjd(com.google.android.gms.internal.ads.zzcih zzcihVar, android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zza = zzcihVar;
        com.google.android.gms.internal.ads.zzher zzherVarZza = com.google.android.gms.internal.ads.zzhes.zza(context);
        this.zzb = zzherVarZza;
        com.google.android.gms.internal.ads.zzher zzherVarZza2 = com.google.android.gms.internal.ads.zzhes.zza(zzsVar);
        this.zzc = zzherVarZza2;
        com.google.android.gms.internal.ads.zzher zzherVarZza3 = com.google.android.gms.internal.ads.zzhes.zza(str);
        this.zzd = zzherVarZza3;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzeko(zzcihVar.zzM));
        this.zze = zzhfaVarZzc;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc2 = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzfas(zzcihVar.zzbh));
        this.zzf = zzhfaVarZzc2;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc3 = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzezs(zzherVarZza, zzcihVar.zzc, zzcihVar.zzS, zzhfaVarZzc, zzhfaVarZzc2, com.google.android.gms.internal.ads.zzfcl.zza()));
        this.zzg = zzhfaVarZzc3;
        this.zzh = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzekw(zzherVarZza, zzherVarZza2, zzherVarZza3, zzhfaVarZzc3, zzhfaVarZzc, zzhfaVarZzc2, zzcihVar.zzl, zzcihVar.zzU, zzcihVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzezu
    public final com.google.android.gms.internal.ads.zzekv zza() {
        return (com.google.android.gms.internal.ads.zzekv) this.zzh.zzb();
    }
}

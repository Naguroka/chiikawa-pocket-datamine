package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcir implements com.google.android.gms.internal.ads.zzeyd {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzs zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzcih zzd;
    private final com.google.android.gms.internal.ads.zzhfa zze;
    private final com.google.android.gms.internal.ads.zzhfa zzf;
    private final com.google.android.gms.internal.ads.zzhfa zzg;
    private final com.google.android.gms.internal.ads.zzhfa zzh;
    private final com.google.android.gms.internal.ads.zzhfa zzi;
    private final com.google.android.gms.internal.ads.zzhfa zzj;

    /* synthetic */ zzcir(com.google.android.gms.internal.ads.zzcih zzcihVar, android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
        this.zzd = zzcihVar;
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        com.google.android.gms.internal.ads.zzher zzherVarZza = com.google.android.gms.internal.ads.zzhes.zza(context);
        this.zze = zzherVarZza;
        com.google.android.gms.internal.ads.zzher zzherVarZza2 = com.google.android.gms.internal.ads.zzhes.zza(zzsVar);
        this.zzf = zzherVarZza2;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzeko(zzcihVar.zzM));
        this.zzg = zzhfaVarZzc;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc2 = com.google.android.gms.internal.ads.zzheq.zzc(com.google.android.gms.internal.ads.zzekt.zza());
        this.zzh = zzhfaVarZzc2;
        com.google.android.gms.internal.ads.zzhfa zzhfaVarZzc3 = com.google.android.gms.internal.ads.zzheq.zzc(com.google.android.gms.internal.ads.zzdat.zza());
        this.zzi = zzhfaVarZzc3;
        this.zzj = com.google.android.gms.internal.ads.zzheq.zzc(new com.google.android.gms.internal.ads.zzeyb(zzherVarZza, zzcihVar.zzc, zzherVarZza2, zzcihVar.zzS, zzhfaVarZzc, zzhfaVarZzc2, com.google.android.gms.internal.ads.zzfcl.zza(), zzhfaVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzeyd
    public final com.google.android.gms.internal.ads.zzejt zza() {
        return new com.google.android.gms.internal.ads.zzejt(this.zza, this.zzb, this.zzc, (com.google.android.gms.internal.ads.zzeya) this.zzj.zzb(), (com.google.android.gms.internal.ads.zzekn) this.zzg.zzb(), com.google.android.gms.internal.ads.zzchs.zzc(this.zzd.zza), (com.google.android.gms.internal.ads.zzdrw) this.zzd.zzM.zzb());
    }
}

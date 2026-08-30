package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcpb implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzcot zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;
    private final com.google.android.gms.internal.ads.zzhfj zze;

    public zzcpb(com.google.android.gms.internal.ads.zzcot zzcotVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4) {
        this.zza = zzcotVar;
        this.zzb = zzhfjVar;
        this.zzc = zzhfjVar2;
        this.zzd = zzhfjVar3;
        this.zze = zzhfjVar4;
    }

    public static com.google.android.gms.internal.ads.zzddk zza(com.google.android.gms.internal.ads.zzcot zzcotVar, final android.content.Context context, final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, final com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        return new com.google.android.gms.internal.ads.zzddk(new com.google.android.gms.internal.ads.zzcxh() { // from class: com.google.android.gms.internal.ads.zzcor
            @Override // com.google.android.gms.internal.ads.zzcxh
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.zzfcj zzfcjVar2 = zzfcjVar;
                zzayVarZzt.zzn(context2, versionInfoParcel.afmaVersion, zzfboVar.zzC.toString(), zzfcjVar2.zzf);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zza(this.zza, (android.content.Context) this.zzb.zzb(), ((com.google.android.gms.internal.ads.zzchs) this.zzc).zza(), ((com.google.android.gms.internal.ads.zzcrq) this.zzd).zza(), ((com.google.android.gms.internal.ads.zzcvk) this.zze).zza());
    }
}

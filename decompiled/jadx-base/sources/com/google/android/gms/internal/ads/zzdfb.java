package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdfb implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;

    public zzdfb(com.google.android.gms.internal.ads.zzdeu zzdeuVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        final android.content.Context context = (android.content.Context) this.zza.zzb();
        final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZza = ((com.google.android.gms.internal.ads.zzchs) this.zzb).zza();
        final com.google.android.gms.internal.ads.zzfbo zzfboVarZza = ((com.google.android.gms.internal.ads.zzcrq) this.zzc).zza();
        final com.google.android.gms.internal.ads.zzfcj zzfcjVarZza = ((com.google.android.gms.internal.ads.zzcvk) this.zzd).zza();
        return new com.google.android.gms.internal.ads.zzddk(new com.google.android.gms.internal.ads.zzcxh() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzcxh
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcjVarZza;
                zzayVarZzt.zzn(context2, versionInfoParcelZza.afmaVersion, zzfboVarZza.zzC.toString(), zzfcjVar.zzf);
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzg);
    }
}

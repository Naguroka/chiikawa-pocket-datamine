package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdpv implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;
    private final com.google.android.gms.internal.ads.zzhfj zze;

    public zzdpv(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4, com.google.android.gms.internal.ads.zzhfj zzhfjVar5) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        android.content.Context contextZza = ((com.google.android.gms.internal.ads.zzche) this.zza).zza();
        final java.lang.String strZzb = ((com.google.android.gms.internal.ads.zzdws) this.zzb).zzb();
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZza = ((com.google.android.gms.internal.ads.zzchs) this.zzc).zza();
        final com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza enumC0177zza = (com.google.android.gms.internal.ads.zzbbq.zza.EnumC0177zza) this.zzd.zzb();
        final java.lang.String str = (java.lang.String) this.zze.zzb();
        com.google.android.gms.internal.ads.zzbbj zzbbjVar = new com.google.android.gms.internal.ads.zzbbj(new com.google.android.gms.internal.ads.zzbbp(contextZza));
        com.google.android.gms.internal.ads.zzbbq.zzar.zza zzaVarZzd = com.google.android.gms.internal.ads.zzbbq.zzar.zzd();
        zzaVarZzd.zzg(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzd.zzi(versionInfoParcelZza.clientJarVersion);
        zzaVarZzd.zzh(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final com.google.android.gms.internal.ads.zzbbq.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbbjVar.zzb(new com.google.android.gms.internal.ads.zzbbi() { // from class: com.google.android.gms.internal.ads.zzdpu
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(com.google.android.gms.internal.ads.zzbbq.zzt.zza zzaVar) {
                com.google.android.gms.internal.ads.zzbbq.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbVarZzbM.zzH(enumC0177zza);
                zzaVar.zzG(zzbVarZzbM);
                com.google.android.gms.internal.ads.zzbbq.zzm.zza zzaVarZzbM = zzaVar.zzg().zzbM();
                zzaVarZzbM.zzm(strZzb);
                zzaVarZzbM.zzw(zzarVarZzbr);
                zzaVar.zzK(zzaVarZzbM);
                zzaVar.zzO(str);
            }
        });
        return zzbbjVar;
    }
}

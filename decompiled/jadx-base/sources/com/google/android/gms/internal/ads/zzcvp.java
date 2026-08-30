package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcvp implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzcvp(com.google.android.gms.internal.ads.zzcvo zzcvoVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        android.content.Context context = (android.content.Context) this.zza.zzb();
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcelZza = ((com.google.android.gms.internal.ads.zzchs) this.zzb).zza();
        com.google.android.gms.internal.ads.zzfbo zzfboVarZza = ((com.google.android.gms.internal.ads.zzcrq) this.zzc).zza();
        com.google.android.gms.internal.ads.zzbxq zzbxqVar = new com.google.android.gms.internal.ads.zzbxq();
        com.google.android.gms.internal.ads.zzbxr zzbxrVar = zzfboVarZza.zzA;
        if (zzbxrVar == null) {
            return null;
        }
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVarZza.zzs;
        return new com.google.android.gms.internal.ads.zzbxp(context, versionInfoParcelZza, zzbxrVar, zzfbtVar == null ? null : zzfbtVar.zzb, zzbxqVar);
    }
}

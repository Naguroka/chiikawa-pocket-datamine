package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzeey implements com.google.android.gms.internal.ads.zzdgc {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;
    private final com.google.android.gms.internal.ads.zzfbo zzd;
    private final com.google.android.gms.internal.ads.zzcex zze;
    private final com.google.android.gms.internal.ads.zzfcj zzf;
    private final com.google.android.gms.internal.ads.zzbjs zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzebv zzi;
    private final com.google.android.gms.internal.ads.zzdrw zzj;

    zzeey(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, boolean z, com.google.android.gms.internal.ads.zzbjs zzbjsVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfboVar;
        this.zze = zzcexVar;
        this.zzf = zzfcjVar;
        this.zzg = zzbjsVar;
        this.zzh = z;
        this.zzi = zzebvVar;
        this.zzj = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) {
        com.google.android.gms.internal.ads.zzder zzderVar = (com.google.android.gms.internal.ads.zzder) com.google.android.gms.internal.ads.zzgch.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zZze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzO, false);
        if (zzcwgVar != null) {
            zzcwgVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.internal.ads.zzdfr zzdfrVarZzh = zzderVar.zzh();
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zze;
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzd;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzb;
        int i = zzfboVar.zzQ;
        java.lang.String str = zzfboVar.zzB;
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzdfrVarZzh, null, zzcexVar, i, versionInfoParcel, str, zzlVar, zzfbtVar.zzb, zzfbtVar.zza, this.zzf.zzf, zzcwgVar, zzfboVar.zzb() ? this.zzi : null, this.zze.zzr()), true, this.zzj);
    }
}

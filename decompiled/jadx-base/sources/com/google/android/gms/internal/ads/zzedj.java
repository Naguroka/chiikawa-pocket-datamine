package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzedj implements com.google.android.gms.internal.ads.zzdgc {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final com.google.common.util.concurrent.ListenableFuture zzb;
    private final com.google.android.gms.internal.ads.zzfbo zzc;
    private final com.google.android.gms.internal.ads.zzcex zzd;
    private final com.google.android.gms.internal.ads.zzfcj zze;
    private final com.google.android.gms.internal.ads.zzbjs zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.ads.zzebv zzh;
    private final com.google.android.gms.internal.ads.zzdrw zzi;

    zzedj(com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, boolean z, com.google.android.gms.internal.ads.zzbjs zzbjsVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfboVar;
        this.zzd = zzcexVar;
        this.zze = zzfcjVar;
        this.zzg = z;
        this.zzf = zzbjsVar;
        this.zzh = zzebvVar;
        this.zzi = zzdrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) {
        com.google.android.gms.internal.ads.zzcnx zzcnxVar = (com.google.android.gms.internal.ads.zzcnx) com.google.android.gms.internal.ads.zzgch.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zZze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzO, false);
        if (zzcwgVar != null) {
            zzcwgVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.internal.ads.zzdfr zzdfrVarZzg = zzcnxVar.zzg();
        com.google.android.gms.internal.ads.zzcex zzcexVar = this.zzd;
        int i = this.zzc.zzQ;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzy zzyVar = this.zze.zzj;
            if (zzyVar == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error setting app open orientation; no targeting orientation available.");
                i = this.zzc.zzQ;
            } else {
                int i2 = zzyVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Error setting app open orientation; no targeting orientation available.");
                    i = this.zzc.zzQ;
                }
            }
        }
        int i3 = i;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zza;
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzc;
        java.lang.String str = zzfboVar.zzB;
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(null, zzdfrVarZzg, null, zzcexVar, i3, versionInfoParcel, str, zzlVar, zzfbtVar.zzb, zzfbtVar.zza, this.zze.zzf, zzcwgVar, zzfboVar.zzb() ? this.zzh : null, this.zzd.zzr()), true, this.zzi);
    }
}

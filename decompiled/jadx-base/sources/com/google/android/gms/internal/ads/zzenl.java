package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzenl implements com.google.android.gms.internal.ads.zzetr {
    final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final com.google.android.gms.internal.ads.zzcsp zze;
    private final com.google.android.gms.internal.ads.zzfdq zzf;
    private final com.google.android.gms.internal.ads.zzfcj zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi();
    private final com.google.android.gms.internal.ads.zzdrq zzi;
    private final com.google.android.gms.internal.ads.zzctc zzj;

    public zzenl(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzcsp zzcspVar, com.google.android.gms.internal.ads.zzfdq zzfdqVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar, com.google.android.gms.internal.ads.zzctc zzctcVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcspVar;
        this.zzf = zzfdqVar;
        this.zzg = zzfcjVar;
        this.zzi = zzdrqVar;
        this.zzj = zzctcVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        android.os.Bundle bundle = new android.os.Bundle();
        this.zzi.zzb().put("seq_num", this.zzb);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue()) {
            this.zzi.zzc("tsacc", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zzd));
            com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzi;
            com.google.android.gms.ads.internal.zzv.zzq();
            zzdrqVar.zzc(androidx.media3.exoplayer.offline.DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzH(this.zza) ? "1" : "0");
        }
        this.zze.zzk(this.zzg.zzd);
        bundle.putAll(this.zzf.zzb());
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzenm(this.zza, bundle, this.zzb, this.zzc, this.zzh, this.zzg.zzf, this.zzj));
    }
}

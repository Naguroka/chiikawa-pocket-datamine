package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcvc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;
    private final android.os.Bundle zzc;
    private final com.google.android.gms.internal.ads.zzfcb zzd;
    private final com.google.android.gms.internal.ads.zzcut zze;
    private final com.google.android.gms.internal.ads.zzedb zzf;
    private final int zzg;

    /* synthetic */ zzcvc(com.google.android.gms.internal.ads.zzcva zzcvaVar, com.google.android.gms.internal.ads.zzcvb zzcvbVar) {
        this.zza = zzcvaVar.zza;
        this.zzb = zzcvaVar.zzb;
        this.zzc = zzcvaVar.zzc;
        this.zzd = zzcvaVar.zzd;
        this.zze = zzcvaVar.zze;
        this.zzf = zzcvaVar.zzf;
        this.zzg = zzcvaVar.zzg;
    }

    final int zza() {
        return this.zzg;
    }

    final android.content.Context zzb(android.content.Context context) {
        return this.zza;
    }

    final android.os.Bundle zzc() {
        return this.zzc;
    }

    final com.google.android.gms.internal.ads.zzcut zzd() {
        return this.zze;
    }

    final com.google.android.gms.internal.ads.zzcva zze() {
        com.google.android.gms.internal.ads.zzcva zzcvaVar = new com.google.android.gms.internal.ads.zzcva();
        zzcvaVar.zzf(this.zza);
        zzcvaVar.zzk(this.zzb);
        zzcvaVar.zzg(this.zzc);
        zzcvaVar.zzh(this.zze);
        zzcvaVar.zze(this.zzf);
        return zzcvaVar;
    }

    final com.google.android.gms.internal.ads.zzedb zzf(java.lang.String str) {
        com.google.android.gms.internal.ads.zzedb zzedbVar = this.zzf;
        return zzedbVar != null ? zzedbVar : new com.google.android.gms.internal.ads.zzedb(str);
    }

    final com.google.android.gms.internal.ads.zzfcb zzg() {
        return this.zzd;
    }

    final com.google.android.gms.internal.ads.zzfcj zzh() {
        return this.zzb;
    }
}

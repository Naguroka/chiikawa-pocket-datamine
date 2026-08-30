package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevx {
    private final com.google.android.gms.internal.ads.zzbvk zza;
    private final int zzb;

    public zzevx(com.google.android.gms.internal.ads.zzbvk zzbvkVar, int i) {
        this.zza = zzbvkVar;
        this.zzb = i;
    }

    public final int zza() {
        return this.zzb;
    }

    public final android.content.pm.PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final java.lang.String zzc() {
        return this.zza.zzd;
    }

    public final java.lang.String zzd() {
        return com.google.android.gms.internal.ads.zzfve.zzc(this.zza.zza.getString("ms"));
    }

    public final java.lang.String zze() {
        return this.zza.zzh;
    }

    public final java.util.List zzf() {
        return this.zza.zze;
    }

    final boolean zzg() {
        return this.zza.zzl;
    }

    final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    final boolean zzi() {
        return this.zza.zzk;
    }
}

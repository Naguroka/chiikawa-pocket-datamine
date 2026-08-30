package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpx {
    private long zza;
    private com.google.android.gms.internal.measurement.zzhv zzb;
    private java.lang.String zzc;
    private java.util.Map zzd;
    private com.google.android.gms.measurement.internal.zzmf zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private int zzi;

    zzpx() {
    }

    public final com.google.android.gms.measurement.internal.zzpx zza(long j) {
        this.zzg = j;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zzb(long j) {
        this.zzf = j;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zzc(long j) {
        this.zzh = j;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zzd(com.google.android.gms.internal.measurement.zzhv zzhvVar) {
        this.zzb = zzhvVar;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zze(int i) {
        this.zzi = i;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zzf(long j) {
        this.zza = j;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zzg(java.util.Map map) {
        this.zzd = map;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zzh(com.google.android.gms.measurement.internal.zzmf zzmfVar) {
        this.zze = zzmfVar;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpx zzi(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    public final com.google.android.gms.measurement.internal.zzpz zzj() {
        return new com.google.android.gms.measurement.internal.zzpz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null);
    }
}

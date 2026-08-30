package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpz {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzhv zzb;
    private final java.lang.String zzc;
    private final java.util.Map zzd;
    private final com.google.android.gms.measurement.internal.zzmf zze;
    private final long zzf;
    private final long zzg;
    private final int zzh;

    /* synthetic */ zzpz(long j, com.google.android.gms.internal.measurement.zzhv zzhvVar, java.lang.String str, java.util.Map map, com.google.android.gms.measurement.internal.zzmf zzmfVar, long j2, long j3, long j4, int i, com.google.android.gms.measurement.internal.zzpy zzpyVar) {
        this.zza = j;
        this.zzb = zzhvVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzmfVar;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = i;
    }

    public final int zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zza;
    }

    public final com.google.android.gms.measurement.internal.zzmf zzd() {
        return this.zze;
    }

    public final com.google.android.gms.measurement.internal.zzpa zze() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.zzd.entrySet()) {
            bundle.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        long j = this.zza;
        com.google.android.gms.internal.measurement.zzhv zzhvVar = this.zzb;
        java.lang.String str = this.zzc;
        com.google.android.gms.measurement.internal.zzmf zzmfVar = this.zze;
        return new com.google.android.gms.measurement.internal.zzpa(j, zzhvVar.zzcd(), str, bundle, zzmfVar.zza(), this.zzf, "");
    }

    public final com.google.android.gms.measurement.internal.zzph zzf() {
        return new com.google.android.gms.measurement.internal.zzph(this.zzc, this.zzd, this.zze, null);
    }

    public final com.google.android.gms.internal.measurement.zzhv zzg() {
        return this.zzb;
    }

    public final java.lang.String zzh() {
        return this.zzc;
    }
}

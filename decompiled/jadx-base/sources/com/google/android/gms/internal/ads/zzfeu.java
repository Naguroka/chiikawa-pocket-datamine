package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfeu {
    private final long zza;
    private long zzc;
    private final com.google.android.gms.internal.ads.zzfet zzb = new com.google.android.gms.internal.ads.zzfet();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfeu() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzfet zzd() {
        com.google.android.gms.internal.ads.zzfet zzfetVar = this.zzb;
        com.google.android.gms.internal.ads.zzfet zzfetVarClone = zzfetVar.clone();
        zzfetVar.zza = false;
        zzfetVar.zzb = 0;
        return zzfetVarClone;
    }

    public final java.lang.String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}

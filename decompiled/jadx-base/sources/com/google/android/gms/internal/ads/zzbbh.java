package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbbh {
    private final java.io.InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbbh(java.io.InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.zza = inputStream;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }

    public static com.google.android.gms.internal.ads.zzbbh zzb(java.io.InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new com.google.android.gms.internal.ads.zzbbh(inputStream, z, z2, j, z3);
    }

    public final long zza() {
        return this.zzd;
    }

    public final java.io.InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzok {
    final sun.misc.Unsafe zza;

    zzok(sun.misc.Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(java.lang.Object obj, long j);

    public abstract float zzb(java.lang.Object obj, long j);

    public abstract void zzc(java.lang.Object obj, long j, boolean z);

    public abstract void zzd(java.lang.Object obj, long j, byte b);

    public abstract void zze(java.lang.Object obj, long j, double d);

    public abstract void zzf(java.lang.Object obj, long j, float f);

    public abstract boolean zzg(java.lang.Object obj, long j);
}

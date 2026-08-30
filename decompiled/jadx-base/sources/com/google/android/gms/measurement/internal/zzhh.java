package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhh implements java.lang.Runnable {
    private final com.google.android.gms.measurement.internal.zzhg zza;
    private final int zzb;
    private final java.lang.Throwable zzc;
    private final byte[] zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    /* synthetic */ zzhh(java.lang.String str, com.google.android.gms.measurement.internal.zzhg zzhgVar, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map, com.google.android.gms.measurement.internal.zzhj zzhjVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhgVar);
        this.zza = zzhgVar;
        this.zzb = i;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}

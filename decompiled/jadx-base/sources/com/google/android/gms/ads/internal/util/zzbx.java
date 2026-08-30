package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbx {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final java.lang.Object zzc = new java.lang.Object();

    public zzbx(long j) {
        this.zza = j;
    }

    public final void zza(long j) {
        synchronized (this.zzc) {
            this.zza = j;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            if (this.zzb + this.zza > jElapsedRealtime) {
                return false;
            }
            this.zzb = jElapsedRealtime;
            return true;
        }
    }
}

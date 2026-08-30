package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzqg {
    private java.lang.Exception zza;
    private long zzb = androidx.media3.common.C.TIME_UNSET;
    private long zzc = androidx.media3.common.C.TIME_UNSET;

    public final void zza() {
        this.zza = null;
        this.zzb = androidx.media3.common.C.TIME_UNSET;
        this.zzc = androidx.media3.common.C.TIME_UNSET;
    }

    public final void zzb(java.lang.Exception exc) throws java.lang.Exception {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == androidx.media3.common.C.TIME_UNSET && !com.google.android.gms.internal.ads.zzqm.zzK()) {
            this.zzb = 200 + jElapsedRealtime;
        }
        long j = this.zzb;
        if (j == androidx.media3.common.C.TIME_UNSET || jElapsedRealtime < j) {
            this.zzc = jElapsedRealtime + 50;
            return;
        }
        java.lang.Exception exc2 = this.zza;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        java.lang.Exception exc3 = this.zza;
        zza();
        throw exc3;
    }

    public final boolean zzc() {
        if (this.zza == null) {
            return false;
        }
        return com.google.android.gms.internal.ads.zzqm.zzK() || android.os.SystemClock.elapsedRealtime() < this.zzc;
    }
}

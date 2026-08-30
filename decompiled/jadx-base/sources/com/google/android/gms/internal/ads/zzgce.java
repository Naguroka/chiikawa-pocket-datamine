package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgce implements java.lang.Runnable {
    final java.util.concurrent.Future zza;
    final com.google.android.gms.internal.ads.zzgcd zzb;

    zzgce(java.util.concurrent.Future future, com.google.android.gms.internal.ads.zzgcd zzgcdVar) {
        this.zza = future;
        this.zzb = zzgcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable thZza;
        java.lang.Object obj = this.zza;
        if ((obj instanceof com.google.android.gms.internal.ads.zzgdl) && (thZza = com.google.android.gms.internal.ads.zzgdm.zza((com.google.android.gms.internal.ads.zzgdl) obj)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(com.google.android.gms.internal.ads.zzgch.zzp(this.zza));
        } catch (java.util.concurrent.ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (java.lang.Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzfuh zzfuhVarZza = com.google.android.gms.internal.ads.zzfuj.zza(this);
        zzfuhVarZza.zza(this.zzb);
        return zzfuhVarZza.toString();
    }
}

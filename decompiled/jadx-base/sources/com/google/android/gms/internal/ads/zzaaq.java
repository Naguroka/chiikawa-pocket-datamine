package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaaq {
    private final com.google.android.gms.internal.ads.zzaal zza;
    private com.google.android.gms.internal.ads.zzcd zzf;
    private long zzh;
    private final com.google.android.gms.internal.ads.zzzx zzj;
    private final com.google.android.gms.internal.ads.zzaaj zzb = new com.google.android.gms.internal.ads.zzaaj();
    private final com.google.android.gms.internal.ads.zzee zzc = new com.google.android.gms.internal.ads.zzee(10);
    private final com.google.android.gms.internal.ads.zzee zzd = new com.google.android.gms.internal.ads.zzee(10);
    private final com.google.android.gms.internal.ads.zzdq zze = new com.google.android.gms.internal.ads.zzdq(16);
    private com.google.android.gms.internal.ads.zzcd zzg = com.google.android.gms.internal.ads.zzcd.zza;
    private long zzi = androidx.media3.common.C.TIME_UNSET;

    public zzaaq(com.google.android.gms.internal.ads.zzzx zzzxVar, com.google.android.gms.internal.ads.zzaal zzaalVar) {
        this.zzj = zzzxVar;
        this.zza = zzaalVar;
    }

    private static java.lang.Object zzf(com.google.android.gms.internal.ads.zzee zzeeVar) {
        com.google.android.gms.internal.ads.zzcw.zzd(zzeeVar.zza() > 0);
        while (zzeeVar.zza() > 1) {
            zzeeVar.zzb();
        }
        java.lang.Object objZzb = zzeeVar.zzb();
        objZzb.getClass();
        return objZzb;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = androidx.media3.common.C.TIME_UNSET;
        com.google.android.gms.internal.ads.zzee zzeeVar = this.zzd;
        if (zzeeVar.zza() > 0) {
            this.zzd.zzd(0L, java.lang.Long.valueOf(((java.lang.Long) zzf(zzeeVar)).longValue()));
        }
        if (this.zzf != null) {
            this.zzc.zze();
            return;
        }
        com.google.android.gms.internal.ads.zzee zzeeVar2 = this.zzc;
        if (zzeeVar2.zza() > 0) {
            this.zzf = (com.google.android.gms.internal.ads.zzcd) zzf(zzeeVar2);
        }
    }

    public final void zzb(int i, int i2) {
        this.zzf = new com.google.android.gms.internal.ads.zzcd(i, i2, 1.0f);
    }

    public final void zzc(long j, long j2) {
        this.zzd.zzd(j, java.lang.Long.valueOf(j2));
    }

    public final void zzd(long j, long j2) throws com.google.android.gms.internal.ads.zzib {
        while (true) {
            com.google.android.gms.internal.ads.zzdq zzdqVar = this.zze;
            if (zzdqVar.zzd()) {
                return;
            }
            com.google.android.gms.internal.ads.zzee zzeeVar = this.zzd;
            long jZza = zzdqVar.zza();
            java.lang.Long l = (java.lang.Long) zzeeVar.zzc(jZza);
            if (l != null && l.longValue() != this.zzh) {
                this.zzh = l.longValue();
                this.zza.zzf();
            }
            int iZza = this.zza.zza(jZza, j, j2, this.zzh, false, this.zzb);
            if (iZza != 0 && iZza != 1) {
                if (iZza == 2 || iZza == 3 || iZza == 4) {
                    this.zzi = jZza;
                    this.zze.zzb();
                    com.google.android.gms.internal.ads.zzzx zzzxVar = this.zzj;
                    java.util.Iterator it = zzzxVar.zza.zzj.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.zzaac) it.next()).zzz(zzzxVar.zza);
                    }
                    com.google.android.gms.internal.ads.zzbm zzbmVar = null;
                    com.google.android.gms.internal.ads.zzcw.zzb(null);
                    zzbmVar.zza();
                    throw null;
                }
                return;
            }
            this.zzi = jZza;
            long jLongValue = java.lang.Long.valueOf(this.zze.zzb()).longValue();
            com.google.android.gms.internal.ads.zzcd zzcdVar = (com.google.android.gms.internal.ads.zzcd) this.zzc.zzc(jLongValue);
            if (zzcdVar != null && !zzcdVar.equals(com.google.android.gms.internal.ads.zzcd.zza) && !zzcdVar.equals(this.zzg)) {
                this.zzg = zzcdVar;
                this.zzj.zza(zzcdVar);
            }
            this.zzj.zzb(iZza == 0 ? -1L : this.zzb.zzd(), jLongValue, this.zza.zzp());
        }
    }

    public final boolean zze(long j) {
        long j2 = this.zzi;
        return j2 != androidx.media3.common.C.TIME_UNSET && j2 >= j;
    }
}

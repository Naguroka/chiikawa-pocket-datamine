package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbn {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzdrw zzb;
    private final java.lang.Object zzc = new java.lang.Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfbn(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = clock;
        this.zzb = zzdrwVar;
    }

    private final void zze() {
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            if (this.zze == 3) {
                if (this.zzd + ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfP)).longValue() <= jCurrentTimeMillis) {
                    this.zze = 1;
                }
            }
        }
    }

    private final void zzf(int i, int i2) {
        zze();
        java.lang.Object obj = this.zzc;
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            if (this.zze != i) {
                return;
            }
            this.zze = i2;
            if (this.zze == 3) {
                this.zzd = jCurrentTimeMillis;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmS)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zzb.zza();
            zzdrvVarZza.zzb("action", "mbs_state");
            zzdrvVarZza.zzb("mbs_state", true != z ? "0" : "1");
            zzdrvVarZza.zzg();
        }
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 3;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 2;
        }
        return z;
    }
}

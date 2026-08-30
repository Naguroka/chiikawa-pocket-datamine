package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbzk {
    private final java.lang.Object zza = new java.lang.Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbzk() {
    }

    /* synthetic */ zzbzk(com.google.android.gms.internal.ads.zzbzl zzbzlVar) {
    }

    public final void zza() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfP)).longValue() <= jCurrentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = jCurrentTimeMillis2;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcbm {
    private long zzb;
    private final long zza = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzQ)).longValue());
    private boolean zzc = true;

    zzcbm() {
    }

    public final void zza(android.graphics.SurfaceTexture surfaceTexture, final com.google.android.gms.internal.ads.zzcax zzcaxVar) {
        if (zzcaxVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (java.lang.Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        com.google.android.gms.internal.ads.zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        java.util.Objects.requireNonNull(zzcaxVar);
        zzfqwVar.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcbl
            @Override // java.lang.Runnable
            public final void run() {
                zzcaxVar.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}

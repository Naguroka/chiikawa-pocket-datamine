package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcbu implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzcbg zza;
    private boolean zzb = false;

    zzcbu(com.google.android.gms.internal.ads.zzcbg zzcbgVar) {
        this.zza = zzcbgVar;
    }

    private final void zzc() {
        com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbnm extends com.google.android.gms.internal.ads.zzcai {
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzbnr zzb;
    private boolean zzc;

    public zzbnm(com.google.android.gms.internal.ads.zzbnr zzbnrVar) {
        this.zzb = zzbnrVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new com.google.android.gms.internal.ads.zzbnj(this), new com.google.android.gms.internal.ads.zzcae());
            zzj(new com.google.android.gms.internal.ads.zzbnk(this), new com.google.android.gms.internal.ads.zzbnl(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmx {
    private final java.util.concurrent.BlockingQueue zza;
    private final java.util.concurrent.ThreadPoolExecutor zzb;
    private final java.util.ArrayDeque zzc = new java.util.ArrayDeque();
    private com.google.android.gms.internal.ads.zzfmw zzd = null;

    public zzfmx() {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new java.util.concurrent.ThreadPoolExecutor(1, 1, 1L, java.util.concurrent.TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        com.google.android.gms.internal.ads.zzfmw zzfmwVar = (com.google.android.gms.internal.ads.zzfmw) this.zzc.poll();
        this.zzd = zzfmwVar;
        if (zzfmwVar != null) {
            zzfmwVar.executeOnExecutor(this.zzb, new java.lang.Object[0]);
        }
    }

    public final void zza(com.google.android.gms.internal.ads.zzfmw zzfmwVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfmw zzfmwVar) {
        zzfmwVar.zzb(this);
        this.zzc.add(zzfmwVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}

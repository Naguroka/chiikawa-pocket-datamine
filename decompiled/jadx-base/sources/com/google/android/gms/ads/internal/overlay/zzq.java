package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzq implements java.util.concurrent.Callable {
    private final long zza;

    zzq(long j) {
        this.zza = j;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        if (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzz.remove(java.lang.Long.valueOf(this.zza)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzw(new java.lang.Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}

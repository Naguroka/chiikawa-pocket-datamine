package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzemp {
    private final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.google.android.gms.internal.ads.zzemo zzb;

    final com.google.android.gms.internal.ads.zzemo zza() {
        return this.zzb;
    }

    final void zzb(com.google.android.gms.internal.ads.zzemo zzemoVar) {
        this.zzb = zzemoVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}

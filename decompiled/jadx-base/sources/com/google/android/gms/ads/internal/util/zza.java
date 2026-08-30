package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzb zza;

    zza(com.google.android.gms.ads.internal.util.zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb = java.lang.Thread.currentThread();
        this.zza.zza();
    }
}

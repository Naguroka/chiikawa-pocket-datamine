package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlc implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzc;

    zzlc(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.util.concurrent.atomic.AtomicReference atomicReference, boolean z) {
        this.zza = atomicReference;
        this.zzb = z;
        this.zzc = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzu.zzu().zzJ(this.zza, this.zzb);
    }
}

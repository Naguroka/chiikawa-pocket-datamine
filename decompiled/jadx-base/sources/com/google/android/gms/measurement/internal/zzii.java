package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzii implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzil zza;
    private final java.lang.String zzb;

    public zzii(com.google.android.gms.measurement.internal.zzil zzilVar, java.lang.String str) {
        this.zza = zzilVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.zza.zzu.zzaW().zze().zzb(this.zzb, th);
    }
}

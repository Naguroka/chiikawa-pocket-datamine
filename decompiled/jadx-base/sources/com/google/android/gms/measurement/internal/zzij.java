package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzij extends java.util.concurrent.FutureTask implements java.lang.Comparable {
    final boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzil zzb;
    private final long zzc;
    private final java.lang.String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzij(com.google.android.gms.measurement.internal.zzil zzilVar, java.lang.Runnable runnable, boolean z, java.lang.String str) {
        super(runnable, null);
        this.zzb = zzilVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        long andIncrement = com.google.android.gms.measurement.internal.zzil.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzilVar.zzu.zzaW().zze().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        com.google.android.gms.measurement.internal.zzij zzijVar = (com.google.android.gms.measurement.internal.zzij) obj;
        boolean z = zzijVar.zza;
        boolean z2 = this.zza;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = this.zzc;
        long j2 = zzijVar.zzc;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzb.zzu.zzaW().zzh().zzb("Two tasks share the same index. index", java.lang.Long.valueOf(j));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(java.lang.Throwable th) {
        java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzu.zzaW().zze().zzb(this.zzd, th);
        if ((th instanceof com.google.android.gms.measurement.internal.zzih) && (defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzij(com.google.android.gms.measurement.internal.zzil zzilVar, java.util.concurrent.Callable callable, boolean z, java.lang.String str) {
        super(callable);
        this.zzb = zzilVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = com.google.android.gms.measurement.internal.zzil.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzilVar.zzu.zzaW().zze().zza("Tasks index overflow");
        }
    }
}

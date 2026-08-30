package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzks implements java.util.concurrent.Executor {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zza;

    zzks(com.google.android.gms.measurement.internal.zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.zzu.zzaX().zzq(runnable);
    }
}

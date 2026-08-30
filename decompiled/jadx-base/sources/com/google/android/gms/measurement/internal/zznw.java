package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zznw(com.google.android.gms.measurement.internal.zznx zznxVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zza = connectionResult;
        this.zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zzb.zza;
        zznyVar.zzb = null;
        if (!zznyVar.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbo) || this.zza.getErrorCode() != 7777) {
            zznyVar.zzaf();
            return;
        }
        if (zznyVar.zze == null) {
            zznyVar.zze = java.util.concurrent.Executors.newScheduledThreadPool(1);
        }
        zznyVar.zze.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznv
            @Override // java.lang.Runnable
            public final void run() {
                final com.google.android.gms.measurement.internal.zzny zznyVar2 = this.zza.zzb.zza;
                com.google.android.gms.measurement.internal.zzil zzilVarZzaX = zznyVar2.zzu.zzaX();
                java.util.Objects.requireNonNull(zznyVar2);
                zzilVarZzaX.zzq(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zznyVar2.zzB();
                    }
                });
            }
        }, ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzY.zza(null)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}

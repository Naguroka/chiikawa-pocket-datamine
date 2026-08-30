package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzqb zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzd;

    zzmy(com.google.android.gms.measurement.internal.zzny zznyVar, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, com.google.android.gms.measurement.internal.zzqb zzqbVar) {
        this.zza = zzrVar;
        this.zzb = z;
        this.zzc = zzqbVar;
        this.zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zzd;
        com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("Discarding data. Failed to set user property");
            return;
        }
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        zznyVar.zzP(zzglVar, this.zzb ? null : this.zzc, zzrVar);
        zznyVar.zzag();
    }
}

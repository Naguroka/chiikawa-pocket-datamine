package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzng implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbf zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zze;

    zzng(com.google.android.gms.measurement.internal.zzny zznyVar, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z2, com.google.android.gms.measurement.internal.zzbf zzbfVar, android.os.Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z2;
        this.zzc = zzbfVar;
        this.zzd = bundle;
        this.zze = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzny zznyVar = this.zze;
        com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
        if (zzglVar == null) {
            zznyVar.zzu.zzaW().zze().zza("Failed to send default event parameters to service");
            return;
        }
        if (zznyVar.zzu.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzbl)) {
            com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
            this.zze.zzP(zzglVar, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzrVar2 = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar2);
            zzglVar.zzx(this.zzd, zzrVar2);
            zznyVar.zzag();
        } catch (android.os.RemoteException e) {
            this.zze.zzu.zzaW().zze().zzb("Failed to send default event parameters to service", e);
        }
    }
}

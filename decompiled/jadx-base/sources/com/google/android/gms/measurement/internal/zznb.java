package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzc;

    zznb(com.google.android.gms.measurement.internal.zzny zznyVar, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = zzrVar;
        this.zzb = zzcyVar;
        this.zzc = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcy zzcyVar;
        com.google.android.gms.measurement.internal.zzqf zzqfVarZzw;
        java.lang.String strZzf = null;
        try {
            try {
                com.google.android.gms.measurement.internal.zzny zznyVar = this.zzc;
                com.google.android.gms.measurement.internal.zzio zzioVar = zznyVar.zzu;
                if (zzioVar.zzm().zzh().zzr(com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE)) {
                    com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                    if (zzglVar != null) {
                        com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                        strZzf = zzglVar.zzf(zzrVar);
                        if (strZzf != null) {
                            zznyVar.zzu.zzq().zzac(strZzf);
                            zzioVar.zzm().zze.zzb(strZzf);
                        }
                        zznyVar.zzag();
                        com.google.android.gms.measurement.internal.zzny zznyVar2 = this.zzc;
                        zzcyVar = this.zzb;
                        zzqfVarZzw = zznyVar2.zzu.zzw();
                        zzqfVarZzw.zzZ(zzcyVar, strZzf);
                    }
                    zzioVar.zzaW().zze().zza("Failed to get app instance id");
                } else {
                    zzioVar.zzaW().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    zznyVar.zzu.zzq().zzac(null);
                    zzioVar.zzm().zze.zzb(null);
                }
                zzqfVarZzw = zzioVar.zzw();
                zzcyVar = this.zzb;
            } catch (android.os.RemoteException e) {
                this.zzc.zzu.zzaW().zze().zzb("Failed to get app instance id", e);
            }
            zzqfVarZzw.zzZ(zzcyVar, strZzf);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.measurement.internal.zzny zznyVar3 = this.zzc;
            zznyVar3.zzu.zzw().zzZ(this.zzb, null);
            throw th;
        }
    }
}

package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzno implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zze;

    zzno(com.google.android.gms.measurement.internal.zzny zznyVar, java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = zzcyVar;
        this.zze = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcy zzcyVar;
        com.google.android.gms.measurement.internal.zzqf zzqfVarZzw;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
                com.google.android.gms.measurement.internal.zzny zznyVar = this.zze;
                com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                if (zzglVar == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVar = zznyVar.zzu;
                    zzioVar.zzaW().zze().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    zzqfVarZzw = zzioVar.zzw();
                    zzcyVar = this.zzd;
                } else {
                    com.google.android.gms.measurement.internal.zzr zzrVar = this.zzc;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                    arrayList = com.google.android.gms.measurement.internal.zzqf.zzK(zzglVar.zzi(this.zza, this.zzb, zzrVar));
                    zznyVar.zzag();
                    com.google.android.gms.measurement.internal.zzny zznyVar2 = this.zze;
                    zzcyVar = this.zzd;
                    zzqfVarZzw = zznyVar2.zzu.zzw();
                }
            } catch (android.os.RemoteException e) {
                this.zze.zzu.zzaW().zze().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            }
            zzqfVarZzw.zzU(zzcyVar, arrayList);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.measurement.internal.zzny zznyVar3 = this.zze;
            zznyVar3.zzu.zzw().zzU(this.zzd, arrayList);
            throw th;
        }
    }
}

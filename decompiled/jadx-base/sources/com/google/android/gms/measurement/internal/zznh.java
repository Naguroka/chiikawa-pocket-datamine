package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznh implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzd;

    zznh(com.google.android.gms.measurement.internal.zzny zznyVar, com.google.android.gms.measurement.internal.zzbh zzbhVar, java.lang.String str, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = zzbhVar;
        this.zzb = str;
        this.zzc = zzcyVar;
        this.zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcy zzcyVar;
        com.google.android.gms.measurement.internal.zzqf zzqfVarZzw;
        byte[] bArrZzD = null;
        try {
            try {
                com.google.android.gms.measurement.internal.zzny zznyVar = this.zzd;
                com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                if (zzglVar == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVar = zznyVar.zzu;
                    zzioVar.zzaW().zze().zza("Discarding data. Failed to send event to service to bundle");
                    zzqfVarZzw = zzioVar.zzw();
                    zzcyVar = this.zzc;
                } else {
                    bArrZzD = zzglVar.zzD(this.zza, this.zzb);
                    zznyVar.zzag();
                    com.google.android.gms.measurement.internal.zzny zznyVar2 = this.zzd;
                    zzcyVar = this.zzc;
                    zzqfVarZzw = zznyVar2.zzu.zzw();
                }
            } catch (android.os.RemoteException e) {
                this.zzd.zzu.zzaW().zze().zzb("Failed to send event to the service to bundle", e);
            }
            zzqfVarZzw.zzW(zzcyVar, bArrZzD);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.measurement.internal.zzny zznyVar3 = this.zzd;
            zznyVar3.zzu.zzw().zzW(this.zzc, null);
            throw th;
        }
    }
}

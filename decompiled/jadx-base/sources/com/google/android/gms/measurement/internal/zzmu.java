package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmu implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzf;

    zzmu(com.google.android.gms.measurement.internal.zzny zznyVar, java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z;
        this.zze = zzcyVar;
        this.zzf = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        android.os.Bundle bundle;
        android.os.RemoteException e;
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            try {
                com.google.android.gms.measurement.internal.zzny zznyVar = this.zzf;
                com.google.android.gms.measurement.internal.zzgl zzglVar = zznyVar.zzb;
                if (zzglVar == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVar = zznyVar.zzu;
                    zzioVar.zzaW().zze().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    zzioVar.zzw().zzV(this.zze, bundle2);
                    return;
                }
                com.google.android.gms.measurement.internal.zzr zzrVar = this.zzc;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                java.util.List<com.google.android.gms.measurement.internal.zzqb> listZzk = zzglVar.zzk(this.zza, this.zzb, this.zzd, zzrVar);
                int i = com.google.android.gms.measurement.internal.zzqf.zza;
                bundle = new android.os.Bundle();
                if (listZzk != null) {
                    for (com.google.android.gms.measurement.internal.zzqb zzqbVar : listZzk) {
                        java.lang.String str = zzqbVar.zze;
                        if (str != null) {
                            bundle.putString(zzqbVar.zzb, str);
                        } else {
                            java.lang.Long l = zzqbVar.zzd;
                            if (l != null) {
                                bundle.putLong(zzqbVar.zzb, l.longValue());
                            } else {
                                java.lang.Double d = zzqbVar.zzg;
                                if (d != null) {
                                    bundle.putDouble(zzqbVar.zzb, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    zznyVar.zzag();
                    com.google.android.gms.measurement.internal.zzio zzioVar2 = zznyVar.zzu;
                    zzioVar2.zzw().zzV(this.zze, bundle);
                } catch (android.os.RemoteException e2) {
                    e = e2;
                    this.zzf.zzu.zzaW().zze().zzc("Failed to get user properties; remote exception", this.zza, e);
                    com.google.android.gms.measurement.internal.zzny zznyVar2 = this.zzf;
                    zznyVar2.zzu.zzw().zzV(this.zze, bundle);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                bundle2 = bundle;
                com.google.android.gms.measurement.internal.zzny zznyVar3 = this.zzf;
                zznyVar3.zzu.zzw().zzV(this.zze, bundle2);
                throw th;
            }
        } catch (android.os.RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (java.lang.Throwable th2) {
            th = th2;
            com.google.android.gms.measurement.internal.zzny zznyVar4 = this.zzf;
            zznyVar4.zzu.zzw().zzV(this.zze, bundle2);
            throw th;
        }
    }
}

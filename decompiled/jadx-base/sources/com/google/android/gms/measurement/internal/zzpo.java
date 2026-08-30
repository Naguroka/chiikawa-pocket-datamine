package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpo implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zzb;

    zzpo(com.google.android.gms.measurement.internal.zzpv zzpvVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzrVar;
        this.zzb = zzpvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
        java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzb;
        com.google.android.gms.measurement.internal.zzjx zzjxVarZzu = zzpvVar.zzu(str);
        com.google.android.gms.measurement.internal.zzjw zzjwVar = com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE;
        if (zzjxVarZzu.zzr(zzjwVar) && com.google.android.gms.measurement.internal.zzjx.zzk(zzrVar.zzu, 100).zzr(zzjwVar)) {
            return zzpvVar.zzg(zzrVar).zzD();
        }
        zzpvVar.zzaW().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzqb zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjm(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzqb zzqbVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzqbVar;
        this.zzb = zzrVar;
        this.zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzc;
        zzjpVar.zza.zzL();
        com.google.android.gms.measurement.internal.zzqb zzqbVar = this.zza;
        if (zzqbVar.zza() == null) {
            zzjpVar.zza.zzag(zzqbVar.zzb, this.zzb);
        } else {
            zzjpVar.zza.zzas(zzqbVar, this.zzb);
        }
    }
}

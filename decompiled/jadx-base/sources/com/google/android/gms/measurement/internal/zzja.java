package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzja implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzai zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzb;

    zzja(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzai zzaiVar) {
        this.zza = zzaiVar;
        this.zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzb;
        zzjpVar.zza.zzL();
        com.google.android.gms.measurement.internal.zzai zzaiVar = this.zza;
        if (zzaiVar.zzc.zza() == null) {
            zzjpVar.zza.zzae(zzaiVar);
        } else {
            zzjpVar.zza.zzan(zzaiVar);
        }
    }
}

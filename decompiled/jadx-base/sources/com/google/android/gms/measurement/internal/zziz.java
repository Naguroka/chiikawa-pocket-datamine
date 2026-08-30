package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zziz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzai zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zziz(com.google.android.gms.measurement.internal.zzjp zzjpVar, com.google.android.gms.measurement.internal.zzai zzaiVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzaiVar;
        this.zzb = zzrVar;
        this.zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjp zzjpVar = this.zzc;
        zzjpVar.zza.zzL();
        com.google.android.gms.measurement.internal.zzai zzaiVar = this.zza;
        if (zzaiVar.zzc.zza() == null) {
            zzjpVar.zza.zzaf(zzaiVar, this.zzb);
        } else {
            zzjpVar.zza.zzao(zzaiVar, this.zzb);
        }
    }
}

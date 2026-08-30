package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzml implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zzb;

    zzml(com.google.android.gms.measurement.internal.zzmo zzmoVar, long j) {
        this.zza = j;
        this.zzb = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzmo zzmoVar = this.zzb;
        zzmoVar.zzu.zzd().zzf(this.zza);
        zzmoVar.zza = null;
    }
}

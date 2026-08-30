package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzkx implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzkx(com.google.android.gms.measurement.internal.zzlw zzlwVar, long j) {
        this.zza = j;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzb.zzu;
        com.google.android.gms.measurement.internal.zzhp zzhpVar = zzioVar.zzm().zzf;
        long j = this.zza;
        zzhpVar.zzb(j);
        zzioVar.zzaW().zzd().zzb("Session timeout duration set", java.lang.Long.valueOf(j));
    }
}

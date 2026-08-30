package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzay implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjs zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzaz zzb;

    zzay(com.google.android.gms.measurement.internal.zzaz zzazVar, com.google.android.gms.measurement.internal.zzjs zzjsVar) {
        this.zza = zzjsVar;
        this.zzb = zzazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjs zzjsVar = this.zza;
        zzjsVar.zzaV();
        if (com.google.android.gms.measurement.internal.zzaf.zza()) {
            zzjsVar.zzaX().zzq(this);
            return;
        }
        com.google.android.gms.measurement.internal.zzaz zzazVar = this.zzb;
        boolean zZze = zzazVar.zze();
        zzazVar.zzd = 0L;
        if (zZze) {
            zzazVar.zzc();
        }
    }
}

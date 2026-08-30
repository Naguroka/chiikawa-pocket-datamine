package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzeu implements java.lang.Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzk;

    zzeu(com.google.android.gms.internal.measurement.zzff zzffVar, boolean z) {
        this.zzk = zzffVar;
        this.zzh = zzffVar.zza.currentTimeMillis();
        this.zzi = zzffVar.zza.elapsedRealtime();
        this.zzj = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (java.lang.Exception e) {
            this.zzk.zzU(e, false, this.zzj);
            zzb();
        }
    }

    abstract void zza() throws android.os.RemoteException;

    protected void zzb() {
    }
}

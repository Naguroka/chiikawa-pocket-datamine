package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.appset.zzl zza;

    /* synthetic */ zzj(com.google.android.gms.internal.appset.zzl zzlVar, com.google.android.gms.internal.appset.zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jZza = this.zza.zza();
        if (jZza == -1 || com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis() <= jZza) {
            return;
        }
        com.google.android.gms.internal.appset.zzl.zze(this.zza.zzb);
    }
}

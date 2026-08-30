package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class AppMeasurementService extends android.app.Service implements com.google.android.gms.measurement.internal.zzof {
    private com.google.android.gms.measurement.internal.zzog zza;

    private final com.google.android.gms.measurement.internal.zzog zzd() {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzog(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return zzd().zzb(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zzf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzg();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        zzd();
        com.google.android.gms.measurement.internal.zzog.zzi(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        zzd().zza(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        zzd();
        com.google.android.gms.measurement.internal.zzog.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final void zza(android.content.Intent intent) {
        com.google.android.gms.measurement.AppMeasurementReceiver.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final void zzb(android.app.job.JobParameters jobParameters, boolean z) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final boolean zzc(int i) {
        return stopSelfResult(i);
    }
}

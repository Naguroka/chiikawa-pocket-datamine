package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class AppMeasurementJobService extends android.app.job.JobService implements com.google.android.gms.measurement.internal.zzof {
    private com.google.android.gms.measurement.internal.zzog zza;

    private final com.google.android.gms.measurement.internal.zzog zzd() {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzog(this);
        }
        return this.zza;
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

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        zzd().zzh(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        zzd();
        com.google.android.gms.measurement.internal.zzog.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final void zza(android.content.Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final void zzb(android.app.job.JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final boolean zzc(int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}

package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzmd extends com.google.android.gms.measurement.internal.zzg {
    private android.app.job.JobScheduler zza;

    public zzmd(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzd() {
        this.zza = (android.app.job.JobScheduler) this.zzu.zzaT().getSystemService("jobscheduler");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return true;
    }

    final int zzh() {
        return "measurement-client".concat(java.lang.String.valueOf(this.zzu.zzaT().getPackageName())).hashCode();
    }

    final com.google.android.gms.internal.measurement.zzih zzi() {
        zza();
        zzg();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzx(null, com.google.android.gms.measurement.internal.zzgi.zzaR)) {
            return com.google.android.gms.internal.measurement.zzih.CLIENT_FLAG_OFF;
        }
        if (this.zza == null) {
            return com.google.android.gms.internal.measurement.zzih.MISSING_JOB_SCHEDULER;
        }
        if (!zzioVar.zzf().zzE()) {
            return com.google.android.gms.internal.measurement.zzih.NOT_ENABLED_IN_MANIFEST;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar2 = this.zzu;
        if (zzioVar2.zzh().zzj() < 119000) {
            return com.google.android.gms.internal.measurement.zzih.SDK_TOO_OLD;
        }
        if (com.google.android.gms.measurement.internal.zzqf.zzas(zzioVar.zzaT(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return !zzioVar2.zzu().zzad() ? com.google.android.gms.internal.measurement.zzih.NON_PLAY_MODE : com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE;
        }
        return com.google.android.gms.internal.measurement.zzih.MEASUREMENT_SERVICE_NOT_ENABLED;
    }

    public final void zzj(long j) {
        zza();
        zzg();
        android.app.job.JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob(zzh()) != null) {
            this.zzu.zzaW().zzj().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.zzih zzihVarZzi = zzi();
        if (zzihVarZzi != com.google.android.gms.internal.measurement.zzih.CLIENT_UPLOAD_ELIGIBLE) {
            this.zzu.zzaW().zzj().zzb("[sgtm] Not eligible for Scion upload", zzihVarZzi.name());
            return;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzj().zzb("[sgtm] Scheduling Scion upload, millis", java.lang.Long.valueOf(j));
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        zzioVar.zzaW().zzj().zzb("[sgtm] Scion upload job scheduled with result", ((android.app.job.JobScheduler) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza)).schedule(new android.app.job.JobInfo.Builder(zzh(), new android.content.ComponentName(zzioVar.zzaT(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }
}

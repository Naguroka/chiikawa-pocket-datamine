package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzoy extends com.google.android.gms.measurement.internal.zzpg {
    private final android.app.AlarmManager zza;
    private com.google.android.gms.measurement.internal.zzaz zzb;
    private java.lang.Integer zzc;

    protected zzoy(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
        this.zza = (android.app.AlarmManager) this.zzu.zzaT().getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = java.lang.Integer.valueOf("measurement".concat(java.lang.String.valueOf(this.zzu.zzaT().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final android.app.PendingIntent zzh() {
        android.content.Context contextZzaT = this.zzu.zzaT();
        return android.app.PendingIntent.getBroadcast(contextZzaT, 0, new android.content.Intent().setClassName(contextZzaT, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcj.zza);
    }

    private final com.google.android.gms.measurement.internal.zzaz zzi() {
        if (this.zzb == null) {
            this.zzb = new com.google.android.gms.measurement.internal.zzox(this, this.zzg.zzt());
        }
        return this.zzb;
    }

    private final void zzj() {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) this.zzu.zzaT().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzav();
        this.zzu.zzaW().zzj().zza("Unscheduling upload");
        android.app.AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        android.app.AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzj();
        return false;
    }

    public final void zzd(long j) {
        zzav();
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zzu;
        zzioVar.zzaV();
        android.content.Context contextZzaT = zzioVar.zzaT();
        if (!com.google.android.gms.measurement.internal.zzqf.zzar(contextZzaT)) {
            zzioVar.zzaW().zzd().zza("Receiver not registered/enabled");
        }
        if (!com.google.android.gms.measurement.internal.zzqf.zzat(contextZzaT, false)) {
            zzioVar.zzaW().zzd().zza("Service not registered/enabled");
        }
        zza();
        zzioVar.zzaW().zzj().zzb("Scheduling upload, millis", java.lang.Long.valueOf(j));
        zzioVar.zzaU().elapsedRealtime();
        zzioVar.zzf();
        if (j < java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzgi.zzK.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j);
        }
        zzioVar.zzaV();
        android.content.Context contextZzaT2 = zzioVar.zzaT();
        android.content.ComponentName componentName = new android.content.ComponentName(contextZzaT2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzf = zzf();
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzck.zza(contextZzaT2, new android.app.job.JobInfo.Builder(iZzf, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}

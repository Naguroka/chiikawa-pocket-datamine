package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzog {
    private final android.content.Context zza;

    public zzog(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zza = context;
    }

    public static /* synthetic */ void zzc(com.google.android.gms.measurement.internal.zzog zzogVar, android.app.job.JobParameters jobParameters) {
        android.util.Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((com.google.android.gms.measurement.internal.zzof) zzogVar.zza).zzb(jobParameters, false);
    }

    public static /* synthetic */ void zzd(com.google.android.gms.measurement.internal.zzog zzogVar, com.google.android.gms.measurement.internal.zzhe zzheVar, android.app.job.JobParameters jobParameters) {
        zzheVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((com.google.android.gms.measurement.internal.zzof) zzogVar.zza).zzb(jobParameters, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zze(com.google.android.gms.measurement.internal.zzog zzogVar, int i, com.google.android.gms.measurement.internal.zzhe zzheVar, android.content.Intent intent) {
        android.content.Context context = zzogVar.zza;
        com.google.android.gms.measurement.internal.zzof zzofVar = (com.google.android.gms.measurement.internal.zzof) context;
        if (zzofVar.zzc(i)) {
            zzheVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", java.lang.Integer.valueOf(i));
            com.google.android.gms.measurement.internal.zzio.zzp(context, null, null).zzaW().zzj().zza("Completed wakeful intent.");
            zzofVar.zza(intent);
        }
    }

    public static final void zzi(android.content.Intent intent) {
        if (intent == null) {
            android.util.Log.e("FA", "onRebind called with null intent");
        } else {
            android.util.Log.v("FA", "onRebind called. action: ".concat(java.lang.String.valueOf(intent.getAction())));
        }
    }

    public static final boolean zzj(android.content.Intent intent) {
        if (intent == null) {
            android.util.Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        android.util.Log.v("FA", "onUnbind called for intent. action: ".concat(java.lang.String.valueOf(intent.getAction())));
        return true;
    }

    private final void zzk(com.google.android.gms.measurement.internal.zzpv zzpvVar, java.lang.Runnable runnable) {
        zzpvVar.zzaX().zzq(new com.google.android.gms.measurement.internal.zzoe(this, zzpvVar, runnable));
    }

    public final int zza(final android.content.Intent intent, int i, final int i2) {
        if (intent == null) {
            android.util.Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        android.content.Context context = this.zza;
        com.google.android.gms.measurement.internal.zzio zzioVarZzp = com.google.android.gms.measurement.internal.zzio.zzp(context, null, null);
        final com.google.android.gms.measurement.internal.zzhe zzheVarZzaW = zzioVarZzp.zzaW();
        java.lang.String action = intent.getAction();
        zzioVarZzp.zzaV();
        zzheVarZzaW.zzj().zzc("Local AppMeasurementService called. startId, action", java.lang.Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzk(com.google.android.gms.measurement.internal.zzpv.zzz(context), new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzoc
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.zzog.zze(this.zza, i2, zzheVarZzaW, intent);
                }
            });
        }
        return 2;
    }

    public final android.os.IBinder zzb(android.content.Intent intent) {
        if (intent == null) {
            android.util.Log.e("FA", "onBind called with null intent");
            return null;
        }
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new com.google.android.gms.measurement.internal.zzjp(com.google.android.gms.measurement.internal.zzpv.zzz(this.zza), null);
        }
        android.util.Log.w("FA", "onBind received unknown action: ".concat(java.lang.String.valueOf(action)));
        return null;
    }

    public final void zzf() {
        android.util.Log.v("FA", java.lang.String.valueOf(this.zza.getClass().getSimpleName()).concat(" is starting up."));
    }

    public final void zzg() {
        android.util.Log.v("FA", java.lang.String.valueOf(this.zza.getClass().getSimpleName()).concat(" is shutting down."));
    }

    public final boolean zzh(final android.app.job.JobParameters jobParameters) {
        java.lang.String string = jobParameters.getExtras().getString("action");
        android.util.Log.v("FA", "onStartJob received action: ".concat(java.lang.String.valueOf(string)));
        if (java.util.Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(string);
            com.google.android.gms.measurement.internal.zzpv zzpvVarZzz = com.google.android.gms.measurement.internal.zzpv.zzz(this.zza);
            final com.google.android.gms.measurement.internal.zzhe zzheVarZzaW = zzpvVarZzz.zzaW();
            zzpvVarZzz.zzaV();
            zzheVarZzaW.zzj().zzb("Local AppMeasurementJobService called. action", str);
            zzk(zzpvVarZzz, new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzod
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.measurement.internal.zzog.zzd(this.zza, zzheVarZzaW, jobParameters);
                }
            });
        }
        if (!java.util.Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.zzff zzffVarZzg = com.google.android.gms.internal.measurement.zzff.zzg(this.zza, null, null, null, null);
        if (!((java.lang.Boolean) com.google.android.gms.measurement.internal.zzgi.zzaT.zza(null)).booleanValue()) {
            return true;
        }
        zzffVarZzg.zzE(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzob
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.measurement.internal.zzog.zzc(this.zza, jobParameters);
            }
        });
        return true;
    }
}

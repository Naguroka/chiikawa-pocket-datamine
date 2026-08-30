package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlg implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlg(com.google.android.gms.measurement.internal.zzlw zzlwVar, android.os.Bundle bundle) {
        this.zza = bundle;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zzlwVar.zza();
        android.os.Bundle bundle = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        java.lang.String strCheckNotEmpty = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzlwVar.zzu.zzJ()) {
            zzlwVar.zzu.zzaW().zzj().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzlwVar.zzu.zzu().zzQ(new com.google.android.gms.measurement.internal.zzai(bundle.getString("app_id"), "", new com.google.android.gms.measurement.internal.zzqb(strCheckNotEmpty, 0L, null, ""), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzlwVar.zzu.zzw().zzC(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }
}

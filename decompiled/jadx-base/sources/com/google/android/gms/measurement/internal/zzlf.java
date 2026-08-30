package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlf implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlf(com.google.android.gms.measurement.internal.zzlw zzlwVar, android.os.Bundle bundle) {
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
        java.lang.String string = bundle.getString("name");
        java.lang.String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(string);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(string2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle.get("value"));
        if (!zzlwVar.zzu.zzJ()) {
            zzlwVar.zzu.zzaW().zzj().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        com.google.android.gms.measurement.internal.zzqb zzqbVar = new com.google.android.gms.measurement.internal.zzqb(string, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), string2);
        try {
            com.google.android.gms.measurement.internal.zzio zzioVar = zzlwVar.zzu;
            com.google.android.gms.measurement.internal.zzbh zzbhVarZzC = zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true, true);
            zzlwVar.zzu.zzu().zzQ(new com.google.android.gms.measurement.internal.zzai(bundle.getString("app_id"), string2, zzqbVar, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true, true), bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzbhVarZzC, bundle.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzioVar.zzw().zzC(bundle.getString("app_id"), bundle.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true, true)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }
}

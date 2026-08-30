package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpj implements com.google.android.gms.internal.measurement.zzpi {
    public static final com.google.android.gms.internal.measurement.zzki zza;
    public static final com.google.android.gms.internal.measurement.zzki zzb;
    public static final com.google.android.gms.internal.measurement.zzki zzc;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zzkfVarZza.zzf("measurement.set_default_event_parameters_with_backfill.service", true);
        zzkfVarZza.zzd("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        zza = zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_app_update_logging", true);
        zzb = zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_deferred_analytics_collection", true);
        zzc = zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        zzkfVarZza.zzf("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zzb() {
        return ((java.lang.Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zzc() {
        return ((java.lang.Boolean) zzc.zzb()).booleanValue();
    }
}

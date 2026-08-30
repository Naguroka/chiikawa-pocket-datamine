package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpm implements com.google.android.gms.internal.measurement.zzpl {
    public static final com.google.android.gms.internal.measurement.zzki zza;
    public static final com.google.android.gms.internal.measurement.zzki zzb;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzkfVarZza.zzf("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        zzb = zzkfVarZza.zzf("measurement.set_default_event_parameters_propagate_clear.service", false);
        zzkfVarZza.zzd("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zzb() {
        return ((java.lang.Boolean) zzb.zzb()).booleanValue();
    }
}
